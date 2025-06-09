package pasta;

import main.GameMidlet;

public final class k extends cb implements ah {
   private static long a;
   private static String a;
   public static cs a;
   public static k a;
   private static boolean a;
   private static long b;
   private static cm b;
   public static k b;
   private static int k;
   public byte a = 0;
   public int a = 100;
   public cd a;
   public cm a;
   public String[] a;
   public byte b = 0;
   public int b;
   public cd b;
   private String[] b;
   public int c;
   public cd c;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   private int i;
   private int j;
   private int l;

   public static k a(String var0, int var1, cm var2) {
      k var8;
      if (gameFunc.c) {
         var8 = null;
      } else {
         Char.myCharz();
         k = 10;
         k var7 = new k();
         int var4 = main.a.i;
         int var3;
         if (main.a.a.a) {
            var3 = main.a.a.b;
         } else {
            var3 = 0;
         }

         var7.a = var4 - 30 - var3;
         if (var7.a > 320) {
            var7.a = 320;
         }

         if (var0.length() < 10) {
            var7.a = 64;
         }

         if (main.a.i == 128) {
            var7.a = 128;
         }

         var7.a = cg.p.a(var0, var7.a - 10);
         var7.b = var1;
         var7.a = var2;
         Char.a = var7;
         var7.f = 15 - var7.c + var7.a.length * 12 + 10;
         if (var7.f > main.a.j - 80) {
            var7.f = main.a.j - 80;
         }

         cb.b.addElement(var7);
         a = false;
         if (var2 != null && var2.charID == 5) {
            a = true;
            GameSrc.a.a("", 1);
         }

         long var5 = dz.a();
         b = var5;
         a = var5;
         var8 = var7;
      }

      return var8;
   }

   public static k a(String var0, cm var1) {
      Char.myCharz();
      k = 10;
      k var6 = new k();
      int var3 = main.a.i;
      int var2;
      if (main.a.a.a) {
         var2 = main.a.a.b;
      } else {
         var2 = 0;
      }

      var6.a = var3 - 30 - var2;
      if (var6.a > 320) {
         var6.a = 320;
      }

      if (var0.length() < 10) {
         var6.a = 64;
      }

      if (main.a.i == 128) {
         var6.a = 128;
      }

      var6.a = cg.p.a(var0, var6.a - 10);
      var6.b = 100000;
      var6.a = var1;
      var6.j = 5820;
      Char.a = var6;
      var6.f = 15 - var6.c + var6.a.length * 12 + 10;
      if (var6.f > main.a.j - 80) {
         var6.f = main.a.j - 80;
      }

      cb.b.addElement(var6);
      a = false;
      if (var1 != null && var1.charID == 5) {
         a = true;
         GameSrc.a.a("", 1);
      }

      var6.f += 15;
      long var4 = dz.a();
      b = var4;
      a = var4;
      return var6;
   }

   public static void a(String var0, cm var1) {
      a = var0;
      b = var1;
      if (a == null) {
         c(a, b);
         a = null;
         b = null;
      }

   }

   public static void b(String var0, cm var1) {
      if (var1.I == 1139 && pasta.a.a % 2 == 0) {
         ++pasta.a.a;
         if (gameFunc.i) {
            gameFunc.i = false;
            Char var5 = Char.myCharz();
            --var5.c;
            av.a().g();
            var5 = Char.myCharz();
            ++var5.c;
            av.a().g();
            if (gameFunc.a && !GameSrc.l) {
               GameSrc.l = true;
            }

            ++pasta.a.a;
         } else {
            main.a.f();
            cm var6 = new cm(-1, 0, 0, 0, 0, 0);
            var6.I = 1139;
            b(pasta.a.a(" Yt:Dragon 4K TL: @Oseiasx"), var6);
            b.b = new cd(ab.aO, b, 1001, (Object)null);
            b.b.b = main.a.i / 2 - 35;
            b.b.c = main.a.j - 35;
         }
      } else {
         ++pasta.a.a;
         String[] var3 = new String[]{var0};
         if (var1.charID != 5 && GameSrc.a.a) {
            GameSrc.a.b = false;
         }

         Char.v = true;
         k var4 = a(var3[0], 100000, var1);
         b = var4;
         var4.h = 5;
         b.d = main.a.i / 2 - b.a / 2 - 1;
         b.e = main.a.j - 20 - b.f;
         b.i = 0;
         b.b = var3;
         a = new cs();
         int var2 = b.a.length;
         a.a(var2, 12, b.d, b.e - b.h + 12, b.a + 2, b.f - 25);
         aw.a();
      }

   }

