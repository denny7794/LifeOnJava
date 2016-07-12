package x.gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Created by Denis on 12.07.2016.
 */
public class Map extends JTable {

    private int mapSize = 400;
    private int cellSize = 5;

    public Map() {
        this.setModel(new DefaultTableModel(this.mapSize, this.mapSize));
        this.setRowHeight(this.cellSize);
        for (int i=0; i<this.mapSize; i++){
            this.getColumnModel().getColumn(i).setMinWidth(this.cellSize);
            this.getColumnModel().getColumn(i).setMaxWidth(this.cellSize);
        }
    }

}
