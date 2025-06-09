package pasta;

public final class bx {
   public int a = 0;
   private long a;
   private String a;
   public short a;
   private boolean a;
   public int b;
   private long b;
   private boolean b;

   public bx() {
   }

   public bx(short var1, int var2) {
      this.a = var1;
      this.b = var2 / 60;
      this.a = var2 % 60;
      long var3 = System.currentTimeMillis();
      this.b = var3;
      this.a = var3;
   }

   public static bx a(int var0) {
      int var1 = 0;

      bx var2;
      while(true) {
         if (var1 >= Char.all.size()) {
            var2 = null;
            break;
         }

         bx var3 = (bx)Char.all.elementAt(var1);
         var2 = var3;
         if (var3.a == var0) {
            break;
         }

         ++var1;
      }

      return var2;
   }

   public static boolean a(int var0) {
      boolean var2 = false;

      for(int var1 = 0; var1 < Char.all.size(); ++var1) {
         if (((bx)Char.all.elementAt(var1)).a == var0) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public static bx b(int var0) {
      int var1 = 0;

      bx var2;
      while(true) {
         if (var1 >= GameSrc.i.size()) {
            var2 = null;
            break;
         }

         bx var3 = (bx)GameSrc.i.elementAt(var1);
         var2 = var3;
         if (var3.a == var0) {
            break;
         }

         ++var1;
      }

      return var2;
   }

   public static boolean b(int var0) {
      boolean var2 = false;

      for(int var1 = 0; var1 < GameSrc.i.size(); ++var1) {
         if (((bx)GameSrc.i.elementAt(var1)).a == var0) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public final void a() {
      this.a = System.currentTimeMillis();
      if (this.a - this.b >= 1000L) {
         this.b = System.currentTimeMillis();
         --this.a;
         if (this.a <= 0) {
            this.a = 60;
            --this.b;
         }
      }

      if (this.b < 0 && !this.a) {
         Char.all.removeElement(this);
      }

      if (this.b < 0 && this.a && !this.b) {
         GameSrc.i.removeElement(this);
      }

   }

   public final void a(byte var1, String var2, int var3) {
      if (var3 == -1) {
         this.b = true;
      } else {
         this.b = false;
      }

      this.a = true;
      this.b = var3 / 60;
      this.a = var3 % 60;
      this.a = var1;
      long var4 = System.currentTimeMillis();
      this.b = var4;
      this.a = var4;
      this.a = var2;
   }

   public final void a(int var1) {
      this.b = var1 / 60;
      this.a = var1 % 60;
      long var2 = System.currentTimeMillis();
      this.b = var2;
      this.a = var2;
      this.a = false;
   }

   public final void a(dm var1, int var2, int var3) {
      String var4 = this.b + "'";
      if (this.b <= 0) {
         var4 = this.a + "s";
      }

      if (this.b < 0) {
         var4 = "";
      }

      if (this.b) {
         var4 = "";
      }

      cg.c.a(var1, this.a + " " + var4, var2, var3, 0, cg.f);
   }
}
