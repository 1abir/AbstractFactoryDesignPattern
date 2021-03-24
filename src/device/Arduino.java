package device;

import device.types.ConnectionType;
import device.types.ControllerType;
import device.types.Display;
import device.types.WeightMeasurementMethod;

public class Arduino extends MicroControllerFactory{

    public Arduino(WeightMeasurementMethod weightDevice, ConnectionType connectionType) {
        buildController();
        addWeightMeasurementDevice(weightDevice);
        addConnectionDevice(connectionType);
        addDisplay();
        addIdMethod();
        addStorage();
        addDeviceController();
    }

    @Override
    public void buildController() {
        controllerType = ControllerType.ARDUINO;
    }

    @Override
    public void addDisplay() {
        display = Display.LED;
    }
}
