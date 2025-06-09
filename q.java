package pasta;

public final class q {
   public static MyVector a = new MyVector("vClanImage");
   public static eh a = new eh("h id images");
   public int a;
   public String a;
   public short[] a;
   public int b;
   public int c;

   public static q a(byte var0) {
      int var1 = 0;

      q var2;
      while(true) {
         if (var1 >= a.size()) {
            var2 = null;
            break;
         }

         q var3 = (q)a.elementAt(var1);
         var2 = var3;
         if (var3.a == var0) {
            break;
         }

         ++var1;
      }

      return var2;
   }

   public static void a(q var0) {
      av var3 = av.a();
      byte var1 = (byte)var0.a;

      label162: {
         label161: {
            Message var2;
            label166: {
               Exception var24;
               label159: {
                  label158: {
                     try {
                        var2 = new Message((byte)-62);
                        break label158;
                     } catch (Exception var22) {
                        var24 = var22;
                     } finally {
                        ;
                     }

                     var2 = null;
                     break label159;
                  }

                  try {
                     var2.a().writeByte(var1);
                     var3.a.a(var2);
                     break label161;
                  } catch (Exception var20) {
                  } finally {
                     break label166;
                  }
               }

               try {
                  var24.printStackTrace();
               } finally {
                  break label166;
               }

               break label162;
            }

            var2.a();
            throw var0;
         }

      }

   }

   public static boolean a(int var0) {
      boolean var2 = false;

      for(int var1 = 0; var1 < a.size(); ++var1) {
         if (((q)a.elementAt(var1)).a == var0) {
            var2 = true;
            break;
         }
      }

      return var2;
   }
}
