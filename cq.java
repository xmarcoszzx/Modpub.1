package pasta;

import java.util.Random;

public final class cq {
   public static Random a;
   public static boolean a;
   private static int[] a;
   private static short[] a;
   public static boolean b;
   private static short[] b;

   static {
      short[] var0 = new short[]{0, 18, 36, 54, 71, 89, 107, 125, 143, 160, 178, 195, 213, 230, 248, 265, 282, 299, 316, 333, 350, 367, 384, 400, 416, 433, 449, 465, 481, 496, 512, 527, 543, 558, 573, 587, 602, 616, 630, 644, 658, 672, 685, 698, 711, 724, 737, 749, 761, 773, 784, 796, 807, 818, 828, 839, 849, 859, 868, 878, 887, 896, 904, 912, 920, 928, 935, 943, 949, 956, 962, 968, 974, 979, 984, 989, 994, 998, 1002, 1005, 1008, 1011, 1014, 1016, 1018, 1020, 1022, 1023, 1023, 1024, 1024};
      a = var0;
      a = new Random();
      new MyVector("");
   }

   public static final int a(int var0) {
      var0 = c(var0);
      if (var0 >= 0 && var0 < 90) {
         var0 = a[var0];
      } else if (var0 >= 90 && var0 < 180) {
         var0 = a[180 - var0];
      } else if (var0 >= 180 && var0 < 270) {
         var0 = -a[var0 - 180];
      } else {
         var0 = -a[360 - var0];
      }

      return var0;
   }

   public static final int a(int var0, int var1) {
      int var2 = 90;
      if (var0 != 0) {
         int var3 = Math.abs((var1 << 10) / var0);

         label39: {
            for(var2 = 0; var2 <= 90; ++var2) {
               if (a[var2] >= var3) {
                  var3 = var2;
                  break label39;
               }
            }

            var3 = 0;
         }

         var2 = var3;
         if (var1 >= 0) {
            var2 = var3;
            if (var0 < 0) {
               var2 = 180 - var3;
            }
         }

         var3 = var2;
         if (var1 < 0) {
            var3 = var2;
            if (var0 < 0) {
               var3 = var2 + 180;
            }
         }

         var2 = var3;
         if (var1 < 0) {
            var2 = var3;
            if (var0 >= 0) {
               var2 = 360 - var3;
            }
         }
      } else if (var1 <= 0) {
         var2 = 270;
      }

      return var2;
   }

   public static int a(int var0, int var1, int var2, int var3) {
      return d((var0 - var2) * (var0 - var2) + (var1 - var3) * (var1 - var3));
   }

   public static String a(long var0) {
      long var2;
      String var4;
      String var5;
      if (var0 >= 1000000000L) {
         var5 = ab.aL;
         var2 = var0 % 1000000000L / 100000000L;
         var4 = String.valueOf(var0 / 1000000000L);
         if (var2 > 0L) {
            var4 = var4 + "," + var2 + var5;
         } else {
            var4 = var4 + var5;
         }
      } else if (var0 >= 1000000L) {
         var5 = ab.aM;
         var2 = var0 % 1000000L / 100000L;
         var4 = String.valueOf(var0 / 1000000L);
         if (var2 > 0L) {
            var4 = var4 + "," + var2 + var5;
         } else {
            var4 = var4 + var5;
         }
      } else {
         var4 = String.valueOf(var0);
      }

      return var4;
   }

