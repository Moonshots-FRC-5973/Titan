package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandGroupBase;

public class DumpNear extends CommandGroupBase {

    public DumpNear() {
        addSequential(new DriveToWall());

    }

    @Override
    public void addCommands(Command... commands) {
        // TODO Auto-generated method stub

    }
}