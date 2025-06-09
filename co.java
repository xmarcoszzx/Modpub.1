package pasta;

public final class co {
   private static byte[] a;
   private static int[] a;
   private static int[] b;
   public int a = 0;
   private Char a;
   private bu a = null;
   public int b;
   public int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;

   static {
      byte[] var0 = new byte[]{0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0};
      a = var0;
      int[] var1 = new int[]{0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};
      a = var1;
      var1 = new int[]{0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};
      b = var1;
   }

   public co(Char var1, bu var2) {
      this.a = var1;
      this.a = var2;
   }

   public final void a() {
      if (this.a.a != null || this.a.a != null) {
         if (this.a.a != null) {
            this.d = this.a.a.e;
            this.e = this.a.a.f - this.a.a.o / 4;
         } else if (this.a.a != null) {
            this.d = this.a.a.b;
            this.e = this.a.a.c - this.a.a.B / 4;
         }

         int var3 = this.d - this.b;
         int var2 = this.e - this.c;
         byte var1 = 4;
         if (var3 + var2 < 60) {
            var1 = 3;
         } else if (var3 + var2 < 30) {
            var1 = 2;
         }

         if (this.b != this.d) {
            if (var3 > 0 && var3 < 5) {
               this.b = this.d;
            } else if (var3 < 0 && var3 > -5) {
               this.b = this.d;
            } else {
               this.f = this.d - this.b << 2;
               this.h += this.f;
               this.b += this.h >> var1;
               this.h &= 15;
            }
         }

         if (this.c != this.e) {
            if (var2 > 0 && var2 < 5) {
               this.c = this.e;
            } else if (var2 < 0 && var2 > -5) {
               this.c = this.e;
            } else {
               this.g = this.e - this.c << 2;
               this.i += this.g;
               var2 = this.c;
               this.c = (this.i >> var1) + var2;
               this.i &= 15;
            }
         }

         int var4;
         int var5;
         if (this.a.a != null) {
            var5 = this.d - this.a.a.n / 4;
            var2 = this.d;
            var3 = this.a.a.n / 4 + var2;
            var4 = this.e - this.a.a.o / 4;
            var2 = this.e + this.a.a.o / 4;
         } else if (this.a.a != null) {
            var5 = this.d - this.a.a.A / 4;
            var2 = this.d;
            var3 = this.a.a.A / 4 + var2;
            var4 = this.e - this.a.a.B / 4;
            var2 = this.e + this.a.a.B / 4;
         } else {
            var5 = 0;
            var2 = 0;
            var3 = 0;
            var4 = 0;
         }

         if (this.a > 0) {
            --this.a;
         }

         if (this.a != 0 && (this.b < var5 || this.b > var3 || this.c < var4 || this.c > var2)) {
            return;
         }
      }

      this.a.a = null;
      this.i = 0;
      this.h = 0;
      this.g = 0;
      this.f = 0;
      this.e = 0;
      this.d = 0;
      this.c = 0;
      this.b = 0;
      this.a.o();
   }

   public final void a(dm var1) {
      int var3 = cq.a(this.d - this.b, -(this.e - this.c));
      int var2 = 0;

      while(true) {
         if (var2 >= a.length - 1) {
            var3 = 0;
            break;
         }

         if (var3 >= a[var2] && var3 <= a[var2 + 1]) {
            var3 = var2;
            if (var2 >= 16) {
               var3 = 0;
            }
            break;
         }

         ++var2;
      }

      ao.a(var1, this.a.a[a[var3]], this.b, this.c, b[var3], 3);
   }
}
