package pasta;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class ei {
   public static MyVector a = new MyVector("");
   private static MyVector b = new MyVector("");
   private byte a;
   public String a;

   public ei(String var1, byte var2) {
      this.a = var1;
      this.a = var2;
   }

   private static byte a(String var0) {
      int var2 = 0;

      byte var1;
      while(true) {
         if (var2 >= b.size()) {
            var1 = -1;
            break;
         }

         if (var0.equals(((ei)b.elementAt(var2)).a)) {
            var1 = ((ei)b.elementAt(var2)).a;
            break;
         }

         ++var2;
      }

      return var1;
   }

   public static void a() {
      byte var1 = 0;
      MyVector var3 = new MyVector("");
      byte[] var4 = aa.a("ImageSource");
      if (var4 == null) {
         av.a().a(var3);
      } else {
         b = new MyVector("");
         DataInputStream var5 = new DataInputStream(new ByteArrayInputStream(var4));

         int var0;
         label64: {
            IOException var10000;
            label70: {
               short var2;
               byte[] var6;
               String[] var7;
               boolean var10001;
               try {
                  var2 = var5.readShort();
                  var7 = new String[var2];
                  var6 = new byte[var2];
               } catch (IOException var11) {
                  var10000 = var11;
                  var10001 = false;
                  break label70;
               }

               for(var0 = 0; var0 < var2; ++var0) {
                  try {
                     var7[var0] = var5.readUTF();
                     var6[var0] = var5.readByte();
                     MyVector var12 = b;
                     ei var8 = new ei(var7[var0], var6[var0]);
                     var12.addElement(var8);
                  } catch (IOException var10) {
                     var10000 = var10;
                     var10001 = false;
                     break label70;
                  }
               }

               try {
                  var5.close();
                  break label64;
               } catch (IOException var9) {
                  var10000 = var9;
                  var10001 = false;
               }
            }

            IOException var13 = var10000;
            var13.printStackTrace();
         }

         (new StringBuffer("vS size= ")).append(a.size()).append(" vRMS size= ").append(b.size());

         ei var14;
         for(var0 = 0; var0 < a.size(); ++var0) {
            var14 = (ei)a.elementAt(var0);
            if (!a(var14.a)) {
               var3.addElement(var14);
            }
         }

         for(var0 = var1; var0 < b.size(); ++var0) {
            var14 = (ei)b.elementAt(var0);
            if (a(var14.a) != b(var14.a)) {
               var3.addElement(var14);
            }
         }

         av.a().a(var3);
      }

   }

   private static boolean a(String var0) {
      boolean var2 = false;

      for(int var1 = 0; var1 < b.size(); ++var1) {
         if (var0.equals(((ei)b.elementAt(var1)).a)) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   private static byte b(String var0) {
      int var2 = 0;

      byte var1;
      while(true) {
         if (var2 >= a.size()) {
            var1 = -1;
            break;
         }

         if (var0.equals(((ei)a.elementAt(var2)).a)) {
            var1 = ((ei)a.elementAt(var2)).a;
            break;
         }

         ++var2;
      }

      return var1;
   }

   public static void b() {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(var1);

      Exception var10000;
      label38: {
         boolean var10001;
         try {
            var2.writeShort(a.size());
         } catch (Exception var5) {
            var10000 = var5;
            var10001 = false;
            break label38;
         }

         int var0 = 0;

         while(true) {
            try {
               if (var0 >= a.size()) {
                  aa.a("ImageSource", var1.toByteArray());
                  var2.close();
                  return;
               }
            } catch (Exception var4) {
               var10000 = var4;
               var10001 = false;
               break;
            }

            try {
               var2.writeUTF(((ei)a.elementAt(var0)).a);
               var2.writeByte(((ei)a.elementAt(var0)).a);
            } catch (Exception var3) {
               var10000 = var3;
               var10001 = false;
               break;
            }

            ++var0;
         }
      }

      Exception var6 = var10000;
      var6.printStackTrace();
   }
}
