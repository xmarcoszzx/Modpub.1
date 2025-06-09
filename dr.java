package pasta;

import javax.microedition.lcdui.Image;

public final class dr {
   private static int a;
   private static Image a = dz.b("/mainImage/myTexture2dmobCapcha.png");
   public static boolean a;
   private static int b;
   public static boolean b;
   private static int c;
   private static int d;
   private static int e;
   private static int f;
   private static int g;
   private static int h;
   private static int i = 0;
   private static int j;
   private static int k;
   private static int l;

   public static void a(dm var0, int var1, int var2) {
      int var3;
      if (!b) {
         if (main.a.g % 3 == 0) {
            if (Char.myCharz().i == 1) {
               e = var1 - 20 - GameSrc.k;
            }

            if (Char.myCharz().i == -1) {
               e = var1 + 20 - GameSrc.k;
            }
         }

         a = Char.myCharz().c - 40 - GameSrc.l;
      } else {
         var3 = i + 1;
         i = var3;
         if (var3 == 5) {
            b = false;
            i = 0;
         }

         e = var1 - GameSrc.k;
         a = var2 - GameSrc.l;
      }

      if (f > var1 - GameSrc.k) {
         l = -1;
      } else {
         l = 1;
      }

      var0.a(GameSrc.y, f, b - 40, 3);
      ar.a(var0, f - 25, b - 70, 50, 20, 16777215, false);
      int var10004 = b - 65;
      cg.f.a(var0, GameSrc.a().b, f, var10004, 2);
      if (a) {
         a = false;
         dh.a(new cx(18, f + GameSrc.k, b + GameSrc.l, 2, 10, -1));
         GameSrc.a().a = null;
         e = -GameSrc.k;
         a = -GameSrc.l;
      }

      Image var6 = a;
      var3 = k;
      byte var7;
      if (l == 1) {
         var7 = 0;
      } else {
         var7 = 2;
      }

      int var4 = f;
      int var5 = b;
      byte var8;
      if (main.a.g % 10 > 5) {
         var8 = 1;
      } else {
         var8 = 0;
      }

      var0.a(var6, 0, var3 * 40, 40, 40, var7, var4, var5 + 3 + var8, 3);
      if (b != a) {
         d = a - b << 2;
         c += d;
         b += c >> 4;
         c &= 15;
      }

      if (f != e) {
         h = e - f << 2;
         g += h;
         f += g >> 4;
         g &= 15;
      }

      var1 = j + 1;
      j = var1;
      if (var1 == 5) {
         j = 0;
         var1 = k + 1;
         k = var1;
         if (var1 > 2) {
            k = 0;
         }
      }

   }
}
