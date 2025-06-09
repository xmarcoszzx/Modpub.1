package pasta;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class at implements ca {
   private static at a = new at();
   private static at b = new at();
   private static int c;
   public static boolean e;
   private byte a;
   public int a;
   long a;
   public DataInputStream a;
   private DataOutputStream a;
   public String a;
   public Thread a;
   private ad a;
   public aj a;
   private final ct a = new ct(this);
   public boolean a = true;
   public byte[] a = null;
   private byte b;
   public int b;
   private Thread b;
   public boolean b;
   public boolean c;
   boolean d;

   private byte a(byte var1) {
      byte[] var4 = this.a;
      byte var3 = this.b;
      this.b = (byte)(var3 + 1);
      byte var2 = (byte)(var4[var3] & 255 ^ var1 & 255);
      if (this.b >= this.a.length) {
         this.b = (byte)(this.b % this.a.length);
      }

      return var2;
   }

   static byte a(at var0, byte var1) {
      byte[] var4 = var0.a;
      byte var3 = var0.a;
      var0.a = (byte)(var3 + 1);
      byte var2 = (byte)(var4[var3] & 255 ^ var1 & 255);
      if (var0.a >= var0.a.length) {
         var0.a = (byte)(var0.a % var0.a.length);
      }

      return var2;
   }

   static ad a(at var0) {
      return var0.a;
   }

   public static at a() {
      return a;
   }

   static ct a(at var0) {
      return var0.a;
   }

   static void a(at var0) {
      var0.c();
   }

   static void a(at var0, DataOutputStream var1) {
      var0.a = var1;
   }

   static void a(at var0, Message var1) {
      var0.b(var1);
   }

   static void a(at var0, ad var1) {
      var0.a = var1;
   }

   public static at b() {
      return b;
   }

   private void b(Message param1) {
      // $FF: Couldn't be decompiled
   }

   private void c() {
      this.a = null;
      this.a = 0;
      this.b = 0;

      try {
         this.b = false;
         this.c = false;
         if (this.a != null) {
            this.a.a();
            this.a = null;
         }

         if (this.a != null) {
            this.a.close();
            this.a = null;
         }

         if (this.a != null) {
            this.a.close();
            this.a = null;
         }

         this.a = null;
         if (this.a) {
            au.i = 0;
         }

         System.gc();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public final void a() {
      ct.a(this.a).removeAllElements();
   }

   public final void a(String var1, int var2) {
      System.out.println("Connect to : ip = " + var1 + "-- port = " + var2);
      if (!this.b && !this.c) {
         if (this.a) {
            au.i = -1;
         }

         this.d = false;
         this.a = null;
         this.b = new Thread(new bi(this, var1, var2));
         this.b.start();
      }

   }

   public final void a(Message var1) {
      ++c;
      (new StringBuffer("SEND MSG: ")).append(var1.a);
      this.a.a(var1);
   }

   public final void a(aj var1) {
      this.a = var1;
   }

   public final boolean a() {
      return this.b;
   }

   public final void b() {
      this.c();
   }
}
