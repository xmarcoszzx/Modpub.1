package pasta;

public final class ai extends eb {
   private int a;
   public boolean a;
   private String[] a;
   private int b = 35;

   public ai() {
      if (main.a.i <= 176) {
         this.b = 10;
      }

      if (main.a.i > 320) {
         this.b = 80;
      }

   }

   public final void a() {
      this.a(ab.ar, (cd)null, (cd)null, (cd)null);
      main.a.a = this;
   }

   public final void a(String var1) {
      this.a = cg.t.a(var1, main.a.i - ((this.b << 1) + 20));
      this.a = 80;
      if (this.a.length >= 5) {
         this.a = this.a.length * cg.t.a() + 20;
      }

   }

   public final void a(String var1, cd var2, cd var3, cd var4) {
      this.a = cg.t.a(var1, main.a.i - ((this.b << 1) + 20));
      super.a = var2;
      super.b = var3;
      super.c = var4;
      this.a = 80;
      if (this.a.length >= 5) {
         this.a = this.a.length * cg.t.a() + 20;
      }

      if (main.a.e) {
         if (var2 != null) {
            super.a.b = main.a.i / 2 - 68 - 5;
            super.a.c = main.a.j - 50;
         }

         if (var4 != null) {
            super.c.b = main.a.i / 2 + 5;
            super.c.c = main.a.j - 50;
         }

         if (var3 != null) {
            super.b.b = main.a.i / 2 - 35;
            super.b.c = main.a.j - 50;
         }
      }

      this.a = false;
   }

   public final void a(dm var1) {
      var1.f(0, 0, main.a.i, main.a.j);
      int var2 = main.a.j - this.a - 38;
      int var3 = main.a.i;
      int var4 = this.b;
      bw.a(this.b, var2, var3 - (var4 << 1), this.a, var1);
      var3 = var2 + (this.a - this.a.length * cg.t.a()) / 2 - 2;
      var2 = var3;
      if (this.a) {
         var2 = var3 + 8;
         main.a.a(main.a.k, var2 - 12, var1);
      }

      var3 = var2;

      for(var2 = 0; var2 < this.a.length; ++var2) {
         cg.f.a(var1, this.a[var2], main.a.k, var3, 2);
         var3 += cg.t.a();
      }

      super.a(var1);
   }

   public final void b() {
      super.b();
   }
}
