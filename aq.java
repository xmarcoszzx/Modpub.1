package pasta;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class aq {
   private static byte[] a = new byte[]{-22, 2, 12, 4, 5, 2, -10};
   private int a = 0;

   public static Image a(String var0) {
      Object var6 = null;
      int var2 = 0;
      String var7 = "/x" + dm.a + var0;

      Image var24;
      label75: {
         label74: {
            label73: {
               label72: {
                  int var3;
                  aq var9;
                  boolean var10001;
                  byte[] var23;
                  try {
                     DataInputStream var8 = new DataInputStream("".getClass().getResourceAsStream(var7));
                     var3 = var8.available();
                     var23 = new byte[var3];
                     var8.read(var23, 0, var3);
                     var9 = new aq();
                     var9.a = 0;
                  } catch (IOException var20) {
                     var10001 = false;
                     break label73;
                  } catch (IllegalArgumentException var21) {
                     var10001 = false;
                     break label72;
                  } catch (NullPointerException var22) {
                     var10001 = false;
                     break label74;
                  }

                  while(true) {
                     try {
                        if (var2 >= var23.length) {
                           var24 = Image.createImage(var23, 0, var3);
                           break label75;
                        }
                     } catch (IOException var14) {
                        var10001 = false;
                        break label73;
                     } catch (IllegalArgumentException var15) {
                        var10001 = false;
                        break;
                     } catch (NullPointerException var16) {
                        var10001 = false;
                        break label74;
                     }

                     byte var5 = var23[var2];

                     int var4;
                     byte[] var25;
                     try {
                        var25 = a;
                        var4 = var9.a++;
                     } catch (IOException var11) {
                        var10001 = false;
                        break label73;
                     } catch (IllegalArgumentException var12) {
                        var10001 = false;
                        break;
                     } catch (NullPointerException var13) {
                        var10001 = false;
                        break label74;
                     }

                     byte var1 = (byte)(var5 & 255 ^ var25[var4] & 255);

                     try {
                        if (var9.a >= a.length) {
                           var9.a %= a.length;
                        }
                     } catch (IOException var17) {
                        var10001 = false;
                        break label73;
                     } catch (IllegalArgumentException var18) {
                        var10001 = false;
                        break;
                     } catch (NullPointerException var19) {
                        var10001 = false;
                        break label74;
                     }

                     var23[var2] = var1;
                     ++var2;
                  }
               }

               var24 = null;
               break label75;
            }

            var24 = null;
            break label75;
         }

         var24 = null;
      }

      if (var24 == null) {
         try {
            var24 = Image.createImage(var7);
         } catch (IOException var10) {
            var24 = (Image)var6;
         }
      }

      return var24;
   }
}
