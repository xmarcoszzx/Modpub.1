package pasta;

public final class dn {
   public int a;
   public cd a;
   public dg a = new dg();
   public boolean a;
   public int[][] a = new int[3][];
   public int b;
   public boolean b = true;
   public int c;
   public int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;

   public dn() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1] = new int[3];
      }

   }

   public final void a() {
      byte var1 = -20;
      if ((!this.equals(GameSrc.b) || GameSrc.a().a == null) && this.b) {
         if (this.a != this.h) {
            this.j = this.h - this.a << 2;
            this.i += this.j;
            this.a += this.i >> 4;
            this.i &= 15;
         }

         if (this.b != this.k) {
            this.m = this.k - this.b << 2;
            this.l += this.m;
            this.b += this.l >> 4;
            this.l &= 15;
         }

         ++this.g;
         if (this.g == 5) {
            this.g = 0;
            if (this.f == 0) {
               this.f = 1;
            } else {
               this.f = 0;
            }
         }

         if (this.a != null && (this.a == null || this.a.a != null)) {
            if (!this.a) {
               if (this.c > 0) {
                  --this.c;
                  if (this.c == 0) {
                     main.a.a.m();
                     main.a.a.t();
                  }
               }

               if (main.a.g % 3 == 0) {
                  if (Char.myCharz().i == 1) {
                     this.k = Char.myCharz().b - 20 - GameSrc.k;
                  }

                  if (Char.myCharz().i == -1) {
                     this.k = Char.myCharz().b + 20 - GameSrc.k;
                  }

                  if (this.k <= 24) {
                     this.k += this.a.a / 2;
                  }

                  if (this.k >= main.a.i - 24) {
                     this.k -= this.a.a / 2;
                  }

                  this.h = Char.myCharz().c - 40 - GameSrc.l;
                  if (this.a.a != null && this.h < (this.a.a.length + 1) * 12 + 10) {
                     this.h = (this.a.a.length + 1) * 12 + 10;
                  }

                  if (this.a.a.a != null) {
                     if (main.a.i - 50 > this.a.e + 155) {
                        this.k = main.a.i - 60 - this.a.e / 2;
                        this.h = this.a.f + 10;
                     } else {
                        this.k = main.a.i - 20 - this.a.e / 2;
                        this.h = this.a.f + 45;
                        if (main.a.i > main.a.j || main.a.i < 220) {
                           this.k = main.a.i - 20 - this.a.e / 2;
                           this.h = this.a.f + 10;
                        }
                     }
                  }
               }

               if (this.b > Char.myCharz().b - GameSrc.k) {
                  this.e = -1;
               } else {
                  this.e = 1;
               }
            }

            if (this.a.a != null) {
               dg var4;
               ef var5;
               if (this.a.a.size() > 1) {
                  if (this.a.a.b == 0) {
                     var4 = this.a;
                     ++var4.b;
                     if (this.a.b >= this.a.a.a) {
                        this.a.b = 0;
                        this.a.a.removeElementAt(0);
                        var5 = (ef)this.a.a.firstElement();
                        this.a.a = var5;
                        this.a.c();
                     }
                  } else {
                     this.a.a.b = System.currentTimeMillis();
                     if (this.a.a.b - this.a.a.a >= 1000L) {
                        this.a.a.a = System.currentTimeMillis();
                        var5 = this.a.a;
                        --var5.b;
                     }

                     if (this.a.a.b == 0) {
                        this.a.a.removeElementAt(0);
                        if (this.a.a.size() != 0) {
                           var5 = (ef)this.a.a.firstElement();
                           this.a.a = var5;
                           this.a.c();
                        }
                     }
                  }
               } else if (this.a.a.size() == 1) {
                  int var2;
                  int var3;
                  if (this.a.a.b == 0) {
                     var4 = this.a;
                     ++var4.b;
                     if (this.a.b >= this.a.a.a) {
                        this.a = true;
                     }

                     if (this.a.b == this.a.a.a) {
                        this.h = -40;
                        var3 = Char.myCharz().b;
                        var2 = GameSrc.k;
                        if (Char.myCharz().i != 1) {
                           var1 = 20;
                        }

                        this.k = var1 + (var3 - var2);
                     }

                     if (this.a.b >= this.a.a.a + 20) {
                        this.a.b = 0;
                        this.a.a.removeAllElements();
                        this.a.a = null;
                     }
                  } else {
                     this.a.a.b = System.currentTimeMillis();
                     if (this.a.a.b - this.a.a.a >= 1000L) {
                        this.a.a.a = System.currentTimeMillis();
                        var5 = this.a.a;
                        --var5.b;
                     }

                     if (this.a.a.b == 0) {
                        this.a = true;
                        this.h = -40;
                        var3 = Char.myCharz().b;
                        var2 = GameSrc.k;
                        if (Char.myCharz().i != 1) {
                           var1 = 20;
                        }

                        this.k = var1 + (var3 - var2);
                        this.a.b = 0;
                        this.a.a.removeAllElements();
                        this.a.a = null;
                        this.a = null;
                     }
                  }
               }
            }
         }
      }

   }

   public final void a(String var1, int var2) {
      gameFunc.checkInfo(var1);
      var1 = cq.a(var1);
      if (this.a.a.size() <= 0 || !var1.equals(((ef)this.a.a.lastElement()).a)) {
         int var3;
         if (this.a.a.size() > 10) {
            for(var3 = 0; var3 < 5; ++var3) {
               this.a.a.removeElementAt(0);
            }
         }

         this.a.a(var1, var2, (Char)null, false);
         if (this.a.a.size() == 1) {
            this.a = 0;
            var3 = Char.myCharz().b;
            int var4 = GameSrc.k;
            byte var5;
            if (Char.myCharz().i == 1) {
               var5 = -20;
            } else {
               var5 = 20;
            }

            this.b = var5 + (var3 - var4);
         }

         this.a = false;
      }

   }

   public final void a(String var1, Char var2, boolean var3) {
      this.d = var2.charID;
      this.a.a(var1, 3, var2, var3);
      this.a = false;
   }

   public final void a(dm var1) {
      byte var3 = 0;
      if ((!this.equals(GameSrc.b) || !GameSrc.a().e()) && (!this.equals(GameSrc.b) || GameSrc.a().a == null) && GameSrc.o && (main.a.a == GameSrc.a() || main.a.a == w.a()) && pasta.k.b == null && this.b && !Char.u && (!main.a.a.a || !this.equals(GameSrc.b))) {
         var1.a(-var1.a(), -var1.b());
         var1.f(0, 0, main.a.i, main.a.j);
         if (this.a != null) {
            this.a.a(var1, this.b, this.a, this.e);
         }

         if (this.a.a != null && this.a.a.a == null && this.a != null) {
            int var4 = this.a[Char.myCharz().k][this.f];
            int var5 = this.b;
            int var6 = this.a;
            byte var2;
            if (main.a.g % 10 > 5) {
               var2 = 1;
            } else {
               var2 = 0;
            }

            if (this.e != 1) {
               var3 = 2;
            }

            ao.a(var1, var4, var5, var6 + 3 + var2, var3, bk.f);
         }

         var1.a(-var1.a(), -var1.b());
      }

   }
}
