package device;

import device.types.ConnectionType;
import device.types.WeightMeasurementMethod;

public class RaspberryPi extends RaspBerryPIFactory{
    public RaspberryPi(WeightMeasurementMethod weightDevice,ConnectionType connectionType) {
        buildController();
        addWeightMeasurementDevice(weightDevice);
        addConnectionDevice(connectionType);
        addDisplay();
        addIdMethod();
        addStorage();
        addDeviceController();
    }
}
