class Parameterized  { 
    private Parameterized() {}  
    // Interfaces.
    private interface Car {
        String showInfo();
    }
    private enum Type {
        HATCH, SEDAN;
    }
    private abstract static class CarFactory {
        abstract Car createCar(Type type);
        void deliver(Car car, String place) {
            System.out.println("Delivering " + car.showInfo() + " to " + place);
        } 
    }

    // Implementation.
    private static class Palio implements Car {
        public String showInfo() { return "Palio. Hatch from Fiat"; }
    }
    private static class Siena implements Car {
        public String showInfo() { return "Siena. Sedan from Fiat"; }
    }
    private static class HB20 implements Car {
        public String showInfo() { return "HB20. Sedan from Hyundai"; }
    }
    private static class HB20S implements Car {
        public String showInfo() { return "HB20S. Sedan from Hyundai"; }
    }
    private static class Hyundai extends CarFactory {
        Car createCar(Type type) {
            switch (type) {
                case HATCH:
                    return new HB20();
                case SEDAN:
                    return new HB20S();
                default:
                    throw new IllegalArgumentException(); 
            }
        }
    }
    private static class Fiat extends CarFactory {
        Car createCar(Type type) {
            switch (type) {
                case HATCH:
                    return new Palio();
                case SEDAN:
                    return new Siena();
                default:
                    throw new IllegalArgumentException(); 
            }
        }
    }

    public static void main(String []args) {
    	Parameterized.CarFactory fiat = new Parameterized.Fiat();
        System.out.println("Fiat factory creates " + fiat.createCar(Type.HATCH).showInfo());
        System.out.println("Fiat factory creates " + fiat.createCar(Type.SEDAN).showInfo());
        
        Parameterized.CarFactory hyundai = new Parameterized.Hyundai();
        System.out.println("Hyundai factory creates " + hyundai.createCar(Type.HATCH).showInfo());
        System.out.println("Hyundai factory creates " + hyundai.createCar(Type.SEDAN).showInfo());
    }
}