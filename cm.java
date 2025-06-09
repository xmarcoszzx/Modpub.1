package pasta;

public class cm extends Char {
   public static boolean R;
   public static u[] all;
   private static int aq;
   public boolean Q;
   public u all;
   public int[] all;
   public int an;
   private int ao;
   private int ap;
   private int ar;
   private long f;
   private long g;

   public cm(int var1, int var2, int var3, int var4, int var5, int var6) {
      super.m = true;
      super.I = var6;
      (new StringBuffer("npc avatar= ")).append(super.I);
      super.b = var3;
      super.c = var4;
      super.ac = var3;
      super.ad = var4;
      super.h = var2;
      if (var1 != -1) {
         this.all = all[var5];
      }

      if (var5 == 23 || var5 == 42) {
         super.B = 45;
      }

      if (var5 == 51) {
         super.m = false;
         this.ao = var2;
         (new StringBuffer("duaHau = ")).append(var2);
      }

      if (this.all != null) {
         if (this.all.a == null) {
            this.all.a = "";
         }

         this.all.a = cq.a(this.all.a);
      }

   }

   public static void D() {
      for(int var0 = 0; var0 < GameSrc.g.size(); ++var0) {
         cm var1 = (cm)GameSrc.g.elementAt(var0);
         var1.a = null;
         var1.aa = -1;
      }

   }

   public final void a(byte var1, int var2) {
      this.ao = var1;
      long var3 = System.currentTimeMillis();
      this.g = var3;
      this.f = var3;
      this.ar = var2;
      (new StringBuffer("in ra second= ")).append(this.ar);
   }

