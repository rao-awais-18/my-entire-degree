import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<String, String> users = new HashMap<>();
    static JFrame frame;
    static String currentUser = "";

    public static void main(String[] args) {
        showWelcomeScreen();
    }

    static void showWelcomeScreen() {
        frame = new JFrame("Fitness Tracker by Rao Awais");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLayout(null);

        JLabel background = new JLabel(new ImageIcon("images/login_bg.jpg"));
        background.setBounds(0, 0, 700, 500);
        frame.setContentPane(background);
        background.setLayout(null);

        JLabel title = new JLabel("Welcome to Fitness Tracker by Rao Awais", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(100, 30, 500, 40);
        background.add(title);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(250, 100, 200, 40);
        background.add(loginBtn);

        JButton signupBtn = new JButton("Sign Up");
        signupBtn.setBounds(250, 160, 200, 40);
        background.add(signupBtn);

        JButton exitBtn = new JButton("Exit");
        exitBtn.setBounds(250, 220, 200, 40);
        background.add(exitBtn);

        loginBtn.addActionListener(e -> showLoginScreen());
        signupBtn.addActionListener(e -> showSignupScreen());
        exitBtn.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }

    static void showLoginScreen() {
        String username = JOptionPane.showInputDialog(frame, "Enter Username:");
        String password = JOptionPane.showInputDialog(frame, "Enter Password:");

        if (users.containsKey(username) && users.get(username).equals(password)) {
            currentUser = username;
            showMainMenu();
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid credentials!");
        }
    }

    static void showSignupScreen() {
        String username = JOptionPane.showInputDialog(frame, "Choose a Username:");
        String password = JOptionPane.showInputDialog(frame, "Choose a Password:");

        if (!users.containsKey(username)) {
            users.put(username, password);
            JOptionPane.showMessageDialog(frame, "Signup successful! Now login.");
        } else {
            JOptionPane.showMessageDialog(frame, "Username already exists!");
        }
    }

    static void showMainMenu() {
        frame.getContentPane().removeAll();
        frame.repaint();

        JLabel bg = new JLabel(new ImageIcon("images/dashboard_bg.jpg"));
        bg.setBounds(0, 0, 700, 500);
        frame.setContentPane(bg);
        bg.setLayout(null);

        JLabel menuTitle = new JLabel("Main Menu", JLabel.CENTER);
        menuTitle.setFont(new Font("Arial", Font.BOLD, 22));
        menuTitle.setBounds(200, 30, 300, 40);
        bg.add(menuTitle);

        JButton addExercise = new JButton("Add Your Own Exercise");
        addExercise.setBounds(220, 100, 250, 40);
        bg.add(addExercise);

        JButton appRecommend = new JButton("App Recommended Exercises");
        appRecommend.setBounds(220, 160, 250, 40);
        bg.add(appRecommend);

        JButton healthTips = new JButton("Health Tips by Dr. Rao Awais");
        healthTips.setBounds(220, 220, 250, 40);
        bg.add(healthTips);

        JButton exit = new JButton("Exit App");
        exit.setBounds(220, 280, 250, 40);
        bg.add(exit);

        addExercise.addActionListener(e -> showAddExerciseScreen());
        appRecommend.addActionListener(e -> showRecommendedExercises());
        healthTips.addActionListener(e -> showHealthTips());
        exit.addActionListener(e -> System.exit(0));

        frame.revalidate();
        frame.repaint();
    }

    static void showAddExerciseScreen() {
        frame.getContentPane().removeAll();
        frame.repaint();

        JLabel bg = new JLabel(new ImageIcon("images/gym_bg.jpg"));
        bg.setBounds(0, 0, 700, 500);
        frame.setContentPane(bg);
        bg.setLayout(null);

        JLabel label = new JLabel("Enter Your Exercise:");
        label.setBounds(50, 50, 300, 30);
        bg.add(label);

        JTextField input = new JTextField();
        input.setBounds(50, 90, 400, 30);
        bg.add(input);

        JButton save = new JButton("Save");
        save.setBounds(470, 90, 100, 30);
        bg.add(save);

        JTextArea area = new JTextArea();
        JScrollPane scroll = new JScrollPane(area);
        scroll.setBounds(50, 150, 500, 200);
        bg.add(scroll);

        JButton back = new JButton("Back to Main Menu");
        back.setBounds(250, 370, 180, 30);
        bg.add(back);

        save.addActionListener(e -> {
            String text = input.getText();
            if (!text.isEmpty()) {
                area.append("- " + text + "\n");
                input.setText("");
            }
        });

        back.addActionListener(e -> showMainMenu());

        frame.revalidate();
        frame.repaint();
    }

    static void showRecommendedExercises() {
        frame.getContentPane().removeAll();
        frame.repaint();

        JLabel bg = new JLabel(new ImageIcon("images/gym_bg.jpg"));
        bg.setBounds(0, 0, 700, 500);
        frame.setContentPane(bg);
        bg.setLayout(null);

        JTextArea area = new JTextArea();
        area.setBounds(50, 50, 580, 300);
        area.setEditable(false);
        area.setFont(new Font("Arial", Font.PLAIN, 16));
        area.setText("For Better Stamina:\n - Walking\n - Jogging\n - Running\n\n" +
                "For Weight Gaining:\n - Heavy Diet\n - Gym Visits Daily\n\n" +
                "For Muscles:\n - Push-ups\n - Chin-ups\n - Up-stands");
        bg.add(area);

        JButton back = new JButton("Back to Main Menu");
        back.setBounds(250, 370, 180, 30);
        bg.add(back);
        back.addActionListener(e -> showMainMenu());

        frame.revalidate();
        frame.repaint();
    }

    static void showHealthTips() {
        frame.getContentPane().removeAll();
        frame.repaint();

        JLabel bg = new JLabel(new ImageIcon("images/gym_bg.jpg"));
        bg.setBounds(0, 0, 700, 500);
        frame.setContentPane(bg);
        bg.setLayout(null);

        JTextArea area = new JTextArea();
        area.setBounds(50, 50, 580, 300);
        area.setEditable(false);
        area.setFont(new Font("Arial", Font.PLAIN, 16));
        area.setText("Recommended by PROF. DR. RAO AWAIS:\n\n" +
                "- Drink at least 8 glasses of water daily.\n" +
                "- Sleep for 7-8 hours every night.\n" +
                "- Eat balanced meals with fruits and vegetables.\n" +
                "- Avoid junk food and sugary drinks.\n" +
                "- Exercise at least 30 minutes daily.");
        bg.add(area);

        JButton back = new JButton("Back to Main Menu");
        back.setBounds(250, 370, 180, 30);
        bg.add(back);
        back.addActionListener(e -> showMainMenu());

        frame.revalidate();
        frame.repaint();
    }
}