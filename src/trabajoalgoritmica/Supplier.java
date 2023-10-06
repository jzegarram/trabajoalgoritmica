/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoalgoritmica;

/**
 *
 * @author jzegarram
 */
public class Supplier {
    private String _name;
    private int _id;

    public Supplier(String name, int id) {
        _name = name;
        _id = id;
    }

    public void setSupplierId(int id) {
        _id = id;
    }

    public int getSupplierId() {
        return _id;
    }

    public void setSupplierName(String name) {
        _name = name;
    }

    public String getSupplierName() {
        return _name;
    }
}