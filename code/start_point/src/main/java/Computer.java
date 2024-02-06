public class Computer {

    private int storage;
    private String printerModel;


    public Computer(int storage) {
        this.storage = storage;
        this.printerModel = null;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int moreStorage) {
        this.storage += moreStorage;
    }

    public String getPrinterModel() {
        return printerModel;
    }

    public void setPrinterModel(String printerModel) {
        this.printerModel = printerModel;
    }

    public void printMessage(String msg){
        if (this.printerModel != null){
            System.out.println(msg);
        }
    }



}
