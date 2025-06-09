package pasta;

import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class dl extends ag {
   private static int a;
   public static Image a = dz.b("/gamelogo.png");
   public static dl a;
   private static int b = -1;
   private static int c = -1;
   private boolean a = false;

   public dl() {
      a = this;
   }

   public static void e() {
      int var0;
      int var1;
      if (aa.a("svselect") == -1) {
         if (ab.a > 0) {
            var1 = 0;

            for(var0 = 0; var1 < ab.a; ++var1) {
               var0 += au.a[var1];
            }
         } else {
            var0 = 0;
         }

         if (au.a == -1) {
            au.a = cq.b(0, au.a[ab.a]) + var0;
         } else {
            au.a = au.a;
         }

         aa.a("svselect", au.a);
         GameMidlet.a = au.b[au.a];
         GameMidlet.b = au.a[au.a];
         ab.a(au.a[au.a]);
         ek.a = au.a[au.a];
         main.a.b();
      } else {
         var0 = aa.a("svselect");
         au.a = var0;
         if (var0 > au.a.length - 1) {
            au.a = au.a.length - 1;
            aa.a("svselect", au.a);
         }

         String var3 = aa.a("acc");
         String var2 = aa.a("userAo" + au.a);
         if ((var3 == null || var3.equals("")) && (var2 == null || var2.equals(""))) {
            if (ab.a > 0) {
               var1 = 0;

               for(var0 = 0; var1 < ab.a; ++var1) {
                  var0 += au.a[var1];
               }
            } else {
               var0 = 0;
            }

            if (au.a == -1) {
               au.a = cq.b(0, au.a[ab.a]) + var0;
            }
         }

         GameMidlet.a = au.b[au.a];
         GameMidlet.b = au.a[au.a];
         ab.a(au.a[au.a]);
         ek.a = au.a[au.a];
         System.out.println("ipselect = " + au.a + " , " + ek.a);
         main.a.b();
      }

   }

   public static void onCancelChat() {
      a = 0;
   }

   public final void a(dm var1) {
      var1.a(0);
      var1.e(0, 0, main.a.i, main.a.j);
      if (a != null && a < 30) {
         if (dz.a == 3 || dz.a == 5) {
            var1.a(16777215);
            var1.e(0, 0, main.a.i, main.a.j);
         }

         var1.a(a, main.a.i / 2, main.a.j / 2, 3);
      }

      if (b != -1) {
         var1.a(ek.a, main.a.i / 2, main.a.j / 2 - 24, bk.c);
         main.a.a(main.a.k, main.a.j / 2 + 24, var1);
         cg.c.a(var1, ab.at + b * 100 / c + "%", main.a.i / 2, main.a.j / 2, 2);
      } else if (a >= 30) {
         main.a.a(main.a.k, main.a.l, var1);
      }

   }

   public final void b() {
      boolean var1 = true;
      if (a == 30 && !this.a) {
         this.a = true;
         if (aa.a("isPlaySound") != -1) {
            if (aa.a("isPlaySound") != 1) {
               var1 = false;
            }

            main.a.p = var1;
         }

         if (main.a.p) {
            aw.a();
         }

         aw.a();
         aw.a();
         au.e();
      }

      ++a;
   }
}
