
public class fu {
	
	public class Vehiculo {
	    private int ruedas;
	    private int velocidad;

	    public Vehiculo() {
	        this(0, 0);
	    }

	    public Vehiculo(int ruedas, int velocidad) {
	        this.ruedas = ruedas;
	        this.velocidad = velocidad;
	        System.out.println("Se ha creado un vehículo.");
	    }

	    public void acelerar(int mas) {
	        int nuevaVelocidad = this.velocidad + mas;
	        if (nuevaVelocidad <= 120) {
	            this.velocidad = nuevaVelocidad;
	            System.out.println("El vehículo ha acelerado a " + this.velocidad + " Km/h.");
	        } else {
	            System.out.println("El vehículo no puede superar los 120 Km/h.");
	        }
	    }

	    public void frenar(int menos) {
	        int nuevaVelocidad = this.velocidad - menos;
	        if (nuevaVelocidad >= 0) {
	            this.velocidad = nuevaVelocidad;
	            System.out.println("El vehículo ha frenado a " + this.velocidad + " Km/h.");
	        } else {
	            System.out.println("El vehículo está parado.");
	        }
	    }

	    public int getRuedas() {
	        return this.ruedas;
	    }

	    public int getVelocidad() {
	        return this.velocidad;
	    }
	}

	public class Coche extends Vehiculo {
	    private int combustible;

	    public Coche() {
	        this(0, 0, 0);
	    }

	    public Coche(int ruedas, int velocidad, int combustible) {
	        super(ruedas, velocidad);
	        this.combustible = combustible;
	        System.out.println("Se ha creado un coche.");
	    }

	    public void repostar(int mas) {
	        int nuevoCombustible = this.combustible + mas;
	        if (nuevoCombustible <= 60) {
	            this.combustible = nuevoCombustible;
	            System.out.println("Se han añadido " + mas + " litros de gasolina al depósito.");
	        } else {
	            System.out.println("El depósito no puede superar los 60 litros de gasolina.");
	        }
	    }

	    public void consumir(int menos) {
	        int nuevoCombustible = this.combustible - menos;
	        if (nuevoCombustible >= 0) {
	            this.combustible = nuevoCombustible;
	            System.out.println("Se han consumido " + menos + " litros de gasolina.");
	        } else {
	            System.out.println("El depósito está vacío.");
	        }
	    }

	    public int getCombustible() {
	        return this.combustible;
	    }

	    public void acelerar(int mas) {
	        super.acelerar(mas);
	        System.out.println("El coche ha acelerado a " + this.getVelocidad() + " Km/h.");
	    }

	    public void frenar(int menos) {
	        super.frenar(menos);
	        System.out.println("El coche ha frenado a " + this.getVelocidad() + " Km/h.");
	    }
	}

}

