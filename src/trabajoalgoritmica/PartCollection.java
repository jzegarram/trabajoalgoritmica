/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoalgoritmica;

/**
 *
 * @author jzegarram
 */
public class PartCollection {
    private Part[] parts;
    private int index;

    public PartCollection(int size) {
        parts = new Part[size];
        index = 0;
    }

    public void addPart(int partId, String partName) {
        Part part = new Part(partName, partId);
        parts[index] = part;
        index++;
    }

    public Integer findPart(int partId) {
        for (int i = 0; i < index; i++) {
            if (parts[i].getPartId() == partId) {
                return i;
            }
        }
        return null; 
    }

    public void deletePart(int partId) {
        Integer position = findPart(partId);
        if (position != null) {
            for (int i = position; i < index - 1; i++) {
                parts[i] = parts[i + 1];
            }
            index--;
        }
    }

    public void showPart(int position) {
        if (position >= 0 && position < index) {
            Part part = parts[position];
            System.out.println("Part Name: " + part.getPartName());
            System.out.println("Part ID: " + part.getPartId());
        } else {
            System.out.println("Invalid position.");
        }
    }

}
