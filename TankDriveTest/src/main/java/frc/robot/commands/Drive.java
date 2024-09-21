// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.PS4Controller;
//import edu.wpi.first.wpilibj.XboxController; // In case we are using an xbox controller
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DT;
import frc.robot.Robot;

public class Drive extends Command {
  /** Creates a new Drive. */
  private final DT m_Drive;
  private final PS4Controller dController;

  public Drive(DT m_Drive, PS4Controller dController) {
    this.m_Drive = m_Drive;
    this.dController = dController;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.m_DriveDT);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("Drive Command Started");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_Drive.arcadeDrive(-dController.getLeftY(), dController.getRightX());
  }
  public void autoDrive(){
    m_Drive.arcadeDrive(1, 1);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
