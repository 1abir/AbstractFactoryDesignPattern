package device;

import device.types.*;

public abstract class RaspBerryPIFactory implements ControllerFactory{
    ControllerType controllerType;
    WeightMeasurementMethod weightMeasurementDevice;
    IdentificationMethod identificationDevice;
    Storage storage;
    Display display;
    ConnectionType internetConnection;

    @Override
    public void buildController() {
        this.controllerType = ControllerType.RASPBERRY_PI;
    }

    @Override
    public void addConnectionDevice(ConnectionType connectionType) {
        internetConnection = connectionType;
    }

    @Override
    public void addDisplay() {
        display = Display.TOUCH_SCREEN;
    }

    @Override
    public void addWeightMeasurementDevice(WeightMeasurementMethod weightMeasurementDevice) {
        this.weightMeasurementDevice = weightMeasurementDevice;
    }

    @Override
    public void addIdMethod() {
        identificationDevice = IdentificationMethod.NFC_CARD;
    }

    @Override
    public void addStorage() {
        storage = Storage.DEFAULT_STORAGE;
    }

    @Override
    public void addDeviceController() {}

    @Override
    public String toString() {
        return "{" +
                "controllerType=" + controllerType +
                ", weightMeasurementDevice=" + weightMeasurementDevice +
                ", identificationDevice=" + identificationDevice +
                ", storage=" + storage +
                ", display=" + display +
                ", internetConnection=" + internetConnection +
                '}';
    }
}