   public static String a(String var0) {
      String var1;
      if (dz.a != 7) {
         var1 = var0;
      } else {
         if (Char.myCharz() != null && Char.myCharz().a != null) {
            var1 = var0;
            if (Char.myCharz().a.a >= 10) {
               return var1;
            }
         }

         var1 = var0;
         if (var0.indexOf("Gohan") != -1) {
            var1 = a(var0, "Gohan", "Hango");
         }

         String var2 = var1;
         if (var1.indexOf("Gôhan") != -1) {
            var2 = a(var1, "Gôhan", "Hango");
         }

         var0 = var2;
         if (var2.indexOf("Bunma") != -1) {
            var0 = a(var2, "Bunma", "Mabun");
         }

         var1 = var0;
         if (var0.indexOf("Bunman") != -1) {
            var1 = a(var0, "Bunman", "Mabun");
         }

         var0 = var1;
         if (var1.indexOf("Bun ma") != -1) {
            var0 = a(var1, "Bun ma", "Mabun");
         }

         var1 = var0;
         if (var0.indexOf("Đậu thần") != -1) {
            var1 = a(var0, "Đậu thần", "Cây thần");
         }

         var0 = var1;
         if (var1.indexOf("Mabu") != -1) {
            var0 = a(var1, "Mabu", "Buma");
         }

         var1 = var0;
         if (var0.indexOf("Ma bư") != -1) {
            var1 = a(var0, "Ma bư", "Buma");
         }

         var0 = var1;
         if (var1.indexOf("Xayda") != -1) {
            var0 = a(var1, "Xayda", "Dasay");
         }

         var1 = var0;
         if (var0.indexOf("Xay da") != -1) {
            var1 = a(var0, "Xay da", "Dasay");
         }

         var0 = var1;
         if (var1.indexOf("Namếc") != -1) {
            var0 = a(var1, "Namếc", "Mecda");
         }

         var1 = var0;
         if (var0.indexOf("Na mếc") != -1) {
            var1 = a(var0, "Na mếc", "Mecda");
         }

         var0 = var1;
         if (var1.indexOf("Namek") != -1) {
            var0 = a(var1, "Namek", "Mecda");
         }

         var1 = var0;
         if (var0.indexOf("Rồng thần") != -1) {
            var1 = a(var0, "Rồng thần", "Rồng đất");
         }

         var0 = var1;
         if (var1.indexOf("Kame") != -1) {
            var0 = a(var1, "Kame", "Meka");
         }

         var1 = var0;
         if (var0.indexOf("Vegeta") != -1) {
            var1 = a(var0, "Vegeta", "Tageve");
         }

         var0 = var1;
         if (var1.indexOf("Kakalot") != -1) {
            var0 = a(var1, "Kakalot", "Lotkaka");
         }

         var1 = var0;
         if (var0.indexOf("Broly") != -1) {
            var1 = a(var0, "Broly", "Lybro");
         }

         var2 = var1;
         if (var1.indexOf("Ngọc rồng") != -1) {
            var2 = a(var1, "Ngọc rồng", "Ngọc thần");
         }

         var0 = var2;
         if (var2.indexOf("ngọc rồng") != -1) {
            var0 = a(var2, "ngọc rồng", "Ngọc thần");
         }

         var1 = var0;
         if (var0.indexOf("Radic") != -1) {
            var1 = a(var0, "Radic", "Dicra");
         }

         var0 = var1;
         if (var1.indexOf("Ra dic") != -1) {
            var0 = a(var1, "Ra dic", "Dicra");
         }

         var2 = var0;
         if (var0.indexOf("Ra đíc") != -1) {
            var2 = a(var0, "Ra đíc", "Dicra");
         }

         var1 = var2;
         if (var2.indexOf("Cadic") != -1) {
            var1 = a(var2, "Cadic", "Dicca");
         }

         var0 = var1;
         if (var1.indexOf("Ca dic") != -1) {
            var0 = a(var1, "Ca dic", "Dicca");
         }

         var1 = var0;
         if (var0.indexOf("Ca đíc") != -1) {
            var1 = a(var0, "Ca đíc", "Dicca");
         }

         var2 = var1;
         if (var1.indexOf("Quy lão") != -1) {
            var2 = a(var1, "Quy lão", "Lão");
         }

         var0 = var2;
         if (var2.indexOf("quy lão") != -1) {
            var0 = a(var2, "quy lão", "lão");
         }

         var1 = var0;
         if (var0.indexOf("QuyLão") != -1) {
            var1 = a(var0, "Quy Lão", "Lão");
         }

         var0 = var1;
         if (var1.indexOf("Santa") != -1) {
            var0 = a(var1, "Santa", "Tasan");
         }

         var1 = var0;
         if (var0.indexOf("Hạt Mít") != -1) {
            var1 = a(var0, "Hạt Mít", "Hạt Dẻ");
         }

         var0 = var1;
         if (var1.indexOf("Hạt mít") != -1) {
            var0 = a(var1, "Hạt mít", "Hạt dẻ");
         }

         var2 = var0;
         if (var0.indexOf("Tàu bảy bảy") != -1) {
            var2 = a(var0, "Tàu bảy bảy", "Tàu tàu");
         }

         var1 = var2;
         if (var2.indexOf("Uron") != -1) {
            var1 = a(var2, "Uron", "Onru");
         }

         var0 = var1;
         if (var1.indexOf("U ron") != -1) {
            var0 = a(var1, "U ron", "Onru");
         }

         var1 = var0;
         if (var0.indexOf("Urôn") != -1) {
            var1 = a(var0, "Urôn", "Onru");
         }

         var0 = var1;
         if (var1.indexOf("Ngọc Rồng") != -1) {
            var0 = a(var1, "Ngọc Rồng", "Ngọc thần");
         }

         var1 = var0;
         if (var0.indexOf("Ngọc rồng") != -1) {
            var1 = a(var0, "Ngọc rồng", "Ngọc thần");
         }

         var0 = var1;
         if (var1.indexOf("Fide") != -1) {
            var0 = a(var1, "Fide", "Defi");
         }

         var1 = var0;
         if (var0.indexOf("Vegeta") != -1) {
            var1 = a(var0, "Vegeta", "Tageve");
         }

         var0 = var1;
         if (var1.indexOf("Moori") != -1) {
            var0 = a(var1, "Moori", "Rimoo");
         }

         var1 = var0;
         if (var0.indexOf("Aru") != -1) {
            var1 = a(var0, "Aru", "Ura");
         }

         var0 = var1;
         if (var1.indexOf("Kamejoko") != -1) {
            var0 = a(var1, "Kamejoko", "Kojomeka");
         }

         var2 = var0;
         if (var0.indexOf("kamejoko") != -1) {
            var2 = a(var0, "kamejoko", "kojomeka");
         }

         var1 = var2;
         if (var2.indexOf("Kame") != -1) {
            var1 = a(var2, "Kame", "Meka");
         }

         var0 = var1;
         if (var1.indexOf("kame") != -1) {
            var0 = a(var1, "kame", "meka");
         }

         var1 = var0;
         if (var0.indexOf("Masenko") != -1) {
            var1 = a(var0, "Masenko", "Kosenma");
         }

         var0 = var1;
         if (var1.indexOf("Thái Dương Hạ San") != -1) {
            var0 = a(var1, "Thái Dương Hạ San", "Hạ Dương");
         }

         var1 = var0;
         if (var0.indexOf("Solar flare") != -1) {
            var1 = a(var0, "Solar flare", "Solar");
         }

         var0 = var1;
         if (var1.indexOf("Quả cầu kênh khi") != -1) {
            var0 = a(var1, "Quả cầu kênh khi", "Quả cầu");
         }

         var1 = var0;
         if (var0.indexOf("Genki-Dama") != -1) {
            var1 = a(var0, "Genki-Dama", "Dama");
         }

         var0 = var1;
         if (var1.indexOf("Genki-Dama") != -1) {
            var0 = a(var1, "Genki-Dama", "Dama");
         }

         var1 = var0;
         if (var0.indexOf("Makankosappo") != -1) {
            var1 = a(var0, "Makankosappo", "Oppasoknakam");
         }
      }

      return var1;
   }

