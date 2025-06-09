package pasta;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class dm {
   public static int a = 1;
   public Graphics a;

   public static int a(int var0) {
      float var4 = 255.0F;
      float var5 = 0.0F;
      float var2 = (float)(var0 >> 16 & 255);
      float var3 = (float)(var0 >> 8 & 255);
      float var1 = (float)(var0 & 255);
      var2 *= 0.4F;
      var3 *= 0.4F;
      float var6 = var1 * 0.4F;
      var1 = var2;
      if (var2 > 255.0F) {
         var1 = 255.0F;
      }

      var2 = var1;
      if (var1 < 0.0F) {
         var2 = 0.0F;
      }

      var1 = var3;
      if (var3 > 255.0F) {
         var1 = 255.0F;
      }

      var3 = var1;
      if (var1 < 0.0F) {
         var3 = 0.0F;
      }

      if (var6 < 0.0F) {
         var1 = var5;
      } else {
         var1 = var6;
      }

      if (var1 > 255.0F) {
         var1 = var4;
      }

      int var7 = (int)var2;
      var0 = (int)var3;
      return (int)var1 & 255 | var7 << 16 | -16777216 | var0 << 8;
   }

   public static int a(Image var0) {
      return var0.getWidth() / a;
   }

   public static int b(Image var0) {
      return var0.getHeight() / a;
   }

   public static int c(Image var0) {
      return var0.getWidth();
   }

   public static int d(Image var0) {
      return var0.getHeight();
   }

   public final int a() {
      return this.a.getTranslateX() / a;
   }

   public final void a(int var1) {
      this.a.setColor(var1);
   }

   public final void a(int var1, int var2) {
      int var4 = a;
      int var3 = a;
      this.a.translate(var4 * var1, var3 * var2);
   }

   public final void a(int var1, int var2, int var3, int var4) {
      int var5 = a;
      int var7 = a;
      int var6 = a;
      int var8 = a;
      this.a.fillArc(var5 * var1, var7 * var2, var6 * var3, var8 * var4, 0, 360);
   }

   public final void a(int var1, int var2, int var3, int var4, int var5) {
      int var9 = a;
      int var6 = a;
      int var7 = a;
      int var8 = a;
      this.a.setColor(var5);
      this.a.fillRect(var9 * var1, var6 * var2, var7 * var3, var8 * var4);
   }

   public final void a(Image var1, float var2, float var3, int var4) {
      float var5 = (float)a;
      float var6 = (float)a;
      this.a.drawImage(var1, (int)(var5 * var2), (int)(var6 * var3), var4);
   }

   public final void a(Image var1, int var2, int var3) {
      for(int var4 = 0; var4 < var2 / a(var1) + 1; ++var4) {
         for(int var5 = 0; var5 < var3 / b(var1) + 1; ++var5) {
            this.a.drawImage(var1, a(var1) * var4 + 0, b(var1) * var5 + 0, 0);
         }
      }

   }

   public final void a(Image var1, int var2, int var3, int var4) {
      int var5 = a;
      int var6 = a;
      this.a.drawImage(var1, var5 * var2, var6 * var3, var4);
   }

   public final void a(Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.a(var1, 0, var2, var3, var4, var5, var6, var7, var8);
   }

   public final void a(Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var12 = a;
      int var11 = a;
      int var13 = a;
      int var10 = a;
      int var15 = a;
      int var14 = a;
      this.a.drawRegion(var1, var13 * var2, var10 * var3, var15 * var4, var14 * var5, var6, var7 * var12, var8 * var11, var9);
   }

   public final int b() {
      return this.a.getTranslateY() / a;
   }

   public final void b(int var1, int var2, int var3, int var4) {
      int var6 = a;
      int var7 = a;
      int var8 = a;
      int var5 = a;
      this.a.drawLine(var6 * var1, var7 * var2, var8 * var3, var5 * var4);
   }

   public final int c() {
      return this.a.getClipX();
   }

   public final void c(int var1, int var2, int var3, int var4) {
      this.e(var1, var2, var3, var4);
   }

   public final int d() {
      return this.a.getClipY();
   }

   public final void d(int var1, int var2, int var3, int var4) {
      this.e(var1, var2, 1, var4);
      this.e(var1 + var3, var2, 1, var4);
      this.e(var1, var2, var3, 1);
      this.e(var1, var2 + var4, var3 + 1, 1);
   }

   public final int e() {
      return this.a.getClipWidth();
   }

   public final void e(int var1, int var2, int var3, int var4) {
      int var7 = a;
      int var5 = a;
      int var8 = a;
      int var6 = a;
      this.a.fillRect(var7 * var1, var5 * var2, var8 * var3, var6 * var4);
   }

   public final int f() {
      return this.a.getClipHeight();
   }

   public final void f(int var1, int var2, int var3, int var4) {
      int var7 = a;
      int var5 = a;
      int var8 = a;
      int var6 = a;
      this.a.setClip(var7 * var1, var5 * var2, var8 * var3, var6 * var4);
   }
}
