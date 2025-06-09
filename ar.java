package pasta;

import javax.microedition.lcdui.Image;

public final class ar {
   private static Image a;
   public static MyVector a = new MyVector("vPopups");
   private static Image b;
   private static Image c;
   private static Image d;
   public int a = 100;
   public cd a;
   public boolean a = false;
   public String[] a;
   public int b;
   public boolean b = true;
   public int c;
   public boolean c = false;
   public int d;
   public int e;
   private int f;
   private int g = 0;
   private int h;

   public ar(String var1, int var2, int var3) {
      if (var1.length() < 10) {
         this.a = 60;
      }

      if (main.a.i == 128) {
         this.a = 128;
      }

      this.a = cg.f.a(var1, this.a - 10);
      this.f = 7;
      this.b = var2 - this.a / 2 - 1;
      this.c = var3 - 15 + this.f - this.a.length * 12 - 10;
      this.d = this.a + 2;

      for(this.e = (this.a.length + 1) * 12 + 1; this.d % 10 != 0; ++this.d) {
      }

      while(this.e % 10 != 0) {
         ++this.e;
      }

      if (var2 >= 0 && var2 <= 24) {
         this.b += this.d / 2 + 30;
      }

      if (var2 <= TileMap.a * 24 && var2 >= TileMap.a * 24 - 24) {
         this.b -= this.d / 2 + 6;
      }

      while(this.b <= 30) {
         this.b += 2;
      }

      while(this.b + this.d >= TileMap.a * 24 - 30) {
         this.b -= 2;
      }

   }

   public static void a() {
      if (a == null) {
         a = dz.b("/mainImage/myTexture2dbd3.png");
      }

      if (c == null) {
         c = dz.b("/mainImage/myTexture2dimgPopup.png");
      }

      if (d == null) {
         d = dz.b("/mainImage/myTexture2dimgPopup2.png");
      }

      if (b == null && dz.a == 1) {
         b = dz.b("/mainImage/portal.png");
      }

   }

   public static void a(ar var0) {
      a.addElement(var0);
   }

