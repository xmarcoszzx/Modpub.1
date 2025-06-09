package pasta;

import java.io.DataInputStream;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class TileMap {
   public static byte a = 24;
   public static int a;
   public static String a = "";
   public static Image a;
   public static MyVector a = new MyVector("vGO");
   public static boolean a = false;
   public static int[] a;
   public static String[] a;
   private static Image[] a;
   public static int[][] a;
   public static int[][][] a;
   public static byte b;
   public static int b;
   public static Image b = dz.b("/mainImage/myTexture2dbong.png");
   public static MyVector b = new MyVector("vItemBg");
   public static int[] b;
   public static byte c = -1;
   public static int c;
   public static Image c;
   public static MyVector c = new MyVector("vCurrItem");
   private static int[] c;
   public static int d;
   private static Image d;
   public static int e;
   private static Image e;
   private static Image f;
   public static int g = -1;
   private static Image g;
   public static int h;
   public static int i;
   public static int j;
   public static int k = -1;
   public static int l;
   public static int m;
   public static int mapId;
   public static int n;
   public static int o;
   public static int p;
   public static int q;
   public static int r;
   private static int s = -1;
   private static int t;
   private static int u;

   static {
      new MyVector("vObject");
      c = new int[]{21, 22, 23, 39, 40, 41};
      int[] var0 = new int[]{0, 7, 14};
      c = dz.b("/bg/light.png");
      r = 0;
   }

   public static final int a(int var0) {
      return var0 / a * a;
   }

   public static final int a(int var0, int var1) {
      try {
         var0 = b[a * var1 + var0];
      } catch (Exception var3) {
         var0 = 1000;
      }

      return var0;
   }

   public static by a(int var0) {
      int var1 = 0;

      by var2;
      while(true) {
         if (var1 >= b.size()) {
            var2 = null;
            break;
         }

         by var3 = (by)b.elementAt(var1);
         var2 = var3;
         if (var3.a == var0) {
            break;
         }

         ++var1;
      }

      return var2;
   }

   public static final void a() {
      if (d == null) {
         d = dz.a("/tWater/wtf.png");
      }

      if (e == null) {
         e = dz.a("/tWater/twtf.png");
      }

      if (a == null) {
         a = dz.a("/tWater/wts.png");
      }

      if (f == null) {
         f = dz.a("/tWater/wtsN.png");
      }

      if (g == null) {
         g = dz.a("/tWater/wtsN2.png");
      }

      System.gc();
   }

   public static void a(int var0) {
      d = b * a;
      c = a * a;
      int var3 = var0 - 1;
      var0 = 0;

      while(true) {
         label59: {
            Exception var10000;
            label65: {
               boolean var10001;
               try {
                  if (var0 >= a * b) {
                     break;
                  }
               } catch (Exception var10) {
                  var10000 = var10;
                  var10001 = false;
                  break label65;
               }

               int var1 = 0;

               label54:
               while(true) {
                  try {
                     if (var1 >= a[var3].length) {
                        break label59;
                     }
                  } catch (Exception var7) {
                     var10000 = var7;
                     var10001 = false;
                     break;
                  }

                  int var4;
                  int[] var5;
                  try {
                     var5 = a[var3][var1];
                     var4 = a[var3][var1];
                  } catch (Exception var6) {
                     var10000 = var6;
                     var10001 = false;
                     break;
                  }

                  int var2 = 0;

                  while(true) {
                     try {
                        if (var2 >= var5.length) {
                           break;
                        }
                     } catch (Exception var8) {
                        var10000 = var8;
                        var10001 = false;
                        break label54;
                     }

                     label48: {
                        try {
                           if (a[var0] == var5[var2]) {
                              var5 = b;
                              break label48;
                           }
                        } catch (Exception var9) {
                           var10000 = var9;
                           var10001 = false;
                           break label54;
                        }

                        ++var2;
                        continue;
                     }

                     var5[var0] |= var4;
                     break;
                  }

                  ++var1;
               }
            }

            Exception var11 = var10000;
            System.out.println("Error Load Map");
            var11.printStackTrace();
            GameMidlet.e.a();
            break;
         }

         ++var0;
      }

   }

   public static final void a(int var0, int var1) {
      int[] var2 = b;
      var0 = var1 / a * a + var0 / a;
      var2[var0] |= 512;
   }

   public static final void a(dm var0) {
      if (!Char.w && !gameFunc.j) {
         GameSrc.a();
         GameSrc.a(var0, 1);
         int var1 = GameSrc.p;

         while(true) {
            int var2;
            int var3;
            if (var1 >= GameSrc.r) {
               if (GameSrc.k < 24) {
                  for(var1 = GameSrc.q; var1 < GameSrc.s; ++var1) {
                     var2 = a[a * var1 + 1] - 1;
                     if (var2 != -1) {
                        a(var0, var2, 0, var1);
                     }
                  }
               }

               if (GameSrc.k > GameSrc.o) {
                  var2 = a - 2;

                  for(var1 = GameSrc.q; var1 < GameSrc.s; ++var1) {
                     var3 = a[a * var1 + var2] - 1;
                     if (var3 != -1) {
                        a(var0, var3, var2 + 1, var1);
                     }
                  }
               }
               break;
            }

            for(var2 = GameSrc.q; var2 < GameSrc.s; ++var2) {
               if (dz.a == 5 || dz.a == 3) {
                  cg.p.a(var0, "1", -5, -5, 0);
               }

               if (var1 != 0 && var1 != a - 1) {
                  var3 = a[a * var2 + var1] - 1;
                  if ((a(var1, var2) & 256) != 256) {
                     if ((a(var1, var2) & 32) == 32) {
                        var0.a(d, 0, (main.a.g % 8 >> 1) * 24, 24, 24, 0, var1 * a, var2 * a, 0);
                     } else if ((a(var1, var2) & 128) == 128) {
                        var0.a(e, 0, (main.a.g % 8 >> 1) * 24, 24, 24, 0, var1 * a, var2 * a, 0);
                     } else if (e == 13) {
                        if (!main.a.b) {
                           return;
                        }

                        if (var3 != -1) {
                           a(var0, 0, var1, var2);
                        }
                     } else {
                        if (e == 2 && (a(var1, var2) & 512) == 512 && var3 != -1) {
                           b(var0, var3, a * var1, a * var2);
                           b(var0, var3, a * var1, a * var2 + 1);
                        }

                        if ((a(var1, var2) & 16) == 16) {
                           t = a * var1 - GameSrc.k - GameSrc.c;
                           u = (a - 2) * t / a + GameSrc.c;
                           b(var0, var3, u + GameSrc.k, a * var2);
                        } else if ((a(var1, var2) & 512) == 512) {
                           if (var3 != -1) {
                              b(var0, var3, a * var1, a * var2);
                              b(var0, var3, a * var1, a * var2 + 1);
                           }
                        } else if (var3 != -1) {
                           a(var0, var3, var1, var2);
                        }
                     }
                  }
               }
            }

            ++var1;
         }
      }

   }

   private static void a(dm var0, int var1, int var2, int var3) {
      if (a != null && !gameFunc.j) {
         if (a.length == 1) {
            var0.a(a[0], 0, var1 * a, a, a, 0, var2 * a, var3 * a, 0);
         } else {
            var0.a(a[var1], a * var2, a * var3, 0);
         }
      }

   }

   public static boolean a() {
      boolean var0;
      if (mapId != 39 && mapId != 40 && mapId != 41) {
         var0 = false;
      } else {
         var0 = true;
      }

      return var0;
   }

   public static boolean a(int var0) {
      boolean var4;
      if (var0 != 156 && var0 != 330 && var0 != 345) {
         if (var0 == 334) {
            var4 = false;
            return var4;
         }

         if (mapId != 54 && mapId != 55 && mapId != 56 && mapId != 57 && mapId != 58 && mapId != 59 && mapId != 103) {
            int var1 = 0;

            int var2;
            int var3;
            for(var2 = 0; var1 < c.size(); var2 = var3) {
               var3 = var2;
               if (((by)c.elementAt(var1)).a == var0) {
                  var3 = var2 + 1;
               }

               ++var1;
            }

            if (var2 > 2) {
               var4 = true;
               return var4;
            }
         }
      }

      var4 = false;
      return var4;
   }

   public static final boolean a(int var0, int var1, int var2) {
      boolean var3 = false;

      try {
         var0 = b[var1 / a * a + var0 / a];
      } catch (Exception var5) {
         return var3;
      }

      if ((var0 & var2) == var2) {
         var3 = true;
      }

      return var3;
   }

   public static final int b(int var0) {
      return var0 / a * a;
   }

   public static final int b(int var0, int var1) {
      try {
         var0 = b[var1 / a * a + var0 / a];
      } catch (Exception var3) {
         var0 = 1000;
      }

      return var0;
   }

   public static void b() {
      int var0 = 0;
      byte var1 = 0;
      System.gc();
      if (s != e) {
         if (dz.a != 5 && dz.a != 3 && dz.a != 8) {
            if (dz.a("/t/" + e + "$1.png") != null) {
               aa.a("x" + dm.a + "t" + e);

               for(a = new Image[100]; var0 < a.length; ++var0) {
                  a[var0] = dz.a("/t/" + e + "$" + (var0 + 1) + ".png");
               }
            } else {
               Image var4 = dz.a("/t/" + e + ".png");
               if (var4 != null) {
                  aa.a("$");
                  Image[] var3 = new Image[1];
                  a = var3;
                  var3[0] = var4;
               }
            }
         } else if (dm.a == 1) {
            Image[] var2 = new Image[1];
            a = var2;
            var2[0] = dz.c("/t/" + e + ".png");
         } else {
            a = new Image[100];

            for(var0 = var1; var0 < a.length; ++var0) {
               a[var0] = dz.c("/t/" + e + "/" + (var0 + 1) + ".png");
            }
         }

         s = e;
      }

   }

   public static void b(int var0) {
      DataInputStream var1 = new DataInputStream(pasta.e.a("/mymap/" + var0));
      a = (char)var1.read();
      b = (char)var1.read();
      a = new int[var1.available()];

      for(var0 = 0; var0 < a * b; ++var0) {
         a[var0] = (char)var1.read();
      }

      b = new int[a.length];
   }

   public static final void b(int var0, int var1) {
      int[] var2 = b;
      var0 = var1 / a * a + var0 / a;
      var2[var0] &= -513;
   }

   public static final void b(dm var0) {
      if (!main.a.b && !gameFunc.j) {
         for(int var2 = GameSrc.p; var2 < GameSrc.r; ++var2) {
            for(int var3 = GameSrc.q; var3 < GameSrc.s; ++var3) {
               if ((a(var2, var3) & 64) == 64) {
                  Image var4;
                  if (e == 5) {
                     var4 = f;
                  } else if (e == 8) {
                     var4 = g;
                  } else {
                     var4 = a;
                  }

                  if (!e()) {
                     var0.a(var4, 0, 0, 24, 24, 0, var2 * a, a * var3 - 1, 0);
                     var0.a(var4, 0, 0, 24, 24, 0, var2 * a, a * var3 - 3, 0);
                  }

                  var0.a(var4, 0, (main.a.g % 8 >> 2) * 24, 24, 24, 0, var2 * a, a * var3 - 12, 0);
                  if (r == 0 && e()) {
                     r = a * var3 - 12;
                     int var1 = 16777215;
                     if (main.a.n == 2) {
                        var1 = 10871287;
                     } else if (main.a.n == 4) {
                        var1 = 8111470;
                     } else if (main.a.n == 7) {
                        var1 = 5693125;
                     }

                     da.a(var1, r + 15);
                  }
               }
            }
         }

         da.b(var0);
      }

   }

   private static void b(dm var0, int var1, int var2, int var3) {
      if (a != null && !gameFunc.j) {
         if (a.length == 1) {
            var0.a(a[0], 0, var1 * 24, 24, 24, 0, var2, var3, 0);
         } else {
            var0.a(a[var1], var2, var3, 0);
         }
      }

   }

   public static boolean b() {
      boolean var1 = false;

      for(int var0 = 0; var0 < c.length; ++var0) {
         if (mapId == c[var0]) {
            var1 = true;
            break;
         }
      }

      return var1;
   }

   public static boolean c() {
      boolean var0;
      if (mapId != 45 && mapId != 46 && mapId != 48) {
         var0 = false;
      } else {
         var0 = true;
      }

      return var0;
   }

   public static boolean d() {
      boolean var0;
      if (!a && mapId != 45 && mapId != 46 && mapId != 48 && mapId != 51 && mapId != 52 && mapId != 103 && mapId != 112 && mapId != 113 && mapId != 115 && mapId != 117 && mapId != 118 && mapId != 119 && mapId != 120 && mapId != 121 && mapId != 125 && mapId != 129 && mapId != 130) {
         var0 = false;
      } else {
         var0 = true;
      }

      return var0;
   }

   private static boolean e() {
      boolean var0;
      if (mapId != 54 && mapId != 55 && mapId != 56 && mapId != 57 && mapId != 138) {
         var0 = true;
      } else {
         var0 = false;
      }

      return var0;
   }
}
