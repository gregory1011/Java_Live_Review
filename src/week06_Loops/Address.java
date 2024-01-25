package week06_Loops;

public class Address {

        String street, city, state;
        int zipCode;
        String country;


        public void setInfo(String street, String city, String state, int zipCode, String country){
            this.street = street;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
            this.country = country;
        }

        public String toString(){
            String result = street +"\n"+city+", "+ state+", "+zipCode+"\n"+country;
            return result;
        }


}
