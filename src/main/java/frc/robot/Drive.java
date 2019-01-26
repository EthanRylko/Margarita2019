package frc.robot;
public class Drive{

    public static void tankdrive(double speed, double turnSpeed){
        double leftSpeed = Math.min(speed + turnSpeed, Constants.MAX_MOTOR_SPEED);
        double rightSpeed = Math.min(speed - turnSpeed, Constants.MAX_MOTOR_SPEED);
        
        Actuators.getChassisLeftMaster().set(leftSpeed);
        Actuators.getChassisLeftSlave().set(leftSpeed);
        Actuators.getChassisRightMaster().set(rightSpeed);
        Actuators.getChassisRightSlave().set(rightSpeed);

    }




}