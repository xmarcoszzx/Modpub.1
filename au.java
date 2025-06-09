package pasta;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import main.GameMidlet;

public final class au extends ag implements ah {
   public static byte a;
   public static int a;
   public static String a = "Vũ trụ 1....1.teamobi.com:14445:0,Vũ trụ 2....2.teamobi.com:14445:0,Vũ trụ 3....3.teamobi.com:14445:0,Vũ trụ 4....4.teamobi.com:14445:0,Vũ trụ 5....5.teamobi.com:14445:0,Vũ trụ 6....6.teamobi.com:14445:0,Vũ trụ 7....7.teamobi.com:14445:0,Võ đài liên vũ trụ....war.teamobi.com:20000:0,Universe 1.....indonaga.com:14445:1,0,6";
   public static boolean a;
   public static byte[] a;
   public static int[] a = new int[3];
   public static String[] a;
   public static short[] a;
   public static boolean[] a;
   public static int b;
   public static String b = "Vũ trụ 1:112.213.94.23:14445:0,Vũ trụ 2:210.211.109.199:14445:0,Vũ trụ 3:112.213.85.88:14445:0,Vũ trụ 4:27.0.12.164:14445:0,Vũ trụ 5:27.0.12.16:14445:0,Vũ trụ 6:27.0.12.173:14445:0,Vũ trụ 7:112.213.94.223:14445:0,Võ đài liên vũ trụ:27.0.12.173:20000:0,Universe 1:54.179.255.27:14445:1,0,6";
   public static boolean b;
   public static String[] b;
   public static int c;
   public static String c = "Vũ trụ 1:112.213.94.23:14445:0,Vũ trụ 2:210.211.109.199:14445:0,Vũ trụ 3:112.213.85.88:14445:0,Vũ trụ 4:27.0.12.164:14445:0,Vũ trụ 5:27.0.12.16:14445:0,Vũ trụ 6:27.0.12.173:14445:0,Vũ trụ 7:112.213.94.223:14445:0,Võ đài liên vũ trụ:27.0.12.173:20000:0,Universe 1:54.179.255.27:14445:1,0,6";
   public static boolean c;
   public static int d;
   public static String d;
   public static boolean d = false;
   private static cd e;
   public static boolean e;
   public static int i = -1;
   private static int j;
   private static int l;
   private static int m;
   private cd[] a;
   private cd d;
   private int k;

   public au() {
      System.getProperty("com.sonyericsson.imei");
      this.i();
      if (!main.a.e) {
         j = 0;
         this.j();
      }

      GameSrc.transMap(-1, -1);
      GameSrc.k = 100;
      GameSrc.l = 200;
      if (this.d == null) {
         this.d = new cd("Gọi hotline", this, 13, (Object)null);
         this.d.b = main.a.i - 75;
         if (dz.a == 1 && !main.a.e) {
            this.d.c = main.a.j - 20;
         } else {
            this.d.c = 8;
         }
      }

      if (dz.a == 1) {
         c = b;
      } else {
         c = a;
      }

   }

   public static void checkInfo(String var0) {
      byte var2 = 0;
      a = new int[3];
      String[] var8 = cq.a(var0.trim(), ",", 0);
      ab.a(Byte.parseByte(var8[var8.length - 2]));
      a = new String[var8.length - 2];
      b = new String[var8.length - 2];
      a = new short[var8.length - 2];
      a = new byte[var8.length - 2];
      a = new boolean[2];

      int var1;
      for(var1 = 0; var1 < var8.length - 2; ++var1) {
         String[] var4 = cq.a(var8[var1].trim(), ":", 0);
         a[var1] = var4[0];
         b[var1] = var4[1];
         a[var1] = Short.parseShort(var4[2]);
         a[var1] = Byte.parseByte(var4[3].trim());
         int[] var11 = a;
         byte var3 = a[var1];
         int var10002 = var11[var3]++;
      }

      a = Byte.parseByte(var8[var8.length - 1]);
      ByteArrayOutputStream var9 = new ByteArrayOutputStream();
      DataOutputStream var12 = new DataOutputStream(var9);

      label37: {
         Exception var10000;
         label47: {
            boolean var10001;
            try {
               var12.writeByte(ab.a);
               var12.writeByte(a.length);
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
               break label47;
            }

            var1 = var2;

            while(true) {
               try {
                  if (var1 >= a.length) {
                     var12.writeByte(a);
                     aa.a("NRlink", var9.toByteArray());
                     var12.close();
                     dl.e();
                     break label37;
                  }
               } catch (Exception var6) {
                  var10000 = var6;
                  var10001 = false;
                  break;
               }

               try {
                  var12.writeUTF(a[var1]);
                  var12.writeUTF(b[var1]);
                  var12.writeShort(a[var1]);
                  var12.writeByte(a[var1]);
               } catch (Exception var5) {
                  var10000 = var5;
                  var10001 = false;
                  break;
               }

               ++var1;
            }
         }

         Exception var10 = var10000;
         var10.printStackTrace();
      }

      main.a.f();
   }

