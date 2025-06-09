package pasta;

import javax.microedition.lcdui.Image;

public final class v extends ag {
   public static int a;
   private static Image a;
   public static MyVector a;
   public static ce a;
   private static v a;
   private static boolean a;
   private static int[] a = new int[0];
   private static Image[] a;
   private static int[][] a;
   public static int b;
   private static Image b;
   public static MyVector b;
   private static ce b;
   private static int[] b = new int[0];
   private static int[][] b;
   public static int c;
   private static Image c;
   private static ce c;
   private static int[] c;
   public static int d;
   private static Image d;
   private static Image e;
   private static Image f;
   private static Image g;
   private static Image h;
   private static int i;
   private static Image i;
   private static int j;
   private static Image j;
   private static int k;
   private static Image k;
   private static int l;
   private static Image l;
   private static int m;
   private static Image m;
   private static int n;
   private static Image n;
   private static int o;
   private static int p;
   private static int u;
   private dc a;
   private int[] d;
   private int q;
   private int r;
   private int s;
   private int t = 0;
   private int v = 0;
   private int w = 0;
   private int x;
   private int y;
   private int z;

   static {
      int[] var0 = new int[]{-2, -1, 0, 1, 2};
      c = var0;
   }

   public v() {
      a = true;
      Image var19 = dz.b("/radar/17.png");
      Image var20 = dz.b("/radar/3.png");
      Image var21 = dz.b("/radar/23.png");
      b = new ce(var19, 28, 28);
      c = new ce(var20, 30, 30);
      a = new ce(var21, 11, 11);
      a = dz.b("/radar/0.png");
      c = dz.b("/radar/1.png");
      d = dz.b("/radar/2.png");
      b = dz.b("/radar/17.png");
      e = dz.b("/radar/4.png");
      f = dz.b("/radar/5.png");
      g = dz.b("/radar/6.png");
      a = new Image[7];

      int var1;
      for(var1 = 0; var1 < 7; ++var1) {
         a[var1] = dz.b("/radar/" + (var1 + 7) + ".png");
      }

      h = dz.b("/radar/14.png");
      i = dz.b("/radar/15.png");
      j = dz.b("/radar/16.png");
      b = dz.b("/radar/18.png");
      l = dz.b("/radar/19.png");
      m = dz.b("/radar/20.png");
      n = dz.b("/radar/21.png");
      k = dz.b("/radar/22.png");
      k = 200;
      l = 219;
      i = main.a.k - (k + 40) / 2;
      j = main.a.l - l / 2;
      a = i + k - 81;
      b = j + 29;
      c = 120;
      d = 80;
      int var6 = i;
      int var5 = j;
      int var10 = l;
      int var2 = i;
      int var3 = k / 2;
      var1 = e.getWidth() / 2;
      int var9 = j;
      int var8 = l / 2;
      int var7 = i;
      int var4 = k;
      int var12 = j;
      int var11 = l;
      a = new int[][]{{var6 + 34, var5 + var10 - 42}, {var2 + var3 - var1, var9 + var8 + 33}, {var7 + var4 - 41, var12 + var11 - 42}};
      var2 = i;
      int var15 = j;
      var11 = l;
      var1 = i;
      int var18 = j;
      var6 = l;
      var9 = i;
      int var14 = k / 2;
      var5 = j;
      var10 = l;
      var3 = i;
      var7 = k;
      var8 = j;
      int var16 = l;
      var4 = i;
      int var13 = k;
      int var17 = j;
      var12 = l;
      b = new int[][]{{var2 + 25, var15 + var11 - 82}, {var1 + 57, var18 + var6 - 62}, {var9 + var14 - 14, var5 + var10 - 102}, {var3 + var7 - 57 - 28, var8 + var16 - 62}, {var4 + var13 - 25 - 28, var17 + var12 - 82}};
      this.d = new int[2];
      this.q = 0;
      m = i + 73;
      n = j + l / 2 + 5;
      p = j + l - 22;
      a = new int[]{i + k / 2 - 8 - 80, i + k / 2 - 8, i + k / 2 - 8 + 80};
      b = new int[3];
      this.y = b + 10 + 70;
      this.z = 0;
      a = new MyVector("");
      b = new MyVector("");
      this.r = 1;
      this.s = 2;
   }

