class Administrator extends User {
    String codAdmin;

    public Administrator(String codAdmin) {
        this.codAdmin = codAdmin;
    }

    public void manageUser() {
        System.out.println("cod admin:" + codAdmin + " manageUser");
    }
}