   public static void c(String var0, cm var1) {
      (new StringBuffer("chat= ")).append(var0);
      String[] var2 = cq.a(var0, "\n", 0);
      if (var2.length != 1 || var1.I != Char.myCharz().k + 535 && var1.I != 351) {
         Char.v = true;
         k var3 = a(var2[0], 100000, var1);
         a = var3;
         var3.i = 0;
         a.b = var2;
         var0 = ab.aQ;
         if (var2.length == 1) {
            var0 = ab.aO;
         }

         a.a = new cd(var0, a, 8000, (Object)null);
         a.a.b = main.a.i / 2 - 35;
         a.a.c = main.a.j - 35;
         aw.a();
      } else {
         GameSrc.a.a(var2[0], 0);
      }

   }

   public final void a() {
      if (a != null) {
         GameSrc.a.b = false;
         a.a();
      } else {
         GameSrc.a.b = true;
      }

      if (main.a.a.a) {
         this.h = 0;
         this.d = main.a.i / 2 - this.a / 2 - 1;
         this.e = main.a.a.c - this.f;
      } else {
         this.h = 0;
         if (GameSrc.a().c == null && GameSrc.a().a == null && GameSrc.a().b == null && this.a == null && this.b == null) {
            this.d = main.a.i / 2 - this.a / 2 - 1;
            this.e = main.a.j - 5 - this.f;
         } else {
            this.h = 5;
            this.d = main.a.i / 2 - this.a / 2 - 1;
            this.e = main.a.j - 20 - this.f;
         }
      }

      if (this.b > 0) {
         --this.b;
      }

      if (k > 0) {
         --k;
      }

      if (this.c > 1) {
         --this.c;
      }

      if (this.a != null && Char.a != null && Char.a != this || this.a != null && Char.a == null || this.b == 0) {
         cb.d.removeElement(this);
         cb.b.removeElement(this);
      }

   }

   public final void a(int var1, Object var2) {
      if (var1 == 1000) {
         try {
            GameMidlet.e.platformRequest((String)var2);
         } catch (Exception var3) {
            var3.printStackTrace();
         }

         GameMidlet.e.notifyDestroyed();
         main.a.f();
      }

      if (var1 == 1001) {
         a = null;
         Char.a = null;
         b = null;
         GameSrc.a.b = true;
         Char.v = false;
         if (a) {
            GameSrc.a.a.b = 0;
            GameSrc.a.a.a.a = 10;
         }
      }

      if (var1 == 8000 && k <= 0) {
         var1 = a.i + 1;
         if (var1 >= a.b.length) {
            Char.a = null;
            a = null;
            GameSrc.a.b = true;
            Char.v = false;
            if (a != null) {
               c(a, b);
               a = null;
               b = null;
            } else if (a) {
               GameSrc.a.a.b = 0;

               for(var1 = 0; var1 < GameSrc.a.a.a.size(); ++var1) {
                  if (((ef)GameSrc.a.a.a.elementAt(var1)).a == 10000000) {
                     ((ef)GameSrc.a.a.a.elementAt(var1)).a = 10;
                  }
               }
            }
         } else {
            k var4 = a(a.b[var1], a.b, a.a);
            var4.i = var1;
            var4.b = a.b;
            var4.a = a.a;
            a = var4;
         }
      }

   }

