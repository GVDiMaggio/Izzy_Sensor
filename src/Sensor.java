public class Sensor
    {
        int pinNumber;
        int sensorReading;

        public int getPinNumber() {
            return pinNumber;
        }

        public void setPinNumber(int pinNumber) {
            this.pinNumber = pinNumber;
        }

        public int getSensorReading() {
            return sensorReading;
        }

        public void setSensorReading(int sensorReading) {
            this.sensorReading = sensorReading;
        }


        public Sensor(int pinNumber) {
            this.pinNumber = pinNumber;
        }
    }

