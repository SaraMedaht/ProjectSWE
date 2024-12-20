/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainrun;

/**
 *
 * @author TECHNICAL
 */class SessionManager {
    private static SessionManager instance;
    private String currentUser;

    private SessionManager() {}

    public static synchronized SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public void login(String user) {
        currentUser = user;
        System.out.println(user + " logged in.");
    }

    public void logout() {
        System.out.println(currentUser + " logged out.");
        currentUser = null;
    }

    public String getCurrentUser() {
        return currentUser;
    }
}