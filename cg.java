package pasta;

import javax.microedition.lcdui.Image;

public final class cg {
   public static cg A;
   public static cg B;
   public static cg C;
   public static cg D;
   public static cg E;
   public static cg F;
   public static cg G;
   private static cg H;
   private static cg I;
   private static cg J;
   private static cg K;
   public static cg a;
   private static String b = " 0123456789+-*='_?.,<>/[]{}!@#$%^&*():aáàảãạâấầẩẫậăắằẳẵặbcdđeéèẻẽẹêếềểễệfghiíìỉĩịjklmnoóòỏõọôốồổỗộơớờởỡợpqrstuúùủũụưứừửữựvxyýỳỷỹỵzwAÁÀẢÃẠĂẰẮẲẴẶÂẤẦẨẪẬBCDĐEÉÈẺẼẸÊẾỀỂỄỆFGHIÍÌỈĨỊJKLMNOÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢPQRSTUÚÙỦŨỤƯỨỪỬỮỰVXYÝỲỶỸỴZW";
   public static cg b;
   public static cg c;
   public static cg d;
   public static cg e;
   public static cg f;
   public static cg g;
   public static cg h;
   public static cg i;
   public static cg j;
   public static cg k;
   public static cg l;
   public static cg m;
   public static cg n;
   public static cg o;
   public static cg p;
   public static cg q;
   public static cg r;
   public static cg s;
   public static cg t;
   public static cg u;
   public static cg v;
   public static cg w;
   public static cg x;
   public static cg y;
   public static cg z;
   private int a;
   private String a;
   private Image a;
   private int[][] a;
   private int b;
   private String c;

   static {
      a = new cg(b, "/myfont/tahoma_7b_red.png", "/myfont/tahoma_7b", 0);
      b = new cg(b, "/myfont/tahoma_7b_blue.png", "/myfont/tahoma_7b", 0);
      c = new cg(b, "/myfont/tahoma_7b_white.png", "/myfont/tahoma_7b", 0);
      d = new cg(b, "/myfont/tahoma_7b_yellow.png", "/myfont/tahoma_7b", 0);
      e = new cg(b, "/myfont/tahoma_7b_yellow.png", "/myfont/tahoma_7b", 0);
      f = new cg(b, "/myfont/tahoma_7b_brown.png", "/myfont/tahoma_7b", 0);
      g = new cg(b, "/myfont/tahoma_7b_green2.png", "/myfont/tahoma_7b", 0);
      h = new cg(b, "/myfont/tahoma_7b_green.png", "/myfont/tahoma_7b", 0);
      i = new cg(b, "/myfont/tahoma_7b_focus.png", "/myfont/tahoma_7b", 0);
      j = new cg(b, "/myfont/tahoma_7b_unfocus.png", "/myfont/tahoma_7b", 0);
      k = new cg(b, "/myfont/tahoma_7.png", "/myfont/tahoma_7", 0);
      l = new cg(b, "/myfont/tahoma_7_blue1.png", "/myfont/tahoma_7", 0);
      m = new cg(b, "/myfont/tahoma_7_green2.png", "/myfont/tahoma_7", 0);
      n = new cg(b, "/myfont/tahoma_7_yellow.png", "/myfont/tahoma_7", 0);
      o = new cg(b, "/myfont/tahoma_7_grey.png", "/myfont/tahoma_7", 0);
      p = new cg(b, "/myfont/tahoma_7_red.png", "/myfont/tahoma_7", 0);
      q = new cg(b, "/myfont/tahoma_7_blue.png", "/myfont/tahoma_7", 0);
      r = new cg(b, "/myfont/tahoma_7_green.png", "/myfont/tahoma_7", 0);
      s = new cg(b, "/myfont/tahoma_7_white.png", "/myfont/tahoma_7", 0);
      t = new cg(b, "/myfont/tahoma_8b.png", "/myfont/tahoma_8b", -1);
      H = new cg(" 0123456789+-", "/myfont/number_yellow.png", "/myfont/number", 0);
      I = new cg(" 0123456789+-", "/myfont/number_red.png", "/myfont/number", 0);
      J = new cg(" 0123456789+-", "/myfont/number_green.png", "/myfont/number", 0);
      new cg(" 0123456789+-", "/myfont/number_gray.png", "/myfont/number", 0);
      K = new cg(" 0123456789+-", "/myfont/number_orange.png", "/myfont/number", 0);
      u = I;
      v = H;
      w = J;
      x = K;
      y = p;
      z = n;
      A = r;
      B = o;
      C = n;
      D = g;
      E = s;
      F = h;
      G = l;
   }

