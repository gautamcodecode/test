class prime {
    public static void main(String arg[]) {
        // Decalring variables and taling values from user..
        int i, count;
        // Printing the result...
        System.out.println("Prime numbers between 1 to 100 are ");
        for (int j = 2; j <= 100; j++) {
            count = 0;
            for (i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.println(j + "  ");
        }
        System.out.println(Prime2());

    }

    public static int Prime2() {
        int l;
        for (l = 3; l <= 100; l++) {
            for (int k = 2; k <= l / 2; k++) {
                if (l % k == 0) {
                } else {
                    //System.out.println(l + "number is prime:");
                    break;
                }

            }

        }
        return l;
    }}