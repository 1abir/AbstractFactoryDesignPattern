package device;

import device.types.ConnectionType;
import device.types.ControllerType;
import device.types.WeightMeasurementMethod;

public interface ControllerFactory {
    void buildController();
    void addConnectionDevice(ConnectionType connectionType);
    void addDisplay();
    void addWeightMeasurementDevice(WeightMeasurementMethod weightMeasurementDevice);
    void addIdMethod();
    void addStorage();
    void addDeviceController();
}
