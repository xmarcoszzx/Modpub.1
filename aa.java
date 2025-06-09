package pasta;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;

public final class aa {
   public ej[] a;

   public aa() {
   }

   public aa(int var1) {
      if (var1 == 0) {
         this.a = new ej[3];
      }

      if (var1 == 1) {
         this.a = new ej[17];
      }

      if (var1 == 2) {
         this.a = new ej[14];
      }

      if (var1 == 3) {
         this.a = new ej[2];
      }

   }

   public static int a(String var0) {
      byte[] var2 = a(var0);
      byte var1;
      if (var2 == null) {
         var1 = -1;
      } else {
         var1 = var2[0];
      }

      return var1;
   }

   public static String a(String var0) {
      byte[] var1 = a(var0);
      if (var1 == null) {
         var0 = null;
      } else {
         try {
            var0 = new String(var1, "UTF-8");
         } catch (Exception var2) {
            var0 = new String(var1);
         }
      }

      return var0;
   }

   public static void a() {
      Exception var10000;
      label39: {
         boolean var10001;
         String[] var2;
         try {
            var2 = RecordStore.listRecordStores();
         } catch (Exception var6) {
            var10000 = var6;
            var10001 = false;
            break label39;
         }

         if (var2 == null) {
            return;
         }

         int var0 = 0;

         while(true) {
            int var1;
            try {
               var1 = var2.length;
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
               break;
            }

            if (var0 >= var1) {
               return;
            }

            if (var2[var0] != null) {
               try {
                  StringBuffer var3 = new StringBuffer("name = ");
                  var3.append(var2[var0]);
                  RecordStore.deleteRecordStore(var2[var0]);
               } catch (Exception var4) {
                  var10000 = var4;
                  var10001 = false;
                  break;
               }
            }

            ++var0;
         }
      }

      Exception var7 = var10000;
      var7.printStackTrace();
   }

   public static void a(String var0) {
      for(int var1 = 0; var1 < RecordStore.listRecordStores().length; ++var1) {
         if (RecordStore.listRecordStores().equals(var0)) {
            try {
               RecordStore.deleteRecordStore(var0);
            } catch (RecordStoreNotFoundException var3) {
               var3.printStackTrace();
            } catch (RecordStoreException var4) {
               var4.printStackTrace();
            }
         }
      }

   }

   public static void a(String var0, int var1) {
      try {
         a(var0, new byte[]{(byte)var1});
      } catch (Exception var2) {
      }

   }

   public static void a(String var0, String var1) {
      try {
         a(var0, var1.getBytes("UTF-8"));
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public static void a(String param0, byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   public static byte[] a(String var0) {
      byte[] var4;
      byte[] var5;
      try {
         StringBuffer var1 = new StringBuffer("vj");
         RecordStore var2 = RecordStore.openRecordStore(var1.append(var0).toString(), false);
         var5 = var2.getRecord(1);
         var2.closeRecordStore();
         StringBuffer var6 = new StringBuffer("load rms ");
         var6.append(var0).append(" lent= ").append(var5.length);
      } catch (Exception var3) {
         (new StringBuffer("bi loi load ---------------------------------")).append(var0);
         var4 = null;
         return var4;
      }

      var4 = var5;
      return var4;
   }
}
