package Task1;

class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    Address(String street, String city, String state, String zip){
        this.street=street;
        this.city=city;
        this.state=state;
        this.zip=zip;
    }

    protected String getStreet() {
        return street;
    }

    protected void setStreet(String street) {
        this.street = street;
    }

    protected String getCity() {
        return city;
    }

    protected void setCity(String city) {
        this.city = city;
    }

    protected String getState() {
        return state;
    }

    protected void setState(String state) {
        this.state = state;
    }

    protected String getZip() {
        return zip;
    }

    protected void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public  String toString(){
        return "Address : "+street+", "+city+", "+state+", "+zip;
    }
}
