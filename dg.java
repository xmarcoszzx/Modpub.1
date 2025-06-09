package pasta;

import javax.microedition.lcdui.Image;

public final class dg implements ah {
   private static Image a = dz.b("/mainImage/myTexture2dgocnhon.png");
   public int a = 100;
   public MyVector a = new MyVector("infoWaitToShow");
   public ef a;
   public String[] a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   private int g;
   private int h;

   public final void a() {
      this.a = null;
      this.a.removeAllElements();
   }

   public final void a(int var1, Object var2) {
      if (var1 == 1000) {
         bq var3 = bq.a();
         GameSrc.a();
         var3.checkInfo(ab.ch);
      }

   }

   public final void a(String var1, int var2, Char var3, boolean var4) {
      this.h = var2;
      if (this.a.size() > 10) {
         this.a.removeElementAt(0);
      }

      if (this.a.size() <= 0 || !var1.equals(((ef)this.a.lastElement()).a)) {
         ef var5 = new ef(var1);
         if (this.h == 0) {
            var5.a = var1.length();
         }

         if (var5.a < 70) {
            var5.a = 70;
         }

         if (this.h == 1) {
            var5.a = 10000000;
         }

         if (this.h == 3) {
            var5.a = 300;
            var5.a = System.currentTimeMillis();
            var5.b = var1.length() / 4;
            if (var5.b < 15) {
               var5.b = 15;
            }
         }

         if (var3 != null) {
            var5.a = var3;
            var5.a = var4;
            main.a.a.a(var5);
            if (main.a.e && main.a.a.i) {
               GameSrc.b.a = new cd(ab.aV, this, 1000, var5);
            }
         }

         if (var3 != null && main.a.a.i || var3 == null) {
            this.a.addElement(var5);
         }

         if (this.a.size() == 1) {
            this.a = (ef)this.a.firstElement();
            this.c();
         }

         if (main.a.e && var3 != null && main.a.a.i && main.a.i - 50 > this.e + 155) {
            GameSrc.b.a.b = main.a.i - this.e - 50;
            GameSrc.b.a.c = 35;
         }
      }

   }

   public final void a(dm var1, int var2, int var3, int var4) {
      if (this.a.size() != 0) {
         var1.a(var2, var3);
         if (this.a != null && this.a.length != 0 && this.h != 1) {
            byte var5;
            if (dm.a == 1) {
               var5 = 0;
            } else {
               var5 = 10;
            }

            if (this.a.a == null) {
               ar.a(var1, this.c, this.d, this.e, this.f, 16777215, false);
            } else {
               dz.a(var1, this.c - 23, this.d - var5 / 2, this.e + 15);
            }

            if (this.a.a == null) {
               Image var7 = a;
               if (var4 == 1) {
                  var5 = 0;
               } else {
                  var5 = 2;
               }

               byte var10;
               if (var4 == 1) {
                  var10 = -15;
               } else {
                  var10 = 20;
               }

               var1.a(var7, 0, 0, 9, 8, var5, var10 - 3, this.g - 20 + 2, 17);
            }

            var4 = -1;

            for(int var11 = 0; var11 < this.a.length; ++var11) {
               cg var9 = cg.k;
               String var12 = this.a[var11];
               int var6;
               String var13;
               if (this.a[var11].startsWith("|")) {
                  String[] var8 = cq.a(this.a[var11], "|", 0);
                  if (var8.length == 3) {
                     var12 = var8[2];
                  }

                  if (var8.length == 4) {
                     var12 = var8[3];
                     Integer.parseInt(var8[2]);
                  }

                  var4 = Integer.parseInt(var8[1]);
                  var6 = var4;
                  var13 = var12;
               } else {
                  var6 = var4;
                  var13 = var12;
               }

               cg var14;
               switch(var6) {
               case -1:
                  var14 = cg.k;
                  break;
               case 0:
                  var14 = cg.f;
                  break;
               case 1:
                  var14 = cg.h;
                  break;
               case 2:
                  var14 = cg.b;
                  break;
               case 3:
                  var14 = cg.p;
                  break;
               case 4:
                  var14 = cg.r;
                  break;
               case 5:
                  var14 = cg.q;
                  break;
               case 6:
               default:
                  var14 = var9;
                  break;
               case 7:
                  var14 = cg.a;
               }

               if (this.a.a == null) {
                  var14.a(var1, var13, 0, this.g - 15 + var11 * 12 - this.a.length * 12 - 9, 2);
               } else {
                  if (dm.a == 1) {
                     cg.B.a(var1, String.valueOf(this.a.b), this.c + this.e - 5, this.d + 5, 1);
                  } else {
                     cg.C.a(var1, String.valueOf(this.a.b), this.c + this.e - 5, this.d - 3, 1);
                  }

                  if (this.a.b == 0) {
                     return;
                  }

                  this.a.a.b(var1, this.c + 10, this.d + this.f / 2);
                  if (dm.a == 1) {
                     if (this.a.a) {
                        var14 = cg.C;
                     } else {
                        var14 = cg.F;
                     }

                     var14.a(var1, this.a.a.a, this.c + 12, this.d + 3, 0);
                  } else {
                     if (this.a.a) {
                        var14 = cg.C;
                     } else {
                        var14 = cg.F;
                     }

                     var14.a(var1, this.a.a.a, this.c + 12, this.d - 3, 0);
                  }

                  if (!main.a.e) {
                     if (!bf.b) {
                        cg.D.a(var1, "Nhấn # để chat", this.c + this.e / 2 + 10, this.d + this.f, 2);
                     } else {
                        cg.D.a(var1, "Nhấn Y để chat", this.c + this.e / 2 + 10, this.d + this.f, 2);
                     }
                  }

                  if (dm.a == 1) {
                     m.a(var1, var13, this.c + 14, this.d + this.f / 2 + 2, this.e - 16, this.f, cg.E);
                  } else {
                     String[] var15 = cg.E.a(var13, 120);

                     for(var6 = 0; var6 < var15.length; ++var6) {
                        cg.E.a(var1, var15[var6], this.c + 12, this.d + 8 + (var6 << 3) - 3, 0);
                     }

                     main.a.a(var1);
                  }
               }
            }

            this.a.getClass();
         }

         var1.a(-var2, -var3);
      }

   }

   public final void b() {
      if (this.a.size() != 0 && this.a.b == 0) {
         ++this.b;
         if (this.b >= this.a.a) {
            this.b = 0;
            this.a.removeElementAt(0);
            if (this.a.size() != 0) {
               this.a = (ef)this.a.firstElement();
               this.c();
            }
         }
      }

   }

   public final void c() {
      byte var2 = 0;
      this.a = 100;
      if (main.a.i == 128) {
         this.a = 128;
      }

      if (this.a.a != null) {
         this.a = new String[]{this.a.a};
      } else {
         this.a = cg.p.a(this.a.a, this.a - 10);
      }

      this.g = 7;
      this.c = 0 - this.a / 2 - 1;
      this.d = this.g - 15 - this.a.length * 12 - 15;
      int var3 = this.a;
      byte var1;
      if (this.a.a != null) {
         var1 = 30;
      } else {
         var1 = 0;
      }

      this.e = var1 + var3 + 2;
      var3 = this.a.length;
      var1 = var2;
      if (this.a.a != null) {
         var1 = 5;
      }

      this.f = (var3 + 1) * 12 + 1 + var1;
   }
}
