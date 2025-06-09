package pasta;

public final class dh {
   public static MyVector a = new MyVector("vEff");

   private static cx a(int var0) {
      int var1 = 0;

      cx var2;
      while(true) {
         if (var1 >= a.size()) {
            var2 = null;
            break;
         }

         cx var3 = (cx)a.elementAt(var1);
         var2 = var3;
         if (var3.a == var0) {
            break;
         }

         ++var1;
      }

      return var2;
   }

   public static void a() {
      for(int var0 = 0; var0 < a.size(); ++var0) {
         ((cx)a.elementAt(var0)).a();
      }

   }

   public static void a(int var0) {
      if (a(var0) != null) {
         a.removeElement(a(var0));
      }

   }

   public static void a(cx var0) {
      a.addElement(var0);
   }

   public static void a(dm var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         if (((cx)a.elementAt(var1)).h == 1) {
            ((cx)a.elementAt(var1)).a(var0);
         }
      }

   }

   public static void a(dm var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < a.size(); ++var4) {
         if (((cx)a.elementAt(var4)).h == -var3) {
            ((cx)a.elementAt(var4)).a(var0, var1, var2);
         }
      }

   }

   public static void b(dm var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         if (((cx)a.elementAt(var1)).h == 2) {
            ((cx)a.elementAt(var1)).a(var0);
         }
      }

   }

   public static void c(dm var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         if (((cx)a.elementAt(var1)).h == 3) {
            ((cx)a.elementAt(var1)).a(var0);
         }
      }

   }

   public static void d(dm var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         if (((cx)a.elementAt(var1)).h == 4) {
            ((cx)a.elementAt(var1)).a(var0);
         }
      }

   }
}
