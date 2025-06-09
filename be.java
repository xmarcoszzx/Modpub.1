package pasta;

import javax.microedition.lcdui.Image;

public final class be extends i implements as {
   private static bl a;
   private static Image b = dz.b("/mainImage/shadowBig.png");
   private int A;
   private int B;
   private int C;
   private int D;
   private int E;
   private int F;
   private int[] a;
   private Char[] a;
   private byte b;
   private int[] b;
   private int[] c;
   private int[] d;
   private int[] e;
   private int[] f;
   private int[] g;
   private int[] h;
   private int[] i;
   private int[] j;
   public boolean m;
   private boolean n;
   private boolean o = true;
   private boolean p;
   private boolean q;
   private boolean r;
   public int y;
   private int z;

   public be(int var1, short var2, short var3, int var4, int var5, int var6) {
      int[] var7 = new int[12];
      var7[8] = 1;
      var7[9] = 1;
      var7[10] = 1;
      var7[11] = 1;
      this.b = var7;
      this.c = new int[]{37, 37, 37, 38, 38, 38, 39, 39, 40, 40, 40, 39, 39, 39, 38, 38, 38};
      var7 = new int[]{0, 0, 34, 34, 35, 35, 36, 36, 2, 2, 1, 1};
      this.d = var7;
      var7 = new int[]{0, 0, 0, 4, 4, 6, 6, 9, 9, 10, 10, 13, 13, 15, 15, 17, 17, 19, 19, 21, 21, 23, 23};
      this.e = var7;
      var7 = new int[]{0, 0, 1, 1, 4, 4, 6, 6, 8, 8, 25, 25, 26, 26, 28, 28, 30, 30, 32, 32, 2, 2, 1, 1};
      this.f = var7;
      this.g = new int[]{37, 37, 5, 5, 7, 7, 11, 11, 14, 14, 16, 16, 18, 18, 20, 20, 22, 22, 24, 24};
      this.h = new int[]{37, 37, 37, 38, 38, 5, 5, 7, 7, 11, 11, 27, 27, 29, 29, 31, 31, 33, 33, 38, 38};
      this.i = new int[]{8, 8, 9, 9, 10, 10, 12, 12};
      var7 = new int[]{0, 0, 1, 1, 4, 4, 6, 6, 8, 8, 25, 25, 26, 26, 28, 28, 30, 30, 32, 32, 2, 2, 1, 1};
      this.j = var7;
      int var9 = var2 + 20;
      super.e = var9;
      super.l = var9;
      super.f = var3;
      super.m = var3;
      super.q = var1;
      super.c = var4;
      super.d = var5;
      super.r = 70;
      if (var6 == 0) {
         a = null;
         a = new bl();
         String var10 = "/x" + dm.a + "/effectdata/101" + "/data";

         try {
            a.b(var10);
            a.a = dz.c("/effectdata/101/img.png");
         } catch (Exception var8) {
            av.a().e(super.r);
         }

         super.n = a.b;
         super.o = a.c;
      }

      if (var6 == 1) {
         this.m();
      }

      if (var6 == 2) {
         this.m();
         this.m = true;
      }

      super.h = 2;
   }

   public final int a() {
      return super.e;
   }

   public final void a(Char var1) {
      super.a = var1;
      super.i = 0;
      super.j = 0;
      super.h = 3;
      this.C = 0;
      byte var2;
      if (var1.b > super.e) {
         var2 = 1;
      } else {
         var2 = -1;
      }

      super.g = var2;
      int var4 = var1.b;
      int var3 = var1.c;
      if (cq.f(var4 - super.e) < super.n << 1 && cq.f(var3 - super.f) < super.o << 1) {
         if (super.e < var4) {
            super.e = var4 - super.n;
         } else {
            super.e = var4 + super.n;
         }

         super.k = 0;
      } else {
         super.k = 1;
      }

   }

   public final void a(dm var1) {
      if (a != null) {
         if (this.o && super.h != 0) {
            var1.a(b, this.z, super.m, 3);
            var1.f(GameSrc.k, GameSrc.l - main.a.o, GameSrc.a, GameSrc.b + main.a.o * 2);
         }

         var1.a(0, main.a.o);
         bl var6 = a;
         int var4 = this.D;
         int var5 = super.e;
         int var3 = super.f;
         byte var2;
         if (super.g == 1) {
            var2 = 0;
         } else {
            var2 = 1;
         }

         var6.a(var1, var4, var5, var3, var2, 2);
         var1.a(0, -main.a.o);
         int var7 = (int)((long)super.c * 50L / (long)super.d);
         if (var7 != 0) {
            var1.a(0);
            var1.e(super.e - 27, super.f - 112, 54, 8);
            var1.a(16711680);
            var1.e(super.e - 25, super.f - 110, var7, 4);
         }

         if (this.r) {
            ++this.F;
            if (this.b == 2) {
               var2 = 19;
            } else {
               var2 = 22;
            }

            dh.a(new cx(var2, super.e + this.F * 50, super.f + 25, 2, 1, -1));
            if (this.b == 2) {
               var2 = 19;
            } else {
               var2 = 22;
            }

            dh.a(new cx(var2, super.e - this.F * 50, super.f + 25, 2, 1, -1));
            if (this.F == 50) {
               this.F = 0;
               this.r = false;
            }
         }
      }

   }

