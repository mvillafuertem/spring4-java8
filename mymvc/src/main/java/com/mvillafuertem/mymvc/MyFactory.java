package com.mvillafuertem.mymvc;

/**
 * Created by mvillafuertem on 9/25/17.
 */
public class MyFactory {

    /*
        Tiene la responsabilidad de crear
        un objeto de modelo valido con todos los parametros obligatorios
     */
    public static MyAddress myAdress(final String street,
                                     final Integer number) {

        return myFullAdress(street, number, "");
    }

    /*
        Tiene la responsabilidad de crear
        un objeto de modelo valido con todos los
        parametros obligatorios
        y los opcionales
    */
    public static MyAddress myFullAdress(final String street,
                                     final Integer number,
                                     final String postalCode) {

        final MyAddress myAdress = new MyAddress();
        myAdress.setStreet(street);
        myAdress.setNumber(number);
        myAdress.setPostalCode(postalCode);
        return myAdress;
    }
}
