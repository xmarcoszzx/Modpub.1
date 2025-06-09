package pasta;

import java.util.Random;

public final class n extends cb {
   public static Random a = new Random(System.currentTimeMillis());
   public static final byte[] a;
   public static final int[] a;
   private static int[] b;
   private int a;
   private Char a;
   private ba a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private MyVector g = new MyVector("vDarts");
   private int h;
   private int i;
   private int j = 0;
   private int k = 0;

   static {
      int[] var0 = new int[]{0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};
      b = var0;
      var0 = new int[]{0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};
      a = var0;
      byte[] var1 = new byte[]{0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0};
      a = var1;
   }

   private n(int var1, int var2, int var3, int var4, Char var5, int var6) {
      this.a = GameSrc.a[var6];
      this.e = var1;
      this.f = var2;
      this.h = var3;
      this.i = var4;
      this.a = var5;
      this.a = this.a.a;
      var2 = cq.a(var5.b - var1, var5.c - var2);
      this.b = var2;
      this.c = this.a * cq.b(var2) >> 10;
      var3 = this.a;
      this.d = cq.a(var2) * var3 >> 10;
      if (var1 >= GameSrc.k && var1 <= GameSrc.k + main.a.i) {
         aw.a();
      }

   }

   public static int a(int var0) {
      byte var2 = 0;
      int var1 = 0;

      while(true) {
         if (var1 >= b.length - 1) {
            var0 = var2;
            break;
         }

         if (var0 >= b[var1] && var0 <= b[var1 + 1]) {
            var0 = var2;
            if (var1 < 16) {
               var0 = var1;
            }
            break;
         }

         ++var1;
      }

      return var0;
   }

   public static void a(int var0, int var1, boolean var2, int var3, int var4, Char var5, int var6) {
      cb.b.addElement(new n(var0, var1, var3, var4, var5, var6));
   }

   public final void a() {
      byte var4 = 0;
      int var1 = 0;

      while(true) {
         if (var1 >= this.a.b) {
            for(var1 = var4; var1 < this.g.size(); ++var1) {
               cu var6 = (cu)this.g.elementAt(var1);
               ++var6.a;
               if (var6.a >= this.a.a.length) {
                  this.g.removeElementAt(var1);
               }
            }

            return;
         }

         if (this.a.a.length > 0) {
            this.g.addElement(new cu(this.e, this.f));
         }

         int var2;
         if (this.a != null) {
            var2 = this.a.b;
         } else {
            var2 = 0;
         }

         this.j = var2 - this.e;
         if (this.a != null) {
            var2 = this.a.c;
         } else {
            var2 = 0;
         }

         this.k = var2 - 10 - this.f;
         short var7 = 60;
         if (TileMap.mapId == 0) {
            var7 = 600;
         }

         ++this.g;
         if (this.a != null && (this.a.h == 5 || this.a.h == 14) || this.a == null) {
            int var5 = this.e;
            int var3;
            if (this.a != null) {
               var3 = this.a.b;
            } else {
               var3 = 0;
            }

            this.e = (var3 - this.e) / 2 + var5;
            var5 = this.f;
            if (this.a != null) {
               var3 = this.a.c;
            } else {
               var3 = 0;
            }

            this.f = (var3 - this.f) / 2 + var5;
         }

         if (cq.f(this.j) < 16 && cq.f(this.k) < 16 || this.g > var7) {
            if (this.a != null && this.a.charID >= 0 && this.i != -1) {
               if (this.i != -100) {
                  this.a.a(this.h, this.i, false, true);
               } else {
                  y.a(80, this.a, 1);
               }
            }

            cb.b.removeElement(this);
            if (this.i != -100) {
               y.a(81, this.a, 1);
               if (this.e >= GameSrc.k && this.e <= GameSrc.k + main.a.i) {
                  aw.a();
               }
            }
            break;
         }

         var2 = cq.a(this.j, this.k);
         if (Math.abs(var2 - this.b) < 90 || this.j * this.j + this.k * this.k > 4096) {
            if (Math.abs(var2 - this.b) < 15) {
               this.b = var2;
            } else if ((var2 - this.b < 0 || var2 - this.b >= 180) && var2 - this.b >= -180) {
               this.b = cq.c(this.b - 15);
            } else {
               this.b = cq.c(this.b + 15);
            }
         }

         if (this.a < 8192) {
            this.a += 1024;
         }

         this.c = this.a * cq.b(this.b) >> 10;
         this.d = this.a * cq.a(this.b) >> 10;
         this.j += this.c;
         this.e += this.j >> 10;
         this.j &= 1023;
         this.k += this.d;
         this.f += this.k >> 10;
         this.k &= 1023;
         ++var1;
      }

   }

   public final void a(dm var1) {
      int var2 = a(360 - this.b);
      byte var3 = a[var2];
      int var4 = a[var2];

      cu var6;
      for(var2 = this.g.size() / 2; var2 < this.g.size(); ++var2) {
         var6 = (cu)this.g.elementAt(var2);
         ao.a(var1, this.a.b[var6.a], var6.b, var6.c, 0, 3);
      }

      int var5 = main.a.g % this.a.b.length;
      ao.a(var1, this.a.b[var5][var3], this.e, this.f, var4, 3);

      for(var2 = 0; var2 < this.g.size(); ++var2) {
         var6 = (cu)this.g.elementAt(var2);
         ao.a(var1, this.a.a[var6.a], var6.b, var6.c, 0, 3);
      }

      ao.a(var1, this.a.a[var5][var3], this.e, this.f, var4, 3);

      for(var2 = 0; var2 < this.g.size(); ++var2) {
         var6 = (cu)this.g.elementAt(var2);
         if (cq.f(a.nextInt(100)) < this.a.a) {
            short var7;
            if (main.a.g % 2 == 0) {
               var7 = this.a.c[var6.a];
            } else {
               var7 = this.a.d[var6.a];
            }

            ao.a(var1, var7, var6.b, var6.c, 0, 3);
         }
      }

   }
}
