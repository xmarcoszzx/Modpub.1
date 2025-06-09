package pasta;

import javax.microedition.lcdui.Image;

public final class ci extends i implements as {
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
   private boolean m;
   private boolean n = true;
   private boolean o;
   public int y;
   public int z;

   static {
      dz.b("/mainImage/myTexture2dmobHP.png");
   }

   public ci(int var1, short var2, short var3, int var4, int var5) {
      int[] var6 = new int[12];
      var6[6] = 1;
      var6[7] = 1;
      var6[8] = 1;
      var6[9] = 1;
      var6[10] = 1;
      var6[11] = 1;
      this.b = var6;
      var6 = new int[]{0, 0, 0, 7, 7, 7, 8, 8, 8, 9, 9, 9};
      this.c = var6;
      var6 = new int[]{0, 0, 0, 10, 10, 10, 11, 11, 11, 12, 12, 12};
      this.d = var6;
      var6 = new int[]{0, 0, 1, 1, 4, 4, 6, 6, 8, 8, 25, 25, 26, 26, 28, 28, 30, 30, 32, 32, 2, 2, 1, 1};
      this.e = new int[]{4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 3, 3, 3, 2, 2, 2, 1, 1, 1};
      this.f = new int[]{6, 6, 6, 3, 3, 3, 2, 2, 2, 1, 1, 1};
      super.q = var1;
      var1 = var2 + 20;
      super.e = var1;
      this.y = var1;
      super.f = var3;
      this.z = var3;
      super.m = var3;
      super.c = var4;
      super.d = var5;
      super.r = 72;
      a = null;
      a = new bl();
      String var8 = "/x" + dm.a + "/effectdata/109" + "/data";

      try {
         a.b(var8);
         a.a = dz.c("/effectdata/109/img.png");
      } catch (Exception var7) {
         av.a().e(super.r);
      }

      super.n = a.b;
      super.o = a.c;
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
      this.D = 0;
      byte var2;
      if (var1.b > super.e) {
         var2 = 1;
      } else {
         var2 = -1;
      }

      super.g = var2;
      int var3 = var1.b;
      int var4 = var1.c;
      if (cq.f(var3 - super.e) < super.n << 1 && cq.f(var4 - super.f) < super.o << 1) {
         if (super.e < var3) {
            super.e = var3 - super.n;
         } else {
            super.e = var3 + super.n;
         }

         super.k = 0;
      } else {
         super.k = 1;
      }

   }

