package practice.hospital;

import java.util.Random;

public class Hospital {
    public static final int MIN_TEMPERATURE = 32;
    public static final int MAX_TEMPERATURE = 40;

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] temperatures = new float[patientsCount];
        Random random = new Random();
        for (int i = 0; i < patientsCount; i++) {
            temperatures[i] = MIN_TEMPERATURE + random.nextFloat() * (MAX_TEMPERATURE - MIN_TEMPERATURE);
        }
        return temperatures;
    }

    public static String getReport(float[] temperatureData) {

        StringBuilder patientTemperatures = new StringBuilder();
        int healthyPatientCounter = 0;
        float temperatureSum = 0;

        for (float temperatureDatum : temperatureData) {
            float patientTemperature = (float) Math.round(temperatureDatum * 10) / 10;
            patientTemperatures.append(patientTemperature).append(" ");

            if (patientTemperature >= 36.2f && patientTemperature <= 36.9f) {
                healthyPatientCounter++;
            }

            temperatureSum += temperatureDatum;
        }

        float averageTemperature = temperatureSum / temperatureData.length;
        averageTemperature = (float) Math.round(averageTemperature * 100) / 100;

        return "Температуры пациентов: " + patientTemperatures.toString().strip() +
        "\nСредняя температура: " + averageTemperature +
        "\nКоличество здоровых: " + healthyPatientCounter;
    }
}
