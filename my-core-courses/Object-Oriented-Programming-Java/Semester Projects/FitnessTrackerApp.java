import javax.swing.*;
import java.awt.*;
import java.awt.event.*; import java.util.ArrayList;

public class FitnessTrackerApp {

    public static void main(String[] args) {
        new LoginFrame();
    }

}

class LoginFrame extends JFrame implements ActionListener { JTextField usernameField; JPasswordField passwordField; JButton loginButton;

    public LoginFrame() {
        setTitle("Fitness Tracker - Login");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel titleLabel = new JLabel("Welcome to Fitness Tracker", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel userLabel = new JLabel("Username:");
        usernameField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(5, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
        panel.add(titleLabel);
        panel.add(userLabel);
        panel.add(usernameField);
        panel.add(passLabel);
        panel.add(passwordField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(loginButton);

        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (username.equals("admin") && password.equals("admin")) {
            dispose();
            new DashboardFrame(username);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}

class DashboardFrame extends JFrame { JLabel welcomeLabel; JButton logWorkoutBtn, viewProgressBtn, logoutBtn;

    ArrayList<String> workoutLog = new ArrayList<>();

    public DashboardFrame(String username) {
        setTitle("Fitness Tracker - Dashboard");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        welcomeLabel = new JLabel("Welcome, " + username + "!", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));

        logWorkoutBtn = new JButton("Log Workout");
        viewProgressBtn = new JButton("View Progress");
        logoutBtn = new JButton("Logout");

        logWorkoutBtn.addActionListener(e -> logWorkout());
        viewProgressBtn.addActionListener(e -> viewProgress());
        logoutBtn.addActionListener(e -> {
            dispose();
            new LoginFrame();
        });

        JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 20, 20));
        buttonPanel.add(logWorkoutBtn);
        buttonPanel.add(viewProgressBtn);
        buttonPanel.add(logoutBtn);

        JPanel mainPanel = new JPanel(new BorderLayout(20, 20));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(40, 80, 40, 80));
        mainPanel.add(welcomeLabel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        add(mainPanel);
        setVisible(true);
    }

    private void logWorkout() {
        String workout = JOptionPane.showInputDialog(this, "Enter your workout (e.g., Running 30 mins):");
        if (workout != null && !workout.trim().isEmpty()) {
            workoutLog.add(workout);
            JOptionPane.showMessageDialog(this, "Workout logged successfully!");
        }
    }

    private void viewProgress() {
        if (workoutLog.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No workouts logged yet.");
        } else {
            StringBuilder sb = new StringBuilder("Your Workouts:\n");
            for (String workout : workoutLog) {
                sb.append("- ").append(workout).append("\n");
            }
            JOptionPane.showMessageDialog(this, sb.toString());
        }
    }

}