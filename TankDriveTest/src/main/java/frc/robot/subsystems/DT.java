// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMMotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.*;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class DT extends SubsystemBase {
  /** Creates a new DT. */

  public PWMMotorController cont;
  public CANSparkMax rightM1;
  public CANSparkMax rightM2;
  public CANSparkMax leftM1;
  public CANSparkMax leftM2;

  public DT() {
    rightM1 = new CANSparkMax(0, MotorType.kBrushless);
    rightM2 = new CANSparkMax(1, MotorType.kBrushless);
    leftM1 = new CANSparkMax(2, MotorType.kBrushless);
    leftM2 = new CANSparkMax(3, MotorType.kBrushless);

    cont = new PWMMotorController("Yes?", 1) {
      // is there something i have to put here?
    };

    // still lost : P
    rightM1.setInverted(true);
    rightM2.setInverted(true);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

    // something like this i suppose would work?
    rightM1.set(1);
    rightM2.set(1);
    leftM1.set(-1);
    leftM2.set(-1);
    // even more lost : P

  }
}
