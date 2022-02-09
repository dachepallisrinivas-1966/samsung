package com.samsung.ui;

// Program : jlist.java
// swings - [JList]
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JFrameDemo5 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private Vector<String> list = new Vector<>();
	private JList<String> lst;
	private JButton btnAdd, btnRemove, btnList, btnClear;

	public JFrameDemo5() {
		super("JList Operations");
		list.add("Bill Gates");
		list.add("Alan Cooper");
		list.add("James Gosling");
		list.add("Bipin Joshi");
		list.add("Micheal Dell");
		lst = new JList<>(list);

		btnAdd = new JButton("Add");
		btnRemove = new JButton("Remove");
		btnList = new JButton("List");
		btnClear = new JButton("Unselect");

		btnAdd.addActionListener(this);
		btnRemove.addActionListener(this);
		btnList.addActionListener(this);
		btnClear.addActionListener(this);

		Container c = getContentPane();
		JScrollPane jsp = new JScrollPane(lst, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		c.add(jsp, "Center");
		JPanel p = new JPanel(new FlowLayout());
		p.add(btnAdd);
		p.add(btnRemove);
		p.add(btnList);
		p.add(btnClear);
		c.add(p, "South");

		setSize(400, 200);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btnClear)
			lst.clearSelection();
		else if (ae.getSource() == btnAdd) {
			String name = JOptionPane.showInputDialog(this, "Enter name : ", "Add", JOptionPane.PLAIN_MESSAGE);
			list.add(name);
			lst.setListData(list);
		} else if (ae.getSource() == btnList) {
			Object[] ar = lst.getSelectedValues();
			String st = "";
			for (int i = 0; i < ar.length; i++)
				st += ar[i].toString() + "\n";
			JOptionPane.showMessageDialog(this, st, "Selected Items", JOptionPane.INFORMATION_MESSAGE);
		} else if (ae.getSource() == btnRemove) {
			int res = JOptionPane.showConfirmDialog(this, "do you want to delete selected items?", "Confirm",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (res == JOptionPane.YES_OPTION) {
				Object[] ar = lst.getSelectedValues();
				for (int i = 0; i < ar.length; i++)
					list.remove(ar[i]);
				lst.setListData(list);
			}
		}
	}

	public static void main(String[] args) {
		new JFrameDemo5();
	}
}