   private static String a(String var0, String var1, String var2) {
      StringBuffer var6 = new StringBuffer();
      int var3 = var0.indexOf(var1);
      int var4 = 0;

      for(int var5 = var1.length(); var3 != -1; var3 = var0.indexOf(var1, var4)) {
         var6.append(var0.substring(var4, var3)).append(var2);
         var4 = var3 + var5;
      }

      var6.append(var0.substring(var4, var0.length()));
      return var6.toString();
   }

   public static void a() {
      b = new short[91];
      a = new int[91];

      for(int var0 = 0; var0 <= 90; ++var0) {
         b[var0] = a[90 - var0];
         if (b[var0] == 0) {
            a[var0] = Integer.MAX_VALUE;
         } else {
            a[var0] = (a[var0] << 10) / b[var0];
         }
      }

   }

   public static void a(dm var0) {
      cg.f.a(var0, "check Controller= " + av.c, 3, 55, 0);
      cg.f.a(var0, "check Map= " + av.d, 3, 75, 0);
   }

   public static boolean a(int var0, int var1, int var2, int var3, int var4, int var5) {
      boolean var6;
      if (var4 >= var0 && var4 <= var0 + var2 && var5 >= var1 && var5 <= var1 + var3) {
         var6 = true;
      } else {
         var6 = false;
      }

      return var6;
   }

