import java.util.ArrayList;
import java.util.Iterator;

public class SensorArray
{
    double errorSum;
    double lastError;
    float kp;
    float ki;
    float kd;
    float error = 0;
    ArrayList<Sensor> sensorList = new ArrayList<>();

    public SensorArray(){
        double errorSum = 0;
        double lastError = 0;
        float kp = 0;
        float ki = 0;
        float kd = 0;
        float error = 0;
    }

    public void addSensor(Sensor sensor){
        sensorList.add(sensor);
    }
    public Sensor getSensor(int index){
        return sensorList.get(index);
    }

    public double getKp() {
        return kp;
    }

    public void setKp(float kp) {
        this.kp = kp;
    }

    public double getKi() {
        return ki;
    }

    public void setKi(float ki) {
        this.ki = ki;
    }

    public double getKd() {
        return kd;
    }

    public void setKd(float kd) {
        this.kd = kd;
    }


    public void getError()
    {
        float numerator = 0;
        float denominator = 0;

        Iterator itr = sensorList.iterator();

        while(itr.hasNext()){
            Sensor sensor = (Sensor)itr.next();
            numerator += sensor.getDistance() * sensor.getSensorReading();
            denominator += sensor.getSensorReading();
            error =  numerator/denominator;
        }



    }


    public double geterrorSum() {
        errorSum = error + errorSum;
        return errorSum;
    }

    public double getlastError() {
        return lastError = error;
    }

    public double pidValue()
    {
        getError();
        double integral = ki * geterrorSum();
        double proportional = kp * error;
        double derivative = kd * (error - lastError);
        lastError = error;

      return integral + proportional + derivative;
    }

}
