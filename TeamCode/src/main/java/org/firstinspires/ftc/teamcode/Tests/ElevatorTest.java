package org.firstinspires.ftc.teamcode.Tests;

import android.provider.Settings;
import android.util.Log;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Ethan Pereira on 10/19/2017.
 */
@TeleOp(name = "ElevatorTest")
public class ElevatorTest extends OpMode {
    Servo claw;
    DcMotor elevator;
    @Override

    public void init() {

        elevator = hardwareMap.dcMotor.get("elevator");
        claw = hardwareMap.get(Servo.class, "claw");

        //                hardwareMap.servo.get("jewl");
    }


    @Override
    public void loop() {
        telemetry.addData("Pos", claw.getPosition());
        telemetry.update();

        if(gamepad1.right_bumper){

            claw.setPosition(0.35);

        }

        else if(gamepad1.left_bumper){

            claw.setPosition(0.0);

        }

        if(gamepad1.y){

            elevator.setPower(0.5);

        }

        else if(gamepad1.x){

            elevator.setPower(-0.5);

        }
        else{

            elevator.setPower(0);

        }

//        Log.i("DataLogs", String.valueOf(jewl.getPosition()));
    }
}
