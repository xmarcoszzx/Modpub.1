package pasta;

import javax.microedition.lcdui.Image;

public final class w extends ag implements ah {
   private static Image a;
   private static ce a;
   public static w a;
   private static Image b;
   private static ce b;
   private static int[] e;
   private static int y;
   private byte a = 0;
   private int a;
   private long a;
   private short a;
   private boolean a;
   private byte[] a = new byte[]{19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20};
   private int[] a;
   private cy[] a;
   private short[] a;
   private byte b;
   private int b;
   private long b;
   private boolean b;
   private byte[] b;
   private int[] b;
   private int c;
   private boolean c;
   private int[] c;
   private int d;
   private int[] d;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private int t;
   private int u = 0;
   private int v = 0;
   private int w;
   private int x;

   public w() {
      byte[] var1 = new byte[]{0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3};
      this.b = var1;
      int[] var2 = new int[2];
      e = var2;
      var2[0] = 16;
      y = main.a.j - 41;
      e[1] = main.a.i - 40;
      a = new ce(dz.b("/e/e_1.png"), 30, 30);
      b = new ce(dz.b("/e/e_0.png"), 68, 65);
      new ce(dz.b("/e/e_2.png"), 66, 70);
      b = dz.b("/e/nut2.png");
      a = dz.b("/e/nut3.png");
      this.q = 230;
      this.o = main.a.k - this.q / 2;
      this.r = 40;
      this.p = -this.r;
   }

   private byte a() {
      int var3 = 0;

      byte var1;
      for(var1 = 0; var3 < this.a.length; ++var3) {
         if (this.a[var3].b) {
            ++var1;
         }
      }

      byte var2 = var1;
      if (var1 > this.n) {
         var2 = (byte)this.n;
      }

      return var2;
   }

   public static w a() {
      if (a == null) {
         a = new w();
      }

      return a;
   }

   private byte b() {
      byte var2 = 0;
      byte var4 = 0;

      byte var5;
      for(int var3 = 0; var3 < this.a.length; var4 = var5) {
         var5 = var4;
         if (this.a[var3].b) {
            var5 = (byte)(var4 + 1);
         }

         ++var3;
      }

      byte var1 = (byte)(var4 - this.a());
      if (var1 <= 0) {
         var1 = var2;
      }

      return var1;
   }

   private void c(int var1) {
      if (this.m != var1) {
         this.m = var1;
      } else if (var1 == 0) {
         if (this.a < 2) {
            if (this.a() + this.b() > 0) {
               this.a = 2;
               aw.a();
               Char.myCharz().a(GameSrc.a[13], 0);
               this.b = main.a.a + (long)cq.b(2000, 3000);
            }
         } else if (this.p == main.a.l / 3) {
            av.a().c(this.b, (byte)0);
         }
      } else {
         GameSrc.a().i = false;
         GameSrc.a().a();
      }

   }

   private void goToMap(int var1) {
      if (!this.a[var1].b) {
         aw.a();
         int var2;
         if (this.b == 0) {
            var2 = Char.myCharz().D;
         } else {
            var2 = Char.myCharz().f();
         }

         if (this.a() >= this.n && var2 < this.t + this.s) {
            StringBuffer var4 = (new StringBuffer(String.valueOf(ab.e))).append(" ");
            String var3;
            if (this.b == 0) {
               var3 = ab.bf;
            } else {
               var3 = ab.bg;
            }

            var3 = var4.append(var3).toString();
            GameSrc.a.a(var3, 0);
         } else {
            this.l = var1;
            this.a[this.l].d = this.k + cq.b(-3, 3);
         }
      }

   }

   private void onCancelChat() {
      for(int var1 = 0; var1 < Char.myCharz().arrItemBag.length; ++var1) {
         if (Char.myCharz().arrItemBag[var1] != null && Char.myCharz().arrItemBag[var1].itemTemplate.templateId == this.a) {
            this.n = Char.myCharz().arrItemBag[var1].quantity;
            break;
         }
      }

   }

   public final void a() {
      GameSrc.a = true;
      GameSrc.a().i = true;
      super.a();
   }

   public final void a(int var1, Object var2) {
   }

