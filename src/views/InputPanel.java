package views;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;

public class InputPanel extends JPanel {
    JLabel label;
    JTextField field;
    public InputPanel() {
        this.initComponent();
        this.setupComponent();
        this.addComponent();
    }
    public InputPanel(String text) {
        this.initComponent();
        this.setupComponent();
        this.label.setText(text);
        this.addComponent();
    }
    private void initComponent() {
        this.label = new JLabel();
        this.field = new JTextField();
    }
    private void setupComponent() {
        
        this.label.setPreferredSize(new Dimension(100, 27));
        this.field.setPreferredSize(new Dimension(100, 27));
    }
    public void setLabel(String text) {
        this.label.setText(text);
    }
    public void setValue(String text) {
        this.field.setText(text);
    }
    public String getValue() {
        return this.field.getText();
    }
    private void addComponent() {
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.add(this.label);
        this.add(this.field);
    }
}
