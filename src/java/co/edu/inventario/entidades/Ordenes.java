/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.inventario.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Estefa Muñoz Diaz
 */
@Entity
@Table(name = "ordenes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordenes.findAll", query = "SELECT o FROM Ordenes o"),
    @NamedQuery(name = "Ordenes.findByOrdenesid", query = "SELECT o FROM Ordenes o WHERE o.ordenesid = :ordenesid"),
    @NamedQuery(name = "Ordenes.findByFecha", query = "SELECT o FROM Ordenes o WHERE o.fecha = :fecha"),
    @NamedQuery(name = "Ordenes.findByProveedor", query = "SELECT o FROM Ordenes o WHERE o.proveedor = :proveedor"),
    @NamedQuery(name = "Ordenes.findByCliente", query = "SELECT o FROM Ordenes o WHERE o.cliente = :cliente"),
    @NamedQuery(name = "Ordenes.findByProducto", query = "SELECT o FROM Ordenes o WHERE o.producto = :producto")})
public class Ordenes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ordenesid")
    private Integer ordenesid;
    @Size(max = 10)
    @Column(name = "fecha")
    private String fecha;
    @Size(max = 50)
    @Column(name = "proveedor")
    private String proveedor;
    @Size(max = 50)
    @Column(name = "cliente")
    private String cliente;
    @Size(max = 50)
    @Column(name = "producto")
    private String producto;

    public Ordenes() {
    }

    public Ordenes(Integer ordenesid) {
        this.ordenesid = ordenesid;
    }

    public Integer getOrdenesid() {
        return ordenesid;
    }

    public void setOrdenesid(Integer ordenesid) {
        this.ordenesid = ordenesid;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordenesid != null ? ordenesid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordenes)) {
            return false;
        }
        Ordenes other = (Ordenes) object;
        if ((this.ordenesid == null && other.ordenesid != null) || (this.ordenesid != null && !this.ordenesid.equals(other.ordenesid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.inventario.entidades.Ordenes[ ordenesid=" + ordenesid + " ]";
    }
    
}