   public final void a(dm var1) {
      Exception var10000;
      label182: {
         boolean var10001;
         try {
            GameSrc.a().a(var1);
            var1.a(-GameSrc.k, -GameSrc.l);
            var1.a(0, main.a.o);
         } catch (Exception var24) {
            var10000 = var24;
            var10001 = false;
            break label182;
         }

         int var2 = 0;

         while(true) {
            try {
               if (var2 >= this.a.length) {
                  break;
               }
            } catch (Exception var22) {
               var10000 = var22;
               var10001 = false;
               break label182;
            }

            try {
               if (this.a[var2].a && this.a[var2].b > this.a[var2].d - 20) {
                  var1.a(TileMap.b, this.a[var2].a, this.a[var2].d + 7, 3);
               }
            } catch (Exception var23) {
               var10000 = var23;
               var10001 = false;
               break label182;
            }

            ++var2;
         }

         var2 = 0;

         int var3;
         int var4;
         while(true) {
            label159: {
               label185: {
                  try {
                     if (var2 < this.a.length) {
                        break label159;
                     }

                     if (!this.a) {
                        break;
                     }

                     if (a == null) {
                        break label185;
                     }

                     var3 = Char.myCharz().b;
                     var4 = a.a;
                  } catch (Exception var21) {
                     var10000 = var21;
                     var10001 = false;
                     break label182;
                  }

                  var2 = 0;

                  while(true) {
                     try {
                        if (var2 >= main.a.i / a.a + 1) {
                           break;
                        }
                     } catch (Exception var19) {
                        var10000 = var19;
                        var10001 = false;
                        break label182;
                     }

                     try {
                        a.a(this.w, var3 - var4 - 28 - (a.a - 1) * var2, Char.myCharz().c - a.b / 2 - 12 + 2, 0, 0, var1);
                     } catch (Exception var18) {
                        var10000 = var18;
                        var10001 = false;
                        break label182;
                     }

                     ++var2;
                  }
               }

               try {
                  if (b != null) {
                     var2 = Char.myCharz().b;
                     var3 = b.a;
                     b.a(this.w, var2 - var3 - 10 - 5, Char.myCharz().c - b.b / 2 - 12, 0, 0, var1);
                  }
                  break;
               } catch (Exception var17) {
                  var10000 = var17;
                  var10001 = false;
                  break label182;
               }
            }

            try {
               if (this.a[var2].a) {
                  ao.a(var1, this.a[var2].i, this.a[var2].a, this.a[var2].b, 0, 3);
               }
            } catch (Exception var20) {
               var10000 = var20;
               var10001 = false;
               break label182;
            }

            ++var2;
         }

         label131: {
            cg var5;
            StringBuffer var6;
            StringBuffer var26;
            cg var27;
            label188: {
               try {
                  GameSrc.c(var1);
                  var2 = main.a.i - 240;
                  var1.a(13524492);
                  var1.e(var2, 0, 240, 15);
                  var1.a(Panel.d, var2 + 11, 8, 3);
                  var1.a(Panel.e, var2 + 90, 7, 3);
                  var5 = cg.n;
                  var6 = new StringBuffer(String.valueOf(Char.myCharz().D));
                  var5.a(var1, var6.toString(), var2 + 24, 2, 0, cg.o);
                  var27 = cg.n;
                  var26 = new StringBuffer(String.valueOf(Char.myCharz().G));
                  var27.a(var1, var26.toString(), var2 + 100, 2, 0, cg.o);
                  var1.a(Panel.f, var2 + 150, 8, 3);
                  var5 = cg.n;
                  var6 = new StringBuffer(String.valueOf(Char.myCharz().H));
                  var5.a(var1, var6.toString(), var2 + 160, 2, 0, cg.o);
                  var1.a(Panel.g, var2 + 200, 8, 3);
                  var27 = cg.n;
                  var26 = new StringBuffer(String.valueOf(this.n));
                  var27.a(var1, var26.toString(), var2 + 210, 2, 0, cg.o);
                  if (this.a >= 4) {
                     break label131;
                  }

                  var2 = main.a.i - 140;
                  var1.a(11837316);
                  var1.e(var2, 15, 140, 15);
                  if (this.b == 0) {
                     var1.a(Panel.d, var2 + 21, 23, 3);
                     break label188;
                  }
               } catch (Exception var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label182;
               }

               try {
                  var1.a(Panel.f, var2 + 21, 22, 3);
                  var1.a(Panel.e, var2 + 18, 22, 3);
               } catch (Exception var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label182;
               }
            }

            try {
               var27 = cg.p;
               var26 = new StringBuffer("-");
               var27.a(var1, var26.append(this.t).toString(), var2 + 30, 17, 0, cg.o);
               var1.a(Panel.g, var2 + 80, 22, 3);
               var5 = cg.p;
               var6 = new StringBuffer("-");
               var5.a(var1, var6.append(this.a()).toString(), var2 + 90, 17, 0, cg.o);
            } catch (Exception var14) {
               var10000 = var14;
               var10001 = false;
               break label182;
            }
         }

         try {
            var1.a(GameSrc.i, e[0], y, 0);
            if (this.m == 0) {
               var1.a(GameSrc.j, e[0], y, 0);
            }
         } catch (Exception var13) {
            var10000 = var13;
            var10001 = false;
            break label182;
         }

         label190: {
            try {
               if (this.a < 3) {
                  ao.a(var1, 540, e[0] + 14, y + 14, 0, bk.f);
                  break label190;
               }
            } catch (Exception var12) {
               var10000 = var12;
               var10001 = false;
               break label182;
            }

            try {
               var1.a(b, e[0] + 14 - 10, y + 14 - 10, 0);
            } catch (Exception var11) {
               var10000 = var11;
               var10001 = false;
               break label182;
            }
         }

         try {
            var1.a(GameSrc.i, e[1], y, 0);
            if (this.m == 1) {
               var1.a(GameSrc.j, e[1], y, 0);
            }
         } catch (Exception var10) {
            var10000 = var10;
            var10001 = false;
            break label182;
         }

         try {
            var1.a(a, e[1] + 14 - 10, y + 14 - 10, 0);
            if (this.a <= 3) {
               return;
            }

            bw.c(this.o, this.p, this.q, this.r, var1);
            var4 = main.a.k;
            var3 = this.a.length * 30 / 2;
         } catch (Exception var9) {
            var10000 = var9;
            var10001 = false;
            break label182;
         }

         var2 = 0;

         while(true) {
            try {
               if (var2 >= this.a.length) {
                  return;
               }
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
               break;
            }

            try {
               ao.a(var1, this.a[var2], var4 - var3 + 5 + var2 * 30, this.p + 10, 0, 0);
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
               break;
            }

            ++var2;
         }
      }

      Exception var25 = var10000;
      System.out.println("-paint--null: " + var25.toString());
   }

