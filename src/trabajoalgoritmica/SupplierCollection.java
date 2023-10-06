/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoalgoritmica;

/**
 *
 * @author jzegarram
 */
public class SupplierCollection {

    private Supplier[] suppliers;
    private int index;

    public SupplierCollection(int size) {
        suppliers = new Supplier[size];
        index = 0;
    }

    public void addSupplier(int supplierId, String supplierName) {
        Supplier supplier = new Supplier(supplierName, supplierId);
        suppliers[index] = supplier;
        index++;
    }

    public Integer findSupplier(int supplierId) {
        for (int i = 0; i < index; i++) {
            if (suppliers[i].getSupplierId() == supplierId) {
                return i;
            }
        }
        return null;
    }

    public void deleteSupplier(int supplierId) {
        Integer position = findSupplier(supplierId);
        if (position != null) {
            suppliers[position] = null;
            for (int i = position; i < index - 1; i++) {
                suppliers[i] = suppliers[i + 1];
                suppliers[i + 1] = null;
            }
            index--;
        }
    }

    // Method to show a supplier by its ID
    public Supplier showSupplier(int supplierId) {
        Integer position = findSupplier(supplierId);
        if (position != null) {
            return suppliers[position];
        } else {
            return null;
        }
    }
}
