package pasta;

public final class ac extends cb {
   private int a;
   private bo a;
   private short a = 0;
   private int b;
   private int c;

   public static void a(int var0, int var1, int var2) {
      ac var3 = new ac();
      var3.a = GameSrc.a[var0 - 1];
      var3.b = var1;
      var3.c = var2;
      var3.a = 2;
      cb.a.addElement(var3);
   }

   public final void a() {
      if (0L != 0L) {
         ++this.a;
         if (this.a >= this.a.a.length) {
            this.a = 0;
         }

         if (System.currentTimeMillis() > 0L) {
            cb.a.removeElement(this);
         }
      } else {
         ++this.a;
         if (this.a >= this.a.a.length) {
            --this.a;
            if (this.a <= 0) {
               cb.a.removeElement(this);
            } else {
               this.a = 0;
            }
         }
      }

   }

   public final void a(dm var1) {
      if (dm.a == 1) {
         ++GameSrc.x;
      }

      if (GameSrc.x < 8) {
         int var2 = this.b;
         int var3 = this.a.a[this.a].a;
         int var5 = this.c;
         int var4 = this.a.a[this.a].b;
         ao.a(var1, this.a.a[this.a].c, var3 + var2, var5 + var4, 0, 3);
      }

   }
}
