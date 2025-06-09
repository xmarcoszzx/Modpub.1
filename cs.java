package pasta;

public final class cs {
   public int a;
   public boolean a;
   private int[] a = new int[3];
   public int b;
   private boolean b;
   public int c;
   private boolean c = true;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i;
   public int j;
   public int k;
   public int l;
   public int m;
   public int n;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private int t;

   public final bc a() {
      byte var2 = -10;
      int var1;
      int var3;
      int var4;
      boolean var6;
      bc var7;
      byte var9;
      if (this.c) {
         var3 = this.o;
         var4 = this.p;
         var1 = this.i;
         int var8 = this.j;
         if (main.a.h) {
            if (!this.a && main.a.b(var3, var4, var1, var8)) {
               for(var1 = 0; var1 < this.a.length; ++var1) {
                  this.a[0] = main.a.b;
               }

               this.r = main.a.b;
               this.a = true;
               this.m = -1;
               if (this.s != 0) {
                  var6 = true;
               } else {
                  var6 = false;
               }

               this.b = var6;
               this.s = 0;
            } else if (this.a) {
               ++this.q;
               if (this.q > 5 && this.r == main.a.b && !this.b) {
                  this.r = -1000;
                  if (this.t > 1) {
                     var1 = (this.b + main.a.b - var4) / this.n;
                     var8 = (this.a + main.a.a - var3) / this.n;
                     this.m = var1 * this.t + var8;
                  } else {
                     this.m = (this.b + main.a.b - var4) / this.n;
                  }
               }

               var8 = main.a.b - this.a[0];
               if (var8 != 0 && this.m != -1) {
                  this.m = -1;
               }

               for(var1 = this.a.length - 1; var1 > 0; --var1) {
                  this.a[var1] = this.a[var1 - 1];
               }

               this.a[0] = main.a.b;
               this.b -= var8;
               if (this.b < 0) {
                  this.b = 0;
               }

               if (this.b > this.l) {
                  this.b = this.l;
               }

               label229: {
                  if (this.d >= 0) {
                     var1 = var8;
                     if (this.d <= this.l) {
                        break label229;
                     }
                  }

                  var1 = var8 / 2;
               }

               this.d -= var1;
            }
         }

         if (main.a.j && this.a) {
            var8 = main.a.b;
            var1 = this.a[0];
            main.a.j = false;
            if (cq.f(var8 - var1) < 20 && cq.f(main.a.b - this.r) < 20 && !this.b) {
               this.s = 0;
               this.b = this.d;
               this.r = -1000;
               if (this.t > 1) {
                  var1 = (this.b + main.a.b - var4) / this.n;
                  var8 = (this.a + main.a.a - var3) / this.n;
                  this.m = var1 * this.t + var8;
               } else {
                  this.m = (this.b + main.a.b - var4) / this.n;
               }

               this.q = 0;
            } else if (this.m != -1 && this.q > 5) {
               this.q = 0;
            } else if (this.m == -1 && !this.b) {
               if (this.d < 0) {
                  this.b = 0;
               } else if (this.d > this.l) {
                  this.b = this.l;
               } else {
                  var1 = main.a.b - this.a[0] + (this.a[0] - this.a[1]) + (this.a[1] - this.a[2]);
                  if (var1 > 10) {
                     var9 = 10;
                  } else if (var1 < -10) {
                     var9 = -10;
                  } else {
                     var9 = 0;
                  }

                  this.s = -var9 * 100;
               }
            }

            this.a = false;
            this.q = 0;
            main.a.j = false;
         }

         var7 = new bc();
         var1 = this.m;
         var6 = this.a;
      } else {
         var4 = this.o;
         int var5 = this.p;
         var1 = this.i;
         var3 = this.j;
         if (main.a.h) {
            if (!this.a && main.a.b(var4, var5, var1, var3)) {
               for(var1 = 0; var1 < this.a.length; ++var1) {
                  this.a[0] = main.a.a;
               }

               this.r = main.a.a;
               this.a = true;
               this.m = -1;
               if (this.s != 0) {
                  var6 = true;
               } else {
                  var6 = false;
               }

               this.b = var6;
               this.s = 0;
            } else if (this.a) {
               ++this.q;
               if (this.q > 5 && this.r == main.a.a && !this.b) {
                  this.r = -1000;
                  this.m = (this.a + main.a.a - var4) / this.n;
               }

               var3 = main.a.a - this.a[0];
               if (var3 != 0 && this.m != -1) {
                  this.m = -1;
               }

               for(var1 = this.a.length - 1; var1 > 0; --var1) {
                  this.a[var1] = this.a[var1 - 1];
               }

               this.a[0] = main.a.a;
               this.a -= var3;
               if (this.a < 0) {
                  this.a = 0;
               }

               if (this.a > 0) {
                  this.a = 0;
               }

               label184: {
                  if (this.c >= 0) {
                     var1 = var3;
                     if (this.c <= 0) {
                        break label184;
                     }
                  }

                  var1 = var3 / 2;
               }

               this.c -= var1;
            }
         }

         if (main.a.j && this.a) {
            var3 = main.a.a;
            var1 = this.a[0];
            main.a.j = false;
            if (cq.f(var3 - var1) < 20 && cq.f(main.a.a - this.r) < 20 && !this.b) {
               this.s = 0;
               this.a = this.c;
               this.r = -1000;
               this.m = (this.a + main.a.a - var4) / this.n;
               this.q = 0;
            } else if (this.m != -1 && this.q > 5) {
               this.q = 0;
            } else if (this.m == -1 && !this.b) {
               if (this.c < 0) {
                  this.a = 0;
               } else if (this.c > 0) {
                  this.a = 0;
               } else {
                  var3 = main.a.a - this.a[0] + (this.a[0] - this.a[1]) + (this.a[1] - this.a[2]);
                  if (var3 > 10) {
                     var9 = 10;
                  } else {
                     var9 = var2;
                     if (var3 >= -10) {
                        var9 = 0;
                     }
                  }

                  this.s = -var9 * 100;
               }
            }

            this.a = false;
            this.q = 0;
            main.a.j = false;
         }

         var7 = new bc();
         var1 = this.m;
         var6 = this.a;
      }

      return var7;
   }

