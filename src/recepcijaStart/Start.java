package recepcijaStart;

import recepcija.pomocno.HibernateUtil;

public class Start {

    public static void main(String[] args) {
        // new Izbornik().setVisible(true);

        HibernateUtil.getSession();

    }

}
