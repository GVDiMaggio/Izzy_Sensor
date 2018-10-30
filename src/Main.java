public class Main
{
    public static void main(String[] args) throws InterruptedException {

        double pidValue;
        double errorSum;
        boolean loop;
        double lastError = 0;

        //TIMER

        Sensor sensor1 = new Sensor(1);
        Sensor sensor2 = new Sensor(2);
        Sensor sensor3 = new Sensor(3);

        sensor1.setDistance(-1);
        sensor2.setDistance(0);
        sensor3.setDistance(1);

        SensorArray sensorArray = new SensorArray();
        sensorArray.addSensor(sensor1);
        sensorArray.addSensor(sensor2);
        sensorArray.addSensor(sensor3);

        //Start number test
        sensor1.setSensorReading(1);
        sensor2.setSensorReading(2);
        sensor3.setSensorReading(3);

        sensor1.setPinNumber(1);
        sensor1.setPinNumber(2);
        sensor1.setPinNumber(3);
        //End number test
    
        sensorArray.pidValue();
        while (loop = true)
        {

            System.out.println(sensorArray.pidValue());
            Thread.sleep(500);
        }



    }
}
