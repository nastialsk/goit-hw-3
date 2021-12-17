class ATM {
    public int countBanknotes(int sum) {

        int count = 0;
      int i=0;
        while (i<sum) {
            int count9 = sum / 500;
            int sum1 = sum - 500 * count9;
            int count1 = sum1 / 200;
            int sum2 = sum1 - 200 * count1;
            int count2 = sum2 / 100;
            int sum3 = sum2 - 100 * count2;
            int count3 = sum3 / 50;
            int sum4 = sum3 - 50 * count3;
            int count4 = sum4 / 20;
            int sum5 = sum4 - 20 * count4;
            int count5 = sum5 / 10;
            int sum6 = sum5 - 10 * count5;
            int count6 = sum6 / 5;
            int sum7 = sum6 - 5 * count6;
            int count7 = sum7 / 2;
            int sum8 = sum7 - 2 * count7;
            int count8 = sum8 / 1;
            count = count9 + count1 + count2 + count3 + count4 + count5 + count6 + count7 + count8;
          i++;
        }
        return count;
    }}
