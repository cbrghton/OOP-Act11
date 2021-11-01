package mx.ipn;

public class ArreglosCad {
    private String[][] Agenda = new String[4][4];

    public void setAgenda(String[][] agenda) {
        this.Agenda[0][0] = "Nombre";
        this.Agenda[0][1] = "Boleta";
        this.Agenda[0][2] = "Edad";
        this.Agenda[0][3] = "Teléfono";

        for (int y = 1; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                this.Agenda[y][x] = agenda[y-1][x];
            }
        }
    }

    public String[][] getAgenda() {
        return this.Agenda;
    }
}
