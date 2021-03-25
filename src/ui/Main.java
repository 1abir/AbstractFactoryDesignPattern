package ui;

import device.ATMEGA32;
import device.Arduino;
import device.ControllerFactory;
import device.RaspberryPi;
import device.types.ConnectionType;
import device.types.WeightMeasurementMethod;
import webserver.ServerLanguage;
import webserver.WebServer;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Your Package");
        System.out.println(Arrays.toString(Packages.values()));
        Scanner scanner = new Scanner(System.in);
        Packages packages = Packages.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
        ConnectionType connection;
        System.out.println("Enter Your Connection method");
        System.out.println(Arrays.toString(ConnectionType.values()));
        connection = ConnectionType.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
        WeightMeasurementMethod weightMeasurementDevice;
        ControllerFactory device = null;

        switch (packages){
            case SILVER:
                weightMeasurementDevice = WeightMeasurementMethod.LOAD_SENSOR;
                device = new ATMEGA32(weightMeasurementDevice,connection);
                break;
            case GOLD:
                weightMeasurementDevice = WeightMeasurementMethod.WEIGHT_MODULE;
                device = new Arduino(weightMeasurementDevice,connection);
                break;
            case DIAMOND:
                weightMeasurementDevice = WeightMeasurementMethod.LOAD_SENSOR;
                device = new RaspberryPi(weightMeasurementDevice,connection);
                break;
            case PLATINUM:
                weightMeasurementDevice = WeightMeasurementMethod.WEIGHT_MODULE;
                device = new RaspberryPi(weightMeasurementDevice,connection);
                break;
        }

        System.out.println("Enter Your WebServer FrameWork");
        System.out.println(Arrays.toString(ServerLanguage.values()));
        ServerLanguage serverLanguage = ServerLanguage.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
        WebServer webServer = null;
        try {
            switch (serverLanguage) {
                case DJANGO:
                    webServer = WebServer.buildWithDjango();
                    break;
                case SPRING:
                    webServer = WebServer.buildWithSpring();
                    break;
                case LARAVEL:
                    webServer = WebServer.buildWithLaravel();
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(device);
        System.out.println(webServer);
    }
}