   private cg(String param1, String param2, String param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public final int a() {
      return this.b;
   }

   public final int a(String var1) {
      int var3 = 0;

      for(int var2 = 0; var2 < var1.length(); ++var2) {
         int var5 = this.a.indexOf(var1.charAt(var2));
         int var4 = var5;
         if (var5 == -1) {
            var4 = 0;
         }

         var3 += this.a[var4][2] + this.a;
      }

      return var3;
   }

   public final void a(dm var1, String var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, 2);
   }

   public final void a(dm var1, String var2, int var3, int var4, int var5) {
      int var7 = var2.length();
      if (var5 != 0) {
         if (var5 == 1) {
            var3 -= this.a(var2);
         } else {
            var3 -= this.a(var2) >> 1;
         }
      }

      var5 = var3;

      for(var3 = 0; var3 < var7; ++var3) {
         int var6 = this.a.indexOf(var2.charAt(var3));
         if (var6 == -1) {
            var6 = 0;
         }

         if (var6 >= 0) {
            var1.a(this.a, this.a[var6][0], this.a[var6][1], this.a[var6][2], this.a[var6][3], 0, var5, var4, 20);
         }

         var5 += this.a[var6][2] + this.a;
      }

   }

   public final void a(dm var1, String var2, int var3, int var4, int var5, cg var6) {
      int var8 = var2.length();
      if (var5 != 0) {
         if (var5 == 1) {
            var3 -= this.a(var2);
         } else {
            var3 -= this.a(var2) >> 1;
         }
      }

      for(var5 = 0; var5 < var8; ++var5) {
         int var7 = this.a.indexOf(var2.charAt(var5));
         if (var7 == -1) {
            var7 = 0;
         }

         if (var7 >= 0) {
            if (!main.a.b) {
               var1.a(var6.a, this.a[var7][0], this.a[var7][1], this.a[var7][2], this.a[var7][3], 0, var3 + 1, var4, 20);
               var1.a(var6.a, this.a[var7][0], this.a[var7][1], this.a[var7][2], this.a[var7][3], 0, var3, var4 + 1, 20);
            }

            var1.a(this.a, this.a[var7][0], this.a[var7][1], this.a[var7][2], this.a[var7][3], 0, var3, var4, 20);
         }

         var3 += this.a[var7][2] + this.a;
      }

   }

   public final void a(dm var1, String var2, int var3, int var4, cg var5) {
      this.a(var1, var2, var3, var4, 2, var5);
   }

   public final String[] a(String var1, int var2) {
      byte var6 = 0;
      MyVector var9 = new MyVector("vLine");
      String var8 = "";

      int var4;
      for(int var3 = 0; var3 < var1.length(); var3 = var4 + 1) {
         if (var1.charAt(var3) != '\n' && var1.charAt(var3) != '\b') {
            String var7 = var8 + var1.charAt(var3);
            if (this.a(var7) > var2) {
               for(var4 = var7.length() - 1; var4 >= 0 && var7.charAt(var4) != ' '; --var4) {
               }

               int var5 = var4;
               if (var4 < 0) {
                  var5 = var7.length() - 1;
               }

               var9.addElement(var7.substring(0, var5));
               var3 = var3 - (var7.length() - var5) + 1;
               var7 = "";
            }

            var8 = var7;
            var4 = var3;
            if (var3 == var1.length() - 1) {
               var8 = var7;
               var4 = var3;
               if (!var7.trim().equals("")) {
                  var9.addElement(var7);
                  var8 = var7;
                  var4 = var3;
               }
            }
         } else {
            var9.addElement(var8);
            var8 = "";
            var4 = var3;
         }
      }

      String[] var10 = new String[var9.size()];

      for(var2 = var6; var2 < var9.size(); ++var2) {
         var10[var2] = var9.elementAt(var2).toString();
      }

      return var10;
   }
}
