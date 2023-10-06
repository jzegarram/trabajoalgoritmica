/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoalgoritmica;

/**
 *
 * @author jzegarram
 */
public class Part {
    
    private String _name;
    private int _id;

    public Part(String name, int id) {
        _name = name;
        _id = id;
    }

    public void setPartId(int id) {
        _id = id;
    }

    public int getPartId() {
        return _id;
    }

    public void setPartName(String name) {
        _name = name;
    }

    public String getPartName() {
        return _name;
    }
}
