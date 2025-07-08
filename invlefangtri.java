class invlefangtri{
  public static void inverted_left_angled_tri(int n) {
        for (int i = n; i >= 1; i--) {
            for (int k = i; k < n; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
      public static void main(String[] args) {
        int n = 5;
        System.out.println("Inverted left angled triangle");
        inverted_left_angled_tri(n);
      }
}
