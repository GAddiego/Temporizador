package control;

import GUI.NewJFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Timer;
import java.util.TimerTask;

public class Control {

    int hours;
    int minutes;
    private Timer timer;
    private boolean countingDown = false;
    private NewJFrame newJFrame;

    public Control(NewJFrame newJFrame) {

        LocalDateTime localDate = LocalDateTime.now();
        hours = localDate.getHour();
        minutes = localDate.getMinute();
        System.out.println("hora: " + hours);
        System.out.println("minutos: " + minutes);
        this.newJFrame = newJFrame;
    }

    public long calculateSeconds(int hour, int minute) {

        LocalDateTime localDate = LocalDateTime.now();
        LocalDateTime shutdownTime = localDate.withHour(hour).withMinute(minute).withSecond(0).withNano(0);

        long secondsDelay = ChronoUnit.SECONDS.between(localDate, shutdownTime);
        if (secondsDelay < 0) {

            int dayOfTheYear = shutdownTime.getDayOfYear();
            dayOfTheYear++;
            shutdownTime = shutdownTime.withDayOfYear(dayOfTheYear);

            secondsDelay = ChronoUnit.SECONDS.between(localDate, shutdownTime);
        }

        return secondsDelay;
    }

    public boolean shutDown(long delay, boolean forced) {

        String command = createCommandShutDown(delay, forced);
        cancelShutDown();

        try {
            ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", command);

            // Redirige la salida estándar y la salida de error al flujo de la aplicación Java
            processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            processBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);

            // Inicia el proceso
            Process proceso = processBuilder.start();

            // Espera a que el proceso termine
            int exitCode = proceso.waitFor();

            // Imprime el código de salida del proceso
            System.out.println("Código de salida: " + exitCode);
            if (exitCode == 0) {
                if(!countingDown)startCountDown(delay);
                return true;
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return false;

    }

    public void reset(long delay, boolean forced) {

        String command = createCommandReset(delay, forced);
        cancelShutDown();

        try {
            ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", command);

            // Redirige la salida estándar y la salida de error al flujo de la aplicación Java
            processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            processBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);

            // Inicia el proceso
            Process proceso = processBuilder.start();

            // Espera a que el proceso termine
            int exitCode = proceso.waitFor();

            // Imprime el código de salida del proceso
            System.out.println("Código de salida: " + exitCode);
            if(!countingDown)startCountDown(delay);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    private String createCommandShutDown(long delay, boolean forced) {

        String shut = "shutdown /s ";
        StringBuilder shutCommand = new StringBuilder(shut);

        if (forced) {
            shutCommand.append("/f ");
        }

        shutCommand.append("/t ");
        shutCommand.append(String.valueOf(delay));

        System.out.println(shutCommand.toString());

        return shutCommand.toString();
    }

    private String createCommandReset(long delay, boolean forced) {

        String shut = "shutdown /r ";
        StringBuilder shutCommand = new StringBuilder(shut);

        if (forced) {
            shutCommand.append("/f ");
        }

        shutCommand.append("/t ");
        shutCommand.append(String.valueOf(delay));

        System.out.println(shutCommand.toString());

        return shutCommand.toString();
    }

    public void cancelShutDown() {

        try {
            ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "shutdown /a");
            processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            processBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);

            // Inicia el proceso
            Process proceso = processBuilder.start();

            // Espera a que el proceso termine
            int exitCode = proceso.waitFor();
            if(countingDown){
                stopCountDown();
                newJFrame.setTimer("--:--");
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void startCountDown(long delay) {
        
        TimerTask timerTask = new TimerTask() {
            long dly = delay;
            @Override
            public void run() {
                if(dly>0){
                    String timeFormated = formatTime(dly);
                    System.out.println(dly);
                    newJFrame.setTimer(timeFormated);
                    dly--;
                }
            }
        };
        
        timer = new Timer();
        timer.scheduleAtFixedRate(timerTask, 0, 1000);
        countingDown = true;
    }
    
    private void stopCountDown(){
        timer.cancel();
        countingDown = false;
    }

    private String formatTime(long dly){
        
        Duration duration = Duration.ofSeconds(dly);

        long hoursRemaining = duration.toHours();
        long minutesRemaining = duration.toMinutesPart();
        long secondsRemaining = duration.toSecondsPart();

        return String.format("%02d:%02d:%02d", hoursRemaining, minutesRemaining, secondsRemaining);
    }
    
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

}
