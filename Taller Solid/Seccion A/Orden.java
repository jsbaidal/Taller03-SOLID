/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espol.tallersolid;

class Orden {

    private List<Item> items;

    public void agregarItem(Item item) {
        items.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrecio();
        }
        return total;
    }

    public void printFactura() {
// Genera la factura en papel o PDF
    }
}