   public final void a(i var1) {
      super.a = null;
      super.i = 0;
      super.j = 0;
      super.h = 3;
      this.C = 0;
      byte var2;
      if (var1.e > super.e) {
         var2 = 1;
      } else {
         var2 = -1;
      }

      super.g = var2;
      int var4 = var1.e;
      int var3 = var1.f;
      if (cq.f(var4 - super.e) < super.n << 1 && cq.f(var3 - super.f) < super.o << 1) {
         if (super.e < var4) {
            super.e = var4 - super.n;
         } else {
            super.e = var4 + super.n;
         }

         super.k = 0;
      } else {
         super.k = 1;
      }

   }

   public final void a(short var1) {
      super.a = true;
      super.a = var1;
   }

   public final void a(int[] var1) {
      ++this.C;
      if (this.C > var1.length - 1) {
         this.C = 0;
      }

      this.D = var1[this.C];
   }

   public final void a(Char[] var1, int[] var2, byte var3) {
      this.a = var1;
      this.a = var2;
      this.b = var3;
      this.C = 0;
      if (var3 < 3) {
         super.h = 3;
      }

      if (var3 == 3) {
         this.p = true;
         super.h = 4;
      }

      if (var3 == 4) {
         for(int var4 = 0; var4 < this.a.length; ++var4) {
            this.a[var4].a(this.a[var4], 0, false, false);
         }
      }

      if (var3 == 7) {
         super.h = 3;
      }

   }

   public final int b() {
      int var1;
      if (this.m) {
         var1 = super.f - 20;
      } else {
         var1 = super.f - 60;
      }

      return var1;
   }

   public final void b() {
      super.a = false;
   }