   public static v a() {
      if (a == null) {
         a = new v();
      }

      return a;
   }

   private void c(int var1) {
      byte var2 = 1;
      byte var3 = 1;
      if (var1 == 0) {
         boolean var4;
         if (a) {
            var4 = false;
         } else {
            var4 = true;
         }

         a = var4;
         this.r = 1;
         this.t = 0;
         byte var5;
         if (a) {
            int var6 = a.size() / 5;
            if (a.size() % 5 > 0) {
               var5 = var3;
            } else {
               var5 = 0;
            }

            this.s = var6 + var5;
         } else {
            int var7 = b.size() / 5;
            if (b.size() % 5 > 0) {
               var5 = var2;
            } else {
               var5 = 0;
            }

            this.s = var7 + var5;
         }

         this.e();
         d = 0;
      } else if (var1 == 1) {
         if (this.a != null) {
            av.a().b((int)1, (int)this.a.a);
         }
      } else if (var1 == 2) {
         GameSrc.a().a();
      }

      aw.a();
   }

   private void d(int var1) {
      byte var2 = 0;
      byte var4 = 0;
      byte var3 = 1;
      if (a) {
         int var5 = a.size() / 5;
         var2 = var4;
         if (a.size() % 5 > 0) {
            var2 = 1;
         }

         this.s = var2 + var5;
      } else {
         int var7 = b.size() / 5;
         if (b.size() % 5 > 0) {
            var2 = 1;
         }

         this.s = var2 + var7;
      }

      int var6 = this.r;
      if (var1 == 0) {
         if (this.r == 1) {
            return;
         }

         var1 = var6 - 1;
         if (var1 <= 0) {
            var1 = var3;
         }
      } else {
         if (this.r == this.s) {
            return;
         }

         ++var6;
         var1 = var6;
         if (var6 > this.s) {
            var1 = this.s;
         }
      }

      if (var1 != this.r) {
         this.r = var1;
         this.e();
      }

   }

   private void e() {
      MyVector var3 = b;
      if (a) {
         var3 = a;
      }

      int var2 = (this.r - 1) * 5;

      for(int var1 = var2; var1 < var2 + 5; ++var1) {
         if (var1 >= var3.size()) {
            c[var1 - var2] = -1;
         } else {
            dc var4 = (dc)var3.elementAt(var1);
            if (var4 != null) {
               c[var1 - var2] = var4.a;
            }
         }
      }

      aw.a();
   }

   private void e(int var1) {
      var1 = o + var1 * 12;
      o = var1;
      if (var1 < 0) {
         o = 0;
      }

      if (o > this.a.a.g) {
         o = this.a.a.g;
      }

   }

   private void f(int var1) {
      int var2 = this.t;
      int var3 = this.r;
      if (var1 == 0) {
         var1 = var2 + 1;
      } else {
         var1 = var2 - 1;
      }

      if (var1 >= c.length) {
         if (this.r < this.s) {
            var1 = var3 + 1;
            var2 = 0;
         } else {
            var2 = c.length - 1;
            var1 = var3;
         }
      } else {
         var2 = var1;
         var1 = var3;
      }

      if (var2 < 0) {
         if (this.r > 1) {
            var2 = c.length - 1;
            --var1;
         } else {
            var2 = 0;
         }
      }

      if (var2 != this.t) {
         this.t = var2;
         o = 0;
         d = 0;
      }

      if (var1 != this.r) {
         this.r = var1;
         this.e();
      }

   }

   public static void goToMap(int var0) {
      u = var0;
   }

   public static void onCancelChat() {
      b = new MyVector("");

      for(int var0 = 0; var0 < a.size(); ++var0) {
         dc var1 = (dc)a.elementAt(var0);
         if (var1 != null && var1.f == 1) {
            b.addElement(var1);
         }
      }

   }

   public final void a() {
      GameSrc.a = true;
      super.a();
   }

   public final void a(MyVector var1, int var2, int var3) {
      byte var6 = 1;
      byte var4 = 1;
      a = var1;
      u = var2;
      this.r = 1;
      this.t = 2;
      this.e();
      a = true;
      onCancelChat();
      byte var5;
      if (a) {
         var3 = var1.size() / 5;
         if (var1.size() % 5 > 0) {
            var5 = var4;
         } else {
            var5 = 0;
         }

         this.s = var5 + var3;
      } else {
         int var7 = b.size() / 5;
         if (b.size() % 5 > 0) {
            var5 = var6;
         } else {
            var5 = 0;
         }

         this.s = var5 + var7;
      }

   }

