package pasta;

import javax.microedition.lcdui.Image;

public final class bn {
   private static Image a;
   public static MyVector a = new MyVector("vTeleport");
   private static Image[] a = new Image[5];
   public int a;
   public boolean a;
   public int b;
   private boolean b;
   public int c;
   private boolean c;
   private int d;
   private boolean d;
   private int e;
   private boolean e;
   private int f;
   private boolean f;
   private int g;
   private boolean g;
   private int h;
   private boolean h;
   private int i;
   private int j;
   private int k;
   private int l;

   public bn(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      byte var8 = 0;
      super();
      this.e = false;
      this.j = 1;
      this.a = var1;
      this.b = 5;
      this.f = var2;
      (new StringBuffer("TELEPORT x= ")).append(var1).append(" y= ").append(var2).append(" type= ").append(var5);
      this.d = var3;
      this.e = var5;
      this.b = var6;
      this.g = var4;
      this.h = var7;
      this.i = 0;
      var2 = var8;

      while(var2 < 100) {
         ++var2;
         this.f += 12;
         if (TileMap.a(var1, this.f, 2)) {
            if (this.f % 24 != 0) {
               this.f -= this.f % 24;
            }
            break;
         }
      }

      (new StringBuffer("Y2= ")).append(this.f).append("--------------------------------------------------------------");
      this.d = true;
      if (this.h > 2) {
         this.f += 4;
         if (a[3] == null) {
            a[3] = dz.c("/mainImage/myTexture2dmaybay4a.png");
         }

         if (a[4] == null) {
            a[4] = dz.c("/mainImage/myTexture2dmaybay4b.png");
         }

         if (a == null) {
            a = dz.c("/mainImage/hole.png");
         }
      } else if (a[var7] == null) {
         a[var7] = dz.b("/mainImage/myTexture2dmaybay" + (var7 + 1) + ".png");
      }

      if (var1 > GameSrc.k && var1 < GameSrc.k + main.a.i && this.f > 100) {
         aw.a();
         aw.a();
         this.e = true;
         aw.a();
      }

   }

   public static void a(bn var0) {
      a.addElement(var0);
   }

   public final void a() {
      if (this.b) {
         if (gameFunc.c) {
            Char.myCharz().b = false;
            if (this.e == 0) {
               pasta.j.b = false;
               Char.u = true;
            }

            a.removeElement(this);
            return;
         }

         if (this.c) {
            this.b = -80;
         }

         if (this.d) {
            this.b = this.f;
         }
      }

      if (this.h > 2 && this.a && this.b != -80) {
         if (this.d && this.i == 0) {
            if (main.a.g % 3 == 0) {
               y.b(1, this.a, this.b, 0);
            }
         } else if (this.c && main.a.g % 3 == 0) {
            y.b(1, this.a, this.b + 16, 1);
         }
      }

      ++this.k;
      if (this.k > 3) {
         this.k = 0;
      }

      int var1;
      int var2;
      if (this.d) {
         this.a = true;
         boolean var3;
         if (this.e == 0) {
            var3 = false;
         } else {
            var3 = true;
         }

         this.f = var3;
         if (this.h < 3) {
            var2 = this.f - this.b >> 3;
            var1 = var2;
            if (var2 <= 0) {
               this.a = false;
               var1 = 1;
            }

            this.b += var1;
         } else {
            if (main.a.g % 2 == 0) {
               ++this.j;
            }

            if (this.f - this.b < this.j) {
               this.b = this.f;
               this.a = false;
            } else {
               this.b += this.j;
            }
         }

         if (this.b && this.e == 1 && Char.myCharz().b) {
            Char.myCharz().b = this.a;
            Char.myCharz().c = this.b - 30;
            Char.myCharz().h = 4;
            GameSrc.m = this.a - GameSrc.c;
            GameSrc.n = this.b - GameSrc.d;
            GameSrc.a.b = false;
         }

         if (GameSrc.a(this.c) != null && !this.b && this.e == 1 && GameSrc.a(this.c).b) {
            GameSrc.a(this.c).b = this.a;
            GameSrc.a(this.c).c = this.b - 30;
            GameSrc.a(this.c).h = 4;
         }

         if (cq.f(this.b - this.f) < 50 && TileMap.a(this.a, this.b, 2)) {
            this.g = true;
            if (this.h < 3) {
               aw.a();
               if (this.b % 24 != 0) {
                  this.b -= this.b % 24;
               }

               ++this.i;
               if (this.i > 10) {
                  this.i = 0;
                  this.d = false;
                  this.c = true;
                  this.a = false;
               }

               if (this.e == 1) {
                  if (this.b) {
                     Char.myCharz().b = false;
                  } else if (GameSrc.a(this.c) != null) {
                     GameSrc.a(this.c).b = false;
                  }

                  this.f = false;
               }
            } else {
               this.b = this.f;
               if (!this.h) {
                  y.b(92, this.a + 4, this.b + 14, 0);
                  GameSrc.J = 10;
                  this.h = true;
               }

               ++this.i;
               if (this.i > 30) {
                  this.i = 0;
                  this.d = false;
                  this.c = true;
                  this.a = false;
               }

               if (this.e == 1) {
                  if (this.b) {
                     Char.myCharz().b = false;
                  } else if (GameSrc.a(this.c) != null) {
                     GameSrc.a(this.c).b = false;
                  }

                  this.f = false;
               }
            }
         }
      } else if (this.c) {
         ++this.i;
         if (this.i > 30) {
            var2 = this.f + 24 - this.b >> 3;
            var1 = var2;
            if (var2 > 30) {
               var1 = 30;
            }

            this.b -= var1;
            this.a = true;
         } else {
            if (this.i == 14 && this.e) {
               aw.a();
            }

            if (this.i > 0 && this.e == 0) {
               if (this.b) {
                  Char.myCharz().b = false;
                  if (Char.myCharz().h != 14) {
                     Char.myCharz().h = 3;
                  }

                  Char.myCharz().e = -3;
               } else if (GameSrc.a(this.c) != null) {
                  GameSrc.a(this.c).b = false;
                  if (GameSrc.a(this.c).h != 14) {
                     GameSrc.a(this.c).h = 3;
                  }

                  GameSrc.a(this.c).e = -3;
               }

               this.f = false;
            }

            if (this.i > 12 && this.e == 0) {
               if (this.b) {
                  Char.myCharz().b = true;
               } else if (GameSrc.a(this.c) != null) {
                  GameSrc.a(this.c).b = this.a;
                  GameSrc.a(this.c).c = this.b;
                  GameSrc.a(this.c).b = true;
               }

               this.f = true;
            }
         }

         if (this.b) {
            if (this.e == 0) {
               GameSrc.m = this.a - GameSrc.c;
               GameSrc.n = this.b - GameSrc.d;
            }

            if (this.e == 1) {
               GameSrc.a.b = true;
            }
         }

         if (this.b <= -80) {
            if (this.b && this.e == 0) {
               pasta.j.b = false;
               Char.u = true;
            }

            if (!this.b && GameSrc.a(this.c) != null && this.e == 0) {
               GameSrc.d.removeElement(GameSrc.a(this.c));
            }

            if (this.h < 3) {
               a.removeElement(this);
            } else {
               this.b = -80;
               ++this.l;
               if (this.l > 80) {
                  this.l = 0;
                  a.removeElement(this);
               }
            }
         }
      }

      if (this.a && this.h < 3 && cq.f(this.b - this.f) <= 50 && main.a.g % 5 == 0) {
         dh.a(new cx(19, this.a, this.f + 20, 2, 1, -1));
      }

   }

