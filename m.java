package pasta;

public final class m {
   private static int a;
   private static String a = "";
   private static boolean a;
   private static int b;
   private static int c;

   public static void a() {
      a = 0;
      b = 0;
      a = false;
   }

   public static void a(dm var0, String var1, int var2, int var3, int var4, int var5, cg var6) {
      if (c != var6.a(var1) || !a.equals(var1)) {
         a = var1;
         a = 0;
         c = var6.a(var1);
         a = false;
         b = 0;
      }

      var0.f(var2, var3, var4, var5);
      if (c > var4) {
         var6.a(var0, var1, var2 - a, var3, 0);
      } else {
         var6.a(var0, var1, var2 + var4 / 2, var3, 2);
      }

      main.a.a(var0);
      if (c > var4) {
         if (!a) {
            var2 = b + 1;
            b = var2;
            if (var2 > 50) {
               var2 = a + 1;
               a = var2;
               if (var2 >= c) {
                  b = 0;
                  a = -var4 + 30;
                  a = true;
               }
            }
         } else {
            if (a < 0) {
               a += a + var4 >> 1;
            }

            if (a > 0) {
               a = 0;
            }

            if (a == 0) {
               var2 = b + 1;
               b = var2;
               if (var2 == 50) {
                  b = 0;
                  a = false;
               }
            }
         }
      }

   }
}