   public final void a(dm var1) {
      Exception var10000;
      label216: {
         int var2;
         int var3;
         boolean var10001;
         label217: {
            Image var6;
            try {
               GameSrc.a().a(var1);
               var1.a(-GameSrc.k, -GameSrc.l);
               var1.a(0, main.a.o);
               GameSrc.c(var1);
               var1.a(a, i, j, 0);
               var1.a(m, i + k / 2 - m.getWidth() / 2, j - m.getHeight() / 2 - 2, 0);
               var1.f(i + k / 2 - m.getWidth() / 2 + 13, j - m.getHeight() / 2 + 3, this.x, m.getHeight());
               var1.a(n, i + k / 2 - m.getWidth() / 2 + 13, j - m.getHeight() / 2 + 3, 0);
               GameSrc.c(var1);
               var1.a(j, a[0], p + b[0], 0);
               var1.a(g, a[1], p + b[1], 0);
               var1.a(i, a[2], p + b[2], 0);
               if (a) {
                  var6 = h;
                  var2 = a[1];
                  var3 = p;
                  var1.a(var6, 0, 0, 17, 17, 0, var2, b[1] + var3, 0);
                  break label217;
               }
            } catch (Exception var29) {
               var10000 = var29;
               var10001 = false;
               break label216;
            }

            try {
               var6 = h;
               var3 = a[1];
               var2 = p;
               var1.a(var6, 0, 0, 17, 17, 1, var3, b[1] + var2, 0);
            } catch (Exception var28) {
               var10000 = var28;
               var10001 = false;
               break label216;
            }
         }

         dc var32;
         label218: {
            try {
               if (this.a == null) {
                  break label218;
               }

               var1.f(i + 30, j + 13, k - 60, l / 2);
               var32 = this.a;
               var3 = m;
               var2 = n;
               ++var32.d;
               if (var32.d > var32.a.length - 1) {
                  var32.d = 0;
               }
            } catch (Exception var27) {
               var10000 = var27;
               var10001 = false;
               break label216;
            }

            label219: {
               label220: {
                  try {
                     if (var32.d == 0) {
                        if (pasta.i.a[var32.a.r] == null) {
                           break label219;
                        }

                        if (pasta.i.a[var32.a.r].a == null) {
                           break label220;
                        }

                        pasta.i.a[var32.a.r].a.a(var1, var32.a[var32.d], var3, var2, 0, 0);
                        break label219;
                     }
                  } catch (Exception var26) {
                     var10000 = var26;
                     var10001 = false;
                     break label216;
                  }

                  try {
                     if (var32.a != null) {
                        var32.a.a(var1, var3, var2, 1, var32.a[var32.d], true);
                     }
                     break label219;
                  } catch (Exception var25) {
                     var10000 = var25;
                     var10001 = false;
                     break label216;
                  }
               }

               try {
                  if (var32.a - main.a.a < 0L) {
                     var32.a = main.a.a + 1500L;
                     var32.a.a();
                  }
               } catch (Exception var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label216;
               }
            }

            cg var7;
            StringBuffer var8;
            String var33;
            label175: {
               try {
                  GameSrc.c(var1);
                  var7 = cg.d;
                  var8 = new StringBuffer;
                  if (this.a.e > 0) {
                     StringBuffer var34 = new StringBuffer("Lv.");
                     var33 = var34.append(this.a.e).append(" ").toString();
                     break label175;
                  }
               } catch (Exception var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label216;
               }

               var33 = "";
            }

            try {
               var8.<init>(String.valueOf(var33));
               var33 = var8.append(this.a.a).toString();
               var2 = i;
               var7.a(var1, var33, k / 2 + var2, j + 15, 2);
               cg var36 = cg.s;
               StringBuffer var35 = new StringBuffer("no.");
               var36.a(var1, var35.append(this.a.b).toString(), i + 30, b - 2, 0);
               var1.a(k, i + 36, b + 10, 0);
               var1.f(i + 36, this.y - this.z, 7, this.z);
               var1.a(l, i + 36, b + 10, 0);
               GameSrc.c(var1);
               var1.a(a[this.a.a], i + 39 - 5 + 14, b + 12, 0);
            } catch (Exception var22) {
               var10000 = var22;
               var10001 = false;
               break label216;
            }
         }

         try {
            var1.f(a, b, c + 5, d + 8);
            if (this.a != null) {
               var1.a(b, a, b, 0);
            }
         } catch (Exception var21) {
            var10000 = var21;
            var10001 = false;
            break label216;
         }

         label163: {
            try {
               GameSrc.c(var1);
               var1.f(a, b + 1, c, d + 5);
               if (this.a == null || this.a.a == null) {
                  break label163;
               }

               if (this.a.a.a == null) {
                  return;
               }
            } catch (Exception var20) {
               var10000 = var20;
               var10001 = false;
               break label216;
            }

            try {
               this.a.a.a(var1, o);
            } catch (Exception var19) {
               var10000 = var19;
               var10001 = false;
               break label216;
            }
         }

         label223: {
            label152: {
               try {
                  GameSrc.c(var1);
                  if (!a && b.size() > 5) {
                     break label152;
                  }
               } catch (Exception var18) {
                  var10000 = var18;
                  var10001 = false;
                  break label216;
               }

               try {
                  if (!a) {
                     break label223;
                  }
               } catch (Exception var17) {
                  var10000 = var17;
                  var10001 = false;
                  break label216;
               }
            }

            try {
               if (this.r > 1) {
                  var1.a(c, a[0][0], a[0][1] + this.d[0], 0);
               }
            } catch (Exception var16) {
               var10000 = var16;
               var10001 = false;
               break label216;
            }

            try {
               if (this.r < this.s) {
                  var1.a(d, a[2][0], a[2][1] + this.d[1], 0);
               }
            } catch (Exception var15) {
               var10000 = var15;
               var10001 = false;
               break label216;
            }
         }

         var2 = 0;

         while(true) {
            int var4;
            byte var5;
            byte var31;
            label132: {
               label131: {
                  try {
                     if (var2 >= c.length) {
                        return;
                     }

                     if (var2 != this.t) {
                        break label131;
                     }

                     var4 = this.q;
                     var1.a(e, b[var2][0] + 10, b[var2][1] + this.q + 29 - 10, 0);
                  } catch (Exception var14) {
                     var10000 = var14;
                     var10001 = false;
                     break;
                  }

                  var31 = -10;
                  var5 = 1;
                  break label132;
               }

               var31 = 0;
               var5 = 0;
               var4 = 0;
            }

            try {
               var32 = dc.a(b, c[var2]);
               if (a) {
                  var32 = dc.a(a, c[var2]);
               }
            } catch (Exception var12) {
               var10000 = var12;
               var10001 = false;
               break;
            }

            if (var32 != null) {
               try {
                  b.a(var32.a, b[var2][0], b[var2][1] + var4 + var31, 0, 0, var1);
                  ao.a(var1, var32.c, b[var2][0] + 14, b[var2][1] + 14 + var4 + var31, 0, bk.f);
                  var32.a(var1, b[var2][0], b[var2][1] + var4 + var31);
                  if (var32.e == 0) {
                     var1.a(f, b[var2][0], b[var2][1] + var4 + var31, 0);
                  }
               } catch (Exception var10) {
                  var10000 = var10;
                  var10001 = false;
                  break;
               }

               try {
                  if (var2 == this.t) {
                     b.a(7, b[var2][0], b[var2][1] + var4 + var31, 0, 0, var1);
                  }
               } catch (Exception var13) {
                  var10000 = var13;
                  var10001 = false;
                  break;
               }

               try {
                  if (var32.f == 1) {
                     b.a(8, b[var2][0], b[var2][1] + var4 + var31, 0, 0, var1);
                  }
               } catch (Exception var9) {
                  var10000 = var9;
                  var10001 = false;
                  break;
               }
            } else {
               try {
                  c.a(var5, b[var2][0] - 1, b[var2][1] - 1 + var4 + var31, 0, 0, var1);
               } catch (Exception var11) {
                  var10000 = var11;
                  var10001 = false;
                  break;
               }
            }

            ++var2;
         }
      }

      Exception var30 = var10000;
      System.out.println("-paint-radaScr-null: " + var30.toString());
   }

