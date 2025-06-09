package pasta;

import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class dz {
   public static int a = 1;
   public static String a;
   private static Image a = b("/mainImage/black.png");

   public static long a() {
      return System.currentTimeMillis();
   }

   public static Image a(String var0) {
      String var2 = "/x" + dm.a + var0;
      (new StringBuffer("path load rms= ")).append(var0);
      Image var1 = aq.a(var0);
      Image var3 = var1;
      if (var1 == null) {
         String[] var4 = cq.a(cq.a(var2, ".", 0)[0], "/", 0);
         byte[] var5 = aa.a("x" + dm.a + var4[var4.length - 1]);
         var3 = var1;
         if (var5 != null) {
            var3 = Image.createImage(var5, 0, var5.length);
         }
      }

      return var3;
   }

   public static ce a(String var0) {
      Object var3 = null;
      ap var4 = x.a(var0, x.a);
      ce var5 = (ce)var3;
      if (var4.a != null) {
         int var2 = var4.a.getHeight() / var4.a;
         int var1 = var2;
         if (var2 <= 0) {
            var1 = 1;
         }

         var5 = new ce(var4.a, var4.a.getWidth(), var1);
      }

      return var5;
   }

   public static void a() {
      try {
         GameMidlet.e.platformRequest(au.d);
      } catch (ConnectionNotFoundException var1) {
         var1.printStackTrace();
      }

   }

   public static void a(dm var0) {
      for(int var1 = 0; var1 < 5; ++var1) {
         if (GameSrc.l[var1] != -1 && main.a.a(GameSrc.j[var1], GameSrc.k[var1])) {
            if (GameSrc.m[var1] == 0) {
               cg.u.a(var0, GameSrc.c[var1], GameSrc.j[var1], GameSrc.k[var1]);
            } else if (GameSrc.m[var1] == 1) {
               cg.v.a(var0, GameSrc.c[var1], GameSrc.j[var1], GameSrc.k[var1]);
            } else if (GameSrc.m[var1] == 2) {
               cg.w.a(var0, GameSrc.c[var1], GameSrc.j[var1], GameSrc.k[var1]);
            } else if (GameSrc.m[var1] == 3) {
               cg.v.a(var0, GameSrc.c[var1], GameSrc.j[var1], GameSrc.k[var1], cg.w);
            } else if (GameSrc.m[var1] == 8) {
               cg.r.a(var0, GameSrc.c[var1], GameSrc.j[var1], GameSrc.k[var1], cg.f);
            } else if (GameSrc.m[var1] == 4) {
               cg.s.a(var0, GameSrc.c[var1], GameSrc.j[var1], GameSrc.k[var1], cg.o);
            } else if (GameSrc.m[var1] == 5) {
               cg.x.a(var0, GameSrc.c[var1], GameSrc.j[var1], GameSrc.k[var1]);
            } else if (GameSrc.m[var1] == 6) {
               cg.v.a(var0, GameSrc.c[var1], GameSrc.j[var1], GameSrc.k[var1], cg.u);
            } else if (GameSrc.m[var1] == 7) {
               cg.c.a(var0, GameSrc.c[var1], GameSrc.j[var1], GameSrc.k[var1], cg.f);
            } else if (GameSrc.m[var1] == 9) {
               cg.p.a(var0, GameSrc.c[var1], GameSrc.j[var1], GameSrc.k[var1], cg.f);
            } else if (GameSrc.m[var1] == 10) {
               cg.l.a(var0, GameSrc.c[var1], GameSrc.j[var1], GameSrc.k[var1], cg.f);
            }
         }
      }

   }

   public static void a(dm var0, int var1, int var2, int var3) {
      int var4 = var3 / dm.a(a);

      for(var3 = 0; var3 < var4 + 1; ++var3) {
         var0.a(a, dm.a(a) * var3 + var1, var2, 0);
      }

   }

   public static void a(boolean var0) {
      if (main.a.a.equals(dl.a)) {
         if (au.a != null) {
            if (!au.a[0]) {
               au.a[0] = true;
               au.a = 0;
               GameMidlet.a = au.b[au.a];
               aa.a("svselect", au.a);
               main.a.b();
            } else if (!au.a[2]) {
               au.a[2] = true;
               au.a = 2;
               GameMidlet.a = au.b[au.a];
               aa.a("svselect", au.a);
               main.a.b();
            } else if (aa.a("ImageSource") == null) {
               main.a.a(ab.au, (int)8885);
            } else {
               main.a.a(ab.av, (int)9000);
            }
         } else if (aa.a("ImageSource") == null) {
            main.a.a(ab.au, (int)8885);
         } else {
            main.a.a(ab.av, (int)9000);
         }
      } else {
         at.a().a();
         at.b().a();
         if (j.a) {
            main.a.a(ab.au, (int)8885);
         } else {
            ek.a = false;
            if (main.a.a != null) {
               main.a.a.i();
            } else {
               main.a.a = new ek();
            }

            ek.a = au.a[au.a];
            if (main.a.a != main.a.a) {
               main.a.a(ab.aw + ek.a, 888395);
            } else {
               main.a.f();
            }

            Char.w = false;
            if (var0) {
               au.i = 0;
            }
         }
      }

   }

   public static Image b(String var0) {
      Object var1 = null;

      Image var3;
      try {
         var3 = aq.a(var0);
      } catch (Exception var2) {
         var3 = (Image)var1;
      }

      return var3;
   }

   public static void b() {
      while(j.b) {
         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var1) {
            var1.printStackTrace();
         }
      }

   }

   public static void b(boolean var0) {
      at.a().a();
      at.b().a();
      if (j.a) {
         main.a.a.i();
         main.a.a(ab.au, (int)8885);
      } else {
         if (main.a.a != main.a.a) {
            main.a.checkInfo(ab.r);
         } else {
            main.a.f();
         }

         Char.w = false;
         if (var0) {
            au.i = 0;
         }

         main.a.a.i();
      }

   }

   public static Image c(String var0) {
      String var1 = "/x" + dm.a + var0;
      Image var3 = null;

      Image var4;
      try {
         var4 = Image.createImage(var1);
      } catch (Exception var2) {
         return var3;
      }

      var3 = var4;
      return var3;
   }
}
