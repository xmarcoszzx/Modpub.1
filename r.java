package pasta;

public final class r extends Char {
   private static bl all;
   private static bl b;
   private boolean Q;
   private cx all;
   private int[] all;
   private int[][] all;
   private int an = 0;
   private int ao;
   private int ap;
   private int aq;
   private int ar;
   private int as;
   private int at;
   private Char b;
   private int[] b;
   private Char[] b;
   private int[] c;
   private int[] d;
   private int[] e;
   private byte l;

   public r() {
      int[] var1 = new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
      this.b = var1;
      var1 = new int[]{0, 0, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9, 10, 10};
      this.c = var1;
      var1 = new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12};
      this.d = var1;
      this.e = new int[]{13, 13, 14, 14, 15, 15, 16, 16};
      this.all = new int[][]{this.b, this.c, this.d, this.e};
      this.l = -1;
      all = null;
      all = new bl();
      String var4 = "/x" + dm.a + "/effectdata/102" + "/data";

      try {
         all.b(var4);
         all.a = dz.c("/effectdata/102/img.png");
      } catch (Exception var3) {
      }

      b = null;
      b = new bl();
      var4 = "/x" + dm.a + "/effectdata/103" + "/data";

      try {
         b.b(var4);
         b.a = dz.c("/effectdata/103/img.png");
      } catch (Exception var2) {
      }

   }

   public final void a(byte var1, short var2, short var3, Char[] var4, int[] var5) {
      this.l = var1;
      this.ap = var2;
      this.aq = var3;
      this.ao = super.i;
      byte var6;
      if (this.ap > super.b) {
         var6 = 1;
      } else {
         var6 = -1;
      }

      super.i = var6;
      this.b = var4;
      this.all = var5;
   }

   public final void a(int[] var1) {
      if (this.l == 0) {
         if (this.an == 11) {
            this.Q = true;
            dh.a(new cx(19, super.b, super.c + 20, 2, 1, -1));
         }

         if (this.an >= var1.length - 1) {
            this.l = 2;
            return;
         }
      }

      if (this.l == 1 && this.an == var1.length - 1) {
         this.l = 3;
         super.c -= 15;
      } else {
         ++this.an;
         if (this.an > var1.length - 1) {
            this.an = 0;
         }

         this.as = var1[this.an];
      }

   }

   public final void b(dm var1) {
      byte var2 = 1;
      byte var3 = 1;
      if (this.l != -1) {
         this.c(var1);
         var1.a(0, main.a.o);
         this.a(this.all[this.l]);
         int var4;
         int var5;
         int var6;
         bl var8;
         if (this.l != 0 && this.l != 1) {
            var8 = b;
            var6 = this.as;
            var4 = super.b;
            int var9 = super.c;
            var5 = super.U;
            if (super.i == 1) {
               var2 = 0;
            }

            var8.a(var1, var6, var4, var5 + var9, var2, 2);
         } else {
            var8 = all;
            var5 = this.as;
            var4 = super.b;
            int var7 = super.c;
            var6 = super.U;
            var2 = var3;
            if (super.i == 1) {
               var2 = 0;
            }

            var8.a(var1, var5, var4, var6 + var7, var2, 2);
         }

         var1.a(0, -main.a.o);
      } else {
         super.b(var1);
      }

   }

   public final void goToMap(int var1) {
      this.all = new cx(105, super.b, super.c + 20, 2, 1, -1);
      dh.a(this.all);
      if (var1 == Char.myCharz().charID) {
         this.b = Char.myCharz();
      } else {
         this.b = GameSrc.a(var1);
      }

   }

   public final void onCancelChat() {
      byte var1;
      cx var3;
      if (this.b != null) {
         if (this.all.e >= 30) {
            var3 = this.all;
            var3.f += (super.b - this.all.f) / 4;
            var3 = this.all;
            var3.g += (super.c - this.all.g) / 4;
            this.b.b = this.all.f;
            this.b.c = this.all.g;
            this.b.D = true;
         } else {
            var3 = this.all;
            if (this.all.f > this.b.b) {
               var1 = 1;
            } else {
               var1 = 0;
            }

            var3.j = var1;
            var3 = this.all;
            var3.f += (this.b.b - this.all.f) / 3;
            var3 = this.all;
            var3.g += (this.b.c - this.all.g) / 3;
         }
      }

      if (this.l != -1) {
         if (this.l == 0 && this.Q && main.a.g % 2 == 0) {
            int var2 = this.ar;
            byte var4;
            if (this.ap > super.b) {
               var4 = 30;
            } else {
               var4 = -30;
            }

            this.ar = var4 + var2;
            var3 = new cx(103, super.b + this.ar, super.c + 20, 2, 1, -1);
            if (this.ap > super.b) {
               var1 = 0;
            } else {
               var1 = 1;
            }

            var3.j = var1;
            dh.a(var3);
            if (super.i == 1 && super.b + this.ar >= this.ap || super.i == -1 && super.b + this.ar <= this.ap) {
               this.Q = false;
               this.l = -1;
               this.ar = 0;
               this.an = 0;
               super.i = this.ao;

               for(int var5 = 0; var5 < this.b.length; ++var5) {
                  this.b[var5].a(this.all[var5], 0, false, false);
               }
            }
         }

         if (this.l == 3) {
            this.ap = this.b[this.at].b;
            this.aq = this.b[this.at].c;
            super.b += (this.ap - super.b) / 3;
            super.c += (this.aq - super.c) / 3;
            if (main.a.g % 5 == 0) {
               dh.a(new cx(19, super.b, super.c, 2, 1, -1));
            }

            if (cq.f(super.b - this.ap) <= 20 && cq.f(super.c - this.aq) <= 20) {
               super.b = this.ap;
               super.c = this.aq;
               this.b[this.at].a(this.all[this.at], 0, false, false);
               ++this.at;
               if (this.at == this.b.length) {
                  this.l = -1;
                  this.at = 0;
               }
            }
         }
      } else {
         super.onCancelChat();
      }

   }
}
