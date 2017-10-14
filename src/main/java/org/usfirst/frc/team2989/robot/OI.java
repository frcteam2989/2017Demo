package org.usfirst.frc.team2989.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {

    /* OI
     * (( Operator interface class. ))
     *
     * What it does:
     *  - Creates operator interface, which is all of the components the driver station uses
     *  - Instantiates joysticks
     *  - Allows you to initiate commands with buttons (not useful for this robot currently)
     *
     */

    Joystick xboxController;

    public OI() { // TODO: Add command listener for shooter mechanism
        super();
        xboxController = new Joystick(RobotMap.JOYSTICK_PORT);
    }

    public Joystick getXboxController() {
        return xboxController;
    }
}
