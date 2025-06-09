package pasta;

public final class Item {
   public byte a = -1;
   public int a;
   public long a;
   public String a = "";
   public MyVector a;
   public short a = -1;
   public boolean a;
   public db[] a;
   public byte b;
   public int b;
   public boolean b;
   public boolean c;
   public int d;
   public boolean d = false;
   public int e;
   public boolean e;
   public int f;
   public int g;
   public int h;
   public int i;
   public ItemTemplate itemTemplate;
   public int j = -1;
   public int k = -1;
   public int l = -1;
   public int m = -1;
   public int quantity;

   public Item() {
      int[] var1 = new int[]{0, 0, 0, 0, 600841, 600841, 667658, 667658, 3346944, 3346688, 4199680, 5052928, 3276851, 3932211, 4587571, 5046280, 6684682, 3359744};
   }

   public final void a() {
      Panel var1 = main.a.a;
      this.i = Panel.a(this);
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this.j = var1;
      this.k = var2;
      this.l = var3;
      this.m = var4;
   }

   public final boolean a() {
      boolean var1;
      if ((this.itemTemplate.type < 0 || this.itemTemplate.type >= 6) && this.itemTemplate.type != 32) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public final boolean a(int var1) {
      boolean var3 = false;

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         db var4 = this.a[var2];
         if (var4 != null && var4.a.a == var1) {
            var3 = true;
            break;
         }
      }

      return var3;
   }
}
