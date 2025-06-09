package pasta;

import javax.microedition.lcdui.Image;

public final class by {
   public static MyVector a = new MyVector("vKeyNews");
   public static eh a = new eh("imgNew BgItem");
   public static byte[] a;
   public static MyVector b = new MyVector("vKeyLast");
   private static int[] c = new int[]{79, 80, 81, 85, 86, 90, 91, 92, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108};
   public byte a;
   public int a;
   public short a;
   public int[] a;
   public int b;
   public int[] b;
   public int c;
   public int d;
   public int e;
   public int f;
   private int g = 0;
   private int h = 0;

   public static void a() {
      a.clear();
      a.removeAllElements();
      b.removeAllElements();
   }

   private boolean a() {
      boolean var2 = false;

      for(int var1 = 0; var1 < c.length; ++var1) {
         if (this.a == c[var1]) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public static boolean a(String var0) {
      boolean var2 = false;

      for(int var1 = 0; var1 < a.size(); ++var1) {
         if (((String)a.elementAt(var1)).equals(var0)) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public final void a(dm var1) {
      if (!Char.w && (this.a != 279 || GameSrc.a().U < 110)) {
         int var3 = GameSrc.k;
         int var4 = GameSrc.l;
         Image var11 = (Image)a.get(String.valueOf(this.a));
         if (var11 != null && this.a != 96) {
            if (this.a == 4) {
               this.g = -var3 / 2 + 100;
            }

            if (this.a == 28 && this.a == 3) {
               this.g = -var3 / 3 + 200;
            }

            if ((this.a == 67 || this.a == 68 || this.a == 69 || this.a == 70) && this.a == 3) {
               this.g = -var3 / 3 + 200;
            }

            if (this.a() && this.a < 4) {
               this.g = -(var3 >> 4) + 50;
               this.h = (var4 >> 5) - 15;
            }

            int var6 = this.c + this.e + this.g;
            int var5 = this.d + this.f + this.h;
            if (this.c + this.e + var11.getWidth() + this.g >= var3 && this.c + this.e + this.g <= main.a.i + var3 && this.d + this.f + this.h + var11.getHeight() >= var4 && this.d + this.f + this.h <= main.a.j + var4) {
               int var9 = dm.a(var11);
               int var10 = dm.b(var11);
               int var2 = this.b;
               int var8 = this.c;
               int var7 = this.e;
               var1.a(var11, 0, 0, var9, var10, var2, this.g + var8 + var7, this.d + this.f + this.h, 0);
               if (this.a == 11 && TileMap.mapId != 122) {
                  var1.f(var6, var5 + 24, 48, 14);

                  for(var2 = 0; var2 < 2; ++var2) {
                     var1.a(TileMap.a, 0, (main.a.g % 8 >> 2) * 24, 24, 24, 0, var6 + var2 * 24, var5 + 24, 0);
                  }

                  var1.f(GameSrc.k, GameSrc.l, GameSrc.a, GameSrc.b);
               }
            }

            if (TileMap.d() && this.a > 137 && this.a != 156 && this.a != 159 && this.a != 157 && this.a != 165 && this.a != 167 && this.a != 168 && this.a != 169 && this.a != 170 && this.a != 238 && TileMap.c - (this.c + this.e + this.g) >= var3 && TileMap.c - (this.c + this.e + this.g + var11.getWidth()) <= main.a.i + var3 && this.d + this.f + this.h + var11.getHeight() >= var4 && this.d + this.f + this.h <= main.a.j + var4 && (this.a < 241 || this.a >= 266)) {
               var1.a(var11, 0, 0, dm.a(var11), dm.b(var11), 2, TileMap.c - (this.c + this.e + this.g) - dm.a(var11), this.d + this.f + this.h, 0);
            }
         }
      }

   }
}
