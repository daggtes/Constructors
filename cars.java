public class cars {
    int modelYear;
    String modelName;
    public cars (int year, String name){
        modelYear = year;
        modelName = name;
    }
        public static void main(String[] args) {
            cars myCar = new cars(1989, "Mustang");
            System.out.println(myCar.modelYear + " " + myCar.modelName);

            
        
    }
}
