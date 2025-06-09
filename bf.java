package pasta;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextBox;
import main.GameMidlet;

public final class bf implements ah {
   private static Image a = dz.b("/mainImage/myTexture2der.png");
   private static final int[] a = new int[]{18, 14, 11, 9, 6, 4, 2};
   private static String[] a = new String[]{" 0", ".,@?!_1\"/$-():*+<=>;%&~#%^&*{}[];'/1", "abc2áàảãạâấầẩẫậăắằẳẵặ2", "def3đéèẻẽẹêếềểễệ3", "ghi4íìỉĩị4", "jkl5", "mno6óòỏõọôốồổỗộơớờởỡợ6", "pqrs7", "tuv8úùủũụưứừửữự8", "wxyz9ýỳỷỹỵ9", "*", "#"};
   private static Image b = dz.b("/mainImage/myTexture2dtf.png");
   public static boolean b;
   private static String[] b = new String[]{"0", "1", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9", "0", "0"};
   private static int e = 2;
   private static int f = 0;
   private static int q = 11;
   public int a;
   public String a = "";
   public cd a;
   public boolean a;
   public int b;
   public String b = "";
   public int c;
   private String c = "";
   public boolean c;
   public int d;
   private String d = "";
   public boolean d = true;
   private String e = "";
   private boolean e = true;
   private int g = 0;
   private int h = 0;
   private int i = 500;
   private int j = 0;
   private int k = -1984;
   private int l = 0;
   private int m = 0;
   private int n = 10;
   private int o = 0;
   private int p = 0;

   public bf() {
      this.c = "";
      f = cg.t.a() + 1;
      this.a = new cd(ab.aP, this, 1000, (Object)null);
      if (aa.a("qwerty") == 1) {
         b = true;
      }

   }

   private void c(int var1) {
      int var2 = var1;
      if (var1 == 432) {
         var2 = 119;
      }

      if ((this.o != 2 && this.o != 3 || var2 >= 48 && var2 <= 57 || var2 >= 65 && var2 <= 90 || var2 >= 97 && var2 <= 122) && this.c.length() < this.i) {
         String var4 = this.c.substring(0, this.g) + (char)var2;
         String var3 = var4;
         if (this.g < this.c.length()) {
            var3 = var4 + this.c.substring(this.g, this.c.length());
         }

         this.c = var3;
         ++this.g;
         this.e();
         this.onCancelChat();
      }

   }

   private void e() {
      if (this.o == 2) {
         this.d = "";

         for(int var1 = 0; var1 < this.c.length(); ++var1) {
            this.d = this.d + "*";
         }

         if (this.l > 0 && this.g > 0) {
            this.d = this.d.substring(0, this.g - 1) + this.c.charAt(this.g - 1) + this.d.substring(this.g, this.d.length());
         }
      }

   }

   private void onCancelChat() {
      if (this.o == 2) {
         this.e = this.d;
      } else {
         this.e = this.c;
      }

      if (this.j < 0 && cg.t.a(this.e) + this.j < this.c - 6 - 13) {
         this.j = this.c - 10 - cg.t.a(this.e);
      }

      if (this.j + cg.t.a(this.e.substring(0, this.g)) <= 0) {
         this.j = -cg.t.a(this.e.substring(0, this.g));
         this.j += 40;
      } else if (this.j + cg.t.a(this.e.substring(0, this.g)) >= this.c - 22) {
         this.j = this.c - 10 - cg.t.a(this.e.substring(0, this.g)) - 12;
      }

      if (this.j > 0) {
         this.j = 0;
      }

   }

   public final String a() {
      return this.c;
   }

   public final void a() {
      TextBox var2 = new TextBox(this.b, "", this.i, 0);
      var2.addCommand(new Command(ab.aX, 4, 0));
      var2.addCommand(new Command(ab.ba, 3, 0));
      var2.setCommandListener(new ea(this, var2));

      try {
         if (this.o == 2) {
            var2.setConstraints(65536);
         } else if (this.o == 1) {
            var2.setConstraints(2);
         } else {
            var2.setConstraints(0);
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      var2.setString(this.c);
      var2.setMaxSize(this.i);
      Display.getDisplay(GameMidlet.e).setCurrent(var2);
   }

   public final void a(int var1) {
      this.i = var1;
   }

   public final void a(int var1, Object var2) {
      switch(var1) {
      case 1000:
         this.b();
      default:
      }
   }

   public final void a(dm var1) {
      if (this.e) {
         var1.f(0, 0, main.a.i, main.a.j);
      }

      boolean var9 = this.a;
      if (this.o == 2) {
         this.e = this.d;
      } else {
         this.e = this.c;
      }

      int var5 = this.a;
      int var8 = this.b - 1;
      int var7 = this.c;
      int var4 = this.d;
      int var6 = this.j + 6 + this.a;
      int var3 = this.b + (this.d - cg.t.a()) / 2;
      String var10 = this.e;
      String var11 = this.b;
      var1.a(0);
      int var2;
      if (var9) {
         var1.a(b, 0, 81, 29, 27, 0, var5, var8, 0);
         var1.a(b, 0, 135, 29, 27, 0, var5 + var7 - 29, var8, 0);
         var1.a(b, 0, 108, 29, 27, 0, var5 + var7 - 58, var8, 0);

         for(var2 = 0; var2 < (var7 - 58) / 29; ++var2) {
            var1.a(b, 0, 108, 29, 27, 0, var5 + 29 + var2 * 29, var8, 0);
         }
      } else {
         var1.a(b, 0, 0, 29, 27, 0, var5, var8, 0);
         var1.a(b, 0, 54, 29, 27, 0, var5 + var7 - 29, var8, 0);
         var1.a(b, 0, 27, 29, 27, 0, var5 + var7 - 58, var8, 0);

         for(var2 = 0; var2 < (var7 - 58) / 29; ++var2) {
            var1.a(b, 0, 27, 29, 27, 0, var5 + 29 + var2 * 29, var8, 0);
         }
      }

      var1.f(var5 + 3, var8 + 1, var7 - 4, var4);
      if (var10 != null && !var10.equals("")) {
         cg.t.a(var1, var10, var6, var3, 0);
      } else if (var11 != null) {
         if (var9) {
            cg.i.a(var1, var11, var6, var3 + 2, 0);
         } else {
            cg.j.a(var1, var11, var6, var3 + 2, 0);
         }
      }

      var1.a(0);
      if (this.a && this.d) {
         if (this.l == 0 && (this.n > 0 || this.h / 5 % 2 == 0)) {
            var1.a(7999781);
            var1.e(this.j + 7 + this.a + cg.t.a(this.e.substring(0, this.g)) - 1, this.b + (this.d - f) / 2 + 1, 1, f);
         }

         main.a.a(var1);
         if (this.c != null && this.c.length() > 0 && main.a.e && var9) {
            var1.a(a, this.a + this.c - 13, this.b + this.d / 2 + 1, 3);
         }
      }

   }

   public final boolean a(int var1) {
      boolean var3 = false;
      if (var1 != 8 && var1 != -8 && var1 != 204) {
         if (var1 >= 65 && var1 <= 122 && !b) {
            b = true;
            aa.a("qwerty", 1);
         }

         if (b) {
            if (var1 == 45) {
               if (var1 == this.k && this.l < a[e]) {
                  this.c = this.c.substring(0, this.g - 1) + '_';
                  this.e = this.c;
                  this.e();
                  this.onCancelChat();
                  this.k = -1984;
                  return var3;
               }

               this.k = 45;
            }

            if (var1 >= 32) {
               this.c(var1);
               return var3;
            }
         }

         if (var1 == q) {
            ++this.p;
            if (this.p > 3) {
               this.p = 0;
            }

            this.l = 1;
            this.k = var1;
         } else {
            if (var1 == 42) {
               var1 = 58;
            }

            if (var1 == 35) {
               var1 = 59;
            }

            if (var1 >= 48 && var1 <= 59) {
               if (this.o != 0 && this.o != 2 && this.o != 3) {
                  if (this.o == 1) {
                     this.c(var1);
                     this.l = 1;
                  }
               } else {
                  String[] var4;
                  if (this.o != 2 && this.o != 3) {
                     var4 = a;
                  } else {
                     var4 = b;
                  }

                  char var2;
                  String var5;
                  String var6;
                  if (var1 == this.k) {
                     this.m = (this.m + 1) % var4[var1 - 48].length();
                     var2 = var4[var1 - 48].charAt(this.m);
                     if (this.p == 0) {
                        var2 = Character.toLowerCase(var2);
                     } else if (this.p == 1) {
                        var2 = Character.toUpperCase(var2);
                     } else if (this.p == 2) {
                        var2 = Character.toUpperCase(var2);
                     } else {
                        var2 = var4[var1 - 48].charAt(var4[var1 - 48].length() - 1);
                     }

                     var5 = this.c.substring(0, this.g - 1) + var2;
                     var6 = var5;
                     if (this.g < this.c.length()) {
                        var6 = var5 + this.c.substring(this.g, this.c.length());
                     }

                     this.c = var6;
                     this.l = a[e];
                     this.e();
                  } else if (this.c.length() < this.i) {
                     if (this.p == 1 && this.k != -1984) {
                        this.p = 0;
                     }

                     this.m = 0;
                     var2 = var4[var1 - 48].charAt(this.m);
                     if (this.p == 0) {
                        var2 = Character.toLowerCase(var2);
                     } else if (this.p == 1) {
                        var2 = Character.toUpperCase(var2);
                     } else if (this.p == 2) {
                        var2 = Character.toUpperCase(var2);
                     } else {
                        var2 = var4[var1 - 48].charAt(var4[var1 - 48].length() - 1);
                     }

                     var5 = this.c.substring(0, this.g) + var2;
                     var6 = var5;
                     if (this.g < this.c.length()) {
                        var6 = var5 + this.c.substring(this.g, this.c.length());
                     }

                     this.c = var6;
                     this.l = a[e];
                     ++this.g;
                     this.e();
                     this.onCancelChat();
                  }

                  this.k = var1;
               }
            } else {
               this.m = 0;
               this.k = -1984;
               if (var1 == 14) {
                  if (this.g > 0) {
                     --this.g;
                     this.onCancelChat();
                     this.n = 10;
                     return var3;
                  }
               } else if (var1 == 15) {
                  if (this.g < this.c.length()) {
                     ++this.g;
                     this.onCancelChat();
                     this.n = 10;
                     return var3;
                  }
               } else {
                  if (var1 == 19) {
                     this.b();
                     return var3;
                  }

                  this.k = var1;
               }
            }

            var3 = true;
         }
      } else {
         this.b();
         var3 = true;
      }

      return var3;
   }

   public final void b() {
      if (this.g > 0 && this.c.length() > 0) {
         this.c = this.c.substring(0, this.g - 1) + this.c.substring(this.g, this.c.length());
         --this.g;
         this.onCancelChat();
         this.e();
      }

   }

   public final void c() {
      this.d = true;
      ++this.h;
      if (this.l > 0) {
         --this.l;
         if (this.l == 0) {
            this.m = 0;
            if (this.p == 1 && this.k != q) {
               this.p = 0;
            }

            this.k = -1984;
            this.e();
         }
      }

      if (this.n > 0) {
         --this.n;
      }

      if (main.a.j) {
         if (main.a.a(this.a + this.c - 20, this.b, 40, this.d)) {
            this.c = "";
            this.g = 0;
            this.onCancelChat();
            this.e();
            this.a = true;
         } else if (main.a.a(this.a, this.b, this.c, this.d)) {
            this.a();
         } else {
            this.a = false;
         }
      }

   }

   public final void checkInfo(String var1) {
      if (var1 != null) {
         this.k = -1984;
         this.l = 0;
         this.m = 0;
         this.c = var1;
         this.e = var1;
         this.e();
         this.g = var1.length();
         this.onCancelChat();
      }

   }

   public final void goToMap(int var1) {
      this.o = var1;
      this.i = 500;
   }
}
