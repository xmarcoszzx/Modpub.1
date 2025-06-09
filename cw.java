package pasta;

import javax.microedition.lcdui.Image;

public final class cw implements ah {
   private int a;
   private long a;
   public cd a;
   private String[] a;
   private int b;
   private long b;
   private cd b;
   private int c = 120;
   private int d;
   private int e;

   public final void a() {
      if (this.a != null) {
         this.a = main.a.i - 5 - this.c;
         this.b = 45;
         if (main.a.i - 50 > this.c + 155) {
            this.a = main.a.i - 55 - this.c;
            this.b = 5;
         }

         this.a.b = this.a - 35;
         this.a.c = this.b;
         this.b = System.currentTimeMillis();
         (new StringBuffer("curr - last= ")).append(this.b - this.a);
         if (this.b - this.a >= 1000L) {
            this.a = System.currentTimeMillis();
            --this.e;
         }

         if (this.e == 0) {
            GameSrc.a().a = null;
         }
      }

   }

   public final void a(int var1, Object var2) {
   }

   public final void a(String var1, cd var2, cd var3) {
      this.a = new String[]{var1};
      this.d = 29;
      this.a = var2;
      this.b = var3;
      cd var4 = this.a;
      var3 = this.b;
      Image var5 = GameSrc.w;
      var3.a = var5;
      var4.a = var5;
      var3 = this.a;
      cd var6 = this.b;
      Image var7 = GameSrc.x;
      var6.b = var7;
      var3.b = var7;
      this.a.d = dm.a(var2.a);
      this.b.d = dm.a(var2.a);
      this.a.e = dm.b(var2.a);
      this.b.e = dm.b(var2.a);
      this.a = System.currentTimeMillis();
      this.e = this.a[0].length() / 3;
      if (this.e < 15) {
         this.e = 15;
      }

      m.a();
   }

   public final void a(dm var1) {
      int var5 = this.a;
      int var4 = this.b;
      int var3 = this.c;
      int var6 = this.d;
      byte var2;
      if (!main.a.e) {
         var2 = 10;
      } else {
         var2 = 0;
      }

      ar.a(var1, var5, var4, var3, var6 + var2, 16777215, false);
      if (this.a != null) {
         String var7 = this.a[0];
         var5 = this.a;
         var3 = this.b;
         var4 = this.d / 2;
         if (main.a.e) {
            var2 = 4;
         } else {
            var2 = 6;
         }

         m.a(var1, var7, var5 + 5, var3 + var4 - var2, this.c - 10, this.d, cg.k);
         int var9;
         if (main.a.e) {
            this.a.a(var1);
            cg var8 = cg.n;
            var7 = String.valueOf(this.e);
            var9 = this.a.b;
            var8.a(var1, var7, this.a.d / 2 + var9, this.a.c + this.a.e + 5, 2, cg.o);
         } else {
            cg var10;
            String var11;
            if (bf.b) {
               var10 = cg.b;
               var11 = ab.cb + this.e + ")";
               var9 = this.a;
               var10.a(var1, var11, this.c / 2 + var9, this.b + this.d, 2);
            } else {
               var10 = cg.b;
               var11 = ab.cc + this.e + ")";
               var9 = this.a;
               var10.a(var1, var11, this.c / 2 + var9, this.b + this.d, 2);
            }
         }
      }

   }
}