   public void b(dm var1) {
      if (!Char.w && !this.Q && this.e() && super.h != 15) {
         if (super.d != 0) {
            super.b(var1);
         } else if (this.all != null) {
            if (this.all.a != 4 && this.all.a != 51 && this.all.a != 50) {
               var1.a(TileMap.b, super.b, super.c, 3);
            }

            int var2;
            int var3;
            if (this.all.a == 3) {
               pasta.ao.a(var1, 265, super.b, super.c, 0, 33);
               if (Char.myCharz().a != null && Char.myCharz().a.equals(this) && pasta.k.a == null) {
                  var1.a(pasta.i.a, 0, 0, 9, 6, 0, super.b, super.c - super.B + 4, 33);
               }

               this.ap = 60;
            } else if (this.all.a != 4) {
               int var4;
               if (this.all.a != 50 && this.all.a != 51) {
                  if (this.all.a == 6) {
                     pasta.ao.a(var1, 545, super.b, super.c + 5, 0, 33);
                     if (Char.myCharz().a != null && Char.myCharz().a.equals(this) && pasta.k.a == null) {
                        var1.a(pasta.i.a, 0, 0, 9, 6, 0, super.b, super.c - super.B - 9, 33);
                     }

                     cg.c.a(var1, String.valueOf(TileMap.h), super.b, super.c - super.B + 19 - cg.k.a(), 2);
                  } else {
                     var3 = this.all.b;
                     var2 = this.all.d;
                     var4 = this.all.c;
                     aa var7 = GameSrc.a[var3];
                     aa var5 = GameSrc.a[var2];
                     aa var6 = GameSrc.a[var4];
                     if (super.i == 1) {
                        pasta.ao.a(var1, var7.a[Char.a[super.C][0][0]].a, super.b + Char.a[super.C][0][1] + var7.a[Char.a[super.C][0][0]].a, super.c - Char.a[super.C][0][2] + var7.a[Char.a[super.C][0][0]].b, 0, 0);
                        short var8 = var5.a[Char.a[super.C][1][0]].a;
                        var2 = super.b;
                        var3 = Char.a[super.C][1][1];
                        pasta.ao.a(var1, var8, var5.a[Char.a[super.C][1][0]].a + var2 + var3, super.c - Char.a[super.C][1][2] + var5.a[Char.a[super.C][1][0]].b, 0, 0);
                        var8 = var6.a[Char.a[super.C][2][0]].a;
                        var3 = super.b;
                        var2 = Char.a[super.C][2][1];
                        pasta.ao.a(var1, var8, var6.a[Char.a[super.C][2][0]].a + var3 + var2, super.c - Char.a[super.C][2][2] + var6.a[Char.a[super.C][2][0]].b, 0, 0);
                     } else {
                        pasta.ao.a(var1, var7.a[Char.a[super.C][0][0]].a, super.b - Char.a[super.C][0][1] - var7.a[Char.a[super.C][0][0]].a, super.c - Char.a[super.C][0][2] + var7.a[Char.a[super.C][0][0]].b, 2, 24);
                        pasta.ao.a(var1, var5.a[Char.a[super.C][1][0]].a, super.b - Char.a[super.C][1][1] - var5.a[Char.a[super.C][1][0]].a, super.c - Char.a[super.C][1][2] + var5.a[Char.a[super.C][1][0]].b, 2, 24);
                        pasta.ao.a(var1, var6.a[Char.a[super.C][2][0]].a, super.b - Char.a[super.C][2][1] - var6.a[Char.a[super.C][2][0]].a, super.c - Char.a[super.C][2][2] + var6.a[Char.a[super.C][2][0]].b, 2, 24);
                     }

                     if (TileMap.mapId != 51) {
                        byte var9 = 15;
                        if (this.all.a == 47) {
                           var9 = 47;
                        }

                        if (Char.myCharz().a != null && Char.myCharz().a.equals(this) && pasta.k.a == null) {
                           var1.a(pasta.i.a, 0, 0, 9, 6, 0, super.b, super.c - super.B - (var9 - 8), 33);
                        }
                     }

                     this.ap = 65;
                  }
               } else if (this.all != null) {
                  if (this.all.a == 50 && R) {
                     ++aq;
                     if (main.a.g % 3 == 0) {
                        dh.a(new cx(19, super.b + cq.b(-50, 50), super.c, 2, 1, -1));
                     }

                     if (main.a.g % 15 == 0) {
                        dh.a(new cx(18, super.b + cq.b(-5, 5), super.c + cq.b(-90, 0), 2, 1, -1));
                     }

                     if (aq == 100) {
                        GameSrc.a().teleTo(super.b, super.c);
                     }

                     if (aq == 110) {
                        R = false;
                        this.all.a = 4;
                     }
                  }

                  if (pasta.ao.a[this.all[this.ao]] != null && pasta.ao.a[this.all[this.ao]].a != null) {
                     var2 = dm.b(pasta.ao.a[this.all[this.ao]].a);
                  } else {
                     var2 = 0;
                  }

                  var4 = this.all[this.ao];
                  var3 = super.b;
                  pasta.ao.a(var1, var4, cq.b(-1, 1) + var3, super.c, 0, 33);
                  if (Char.myCharz().a != null && Char.myCharz().a.equals(this)) {
                     if (pasta.k.a == null) {
                        var1.a(pasta.i.a, 0, 0, 9, 6, 0, super.b, super.c - super.B - 9 + 16 - var2, 33);
                     }

                     cg.c.a(var1, pasta.o.b(this.ar), super.b, super.c - super.B - 16 - cg.k.a() - 20 - var2 + 16, 2, cg.f);
                  } else {
                     cg.c.a(var1, pasta.o.b(this.ar), super.b, super.c - super.B - 8 - cg.k.a() - 20 - var2 + 16, 2, cg.f);
                  }
               }
            }

            if (super.aa >= 0 && super.a != null && super.d == 0) {
               var3 = super.a.a[super.aa].c;
               var2 = super.b;
               pasta.ao.a(var1, var3, super.a.a[super.aa].a + var2, super.c + super.a.a[super.aa].b - this.ap, 0, 3);
               if (main.a.g % 2 == 0) {
                  ++super.aa;
                  if (super.aa >= super.a.a.length) {
                     super.aa = 0;
                  }
               }
            }
         }
      }

   }

   public final void e() {
      super.h = 15;
      Char.a = null;
   }

