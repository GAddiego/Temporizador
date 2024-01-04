package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import javax.swing.Timer;

public class Control {

    int hours;
    int minutes;

    public Control() {

        LocalDateTime localDate = LocalDateTime.now();
        hours = localDate.getHour();
        minutes = localDate.getMinute();
        System.out.println("hora: " + hours);
        System.out.println("minutos: " + minutes);
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

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void startCountDown(int delay) {

        Timer timer;

        // Crea un temporizador que se ejecutará cada segundo
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Actualiza el valor del campo de texto
                int dly = delay;
                // Disminuye el contador
                dly--;

            }
        });

        // Inicia el temporizador
        timer.start();

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
