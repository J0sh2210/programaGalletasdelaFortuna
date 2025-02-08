package galletasFortuna;

import java.util.Random;

public class ListGalletas {
    String [] Cookies= {"No podemos dirigir el viento pero sí ajustar las velas",
            "Uno de tus sueños se hará realidad", "Uno de tus sueños se hará realidad","La fortuna está en ti, no en la galleta",
            "Si te caes 7 veces, levántate 8", "Enfócate en las cosas buenas y positivas de tu vida tendrás mucha más energía para cumplir tus metas y tus sueños",
            "¡No solo pienses, actúa!","Tu mente es tu mayor activo."
    };
    Random random = new Random();
    int indice = random.nextInt(Cookies.length);

}