   public final void a(dm var1) {
      if (!GameSrc.a().k || !GameSrc.a().h) {
         main.a.a(var1);
         int var10 = this.d;
         int var9 = this.e;
         int var7 = this.a + 2;
         int var8 = this.f;
         if (var10 > 0 && var9 > 0 || main.a.a.a) {
            ar.a(var1, var10, var9, var7, var8, 16777215, false);
            if (this.a != null) {
               ao.a(var1, this.a.I, this.d + 14, this.e, 0, bk.d);
            }

            if (this.j != 0) {
               ao.a(var1, this.j, this.d + var7 / 2, this.e + this.f - 15, 0, bk.f);
            }

            if (a != null) {
               var1.f(var10, var9, var7, var8 - 16);
               var1.a(0, -a.d);
            }

            int var2 = -1;

            for(int var3 = 0; var3 < this.a.length; ++var3) {
               if (this.a[var3].startsWith("--")) {
                  var1.a(0);
                  var1.e(var10 + 10, this.e + this.c + var3 * 12 + 6, var7 - 20, 1);
               } else {
                  cg var15 = cg.k;
                  String var13 = this.a[var3];
                  int var4;
                  int var5;
                  String[] var14;
                  String var16;
                  if (this.a[var3].startsWith("|")) {
                     var14 = cq.a(this.a[var3], "|", 0);
                     if (var14.length == 3) {
                        var13 = var14[2];
                     }

                     if (var14.length == 4) {
                        var13 = var14[3];
                        var2 = Integer.parseInt(var14[2]);
                     } else {
                        var2 = 2;
                     }

                     int var6 = Integer.parseInt(var14[1]);
                     var4 = var2;
                     var5 = var6;
                     var2 = var6;
                     var16 = var13;
                  } else {
                     var4 = 2;
                     var5 = var2;
                     var16 = var13;
                  }

                  cg var17;
                  switch(var5) {
                  case -1:
                     var17 = cg.k;
                     break;
                  case 0:
                     var17 = cg.f;
                     break;
                  case 1:
                     var17 = cg.h;
                     break;
                  case 2:
                     var17 = cg.b;
                     break;
                  case 3:
                     var17 = cg.p;
                     break;
                  case 4:
                     var17 = cg.r;
                     break;
                  case 5:
                     var17 = cg.q;
                     break;
                  case 6:
                  default:
                     var17 = var15;
                     break;
                  case 7:
                     var17 = cg.a;
                  }

                  if (this.a[var3].startsWith("<")) {
                     var14 = cq.a(cq.a(this.a[var3], "<", 0)[1], ">", 1);
                     if (this.l == 0) {
                        this.l = Integer.parseInt(var14[1]);
                     } else {
                        long var11 = dz.a();
                        a = var11;
                        if (var11 - b >= 1000L) {
                           b = a;
                           --this.l;
                        }
                     }

                     var16 = this.l + " " + var14[2];
                     var5 = this.d;
                     var17.a(var1, var16, this.a / 2 + var5, this.e + this.c + var3 * 12 - this.h + 12, var4);
                  } else {
                     if (var4 == 2) {
                        var5 = this.d;
                        var17.a(var1, var16, this.a / 2 + var5, this.e + this.c + var3 * 12 - this.h + 12, var4);
                     }

                     if (var4 == 1) {
                        var17.a(var1, var16, this.d + this.a - 5, this.e + this.c + var3 * 12 - this.h + 12, var4);
                     }
                  }
               }
            }

            if (this.b > 0) {
               for(var2 = 0; var2 < this.b; ++var2) {
                  var1.a(Panel.c, var7 / 2 + var10 - this.b * 20 / 2 + var2 * 20 + dm.a(Panel.b), var9 + var8 - 13, 3);
               }
            }

            if (this.a > 0) {
               for(var2 = 0; var2 < this.a; ++var2) {
                  var1.a(Panel.b, var7 / 2 + var10 - this.b * 20 / 2 + var2 * 20 + dm.a(Panel.b), var9 + var8 - 13, 3);
               }
            }

            var1.a(-var1.a(), -var1.b());
            var1.f(0, 0, main.a.i, main.a.j);
            if (this.a != null) {
               bw.a(var1, (cd)null, this.a, (cd)null);
            }

            if (this.b != null) {
               bw.a(var1, this.b, (cd)null, this.c);
            }
         }
      }

   }