   public final void a(short[] var1) {
      this.a = 3;
      this.a = var1;
   }

   public final void a(short[] var1, byte var2, int var3, short var4) {
      if (var1 != null && var1.length > 0) {
         this.k = Char.myCharz().c - 10;
         this.a = main.a.l / 3 + 10;
         if (this.a > 50) {
            this.a = 50;
         }

         this.b = 360;
         GameSrc.k = GameSrc.o / 2;
         this.c = GameSrc.l + main.a.l / 3 + 30;
         this.j = 175;
         this.d = 0;
         this.i = 360 / this.j;
         this.a = new int[this.j];
         this.b = new int[this.j];
         this.c = new int[this.j];
         this.d = new int[this.j];
         int var5;
         if (!main.a.b) {
            for(var5 = 0; var5 < this.b.length; ++var5) {
               this.b[var5] = cq.f(this.a * cq.a(this.d) / 1024);
               this.a[var5] = cq.f(this.a * cq.b(this.d) / 1024);
               if (this.d < 90) {
                  this.c[var5] = this.b + this.a[var5];
                  this.d[var5] = this.c - this.b[var5];
               } else if (this.d >= 90 && this.d < 180) {
                  this.c[var5] = this.b - this.a[var5];
                  this.d[var5] = this.c - this.b[var5];
               } else if (this.d >= 180 && this.d < 270) {
                  this.c[var5] = this.b - this.a[var5];
                  this.d[var5] = this.c + this.b[var5];
               } else {
                  this.c[var5] = this.b + this.a[var5];
                  this.d[var5] = this.c + this.b[var5];
               }

               this.d += this.i;
            }
         }

         this.a = new cy[var1.length];

         for(var5 = 0; var5 < this.a.length; ++var5) {
            this.a[var5] = new cy();
            this.a[var5].i = var1[var5];
            this.a[var5].e = var5 * 25;
            this.a[var5].d = -999;
            this.a[var5].g = cq.b(2, 5);
            this.a[var5].h = cq.b(-1, 2);
            cy var6 = this.a[var5];
            var6.a = new Char();
            var6.a.charID = cq.b(-999, -800);
            var6.a.V = -1;
            var6.a.X = -1;
            var6.a.W = -1;
            var6.a.Y = -1;
            var6.a.a = "";
            Char var7 = var6.a;
            var6.a.w = 20;
            var7.t = 20;
         }

         this.b = false;
         this.a = false;
         this.c = false;
         this.a = main.a.a + (long)cq.b(1000, 2000);
         this.a = 0;
         this.l = -1;
         this.m = -1;
         this.b = var2;
         this.s = var3;
         this.t = 0;
         Char.myCharz().a((int)470, (int)408, (int)1);
         Char.myCharz().i = 2;
         Char.myCharz().h = 1;
         this.u = 0;
         this.v = 0;
         this.w = 0;
         this.x = 0;
         this.p = -this.r;
         this.a = var4;
         this.n = 0;
         this.onCancelChat();
         this.a();
         aw.a();
      }

   }