   public final void a() {
      if (this.s != 0 && !this.a) {
         if (this.c) {
            this.b += this.s / 100;
            if (this.b < 0) {
               this.b = 0;
            } else if (this.b > this.l) {
               this.b = this.l;
            } else {
               this.d = this.b;
            }
         } else {
            this.a += this.s / 100;
            if (this.a < 0) {
               this.a = 0;
            } else if (this.a > 0) {
               this.a = 0;
            } else {
               this.c = this.a;
            }
         }

         this.s = this.s * 9 / 10;
         if (this.s < 100 && this.s > -100) {
            this.s = 0;
         }
      }

      if (this.c != this.a && !this.a) {
         this.e = this.a - this.c << 2;
         this.g += this.e;
         this.c += this.g >> 4;
         this.g &= 15;
      }

      if (this.d != this.b && !this.a) {
         this.f = this.b - this.d << 2;
         this.h += this.f;
         this.d += this.h >> 4;
         this.h &= 15;
      }

   }

   public final void a(int var1) {
      if (this.c) {
         this.b = var1 - (this.j - this.n) / 2;
         if (this.b < 0) {
            this.b = 0;
         }

         if (this.b > this.l) {
            this.b = this.l;
         }
      } else {
         this.a = var1 - (this.i - this.n) / 2;
         if (this.a < 0) {
            this.a = 0;
         }

         if (this.a > 0) {
            this.a = 0;
         }
      }

   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.o = var3;
      this.p = var4;
      this.n = var2;
      this.i = var5;
      this.j = var6;
      this.c = true;
      this.t = 1;
      this.l = var1 * var2 - var6;
      if (this.l < 0) {
         this.l = 0;
      }

   }
}
