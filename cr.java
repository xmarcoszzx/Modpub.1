package pasta;

import java.util.Random;
import java.util.Vector;

public final class cr {
   private static int a;
   private static long a = 0L;
   private static Random a = new Random();
   private static Vector a = new Vector();
   private static boolean a = false;
   private static int[] a = new int[3];
   private static int b;
   private static long b = 150L;
   private static int[] b = new int[3];
   private static int c;
   private static int d;
   private static int e;
   private static int f;

   private static void a() {
      f = 16;
      e = 0;

      for(int var0 = 0; var0 < 3; ++var0) {
         b[var0] = 0;
         a[var0] = 0;
      }

      a = true;
   }

   public static void a(dm var0) {
      if (a) {
         b[2] = b[1];
         a[2] = a[1];
         b[1] = b[0];
         a[1] = a[0];
         b[0] = b;
         a[0] = a;
         a = (int)(Math.cos((double)c * 3.141592653589793D / 180.0D) * (double)f * (double)e);
         b = (int)((double)f * Math.sin((double)c * 3.141592653589793D / 180.0D) * (double)e - (double)(0.0F * (float)e * (float)e / 2.0F));
         if (System.currentTimeMillis() - a >= b) {
            ++e;
            a = System.currentTimeMillis();
         }
      }

      if (e > 32 && a) {
         a = false;
         a.removeAllElements();
         a.addElement(new e(cq.b(50, main.a.i - 50), cq.b(main.a.j - 100, main.a.j)));
      }

      var0.a(0);
      var0.e(0, 0, 0, 0);
      var0.a(16711680);

      int var1;
      for(var1 = 0; var1 < a.size(); ++var1) {
         e var4 = (e)a.elementAt(var1);

         for(int var2 = 0; var2 < var4.a.size(); ++var2) {
            p var5 = (p)var4.a.elementAt(var2);
            if (var5.f < -200) {
               var4.a.removeElementAt(var2);
            }

            p.a(var0, var5.a - var5.e, var5.b - var5.f, var5.j);

            for(int var3 = 0; var3 < 2; ++var3) {
               p.a(var0, var5.a - var5.a[var3], var5.b - var5.b[var3], var5.j);
            }

            if (var5.a && System.currentTimeMillis() - var5.a >= var5.b) {
               ++var5.i;
               var5.a = System.currentTimeMillis();
               var5.a[1] = var5.a[0];
               var5.b[1] = var5.b[0];
               var5.a[0] = var5.e;
               var5.b[0] = var5.f;
               var5.e = (int)(Math.cos((double)var5.h * 3.141592653589793D / 180.0D) * (double)var5.c * (double)var5.i) + var5.d;
               var5.f = (int)((double)var5.c * Math.sin((double)var5.h * 3.141592653589793D / 180.0D) * (double)var5.i - (double)(var5.a * (float)var5.i * (float)var5.i / 2.0F)) + var5.g;
            }
         }
      }

      if (!a) {
         var1 = -(Math.abs(a.nextInt() % 3) + 5);
         if (var1 == -5 && !a) {
            d = 0;
            c = 80;
            a = true;
            a();
         } else if (var1 == -7 && !a) {
            c = 60;
            d = 0;
            a = true;
            a();
         } else if (var1 == -6 && !a) {
            c = 120;
            d = 0;
            a = true;
            a();
         }
      }

   }
}
