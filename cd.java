package pasta;

import javax.microedition.lcdui.Image;

public final class cd {
   private static Image c = dz.b("/mainImage/btn0left.png");
   private static Image d = dz.b("/mainImage/btn0mid.png");
   private static Image e = dz.b("/mainImage/btn0right.png");
   private static Image f = dz.b("/mainImage/btn1left.png");
   private static Image g = dz.b("/mainImage/btn1mid.png");
   private static Image h = dz.b("/mainImage/btn1right.png");
   public int a;
   public Object a;
   public String a;
   public Image a;
   private ah a;
   public boolean a = true;
   public String[] a;
   public int b = 0;
   public String b;
   public Image b;
   public boolean b;
   public int c = 0;
   public boolean c;
   public int d;
   public int e;
   private int f;
   private int g;

   public cd(String var1, int var2) {
      this.d = ag.f;
      this.e = ag.g;
      this.b = false;
      this.b = "";
      this.a = var1;
      this.a = var2;
   }

   public cd(String var1, int var2, int var3) {
      this.d = ag.f;
      this.e = ag.g;
      this.b = false;
      this.b = "";
      this.a = var1;
      this.a = 0;
      this.b = var2;
      this.c = var3;
   }

   public cd(String var1, int var2, Object var3) {
      this.d = ag.f;
      this.e = ag.g;
      this.b = false;
      this.b = "";
      this.a = var1;
      this.a = var2;
      this.a = var3;
   }

   public cd(String var1, ah var2, int var3, int var4, int var5) {
      this.d = ag.f;
      this.e = ag.g;
      this.b = false;
      this.b = "";
      this.a = var1;
      this.a = var3;
      this.a = var2;
      this.a = null;
      this.b = var4;
      this.c = var5;
   }

   public cd(String var1, ah var2, int var3, Object var4) {
      this.d = ag.f;
      this.e = ag.g;
      this.b = false;
      this.b = "";
      this.a = var1;
      this.a = var3;
      this.a = var2;
      this.a = var4;
   }

   private static void a(Image var0, Image var1, Image var2, int var3, int var4, int var5, dm var6) {
      int var7;
      for(var7 = 10; var7 <= var5 - 20; var7 += 10) {
         var6.a(var1, var3 + var7, var4, 0);
      }

      var7 = var5 % 10;
      if (var7 > 0) {
         var6.a(var1, 0, 0, var7, 24, 0, var3 + var5 - 10 - var7, var4, 0);
      }

      var6.a(var0, var3, var4, 0);
      var6.a(var2, var3 + var5 - 10, var4, 0);
   }

   public final void a() {
      main.a.j();
      if (this.a && (this.a != null && !this.a.equals("") && !this.a.equals(ab.bV) || this.a != null)) {
         aw.a();
      }

      if (this.a > 0) {
         if (this.a != null) {
            this.a.a(this.a, this.a);
         } else {
            GameSrc.a().a(this.a, this.a);
         }
      }

   }

   public final void a(dm var1) {
      int var6;
      if (this.a != null) {
         var1.a(this.a, this.b, this.c, 0);
         if (this.b) {
            if (this.b == null) {
               if (this.c) {
                  var1.a(ItemMap.a, this.b + 8, this.c + 8, 3);
               } else {
                  Image var4 = ItemMap.a;
                  int var3 = this.b;
                  byte var2;
                  if (this.a.equals(GameSrc.h)) {
                     var2 = 10;
                  } else {
                     var2 = 0;
                  }

                  var1.a(var4, var3 - var2, this.c, 0);
               }
            } else {
               var1.a(this.b, this.b, this.c, 0);
            }
         }

         if (this.a != "" && this.a != null) {
            String var5;
            cg var7;
            if (!this.b) {
               var7 = cg.f;
               var5 = this.a;
               var6 = this.b;
               var7.a(var1, var5, dm.a(this.a) / 2 + var6, this.c + dm.b(this.a) / 2 - 5, 2);
            } else {
               var7 = cg.g;
               var5 = this.a;
               var6 = this.b;
               var7.a(var1, var5, dm.a(this.a) / 2 + var6, this.c + dm.b(this.a) / 2 - 5, 2);
            }
         }
      } else {
         if (this.a != "") {
            if (this.g == 1) {
               if (!this.b) {
                  a(c, d, e, this.b, this.c, 160, var1);
               } else {
                  a(f, g, h, this.b, this.c, 160, var1);
               }
            } else if (!this.b) {
               a(c, d, e, this.b, this.c, 76, var1);
            } else {
               a(f, g, h, this.b, this.c, 76, var1);
            }
         }

         if (this.g == 1) {
            var6 = this.b + this.f;
         } else {
            var6 = this.b + 38;
         }

         if (!this.b) {
            cg.f.a(var1, this.a, var6, this.c + 7, 2);
         } else {
            cg.g.a(var1, this.a, var6, this.c + 7, 2);
         }
      }

   }

   public final boolean a() {
      boolean var1 = true;
      this.b = false;
      if (main.a.a(this.b, this.c, this.d, this.e)) {
         if (main.a.h) {
            this.b = true;
         }

         if (main.a.j && main.a.i) {
            return var1;
         }
      }

      var1 = false;
      return var1;
   }

   public final void b() {
      this.g = 1;
      this.d = 160;
      this.f = 80;
   }
}