   public final void b() {
      Exception var10000;
      label62: {
         boolean var10001;
         label58: {
            int var1;
            try {
               if (d >= 80) {
                  break label58;
               }

               var1 = d + 4;
               d = var1;
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
               break label62;
            }

            if (var1 > 80) {
               try {
                  d = 80;
               } catch (Exception var7) {
                  var10000 = var7;
                  var10001 = false;
                  break label62;
               }
            }
         }

         try {
            this.a = dc.a(b, c[this.t]);
            if (a) {
               this.a = dc.a(a, c[this.t]);
            }
         } catch (Exception var6) {
            var10000 = var6;
            var10001 = false;
            break label62;
         }

         label63: {
            try {
               GameSrc.a().b();
               if (main.a.g % 10 < 6) {
                  if (main.a.g % 2 == 0) {
                     --this.q;
                  }
                  break label63;
               }
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
               break label62;
            }

            try {
               this.q = 0;
            } catch (Exception var4) {
               var10000 = var4;
               var10001 = false;
               break label62;
            }
         }

         try {
            if (this.a != null) {
               this.z = this.a.b * 100 / this.a.c * l.getHeight() / 100;
               this.x = u * 100 / a.size() * n.getWidth() / 100;
            }

            return;
         } catch (Exception var3) {
            var10000 = var3;
            var10001 = false;
         }
      }

      Exception var2 = var10000;
      System.out.println("-upd-radaScr-null: " + var2.toString());
   }

