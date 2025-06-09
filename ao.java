package pasta;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

public final class ao {
   private static int a;
   private static Image a = null;
   public static MyVector a = new MyVector("vKeys");
   public static short a;
   public static byte[] a;
   public static Image[] a;
   public static dd[] a;
   public static int[][] a;

   public ao() {
      e();
   }

   public static void a() {
      if (a == null) {
         a = new Image[]{dz.a("/img/Big0.png"), dz.a("/img/Big1.png"), dz.a("/img/Big2.png"), dz.a("/img/Big3.png")};
         System.gc();
      }

   }

   public static void a(int var0) {
      Image var3;
      if (dm.a == 1) {
         var3 = dz.b("/SmallImage/Small" + var0 + ".png");
         if (var3 != null) {
            a[var0] = new dd(var3, var0);
         } else {
            a[var0] = new dd(a, var0);
            av.a().m(var0);
         }
      } else {
         var3 = dz.b("/SmallImage/Small" + var0 + ".png");
         if (var3 != null) {
            a[var0] = new dd(var3, var0);
         } else {
            byte[] var4 = aa.a(dm.a + "Small" + var0);
            boolean var2;
            if (var4 == null) {
               var2 = true;
            } else {
               boolean var1;
               if (a != null && var4.length % 127 != a[var0]) {
                  var1 = true;
               } else {
                  var1 = false;
               }

               var2 = var1;
               if (!var1) {
                  var3 = Image.createImage(var4, 0, var4.length);
                  if (var3 != null) {
                     a[var0] = new dd(var3, var0);
                     var2 = var1;
                  } else {
                     var2 = true;
                  }
               }
            }

            if (var2) {
               a[var0] = new dd(a, var0);
               av.a().m(var0);
            }
         }
      }

   }

   public static void a(dm var0, int var1, int var2, int var3, int var4) {
      if (!gameFunc.removeSmall) {
         a(var0, var1, var2, var3, 0, var4);
      }

   }

   public static void a(dm var0, int var1, int var2, int var3, int var4, int var5) {
      if (!gameFunc.removeSmall) {
         dd var6;
         if (a == null) {
            var6 = a[var1];
            if (var6 == null) {
               a(var1);
            } else {
               var0.a(var6.a, 0, 0, dm.a(var6.a), dm.b(var6.a), var4, var2, var3, var5);
            }
         } else if (a != null) {
            if (var1 < a.length && a[var1] != null && a[var1][1] < 256 && a[var1][3] < 256 && a[var1][2] < 256 && a[var1][4] < 256) {
               if (a[var1][0] != 4 && a[a[var1][0]] != null) {
                  var0.a(a[a[var1][0]], a[var1][1], a[var1][2], a[var1][3], a[var1][4], var4, var2, var3, var5);
               } else {
                  var6 = a[var1];
                  if (var6 == null) {
                     a(var1);
                  } else {
                     var6.a(var0, var4, var2, var3, var5);
                  }
               }
            } else {
               var6 = a[var1];
               if (var6 == null) {
                  a(var1);
               } else {
                  var6.a(var0, var4, var2, var3, var5);
               }
            }
         } else if (main.a.a != GameSrc.a()) {
            var6 = a[var1];
            if (var6 == null) {
               a(var1);
            } else {
               var6.a(var0, var4, var2, var3, var5);
            }
         }
      }

   }

   public static void a(dm var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (!gameFunc.removeSmall) {
         dd var9;
         if (a == null) {
            var9 = a[var1];
            if (var9 == null) {
               a(var1);
            } else {
               var0.a(var9.a, 0, var2 * var5, var5, var6, var7, var3, var4, var8);
            }
         } else if (a != null) {
            if (var1 < a.length && a[var1] != null && a[var1][1] < 256 && a[var1][3] < 256 && a[var1][2] < 256 && a[var1][4] < 256) {
               if (a[var1][0] != 4 && a[a[var1][0]] != null) {
                  var0.a(a[a[var1][0]], 0, var2 * var5, var5, var6, var7, var3, var4, var8);
               } else {
                  var9 = a[var1];
                  if (var9 == null) {
                     a(var1);
                  } else {
                     var9.a(var0, var7, var2, var3, var4, var5, var6, var8);
                  }
               }
            } else {
               var9 = a[var1];
               if (var9 == null) {
                  a(var1);
               } else {
                  var9.a(var0, var7, var2, var3, var4, var5, var6, var8);
               }
            }
         } else if (main.a.a != GameSrc.a()) {
            var9 = a[var1];
            if (var9 == null) {
               a(var1);
            } else {
               var9.a(var0, var7, var2, var3, var4, var5, var6, var8);
            }
         }
      }

   }

   public static void b() {
      System.gc();
      a = Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
   }

   public static void c() {
      new ao();
   }

   public static void d() {
      if (main.a.g % 1000 == 0) {
         int var2 = 0;

         int var1;
         for(int var0 = 0; var0 < a.length; var2 = var1) {
            var1 = var2;
            if (a[var0] != null) {
               var1 = var2 + 1;
               dd var3 = a[var0];
               ++var3.c;
               if (var3.c - var3.b > 1 && !Char.myCharz().a(var3.a)) {
                  a[var3.a] = null;
               }

               ++a;
            }

            ++var0;
         }

         if (var2 > 200 && main.a.b) {
            a = new dd[a];
         }
      }

   }

   private static void e() {
      Exception var10000;
      label67: {
         short var1;
         boolean var10001;
         DataInputStream var3;
         try {
            ByteArrayInputStream var2 = new ByteArrayInputStream(aa.a("NR_image"));
            var3 = new DataInputStream(var2);
            var1 = var3.readShort();
            a = new int[var1][5];
         } catch (Exception var7) {
            var10000 = var7;
            var10001 = false;
            break label67;
         }

         int var0 = 0;

         while(true) {
            if (var0 >= var1) {
               return;
            }

            try {
               a[var0][0] = var3.readUnsignedByte();
               a[var0][1] = var3.readShort();
               a[var0][2] = var3.readShort();
               a[var0][3] = var3.readShort();
               a[var0][4] = var3.readShort();
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
               break;
            }

            if ((var0 < 84 || var0 > 90) && (var0 < 372 || var0 > 384) && (var0 < 371 || var0 > 377)) {
               label72: {
                  try {
                     if (a[var0][1] < 256 && a[var0][3] < 256 && a[var0][2] < 256 && a[var0][4] < 256) {
                        break label72;
                     }
                  } catch (Exception var6) {
                     var10000 = var6;
                     var10001 = false;
                     break;
                  }

                  try {
                     a[var0] = null;
                  } catch (Exception var4) {
                     var10000 = var4;
                     var10001 = false;
                     break;
                  }
               }
            }

            ++var0;
         }
      }

      Exception var8 = var10000;
      var8.printStackTrace();
   }
}
