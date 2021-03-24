package device;

import device.types.*;

public abstract class MicroControllerFactory implements ControllerFactory {
    ControllerType controllerType;
    WeightMeasurementMethod weightMeasurementDevice;
    IdentificationMethod identificationDevice;
    Storage storage;
    Display display;
    ConnectionType internetConnection;
    DeviceController deviceController;

    @Override
    public void addConnectionDevice(ConnectionType connectionType) {
        if(connectionType != ConnectionType.GSM && connectionType != ConnectionType.WIFI)
            System.out.println("Error, Connection Must be GSM or WiFi");
        else this.internetConnection = connectionType;
    }

    @Override
    public void addWeightMeasurementDevice(WeightMeasurementMethod weightMeasurementDevice) {
        this.weightMeasurementDevice = weightMeasurementDevice;
    }

    @Override
    public void addIdMethod() {
        this.identificationDevice = IdentificationMethod.RFID;
    }

    @Override
    public void addStorage() {
        this.storage = Storage.SD_CARD;
    }

    @Override
    public void addDeviceController() {
        this.deviceController = DeviceController.BUTTON;
    }

    @Override
    public String toString() {
        return "{" +
                "controllerType=" + controllerType +
                ", weightMeasurementDevice=" + weightMeasurementDevice +
                ", identificationDevice=" + identificationDevice +
                ", storage=" + storage +
                ", display=" + display +
                ", internetConnection=" + internetConnection +
                ", deviceController=" + deviceController +
                '}';
    }
}
