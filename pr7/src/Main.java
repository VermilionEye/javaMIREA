interface OldRemote {
    void On();
    void Off();
}
class newCar {
    void powerOn() {
        System.out.println("Car is turned on");
    }
    void powerOff() {
        System.out.println("Car is turned off");
    }
}

class OldRemoteAdapter implements OldRemote {
    private newCar newCar;
    public OldRemoteAdapter(newCar newCar) {
        this.newCar = newCar;
    }

    @Override
    public void On() {
        newCar.powerOn();
    }

    @Override
    public void Off() {
        newCar.powerOff();
    }
}

class Test2 {
    public static void main(String[] args) {
        newCar newCar = new newCar();
        OldRemote adapter = new OldRemoteAdapter(newCar);
        adapter.On();
        adapter.Off();
    }
}
