package pasta;

import javax.microedition.lcdui.Image;

public final class bm extends i implements as {
   private static Image b = dz.b("/mainImage/shadowBig.png");
   private int A;
   private int B;
   private int C;
   private int D;
   private int[] a;
   private Char[] a;
   private int[][] a;
   private byte b;
   private boolean m = true;
   public int y;
   public int z;

   static {
      dz.b("/mainImage/myTexture2dmobHP.png");
   }

   public bm(int var1, short var2, short var3, int var4, int var5, int var6) {
      int[] var13 = new int[8];
      var13[4] = 1;
      var13[5] = 1;
      var13[6] = 1;
      var13[7] = 1;
      int[] var21 = new int[8];
      var21[4] = 1;
      var21[5] = 1;
      var21[6] = 1;
      var21[7] = 1;
      int[] var11 = new int[8];
      var11[4] = 1;
      var11[5] = 1;
      var11[6] = 1;
      var11[7] = 1;
      int[] var10 = new int[8];
      var10[4] = 1;
      var10[5] = 1;
      var10[6] = 1;
      var10[7] = 1;
      int[] var23 = new int[8];
      var23[4] = 1;
      var23[5] = 1;
      var23[6] = 1;
      var23[7] = 1;
      int[] var15 = new int[8];
      var15[4] = 1;
      var15[5] = 1;
      var15[6] = 1;
      var15[7] = 1;
      int[] var12 = new int[8];
      var12[4] = 1;
      var12[5] = 1;
      var12[6] = 1;
      var12[7] = 1;
      int[] var8 = new int[8];
      var8[4] = 1;
      var8[5] = 1;
      var8[6] = 1;
      var8[7] = 1;
      int[] var18 = new int[8];
      var18[4] = 1;
      var18[5] = 1;
      var18[6] = 1;
      var18[7] = 1;
      int[] var19 = new int[8];
      var19[4] = 1;
      var19[5] = 1;
      var19[6] = 1;
      var19[7] = 1;
      int[] var22 = new int[8];
      var22[4] = 1;
      var22[5] = 1;
      var22[6] = 1;
      var22[7] = 1;
      int[] var9 = new int[8];
      var9[4] = 1;
      var9[5] = 1;
      var9[6] = 1;
      var9[7] = 1;
      int[] var20 = new int[8];
      var20[4] = 1;
      var20[5] = 1;
      var20[6] = 1;
      var20[7] = 1;
      int[] var16 = new int[8];
      var16[4] = 1;
      var16[5] = 1;
      var16[6] = 1;
      var16[7] = 1;
      int[] var14 = new int[8];
      var14[4] = 1;
      var14[5] = 1;
      var14[6] = 1;
      var14[7] = 1;
      int[] var7 = new int[8];
      var7[4] = 1;
      var7[5] = 1;
      var7[6] = 1;
      var7[7] = 1;
      int[] var17 = new int[8];
      var17[4] = 1;
      var17[5] = 1;
      var17[6] = 1;
      var17[7] = 1;
      this.a = new int[][]{var13, var21, var11, var10, var23, var15, var12, var8, var18, var19, var22, var9, var20, var16, var14, var7, var17};
      super.q = var1;
      var1 = var2 + 20;
      super.l = var1;
      super.e = var1;
      super.m = var3;
      super.f = var3;
      this.y = super.e;
      this.z = super.f;
      super.d = var6;
      super.c = var5;
      super.r = var4;
      if (pasta.i.a[super.r].a == null) {
         av.a().e(super.r);
      }

      super.h = 2;
      this.a = null;
   }

   private void o() {
      int var1 = 0;
      this.A = super.e;
      if (TileMap.a(super.e, super.f, 2)) {
         this.B = super.f;
      } else {
         this.B = super.f;

         while(var1 < 30) {
            ++var1;
            this.B += 24;
            if (TileMap.a(this.A, this.B, 2)) {
               if (this.B % 24 != 0) {
                  this.B -= this.B % 24;
               }
               break;
            }
         }
      }

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
      int var2 = var1.b;
      int var3 = var1.c;
      if (cq.f(var2 - super.e) < super.n << 1 && cq.f(var3 - super.f) < super.o << 1) {
         if (super.e < var2) {
            super.e = var2 - super.n;
         } else {
            super.e = var2 + super.n;
         }

         super.k = 0;
      } else {
         super.k = 1;
      }

   }

