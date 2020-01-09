/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
/**
 * Responding to motor control. Runs infinitely
 */

public class DriveToWall extends CommandBase {

  public DriveToWall() {
    // Use requires() here to declare subsystem dependencies
    addRequirements(Robot.drivymcDriveDriverson);
  }

  // Called just before this Command runs the first time
  @Override
  public void initialize() {
  
    
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  public void execute() {
    Robot.drivymcDriveDriverson.dMecanumDrive.driveCartesian(0, 0, -0.2);
     }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  public boolean isFinished() {
    return Robot.drivymcDriveDriverson.ultrasonic1.getRangeInches() < 20;
  }

  // Called once after isFinished returns true
  @Override
  public void end(boolean interrupted) {
    Robot.drivymcDriveDriverson.dMecanumDrive.driveCartesian(0, 0, 0);
  }

}
