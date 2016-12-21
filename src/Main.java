import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Main {

    public static void main(String[] args) {
        List<Jugador> jugadoresList=new ArrayList<>();
        ArrayList<Equipo> equiposList=new ArrayList<>();

        Equipo e1=new Equipo("F.C. Barcelona", "Barcelona", LocalDate.of(1889,2,25));
        Jugador j1=new Jugador("Juan Carlos", LocalDate.of(1985,2,25), 4010, 10, 5,"Escolta", e1);
        Jugador j2=new Jugador("Alvaro", LocalDate.of(1995,2,25), 50, 8, 10,"Alero", e1);
        Jugador j3=new Jugador("Tomic", LocalDate.of(1989,4,26), 60, 0, 30,"Pivot", e1);
        Jugador j4=new Jugador("Doellman", LocalDate.of(1991,9,2), 80, 20, 5,"Ala-Pivot", e1);
        Jugador j5=new Jugador("Rice", LocalDate.of(1988,8,30), 80, 20, 2,"Base", e1);

        jugadoresList.add(j1);jugadoresList.add(j2);jugadoresList.add(j3);jugadoresList.add(j4);jugadoresList.add(j5);

        Equipo e2=new Equipo("Real Madrid", "Madrid", LocalDate.of(1902,2,25));
        Jugador j6=new Jugador("Sergio Llull",LocalDate.of(1988,3,25), 20, 10, 5,"Base", e2);
        Jugador j7=new Jugador("Carroll", LocalDate.of(1995,2,25), 5, 8, 10,"Escolta", e2);
        Jugador j8=new Jugador("Rudy", LocalDate.of(1987,7,26), 22, 10, 5,"Alero", e2);
        Jugador j9=new Jugador("Nocioni", LocalDate.of(1982,9,5), 5, 2, 30,"Ala-Pivot", e2);
        Jugador j10=new Jugador("Reyes", LocalDate.of(1985,7,6), 8, 4, 22,"Pivot", e2);

        Equipo e6=new Equipo("Estudiantes", "Madrid", LocalDate.of(1902,2,25));
        Jugador j26=new Jugador("Sergio",LocalDate.of(1988,3,25), 20, 10, 5,"Base", e6);

        jugadoresList.add(j26);
        jugadoresList.add(j6);jugadoresList.add(j7);jugadoresList.add(j8);jugadoresList.add(j9);jugadoresList.add(j10);

        Equipo e3=new Equipo("DKV Joventut", "Badalona", LocalDate.of(1989,10,25));
        Jugador j11=new Jugador("Russell", LocalDate.of(1989,2,23), 9, 20, 5,"Base", e3);
        Jugador j12=new Jugador("Josep", LocalDate.of(1993,5,27), 15, 8, 5,"Escolta", e3);
        Jugador j13=new Jugador("Pere Tomas", LocalDate.of(1995,7,1), 2, 0, 30,"Alero", e3);
        Jugador j14=new Jugador("Todorovic", LocalDate.of(1991,9,2), 10, 10, 12,"Ala-Pivot", e3);
        Jugador j15=new Jugador("Rice", LocalDate.of(1988,8,30), 5, 0, 20,"Pivot", e3);

        jugadoresList.add(j11);jugadoresList.add(j12);jugadoresList.add(j13);jugadoresList.add(j14);jugadoresList.add(j15);

        Equipo e4=new Equipo("Angeles Lakers", "Los Angeles", LocalDate.of(1999,10,25));
        Jugador j16=new Jugador("Russell", LocalDate.of(1995,3,25), 30, 20, 5,"Base", e4);
        Jugador j17=new Jugador("Clarckson", LocalDate.of(1984,2,12), 5, 8, 1,"Escolta", e4);
        Jugador j18=new Jugador("Ingram", LocalDate.of(1996,1,6), 250, 10, 20,"Alero", e4);
        Jugador j19=new Jugador("JianLian", LocalDate.of(1981,12,14), 10, 0, 25,"Ala-Pivot", e4);
        Jugador j20=new Jugador("Mozgov", LocalDate.of(1994,11,30), 10, 3, 20,"Pivot", e4);

        jugadoresList.add(j16);jugadoresList.add(j17);jugadoresList.add(j18);jugadoresList.add(j19);jugadoresList.add(j20);

        Equipo e5=new Equipo("Miami Heat", "Miami", LocalDate.of(1923,10,25));
        Jugador j21=new Jugador("Dragic", LocalDate.of(1989,10,25), 520, 500, 500,"Base", e5);
        Jugador j22=new Jugador("Winslow", LocalDate.of(1991,10,2), 250, 18, 8,"Escolta", e5);
        Jugador j23=new Jugador("Johnson", LocalDate.of(1986,3,26), 305, 10, 15,"Alero", e5);
        Jugador j24=new Jugador("Williams", LocalDate.of(1990,9,2), 0, 10, 20,"Ala-Pivot", e5);
        Jugador j25=new Jugador("Bosh", LocalDate.of(1983,7,3), 30, 10, 15,"Pivot", e5);

        jugadoresList.add(j21);jugadoresList.add(j22);jugadoresList.add(j23);jugadoresList.add(j24);jugadoresList.add(j25);

        List<Jugador>jugadores=jugadoresList.stream().filter(jugador -> jugador.getCanastas()>500).collect(toList());
        System.out.println("JUGADORES CON MAS DE 500 CANASTAS");
        mostrarJugadores(jugadores);

        jugadores=jugadoresList.stream().filter(jugador -> jugador.getCanastas()>200&&jugador.getCanastas()<500).collect(toList());
        System.out.println("JUGADORES CON MENOS DE 500 CANASTAS Y MAS DE 200");
        mostrarJugadores(jugadores);

        List<String>jugadoresNombre=jugadoresList.stream().filter(jugador -> jugador.getCanastas()>200&&jugador.getCanastas()<500).map(Jugador::getNombre).collect(toList());
        System.out.println("JUGADORES CON MENOS DE 500 CANASTAS Y MAS DE 200 (SOLO EL NOMBRE)");
        mostrarJugadoresNombre(jugadoresNombre);

        jugadores=jugadoresList.stream().sorted(Comparator.comparing(Jugador::getNacimiento)).collect(toList());
        System.out.println("JUGADORES ORDENADOS POR FECHA DE NACIMIENTO");
        mostrarJugadores(jugadores);

        jugadores=jugadoresList.stream().sorted(Comparator.comparing(Jugador::getCanastas)).collect(toList());
        System.out.println("JUGADORES ORDENADOS POR CANASTAS");
        mostrarJugadores(jugadores);

        jugadores=jugadoresList.stream().sorted(Comparator.comparing(Jugador::getCanastas).reversed()).limit(5).collect(toList());
        System.out.println("5 JUGADORES CON MAS CANASTAS");
        mostrarJugadores(jugadores);

        jugadores=jugadoresList.stream().filter(jugador -> jugador.getCanastas()>200&&jugador.getCanastas()<500).sorted(Comparator.comparing(Jugador::getNacimiento).reversed()).collect(toList());
        System.out.println("JUGADORES CON MENOS DE 500 CANASTAS Y MAS DE 200 ORDENADOS POR FECHA DE NACIMIENTO DESCENNDENTE");
        mostrarJugadores(jugadores);

        jugadores=jugadoresList.stream().filter(jugador -> jugador.getCanastas()>200&&jugador.getCanastas()<500).sorted(Comparator.comparing(Jugador::getCanastas).thenComparing(Jugador::getNacimiento)).collect(toList());
        System.out.println("JUGADORES CON MENOS DE 500 CANASTAS Y MAS DE 200 ORDENADOS POR CANASTAS Y SI TIENEN LAS MISMAS POR FECHA DE NACIMIENTO");
        mostrarJugadores(jugadores);

        List<Jugador> finalJugadores = jugadores;
        System.out.println("JUGADOR QUE HA ANOTADO MENOS CANASTAS");
        jugadoresList.stream().min(Comparator.comparing(Jugador::getCanastas)).ifPresent(jugador -> System.out.println(jugador));

        System.out.println("JUGADOR CON MAS CANASTAS ANOTADAS");
        jugadoresList.stream().max(Comparator.comparing(Jugador::getCanastas)).ifPresent(jugador -> System.out.println(jugador));

         double avg =jugadoresList.stream().mapToInt(Jugador::getCanastas).average().getAsDouble();

        System.out.println("MEDIA DE CANASTAS DE LOS JUGADORES");
        System.out.println(avg);

        List<Jugador>jugadores2=jugadoresList.stream().filter(jugador -> jugador.getEquipo().getLocalidad().equals("Barcelona")).collect(toList());
        System.out.println("JUGADORES CON EQUIPO EN BARCELONA");
        mostrarJugadores(jugadores2);

        System.out.println("-----------------------");
        System.out.println("¿HAY ALGUN JUGADOR QUE HAYA ANOTADO MAS DE 4000 CANASTAS?");
        boolean existe=jugadoresList.stream().anyMatch(jugador -> jugador.getCanastas()>=4000);
        System.out.println(existe);

        System.out.println("-----------------------");
        System.out.println("¿HAN ANOTADO TODOS LOS JUGADORES 50 CANASTAS O MAS?");
        existe=jugadoresList.stream().allMatch(jugador -> jugador.getCanastas()>=50);
        System.out.println(existe);

        System.out.println("-----------------------");
        System.out.println("¿HAN ANOTADO TODOS LOS JUGADORES DEL PRIMER EQUIPO 50 CANASTAS O MAS?");
        existe=jugadoresList.stream().filter(jugador -> jugador.getEquipo().equals(e1)).collect(toList()).stream().allMatch(jugador -> jugador.getCanastas()>=50);
        System.out.println(existe);

        System.out.println("-----------------------");
        System.out.println("AGRUPAR EQUIPOS POR LOCALIDAD");


        Map<String, List<Equipo>> mapEquipo = jugadoresList.stream().map(Jugador::getEquipo).distinct().collect(groupingBy(Equipo::getLocalidad));

        mapEquipo.keySet().forEach(localidad->{
            System.out.println("");
            System.out.println("Equipos pertenecientes a la localidad " + localidad);
            mapEquipo.get(localidad).forEach(equipo->{
                System.out.println(equipo.getNombre());
            });
            System.out.println("");
        });


        int suma=jugadoresList.stream().mapToInt(Jugador::getCanastas).reduce(0,(a,b)->a+b);
        System.out.println("-----------------------");
        System.out.println("SUMA DE TODAS LAS CANASTAS DE LOS JUGADORES");
        System.out.println(suma);
        System.out.println("-----------------------");

        System.out.println("SUMA DE TODAS LAS CANASTAS DE LOS JUGADORES AGRUPADOS POR EQUIPO");
        Map<Equipo, Integer> mapEquipo2 = jugadoresList.stream().collect(Collectors.groupingBy(Jugador::getEquipo, Collectors.summingInt(Jugador::getCanastas)));
        System.out.println(mapEquipo2);
        System.out.println("-----------------------");
    }
    public static void mostrarJugadores(List<Jugador> jugadores){
        System.out.println("-----------------------");
        for(Jugador j:jugadores){
            System.out.println("- "+j);
        }
        System.out.println("-----------------------");
    }
    public static void mostrarJugadoresNombre(List<String> jugadores){
        System.out.println("-----------------------");
        for(String j:jugadores){
            System.out.println("- "+j);
        }
        System.out.println("-----------------------");
    }
}
