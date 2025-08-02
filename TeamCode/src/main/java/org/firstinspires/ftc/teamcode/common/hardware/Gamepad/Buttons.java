package org.firstinspires.ftc.teamcode.common.hardware.Gamepad;

import com.qualcomm.robotcore.hardware.Gamepad;

public enum Buttons {
    // Analog stick axes
    LEFT_STICK_X {
        public float getFloatValue(Gamepad gamepad) {
            return gamepad.left_stick_x;
        }
    },
    LEFT_STICK_Y {
        public float getFloatValue(Gamepad gamepad) {
            return gamepad.left_stick_y;
        }
    },
    RIGHT_STICK_X {
        public float getFloatValue(Gamepad gamepad) {
            return gamepad.right_stick_x;
        }
    },
    RIGHT_STICK_Y {
        public float getFloatValue(Gamepad gamepad) {
            return gamepad.right_stick_y;
        }
    },

    // D-pad buttons
    DPAD_UP {
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.dpad_up;
        }
    },
    DPAD_DOWN {
        
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.dpad_down;
        }
    },
    DPAD_LEFT {
        
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.dpad_left;
        }
    },
    DPAD_RIGHT {
        
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.dpad_right;
        }
    },

    // Standard letter buttons
    A {
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.a;
        }
    },
    B {
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.b;
        }
    },
    X {
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.x;
        }
    },
    Y {
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.y;
        }
    },

    // Center/Special buttons
    GUIDE {  // 通常是控制器中间的大按钮。操作系统可能会在这个按钮被发送到应用程序之前捕获它；
            // 这样的话，你就永远收到它被按下的信号。
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.guide;
        }
    },
    START {
        
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.start;
        }
    },
    BACK {
        
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.back;
        }
    },

    // 肩键 (Bumper buttons)
    LEFT_BUMPER {
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.left_bumper;
        }
    },
    RIGHT_BUMPER {
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.right_bumper;
        }
    },

    // Stick press buttons
    LEFT_STICK_BUTTON {
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.left_stick_button;
        }
    },
    RIGHT_STICK_BUTTON {
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.right_stick_button;
        }
    },

    // Trigger axes 线性扳机
    LEFT_TRIGGER {
        public float getFloatValue(Gamepad gamepad) {
            return gamepad.left_trigger;
        }
    },
    RIGHT_TRIGGER {
        public float getFloatValue(Gamepad gamepad) {
            return gamepad.right_trigger;
        }
    },

    // PS4支持 - face按钮 (这都啥玩意啊 —— zyq)
    CIRCLE {
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.circle;
        }
    },
    // PS4支持 - × 键
    CROSS {
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.cross || gamepad.a;
        }
    },
    // PS4支持 - 三角键
    TRIANGLE {
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.triangle;
        }
    },
    // PS4支持 - 方形键
    SQUARE {
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.square || gamepad.x;
        }
    },

    // PS4支持 - 特殊按钮
    SHARE {
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.share;
        }
    },
    OPTIONS {
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.options;
        }
    },

    // PS4支持 - 触控板（手柄上还有这等东西？？？
    TOUCHPAD {
        /**
         * @return 返回布尔值数组，分别表示两个手指是否在触摸板上
         */
        public boolean[] ifPressed(Gamepad gamepad) {
            return new boolean[] {gamepad.touchpad_finger_1, gamepad.touchpad_finger_2};
        }
        public float[] getFinger1Pos(Gamepad gamepad) {
            return new float[] {gamepad.touchpad_finger_1_x, gamepad.touchpad_finger_1_y};
        }
        public float[] getFinger2Pos(Gamepad gamepad) {
            return new float[] {gamepad.touchpad_finger_2_x, gamepad.touchpad_finger_2_y};
        }
    },

    // PS4支持 - PS按钮
    PS {
        public boolean ifPressed(Gamepad gamepad) {
            return gamepad.ps;
        }
    };


}

