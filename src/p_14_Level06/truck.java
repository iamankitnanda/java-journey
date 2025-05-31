public class truck {
    int noOfwheels;
    int nofDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public truck(int noOfwheels, int nofDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfwheels = noOfwheels;
        this.nofDoors = nofDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;

    }   @Override
        public String toString() {
            return "truck{" +
                    "noOfwheels=" + noOfwheels +
                    ", nofDoors=" + nofDoors +
                    ", maxSpeed=" + maxSpeed +
                    ", name='" + name + '\'' +
                    ", modelNumber='" + modelNumber + '\'' +
                    ", company='" + company + '\'' +
                    '}';
        }
        public static void main(String[] args) {
        truck swift = new truck(4, 4, 120, "swift", "sw32", "maruti");
        System.out.println(swift.toString());
    }
}