   public static String[] a(String var0, String var1, int var2) {
      int var3 = var0.indexOf(var1);
      String[] var4;
      if (var3 >= 0) {
         var4 = a(var0.substring(var1.length() + var3), var1, var2 + 1);
      } else {
         var4 = new String[var2 + 1];
         var3 = var0.length();
      }

      var4[var2] = var0.substring(0, var3);
      return var4;
   }

   public static final int b(int var0) {
      var0 = c(var0);
      if (var0 >= 0 && var0 < 90) {
         var0 = b[var0];
      } else if (var0 >= 90 && var0 < 180) {
         var0 = -b[180 - var0];
      } else if (var0 >= 180 && var0 < 270) {
         var0 = -b[var0 - 180];
      } else {
         var0 = b[360 - var0];
      }

      return var0;
   }

   public static int b(int var0, int var1) {
      if (var0 != var1) {
         var0 += a.nextInt(var1 - var0);
      }

      return var0;
   }

   public static String b(long var0) {
      long var2;
      String var4;
      String var5;
      if (var0 >= 1000000000L) {
         var5 = ab.aL;
         var2 = var0 % 1000000000L / 10000000L;
         var4 = String.valueOf(var0 / 1000000000L);
         if (var2 >= 10L) {
            var0 = var2;
            if (var2 % 10L == 0L) {
               var0 = var2 / 10L;
            }

            var4 = var4 + "," + var0 + var5;
         } else if (var2 > 0L) {
            var4 = var4 + ",0" + var2 + var5;
         } else {
            var4 = var4 + var5;
         }
      } else if (var0 >= 1000000L) {
         var5 = ab.aM;
         var2 = var0 % 1000000L / 10000L;
         var4 = String.valueOf(var0 / 1000000L);
         if (var2 >= 10L) {
            var0 = var2;
            if (var2 % 10L == 0L) {
               var0 = var2 / 10L;
            }

            var4 = var4 + "," + var0 + var5;
         } else if (var2 > 0L) {
            var4 = var4 + ",0" + var2 + var5;
         } else {
            var4 = var4 + var5;
         }
      } else if (var0 >= 10000L) {
         var2 = var0 % 1000L / 10L;
         var4 = String.valueOf(var0 / 1000L);
         if (var2 >= 10L) {
            var0 = var2;
            if (var2 % 10L == 0L) {
               var0 = var2 / 10L;
            }

            var4 = var4 + "," + var0 + "k";
         } else if (var2 > 0L) {
            var4 = var4 + ",0" + var2 + "k";
         } else {
            var4 = var4 + "k";
         }
      } else {
         var4 = String.valueOf(var0);
      }

      return var4;
   }

   public static void b() {
      long var0 = dz.a();
      if (av.a - var0 > 5000L) {
         av.a().d();
      }

      if (av.b - var0 > 5000L) {
         av.a().e();
      }

   }

   public static final int c(int var0) {
      if (var0 >= 360) {
         var0 -= 360;
      }

      int var1 = var0;
      if (var0 < 0) {
         var1 = var0 + 360;
      }

      return var1;
   }

   public static int d(int var0) {
      int var2;
      if (var0 <= 0) {
         var2 = 0;
      } else {
         int var3 = (var0 + 1) / 2;

         while(true) {
            int var1 = var3 / 2 + var0 / (var3 << 1);
            var2 = var1;
            if (Math.abs(var3 - var1) <= 1) {
               break;
            }

            var3 = var1;
         }
      }

      return var2;
   }

   public static int e(int var0) {
      int var2 = 1;

      for(int var1 = 0; var1 < 2; ++var1) {
         var2 *= var0;
      }

      return var2;
   }

   public static int f(int var0) {
      if (var0 <= 0) {
         var0 = -var0;
      }

      return var0;
   }
}
