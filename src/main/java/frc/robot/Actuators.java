package frc.robot;

import edu.wpi.first.wpilibj.util.WPILibVersion;
import edu.wpi.first.wpilibj.VictorSP;

public class Actuators{

private static VictorSP chassisLeftMaster;
private static VictorSP chassisLeftSlave;
private static VictorSP chassisRightMaster;
private static VictorSP chassisRightSlave;
private static VictorSP ballInFeedElevator;

public static void init() {

chassisLeftMaster = new VictorSP(Constants.CHASSIS_LEFT_MASTER);
chassisLeftSlave = new VictorSP(Constants.CHASSIS_LEFT_SLAVE);
chassisRightMaster = new VictorSP(Constants.CHASSIS_RIGHT_MASTER);
chassisRightSlave = new VictorSP(Constants.CHASSIS_RIGHT_SLAVE);
ballInFeedElevator = new VictorSP(Constants.BALL_IN_FEED_ELEVATOR);

}

public static VictorSP getChassisLeftMaster() {
    return chassisLeftMaster;
}
public static VictorSP getChassisLeftSlave() {
    return chassisLeftSlave;
}
public static VictorSP getChassisRightMaster() {
    return chassisRightMaster;
}
public static VictorSP getChassisRightSlave() {
    return chassisRightSlave;
}

public static VictorSP getBallInFeedElevator() {
    return ballInFeedElevator;
}


}