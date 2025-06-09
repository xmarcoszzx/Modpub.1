package pasta;

public final class aw {
   private static aw a;

   public static aw a() {
      if (a == null) {
         a = new aw();
      }

      return a;
   }

   public static void a() {
      byte var0 = 0;
      String[] var1;
      String[] var2;
      String var3;
      if (!main.a.e) {
         var2 = new String[]{ab.bx, ab.by, ab.bA, null};
         var0 = 3;
         var3 = ab.bz;
         var1 = var2;
      } else {
         var1 = new String[2];
         String var5;
         if (GameSrc.y == 1) {
            var5 = ab.z;
         } else {
            var5 = ab.y;
         }

         var1[1] = var5;
         String var4;
         if (main.a.b) {
            var4 = ab.bx;
            String[] var6 = var1;
            var1 = var1;
            var2 = var6;
            var3 = var4;
         } else {
            var4 = ab.by;
            var2 = var1;
            var1 = var1;
            var3 = var4;
         }
      }

      var2[var0] = var3;
      Panel.d = var1;
   }

   public static void b() {
      at.a().b();
      main.a.a.B();
      main.a.a.f();
      main.a.a.a();
   }
}
