package pasta;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import javax.microedition.lcdui.Image;

public final class x {
   public static eh a = new eh("h ImgByName");

   private static ap a(String var0) {
      Object var1 = null;
      byte[] var2 = aa.a(dm.a + "ImgByName_" + var0);
      ap var4;
      if (var2 == null) {
         var4 = (ap)var1;
      } else {
         try {
            var4 = new ap();
            var4.a = var2[0];
            var4.a = Image.createImage(var2, 1, var2.length);
         } catch (Exception var3) {
            var4 = (ap)var1;
         }
      }

      return var4;
   }

   public static ap a(String param0, eh param1) {
      // $FF: Couldn't be decompiled
   }

   public static void a(String var0, byte var1, byte[] var2) {
      String var4 = dm.a + "ImgByName_" + var0;
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var8 = new DataOutputStream(var3);

      Exception var10000;
      label38: {
         boolean var10001;
         try {
            var8.writeByte(var1);
         } catch (Exception var7) {
            var10000 = var7;
            var10001 = false;
            break label38;
         }

         int var10 = 0;

         while(true) {
            try {
               if (var10 >= var2.length) {
                  aa.a(var4, var3.toByteArray());
                  var8.close();
                  return;
               }
            } catch (Exception var6) {
               var10000 = var6;
               var10001 = false;
               break;
            }

            try {
               var8.writeByte(var2[var10]);
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
               break;
            }

            ++var10;
         }
      }

      Exception var9 = var10000;
      var9.printStackTrace();
   }

   public static void a(String var0, Image var1, byte var2) {
      a.put(var0, new ap(var1, var2));
   }

   public static void a(eh var0) {
      MyVector var2 = new MyVector("checkDelHash");
      Enumeration var4 = var0.keys();

      while(var4.hasMoreElements()) {
         String var5 = (String)var4.nextElement();
         ap var3 = (ap)var0.get(var5);
         if (main.a.a / 1000L - var3.a > 600L) {
            var2.addElement(var5);
         }
      }

      for(int var1 = 0; var1 < var2.size(); ++var1) {
         var0.remove((String)var2.elementAt(var1));
      }

   }
}
