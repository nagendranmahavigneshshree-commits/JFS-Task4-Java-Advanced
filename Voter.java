class Voter {

    int voterId;
    String name;
    int age;

    Voter(int voterId, String name, int age) throws Exception {

        if (age < 18) {
            throw new Exception("invalid age for voter");
        }

        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        try {
            Voter v = new Voter(101, "Arun", 17);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
