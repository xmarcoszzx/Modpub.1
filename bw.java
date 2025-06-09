package pasta;

import javax.microedition.lcdui.Image;

public final class bw {
   public static int a;
   private static Image[] a = new Image[6];
   private static int b = 15787715;

   static {
      for(int var0 = 0; var0 < a.length; ++var0) {
         a[var0] = dz.b("/mainImage/myTexture2dgoc" + (var0 + 1) + ".png");
      }

      a = 24;
      dz.b("/mainImage/myTexture2dcheck.png");
   }

   public static void a(int var0, int var1, int var2, int var3, dm var4) {
      var4.a(9340251);
      var4.d(var0 + 18, var1, (var2 - 36) / 2 - 32, var3);
      var4.d(var0 + 18 + (var2 - 36) / 2 + 32, var1, (var2 - 36) / 2 - 22, var3);
      var4.d(var0, var1 + 8, var2, var3 - 17);
      var4.a(b);
      var4.e(var0 + 18, var1 + 3, (var2 - 36) / 2 - 32, var3 - 4);
      var4.e(var0 + 18 + (var2 - 36) / 2 + 31, var1 + 3, (var2 - 38) / 2 - 22, var3 - 4);
      var4.e(var0 + 1, var1 + 6, var2 - 1, var3 - 11);
      var4.a(14667919);
      var4.e(var0 + 18, var1 + 1, (var2 - 36) / 2 - 32, 2);
      var4.e(var0 + 18 + (var2 - 36) / 2 + 32, var1 + 1, (var2 - 36) / 2 - 12, 2);
      var4.e(var0 + 18, var1 + var3 - 2, (var2 - 36) / 2 - 31, 2);
      var4.e(var0 + 18 + (var2 - 36) / 2 + 32, var1 + var3 - 2, (var2 - 36) / 2 - 31, 2);
      var4.e(var0 + 1, var1 + 11, 2, var3 - 18);
      var4.e(var0 + var2 - 2, var1 + 11, 2, var3 - 18);
      var4.a(a[0], var0 - 3, var1 - 2, 20);
      var4.a(a[2], var0 + var2 + 3, var1 - 2, bk.b);
      var4.a(a[1], var0 - 3, var1 + var3 + 3, bk.d);
      var4.a(a[3], var0 + var2 + 4, var1 + var3 + 2, bk.e);
      var4.a(a[4], var2 / 2 + var0, var1, bk.a);
      var4.a(a[5], var2 / 2 + var0, var1 + var3 + 1, bk.c);
   }

   public static void a(dm var0, int var1, int var2, int var3, String[] var4) {
      b(var1, var2, var3, 69, var0);
      int var5 = var2 + 20 - cg.t.a();

      for(var2 = 0; var2 < var4.length; ++var2) {
         cg.t.a(var0, var4[var2], var1 + var3 / 2, var5, 2);
         var5 += cg.t.a();
      }

   }

   public static void a(dm var0, cd var1, cd var2, cd var3) {
      boolean var4 = main.a.e;
      cg var6 = cg.f;
      if (var1 != null && var6.a(var1.a) > 0) {
         if (var1.b >= 0 && var1.c > 0) {
            var1.a(var0);
         } else {
            Image var5;
            if (ag.h == 0) {
               var5 = GameSrc.l;
            } else {
               var5 = GameSrc.k;
            }

            var0.a(var5, 1, main.a.j - ag.g - 1, 0);
            var6.a(var0, var1.a, 35, main.a.j - ag.g + 3 + 3, 2);
         }
      }

      Image var7;
      if (var2 != null && var6.a(var2.a) > 0) {
         if (var2.b > 0 && var2.c > 0) {
            var2.a(var0);
         } else {
            if (ag.h == 1) {
               var7 = GameSrc.l;
            } else {
               var7 = GameSrc.k;
            }

            var0.a(var7, main.a.k - 35, main.a.j - ag.g - 1, 0);
            var6.a(var0, var2.a, main.a.k, main.a.j - ag.g + 3 + 3, 2);
         }
      }

      if (var3 != null && var6.a(var3.a) > 0) {
         if (var3.b > 0 && var3.c > 0) {
            var3.a(var0);
         } else {
            if (ag.h == 2) {
               var7 = GameSrc.l;
            } else {
               var7 = GameSrc.k;
            }

            var0.a(var7, main.a.i - 71, main.a.j - ag.g - 1, 0);
            var6.a(var0, var3.a, main.a.i - 35, main.a.j - ag.g + 3 + 3, 2);
         }
      }

   }

   public static void b(int var0, int var1, int var2, int var3, dm var4) {
      var4.a(13524492);
      var4.d(var0 + 6, var1, var2 - 12, var3);
      var4.d(var0, var1 + 6, var2, var3 - 12);
      var4.d(var0 + 7, var1 + 1, var2 - 14, var3 - 2);
      var4.d(var0 + 1, var1 + 7, var2 - 2, var3 - 14);
      var4.a(14338484);
      var4.e(var0 + 8, var1 + 2, var2 - 16, var3 - 3);
      var4.e(var0 + 2, var1 + 8, var2 - 3, var3 - 14);
      var4.a(main.a.d[2], var0, var1, 20);
      var4.a(main.a.d[2], 0, 0, 16, 16, 2, var0 + var2 + 1, var1, bk.b);
      var4.a(main.a.d[2], 0, 0, 16, 16, 1, var0, var1 + var3 + 1, bk.d);
      var4.a(main.a.d[2], 0, 0, 16, 16, 3, var0 + var2 + 1, var1 + var3 + 1, bk.e);
   }

   public static void c(int var0, int var1, int var2, int var3, dm var4) {
      var4.a(6702080);
      var4.e(var0, var1, var2, var3);
      var4.a(14338484);
      var4.e(var0 + 1, var1 + 1, var2 - 2, var3 - 2);
   }
}
