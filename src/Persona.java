public class Persona {
    private int id;
    private String nombre;
    private  int telefono;
    private String email;
    private static int numeroPersonas = 0;

    //Constructor vacio
    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }

    //Constructor con argumentos
    public Persona(String nombre, int telefono, String email){
        this(); // Se llama al constructor vacio
        this.nombre = nombre;
        this.telefono =  telefono;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getNumeroPersonas() {
        return numeroPersonas;
    }

    public static void setNumeroPersonas(int numeroPersonas) {
        Persona.numeroPersonas = numeroPersonas;
    }

    //Se sobre escribe el metodo to string para que al mandar a imprimir el valor de un objeto mande los valores y no
    //la referncia de memoria
    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                '}'
                //+ super.toString() -> si se agrega esta línea, se mostrará la referencia de memoria
                ;
    }
}
