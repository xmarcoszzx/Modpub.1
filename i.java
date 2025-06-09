package pasta;

import javax.microedition.lcdui.Image;

public class i implements as {
   public static Image a = dz.b("/mainImage/myTexture2dmobHP.png");
   public static MyVector a = new MyVector("lastMob");
   public static cv[] a;
   public static MyVector b = new MyVector("newMob");
   private int A;
   private int B;
   private int C;
   private int D;
   private int E;
   private int F;
   public byte a;
   public int a;
   public long a;
   public Char a;
   private i a;
   short a;
   boolean a;
   private int[] a;
   public int b;
   public Char b;
   public boolean b;
   private int[] b;
   public int c;
   private MyVector c = new MyVector("vMobMove");
   public boolean c = false;
   private int[] c;
   public int d;
   public boolean d;
   private int[] d;
   public int e;
   public boolean e;
   private int[] e;
   public int f;
   public boolean f;
   public int g = 1;
   public boolean g;
   public int h;
   public boolean h;
   public int i;
   public boolean i = true;
   public int j;
   public boolean j;
   public int k;
   public boolean k;
   public int l;
   public boolean l;
   public int m;
   private boolean m;
   public int n;
   private boolean n;
   public int o;
   private boolean o = true;
   public int p;
   private boolean p;
   public int q;
   public int r;
   public int s;
   public int t;
   public int u;
   public int v;
   public int w;
   public int x;
   private int y = 1;
   private int z;

   public i() {
      int[] var1 = new int[12];
      var1[8] = 1;
      var1[9] = 1;
      var1[10] = 1;
      var1[11] = 1;
      this.a = var1;
      this.b = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
      this.c = new int[]{1, 1, 2, 2, 3, 3, 2};
      this.d = new int[]{4, 5, 6};
      this.e = new int[]{7, 8, 9};
      this.j = false;
   }