   public static void e() {
      byte[] var3 = aa.a("NRlink");
      if (var3 == null) {
         checkInfo(c);
      } else {
         DataInputStream var4 = new DataInputStream(new ByteArrayInputStream(var3));

         IOException var10000;
         label43: {
            byte var1;
            boolean var10001;
            try {
               a = new int[3];
               ab.a(var4.readByte());
               var1 = var4.readByte();
               a = new String[var1];
               b = new String[var1];
               a = new short[var1];
               a = new byte[var1];
            } catch (IOException var7) {
               var10000 = var7;
               var10001 = false;
               break label43;
            }

            for(int var0 = 0; var0 < var1; ++var0) {
               byte var2;
               int[] var8;
               try {
                  a[var0] = var4.readUTF();
                  b[var0] = var4.readUTF();
                  a[var0] = var4.readShort();
                  a[var0] = var4.readByte();
                  var8 = a;
                  var2 = a[var0];
               } catch (IOException var6) {
                  var10000 = var6;
                  var10001 = false;
                  break label43;
               }

               int var10002 = var8[var2]++;
            }

            try {
               a = var4.readByte();
               var4.close();
               dl.e();
               return;
            } catch (IOException var5) {
               var10000 = var5;
               var10001 = false;
            }
         }

         IOException var9 = var10000;
         var9.printStackTrace();
      }

   }

   private void i() {
      String var3;
      label59: {
         this.k = 0;
         var3 = aa.a("acc");
         if (var3 == null) {
            if (aa.a("userAo" + a) == null) {
               break label59;
            }
         } else if (var3.equals("") && aa.a("userAo" + a) == null) {
            break label59;
         }

         this.k = 1;
      }

      int var1;
      if (dm.a > 1) {
         var1 = this.k + 3;
      } else {
         var1 = this.k + 4;
      }

      this.a = new cd[var1];
      int var2 = main.a.l - this.a.length * 15 + 28;

      for(var1 = 0; var1 < this.a.length; ++var1) {
         switch(var1) {
         case 0:
            this.a[0] = new cd("", this, 3, (Object)null);
            if (var3 == null) {
               this.a[0].a = ab.fh;
               if (aa.a("userAo" + a) != null) {
                  this.a[0].a = ab.k;
               }
            } else if (var3.equals("")) {
               this.a[0].a = ab.fh;
               if (aa.a("userAo" + a) != null) {
                  this.a[0].a = ab.k;
               }
            } else {
               this.a[0].a = ab.fi + ": " + var3;
               if (this.a[0].a.length() > 23) {
                  this.a[0].a = this.a[0].a.substring(0, 23);
                  cd var4 = this.a[0];
                  var4.a = var4.a + "...";
               }
            }
            break;
         case 1:
            if (this.k == 1) {
               this.a[1] = new cd("", this, 10100, (Object)null);
               this.a[1].a = ab.fh;
            } else {
               this.a[1] = new cd(ab.L, this, 7, (Object)null);
            }
            break;
         case 2:
            if (this.k == 1) {
               this.a[2] = new cd(ab.L, this, 7, (Object)null);
            } else {
               this.a[2] = new cd("", this, 5, (Object)null);
            }
            break;
         case 3:
            if (this.k == 1) {
               this.a[3] = new cd("", this, 5, (Object)null);
            } else {
               this.a[3] = new cd(ab.bw, this, 8, (Object)null);
            }
            break;
         case 4:
            this.a[4] = new cd(ab.bw, this, 8, (Object)null);
         }

         this.a[var1].c = var2;
         this.a[var1].b();
         this.a[var1].b = (main.a.i - this.a[var1].d) / 2;
         var2 += 30;
      }

   }

