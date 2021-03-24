package device;

import device.types.ControllerType;
import device.types.Display;

public class ATMEGA32 extends MicroControllerFactory{

    public ATMEGA32() {

    }

    @Override
    public void buildController() {
        this.controllerType = ControllerType.ATMEGA32;
    }

    @Override
    public void addDisplay() {
        this.display = Display.LCD;
    }
}
