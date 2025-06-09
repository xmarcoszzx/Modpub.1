package pasta;

public final class y extends cb {
   private int a;
   private Char a;
   private bo a;
   private i a;
   private short a = 0;
   private int b;
   private int c;
   private int d;

   public static void a(int var0, int var1, int var2, int var3) {
      y var4 = new y();
      var4.a = GameSrc.a[var0 - 1];
      var4.b = var1;
      var4.c = var2;
      var4.a = (short)var3;
      cb.b.addElement(var4);
   }

   public static void a(int var0, Char var1, int var2) {
      y var3 = new y();
      var3.a = GameSrc.a[var0 - 1];
      var3.a = var1;
      var3.a = (short)var2;
      cb.b.addElement(var3);
   }

   public static void a(int var0, i var1) {
      y var2 = new y();
      var2.a = GameSrc.a[var0 - 1];
      var2.a = var1;
      var2.a = 1;
      cb.b.addElement(var2);
   }

   public static void b(int var0, int var1, int var2, int var3) {
      y var4 = new y();
      var4.a = GameSrc.a[var0 - 1];
      var4.b = var1;
      var4.c = var2;
      var4.a = 1;
      var4.d = var3;
      cb.b.addElement(var4);
   }

   public final void a() {
      if (0L != 0L) {
         ++this.a;
         if (this.a >= this.a.a.length) {
            this.a = 0;
         }

         if (System.currentTimeMillis() > 0L) {
            cb.b.removeElement(this);
         }
      } else {
         ++this.a;
         if (this.a >= this.a.a.length) {
            --this.a;
            if (this.a <= 0) {
               cb.b.removeElement(this);
            } else {
               this.a = 0;
            }
         }
      }

      if (main.a.g % 11 == 0 && this.a != null && this.a != Char.myCharz() && !GameSrc.d.contains(this.a)) {
         cb.b.removeElement(this);
      }

   }

   public final void a(dm var1) {
      if (dm.a == 1) {
         ++GameSrc.x;
      }

      if (GameSrc.x < 11) {
         if (this.a != null) {
            this.b = this.a.b;
            this.c = this.a.c + main.a.o;
         }

         if (this.a != null) {
            this.b = this.a.e;
            this.c = this.a.f + main.a.o;
         }

         int var2 = this.b + this.a.a[this.a].a;
         int var3 = this.c + this.a.a[this.a].b;
         if (main.a.a(var2, var3)) {
            ao.a(var1, this.a.a[this.a].c, var2, var3, this.d, 3);
         }
      }

   }
}
