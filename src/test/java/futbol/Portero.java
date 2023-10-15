package futbol;

public class Portero extends Futbolista{
	
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero() {
		
		super("David Ospina", 30, "Portero");
		
		this.golesRecibidos = 5;
		this.dorsal = 1;
		
	}
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		
		super(nombre, edad, "Portero");
		
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
		
	}
	
	public boolean jugarConLasManos() {
		return true;
	}
	
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + 
			   " y juega de " + this.getPosicion() + " con el dorsal " + this.dorsal +
			   ". Le han marcado " + this.golesRecibidos;
	}
	
	public short getGolesRecibidos() {
		return this.golesRecibidos;
	}
	
	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
	
	public byte getDorsal() {
		return this.dorsal;
	}
	
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
	
	@Override
	
	public int compareTo(Object jugador) {
		
		if (jugador instanceof Portero) {
            Portero otroPortero = (Portero) jugador;
            return this.golesRecibidos - otroPortero.golesRecibidos;
        }
		
		return 0;
	}
}
