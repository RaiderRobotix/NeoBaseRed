package frc.robot;

//Power/Wiring

//Controller + Operator imports
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
//Subsystems
import frc.robot.subsystems.Swerve;

public class RobotContainer {
    private final XboxController controller;
    private final Joystick operator;

    private final Swerve s_Swerve;
    public RobotContainer(){
        controller = new XboxController(0);
        operator = new Joystick(1);
        s_Swerve = new Swerve();


    }
    private void configureDriveControls() {
        int translationAxis = XboxController.Axis.kLeftY.value;
        int strafeAxis = XboxController.Axis.kLeftX.value;
        int rotationAxis = XboxController.Axis.kRightX.value;

        JoystickButton zeroGyro = new JoystickButton(controller, XboxController.Button.kY.value);

    }
}
