public class Main
{
    public static void main(String[] args)
    {

        double numerator;
        double denominator;
        double error;
        double proportional;
        double integral;
        double derivative;
        double pidValue;
        double errorSum;
        int n = 0;
        double lastError = 0;

        //TIMER

        Sensor sensor1 = new Sensor(1);
        Sensor sensor2 = new Sensor(2);
        Sensor sensor3 = new Sensor(3);


        Distance distance1 = new Distance();
        Distance distance2 = new Distance();

        //Start number test
        sensor1.setSensorReading(1);
        sensor2.setSensorReading(2);
        sensor3.setSensorReading(3);

        sensor1.setPinNumber(1);
        sensor1.setPinNumber(2);
        sensor1.setPinNumber(3);
        //End number test

        numerator = ((-1 * distance1.getDistance()) * sensor1.getSensorReading() + 0 * sensor2.getSensorReading() + distance2.getDistance() * sensor3.getSensorReading());
        denominator = sensor1.getSensorReading() + sensor2.getSensorReading() + sensor3.getSensorReading();
        error = numerator / denominator;



    }
}