   public final void a(dm var1) {
      byte var2 = 1;
      if (pasta.i.a[super.r].a != null) {
         if (this.m) {
            byte var3 = TileMap.a;
            if ((TileMap.mapId < 114 || TileMap.mapId > 120) && TileMap.mapId != 127 && TileMap.mapId != 128) {
               if (TileMap.a(this.A + var3 / 2, this.B + 1, 4)) {
                  var1.f(this.A / var3 * var3, (this.B - 30) / var3 * var3, var3, 100);
               } else if (TileMap.a((this.A - var3 / 2) / var3, (this.B + 1) / var3) == 0) {
                  var1.f(this.A / var3 * var3, var3 * ((this.B - 30) / var3), 100, 100);
               } else if (TileMap.a((this.A + var3 / 2) / var3, (this.B + 1) / var3) == 0) {
                  var1.f(this.A / var3 * var3, (this.B - 30) / var3 * var3, var3, 100);
               } else if (TileMap.a(this.A - var3 / 2, this.B + 1, 8)) {
                  var1.f(this.A / 24 * var3, (this.B - 30) / var3 * var3, var3, 100);
               }
            }

            var1.a(b, this.A, this.B - 5, 3);
            var1.f(GameSrc.k, GameSrc.l - main.a.o, GameSrc.a, GameSrc.b + main.a.o * 2);
         }

         var1.a(0, main.a.o);
         bl var6 = pasta.i.a[super.r].a;
         int var8 = this.D;
         int var5 = super.e;
         int var4 = super.f;
         if (super.g == 1) {
            var2 = 0;
         }

         var6.a(var1, var8, var5, var4, var2, 2);
         var1.a(0, -main.a.o);
         int var7 = (int)((long)super.c * 50L / (long)super.d);
         if (var7 != 0) {
            var8 = super.f - super.o - 5;
            var1.a(0);
            var1.e(super.e - 27, var8 - 2, 54, 8);
            var1.a(16711680);
            var1.e(super.e - 25, var8, var7, 4);
         }
      }

   }

   public final void a(i var1) {
      super.a = null;
      super.i = 0;
      super.j = 0;
      super.h = 3;
      this.C = 0;
      int var2 = var1.e;
      int var3 = var1.f;
      if (cq.f(var2 - super.e) < super.n << 1 && cq.f(var3 - super.f) < super.o << 1) {
         if (super.e < var2) {
            super.e = var2 - super.n;
         } else {
            super.e = var2 + super.n;
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

   public final void a(short var1, short var2) {
      if (var2 != -1) {
         if (cq.a(super.e, super.f, this.y, this.z) > 100) {
            super.e = var1;
            super.f = var2;
            super.h = 2;
         } else {
            this.y = var1;
            this.z = var2;
            super.h = 5;
         }
      } else {
         this.y = var1;
         super.h = 5;
      }

   }

   public final void a(int[] var1) {
      ++this.C;
      if (this.C > var1.length - 1) {
         this.C = 0;
      }

      this.D = var1[this.C];
   }

   public final void a(Char[] var1, int[] var2, byte var3, byte var4) {
      this.a = var1;
      this.a = var2;
      this.b = var3;
      super.g = var4;
      super.h = 3;
      if (super.e != this.y || super.f != this.z) {
         super.e += (this.y - super.e) / 4;
         super.f += (this.z - super.f) / 4;
      }

   }

   public final int b() {
      return super.f;
   }

   public final void b() {
      super.a = false;
   }

   public final int c() {
      return super.o;
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
      return super.n;
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
      if (this.C == this.a[this.b + 1].length - 1) {
         super.h = 2;
      }

      this.a(this.a[this.b + 1]);
      if (this.C == this.a[15][this.b - 1]) {
         for(int var1 = 0; var1 < this.a.length; ++var1) {
            this.a[var1].a(this.a[var1], 0, false, false);
            pasta.y.a(this.a[16][this.b - 1], this.a[var1].b, this.a[var1].c, 1);
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
      this.a(this.a[1]);
      byte var2 = pasta.i.a[super.r].b;
      int var1 = var2;
      if (cq.f(super.e - this.y) < var2) {
         var1 = cq.f(super.e - this.y);
      }

      int var3 = super.e;
      if (super.e >= this.y) {
         var1 = -var1;
      }

      super.e = var1 + var3;
      super.f = this.z;
      if (super.e < this.y) {
         super.g = 1;
      } else if (super.e > this.y) {
         super.g = -1;
      }

      if (cq.f(super.e - this.y) <= 1) {
         super.e = this.y;
         super.h = 2;
      }

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
      super.h = 4;
   }

   public final void n() {
      super.h = 0;
   }

   public final void onCancelChat() {
      if (this.a == null && pasta.i.a[super.r].a != null) {
         this.a = (int[][])pasta.j.a.get(String.valueOf(super.r));
         super.n = pasta.i.a[super.r].a.b;
         super.o = pasta.i.a[super.r].a.c;
      }

      if (this.a != null && this.d()) {
         this.o();
         switch(super.h) {
         case 0:
         case 1:
            ++this.C;
            if (this.C > this.a[13].length - 1) {
               this.C = this.a[13].length - 1;
            }

            this.D = this.a[13][this.C];
            if (super.e != this.y || super.f != this.z) {
               super.e += (this.y - super.e) / 4;
               super.f += (this.z - super.f) / 4;
            }
            break;
         case 2:
            this.a(this.a[0]);
            if (super.e != this.y || super.f != this.z) {
               super.e += (this.y - super.e) / 4;
               super.f += (this.z - super.f) / 4;
            }
            break;
         case 3:
            this.f();
         case 4:
         case 7:
         default:
            break;
         case 5:
            super.p = 0;
            this.g();
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
         }
      }

   }
}