   private void j() {
      (new StringBuffer("load Screen= ")).append(e).append(" select= ").append(j);
      if (e) {
         super.b = new cd("", this, this.a[j].a, (Object)null);
      } else {
         super.b = e;
      }

   }

   private void k() {
      m = 30;
      main.a.b(ab.ar);
      if (at.a().a()) {
         at.a().b();
      }

      GameMidlet.a = b[a];
      GameMidlet.b = a[a];
      if (a[a] != ab.a) {
         ab.a(a[a]);
      }

      ek.a = a[a];
      this.i();
      main.a.b();
   }

   public static void onCancelChat() {
      checkInfo(c);
   }

   public final void a() {
      main.a.b();
      GameSrc.l = 0;
      GameSrc.k = 0;
      this.i();
      main.a.a = null;
      String var2 = aa.a("ResVersion");
      int var1;
      if (var2 != null && var2 != "") {
         var1 = Integer.parseInt(var2);
      } else {
         var1 = -1;
      }

      if (var1 > 0) {
         e = true;
         main.a.a(0);
      }

      c = true;
      this.a[this.k + 2].a = ab.aA + ": " + a[a];
      super.b = new cd("", this, this.a[j].a, (Object)null);
      this.a[this.k + 1].a = ab.L;
      if (this.a.length == this.k + 4) {
         this.a[this.k + 3].a = ab.bw;
      }

      super.a();
   }

   public final void a(int var1, Object var2) {
      (new StringBuffer("perform ")).append(var1);
      if (var1 == 1000) {
         main.a.b();
      }

      if (var1 == 1 || var1 == 4) {
         this.g();
      }

      if (var1 == 2) {
         a = false;
         cd var5 = new cd(ab.ff, this, 4, (Object)null);
         e = var5;
         var5.b = main.a.i / 2 - ag.f / 2;
         e.c = main.a.l + 65;
         super.c = null;
         if (!main.a.e) {
            e.b = main.a.i / 2 - ag.f / 2;
            e.c = main.a.j - ag.g - 1;
         }

         super.b = new cd("", this, 4, (Object)null);
         if (!d) {
            av.a().c((byte)1);
            if (!main.a.e) {
               e.b = true;
               super.b = new cd("", this, 4, (Object)null);
            }

            d = true;
         }
      }

      boolean var3;
      String var6;
      if (var1 == 3) {
         if (main.a.a == null) {
            main.a.a = new ek();
         }

         main.a.a.a();
         if (aa.a("acc") == null) {
            var3 = false;
         } else if (aa.a("acc").equals("")) {
            var3 = false;
         } else {
            var3 = true;
         }

         boolean var4;
         if (aa.a("userAo" + a) == null) {
            var4 = false;
         } else if (aa.a("userAo" + a).equals("")) {
            var4 = false;
         } else {
            var4 = true;
         }

         if (!var3 && !var4) {
            main.a.b();
            var6 = aa.a("userAo" + a);
            if (var6 != null && !var6.equals("")) {
               main.a.a.g = true;
               main.a.b();
               av.a().c();
               av.a().a(var6, "", "1.9.8", (byte)1);
            } else {
               av.a().d("");
            }

            main.a.g();
         } else {
            main.a.a.onCancelChat();
         }

         ek.a = a[a];
      }

      if (var1 == 10100) {
         if (main.a.a == null) {
            main.a.a = new ek();
         }

         main.a.a.a();
         main.a.b();
         av.a().d("");
         main.a.g();
         ek.a = a[a];
      }

      MyVector var7;
      if (var1 == 5) {
         onCancelChat();
         if (a.length == 1) {
            return;
         }

         var7 = new MyVector("");

         for(int var8 = 0; var8 < a.length; ++var8) {
            var7.addElement(new cd(a[var8], this, 6, (Object)null));
         }

         main.a.a.b(var7);
         if (!main.a.e) {
            main.a.a.a = a;
         }
      }

      if (var1 == 6) {
         a = main.a.a.a;
         this.k();
      }

      if (var1 == 7) {
         if (main.a.a == null) {
            main.a.a = new ek();
         }

         main.a.a.a();
      }

      if (var1 == 8) {
         if (aa.a("lowGraphic") == 1) {
            var3 = true;
         } else {
            var3 = false;
         }

         var7 = new MyVector("cau hinh");
         var7.addElement(new cd(ab.s, this, 9, (Object)null));
         var7.addElement(new cd(ab.t, this, 10, (Object)null));
         main.a.a.b(var7);
         if (var3) {
            main.a.a.a = 0;
         } else {
            main.a.a.a = 1;
         }
      }

      if (var1 == 9) {
         aa.a("lowGraphic", 1);
         main.a.a(ab.cd, (int)8885);
      }

      if (var1 == 10) {
         aa.a("lowGraphic", 0);
         main.a.a(ab.cd, (int)8885);
      }

      if (var1 == 11) {
         if (main.a.a == null) {
            main.a.a = new ek();
         }

         main.a.a.a();
         var6 = aa.a("userAo" + a);
         if (var6 != null && !var6.equals("")) {
            main.a.a.g = true;
            main.a.b();
            av.a().c();
            av.a().a(var6, "", "1.9.8", (byte)1);
         } else {
            av.a().d("");
         }

         main.a.b(ab.ar);
      }

      if (var1 == 12) {
         GameMidlet.e.a();
      }

      if (var1 == 13 && (!d || e)) {
         switch(dz.a) {
         case 1:
            dz.a();
         }
      }

   }

