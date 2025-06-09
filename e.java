package pasta;

import java.io.InputStream;
import java.util.Random;
import java.util.Vector;

public class e {
   public static int a;
   public static boolean a;
   public static int b;
   public static boolean b;
   public static int c;
   public static boolean c;
   public static int d;
   public static boolean d;
   public static int e;
   public static boolean e;
   public static boolean f;
   public static boolean g;
   private Random a;
   Vector a;
   private int[] a;

   public e() {
   }

   public e(int var1, int var2) {
      this.a = new Random();
      this.a = new Vector();
      this.a = new int[]{16711680, 16776960, 65280, 16777215, 255, 65535, 15790320, 12632256};

      for(int var3 = 0; var3 < 72; ++var3) {
         this.a.addElement(new p(var1, var2, Math.abs(this.a.nextInt() % 8) + 3, var3 * 5, this.a[Math.abs(this.a.nextInt() % this.a.length)]));
      }

   }

   public static InputStream a(String var0) {
      return "".getClass().getResourceAsStream(var0);
   }

   public static void a() {
      Object var1 = av.a();

      label162: {
         label161: {
            Message var0;
            label166: {
               label159: {
                  label158: {
                     try {
                        var0 = new Message((byte)-107);
                        break label158;
                     } catch (Exception var20) {
                        var1 = var20;
                     } finally {
                        ;
                     }

                     var0 = null;
                     break label159;
                  }

                  try {
                     ((av)var1).a.a(var0);
                     break label161;
                  } catch (Exception var18) {
                     var1 = var18;
                  } finally {
                     break label166;
                  }
               }

               try {
                  ((Throwable)var1).printStackTrace();
               } finally {
                  break label166;
               }

               break label162;
            }

            var0.a();
            throw var1;
         }

      }

   }

   public static void a(byte var0, byte var1) {
      av.a().b((byte)1, (byte)var1);
   }

   public static void a(byte var0, byte var1, short var2) {
      av.a().a((byte)var0, (byte)1, (short)var2);
   }

   public static void a(int var0) {
      if (!main.a.a.a && ar.a.size() - 1 >= var0) {
         ar var1 = (ar)ar.a.elementAt(var0);
         a = var1.b + var1.a / 2;
         b = var1.c + 30;
         if (!var1.c && var1.b) {
            d = true;
         } else {
            d = false;
         }

         c = 0;
         e = true;
         e = 0;
         if (!main.a.e) {
            d = false;
         }
      }

   }

   public static void a(MyVector var0, MyVector var1, int var2) {
      av.a().a(var0, var1, var2);
   }

   public static void a(short var0, byte var1) {
      av.a().a(var0, var1);
   }

   public static void b() {
      byte var0 = 0;
      if (main.a.a.a) {
         d = false;
      }

      if (GameSrc.a() != null) {
         a = GameSrc.a().b;
         b = GameSrc.a().c;
         e = 0;
         e = true;
         if (main.a.e) {
            var0 = 1;
         }

         c = var0;
      }

   }

   public static void c() {
      c = 1;
      if (main.a.a.a) {
         d = false;
      }

      int var0 = 0;

      boolean var3;
      while(true) {
         if (var0 >= GameSrc.f.size()) {
            var3 = false;
            break;
         }

         if (((i)GameSrc.f.elementAt(var0)).b) {
            var3 = true;
            break;
         }

         ++var0;
      }

      for(int var1 = 0; var1 < GameSrc.f.size(); ++var1) {
         i var2 = (i)GameSrc.f.elementAt(var1);
         if (var2.b) {
            a = var2.e;
            b = var2.f + 5;
            e = true;
            if (var2.h == 0) {
               var2.b = false;
            }
            break;
         }

         if (!var3) {
            if (var2.h != 0) {
               var2.b = true;
               break;
            }

            var2.b = false;
         }
      }

   }

   public static void useItens(short var0) {
      av.a().a((byte)0, (byte)1, (byte)-1, (short)var0);
   }
}