   final boolean b() {
      boolean var1;
      if ((super.r < 58 || super.r > 65) && super.r != 67 && super.r != 68) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public final int c() {
      return 40;
   }

   public final void c() {
   }

   public final boolean c() {
      boolean var2 = false;
      boolean var1;
      if (super.e < GameSrc.k) {
         var1 = var2;
      } else {
         var1 = var2;
         if (super.e <= GameSrc.k + GameSrc.a) {
            var1 = var2;
            if (super.f >= GameSrc.l) {
               var1 = var2;
               if (super.f <= GameSrc.l + GameSrc.b + 30) {
                  var1 = var2;
                  if (super.h != 0) {
                     var1 = true;
                  }
               }
            }
         }
      }

      return var1;
   }

   public final int d() {
      return 60;
   }

   public final boolean d() {
      boolean var1;
      if (super.h == 0) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public final void e() {
   }

   public final boolean e() {
      boolean var1;
      if (!super.g && super.a <= 0) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public final void f() {
      byte var3 = -1;
      byte var1;
      int var2;
      if (this.b == 7) {
         if (this.C > 8) {
            this.C = 8;
         }

         this.a(this.d);
         if (main.a.g % 4 == 0) {
            var2 = super.e;
            if (super.g == 1) {
               var1 = 15;
            } else {
               var1 = -15;
            }

            pasta.y.a(70, var1 + var2, super.f - 40, 1);
         }
      }

      int var7;
      if (this.b == 0) {
         if (this.C == this.d.length - 1) {
            super.h = 2;
         }

         if (super.e < this.a[0].b) {
            var1 = 1;
         } else {
            var1 = -1;
         }

         super.g = var1;
         this.a(this.d);
         if (this.C == 8) {
            for(var7 = 0; var7 < this.a.length; ++var7) {
               int var4 = super.e;
               byte var6;
               if (super.g == 1) {
                  var6 = 45;
               } else {
                  var6 = -45;
               }

               pasta.n.a(var6 + var4, super.f - 30, true, this.a[var7], 0, this.a[var7], 24);
            }
         }
      }

      int[] var5;
      if (this.b == 1) {
         var2 = this.C;
         if (this.m) {
            var7 = this.g.length - 1;
         } else {
            var7 = this.e.length - 1;
         }

         if (var2 == var7) {
            super.h = 2;
         }

         if (super.e < this.a[0].b) {
            var1 = 1;
         } else {
            var1 = -1;
         }

         super.g = var1;
         if (this.m) {
            var5 = this.g;
         } else {
            var5 = this.e;
         }

         this.a(var5);
         super.e += (this.a[0].b - super.e) / 4;
         super.f += (this.a[0].c - super.f) / 4;
         if (this.C == 18) {
            for(var7 = 0; var7 < this.a.length; ++var7) {
               this.a[var7].a(this.a[var7], 0, false, false);
               pasta.y.a(102, this.a[var7].b, this.a[var7].c, 1);
            }
         }
      }

      if (this.b == 2) {
         var2 = this.C;
         if (this.m) {
            var7 = this.h.length - 1;
         } else {
            var7 = this.f.length - 1;
         }

         if (var2 == var7) {
            super.h = 2;
         }

         var1 = var3;
         if (super.e < this.a[0].b) {
            var1 = 1;
         }

         super.g = var1;
         if (this.m) {
            var5 = this.h;
         } else {
            var5 = this.f;
         }

         this.a(var5);
         if (this.C == 13) {
            GameSrc.J = 10;
            this.r = true;

            for(var7 = 0; var7 < this.a.length; ++var7) {
               this.a[var7].a(this.a[var7], 0, false, false);
            }
         }
      }

   }

   public final boolean f() {
      boolean var2 = true;
      boolean var1 = var2;
      if (super.h != 0) {
         var1 = var2;
         if (super.h != 1) {
            var1 = false;
         }
      }

      return var1;
   }

   public final void g() {
   }

   public final void h() {
      super.c = 0;
      super.c = 0;
      super.h = 1;
      super.i = -3;
      super.j = -super.g;
      super.k = 0;
   }

   public final void i() {
      if (super.h == 5) {
         super.h = 2;
         super.k = 0;
         super.j = 0;
         super.i = 0;
      }

   }

   public final void j() {
      if (super.b != 0) {
         super.b = 0;
      }

   }

   public final void k() {
   }

   public final void l() {
   }

   public final void m() {
      a = null;
      a = new bl();
      String var1 = "/x" + dm.a + "/effectdata/100" + "/data";

      try {
         a.b(var1);
         a.a = dz.c("/effectdata/100/img.png");
      } catch (Exception var2) {
         av.a().e(super.r);
      }

      super.h = 2;
      super.n = a.b;
      super.o = a.c;
   }

   public final void n() {
      super.h = 4;
      this.p = true;
   }

   public final void onCancelChat() {
      if (this.d()) {
         byte var1 = TileMap.a;
         this.z = super.e;
         this.B = 0;
         if (this.A > 0 && !TileMap.a(this.z, this.A, 2)) {
            if (TileMap.a(this.z / var1, this.A / var1) == 0) {
               this.n = true;
            } else if (TileMap.a(this.z / var1, this.A / var1) != 0 && !TileMap.a(this.z, this.A, 2)) {
               this.z = super.e;
               this.A = super.f;
               this.n = false;
            }

            while(this.n && this.B < 10) {
               ++this.B;
               this.A += 24;
               if (TileMap.a(this.z, this.A, 2)) {
                  if (this.A % 24 != 0) {
                     this.A -= this.A % 24;
                  }
                  break;
               }
            }
         }

         int[] var2;
         switch(super.h) {
         case 0:
         case 1:
            if (this.m) {
               var2 = this.c;
            } else {
               var2 = this.b;
            }

            this.a(var2);
            if (main.a.g % 5 == 0) {
               pasta.y.a(167, cq.b(super.e - 30, super.e + 30), cq.b(this.b() + 20, this.b() + 40), 1);
            }

            if (super.e != super.l || super.f != super.m) {
               super.e += (super.l - super.e) / 4;
               super.f += (super.m - super.f) / 4;
            }
            break;
         case 2:
            if (this.m) {
               var2 = this.c;
            } else {
               var2 = this.b;
            }

            this.a(var2);
            if (super.e != super.l || super.f != super.m) {
               super.e += (super.l - super.e) / 4;
               super.f += (super.m - super.f) / 4;
            }
            break;
         case 3:
            this.f();
            break;
         case 4:
            super.p = 0;
            if (this.p) {
               ++this.E;
               super.f -= this.E;
               this.a(this.i);
               if (super.f <= -500) {
                  this.p = false;
                  this.q = true;
                  this.E = 0;
               }
            }

            if (this.q) {
               super.e = this.y;
               this.E += 2;
               super.f += this.E;
               this.a(this.j);
               if (super.f > super.m) {
                  super.f = super.m;
                  this.q = false;
                  this.E = 0;
                  super.h = 2;
                  GameSrc.J = 10;
                  this.r = true;
               }
            }
            break;
         case 5:
            super.p = 0;
            break;
         case 6:
            super.p = 0;
            ++super.i;
            super.f += super.i;
            if (super.f >= super.m) {
               super.f = super.m;
               super.i = 0;
               super.h = 5;
            }
         case 7:
         }
      }

   }
}
