interface Command {
    void execute();
}
class Zakaz {
    public void create() {
        System.out.println("Order is created");
    }

    public void updateStatus(String status) {
        System.out.println("Order status: " + status);
    }
}

class CreateOrderCommand implements Command {
    private Zakaz Zakaz;
    public CreateOrderCommand(Zakaz Zakaz) {
        this.Zakaz = Zakaz;
    }
    
    @Override
    public void execute() {
        Zakaz.create();
    }
}



class UpdateStatus implements Command {
    private Zakaz Zakaz;
    private String status;
    public UpdateStatus(Zakaz Zakaz, String status) {
        this.Zakaz = Zakaz;
        this.status = status;
    }
    @Override
    public void execute() {
        Zakaz.updateStatus(status);
    }
}



class Test2 {

    public static void main(String[] args) {
        Zakaz Zakaz = new Zakaz();
        Command create = new CreateOrderCommand(Zakaz);
        Command update = new UpdateStatus(Zakaz, "In process");
        create.execute();
        update.execute();
        update = new UpdateStatus(Zakaz, "Done");
        update.execute();
    }
}