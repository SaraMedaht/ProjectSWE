/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainrun;

/**
 *
 * @author TECHNICAL
 */
abstract class Theater {
    protected String name;

    public String getName() {
        return name;
    }
}

class CinemaHall extends Theater {
    public CinemaHall() {
        name = "Cinema Hall";
    }
}

class IMAX extends Theater {
    public IMAX() {
        name = "IMAX";
    }
}

class TheaterFactory {
    public static Theater createTheater(String type) {
        switch (type) {
            case "Cinema Hall":
                return new CinemaHall();
            case "IMAX":
                return new IMAX();
            default:
                throw new IllegalArgumentException("Unknown theater type: " + type);
        }
    }
}