   public final void b() {
      int var1 = 0;

      Exception var10000;
      label391: {
         cy var4;
         boolean var10001;
         label385: {
            try {
               this.t = this.s * this.b();
               this.onCancelChat();
               GameSrc.a().b();
               if (this.a - main.a.a <= 0L) {
                  break label385;
               }
            } catch (Exception var43) {
               var10000 = var43;
               var10001 = false;
               break label391;
            }

            while(true) {
               try {
                  if (var1 >= this.a.length) {
                     return;
                  }
               } catch (Exception var6) {
                  var10000 = var6;
                  var10001 = false;
                  break label391;
               }

               try {
                  var4 = this.a[var1];
                  var4.e += 2;
                  if (this.a[var1].e >= this.j) {
                     this.a[var1].e = 0;
                  }
               } catch (Exception var7) {
                  var10000 = var7;
                  var10001 = false;
                  break label391;
               }

               try {
                  this.a[var1].a = this.c[this.a[var1].e];
                  this.a[var1].b = this.d[this.a[var1].e];
               } catch (Exception var5) {
                  var10000 = var5;
                  var10001 = false;
                  break label391;
               }

               ++var1;
            }
         }

         try {
            if (this.a == 0) {
               this.a = 1;
            }
         } catch (Exception var42) {
            var10000 = var42;
            var10001 = false;
            break label391;
         }

         label393: {
            try {
               if (this.a != 1) {
                  break label393;
               }
            } catch (Exception var41) {
               var10000 = var41;
               var10001 = false;
               break label391;
            }

            var1 = 0;

            while(true) {
               try {
                  if (var1 >= this.a.length) {
                     break;
                  }
               } catch (Exception var37) {
                  var10000 = var37;
                  var10001 = false;
                  break label391;
               }

               label368: {
                  label395: {
                     label396: {
                        try {
                           if (this.a[var1].d == -999 || this.a[var1].b) {
                              break label368;
                           }

                           if (this.a[var1].b < this.a[var1].d) {
                              if (this.a[var1].f < 0) {
                                 this.a[var1].f = 0;
                              }
                              break label396;
                           }
                        } catch (Exception var40) {
                           var10000 = var40;
                           var10001 = false;
                           break label391;
                        }

                        try {
                           if (this.a[var1].f > 0) {
                              this.a[var1].f = 0;
                           }
                        } catch (Exception var39) {
                           var10000 = var39;
                           var10001 = false;
                           break label391;
                        }

                        try {
                           var4 = this.a[var1];
                           var4.b += this.a[var1].f;
                           var4 = this.a[var1];
                           --var4.f;
                           break label395;
                        } catch (Exception var34) {
                           var10000 = var34;
                           var10001 = false;
                           break label391;
                        }
                     }

                     label398: {
                        try {
                           if (this.a[var1].b + this.a[var1].f > this.a[var1].d) {
                              this.a[var1].b = this.a[var1].d;
                              break label398;
                           }
                        } catch (Exception var38) {
                           var10000 = var38;
                           var10001 = false;
                           break label391;
                        }

                        try {
                           var4 = this.a[var1];
                           var4.b += this.a[var1].f;
                        } catch (Exception var36) {
                           var10000 = var36;
                           var10001 = false;
                           break label391;
                        }
                     }

                     try {
                        var4 = this.a[var1];
                        ++var4.f;
                     } catch (Exception var35) {
                        var10000 = var35;
                        var10001 = false;
                        break label391;
                     }
                  }

                  try {
                     if (this.a[var1].b == this.a[var1].d) {
                        cx var44 = new cx(19, this.a[var1].a - 5, this.a[var1].b + 25, 2, 1, -1);
                        dh.a(var44);
                        aw.a();
                        this.a[var1].b = true;
                        if (!this.b) {
                           this.b = true;
                        }
                     }
                  } catch (Exception var33) {
                     var10000 = var33;
                     var10001 = false;
                     break label391;
                  }
               }

               ++var1;
            }
         }

         label399: {
            try {
               if (this.a != 2) {
                  break label399;
               }
            } catch (Exception var32) {
               var10000 = var32;
               var10001 = false;
               break label391;
            }

            var1 = 0;

            while(true) {
               try {
                  if (var1 >= this.a.length) {
                     ++this.u;
                     if (this.u > this.a.length - 1) {
                        this.u = this.a.length - 1;
                        this.a = true;
                        aw.a();
                        if (!this.c && this.b - main.a.a < 0L) {
                           av.a().c((byte)2, (byte)((byte)(this.a() + this.b())));
                           this.c = true;
                        }
                     }
                     break;
                  }
               } catch (Exception var30) {
                  var10000 = var30;
                  var10001 = false;
                  break label391;
               }

               label322: {
                  label321: {
                     try {
                        if (this.a[var1].b) {
                           break label322;
                        }

                        if (this.a[var1].b <= -10) {
                           break label321;
                        }

                        if (this.a[var1].f > 0) {
                           this.a[var1].f = 0;
                        }
                     } catch (Exception var31) {
                        var10000 = var31;
                        var10001 = false;
                        break label391;
                     }

                     try {
                        var4 = this.a[var1];
                        var4.b += this.a[var1].f;
                        var4 = this.a[var1];
                        --var4.f;
                        var4 = this.a[var1];
                        var4.a += this.a[var1].g * this.a[var1].h;
                        var4 = this.a[var1];
                        var4.g -= 3;
                     } catch (Exception var28) {
                        var10000 = var28;
                        var10001 = false;
                        break label391;
                     }
                  }

                  try {
                     if (this.a[var1].b == -10) {
                        this.a[var1].a = false;
                     }
                  } catch (Exception var27) {
                     var10000 = var27;
                     var10001 = false;
                     break label391;
                  }
               }

               ++var1;
            }

            try {
               Char.myCharz().C = this.a[this.u];
               ++this.v;
               if (this.v > 5) {
                  this.v = 0;
               }
            } catch (Exception var29) {
               var10000 = var29;
               var10001 = false;
               break label391;
            }

            try {
               this.w = this.b[this.v];
            } catch (Exception var26) {
               var10000 = var26;
               var10001 = false;
               break label391;
            }
         }

         label402: {
            try {
               if (this.a != 3) {
                  break label402;
               }

               if (this.v <= 5) {
                  this.v = 5;
               }
            } catch (Exception var25) {
               var10000 = var25;
               var10001 = false;
               break label391;
            }

            label403: {
               try {
                  ++this.v;
                  if (this.v <= this.b.length - 1) {
                     break label403;
                  }

                  this.v = this.b.length - 1;
                  this.a = 4;
                  this.a = false;
               } catch (Exception var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label391;
               }

               int var3 = 0;
               var1 = 0;

               while(true) {
                  try {
                     if (var1 >= this.a.length) {
                        break;
                     }
                  } catch (Exception var21) {
                     var10000 = var21;
                     var10001 = false;
                     break label391;
                  }

                  int var2 = var3;

                  label405: {
                     try {
                        if (!this.a[var1].b) {
                           break label405;
                        }
                     } catch (Exception var24) {
                        var10000 = var24;
                        var10001 = false;
                        break label391;
                     }

                     var2 = var3;

                     try {
                        if (this.a[var1].c) {
                           break label405;
                        }

                        this.a[var1].i = this.a[var3];
                        this.a[var1].c = true;
                     } catch (Exception var23) {
                        var10000 = var23;
                        var10001 = false;
                        break label391;
                     }

                     var2 = var3 + 1;
                  }

                  ++var1;
                  var3 = var2;
               }
            }

            try {
               this.w = this.b[this.v];
            } catch (Exception var20) {
               var10000 = var20;
               var10001 = false;
               break label391;
            }
         }

         label406: {
            try {
               if (this.a != 4) {
                  break label406;
               }
            } catch (Exception var19) {
               var10000 = var19;
               var10001 = false;
               break label391;
            }

            var1 = 0;

            while(true) {
               try {
                  if (var1 >= this.a.length) {
                     this.a = 5;
                     break;
                  }
               } catch (Exception var17) {
                  var10000 = var17;
                  var10001 = false;
                  break label391;
               }

               try {
                  if (this.a[var1].a) {
                     this.a[var1].c = Char.myCharz().b;
                  }
               } catch (Exception var18) {
                  var10000 = var18;
                  var10001 = false;
                  break label391;
               }

               ++var1;
            }
         }

         label253: {
            try {
               if (this.a != 5) {
                  return;
               }

               ++this.x;
               if (this.p >= main.a.l / 3) {
                  break label253;
               }

               if (this.p + this.x > main.a.l / 3) {
                  this.p = main.a.l / 3;
                  break label253;
               }
            } catch (Exception var16) {
               var10000 = var16;
               var10001 = false;
               break label391;
            }

            try {
               this.p += this.x;
            } catch (Exception var15) {
               var10000 = var15;
               var10001 = false;
               break label391;
            }
         }

         var1 = 0;

         while(true) {
            label239: {
               label409: {
                  label410: {
                     try {
                        if (var1 >= this.a.length) {
                           return;
                        }

                        if (!this.a[var1].a) {
                           break label239;
                        }

                        if (this.a[var1].a < this.a[var1].c) {
                           if (this.a[var1].g < 0) {
                              this.a[var1].g = 0;
                           }
                           break label410;
                        }
                     } catch (Exception var14) {
                        var10000 = var14;
                        var10001 = false;
                        break;
                     }

                     try {
                        if (this.a[var1].g > 0) {
                           this.a[var1].g = 0;
                        }
                     } catch (Exception var13) {
                        var10000 = var13;
                        var10001 = false;
                        break;
                     }

                     try {
                        var4 = this.a[var1];
                        var4.a += this.a[var1].g;
                        var4 = this.a[var1];
                        --var4.g;
                        break label409;
                     } catch (Exception var9) {
                        var10000 = var9;
                        var10001 = false;
                        break;
                     }
                  }

                  label412: {
                     try {
                        if (this.a[var1].a + this.a[var1].g > this.a[var1].c) {
                           this.a[var1].a = this.a[var1].c;
                           break label412;
                        }
                     } catch (Exception var12) {
                        var10000 = var12;
                        var10001 = false;
                        break;
                     }

                     try {
                        var4 = this.a[var1];
                        var4.a += this.a[var1].g;
                     } catch (Exception var11) {
                        var10000 = var11;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     var4 = this.a[var1];
                     ++var4.g;
                  } catch (Exception var10) {
                     var10000 = var10;
                     var10001 = false;
                     break;
                  }
               }

               try {
                  if (this.a[var1].a == this.a[var1].c) {
                     this.a[var1].a = false;
                  }
               } catch (Exception var8) {
                  var10000 = var8;
                  var10001 = false;
                  break;
               }
            }

            ++var1;
         }
      }

      Exception var45 = var10000;
      System.out.println("-upd--null: " + var45.toString());
   }

   public final void c() {
      if (!pasta.a.b) {
         int var1;
         if (main.a.e && !bq.a().a && !main.a.a.a) {
            if (this.a == 1 && main.a.i) {
               for(var1 = 0; var1 < this.a.length; ++var1) {
                  if (main.a.a(this.a[var1].a - 20 - GameSrc.k, this.a[var1].b - 10 - GameSrc.l, 30, 30) && main.a.i && main.a.j) {
                     this.goToMap(var1);
                  }
               }
            }

            if (main.a.i) {
               for(var1 = 0; var1 < e.length; ++var1) {
                  if (main.a.a(e[var1], y, 36, 36) && main.a.i && main.a.j) {
                     this.c(var1);
                  }
               }
            }
         }

         for(var1 = 1; var1 < 8; ++var1) {
            if (main.a.a[var1]) {
               main.a.a[var1] = false;
               this.goToMap(var1 - 1);
            }
         }

         if (main.a.a[12]) {
            main.a.a[12] = false;
            this.c(0);
         }

         if (main.a.a[13]) {
            main.a.a[13] = false;
            this.c(1);
         }

         main.a.onCancelChat();
      }

   }
}
