package pasta;

import javax.microedition.lcdui.Image;

public final class ItemMap implements as {
   public static Image a = dz.b("/mainImage/myTexture2dflare.png");
   private static Image b = dz.b("/mainImage/myTexture2ditemaura1.png");
   private static Image c = dz.b("/mainImage/myTexture2ditemaura2.png");
   private static Image d = dz.b("/mainImage/myTexture2ditemaura3.png");
   private byte a;
   public int a;
   public ItemTemplate a;
   private int[] a;
   public int b;
   private int[] b;
   private int[] c;
   public int d;
   private int[] d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   public int playerId;

   public ItemMap(int var1, short var2, short var3, int var4, int var5, short var6) {
      this.d = var2;
      this.a = cn.a(var3);
      this.e = var4;
      this.a = var4;
      this.f = var5;
      this.b = var5;
      this.a = 1;
      this.playerId = var1;
      if (this.a()) {
         this.i = var6;
         this.j = this.a;
         this.k = this.b;
         this.n = 120;
         this.l = 0;
         if (!main.a.b) {
            this.m = 360 / this.n;
            this.a = new int[this.n];
            this.b = new int[this.n];
            this.c = new int[this.n];
            this.d = new int[this.n];
            this.b();
         }
      }

   }

   public ItemMap(short var1, short var2, int var3, int var4, int var5, int var6) {
      this.d = var1;
      this.a = cn.a(var2);
      this.a = var5;
      this.b = var4;
      this.e = var5;
      this.f = var6;
      this.g = var5 - var3 >> 2;
      this.h = 5;
   }

   private boolean a() {
      boolean var1;
      if (this.a.type == 22) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private void b() {
      if (!main.a.b) {
         for(int var1 = 0; var1 < this.b.length; ++var1) {
            this.b[var1] = cq.f(this.i * cq.a(this.l) / 1024);
            this.a[var1] = cq.f(this.i * cq.b(this.l) / 1024);
            if (this.l < 90) {
               this.c[var1] = this.j + this.a[var1];
               this.d[var1] = this.k - this.b[var1];
            } else if (this.l >= 90 && this.l < 180) {
               this.c[var1] = this.j - this.a[var1];
               this.d[var1] = this.k - this.b[var1];
            } else if (this.l >= 180 && this.l < 270) {
               this.c[var1] = this.j - this.a[var1];
               this.d[var1] = this.k + this.b[var1];
            } else {
               this.c[var1] = this.j + this.a[var1];
               this.d[var1] = this.k + this.b[var1];
            }

            this.l += this.m;
         }
      }

   }

   public final int a() {
      return this.a;
   }

   public final void a() {
      if (this.a == 2 && this.a == this.e && this.b == this.f) {
         GameSrc.e.removeElement(this);
         if (Char.myCharz().a != null && Char.myCharz().a.equals(this)) {
            Char.myCharz().a = null;
         }
      } else {
         if (this.a <= 0) {
            this.a = (byte)(this.a - 4);
            if (this.a < -12) {
               this.b -= 12;
               this.a = 1;
            }
         } else {
            if (this.g == 0) {
               this.a = this.e;
            }

            if (this.h == 0) {
               this.b = this.f;
            }

            if (this.a != this.e) {
               this.a += this.g;
               if (this.g > 0 && this.a > this.e || this.g < 0 && this.a < this.e) {
                  this.a = this.e;
               }
            }

            if (this.b != this.f) {
               this.b += this.h;
               if (this.h > 0 && this.b > this.f || this.h < 0 && this.b < this.f) {
                  this.b = this.f;
               }
            }
         }

         if (this.a()) {
            ++this.o;
            ++this.p;
            if (this.p >= 40) {
               this.p = 0;
            }

            if (this.o >= this.n) {
               this.o = 0;
            }

            if (this.o % 10 == 0 && !main.a.b) {
               y.a(114, this.a - 5, this.b - 30, 1);
            }
         }
      }

   }

   public final void a(dm var1) {
      if (this.a()) {
         var1.a(TileMap.b, this.a + 3, this.b, 3);
         if (this.a <= 0) {
            if (this.p < 10) {
               var1.a(b, this.a, this.b + this.a + 3, 33);
            } else {
               var1.a(c, this.a, this.b + this.a + 3, 33);
            }
         } else if (this.p < 10) {
            var1.a(b, this.a, this.b + 3, 33);
         } else {
            var1.a(c, this.a, this.b + 3, 33);
         }

         if (!main.a.b) {
            for(int var2 = 0; var2 < this.b.length; ++var2) {
               if (this.o == var2) {
                  if (this.p <= 20) {
                     var1.a(d, this.c[var2], this.d[var2] + 3, 33);
                  } else {
                     ao.a(var1, this.a.b, this.c[var2], this.d[var2] + 3, 0, 33);
                  }
               }
            }
         }
      } else if (!this.a()) {
         if (main.a.g % 4 == 0) {
            var1.a(a, this.a, this.b + this.a + 13, 33);
         }

         if (this.a <= 0) {
            ao.a(var1, this.a.b, this.a, this.b + this.a + 3, 0, 33);
         } else {
            ao.a(var1, this.a.b, this.a, this.b + 3, 0, 33);
         }

         if (Char.myCharz().a != null && Char.myCharz().a.equals(this) && this.a != 2) {
            var1.a(pasta.i.a, 0, 24, 9, 6, 0, this.a, this.b - 17, 3);
         }
      }

   }

   public final int b() {
      return this.b;
   }

   public final int c() {
      return 20;
   }

   public final int d() {
      return 20;
   }

   public final boolean f() {
      return false;
   }

   public final void i() {
   }

   public final void transMap(int var1, int var2) {
      this.e = var1;
      this.f = var2;
      this.g = var1 - this.a >> 2;
      this.h = var2 - this.b >> 2;
      this.a = 2;
   }
}