   public final void a(dm var1) {
      if (!e) {
         var1.a(0);
         var1.e(0, 0, main.a.i, main.a.j);
      } else {
         main.a.b(var1);
      }

      pasta.c.b(var1);
      cg.s.a(var1, "v2.4.0", main.a.i - 2, 17, 1, cg.o);
      if (d && !e) {
         cg.s.a(var1, d, main.a.i - 2, 2, 1, cg.o);
      } else if (dz.a == 1 && !main.a.e) {
         cg.s.a(var1, d, main.a.i - 2, main.a.j - 15, 1, cg.o);
      } else {
         cg.s.a(var1, d, main.a.i - 2, 2, 1, cg.o);
      }

      if (main.a.a == null) {
         if (!e) {
            if (!c) {
               var1.a(ek.a, main.a.k, main.a.l - 32, 3);
               if (!d) {
                  cg.c.a(var1, ab.fe, main.a.k, main.a.l + 24, 2);
                  if (e != null) {
                     e.a(var1);
                  }
               } else {
                  if (e != null) {
                     e.a(var1);
                  }

                  var1.f(0, 0, main.a.i, main.a.j);
                  cg.c.a(var1, ab.at + b + "%", main.a.i / 2, main.a.l + 24, 2);
                  GameSrc.a(GameSrc.e, GameSrc.f, GameSrc.g, (float)(main.a.i / 2 - 50), (float)(main.a.l + 45), 100.0F, var1);
                  GameSrc.a(GameSrc.b, GameSrc.c, GameSrc.d, (float)(main.a.i / 2 - 50), (float)(main.a.l + 45), (float)b, var1);
               }
            }
         } else {
            int var3 = main.a.l - this.a.length * 15 - 15;
            int var2 = var3;
            if (var3 < 25) {
               var2 = 25;
            }

            if (ek.a != null) {
               var1.a(ek.a, main.a.k, var2, 3);
            }

            for(var2 = 0; var2 < this.a.length; ++var2) {
               this.a[var2].a(var1);
            }

            var1.f(0, 0, main.a.i, main.a.j);
            if (i == -1) {
               if (main.a.g % 20 > 10) {
                  var1.a(GameSrc.a, 0, 14, 7, 7, 0, (main.a.i - cg.f.a(this.a[this.k + 2].a) >> 1) - 10, this.a[this.k + 2].c + 10, 0);
               }
            } else {
               var1.a(GameSrc.a, 0, i * 7, 7, 7, 0, (main.a.i - cg.f.a(this.a[this.k + 2].a) >> 1) - 10, this.a[this.k + 2].c + 9, 0);
            }
         }
      }

   }