   public final void a(dm var1) {
      if (!this.b && this.h > 2 && this.g) {
         var1.a(a, this.a, this.f + 20, bk.c);
      }

   }

   public final void b(dm var1) {
      byte var2 = 2;
      if (!Char.w && !this.b && this.a >= GameSrc.k && this.a <= GameSrc.k + main.a.i) {
         aa var9 = GameSrc.a[this.d];
         byte var3;
         byte var4;
         if (this.h == 0) {
            var4 = 15;
            var3 = 40;
         } else {
            var4 = 0;
            var3 = 0;
         }

         if (this.h == 1) {
            var4 = 7;
            var3 = 55;
         }

         byte var5;
         int var10;
         if (this.h == 2) {
            var10 = 18;
            var4 = 52;
         } else {
            var5 = var3;
            var10 = var4;
            var4 = var5;
         }

         if (this.f && this.h < 3) {
            short var6 = var9.a[Char.a[0][0][0]].a;
            int var7 = this.a;
            if (this.g != 1) {
               var10 = -var10;
            }

            int var8 = this.b;
            if (this.g == 1) {
               var5 = 0;
            } else {
               var5 = 2;
            }

            ao.a(var1, var6, var7 + var10, var8 - var4, var5, bk.a);
         }

         int var11;
         Image var13;
         if (this.h < 3) {
            var13 = a[this.h];
            var10 = dm.a(a[this.h]);
            var11 = dm.b(a[this.h]);
            if (this.g != 1) {
               var2 = 0;
            }

            var1.a(var13, 0, 0, var10, var11, var2, this.a, this.b, bk.c);
         } else {
            int var12;
            if (this.d) {
               if (this.i > 10) {
                  var13 = a[4];
                  var12 = dm.a(a[4]);
                  var11 = dm.b(a[4]);
                  if (this.g != 1) {
                     var2 = 0;
                  }

                  if (this.g == 1) {
                     var10 = this.a - 11;
                  } else {
                     var10 = this.a + 11;
                  }

                  var1.a(var13, 0, 0, var12, var11, var2, var10, this.b + 2, bk.c);
               } else {
                  var13 = a[3];
                  var11 = dm.a(a[3]);
                  var10 = dm.b(a[3]);
                  if (this.g != 1) {
                     var2 = 0;
                  }

                  var1.a(var13, 0, 0, var11, var10, var2, this.a, this.b, bk.c);
               }
            } else if (this.i < 20) {
               var13 = a[4];
               var11 = dm.a(a[4]);
               var12 = dm.b(a[4]);
               if (this.g != 1) {
                  var2 = 0;
               }

               if (this.g == 1) {
                  var10 = this.a - 11;
               } else {
                  var10 = this.a + 11;
               }

               var1.a(var13, 0, 0, var11, var12, var2, var10, this.b + 2, bk.c);
            } else {
               var13 = a[3];
               var11 = dm.a(a[3]);
               var10 = dm.b(a[3]);
               if (this.g != 1) {
                  var2 = 0;
               }

               var1.a(var13, 0, 0, var11, var10, var2, this.a, this.b, bk.c);
            }
         }
      }

   }
}