   public final void a(dm var1) {
      if (a != null) {
         if (this.n && super.h != 0) {
            var1.a(b, this.A, super.m, 3);
            var1.f(GameSrc.k, GameSrc.l - main.a.o, GameSrc.a, GameSrc.b + main.a.o * 2);
         }

         var1.a(0, main.a.o);
         bl var6 = a;
         int var5 = this.E;
         int var4 = super.e;
         int var3 = super.f;
         byte var2;
         if (super.g == 1) {
            var2 = 0;
         } else {
            var2 = 1;
         }

         var6.a(var1, var5, var4, var3, var2, 2);
         var1.a(0, -main.a.o);
         int var7 = (int)((long)super.c * 50L / (long)super.d);
         if (var7 != 0) {
            var1.a(0);
            var1.e(super.e - 27, super.f - 112, 54, 8);
            var1.a(16711680);
            var1.e(super.e - 25, super.f - 110, var7, 4);
         }

         if (this.o) {
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
               this.o = false;
            }
         }
      }

   }

   public final void a(i var1) {
      super.a = null;
      super.i = 0;
      super.j = 0;
      super.h = 3;
      this.D = 0;
      byte var2;
      if (var1.e > super.e) {
         var2 = 1;
      } else {
         var2 = -1;
      }

      super.g = var2;
      int var3 = var1.e;
      int var4 = var1.f;
      if (cq.f(var3 - super.e) < super.n << 1 && cq.f(var4 - super.f) < super.o << 1) {
         if (super.e < var3) {
            super.e = var3 - super.n;
         } else {
            super.e = var3 + super.n;
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
      ++this.D;
      if (this.D > var1.length - 1) {
         this.D = 0;
      }

      this.E = var1[this.D];
   }

   public final void a(Char[] var1, int[] var2, byte var3) {
      super.h = 3;
      this.a = var1;
      this.a = var2;
      this.b = var3;
      this.D = 0;
   }

   public final int b() {
      return super.f - 50;
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
      return 50;
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
      int var5;
      if (this.b == 0) {
         if (this.D == this.c.length - 1) {
            super.h = 2;
         }

         if (super.e < this.a[0].b) {
            var1 = 1;
         } else {
            var1 = -1;
         }

         super.g = var1;
         this.a(this.c);
         super.e += (this.a[0].b - super.e) / 4;
         super.f += (this.a[0].c - super.f) / 4;
         this.y = super.e;
         if (this.D == 8) {
            for(var5 = 0; var5 < this.a.length; ++var5) {
               this.a[var5].a(this.a[var5], 0, false, false);
               pasta.y.a(102, this.a[var5].b, this.a[var5].c, 1);
            }
         }
      }

      if (this.b == 1) {
         if (this.D == this.d.length - 1) {
            super.h = 2;
         }

         if (super.e < this.a[0].b) {
            var1 = 1;
         } else {
            var1 = -1;
         }

         super.g = var1;
         this.a(this.d);
         if (this.D == 8) {
            for(var5 = 0; var5 < this.a.length; ++var5) {
               int var4 = super.e;
               byte var2;
               if (super.g == 1) {
                  var2 = 45;
               } else {
                  var2 = -45;
               }

               pasta.n.a(var2 + var4, super.f - 25, true, this.a[var5], 0, this.a[var5], 24);
            }
         }
      }

      if (this.b == 2) {
         if (this.D == this.e.length - 1) {
            super.h = 2;
         }

         var1 = var3;
         if (super.e < this.a[0].b) {
            var1 = 1;
         }

         super.g = var1;
         this.a(this.e);
         super.e += (this.a[0].b - super.e) / 4;
         this.y = super.e;
         this.z = super.f;
         if (this.D == 12) {
            for(var5 = 0; var5 < this.a.length; ++var5) {
               this.a[var5].a(this.a[var5], 0, false, false);
               pasta.y.a(102, this.a[var5].b, this.a[var5].c, 1);
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

   public final void onCancelChat() {
      if (this.d()) {
         byte var1 = TileMap.a;
         this.A = super.e;
         this.C = 0;
         if (this.B > 0 && !TileMap.a(this.A, this.B, 2)) {
            if (TileMap.a(this.A / var1, this.B / var1) == 0) {
               this.m = true;
            } else if (TileMap.a(this.A / var1, this.B / var1) != 0 && !TileMap.a(this.A, this.B, 2)) {
               this.A = super.e;
               this.B = super.f;
               this.m = false;
            }

            while(this.m && this.C < 10) {
               ++this.C;
               this.B += 24;
               if (TileMap.a(this.A, this.B, 2)) {
                  if (this.B % 24 != 0) {
                     this.B -= this.B % 24;
                  }
                  break;
               }
            }
         }

         switch(super.h) {
         case 0:
         case 1:
            this.a(this.b);
            if (main.a.g % 5 == 0) {
               pasta.y.a(167, cq.b(super.e - 25, super.e + 25), cq.b(super.f - 50 + 20, super.f - 50 + 40), 1);
            }

            if (super.e != this.y || super.f != this.z) {
               super.e += (this.y - super.e) / 4;
               super.f += (this.z - super.f) / 4;
            }
            break;
         case 2:
            this.a(this.b);
            if (super.e != this.y || super.f != this.z) {
               super.e += (this.y - super.e) / 4;
               super.f += (this.z - super.f) / 4;
            }
            break;
         case 3:
            this.f();
            break;
         case 4:
            super.p = 0;
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
