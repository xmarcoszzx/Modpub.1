package pasta;

public final class di {
   public byte a;
   public int a;
   public String a;
   public short a;
   public int b;
   public String b;
   public short b;
   public int c;
   public String c;
   public short c;
   public int d;
   public int e;

   public static String a(int var0) {
      String var1;
      if (var0 == 0) {
         var1 = ab.ct;
      } else if (var0 == 1) {
         var1 = ab.cu;
      } else if (var0 == 2) {
         var1 = ab.cw;
      } else {
         var1 = "";
      }

      return var1;
   }
}
