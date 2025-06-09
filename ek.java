package pasta;

import java.io.IOException;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class ek extends ag implements ah {
   public static long a;
   public static String a;
   public static Image a;
   public static short a;
   public static boolean a = false;
   public static long b;
   public static boolean b;
   public static boolean c;
   public static boolean d;
   public static boolean e;
   public static boolean f;
   private int a;
   public bf a;
   private int b;
   public bf b;
   private int c;
   private int d;
   private cd d;
   private cd e;
   private cd f;
   private cd g;
   public boolean g = false;
   private cd h;
   private boolean h = false;
   private int i;
   private cd i;
   private boolean i = false;
   private int j;
   private cd j;
   private int k;
   private int l = -1;
   private int m = 2;
   private int n = 0;
   private int o = -40;
   private int p = 1;

   static {
      int[] var0 = new int[]{0, 8, 2, 6, 9};
   }

   public ek() {
      this.k = main.a.l - 30;
      byte var1 = (byte)((int)(System.currentTimeMillis() % 9L));
      TileMap.i = var1;
      if (var1 == 5 || TileMap.i == 6) {
         TileMap.i = 4;
      }

      GameSrc.transMap(-1, -1);
      GameSrc.k = 100;
      GameSrc.l = 200;
      if (main.a.j > 200) {
         this.d = main.a.l - 80;
      } else {
         this.d = main.a.l - 65;
      }

      this.c = -50;
      short var4;
      if (main.a.i >= 200) {
         var4 = 160;
      } else {
         var4 = 140;
      }

      this.b = var4;
      this.i = main.a.l - ag.e - 5;
      if (main.a.j <= 160) {
         this.i = 20;
      }

      this.a = new bf();
      this.a.b = main.a.l - ag.e - 9;
      this.a.c = this.b;
      this.a.d = ag.e + 2;
      this.a.a = true;
      this.a.goToMap(0);
      bf var3 = this.a;
      String var2;
      if (ab.a == 2) {
         var2 = "";
      } else {
         var2 = ab.Z + "/";
      }

      var3.b = var2 + ab.aa;
      this.b = new bf();
      this.b.b = main.a.l - 4;
      this.b.goToMap(2);
      this.b.c = this.b;
      this.b.d = ag.e + 2;
      this.i += 35;
      this.h = true;
      int var5 = aa.a("check");
      if (var5 == 1) {
         this.h = true;
      } else if (var5 == 2) {
         this.h = false;
      }

      this.a.checkInfo(aa.a("acc"));
      this.b.checkInfo(aa.a("pass"));
      this.a.checkInfo((String)null);
      this.b.checkInfo((String)null);
      if (this.j == null) {
         this.j = new cd("Gọi hotline", this, 13, (Object)null);
         this.j.b = main.a.i - 75;
         if (dz.a == 1 && !main.a.e) {
            this.j.c = main.a.j - 20;
         } else {
            this.j.c = 8;
         }
      }

      this.a = 0;
      if (main.a.i > 200) {
         var2 = ab.an;
      } else {
         var2 = ab.ao;
      }

      this.d = new cd(var2, main.a.a, 888393, (Object)null);
      new cd(ab.aY, this, 2001, (Object)null);
      this.f = new cd(ab.ap, this, 2002, (Object)null);
      this.h = new cd(ab.ba, this, 10021, (Object)null);
      cd var6 = new cd(ab.aN, this, 2003, (Object)null);
      this.g = var6;
      super.a = var6;
      if (main.a.e) {
         this.d.b = main.a.i / 2 + 8;
         this.g.b = main.a.i / 2 - ag.f - 8;
         if (main.a.j >= 200) {
            this.d.c = this.k + 110;
            this.g.c = this.k + 110;
         }

         this.h.b = main.a.i / 2 + 3;
         this.h.c = this.k + 110;
         this.f.b = main.a.i / 2 - 84;
         this.f.c = this.g.c;
      }

      var4 = 184;
      if (184 >= main.a.i) {
         var4 = 152;
      }

      this.j = main.a.i / 2 - var4 / 2;
      this.k = main.a.l - 30;
      this.a.a = this.j + 10;
      this.a.b = this.k + 20;
      this.i = new cd(ab.aX, this, 2008, (Object)null);
      this.i.b = main.a.i / 2 - 84;
      this.i.c = this.d.c;
      this.e = new cd(ab.T, this, 1003, (Object)null);
      this.e.b = main.a.i / 2 + 3;
      this.e.c = this.d.c;
      super.b = this.i;
      super.a = this.e;
   }

   public static void g() {
      if (main.a.a.g) {
         main.a.a(ab.eX, new cd(ab.aS, main.a.a, 10019, (Object)null), new cd(ab.aT, main.a.a, 10020, (Object)null));
      } else {
         main.a.a((ag)main.a.a);
         at.a().b();
      }

   }

   private void h() {
      if (this.g) {
         this.onCancelChat();
      } else {
         this.i = false;
         this.b.a = false;
         this.a.a = true;
         super.a = this.g;
      }

   }

   public final void a() {
      aw.a();
      this.a.a = true;
      this.b.a = false;
      if (main.a.e) {
         this.a.a = false;
      }

      main.a.a(0);
      super.a();
   }

   public final void a(int var1) {
      if (this.a.a) {
         this.a.a(var1);
      } else if (this.b.a) {
         this.b.a(var1);
      }

      super.a(var1);
   }

   public final void a(int var1, Object var2) {
      boolean var3 = false;
      String var16;
      boolean var10001;
      switch(var1) {
      case 13:
         switch(dz.a) {
         case 1:
            dz.a();
            return;
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         default:
            return;
         }
      case 1000:
         try {
            GameMidlet.e.platformRequest((String)var2);
         } catch (Exception var9) {
            var9.printStackTrace();
         }

         main.a.f();
         break;
      case 1001:
         main.a.f();
         this.i = false;
         break;
      case 1002:
         main.a.g();
         var16 = aa.a("userAo" + au.a);
         if (var16 != null && !var16.equals("")) {
            main.a.a.g = true;
            main.a.b();
            av.a().c();
            av.a().a(var16, "", "1.9.8", (byte)1);
         } else {
            av.a().d("");
         }
         break;
      case 1003:
         main.a.checkInfo(ab.ad);
         break;
      case 1004:
         au.onCancelChat();
         main.a.a.a();
         break;
      case 1005:
         try {
            GameMidlet.e.platformRequest("http://ngocrongonline.com");
         } catch (Exception var8) {
            var8.printStackTrace();
         }
         break;
      case 2001:
         if (this.h) {
            this.h = false;
         } else {
            this.h = true;
         }
         break;
      case 2002:
         if (this.a.a().equals("")) {
            main.a.checkInfo(ab.M);
         } else {
            this.a.a().toCharArray();
            if (this.b.a().equals("")) {
               main.a.checkInfo(ab.N);
            } else if (this.a.a().length() < 5) {
               main.a.checkInfo(ab.O);
            } else {
               boolean var15;
               label131: {
                  if (ab.a == 2) {
                     if (this.a.a().indexOf("@") == -1 || this.a.a().indexOf(".") == -1) {
                        var16 = ab.Q;
                        var15 = var3;
                        break label131;
                     }
                  } else {
                     label125: {
                        label124: {
                           label160: {
                              label122: {
                                 try {
                                    Long.parseLong(this.a.a());
                                    if (this.a.a().length() >= 8 && this.a.a().length() <= 12 && (this.a.a().startsWith("0") || this.a.a().startsWith("84"))) {
                                       break label160;
                                    }
                                 } catch (Exception var11) {
                                    var10001 = false;
                                    break label122;
                                 }

                                 try {
                                    var16 = ab.P;
                                    break label124;
                                 } catch (Exception var10) {
                                    var10001 = false;
                                 }
                              }

                              if (this.a.a().indexOf("@") != -1 && this.a.a().indexOf(".") != -1) {
                                 break label125;
                              }

                              var16 = ab.Q;
                              var15 = var3;
                              break label131;
                           }

                           var16 = null;
                        }

                        var15 = true;
                        break label131;
                     }
                  }

                  var16 = null;
                  var15 = var3;
               }

               if (var16 != null) {
                  main.a.checkInfo(var16);
               } else {
                  ai var19 = main.a.a;
                  StringBuffer var20 = new StringBuffer(String.valueOf(ab.Y));
                  if (var15) {
                     var16 = ab.Z + ": ";
                  } else {
                     var16 = ab.aa + ": ";
                  }

                  var19.a(var20.append(var16).append(this.a.a()).append("\n").append(ab.U).append(": ").append(this.b.a()).toString(), new cd(ab.aZ, this, 4000, (Object)null), (cd)null, new cd(ab.aT, main.a.a, 8882, (Object)null));
               }

               main.a.a = main.a.a;
            }
         }
         break;
      case 2003:
         MyVector var17 = new MyVector("vMenu Login");
         var17.addElement(new cd(ab.R, this, 2004, (Object)null));
         if (!this.g) {
            var17.addElement(new cd(ab.S, this, 1004, (Object)null));
         }

         var17.addElement(new cd(ab.T, this, 1003, (Object)null));
         var17.addElement(new cd(ab.az, this, 1005, (Object)null));
         if (aa.a("lowGraphic") == 1) {
            var17.addElement(new cd(ab.bx, this, 10041, (Object)null));
         } else {
            var17.addElement(new cd(ab.by, this, 10042, (Object)null));
         }

         var17.addElement(new cd(ab.aU, main.a.a, 8885, (Object)null));
         main.a.a.b(var17);
         break;
      case 2004:
         this.f();
         break;
      case 2008:
         aa.a("acc", this.a.a().trim());
         aa.a("pass", this.b.a().trim());
         if (au.e) {
            main.a.a.a();
         } else {
            main.a.a.h();
         }
         break;
      case 4000:
         var16 = this.a.a();
         main.a.b(ab.as);
         main.a.b();
         main.a.b(ab.B);
         av var4 = av.a();
         String var7 = this.b.a();
         String var5 = aa.a("userAo" + au.a);
         aa.a("passAo");
         (new StringBuffer("Request Register ")).append(var16).append(" ").append(var7).append(" ").append("1.9.8");

         label147: {
            IOException var10000;
            label162: {
               Message var6;
               try {
                  var6 = av.a((byte)1);
                  var6.a().writeUTF(var16);
                  var6.a().writeUTF(var7);
               } catch (IOException var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label162;
               }

               if (var5 != null) {
                  try {
                     if (!var5.equals("")) {
                        var6.a().writeUTF(var5);
                        var6.a().writeUTF("a");
                     }
                  } catch (IOException var13) {
                     var10000 = var13;
                     var10001 = false;
                     break label162;
                  }
               }

               try {
                  var4.a.a(var6);
                  var6.a();
                  break label147;
               } catch (IOException var12) {
                  var10000 = var12;
                  var10001 = false;
               }
            }

            IOException var18 = var10000;
            var18.printStackTrace();
         }

         aa.a("acc", var16);
         aa.a("pass", this.b.a());
         break;
      case 10021:
         this.h();
         break;
      case 10041:
         aa.a("lowGraphic", 0);
         main.a.a(ab.cd, (int)8885);
         break;
      case 10042:
         aa.a("lowGraphic", 1);
         main.a.a(ab.cd, (int)8885);
      }

   }

   public final void a(dm var1) {
      main.a.b(var1);
      int var2 = this.a.b - 50;
      if (main.a.j <= 220) {
         var2 += 5;
      }

      cg.s.a(var1, "v1.9.8", main.a.i - 2, 17, 1, cg.o);
      if (dz.a == 1 && !main.a.e) {
         cg.s.a(var1, au.d, main.a.i - 2, main.a.j - 15, 1, cg.o);
      } else {
         cg.s.a(var1, au.d, main.a.i - 2, 2, 1, cg.o);
      }

      if (pasta.k.a == null && pasta.k.b == null) {
         if (main.a.a == null) {
            short var3;
            if (main.a.i >= 200) {
               var3 = 180;
            } else {
               var3 = 160;
            }

            ar.a(var1, this.j, this.k - 10, var3, 105, -1, true);
            if (main.a.j > 160 && a != null) {
               var1.a(a, main.a.k, var2, 3);
            }

            short var4 = 184;
            if (184 >= main.a.i) {
               var4 = 152;
            }

            this.j = main.a.i / 2 - var4 / 2;
            this.a.a = this.j + 10;
            this.a.b = this.k + 20;
            this.b.a = this.j + 10;
            this.b.b = this.k + 55;
            this.a.a(var1);
            this.b.a(var1);
            if (main.a.i < 176) {
               cg.g.a(var1, ab.ab + ":", this.a.a - 35, this.a.b + 7, 0);
               cg.g.a(var1, ab.ac + ":", this.b.a - 35, this.b.b + 7, 0);
               cg.g.a(var1, ab.aA + ": " + a, main.a.i / 2, this.b.b + 32, 2);
            }
         }

         super.a(var1);
      }

   }

   public final void b() {
      if (a > 0) {
         main.a.g();
         long var3 = System.currentTimeMillis();
         b = var3;
         if (var3 - a >= 1000L) {
            short var1 = (short)(a - 1);
            a = var1;
            if (var1 == 0) {
               main.a.a.onCancelChat();
            }

            a = b;
         }
      }

      String var5;
      bf var6;
      if (this.g && !this.i) {
         var6 = this.a;
         if (ab.a == 2) {
            var5 = "";
         } else {
            var5 = ab.Z + "/";
         }

         var6.b = var5 + ab.aa;
         this.b.b = ab.U;
         this.a.d = false;
         this.b.d = false;
         this.a.c();
         this.b.c();
      } else {
         var6 = this.a;
         if (ab.a == 2) {
            var5 = "";
         } else {
            var5 = ab.Z + "/";
         }

         var6.b = var5 + ab.aa;
         this.b.b = ab.U;
         this.a.c();
         this.b.c();
      }

      int var2;
      for(var2 = 0; var2 < cb.b.size(); ++var2) {
         ((cb)cb.b.elementAt(var2)).a();
      }

      if (b && !c && !f && !d && !e) {
         b = false;
         System.gc();
         av.a().q();
      }

      var2 = GameSrc.k + 1;
      GameSrc.k = var2;
      if (var2 > main.a.i * 3 + 100) {
         GameSrc.k = 100;
      }

      if (pasta.k.a == null) {
         if (this.d != this.c) {
            this.c += this.d - this.c >> 1;
         }

         if (this.n >= 0) {
            this.o += this.p * this.n;
            this.n += this.p * this.m;
            if (this.n <= 0) {
               this.p = -this.p;
            }

            if (this.o > 0) {
               this.p = -this.p;
               this.n -= this.m * 2;
            }
         }

         if (this.l >= 0 && main.a.g % 100 == 0) {
            ++this.l;
            if (this.l >= ab.i.length) {
               this.l = 0;
            }

            if (main.a.a == main.a.a && main.a.a.a) {
               main.a.a.a(ab.i[this.l]);
            }
         }

         if (this.g && !this.i) {
            this.a.d = false;
            this.b.d = false;
            this.a.c();
            this.b.c();
         } else {
            var6 = this.a;
            if (ab.a == 2) {
               var5 = "";
            } else {
               var5 = ab.Z + "/";
            }

            var6.b = var5 + ab.aa;
            this.b.b = ab.U;
            this.a.c();
            this.b.c();
         }

         if (main.a.e) {
            if (this.i) {
               super.b = this.f;
               super.a = this.h;
            } else {
               super.b = this.i;
               super.a = this.e;
            }
         } else if (this.i) {
            super.b = this.f;
            super.a = this.h;
         } else {
            super.b = this.i;
            super.a = this.e;
         }
      }

   }

   public final void c() {
      if (main.a.e && this.j != null && this.j.a()) {
         this.j.a();
      }

      if (!main.a.e) {
         if (this.a.a) {
            super.c = this.a.a;
         } else {
            super.c = this.b.a;
         }
      }

      if (main.a.a[2]) {
         --this.a;
         if (this.a < 0) {
            this.a = 1;
         }
      } else if (main.a.a[8]) {
         ++this.a;
         if (this.a > 1) {
            this.a = 1;
         }
      }

      if (main.a.a[2] || main.a.a[8]) {
         main.a.onCancelChat();
         if (!this.g || this.i) {
            if (this.a == 1) {
               this.a.a = false;
               this.b.a = true;
            } else if (this.a == 0) {
               this.a.a = true;
               this.b.a = false;
            } else {
               this.a.a = false;
               this.b.a = false;
            }
         }
      }

      if (main.a.e) {
         if (this.i) {
            super.b = this.f;
            super.a = this.h;
         } else {
            super.b = this.i;
            super.a = this.e;
         }
      } else if (this.i) {
         super.b = this.f;
         super.a = this.h;
      } else {
         super.b = this.i;
         super.a = this.e;
      }

      if (main.a.j && (!this.g || this.i)) {
         if (main.a.a(this.a.a, this.a.b, this.a.c, this.a.d)) {
            this.a = 0;
         } else if (main.a.a(this.b.a, this.b.b, this.b.c, this.b.d)) {
            this.a = 1;
         }
      }

      super.c();
      main.a.onCancelChat();
   }

   public final void e() {
      if (this.h) {
         aa.a("check", 1);
         aa.a("acc", this.a.a().toLowerCase().trim());
         aa.a("pass", this.b.a().toLowerCase().trim());
      } else {
         aa.a("check", 2);
         aa.a("acc", "");
         aa.a("pass", "");
      }

   }

   public final void f() {
      main.a.f();
      main.a.checkInfo(ab.eY);
      this.i = true;
      this.b.a = false;
      this.a.a = true;
   }

   public final void onCancelChat() {
      byte var1 = 1;
      (new StringBuffer("user ao= ")).append(aa.a("userAo" + au.a));
      String var5 = aa.a("acc");
      String var4 = aa.a("pass");
      if ((var5 == null || var5.equals("")) && aa.a("userAo" + au.a) != null && !aa.a("userAo" + au.a).equals("")) {
         this.g = true;
      } else {
         this.g = false;
      }

      String var2;
      String var3;
      label42: {
         (new StringBuffer("isLogin 2= ")).append(this.g);
         if (var5 != null) {
            var3 = var5;
            var2 = var4;
            if (!var5.equals("")) {
               break label42;
            }
         }

         var3 = var5;
         var2 = var4;
         if (this.g) {
            var3 = aa.a("userAo" + au.a);
            var2 = "a";
         }
      }

      (new StringBuffer("user = ")).append(var3).append(" pass= ").append(var2);
      if (var3 != null && var2 != null && !var3.equals("")) {
         if (var2.equals("")) {
            this.a = 1;
            this.a.a = false;
            this.b.a = true;
            if (!main.a.e) {
               super.c = this.b.a;
            }
         } else {
            if (!at.a().a()) {
               main.a.b();
            }

            av var6 = av.a();
            if (!this.g) {
               var1 = 0;
            }

            var6.a(var3, var2, "1.9.8", var1);
            System.out.println("dang nhap user=" + var3);
            main.a.g();
            this.a = 0;
            if (!this.g) {
               this.h();
            }
         }
      }

   }
}
