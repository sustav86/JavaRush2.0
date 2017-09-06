package task32.task3209;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by ukr-sustavov on 17.08.2017.
 */
public class MenuHelper {
    public static JMenuItem addMenuItem(JMenu parent, String text, ActionListener actionListener) {
        JMenuItem jMenuItem = new JMenuItem(text);
        jMenuItem.addActionListener(actionListener);
        parent.add(parent);

        return jMenuItem;
    }

    public static JMenuItem addMenuItem(JMenu parent, Action action) {
        JMenuItem jMenuItem = new JMenuItem(action);
        jMenuItem.setText("sdfsdf");
        parent.add(parent);

        return jMenuItem;
    }

    public static JMenuItem addMenuItem(JMenu parent, String text, Action action) {
        JMenuItem jMenuItem = addMenuItem(parent, action);
        jMenuItem.setText(text);
        parent.add(jMenuItem);

        return jMenuItem;
    }

    public static void initHelpMenu(View view, JMenuBar menuBar) {


    }

    public static void initFontMenu(View view, JMenuBar menuBar) {

    }

    public static void initColorMenu(View view, JMenuBar menuBar) {

    }

    public static void initAlignMenu(View view, JMenuBar menuBar) {

    }

    public static void initStyleMenu(View view, JMenuBar menuBar) {

    }

    public static void initEditMenu(View view, JMenuBar menuBar) {

    }

    public static void initFileMenu(View view, JMenuBar menuBar) {

    }
}