   public final void e(dm var1) {
      byte var2 = 15;
      if (!Char.w && !this.Q && this.e() && super.h != 15 && this.all != null) {
         if (this.all.a == 3) {
            if (Char.myCharz().a != null && Char.myCharz().a.equals(this)) {
               cg.n.a(var1, this.all.a, super.b, super.c - super.B - cg.k.a() - 5, 2, cg.o);
            } else {
               cg.n.a(var1, this.all.a, super.b, super.c - super.B - 3 - cg.k.a(), 2, cg.o);
            }

            this.ap = 60;
         } else if (this.all.a != 4) {
            if (this.all.a != 50 && this.all.a != 51) {
               if (this.all.a == 6) {
                  if (Char.myCharz().a != null && Char.myCharz().a.equals(this)) {
                     cg.n.a(var1, this.all.a, super.b, super.c - super.B - cg.k.a() - 16, 2, cg.o);
                  } else {
                     cg.n.a(var1, this.all.a, super.b, super.c - super.B - 8 - cg.k.a(), 2, cg.o);
                  }
               } else {
                  if (TileMap.mapId != 51) {
                     if (this.all.a == 47) {
                        var2 = 47;
                     }

                     if (Char.myCharz().a != null && Char.myCharz().a.equals(this)) {
                        if (TileMap.mapId != 113) {
                           cg.n.a(var1, this.all.a, super.b, super.c - super.B - cg.k.a() - var2, 2, cg.o);
                        }
                     } else {
                        var2 = 8;
                        if (this.all.a == 47) {
                           var2 = 40;
                        }

                        if (TileMap.mapId != 113) {
                           cg.n.a(var1, this.all.a, super.b, super.c - super.B - var2 - cg.k.a(), 2, cg.o);
                        }
                     }
                  }

                  this.ap = 65;
               }
            } else if (this.all != null) {
               int var3;
               if (pasta.ao.a[this.all[this.ao]] != null && pasta.ao.a[this.all[this.ao]].a != null) {
                  var3 = dm.b(pasta.ao.a[this.all[this.ao]].a);
               } else {
                  var3 = 0;
               }

               if (Char.myCharz().a != null && Char.myCharz().a.equals(this)) {
                  cg.n.a(var1, this.all.a, super.b, super.c - super.B - cg.k.a() - var3, 2, cg.o);
               } else {
                  cg.n.a(var1, this.all.a, super.b, super.c - super.B - 8 - cg.k.a() - var3 + 16, 2, cg.o);
               }
            }
         }
      }

   }

   public void onCancelChat() {
      if (this.all.a == 51) {
         this.g = System.currentTimeMillis();
         if (this.g - this.f >= 1000L) {
            --this.ar;
            this.f = this.g;
            if (this.ar < 0) {
               this.ar = 0;
            }
         }
      }

      if (super.m) {
         this.autoPickItem();
      }

      if (super.a == null) {
         label64: {
            label71: {
               int var1;
               if (Char.myCharz().l >= 9 && Char.myCharz().l <= 10 && Char.myCharz().a.a > 0) {
                  var1 = Char.myCharz().a.a;
                  if ((new byte[]{-1, 9, 9, 10, 10, 11, 11})[var1] == this.all.a) {
                     if (Char.myCharz().a == null) {
                        super.a = GameSrc.a[57];
                     } else {
                        if (Char.myCharz().a == null || Char.myCharz().a.a + 1 != Char.myCharz().a.c.length) {
                           break label64;
                        }

                        super.a = GameSrc.a[62];
                     }
                     break label71;
                  }
               }

               GameSrc.a();
               byte var3 = GameSrc.a();
               if (Char.myCharz().a != null || var3 != this.all.a) {
                  if (Char.myCharz().a == null || var3 != this.all.a) {
                     break label64;
                  }

                  var1 = Char.myCharz().a.a;
                  String[] var2 = Char.myCharz().a.c;
                  super.a = GameSrc.a[98];
               }
            }

            super.aa = 0;
         }
      }

      super.onCancelChat();
      if (TileMap.mapId == 51) {
         if (super.b > Char.myCharz().b) {
            super.i = -1;
         } else {
            super.i = 1;
         }

         if (this.all.a % 2 == 0) {
            if (super.C == 1) {
               super.C = 0;
            } else {
               super.C = 1;
            }
         }
      }

   }
}
