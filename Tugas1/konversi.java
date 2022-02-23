package Tugas1;

public class konversi {
        double celcius;
        public konversi(double celcius) {
            this.celcius = celcius;
        }
        double konversiFahrenheit(){
            return (celcius*1.8+32);
        }
        double konversiReamur(){
            return (celcius*0.8);
        }
        double konversiKelvin(){
            return (celcius+273.15);
        }
}
