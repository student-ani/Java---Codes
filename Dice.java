class Dice {
    int roll() {
        double random = Math.random() * 6;       //Multiply by 6 bcz the random method give the b/w 0 and 1 and we want the value b/w 1 to 6. 
        return (int) Math.ceil(random);
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        for (int i = 0; i <= 6; i++) {
            System.out.println(dice.roll());
        }
    }

}