   public i(int var1, boolean var2, boolean var3, boolean var4, int var5, int var6, int var7, int var8, short var9, short var10, byte var11, byte var12) {
      int[] var13 = new int[12];
      var13[8] = 1;
      var13[9] = 1;
      var13[10] = 1;
      var13[11] = 1;
      this.a = var13;
      this.b = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
      this.c = new int[]{1, 1, 2, 2, 3, 3, 2};
      this.d = new int[]{4, 5, 6};
      this.e = new int[]{7, 8, 9};
      this.j = false;
      this.d = var2;
      this.e = var3;
      this.f = var4;
      this.u = var6;
      this.q = var1;
      this.r = var5;
      this.c = var7;
      this.e = var9;
      this.l = var9;
      this.f = var10;
      this.m = var10;
      this.h = var11;
      if (var5 != 70) {
         m();
         this.a();
      }

      if (!a(String.valueOf(var5))) {
         b.addElement(String.valueOf(var5));
      }

      this.d = var8;
      this.a = var12;
      this.m = false;
      this.v = var9;
      this.w = var10;
      if (this.g()) {
         var13 = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
         this.a = var13;
         var13 = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
         this.b = var13;
         var13 = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
         this.c = var13;
         this.d = new int[]{3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
         this.e = new int[]{3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
      } else if (this.h()) {
         var13 = new int[12];
         var13[8] = 1;
         var13[9] = 1;
         var13[10] = 1;
         var13[11] = 1;
         this.a = var13;
         this.b = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 3, 3, 3, 3};
         this.c = new int[]{1, 1, 2, 2, 1, 1, 3, 3};
         this.d = new int[]{4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6};
         this.e = new int[]{7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 9};
      } else if (this.b()) {
         var13 = new int[12];
         var13[8] = 1;
         var13[9] = 1;
         var13[10] = 1;
         var13[11] = 1;
         this.a = var13;
         this.b = new int[]{2, 2, 3, 3, 2, 2, 4, 4, 2, 2, 3, 3, 2, 2, 4, 4};
         this.c = new int[]{2, 2, 3, 3, 2, 2, 4, 4};
         this.d = new int[]{5, 6, 7, 8, 9, 10, 11, 12};
         this.e = new int[]{5, 12, 13, 14};
      } else {
         var13 = new int[12];
         var13[8] = 1;
         var13[9] = 1;
         var13[10] = 1;
         var13[11] = 1;
         this.a = var13;
         this.b = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
         this.c = new int[]{1, 1, 2, 2, 3, 3, 2};
         this.d = new int[]{4, 5, 6};
         this.e = new int[]{7, 8, 9};
      }

      (new StringBuffer("MOB ID= ")).append(var1);
   }

   public static be a() {
      int var0 = 0;

      be var2;
      while(true) {
         if (var0 >= GameSrc.f.size()) {
            var2 = null;
            break;
         }

         i var1 = (i)GameSrc.f.elementAt(var0);
         if (var1 instanceof be) {
            var2 = (be)var1;
            break;
         }

         ++var0;
      }

      return var2;
   }

   public static bm a(byte var0) {
      i var1 = (i)GameSrc.f.elementAt(var0);
      bm var2;
      if (var1 instanceof bm) {
         var2 = (bm)var1;
      } else {
         var2 = null;
      }

      return var2;
   }

   public static ci a() {
      int var0 = 0;

      ci var2;
      while(true) {
         if (var0 >= GameSrc.f.size()) {
            var2 = null;
            break;
         }

         i var1 = (i)GameSrc.f.elementAt(var0);
         if (var1 instanceof ci) {
            var2 = (ci)var1;
            break;
         }

         ++var0;
      }

      return var2;
   }

   public static s a() {
      int var0 = 0;

      s var2;
      while(true) {
         if (var0 >= GameSrc.f.size()) {
            var2 = null;
            break;
         }

         i var1 = (i)GameSrc.f.elementAt(var0);
         if (var1 instanceof s) {
            var2 = (s)var1;
            break;
         }

         ++var0;
      }

      return var2;
   }

   public static boolean a(String var0) {
      boolean var2 = false;

      for(int var1 = 0; var1 < b.size(); ++var1) {
         if (((String)b.elementAt(var1)).equals(var0)) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   private boolean g() {
      boolean var1;
      if (this.r == 76) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private boolean h() {
      boolean var1;
      if (this.r >= 73 && !this.g()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private static void m() {
      byte var3 = 0;
      int var1 = 0;

      int var0;
      int var2;
      for(var0 = 0; var1 < a.length; var0 = var2) {
         var2 = var0;
         if (a[var1].a != null) {
            var2 = var0 + 1;
         }

         ++var1;
      }

      if (var0 >= 10) {
         for(var1 = var3; var1 < a.length; ++var1) {
            if (a[var1].a != null && var0 > 5) {
               a[var1].a = null;
            }
         }
      }

   }

   public int a() {
      return this.e;
   }

   public final cv a() {
      return a[this.r];
   }

   public final void a() {
      if (a[this.r].a == null) {
         a[this.r].a = new bl();
         String var1 = "/Mob/" + this.r;
         if ("".getClass().getResourceAsStream(var1) != null) {
            a[this.r].a.a(var1 + "/data");
            a[this.r].a.a = dz.b(var1 + "/img.png");
         } else {
            av.a().e(this.r);
         }

         a.addElement(String.valueOf(this.r));
      } else {
         this.n = a[this.r].a.b;
         this.o = a[this.r].a.c;
      }

   }

   public void a(Char var1) {
      this.i = true;
      this.a = null;
      this.a = var1;
      this.i = 0;
      this.j = 0;
      this.h = 3;
      this.A = 0;
      byte var2;
      if (var1.b > this.e) {
         var2 = 1;
      } else {
         var2 = -1;
      }

      this.g = var2;
      int var4 = var1.b;
      int var3 = var1.c;
      if (cq.f(var4 - this.e) < this.n << 1 && cq.f(var3 - this.f) < this.o << 1) {
         if (this.e < var4) {
            this.e = var4 - this.n;
         } else {
            this.e = var4 + this.n;
         }

         this.k = 0;
      } else {
         this.k = 1;
      }

   }

   public void a(dm var1) {
      if (this.o && this.h != 0) {
         byte var2 = TileMap.a;
         if (TileMap.a(this.v + var2 / 2, this.w + 1, 4)) {
            var1.f(this.v / var2 * var2, (this.w - 30) / var2 * var2, var2, 100);
         } else if (TileMap.a((this.v - var2 / 2) / var2, (this.w + 1) / var2) == 0) {
            var1.f(this.v / var2 * var2, var2 * ((this.w - 30) / var2), 100, 100);
         } else if (TileMap.a((this.v + var2 / 2) / var2, (this.w + 1) / var2) == 0) {
            var1.f(this.v / var2 * var2, (this.w - 30) / var2 * var2, var2, 100);
         } else if (TileMap.a(this.v - var2 / 2, this.w + 1, 8)) {
            var1.f(this.v / 24 * var2, (this.w - 30) / var2 * var2, var2, 100);
         }

         var1.a(TileMap.b, this.v, this.w, 3);
         var1.f(GameSrc.k, GameSrc.l - main.a.o, GameSrc.a, GameSrc.b + main.a.o * 2);
      }

      if (this.c() && (this.h != 1 || this.k <= 0 || main.a.g % 3 != 0)) {
         var1.a(0, main.a.o);
         int var3;
         if (!this.a) {
            bl var7 = a[this.r].a;
            int var6 = this.B;
            var3 = this.e;
            int var4 = this.f;
            int var5 = this.D;
            byte var8;
            if (this.g == 1) {
               var8 = 0;
            } else {
               var8 = 1;
            }

            var7.a(var1, var6, var3, var5 + var4, var8, 2);
         } else {
            ao.a(var1, this.a, this.e, this.f + this.D - 14, 0, 3);
         }

         var1.a(0, -main.a.o);
         if (Char.myCharz().a != null && Char.myCharz().a.equals(this) && this.h != 1) {
            var3 = (int)((long)this.c * 100L / (long)this.d) / 10 - 1;
            int var9 = var3;
            if (var3 < 0) {
               var9 = 0;
            }

            var3 = var9;
            if (var9 > 9) {
               var3 = 9;
            }

            var1.a(a, 0, (9 - var3) * 6, 9, 6, 0, this.e, this.f - this.o - 10, 3);
         }
      }

   }

   public void a(i var1) {
      this.a = var1;
      this.i = true;
      this.a = null;
      this.i = 0;
      this.j = 0;
      this.h = 3;
      this.A = 0;
      byte var2;
      if (var1.e > this.e) {
         var2 = 1;
      } else {
         var2 = -1;
      }

      this.g = var2;
      int var4 = var1.e;
      int var3 = var1.f;
      if (cq.f(var4 - this.e) < this.n << 1 && cq.f(var3 - this.f) < this.o << 1) {
         if (this.e < var4) {
            this.e = var4 - this.n;
         } else {
            this.e = var4 + this.n;
         }

         this.k = 0;
      } else {
         this.k = 1;
      }

   }

   public void a(short var1) {
      this.a = true;
      this.a = var1;
   }

   public void a(int[] var1) {
      ++this.A;
      if (this.A > var1.length - 1) {
         this.A = 0;
      }

      this.B = var1[this.A];
   }

   public final boolean a() {
      boolean var1;
      if (!(this instanceof s) && !(this instanceof ci) && !(this instanceof be) && !(this instanceof bm)) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public int b() {
      return this.f;
   }

   public void b() {
      this.a = false;
   }

   boolean b() {
      boolean var1;
      if ((this.r < 58 || this.r > 65) && this.r != 67 && this.r != 68) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public int c() {
      return this.o;
   }

   public void c() {
      if (this.x == 0 && main.a.g % 25 == 0) {
         pasta.y.a(114, this);
      }

      if (this.x == 1 && main.a.g % 4 == 0) {
         pasta.y.a(132, this);
      }

      if (this.x == 2 && main.a.g % 7 == 0) {
         pasta.y.a(131, this);
      }

   }

   public boolean c() {
      boolean var2 = false;
      boolean var1;
      if (this.e < GameSrc.k) {
         var1 = var2;
      } else {
         var1 = var2;
         if (this.e <= GameSrc.k + GameSrc.a) {
            var1 = var2;
            if (this.f >= GameSrc.l) {
               var1 = var2;
               if (this.f <= GameSrc.l + GameSrc.b + 30) {
                  var1 = var2;
                  if (a[this.r] != null) {
                     var1 = var2;
                     if (a[this.r].a != null) {
                        var1 = var2;
                        if (a[this.r].a.a != null) {
                           var1 = var2;
                           if (this.h != 0) {
                              var1 = true;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var1;
   }

   public int d() {
      return this.n;
   }

   public boolean d() {
      boolean var2 = false;
      boolean var1;
      if (a[this.r] == null) {
         var1 = var2;
      } else {
         var1 = var2;
         if (a[this.r].a != null) {
            var1 = var2;
            if (this.h != 0) {
               var1 = true;
            }
         }
      }

      return var1;
   }

   public void e() {
      if (this.c > 0 && this.h != 3) {
         this.p = 4;
         this.h = 7;
         if (this.a().c != 0 && cq.f(this.e - this.l) < 30) {
            this.e -= this.g * 10;
         }
      }

   }

   public boolean e() {
      boolean var1;
      if (!this.g && this.a <= 0) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public void f() {
      if (this.A < 2) {
         int[] var4;
         if (this.k == 0) {
            var4 = this.d;
         } else {
            var4 = this.e;
         }

         this.a(var4);
         if (this.e >= GameSrc.k && this.e <= GameSrc.k + main.a.i && this.k == 0 && main.a.g % 2 == 0) {
            aw.a();
         }
      }

      if (this.i == 0) {
         int var1;
         if (this.a != null) {
            var1 = this.a.b;
         } else {
            var1 = this.a.e;
         }

         int var2;
         if (this.a != null) {
            var2 = this.a.c;
         } else {
            var2 = this.a.f;
         }

         if (this.e > this.l + a[this.r].a) {
            this.i = 1;
         }

         if (this.e < this.l - a[this.r].a) {
            this.i = 1;
         }

         if ((a[this.r].c == 4 || a[this.r].c == 5) && !this.d) {
            int var3 = this.f;
            this.f = (var2 - this.f) / 20 + var3;
         }

         ++this.j;
         if (this.j > 3 || this.i == 1) {
            this.i = 1;
            if (this.k == 0) {
               if (this.a != null) {
                  this.a.a(this.s, this.t, false, true);
               } else {
                  this.a.e();
               }

               this.i = false;
            } else {
               if (this.a != null) {
                  pasta.n.a(this.e + this.g * this.n, this.f, this.e(), this.s, this.t, this.a, this.a().d);
               } else {
                  Char var6 = new Char();
                  var6.b = this.a.e;
                  var6.c = this.a.f;
                  var6.charID = -100;
                  pasta.n.a(this.e + this.g * this.n, this.f, this.e(), this.s, this.t, var6, this.a().d);
               }

               this.i = false;
            }
         }

         byte var5;
         if (this.e < var1) {
            var5 = 1;
         } else {
            var5 = -1;
         }

         this.g = var5;
      } else if (this.i == 1) {
         if (a[this.r].c != 0 && !this.d && !this.e && !this.f) {
            this.e += (this.l - this.e) / 4;
            this.f += (this.m - this.f) / 4;
         }

         if (cq.f(this.l - this.e) < 5 && cq.f(this.m - this.f) < 5 && this.A == 2) {
            this.h = 2;
            this.i = 0;
            this.j = 0;
            this.A = 0;
         }
      }

   }

   public boolean f() {
      boolean var2 = true;
      boolean var1 = var2;
      if (this.h != 0) {
         var1 = var2;
         if (this.h != 1) {
            var1 = false;
         }
      }

      return var1;
   }

   public void g() {
      byte var2 = 4;
      byte var4 = 0;
      byte var3 = 1;
      byte var1 = var4;

      label448: {
         boolean var10001;
         label449: {
            try {
               if (!this.j) {
                  break label449;
               }
            } catch (Exception var52) {
               var10001 = false;
               break label448;
            }

            var1 = var4;

            try {
               this.h = 1;
            } catch (Exception var47) {
               var10001 = false;
               break label448;
            }

            var1 = var4;

            try {
               this.j = this.b.i << 3;
            } catch (Exception var46) {
               var10001 = false;
               break label448;
            }

            var1 = var4;

            try {
               this.i = -5;
            } catch (Exception var45) {
               var10001 = false;
               break label448;
            }

            var1 = var4;

            try {
               this.k = 0;
            } catch (Exception var44) {
               var10001 = false;
               break label448;
            }
         }

         byte var53;
         label470: {
            label435: {
               label451: {
                  try {
                     if (this.e) {
                        return;
                     }
                  } catch (Exception var48) {
                     var10001 = false;
                     break label451;
                  }

                  label452: {
                     try {
                        if (this.d || this.f) {
                           break label452;
                        }
                     } catch (Exception var51) {
                        var10001 = false;
                        break label451;
                     }

                     label453: {
                        try {
                           switch(a[this.r].c) {
                           case 0:
                              break label453;
                           case 1:
                           case 2:
                           case 3:
                              break label470;
                           case 4:
                              break;
                           case 5:
                              break label435;
                           default:
                              return;
                           }
                        } catch (Exception var50) {
                           var10001 = false;
                           break label451;
                        }

                        label454: {
                           try {
                              byte var56 = (byte)(a[this.r].b + this.q % 2);
                              this.e += this.g * var56;
                              if (main.a.g % 10 > 2) {
                                 int var54 = this.f;
                                 this.f = var56 * this.y + var54;
                              }
                           } catch (Exception var19) {
                              var10001 = false;
                              break label454;
                           }

                           label455: {
                              try {
                                 if (this.e > this.l + a[this.r].a) {
                                    this.g = -1;
                                    this.h = 2;
                                    this.F = main.a.g % 20 + 20;
                                    this.i = 0;
                                    break label455;
                                 }
                              } catch (Exception var18) {
                                 var10001 = false;
                                 break label454;
                              }

                              try {
                                 if (this.e < this.l - a[this.r].a) {
                                    this.g = 1;
                                    this.h = 2;
                                    this.F = main.a.g % 20 + 20;
                                    this.i = 0;
                                 }
                              } catch (Exception var17) {
                                 var10001 = false;
                                 break label454;
                              }
                           }

                           label456: {
                              try {
                                 if (this.f > this.m + 24) {
                                    this.y = -1;
                                    break label456;
                                 }
                              } catch (Exception var16) {
                                 var10001 = false;
                                 break label454;
                              }

                              try {
                                 if (this.f < this.m - (main.a.g % 10 + 20)) {
                                    this.y = 1;
                                 }
                              } catch (Exception var15) {
                                 var10001 = false;
                                 break label454;
                              }
                           }

                           try {
                              this.a(this.b);
                              return;
                           } catch (Exception var14) {
                              var10001 = false;
                           }
                        }

                        var1 = var2;
                        break label448;
                     }

                     try {
                        if (this.g()) {
                           this.B = this.a[main.a.g % this.a.length];
                           return;
                        }
                     } catch (Exception var49) {
                        var10001 = false;
                        break label451;
                     }

                     try {
                        this.B = 0;
                        return;
                     } catch (Exception var21) {
                        var10001 = false;
                        break label451;
                     }
                  }

                  try {
                     this.a(this.a);
                     return;
                  } catch (Exception var22) {
                     var10001 = false;
                  }
               }

               var1 = 1;
               break label448;
            }

            var1 = 5;

            try {
               var53 = (byte)(a[this.r].b + this.q % 2);
               this.e += this.g * var53;
               var53 = (byte)(var53 + (main.a.g + this.q) % 2);
               if (main.a.g % 10 > 2) {
                  int var55 = this.f;
                  this.f = var53 * this.y + var55;
               }
            } catch (Exception var9) {
               var10001 = false;
               break label448;
            }

            label458: {
               try {
                  if (this.e > this.l + a[this.r].a) {
                     this.g = -1;
                     this.h = 2;
                     this.F = main.a.g % 20 + 20;
                     this.i = 0;
                     break label458;
                  }
               } catch (Exception var13) {
                  var10001 = false;
                  break label448;
               }

               try {
                  if (this.e < this.l - a[this.r].a) {
                     this.g = 1;
                     this.h = 2;
                     this.F = main.a.g % 20 + 20;
                     this.i = 0;
                  }
               } catch (Exception var12) {
                  var10001 = false;
                  break label448;
               }
            }

            label459: {
               try {
                  if (this.f > this.m + 24) {
                     this.y = -1;
                     break label459;
                  }
               } catch (Exception var11) {
                  var10001 = false;
                  break label448;
               }

               try {
                  if (this.f < this.m - (main.a.g % 10 + 20)) {
                     this.y = 1;
                  }
               } catch (Exception var10) {
                  var10001 = false;
                  break label448;
               }
            }

            try {
               if (!TileMap.a(this.e, this.f, 2)) {
                  return;
               }

               if (main.a.g % 10 > 5) {
                  this.f = TileMap.a(this.f);
                  this.h = 4;
                  this.i = 0;
                  this.y = -1;
                  return;
               }
            } catch (Exception var8) {
               var10001 = false;
               break label448;
            }

            try {
               this.y = -1;
               return;
            } catch (Exception var7) {
               var10001 = false;
               break label448;
            }
         }

         var4 = 3;
         var1 = var4;

         byte var5;
         try {
            var5 = a[this.r].b;
         } catch (Exception var43) {
            var10001 = false;
            break label448;
         }

         if (var5 == 1) {
            var1 = var4;

            try {
               if (main.a.g % 2 == 1) {
                  return;
               }
            } catch (Exception var41) {
               var10001 = false;
               break label448;
            }

            var53 = var5;
         } else if (var5 > 2) {
            var1 = var4;

            try {
               var53 = (byte)(var5 + this.q % 2);
            } catch (Exception var40) {
               var10001 = false;
               break label448;
            }
         } else {
            label462: {
               var53 = var5;
               var1 = var4;

               try {
                  if (main.a.g % 2 != 1) {
                     break label462;
                  }
               } catch (Exception var42) {
                  var10001 = false;
                  break label448;
               }

               var53 = (byte)(var5 - 1);
            }
         }

         var1 = var4;

         int var57;
         try {
            var57 = this.e;
         } catch (Exception var39) {
            var10001 = false;
            break label448;
         }

         var1 = var4;

         try {
            this.e = var53 * this.g + var57;
         } catch (Exception var38) {
            var10001 = false;
            break label448;
         }

         var1 = var4;

         label463: {
            label464: {
               try {
                  if (this.e > this.l + a[this.r].a) {
                     break label464;
                  }
               } catch (Exception var37) {
                  var10001 = false;
                  break label448;
               }

               var1 = var4;

               try {
                  if (this.e >= this.l - a[this.r].a) {
                     break label463;
                  }
               } catch (Exception var36) {
                  var10001 = false;
                  break label448;
               }

               var1 = var4;

               try {
                  this.g = 1;
                  break label463;
               } catch (Exception var34) {
                  var10001 = false;
                  break label448;
               }
            }

            var1 = var4;

            try {
               this.g = -1;
            } catch (Exception var35) {
               var10001 = false;
               break label448;
            }
         }

         var1 = var4;

         label465: {
            try {
               if (cq.f(this.e - Char.myCharz().b) >= 40) {
                  break label465;
               }
            } catch (Exception var33) {
               var10001 = false;
               break label448;
            }

            var1 = var4;

            try {
               if (cq.f(this.e - this.l) >= a[this.r].a) {
                  break label465;
               }
            } catch (Exception var32) {
               var10001 = false;
               break label448;
            }

            var53 = var3;
            var1 = var4;

            label328: {
               try {
                  if (this.e <= Char.myCharz().b) {
                     break label328;
                  }
               } catch (Exception var31) {
                  var10001 = false;
                  break label448;
               }

               var53 = -1;
            }

            var1 = var4;

            try {
               this.g = var53;
            } catch (Exception var29) {
               var10001 = false;
               break label448;
            }

            var1 = var4;

            label466: {
               try {
                  if (cq.f(this.e - Char.myCharz().b) >= 20) {
                     break label466;
                  }
               } catch (Exception var30) {
                  var10001 = false;
                  break label448;
               }

               var1 = var4;

               try {
                  this.e -= this.g * 10;
               } catch (Exception var28) {
                  var10001 = false;
                  break label448;
               }
            }

            var1 = var4;

            try {
               this.h = 2;
            } catch (Exception var27) {
               var10001 = false;
               break label448;
            }

            var1 = var4;

            try {
               this.F = 20;
            } catch (Exception var26) {
               var10001 = false;
               break label448;
            }
         }

         var1 = var4;

         int[] var6;
         label467: {
            label468: {
               try {
                  if (this.n <= 30) {
                     break label468;
                  }
               } catch (Exception var25) {
                  var10001 = false;
                  break label448;
               }

               var1 = var4;

               try {
                  var6 = this.b;
                  break label467;
               } catch (Exception var24) {
                  var10001 = false;
                  break label448;
               }
            }

            var1 = var4;

            try {
               var6 = this.c;
            } catch (Exception var23) {
               var10001 = false;
               break label448;
            }
         }

         var1 = var4;

         try {
            this.a(var6);
            return;
         } catch (Exception var20) {
            var10001 = false;
         }
      }

      System.out.println("lineee: " + var1);
   }

   public void h() {
      this.c = 0;
      this.j = true;
      this.c = 0;
      this.h = 1;
      this.i = -3;
      this.j = -this.g;
      this.k = 0;
   }

   public void i() {
      if (this.h == 5) {
         this.h = 2;
         this.k = 0;
         this.j = 0;
         this.i = 0;
         this.F = 50;
      }

   }

   public void j() {
      if (this.b != 0) {
         this.b = 0;
      }

   }

   public void k() {
      this.k = false;
   }

   public void l() {
      this.l = false;
   }

   public void onCancelChat() {
      if (this.k && main.a.g % 5 == 0) {
         pasta.y.a(113, this.e, this.f, 1);
      }

      if (this.l && main.a.g % 10 == 0) {
         dh.a(new cx(41, this.e, this.f, 3, 1, 1));
      }

      int var1;
      if (!main.a.b && this.h != 1 && this.h != 0 && !main.a.b && main.a.g % ((this.q << 1) + 15) == 0) {
         Char var6;
         for(var1 = 0; var1 < GameSrc.d.size(); ++var1) {
            var6 = (Char)GameSrc.d.elementAt(var1);
            if (var6 != null && var6.B && var6.C == 32) {
               Char var7 = new Char();
               var7.b = var6.b;
               var7.c = var6.c - var6.B;
               if (var6.k == 0) {
                  pasta.n.a(this.e + this.g * this.n, this.f, this.e(), -100, -100, var7, 25);
               }
            }
         }

         if (Char.myCharz().B && Char.myCharz().C == 32) {
            var6 = new Char();
            var6.b = Char.myCharz().b;
            var6.c = Char.myCharz().c - Char.myCharz().B;
            if (Char.myCharz().k == 0) {
               pasta.n.a(this.e + this.g * this.n, this.f, this.e(), -100, -100, var6, 25);
            }
         }
      }

      if (this.b != 0 && main.a.g % 5 == 0) {
         dh.a(new cx(this.b, this.e, this.f + 24, 3, 5, 1));
      }

      if (this.c) {
         if (main.a.g % 5 == 0) {
            pasta.y.a(113, this.e, this.f, 1);
         }

         long var3 = System.currentTimeMillis();
         if (var3 - this.a >= 1000L) {
            --this.a;
            this.a = var3;
            if (this.a < 0) {
               this.c = false;
               this.a = 0;
            }
         }

         if (this.g()) {
            this.B = this.d[main.a.g % this.d.length];
         } else if (this.h()) {
            if (main.a.g % 20 > 5) {
               this.B = 11;
            } else {
               this.B = 10;
            }
         } else if (this.b()) {
            if (main.a.g % 20 > 5) {
               this.B = 1;
            } else {
               this.B = 15;
            }
         } else if (main.a.g % 20 > 5) {
            this.B = 11;
         } else {
            this.B = 10;
         }
      }

      if (this.d()) {
         byte var8;
         if (this.o) {
            var8 = TileMap.a;
            this.v = this.e;
            this.z = 0;
            if (this.w > 0 && !TileMap.a(this.v, this.w, 2)) {
               if (TileMap.a(this.v / var8, this.w / var8) == 0) {
                  this.n = true;
               } else if (TileMap.a(this.v / var8, this.w / var8) != 0 && !TileMap.a(this.v, this.w, 2)) {
                  this.v = this.e;
                  this.w = this.f;
                  this.n = false;
               }

               while(this.n && this.z < 10) {
                  ++this.z;
                  this.w += 24;
                  if (TileMap.a(this.v, this.w, 2)) {
                     if (this.w % 24 != 0) {
                        this.w -= this.w % 24;
                     }
                     break;
                  }
               }
            }
         }

         if (this.c != null || a[this.r].a == 0) {
            if (this.h != 3 && this.i) {
               if (this.a != null) {
                  this.a.a(this.s, this.t, false, true);
               } else if (this.a != null) {
                  this.a.e();
               }

               this.i = false;
            }

            if (this.a > 0) {
               this.c();
            }

            switch(this.h) {
            case 1:
               this.d = false;
               this.e = false;
               this.f = false;
               this.f += this.i;
               if (main.a.g % 2 == 0) {
                  if (this.j > 1) {
                     --this.j;
                  } else if (this.j < -1) {
                     ++this.j;
                  }
               }

               this.e += this.j;
               if (this.g()) {
                  this.B = this.d[main.a.g % this.d.length];
               } else if (!this.h() && this.b()) {
                  this.B = 15;
               } else {
                  this.B = 11;
               }

               if (this.m) {
                  this.m = false;
                  if (this.h) {
                     for(var1 = 0; var1 < GameSrc.f.size(); ++var1) {
                        if (((i)GameSrc.f.elementAt(var1)).q == this.q) {
                           GameSrc.f.removeElementAt(var1);
                        }
                     }
                  }

                  this.i = 0;
                  this.j = 0;
                  this.f = 0;
                  this.e = 0;
                  this.c = this.a().a;
                  this.h = 0;
                  this.p = 0;
               } else {
                  if ((TileMap.b(this.e, this.f) & 2) == 2) {
                     if (this.i > 4) {
                        var1 = -4;
                     } else {
                        var1 = -this.i;
                     }

                     this.i = var1;
                     if (this.k == 0) {
                        this.k = 16;
                     }
                  } else {
                     ++this.i;
                  }

                  if (this.k > 0) {
                     --this.k;
                     if (this.k == 0) {
                        this.m = true;
                     }
                  }
               }
               break;
            case 2:
               if (this.b == 0 && !this.c && !this.k && !this.l) {
                  this.p = 0;
                  this.a(this.a);
                  switch(a[this.r].c) {
                  case 0:
                  case 1:
                  case 2:
                  case 3:
                     ++this.i;
                     if (this.i > this.q % 10 + 10 && (this.a == null || cq.f(this.a.b - this.e) > 80) && (this.a == null || cq.f(this.a.e - this.e) > 80)) {
                        this.h = 5;
                     }
                     break;
                  case 4:
                  case 5:
                     ++this.i;
                     if (this.i > this.q % 3 && (this.a == null || cq.f(this.a.b - this.e) > 80) && (this.a == null || cq.f(this.a.e - this.e) > 80)) {
                        this.h = 5;
                     }
                  }

                  if (this.a != null && main.a.g % (this.i % 20 + 10) == 0) {
                     if (this.a.b > this.e) {
                        this.g = 1;
                     } else {
                        this.g = -1;
                     }
                  } else if (this.a != null && main.a.g % (this.i % 20 + 10) == 0) {
                     if (this.a.e > this.e) {
                        this.g = 1;
                     } else {
                        this.g = -1;
                     }
                  }

                  if (this.F > 0) {
                     --this.F;
                     this.h = 2;
                  }
               }
               break;
            case 3:
               if (this.b == 0 && !this.k && !this.l && !this.c) {
                  this.f();
               }
               break;
            case 4:
               if (this.b == 0 && !this.k && !this.l && !this.c) {
                  this.p = 0;
                  ++this.i;
                  if (this.i > this.q % 5 + 40) {
                     this.f -= 2;
                     this.h = 5;
                     this.i = 0;
                  }
               }
               break;
            case 5:
               if (this.b == 0 && !this.k && !this.l) {
                  if (this.c) {
                     if (a[this.r].c == 4) {
                        ++this.E;
                        ++this.C;
                        int var2 = this.D;
                        if (!this.p) {
                           var8 = 1;
                        } else {
                           var8 = -1;
                        }

                        this.D = var8 + var2;
                        if (this.C == 10) {
                           this.C = 0;
                           boolean var5;
                           if (this.p) {
                              var5 = false;
                           } else {
                              var5 = true;
                           }

                           this.p = var5;
                        }
                     }
                  } else {
                     this.p = 0;
                     this.g();
                  }
               }
               break;
            case 6:
               this.p = 0;
               ++this.i;
               this.f += this.i;
               if (this.f >= this.m) {
                  this.f = this.m;
                  this.i = 0;
                  this.h = 5;
               }
               break;
            case 7:
               if (!this.i && main.a.g % 4 == 0) {
                  if (this.g()) {
                     this.B = this.d[main.a.g % this.d.length];
                  } else if (this.h()) {
                     if (this.B != 10) {
                        this.B = 10;
                     } else {
                        this.B = 11;
                     }
                  } else if (this.b()) {
                     if (this.B != 1) {
                        this.B = 1;
                     } else {
                        this.B = 15;
                     }
                  } else if (this.B != 10) {
                     this.B = 10;
                  } else {
                     this.B = 11;
                  }
               }

               --this.p;
               if (this.p > 0 || !this.g() && (!this.h() || this.B != 11) && (!this.b() || this.B != 15) && (this.r >= 58 || this.B != 11)) {
                  if (a[this.r].c != 0 && this.b != null) {
                     var1 = -this.b.i;
                     if (this.e > this.l - a[this.r].a && this.e < this.l + a[this.r].a) {
                        this.e -= var1 << 1;
                     }
                  }
               } else {
                  if ((this.b == null || !this.j) && this.c != 0) {
                     this.h = 5;
                     if (this.b != null) {
                        this.g = -this.b.i;
                        if (cq.f(this.e - this.b.b) < 24) {
                           this.h = 2;
                        }
                     }

                     this.k = 0;
                     this.j = 0;
                     this.i = 0;
                     this.p = 0;
                  } else {
                     this.h = 1;
                     this.j = this.b.i << 1;
                     this.i = -3;
                     this.k = 0;
                  }

                  this.b = null;
               }
            }
         }
      }

   }
}