   public final void b() {
      int var1;
      if (b) {
         var1 = l + 1;
         l = var1;
         if (var1 == 50) {
            au var2 = main.a.a;
            m = 30;
            main.a.b(ab.ar);
            GameMidlet.a = null;
            GameMidlet.b = 0;
            var2.i();
            main.a.a((String)null, (short)0);
         }

         if (l >= 100 && at.a().a()) {
            if (main.a.a == null) {
               main.a.a = new ek();
            }

            main.a.a.onCancelChat();
            av.a().q();
            b = false;
         }
      }

      if (m > 0) {
         var1 = m - 1;
         m = var1;
         if (var1 == 0) {
            main.a.f();
         }
      }

      for(var1 = 0; var1 < this.a.length; ++var1) {
         if (var1 == j) {
            this.a[var1].b = true;
         } else {
            this.a[var1].b = false;
         }
      }

      ++GameSrc.k;
      if (!e && (c || b == 100)) {
         e = null;
      }

      super.b();
   }

   public final void c() {
      int var1 = 0;
      if (main.a.e) {
         if (this.d != null && this.d.a()) {
            this.d.a();
         }

         if (!e) {
            if (e != null && e.a()) {
               e.a();
            }

            super.c();
            return;
         }

         for(; var1 < this.a.length; ++var1) {
            if (this.a[var1] != null && this.a[var1].a()) {
               this.a[var1].a();
            }
         }
      } else {
         if (dz.a == 1 && main.a.a[13]) {
            main.a.a[13] = false;
            this.d.a();
         }

         if (e) {
            int var2;
            if (main.a.a[8]) {
               var2 = this.a.length;
               main.a.a[8] = false;
               var1 = j + 1;
               j = var1;
               if (var1 > var2 - 1) {
                  j = 0;
               }

               this.j();
            }

            if (main.a.a[2]) {
               var1 = this.a.length;
               main.a.a[2] = false;
               var2 = j - 1;
               j = var2;
               if (var2 < 0) {
                  j = var1 - 1;
               }

               this.j();
            }
         }
      }

      super.c();
   }

   public final void f() {
      GameSrc.l = 0;
      GameSrc.k = 0;
      this.i();
      main.a.a = null;
      String var2 = aa.a("ResVersion");
      int var1;
      if (var2 != null && var2 != "") {
         var1 = Integer.parseInt(var2);
      } else {
         var1 = -1;
      }

      if (var1 > 0) {
         e = true;
         main.a.a(0);
      }

      c = true;
      this.a[this.k + 2].a = ab.aA + ": " + a[a];
      super.b = new cd("", this, this.a[j].a, (Object)null);
      this.a[this.k + 1].a = ab.L;
      if (this.a.length == this.k + 4) {
         this.a[this.k + 3].a = ab.bw;
      }

      super.a();
   }

   public final void g() {
      if (main.a.a == null) {
         main.a.a = new au();
      }

      d = 0;
      b = 0;
      a = true;
      main.a.a.h();
      d = false;
      e.b = true;
      super.b = new cd("", this, 2, (Object)null);
   }

   public final void h() {
      GameSrc.k = 0;
      GameSrc.l = 0;
      this.i();
      e = false;
      b = 0;
      c = false;
      d = false;
      d = 0;
      if (!e) {
         cd var1 = new cd(ab.fg, this, 2, (Object)null);
         e = var1;
         var1.b = true;
         e.b = main.a.i / 2 - ag.f / 2;
         e.c = main.a.l + 45;
         if (e.c > main.a.j - 26) {
            e.c = main.a.j - 26;
         }
      }

      if (!main.a.e) {
         j = 0;
         this.j();
      }

      super.a();
   }
}