   public final void c() {
      if (!pasta.a.b) {
         if (main.a.e && !bq.a().a && !main.a.a.a) {
            if (main.a.i) {
               int var1;
               for(var1 = 0; var1 < 5; ++var1) {
                  if (main.a.a(b[var1][0], b[var1][1], 30, 30) && main.a.i && main.a.j && var1 != this.t) {
                     this.t = var1;
                     d = 0;
                  }
               }

               if (main.a.a(a[0][0] - 5, a[0][1] - 5, 20, 20)) {
                  if (main.a.h) {
                     this.d[0] = 1;
                  }

                  if (main.a.i && main.a.j) {
                     this.d(0);
                     this.d[0] = 0;
                  }
               }

               if (main.a.a(a[2][0] - 5, a[2][1] - 5, 20, 20)) {
                  if (main.a.h) {
                     this.d[1] = 1;
                  }

                  if (main.a.i && main.a.j) {
                     this.d(1);
                     this.d[1] = 0;
                  }
               }

               for(var1 = 0; var1 < a.length; ++var1) {
                  if (main.a.a(a[var1] - 5, p - 5, 20, 20)) {
                     if (main.a.h) {
                        b[var1] = 1;
                     }

                     if (main.a.i && main.a.j) {
                        this.c(var1);
                        b[var1] = 0;
                     }
                  }
               }
            } else {
               b[0] = 0;
               b[1] = 0;
               b[2] = 0;
               this.d[0] = 0;
               this.d[1] = 0;
            }

            if (main.a.a(a, 0, c, b + d)) {
               if (main.a.k) {
                  if (this.w == 0) {
                     this.w = main.a.b;
                  }

                  this.v = this.w - main.a.b;
                  if (this.v != 0) {
                     o += this.v;
                     this.w = main.a.b;
                  }

                  if (o < 0) {
                     o = 0;
                  }

                  if (o > this.a.a.g) {
                     o = this.a.a.g;
                  }
               } else {
                  this.w = 0;
                  this.w = 0;
               }
            }
         }

         if (main.a.a[8]) {
            main.a.a[8] = false;
            this.e(1);
         }

         if (main.a.a[2]) {
            main.a.a[2] = false;
            this.e(-1);
         }

         if (main.a.a[4]) {
            main.a.a[4] = false;
            this.f(1);
         }

         if (main.a.a[6]) {
            main.a.a[6] = false;
            this.f(0);
         }

         if (main.a.a[12]) {
            main.a.a[12] = false;
            this.c(0);
         }

         if (main.a.a[5]) {
            main.a.a[5] = false;
            this.c(1);
         }

         if (main.a.a[13]) {
            this.c(2);
         }

         main.a.onCancelChat();
      }

   }
}
