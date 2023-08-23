package entidades;

import java.util.*;

public class Simulacion {

    public List<String> generarNombresAlumnos(int numeroAlumnos) {

        final String[] nombres = {
                "Liam", "Olivia", "Noah", "Emma", "Sophia", "Jackson", "Oliver", "Ava", "Isabella", "Lucas",
                "Mia", "Charlotte", "Amelia", "Evelyn", "Michael", "Benjamin", "Elijah", "Daniel", "Matthew", "Abigail",
                "Emily", "Elizabeth", "Sofia", "Ella", "Avery", "Scarlett", "Grace", "Victoria", "Aria", "James",
                "William", "Ethan", "Luna", "Aiden", "Zoe", "Aurora", "Riley", "Chloe", "Aubrey", "Leah",
                "Ariana", "Samuel", "Grayson", "Hannah", "Nora", "Camila", "Zachary", "Julian", "Lucy", "Madison",
                "Penelope", "Isaac", "Eliana", "Hazel", "Lily", "Anthony", "Xavier", "Emilia", "Natalie", "Liam",
                "Emma", "Ava", "Sophia", "Mia", "Charlotte", "Amelia", "Evelyn", "Michael", "Benjamin", "Elijah",
                "Daniel", "Matthew", "Emily", "Abigail", "Elizabeth", "Sofia", "Oliver", "Lucas", "Aria", "Zoe"
        };

        final String[] apellidos = {
                "Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia", "Rodriguez", "Martinez",
                "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson", "Thomas", "Taylor", "Moore", "Jackson", "Martin",
                "Lee", "Perez", "Thompson", "White", "Harris", "Sanchez", "Clark", "Ramirez", "Lewis", "Robinson",
                "Walker", "Young", "Allen", "King", "Wright", "Scott", "Torres", "Nguyen", "Hill", "Adams",
                "Nelson", "Baker", "Hall", "Rivera", "Mitchell", "Carter", "Cooper", "Edwards", "Collins", "Stewart",
                "Morris", "Rogers", "Reed", "Cook", "Morgan", "Bell", "Murphy", "Bailey", "Cruz", "Richardson",
                "Cox", "Howard", "Ward", "Peterson", "Long", "Flores", "Ross", "Foster", "Sanders", "Brooks",
                "Washington", "Butler", "Simmons", "Foster", "Gonzales", "Bryant", "Alexander", "Russell", "Griffin", "Diaz",
                "Hayes", "Myers", "Ford", "Hamilton", "Graham", "Sullivan", "Wallace", "Cole", "West", "Jordan"
        };

        ArrayList<String> nombresAlumnos = new ArrayList<>();

        for (int i = 0; i < numeroAlumnos; i++) {
            nombresAlumnos.add(nombres[(int) (Math.random()*(nombres.length))] + " " +
                    apellidos[(int) (Math.random()*(apellidos.length))]);
        }

        return nombresAlumnos;
    }

    public List<Integer> generarDniAlumnos(int numeroAlumnos) {

        Set<Integer> dniAlumnos = new HashSet<>();

        int limiteInferior = 1000000000;
        int limiteSuperior = 2000000000;

        while (dniAlumnos.size() < numeroAlumnos) {
            dniAlumnos.add((int) (Math.random()*(limiteSuperior - limiteInferior) + limiteInferior));
        }

        return new ArrayList<>(dniAlumnos);
    }

    public List<Alumno> crearAlumnos(List<String> nombreAlumnos, List<Integer> dniAlumnos) {

        List<Alumno> alumnos = new ArrayList<>();

        int indice = 0;
        while (alumnos.size() < dniAlumnos.size()) {
            alumnos.add(new Alumno(nombreAlumnos.get(indice), dniAlumnos.get(indice)));
            indice++;
        }

        return alumnos;
    }

    public void mostrarAlumnos(List<Alumno> alumnos) {

        System.out.println("\nLISTA DE ALUMNOS.");
        int indice = 1;
        for (Alumno alumno : alumnos) {
            System.out.println(indice + ". " + alumno);
            indice++;
        }
    }

    public List<Voto> votacion(List<Alumno> alumnos, int numeroVotos) {

        List<Voto> votos = new ArrayList<>();

        for (Alumno alumno : alumnos) {

            Set<Alumno> votosAlumno = new HashSet<>();
            Alumno alumnoToVotar;

            while (votosAlumno.size() < numeroVotos) {

                do {
                    alumnoToVotar = alumnos.get((int) (Math.random()*(alumnos.size())));
                } while (alumno.equals(alumnoToVotar));

                if (votosAlumno.add(alumnoToVotar)) {
                    alumnoToVotar.setCantidadVotos(alumnoToVotar.getCantidadVotos() + 1);
                } else {
                    System.out.println("\nNo puedes votar dos veces por la misma persona.");
                }
            }

            votos.add(new Voto(alumno, votosAlumno));
        }

        return votos;
    }

    public void mostrarVotos(List<Voto> votos) {

        System.out.println("\nLISTA DE ALUMNOS CON SUS RESPECTIVOS VOTOS.");
        int indice = 1;

        for (Voto voto : votos) {

            System.out.println("\n" + indice + ". " + voto.getAlumno());
            System.out.println("Alumnos a los que votó: " + voto.getVotos());
            indice++;
        }
    }

    public int recuentoVotos(List<Alumno> alumnos) {

        int recuento = 0;

        for (Alumno alumno : alumnos) {
            recuento += alumno.getCantidadVotos();
        }

        System.out.println("\nEl total de votos fueron: " + recuento);

        return recuento;
    }

    public List<Alumno>[] crearFacilitadores(List<Alumno> alumnos, int numeroFacilitadores) {

        List<Alumno>[] facilitadores = new List[2];

        facilitadores[0] = new ArrayList<>();
        facilitadores[1] = new ArrayList<>();

        ordenarAlumnosPorVotos(alumnos);

        mostrarAlumnos(alumnos);

        if (numeroFacilitadores*2 <= alumnos.size()) {

            for (int i = 0; i < facilitadores.length; i++) {
                for (int j = 0; j < numeroFacilitadores; j++) {
                    facilitadores[i].add(alumnos.get(numeroFacilitadores*i + j));
                }
            }
        } else {
            System.out.println("\nNo hay suficiente alumnos para designar este número de facilitadores.");
        }

        return facilitadores;
    }

    private void ordenarAlumnosPorVotos(List<Alumno> alumnos) {

        alumnos.sort(Alumno.compararPorVoto());
    }

}
