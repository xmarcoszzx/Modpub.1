package pasta;

import javax.microedition.lcdui.Image;

public final class da {
   private static Image a;
   public static MyVector a = new MyVector("vBG Effect");
   public static boolean a;
   public static int b;
   private static Image b;
   public static int c;
   private static Image c;
   private static boolean c;
   private static Image d;
   private static Image e;
   private static int[] e;
   private static Image f;
   private static Image g;
   private static Image h;
   private static Image i = dz.b("/mainImage/myTexture2dwater1.png");
   private static Image j = dz.b("/mainImage/myTexture2dwater2.png");
   private static Image k;
   private static Image l;
   private static Image m;
   private static Image n;
   private static int p;
   private static int q;
   private static int r;
   public int a;
   private int[] a;
   private boolean[] a;
   private boolean b;
   private int[] b;
   private boolean[] b;
   private int[] c;
   private int d;
   private int[] d;
   private int e;
   private int f;
   private int[] f;
   private int g;
   private int[] g;
   private int h;
   private int[] h;
   private int i;
   private int[] i;
   private int j;
   private int[] j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;

   private da(int var1) {
      int[] var3 = new int[]{0, 1, 2, 1, 0, 0};
      this.i = var3;
      this.a = var1;
      switch(this.a) {
      case 0:
      case 12:
         if (a == null) {
            a = dz.a("/bg/mua.png");
         }

         if (b == null) {
            b = dz.a("/bg/mua1.png");
         }

         if (c == null) {
            c = dz.a("/bg/mua2.png");
         }

         this.m = cq.b(main.a.i / 3, main.a.i / 2);
         this.a = new int[this.m];
         this.b = new int[this.m];
         this.c = new int[this.m];
         this.d = new int[this.m];
         this.f = new int[this.m];
         this.h = new int[this.m];
         this.g = new int[this.m];
         this.a = new boolean[this.m];
         this.b = new boolean[this.m];

         for(var1 = 0; var1 < this.m; ++var1) {
            this.b[var1] = cq.b(-10, main.a.j + 100) + GameSrc.l;
            this.a[var1] = cq.b(-10, main.a.i + 300) + GameSrc.k;
            this.h[var1] = cq.b(0, 1);
            this.c[var1] = -12;
            this.d[var1] = 12;
            this.f[var1] = cq.b(1, 3);
            this.a[var1] = false;
            if (this.f[var1] == 2 && var1 % 2 == 0) {
               this.a[var1] = true;
            }

            this.b[var1] = false;
            this.g[var1] = cq.b(1, 2);
         }

         return;
      case 1:
      case 2:
      case 5:
      case 6:
      case 7:
      case 11:
         if (this.a == 1) {
            e = dz.a("/bg/lacay.png");
         }

         if (this.a == 2) {
            e = dz.a("/bg/lacay2.png");
         }

         if (this.a == 5) {
            e = dz.a("/bg/lacay3.png");
         }

         if (this.a == 6) {
            e = dz.a("/bg/lacay4.png");
         }

         if (this.a == 7) {
            e = dz.a("/bg/lacay5.png");
         }

         if (this.a == 11) {
            e = dz.a("/bg/tuyet.png");
         }

         this.m = cq.b(15, 25);
         if (this.a == 11) {
            this.m = 100;
         }

         this.a = new int[this.m];
         this.b = new int[this.m];
         this.c = new int[this.m];
         this.d = new int[this.m];
         this.h = new int[this.m];
         this.g = new int[this.m];
         this.b = new boolean[this.m];

         for(var1 = 0; var1 < this.m; ++var1) {
            this.a[var1] = cq.b(-10, TileMap.c + 10);
            this.b[var1] = cq.b(0, TileMap.d);
            this.g[var1] = cq.b(0, 1);
            this.h[var1] = cq.b(0, 1);
            this.c[var1] = cq.b(-3, 3);
            this.d[var1] = cq.b(1, 4);
            if (this.a == 11) {
               this.g[var1] = cq.b(0, 2);
               this.c[var1] = cq.f(cq.b(1, 3));
               this.d[var1] = cq.f(cq.b(1, 3));
            }
         }

         return;
      case 3:
         main.a.n = true;
         break;
      case 4:
         this.m = cq.b(5, 10);
         if (d == null) {
            d = dz.a("/bg/sao.png");
         }

         this.a = new int[this.m];
         this.b = new int[this.m];
         this.g = new int[this.m];
         this.h = new int[this.m];
         this.j = new int[this.m];

         for(var1 = 0; var1 < this.m; ++var1) {
            this.a[var1] = cq.b(0, main.a.i);
            this.b[var1] = cq.b(0, 50);
            if (var1 % 2 == 0) {
               this.j[var1] = 0;
            } else if (var1 % 3 == 0) {
               this.j[var1] = 1;
            } else if (var1 % 4 == 0) {
               this.j[var1] = 2;
            } else {
               this.j[var1] = 3;
            }

            this.h[var1] = cq.b(0, 10);
         }

         return;
      case 8:
         this.k = cq.b(100, 300);
         if (f == null) {
            f = dz.a("/bg/ship.png");
         }

         if (g == null) {
            g = dz.a("/bg/fire1.png");
         }

         if (h == null) {
            h = dz.a("/bg/fire2.png");
         }

         this.b = false;
         this.d();
         break;
      case 9:
         if (k == null) {
            k = dz.a("/bg/cham-tron1.png");
         }

         if (l == null) {
            l = dz.a("/bg/cham-tron2.png");
         }

         this.d = 20;
         this.a = new int[this.d];
         this.b = new int[this.d];
         e = new int[this.d];
         this.c = new int[this.d];

         for(var1 = 0; var1 < this.d; ++var1) {
            this.a[var1] = cq.f(cq.b(0, main.a.i));
            this.b[var1] = cq.f(cq.b(10, 80));
            e[var1] = cq.f(cq.b(1, 3));
            this.c[var1] = e[var1];
         }

         return;
      case 10:
         this.d = 30;
         this.a = new int[this.d];
         this.b = new int[this.d];
         e = new int[this.d];
         this.c = new int[this.d];
         int var2 = 0;

         for(var1 = 0; var1 < this.d; ++var1) {
            this.a[var1] = cq.f(cq.b(0, main.a.i)) + GameSrc.k;
            ++var2;
            if (var2 > this.d / 2) {
               this.b[var1] = cq.f(cq.b(20, 60));
               e[var1] = 10;
            } else {
               this.b[var1] = cq.f(cq.b(0, 20));
               e[var1] = 7;
            }

            this.c[var1] = e[var1] / 2 - 2;
         }

         return;
      case 13:
         if (cq.f(cq.b(0, 2)) == 0) {
            if (cq.f(cq.b(0, 2)) == 0) {
               c = true;
            } else {
               c = false;
            }

            b = cq.f(cq.b(2, 5));
            c();
         }
         break;
      case 14:
         if (cq.f(cq.b(0, 2)) == 0) {
            a = true;
            c();
         }
      }

   }

