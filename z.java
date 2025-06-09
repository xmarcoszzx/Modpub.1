package pasta;

import javax.microedition.lcdui.Image;

public final class z extends ag implements ah {
   private static Image a = dz.b("/mainImage/myTexture2dfutherShip.png");
   private static z a;
   private static Image b = dz.b("/mainImage/taungam.png");
   public byte a;
   private int a = 5;
   public long a;
   public short a;
   private boolean a;
   private int[] a;
   private int b;
   public long b;
   public short b;
   private boolean b;
   private int[] b;
   private int c = 20;
   private int[] c;
   private int d;
   private int[] d;

   public z() {
      this.a = new int[this.c];
      this.b = new int[this.c];

      int var1;
      for(var1 = 0; var1 < this.c; ++var1) {
         this.a[var1] = cq.b(0, main.a.i);
         this.b[var1] = main.a.j / this.c * var1;
      }

      this.c = new int[this.c];
      this.d = new int[this.c];

      for(var1 = 0; var1 < this.c; ++var1) {
         this.c[var1] = cq.b(0, main.a.i);
         this.d[var1] = main.a.j / this.c * var1;
      }

   }

   public static z a() {
      if (a == null) {
         a = new z();
      }

      return a;
   }

   public final void a() {
      this.a = false;
      this.b = false;
      if (Char.myCharz().f() > 0 && this.a == 0) {
         super.b = new cd(ab.fc, this, 1, (Object)null);
      } else {
         super.b = null;
      }

      this.d = 0;
      super.a();
   }

   public final void a(int var1, Object var2) {
      if (var1 == 1) {
         main.a.a(ab.fd, new cd(ab.aS, this, 2, (Object)null), new cd(ab.aT, this, 3, (Object)null));
      }

      if (var1 == 2 && Char.myCharz().f() > 0) {
         this.a = true;
         main.a.f();
         super.b = null;
      }

      if (var1 == 3) {
         main.a.f();
      }

   }

   public final void a(dm var1) {
      byte var4 = 0;
      int var2;
      if (this.a == 0) {
         var2 = 0;
      } else {
         var2 = 3056895;
      }

      var1.a(var2);
      var1.e(0, 0, main.a.i, main.a.j);

      int var3;
      for(var2 = 0; var2 < this.c; ++var2) {
         if (this.a == 0) {
            var3 = 14802654;
         } else {
            var3 = 11140863;
         }

         var1.a(var3);
         var1.e(this.a[var2], this.b[var2], 10, 2);
      }

      if (this.a == 0) {
         var1.a(a, 0, 0, 72, 95, 7, this.b + this.d, main.a.j / 2, 3);
      }

      var2 = var4;
      if (this.a == 1) {
         var1.a(b, 0, 0, 144, 79, 2, this.b + this.d, main.a.j / 2, 3);
         var2 = var4;
      }

      while(var2 < this.c) {
         if (this.a == 0) {
            var3 = 14935011;
         } else {
            var3 = 7536127;
         }

         var1.a(var3);
         var1.e(this.c[var2], this.d[var2], 18, 3);
         ++var2;
      }

      super.a(var1);
   }

   public final void b() {
      byte var2 = 0;
      if (this.a == 0) {
         if (!this.a) {
            this.d = main.a.i / 2 * this.a / this.b;
         }
      } else {
         this.d += 2;
      }

      j.b = false;
      this.b = (((main.a.i / 2 + this.b) / 2 + this.b) / 2 + this.b) / 2;
      if (this.a == 1) {
         this.b = 0;
      }

      int var1;
      int[] var3;
      for(var1 = 0; var1 < this.c; ++var1) {
         var3 = this.a;
         var3[var1] -= this.a / 2;
         if (this.a[var1] < -20) {
            this.a[var1] = main.a.i;
         }
      }

      for(var1 = var2; var1 < this.c; ++var1) {
         var3 = this.c;
         var3[var1] -= this.a;
         if (this.c[var1] < -20) {
            this.c[var1] = main.a.i;
         }
      }

      int var26;
      byte var27;
      if (main.a.g % 3 == 0) {
         var26 = this.a;
         if (this.a) {
            var27 = 2;
         } else {
            var27 = 1;
         }

         this.a = var27 + var26;
      }

      var26 = this.a;
      if (this.a) {
         var27 = 80;
      } else {
         var27 = 25;
      }

      if (var26 > var27) {
         if (this.a) {
            var27 = 80;
         } else {
            var27 = 25;
         }

         this.a = var27;
      }

      this.b = System.currentTimeMillis();
      if (this.b - this.a >= 1000L) {
         ++this.a;
         this.a = this.b;
      }

      if (this.a) {
         this.d += 3;
      }

      if (this.d >= main.a.i / 2 + 30 && !this.b) {
         label508: {
            this.b = true;
            av var5 = av.a();

            Message var4;
            label504: {
               Throwable var10000;
               Message var28;
               label505: {
                  boolean var10001;
                  Exception var30;
                  label506: {
                     label475: {
                        try {
                           var4 = new Message((byte)-105);
                           break label475;
                        } catch (Exception var24) {
                           var30 = var24;
                        } finally {
                           ;
                        }

                        var4 = null;
                        break label506;
                     }

                     var28 = var4;

                     try {
                        try {
                           var5.a.a(var4);
                           break label504;
                        } catch (Exception var22) {
                           var30 = var22;
                        }
                     } catch (Throwable var23) {
                        var10000 = var23;
                        var10001 = false;
                        break label505;
                     }
                  }

                  var28 = var4;

                  try {
                     var30.printStackTrace();
                  } catch (Throwable var21) {
                     var10000 = var21;
                     var10001 = false;
                     break label505;
                  }

                  var4.a();
                  break label508;
               }

               Throwable var29 = var10000;
               var28.a();
               throw var29;
            }

            var4.a();
         }
      }

      super.b();
   }

   public final void c() {
      super.c();
   }
}