   public static void a(dm var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         ar var8 = (ar)a.elementAt(var1);
         if (var8.b && var8.a != null && k.a == null && !var8.c) {
            int var2;
            int var3;
            if (dz.a == 1) {
               var2 = var8.b;
               var3 = var8.c - main.a.o;
               var0.f(var2, var3, var8.d, var8.e);
               var0.a(b, var2, var3, 0);
               if (var8.d > 70) {
                  var0.a(b, var2 + 70, var3, 0);
               }

               if (var8.e > 30) {
                  var0.a(b, var2, var3 + 30, 0);
                  if (var8.d > 70) {
                     var0.a(b, var2 + 70, var3 + 30, 0);
                  }
               }

               var0.f(GameSrc.k, GameSrc.l, main.a.i, main.a.j);
            } else {
               var3 = var8.b;
               int var5 = var8.c - main.a.o;
               int var4 = var8.d;
               int var6 = var8.e;
               boolean var10;
               if (var8.h == 0) {
                  var10 = false;
               } else {
                  var10 = true;
               }

               if (var10) {
                  var0.a(var3, var5, var4, var6, 16777215);
               } else {
                  var0.a(var3, var5, var4, var6, 0);
               }
            }

            for(var2 = 0; var2 < var8.a.length; ++var2) {
               cg var7;
               if (var8.h == 0) {
                  var7 = cg.c;
               } else {
                  var7 = cg.g;
               }

               String var9 = var8.a[var2];
               var3 = var8.b;
               var7.a(var0, var9, var8.d / 2 + var3, var8.c + (var8.e / 2 - var8.a.length * 12 / 2) + var2 * 12 - main.a.o, 2);
            }
         }
      }

   }

   public static void a(dm var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (!var6) {
         var0.a(0);
         var0.e(var1 + 6, var2, var3 - 14 + 1, var4);
         var0.e(var1, var2 + 6, var3, var4 - 12 + 1);
         var0.a(var5);
         var0.e(var1 + 6, var2 + 1, var3 - 12, var4 - 2);
         var0.e(var1 + 1, var2 + 6, var3 - 2, var4 - 12);
         var0.a(a, 0, 0, 7, 6, 0, var1, var2, 0);
         var0.a(a, 0, 0, 7, 6, 2, var1 + var3 - 7, var2, 0);
         var0.a(a, 0, 0, 7, 6, 6, var1, var2 + var4 - 7, 0);
         var0.a(a, 0, 0, 7, 6, 3, var1 + var3 - 7, var2 + var4 - 6, 0);
      } else {
         Image var10;
         if (var5 == 1) {
            var10 = d;
         } else {
            var10 = c;
         }

         var0.a(var10, 0, 0, 10, 10, 0, var1, var2, 0);
         var0.a(var10, 0, 20, 10, 10, 0, var1 + var3 - 10, var2, 0);
         var0.a(var10, 0, 50, 10, 10, 0, var1, var2 + var4 - 10, 0);
         var0.a(var10, 0, 70, 10, 10, 0, var1 + var3 - 10, var2 + var4 - 10, 0);
         int var8;
         if ((var3 - 20) % 10 == 0) {
            var8 = (var3 - 20) / 10;
         } else {
            var8 = (var3 - 20) / 10 + 1;
         }

         int var7;
         if ((var4 - 20) % 10 == 0) {
            var7 = (var4 - 20) / 10;
         } else {
            var7 = (var4 - 20) / 10 + 1;
         }

         int var9;
         for(var9 = 0; var9 < var8; ++var9) {
            var0.a(var10, 0, 10, 10, 10, 0, var1 + 10 + var9 * 10, var2, 0);
         }

         for(var9 = 0; var9 < var7; ++var9) {
            var0.a(var10, 0, 30, 10, 10, 0, var1, var2 + 10 + var9 * 10, 0);
         }

         for(var9 = 0; var9 < var8; ++var9) {
            var0.a(var10, 0, 60, 10, 10, 0, var1 + 10 + var9 * 10, var2 + var4 - 10, 0);
         }

         for(var8 = 0; var8 < var7; ++var8) {
            var0.a(var10, 0, 40, 10, 10, 0, var1 + var3 - 10, var2 + 10 + var8 * 10, 0);
         }

         if (var5 == 1) {
            var5 = 12052656;
         } else {
            var5 = 16770503;
         }

         var0.a(var5);
         var0.e(var1 + 10, var2 + 10, var3 - 20, var4 - 20);
      }

   }

   public static void c() {
      for(int var0 = 0; var0 < a.size(); ++var0) {
         ar var1 = (ar)a.elementAt(var0);
         if (Char.myCharz().a != null && Char.myCharz().a.a == 0) {
            if (var1.b + var1.d >= GameSrc.k && var1.b <= main.a.i + GameSrc.k && var1.c + var1.e >= GameSrc.l && var1.c <= main.a.j + GameSrc.l) {
               var1.c = false;
            } else {
               var1.c = true;
            }
         }

         if (Char.myCharz().a == null || Char.myCharz().a != null && Char.myCharz().a.a != 0) {
            if (var1.b + var1.d / 2 >= Char.myCharz().b - 100 && var1.b + var1.d / 2 <= Char.myCharz().b + 100 && var1.c + var1.e >= GameSrc.l && var1.c <= main.a.j + GameSrc.l) {
               var1.c = false;
            } else {
               var1.c = true;
            }
         }

         if (var1.h > 0) {
            --var1.h;
            if (var1.h == 0 && var1.a != null) {
               var1.a.a();
            }
         }

         if (var1.a) {
            if (Char.myCharz().a != null) {
               if (Char.myCharz().a.a == 0) {
                  if (Char.myCharz().a.a == 0) {
                     var1.b = false;
                  }

                  if (Char.myCharz().a.a == 1) {
                     var1.b = true;
                  }

                  if (Char.myCharz().a.a > 1 && Char.myCharz().a.a < 6) {
                     var1.b = false;
                  }
               } else if (!var1.b) {
                  ++var1.g;
                  if (var1.g == 50) {
                     var1.b = true;
                  }
               }
            } else if (!var1.b) {
               pasta.e.d = false;
               ++var1.g;
               if (var1.g == 50) {
                  var1.b = true;
                  pasta.e.d = true;
               }
            }
         }
      }

   }

   public final void a(String[] var1, int var2, int var3) {
      int var4 = 0;

      for(this.a = 0; var4 < var1.length; ++var4) {
         if (this.a < cg.f.a(var1[var4])) {
            this.a = cg.f.a(var1[var4]);
         }
      }

      this.a += 20;
      this.a = var1;
      this.f = 7;
      this.b = var2 - this.a / 2 - 1;
      this.c = var3 - 15 + this.f - this.a.length * 12 - 10;
      this.d = this.a + 2;

      for(this.e = (this.a.length + 1) * 12 + 1; this.d % 10 != 0; ++this.d) {
      }

      while(this.e % 10 != 0) {
         ++this.e;
      }

      if (var2 >= 0 && var2 <= 24) {
         this.b += this.d / 2 + 30;
      }

      if (var2 <= TileMap.a * 24 && var2 >= TileMap.a * 24 - 24) {
         this.b -= this.d / 2 + 6;
      }

      while(this.b <= 30) {
         this.b += 2;
      }

      while(this.b + this.d >= TileMap.a * 24 - 30) {
         this.b -= 2;
      }

   }

   public final void b() {
      this.h = 10;
   }
}
