package modelo;

public class Animal{
    // Atributos
    private int peso = 0;

    // Metodos
    public void setPeso (int peso)
    {
        this.peso = peso;
    }

    public int getPeso()
    {
        return peso;
    }

    public String hallar()
    {
        return "Los animales no hablan";
    }
}