   public static void a() {
      TileMap.r = 0;
   }

   public static void a(int var0) {
      (new StringBuffer(" ADD EFFECT ")).append(var0);
      if (!main.a.b) {
         da var1 = new da(var0);
         a.addElement(var1);
      }

   }

   public static void a(int var0, int var1) {
      da var2 = new da(10);
      var2.o = var0;
      var2.n = var1;
      a.addElement(var2);
   }

   public static void a(dm var0) {
      if (dz.a != 1 && !main.a.b && a && n != null) {
         for(int var1 = q; var1 < TileMap.c; var1 += r) {
            if (var1 >= GameSrc.k - r) {
               var0.a(n, (float)var1, (float)c, 0);
            }
         }
      }

   }

   public static boolean a() {
      boolean var1 = false;

      for(int var0 = 0; var0 < a.size(); ++var0) {
         da var2 = (da)a.elementAt(var0);
         if (var2.a == 0 || var2.a == 12) {
            var1 = true;
            break;
         }
      }

      return var1;
   }

   public static void b() {
      label233:
      for(int var0 = 0; var0 < a.size(); ++var0) {
         da var5 = (da)a.elementAt(var0);
         int var1;
         int var2;
         int[] var6;
         int var10002;
         switch(var5.a) {
         case 0:
         case 12:
            var1 = 0;

            while(true) {
               if (var1 >= var5.m) {
                  continue label233;
               }

               if (var1 % 3 != 0 && var5.a != 12 && TileMap.a(var5.a[var1], var5.b[var1] - main.a.o, 2)) {
                  var5.b[var1] = true;
               }

               if (var1 % 3 == 0 && var5.b[var1] > main.a.j + GameSrc.l) {
                  var5.a[var1] = cq.b(-10, main.a.i + 300) + GameSrc.k;
                  var5.b[var1] = cq.b(-100, 0) + GameSrc.l;
               }

               if (!var5.b[var1]) {
                  var6 = var5.b;
                  var6[var1] += var5.d[var1];
                  var6 = var5.a;
                  var6[var1] += var5.c[var1];
               }

               if (var5.b[var1]) {
                  var6 = var5.h;
                  var10002 = var6[var1]++;
                  if (var5.h[var1] > 2) {
                     var6 = var5.g;
                     var10002 = var6[var1]++;
                     var5.h[var1] = 0;
                     if (var5.g[var1] > 1) {
                        var5.g[var1] = 0;
                        var5.b[var1] = false;
                        var5.a[var1] = cq.b(-10, main.a.i + 300) + GameSrc.k;
                        var5.b[var1] = cq.b(-100, 0) + GameSrc.l;
                     }
                  }
               }

               ++var1;
            }
         case 1:
         case 2:
         case 5:
         case 6:
         case 7:
         case 11:
            var1 = 0;

            for(; var1 < var5.m; ++var1) {
               int var4;
               byte var8;
               if (var1 % 3 != 0) {
                  var4 = var5.a[var1];
                  int var3 = var5.b[var1];
                  if (TileMap.e == 15) {
                     var8 = 10;
                  } else {
                     var8 = 0;
                  }

                  if (TileMap.a(var4, var8 + var3, 2)) {
                     var5.b[var1] = true;
                  }
               }

               if (var1 % 3 == 0 && var5.b[var1] > TileMap.d) {
                  var5.a[var1] = cq.b(-10, TileMap.c + 50);
                  var5.b[var1] = cq.b(-50, 0);
               }

               if (var5.b[var1]) {
                  var6 = var5.h;
                  var10002 = var6[var1]++;
                  if (var5.h[var1] == 100) {
                     var5.h[var1] = 0;
                     var5.a[var1] = cq.b(-10, TileMap.c + 50);
                     var5.b[var1] = cq.b(-50, 0);
                     var5.b[var1] = false;
                  }
               } else {
                  for(var2 = 0; var2 < bn.a.size(); ++var2) {
                     bn var12 = (bn)bn.a.elementAt(var2);
                     if (var12 != null && var12.a && var5.a[var1] < var12.a + 80 && var5.a[var1] > var12.a - 80 && var5.b[var1] < var12.b + 80 && var5.b[var1] > var12.b - 80) {
                        int[] var7 = var5.a;
                        var4 = var7[var1];
                        byte var9;
                        if (var5.a[var1] < var12.a) {
                           var9 = -10;
                        } else {
                           var9 = 10;
                        }

                        var7[var1] = var9 + var4;
                     }
                  }

                  var6 = var5.b;
                  var6[var1] += var5.d[var1];
                  var6 = var5.a;
                  var6[var1] += var5.c[var1];
                  var6 = var5.h;
                  var10002 = var6[var1]++;
                  if (var5.a == 11) {
                     var8 = 3;
                  } else {
                     var8 = 4;
                  }

                  var4 = var5.h[var1];
                  byte var10;
                  if (var5.a != 2) {
                     var10 = 2;
                  } else {
                     var10 = 4;
                  }

                  if (var4 > var10) {
                     if (var5.a != 11) {
                        var6 = var5.g;
                        var10002 = var6[var1]++;
                     }

                     var5.h[var1] = 0;
                     if (var5.g[var1] > var8 - 1) {
                        var5.g[var1] = 0;
                     }
                  }
               }
            }
         case 3:
         default:
            break;
         case 4:
            var1 = 0;

            while(true) {
               if (var1 >= var5.m) {
                  continue label233;
               }

               var6 = var5.h;
               var10002 = var6[var1]++;
               if (var5.h[var1] > 10) {
                  var6 = var5.j;
                  var10002 = var6[var1]++;
                  var5.h[var1] = 0;
                  if (var5.j[var1] > 5) {
                     var5.j[var1] = 0;
                  }

                  var5.g[var1] = var5.i[var5.j[var1]];
               }

               ++var1;
            }
         case 8:
            ++var5.j;
            if (var5.j == 3) {
               var5.j = 0;
               ++var5.i;
               if (var5.i > 1) {
                  var5.i = 0;
               }
            }

            if (main.a.g % var5.k == 0) {
               var5.b = true;
            }

            if (var5.b) {
               if (var5.g == 1) {
                  var5.e += var5.l;
                  if (var5.e > TileMap.c + 50) {
                     var5.d();
                  }
               } else if (var5.g == 2) {
                  var5.e -= var5.l;
                  if (var5.e < -50) {
                     var5.d();
                  }
               } else if (var5.g == 3) {
                  var5.f += var5.l;
                  if (var5.f > TileMap.d + 50) {
                     var5.d();
                  }
               } else if (var5.g == 4) {
                  var5.f -= var5.l;
                  if (var5.f < -50) {
                     var5.d();
                  }
               }
            }
            break;
         case 9:
            var1 = 0;

            while(true) {
               if (var1 >= var5.d) {
                  continue label233;
               }

               var6 = var5.a;
               var6[var1] -= var5.c[var1];
               if (var5.a[var1] < -var5.c[var1]) {
                  e[var1] = cq.f(cq.b(1, 3));
                  var5.c[var1] = e[var1];
                  var5.a[var1] = main.a.i + var5.c[var1];
               }

               ++var1;
            }
         case 10:
            var1 = 0;

            while(true) {
               if (var1 >= var5.d) {
                  continue label233;
               }

               var6 = var5.a;
               var6[var1] -= var5.c[var1];
               if (var5.a[var1] < -var5.c[var1] + GameSrc.k) {
                  var5.a[var1] = main.a.i + var5.c[var1] + GameSrc.k;
               }

               ++var1;
            }
         case 13:
            if (dz.a == 1 || main.a.b || b <= 0) {
               break;
            }

            if (main.a.a == GameSrc.a()) {
               var1 = TileMap.c;
            } else {
               var1 = GameSrc.k + main.a.i;
            }

            var2 = 0;

            while(true) {
               if (var2 >= b) {
                  continue label233;
               }

               int[] var11 = main.a.c;
               var11[var2] -= var2 + 1;
               if (main.a.c[var2] < -p) {
                  main.a.c[var2] = var1 + 100;
               }

               ++var2;
            }
         case 14:
            if (dz.a != 1 && !main.a.b && a) {
               var1 = q - 1;
               q = var1;
               if (var1 < -r) {
                  q = 0;
               }
            }
         }
      }

   }

