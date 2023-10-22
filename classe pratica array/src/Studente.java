public class Studente {
    private String name;
    private String surname;
    private int ID;
    private int mediaScolastica;
    public Studente(String name, String surname, int ID, int mediaScolastica) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.mediaScolastica = mediaScolastica;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMediaScolastica() {
        return mediaScolastica;
    }

    public void setMediaScolastica(int mediaScolastica) {
        this.mediaScolastica = mediaScolastica;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ID=" + ID +
                ", mediaScolastica=" + mediaScolastica +
                '}';
    }
}
