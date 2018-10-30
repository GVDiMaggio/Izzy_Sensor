public class Sensor
    {
        int pinNumber;
        int sensorReading;
        int distance;

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

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance)
        {
            this.distance = distance;
        }

        public Sensor(int pinNumber) {
            this.pinNumber = pinNumber;
        }
    }

