package pasta;

import javax.microedition.lcdui.Image;

public final class ae {
   private static Image a = dz.b("/mainImage/myTexture2dbtMenu1.png");
   private static int[] a;
   private static Image b = dz.b("/mainImage/myTexture2dbtMenu2.png");
   private static int g;
   private static int h;
   private static int i;
   private static int j;
   public int a;
   private MyVector a;
   private cd a;
   public boolean a;
   private boolean[] a;
   public int b;
   private cd b;
   private boolean b;
   private int[] b;
   public int c;
   private boolean c;
   public int d;
   private boolean d;
   private int e;
   private boolean e;
   private int f;
   private boolean f;
   private boolean g;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;

   public ae() {
      this.a = new cd(ab.bb, 0);
      this.b = new cd(ab.aO, main.a.i - 71, main.a.j - ag.g + 1);
      this.b = new int[3];
   }

   private boolean a() {
      boolean var1;
      if ((this.g || a[a.length - 1] <= this.c) && (!this.g || a[a.length - 1] >= main.a.j)) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public final void a() {
      if ((!GameSrc.a().k || !GameSrc.a().h) && this.a && !this.a()) {
         boolean var1;
         label247: {
            if (!main.a.a[2] && !main.a.a[4]) {
               if (!main.a.a[8] && !main.a.a[6]) {
                  if (main.a.a[5]) {
                     this.n = 2;
                     var1 = false;
                  } else if (main.a.a[12] && !GameSrc.a().d()) {
                     if (this.a()) {
                        return;
                     }

                     if (this.a.a <= 0) {
                        this.n = 2;
                     }

                     aw.a();
                     var1 = false;
                  } else {
                     if (!GameSrc.a().d() && !this.b && (main.a.a[13] || ag.a(this.b))) {
                        if (this.a()) {
                           return;
                        }

                        if (!this.f) {
                           this.f = true;
                        }

                        this.g = true;
                        aw.a();
                     }

                     var1 = false;
                  }
                  break label247;
               }

               ++this.a;
               if (this.a > this.a.size() - 1) {
                  this.a = 0;
                  var1 = true;
                  break label247;
               }
            } else {
               --this.a;
               if (this.a < 0) {
                  this.a = this.a.size() - 1;
                  var1 = true;
                  break label247;
               }
            }

            var1 = true;
         }

         int var4;
         if (var1) {
            var4 = this.a * this.e + this.e - main.a.i / 2;
            g = var4;
            if (var4 > i) {
               g = i;
            }

            if (g < 0) {
               g = 0;
            }

            if (this.a == this.a.size() - 1 || this.a == 0) {
               h = g;
            }
         }

         if (!this.b && main.a.j && !main.a.b(this.b, this.c, this.k, this.f) && !this.c && !GameSrc.a().d()) {
            if (!this.a()) {
               this.m = 0;
               this.l = 0;
               this.c = false;
               main.a.j();
               this.g = true;
               this.f = true;
               aw.a();
            }
         } else {
            int var2;
            if (main.a.h) {
               if (!this.c && main.a.b(this.b, this.c, this.k, this.f)) {
                  for(var4 = 0; var4 < this.b.length; ++var4) {
                     this.b[0] = main.a.a;
                  }

                  this.m = main.a.a;
                  this.c = true;
                  boolean var3;
                  if (this.o != 0) {
                     var3 = true;
                  } else {
                     var3 = false;
                  }

                  this.d = var3;
                  this.o = 0;
               } else if (this.c) {
                  ++this.l;
                  if (this.l > 5 && this.m == main.a.a && !this.d) {
                     this.m = -1000;
                     this.a = (g + main.a.a - this.b) / this.e;
                  }

                  var2 = main.a.a - this.b[0];
                  if (var2 != 0 && this.a != -1) {
                     this.a = -1;
                  }

                  for(var4 = this.b.length - 1; var4 > 0; --var4) {
                     this.b[var4] = this.b[var4 - 1];
                  }

                  this.b[0] = main.a.a;
                  var4 = g - var2;
                  g = var4;
                  if (var4 < 0) {
                     g = 0;
                  }

                  if (g > i) {
                     g = i;
                  }

                  label158: {
                     if (h >= 0) {
                        var4 = var2;
                        if (h <= i) {
                           break label158;
                        }
                     }

                     var4 = var2 / 2;
                  }

                  h -= var4;
               }
            }

            if (main.a.j && this.c) {
               var2 = main.a.a;
               var4 = this.b[0];
               main.a.j = false;
               if (cq.f(var2 - var4) < 20 && cq.f(main.a.a - this.m) < 20 && !this.d) {
                  this.o = 0;
                  g = h;
                  this.m = -1000;
                  this.a = (g + main.a.a - this.b) / this.e;
                  this.l = 0;
                  this.n = 10;
               } else if (this.a != -1 && this.l > 5) {
                  this.l = 0;
                  this.n = 1;
               } else if (this.a == -1 && !this.d) {
                  if (h < 0) {
                     g = 0;
                  } else if (h > i) {
                     g = i;
                  } else {
                     var4 = main.a.a - this.b[0] + (this.b[0] - this.b[1]) + (this.b[1] - this.b[2]);
                     byte var5;
                     if (var4 > 10) {
                        var5 = 10;
                     } else if (var4 < -10) {
                        var5 = -10;
                     } else {
                        var5 = 0;
                     }

                     this.o = -var5 * 100;
                  }
               }

               this.c = false;
               this.l = 0;
               main.a.j = false;
            }

            main.a.onCancelChat();
            main.a.e();
         }
      }

   }

   public final void a(MyVector var1) {
      this.b(var1);
      this.b = true;
   }

   public final void a(MyVector var1, int var2, int var3) {
      this.b(var1);
      this.b = var2;

      for(this.c = var3; this.c + this.f > main.a.j; this.c -= 2) {
      }

   }

   public final void a(dm var1) {
      if (!GameSrc.a().k || !GameSrc.a().h) {
         var1.a(-var1.a(), -var1.b());
         var1.a(-h, 0);

         for(int var2 = 0; var2 < this.a.size(); ++var2) {
            if (var2 == this.a) {
               var1.a(b, this.b + this.e * var2 + 1, a[var2] + 1, 0);
            } else {
               var1.a(a, this.b + this.e * var2 + 1, a[var2] + 1, 0);
            }

            String[] var7 = ((cd)this.a.elementAt(var2)).a;
            if (var7 == null) {
               var7 = new String[]{((cd)this.a.elementAt(var2)).a};
            }

            int var4 = a[var2] + (this.f - var7.length * 14) / 2 + 1;

            for(int var3 = 0; var3 < var7.length; ++var3) {
               int var5;
               int var6;
               String var8;
               cg var9;
               if (var2 == this.a) {
                  var9 = cg.g;
                  var8 = var7[var3];
                  var6 = this.b;
                  var5 = this.e;
                  var9.a(var1, var8, this.e / 2 + var6 + var5 * var2, var4 + var3 * 14, 2);
               } else {
                  var9 = cg.f;
                  var8 = var7[var3];
                  var5 = this.b;
                  var6 = this.e;
                  var9.a(var1, var8, this.e / 2 + var5 + var6 * var2, var4 + var3 * 14, 2);
               }
            }
         }

         var1.a(-var1.a(), -var1.b());
      }

   }

   public final void b() {
      int var1;
      if (this.o != 0 && !this.c) {
         var1 = g + this.o / 100;
         g = var1;
         if (var1 < 0) {
            g = 0;
         } else if (g > i) {
            g = i;
         } else {
            h = g;
         }

         this.o = this.o * 9 / 10;
         if (this.o < 100 && this.o > -100) {
            this.o = 0;
         }
      }

      if (h != g && !this.c) {
         this.p = g - h << 2;
         this.q += this.p;
         h += this.q >> 4;
         this.q &= 15;
      }

      int var2;
      int var3;
      int[] var4;
      cd var5;
      if (!this.g) {
         ++this.d;

         for(var1 = 0; var1 < a.length; ++var1) {
            if (a[var1] > this.c) {
               var3 = a[var1] - this.c >> 1;
               var2 = var3;
               if (var3 <= 0) {
                  var2 = 1;
               }

               if (this.d > var1) {
                  var4 = a;
                  var4[var1] -= var2;
               }
            }
         }

         if (a[a.length - 1] <= this.c) {
            this.d = 0;
         }
      } else {
         ++this.d;

         for(var1 = 0; var1 < a.length; ++var1) {
            if (a[var1] < main.a.j) {
               var3 = (main.a.j - a[var1] >> 1) + 2;
               var2 = var3;
               if (var3 <= 0) {
                  var2 = 1;
               }

               if (this.d > var1) {
                  var4 = a;
                  var4[var1] += var2;
               }
            }
         }

         if (a[a.length - 1] >= main.a.j) {
            this.d = 0;
            this.g = false;
            this.a = false;
            pasta.a.g();
            if (this.f) {
               main.a.a.a = null;
               Char.a = null;
               if (main.a.b != null && main.a.b.a != null) {
                  main.a.b.a = null;
               }
            } else if (this.e) {
               main.a.a.a = null;
               if (main.a.b != null && main.a.b.a != null) {
                  main.a.b.a = null;
               }

               if (this.a >= 0) {
                  var5 = (cd)this.a.elementAt(this.a);
                  if (var5 != null) {
                     aw.a();
                     var5.a();
                  }
               }
            }
         }
      }

      if (j != 0) {
         var1 = j >> 1;
         j = var1;
         if (var1 < 0) {
            j = 0;
         }
      }

      if (!this.a() && this.n > 0) {
         --this.n;
         if (this.n == 0) {
            if (this.a >= 0 && !this.a[this.a]) {
               this.g = true;
               this.e = true;
               main.a.a.a = null;
            } else {
               pasta.a.g();
               if (this.a >= 0) {
                  var5 = (cd)this.a.elementAt(this.a);
                  if (var5 != null) {
                     var5.a();
                  }
               }
            }
         }
      }

   }

   public final void b(MyVector var1) {
      if (!this.a && !gameFunc.c && gameFunc.charAttack == 0) {
         this.g = false;
         this.e = false;
         this.f = false;
         this.d = 0;
         cd var3;
         if (var1.size() == 1) {
            this.a = 0;
            var3 = (cd)var1.elementAt(0);
            if (var3 != null && var3.a.equals(ab.bV)) {
               var3.a();
               this.a = false;
               pasta.a.e();
               return;
            }
         }

         aw.a();
         this.a = new boolean[var1.size()];

         int var2;
         for(var2 = 0; var2 < this.a.length; ++var2) {
            this.a[var2] = false;
         }

         this.b = false;
         pasta.k.a = null;
         cb.b.removeAllElements();
         cb.d.removeAllElements();
         pasta.a.g();
         if (var1.size() != 0) {
            this.a = var1;
            this.e = 60;
            this.f = 60;

            for(var2 = 0; var2 < var1.size(); ++var2) {
               var3 = (cd)var1.elementAt(var2);
               var3.a = false;
               cg.n.a(var3.a);
               var3.a = cg.n.a(var3.a, this.e - 10);
            }

            a = new int[var1.size()];
            this.b = (main.a.i - var1.size() * this.e) / 2;
            if (this.b <= 0) {
               this.b = 1;
            }

            this.c = main.a.j - this.f - (bw.a + 1) - 1;
            if (main.a.e) {
               this.c -= 3;
            }

            this.c += 27;

            for(var2 = 0; var2 < a.length; ++var2) {
               a[var2] = main.a.j;
            }

            this.a = true;
            this.a = 0;
            var2 = this.a.size() * this.e - main.a.i;
            i = var2;
            if (var2 < 0) {
               i = 0;
            }

            g = 0;
            h = 0;
            j = 50;
            this.k = var1.size() * this.e - 1;
            if (this.k > main.a.i - 2) {
               this.k = main.a.i - 2;
            }

            if (main.a.e) {
               this.a = -1;
            }
         }
      }

   }
}
