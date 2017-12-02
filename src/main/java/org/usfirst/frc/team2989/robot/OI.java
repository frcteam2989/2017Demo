package org.usfirst.frc.team2989.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team2989.robot.commands.PushBallCommand;
import org.usfirst.frc.team2989.robot.commands.ShootBallCommand;

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
    Button aButton;
    Button bButton;

    public OI() { // TODO: Add command listener for shooter mechanism
        super();
        xboxController = new Joystick(RobotMap.JOYSTICK_PORT);
        aButton = new JoystickButton(xboxController, RobotMap.JOYSTICK_ABUTTON);
        bButton = new JoystickButton(xboxController, RobotMap.JOYSTICK_BBUTTON);
        aButton.whileHeld(new ShootBallCommand());
        bButton.whileHeld(new PushBallCommand());
    }

    public Joystick getXboxController() {
        return xboxController;
    }
}
