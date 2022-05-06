package lesson6;

public class Store {
        private String name;
        private String address;
        private int totalNumberOfPhone;
        private Smartphone[] phones;
        private int index;

        public Store(String name, String address, int totalNumberOfPhone) {
            this.name = name;
            this.address = address;
            this.totalNumberOfPhone = totalNumberOfPhone;
            setNumberOfPHones(totalNumberOfPhone);
        }
        public void setNumberOfPHones(int numberOfPHones){
            phones = new Smartphone[numberOfPHones];
        }

        public void addphones(Smartphone smartphone){
            if (index == phones.length) System.out.println ("Full");
            else {
                phones[index] = smartphone;
                index++;
            }
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getTotalNumberOfPhone() {
            return totalNumberOfPhone;
        }

        public void setTotalNumberOfPhone(int totalNumberOfPhone) {
            this.totalNumberOfPhone = totalNumberOfPhone;
        }

        public String getListOfPhones(){
            String s = "[";
            for (Smartphone smartphone : phones) {
                s += smartphone.getBrand() + " ";
            }
            return s + "]";
        }

        public void setPhones(Smartphone[] phones) {
            this.phones = phones;
        }

        public String getInformation(){
            return "Store's name: " + name + "\n" +
                    "Address: " + address + "\n" +
                    "Total phone number: " + totalNumberOfPhone + "\n" +
                    "List of phone: " + this.getListOfPhones();
        }
        public int totalNumberOfPhoneSold (){
            int result = 0;
            for (int i= 0; i < phones.length; i++){
                result += phones[i].getTotalSold();
            }
            return result;
        }
        public long totalRevenue(){
            long result = 0;
            for (int i = 0; i < phones.length; i++){
                result = phones[i].getPrice() * phones[i].getTotalSold();
            }
            return result;
        }
        public int totalBluetooth(){
            int result = 0;
            for (int i = 0; i < phones.length; i++) {
                if (phones[i].isHasBluetooth()) {
                    result++;
                }
            }
            return result;
        }
    public int total5G(){
        int result = 0;
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].isHas5G()) {
                result++;
            }
        }
        return result;
    }
    public int totalWifi(){
        int result = 0;
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].isHasWifi()) {
                result++;
            }
        }
        return result;
    }

}
