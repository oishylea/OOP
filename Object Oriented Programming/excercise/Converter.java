public class Converter {
    
    public static double convertToCelcius(int x){

        double celcius;
        celcius = ((x-32)*5)/9;
        return celcius;
    }

    public static double convertToFahr(int y){
        double fahr;
        fahr=((y/5)*9)+32;
        return fahr;
    }
}
