package galeria.pieza;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import galeria.usuarios.CompradorPropietario;
import subasta.Oferta;

/**
 * Clase que representa una pieza de arte en la galería.
 */
public class Pieza {
    private String idPieza;
    private String titulo;
    private int anioCreacion;
    private String lugarCreacion;
    private String estadoPieza;
    private boolean estaExhibida;
    private boolean disponibleVenta;  
    private List<String> autores;
    private double valorFijo;
    private int valorMinimo;
    private int valorInicial;
    private Date fechaDeIngreso;
    private boolean esVigente;
    private String descripcion;
    private List<CompradorPropietario> historialPropietarios;
    private List<Oferta> historialVentas;

    public Pieza(String idPieza, String titulo, int anioCreacion, String lugarCreacion, 
                 String estadoPieza, boolean estaExhibida, boolean disponibleVenta, 
                 List<String> autores, double valorFijo, int valorMinimo, int valorInicial,
                 Date fechaDeIngreso, boolean esVigente, String descripcion) {
        this.idPieza = idPieza;
        this.titulo = titulo;
        this.anioCreacion = anioCreacion;
        this.lugarCreacion = lugarCreacion;
        this.estadoPieza = estadoPieza;
        this.estaExhibida = estaExhibida;
        this.disponibleVenta = disponibleVenta;
        this.autores = autores;
        this.valorFijo = valorFijo;
        this.valorMinimo = valorMinimo;
        this.valorInicial = valorInicial;
        this.fechaDeIngreso = fechaDeIngreso;
        this.esVigente = esVigente;
        this.descripcion = descripcion;
        this.historialPropietarios = new ArrayList<CompradorPropietario>();
        this.historialVentas = new ArrayList<Oferta>();
    }

    public void setValorFijo(double valorFijo) {
    	this.valorFijo = valorFijo;
    }
    
    public void setDisponibleVenta(boolean disponibleVenta) {
    	this.disponibleVenta = disponibleVenta;
    }
    
    public void setValorMinimo(int valorMinimo) {
    	this.valorMinimo = valorMinimo;
    }
    
    public void setValorInicial(int valorInicial) {
    	this.valorInicial = valorInicial;
    }
    
    public String getIdPieza() {
        return idPieza;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public String getLugarCreacion() {
        return lugarCreacion;
    }

    public String getEstadoPieza() {
        return estadoPieza;
    }

    public boolean getEstaExhibida() {
        return estaExhibida;
    }

    public boolean getDisponibleVenta() {
        return disponibleVenta;
    }

    public List<String> getAutor() {
        return autores;
    }

    public double getValorFijo() {
        return valorFijo;
    }

    public int getValorMinimo() {
        return valorMinimo;
    }

    public int getValorInicial() {
        return valorInicial;
    }

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public boolean isEsVigente() {
        return esVigente;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public void setAutores(String autor) {
    	this.autores.add(autor);
    }

   

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public void actualizarEstadoExhibicion(boolean estaExhibida) {
        this.estaExhibida = estaExhibida;
    }
    
    public List<CompradorPropietario> getHistorialPropietarios() {
    	return this.historialPropietarios;
    }
    public List<Oferta> getHistorialVentas() {
    	return this.historialVentas;
    }
    public void setPropietario(CompradorPropietario nuevoPropietario) {
    	this.historialPropietarios.add(nuevoPropietario);
    }
    
}