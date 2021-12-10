package ejercicio00C;

public class Distancia {
	// no hay atributos

	// constructores

	public Distancia() {}

	// metodos

	public float millasAMetros(float a) {
		float r = a*1852;

		return r;
	}

	public float millasAKilometros(float a) {
		float r = a*1.852F;

		return r;
	}
}