   public final void a(dm var1, int var2) {
      int var7 = this.d;
      int var3 = this.e;
      int var8 = this.a;
      int var10 = var1.a();
      int var9 = var1.b();
      var1.a(0, -var2);
      if (var7 > 0 && var3 > 0 || main.a.a.a) {
         var2 = -1;

         for(var3 = 0; var3 < this.a.length; ++var3) {
            if (this.a[var3].startsWith("--")) {
               var1.a(16777215);
               var1.e(var7 + 10, this.e + this.c + var3 * 12 - 6, var8 - 20, 1);
            } else {
               cg var15 = cg.s;
               String var13 = this.a[var3];
               int var4;
               int var5;
               String[] var14;
               String var16;
               if (this.a[var3].startsWith("|")) {
                  var14 = cq.a(this.a[var3], "|", 0);
                  if (var14.length == 3) {
                     var13 = var14[2];
                  }

                  if (var14.length == 4) {
                     var13 = var14[3];
                     var2 = Integer.parseInt(var14[2]);
                  } else {
                     var2 = 2;
                  }

                  int var6 = Integer.parseInt(var14[1]);
                  var4 = var6;
                  var5 = var2;
                  var2 = var6;
                  var16 = var13;
               } else {
                  var5 = 2;
                  var4 = var2;
                  var16 = var13;
               }

               cg var17;
               switch(var4) {
               case -1:
                  var17 = cg.s;
                  break;
               case 0:
                  var17 = cg.c;
                  break;
               case 1:
                  var17 = cg.h;
                  break;
               case 2:
                  var17 = cg.a;
                  break;
               default:
                  var17 = var15;
               }

               if (this.a[var3].startsWith("<")) {
                  var14 = cq.a(cq.a(this.a[var3], "<", 0)[1], ">", 1);
                  if (this.l == 0) {
                     this.l = Integer.parseInt(var14[1]);
                  } else {
                     long var11 = dz.a();
                     a = var11;
                     if (var11 - b >= 1000L) {
                        b = a;
                        --this.l;
                     }
                  }

                  var16 = this.l + " " + var14[2];
                  var4 = this.d;
                  var17.a(var1, var16, this.a / 2 + var4, this.e + this.c + var3 * 12 - this.h, var5);
               } else {
                  if (var5 == 2) {
                     var4 = this.d;
                     var17.a(var1, var16, this.a / 2 + var4, this.e + this.c + var3 * 12 - this.h, var5);
                  }

                  if (var5 == 1) {
                     var17.a(var1, var16, this.d + this.a - 5, this.e + this.c + var3 * 12 - this.h, var5);
                  }
               }
            }
         }

         main.a.a(var1);
         var1.a(var10, var9);
      }

   }

   public final void b() {
      if (a != null) {
         if (main.a.e) {
            a.a();
         }

         cs var1;
         if (main.a.b[2]) {
            var1 = a;
            var1.b -= 12;
            if (a.b < 0) {
               a.b = 0;
            }
         }

         if (main.a.b[8]) {
            main.a.a[8] = false;
            var1 = a;
            var1.b += 12;
            if (a.b > a.l) {
               a.b = a.l;
            }
         }
      }

      if (main.a.a[5] || ag.a(main.a.a.b)) {
         main.a.a[5] = false;
         ag.h = -1;
         if (this.a != null) {
            this.a.a();
         } else if (this.b != null) {
            this.b.a();
         } else if (this.c != null) {
            this.c.a();
         }
      }

      if (a == null || !a.a) {
         if (this.b != null && (main.a.a[12] || main.a.a[5] || ag.a(this.b))) {
            main.a.a[12] = false;
            main.a.a[5] = false;
            main.a.i = false;
            main.a.j = false;
            this.b.a();
            ag.h = -1;
         }

         if (this.c != null && (main.a.a[13] || ag.a(this.c))) {
            main.a.a[13] = false;
            main.a.i = false;
            main.a.j = false;
            this.c.a();
            ag.h = -1;
         }
      }

   }
}
