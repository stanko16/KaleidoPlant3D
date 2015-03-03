package kaleidoplant3d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JSlider slider_1;
	JRadioButton rdbtnRule;
	JRadioButton rdbtnRule_1;
	JRadioButton rdbtnRule_2;
	JRadioButton rdbtnRule_3;
	JRadioButton rdbtnRule_4;
	JRadioButton rdbtnRule_5;
	JRadioButton rdbtnRule_6;
	JRadioButton rdbtnRule_7;
	JRadioButton rdbtnRule_8;
	private JLabel lblBackgroundColor;
	private JSlider backgroundSlider;
	private JLabel lblStructureColor;
	private JSlider slider;
	private JSlider slider_2;
	private JSlider slider_3;
	private JLabel lblRed;
	private JLabel lblGreen;
	private JLabel lblBlue;

	/**
	 * Create the frame.
	 */
	public Menu() {

		this.setAlwaysOnTop(true);
		setTitle("Options");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 319, 476);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAngle = new JLabel("Angle of the branches:");
		lblAngle.setHorizontalAlignment(SwingConstants.LEFT);
		lblAngle.setBounds(16, 11, 138, 14);
		contentPane.add(lblAngle);

		slider_1 = new JSlider(JSlider.HORIZONTAL, 0, 180, 0);

		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				KaleidoPlant3D.a = (float) ((slider_1.getValue()) / 90. * 90f);
			}
		});
		slider_1.setMajorTickSpacing(30);
		slider_1.setPaintLabels(true);
		slider_1.setPaintTicks(true);
		slider_1.setBounds(10, 32, 272, 45);
		contentPane.add(slider_1);

		JLabel lblChooseTheType = new JLabel("Choose the rule:");
		lblChooseTheType.setHorizontalAlignment(SwingConstants.LEFT);
		lblChooseTheType.setBounds(16, 96, 108, 14);
		contentPane.add(lblChooseTheType);

		rdbtnRule = new JRadioButton("Rule 1");
		rdbtnRule.setSelected(true);
		rdbtnRule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnRule.isSelected()) {
					KaleidoPlant3D.path = "rule1.dat";
				}
			}
		});
		rdbtnRule.setBounds(17, 117, 95, 23);
		contentPane.add(rdbtnRule);

		rdbtnRule_1 = new JRadioButton("Rule 2");
		rdbtnRule_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnRule_1.isSelected()) {
					KaleidoPlant3D.path = "rule2.dat";
				}
			}
		});
		rdbtnRule_1.setBounds(16, 143, 96, 23);
		contentPane.add(rdbtnRule_1);

		rdbtnRule_2 = new JRadioButton("Rule 3");
		rdbtnRule_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnRule_2.isSelected()) {
					KaleidoPlant3D.path = "rule3.dat";
				}
			}
		});
		rdbtnRule_2.setBounds(17, 169, 95, 23);
		contentPane.add(rdbtnRule_2);

		rdbtnRule_3 = new JRadioButton("Rule 4");
		rdbtnRule_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnRule_3.isSelected()) {
					KaleidoPlant3D.path = "rule4.dat";
				}
			}
		});
		rdbtnRule_3.setBounds(114, 117, 95, 23);
		contentPane.add(rdbtnRule_3);

		rdbtnRule_4 = new JRadioButton("Rule 5");
		rdbtnRule_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnRule_4.isSelected()) {
					KaleidoPlant3D.path = "rule5.dat";
				}
			}
		});
		rdbtnRule_4.setBounds(114, 143, 95, 23);
		contentPane.add(rdbtnRule_4);

		rdbtnRule_5 = new JRadioButton("Rule 6");
		rdbtnRule_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnRule_5.isSelected()) {
					KaleidoPlant3D.path = "rule6.dat";
				}
			}
		});
		rdbtnRule_5.setBounds(114, 169, 95, 23);
		contentPane.add(rdbtnRule_5);

		rdbtnRule_6 = new JRadioButton("Rule 7");
		rdbtnRule_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnRule_6.isSelected()) {
					KaleidoPlant3D.path = "rule7.dat";
				}
			}
		});
		rdbtnRule_6.setBounds(211, 117, 109, 23);
		contentPane.add(rdbtnRule_6);

		rdbtnRule_7 = new JRadioButton("Rule 8");
		rdbtnRule_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnRule_7.isSelected()) {
					KaleidoPlant3D.path = "rule8.dat";
				}
			}
		});
		rdbtnRule_7.setBounds(212, 143, 109, 23);
		contentPane.add(rdbtnRule_7);

		rdbtnRule_8 = new JRadioButton("Rule 9");
		rdbtnRule_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnRule_8.isSelected()) {
					KaleidoPlant3D.path = "rule9.dat";
				}
			}
		});
		rdbtnRule_8.setBounds(212, 169, 109, 23);
		contentPane.add(rdbtnRule_8);

		ButtonGroup rules = new ButtonGroup();

		rules.add(rdbtnRule);
		rules.add(rdbtnRule_1);
		rules.add(rdbtnRule_2);
		rules.add(rdbtnRule_3);
		rules.add(rdbtnRule_4);
		rules.add(rdbtnRule_5);
		rules.add(rdbtnRule_6);
		rules.add(rdbtnRule_7);
		rules.add(rdbtnRule_8);

		lblBackgroundColor = new JLabel("Background color:");
		lblBackgroundColor.setBounds(16, 209, 155, 14);
		contentPane.add(lblBackgroundColor);

		backgroundSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 255);
		backgroundSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				KaleidoPlant3D.background = backgroundSlider.getValue();
			}
		});
		backgroundSlider.setBounds(16, 234, 266, 23);
		contentPane.add(backgroundSlider);

		lblStructureColor = new JLabel("Structure color:");
		lblStructureColor.setBounds(16, 268, 182, 14);
		contentPane.add(lblStructureColor);

		slider = new JSlider(JSlider.HORIZONTAL, 0, 255, 50);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				KaleidoPlant3D.red = slider.getValue();
			}
		});
		slider.setBounds(66, 293, 200, 23);
		contentPane.add(slider);

		slider_2 = new JSlider(JSlider.HORIZONTAL, 0, 255, 100);
		slider_2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				KaleidoPlant3D.green = slider_2.getValue();
			}
		});
		slider_2.setBounds(66, 327, 200, 23);
		contentPane.add(slider_2);

		slider_3 = new JSlider(JSlider.HORIZONTAL, 0, 255, 20);
		slider_3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				KaleidoPlant3D.blue = slider_3.getValue();
			}
		});
		slider_3.setBounds(66, 361, 200, 23);
		contentPane.add(slider_3);

		lblRed = new JLabel("Red");
		lblRed.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRed.setBounds(0, 293, 56, 14);
		contentPane.add(lblRed);

		lblGreen = new JLabel("Green");
		lblGreen.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGreen.setBounds(0, 327, 56, 14);
		contentPane.add(lblGreen);

		lblBlue = new JLabel("Blue");
		lblBlue.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBlue.setBounds(0, 361, 56, 14);
		contentPane.add(lblBlue);

	}
}