   public static void b(dm var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         da var4 = (da)a.elementAt(var1);
         if (var4.a == 10) {
            var0.a(var4.o);

            for(int var2 = 0; var2 < var4.d; ++var2) {
               Image var3;
               if (var2 < var4.d / 2) {
                  var3 = j;
               } else {
                  var3 = i;
               }

               var0.a(var3, var4.a[var2], var4.b[var2] + var4.n, 0);
            }
         }
      }

   }

   private static void c() {
      if (dz.a == 1) {
         m = null;
         n = null;
      } else if (main.a.b) {
         m = null;
         n = null;
      } else {
         if (b > 0) {
            if (m == null) {
               Image var0 = dz.b("/bg/fog1.png");
               m = var0;
               p = var0.getWidth();
            }
         } else {
            m = null;
         }

         if (!a) {
            n = null;
         } else {
            if (n == null) {
               n = dz.b("/bg/fog0.png");
            }

            r = 287;
         }
      }

   }

   public static void c(dm var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         da var3 = (da)a.elementAt(var1);
         switch(var3.a) {
         case 8:
            var0.a(f, 0, 0, f.getWidth(), f.getHeight(), var3.h, var3.e, var3.f, 3);
            byte var2;
            if (var3.g != 1 && var3.g != 2) {
               if (var3.h == 0) {
                  var2 = 11;
               } else {
                  var2 = -11;
               }

               var0.a(h, 0, var3.i * 18, 8, 18, var3.h, var3.e + var2, var3.f + 22, 3);
               break;
            }

            if (var3.h == 0) {
               var2 = -25;
            } else {
               var2 = 25;
            }

            var0.a(g, 0, var3.i << 3, 20, 8, var3.h, var3.e + var2, var3.f + 5, 3);
            break;
         case 13:
            if (c) {
               g(var0);
            }
         }
      }

   }

   private void d() {
      byte var1 = 0;
      byte var2 = 0;
      int var3 = GameSrc.k;
      int var4 = GameSrc.l;
      this.g = cq.b(1, 3);
      this.b = false;
      this.l = cq.b(3, 5);
      if (this.g == 1) {
         this.e = -50;
         this.f = cq.b(var4, main.a.j - 100 + var4);
         var1 = var2;
      } else {
         label38: {
            if (this.g == 2) {
               this.e = TileMap.c + 50;
               this.f = cq.b(var4, main.a.j - 100 + var4);
            } else {
               if (this.g == 3) {
                  this.e = cq.b(var3 + 50, var3 + (main.a.i - 50));
                  this.f = -50;
                  if (cq.b(0, 2) != 0) {
                     var1 = 2;
                  }

                  this.h = var1;
                  return;
               }

               if (this.g != 4) {
                  return;
               }

               this.e = cq.b(var3 + 50, var3 + (main.a.i - 50));
               this.f = TileMap.d + 50;
               if (cq.b(0, 2) == 0) {
                  var1 = var2;
                  break label38;
               }
            }

            var1 = 2;
         }
      }

      this.h = var1;
   }

   public static void d(dm var0) {
      label65:
      for(int var1 = 0; var1 < a.size(); ++var1) {
         da var6 = (da)a.elementAt(var1);
         switch(var6.a) {
         case 0:
         case 12:
            int var7 = 0;

            while(true) {
               if (var7 >= var6.m) {
                  continue label65;
               }

               if (var6.f[var7] == 2 && var6.a[var7] >= GameSrc.k && var6.a[var7] <= main.a.i + GameSrc.k && var6.b[var7] >= GameSrc.l && var6.b[var7] <= main.a.j + GameSrc.l) {
                  if (var6.b[var7]) {
                     var0.a(a, 0, var6.g[var7] * 10, 13, 10, 0, var6.a[var7], var6.b[var7] - 10, 0);
                  } else {
                     var0.a(b, var6.a[var7], var6.b[var7], 0);
                  }
               }

               ++var7;
            }
         case 1:
         case 2:
         case 5:
         case 6:
         case 7:
         case 11:
            Image var5 = e;
            byte var2;
            if (var6.a == 11) {
               var2 = 3;
            } else {
               var2 = 4;
            }

            for(int var3 = 0; var3 < var6.m; ++var3) {
               if (var3 % 3 == 0 && var6.a[var3] >= GameSrc.k && var6.a[var3] <= main.a.i + GameSrc.k && var6.b[var3] >= GameSrc.l && var6.b[var3] <= main.a.j + GameSrc.l) {
                  int var4 = dm.b(var5) / var2;
                  var0.a(var5, 0, var6.g[var3] * var4, dm.a(var5), dm.b(var5) / var2, 0, var6.a[var3], var6.b[var3], 0);
               }
            }
         case 3:
         case 4:
         case 8:
         case 9:
         case 10:
         default:
            break;
         case 13:
            if (!c) {
               g(var0);
            }
         }
      }

   }

   public static void e(dm var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         da var4 = (da)a.elementAt(var1);
         var0.a(-var0.a(), -var0.b());
         int var2;
         if (var4.a == 4) {
            for(var2 = 0; var2 < var4.m; ++var2) {
               var0.a(d, 0, var4.g[var2] * 16, 16, 16, 0, var4.a[var2], var4.b[var2], 0);
            }
         }

         if (var4.a == 9) {
            var0.a(16777215);

            for(var2 = 0; var2 < var4.d; ++var2) {
               Image var3;
               if (e[var2] == 1) {
                  var3 = k;
               } else {
                  var3 = l;
               }

               var0.a(var3, var4.a[var2], var4.b[var2], 3);
            }
         }
      }

   }

   public static void f(dm var0) {
      label59:
      for(int var1 = 0; var1 < a.size(); ++var1) {
         da var5 = (da)a.elementAt(var1);
         switch(var5.a) {
         case 0:
            var0.a(10742731);
            int var7 = 0;

            while(true) {
               if (var7 >= var5.m) {
                  continue label59;
               }

               if (var5.f[var7] != 2 && var5.a[var7] >= GameSrc.k && var5.a[var7] <= main.a.i + GameSrc.k && var5.b[var7] >= GameSrc.l && var5.b[var7] <= main.a.j + GameSrc.l) {
                  var0.a(c, var5.a[var7], var5.b[var7], 0);
               }

               ++var7;
            }
         case 1:
         case 2:
         case 5:
         case 6:
         case 7:
         case 11:
            Image var6 = e;
            byte var2;
            if (var5.a == 11) {
               var2 = 3;
            } else {
               var2 = 4;
            }

            for(int var3 = 0; var3 < var5.m; ++var3) {
               if (var3 % 3 != 0 && var5.a[var3] >= GameSrc.k && var5.a[var3] <= main.a.i + GameSrc.k && var5.b[var3] >= GameSrc.l && var5.b[var3] <= main.a.j + GameSrc.l) {
                  int var4 = dm.b(var6) / var2;
                  var0.a(var6, 0, var5.g[var3] * var4, dm.a(var6), dm.b(var6) / var2, 0, var5.a[var3], var5.b[var3], 0);
               }
            }
         case 3:
         case 4:
         case 8:
         case 9:
         case 10:
         }
      }

   }

   private static void g(dm var0) {
      if (dz.a != 1 && !main.a.b && b != 0 && m != null) {
         for(int var1 = 0; var1 < b; ++var1) {
            var0.a(m, (float)main.a.c[var1], (float)main.a.d[var1], 3);
         }
      }

   }
}
