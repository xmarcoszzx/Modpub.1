package pasta;

public final class dq extends ag implements ah {
   private static dq a;
   private int a;
   private String a;
   private bq a;
   private String[] a;
   public bf[] a;
   private int b;
   private int c;
   private int d;
   private int i;
   private int j;

   public static dq a() {
      if (a == null) {
         a = new dq();
      }

      return a;
   }

   public final void a() {
      if (dz.a == 5 && this.a.length == 1 || dz.a == 3 && this.a.length == 1) {
         this.a = new bq();
         this.a.b = this.a;
         this.a.a.b = this.a[0].a;
         this.a.a = "";
         this.a.a = true;
         this.a.a.goToMap(0);
         if (main.a.e) {
         }
      } else {
         this.i = 0;
         super.a();
      }

   }

   public final void a(int var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if (this.a[var2].a) {
            this.a[var2].a(var1);
            break;
         }
      }

      super.a(var1);
   }

   public final void a(int var1, Object var2) {
      byte var3 = 0;
      if (var1 == 1) {
         GameSrc.a.a();
         a = null;
      }

      if (var1 == 2) {
         label64: {
            if (dz.a != 5 || this.a.length != 1) {
               var1 = var3;
               if (dz.a != 3) {
                  break label64;
               }

               var1 = var3;
               if (this.a.length != 1) {
                  break label64;
               }
            }

            if (this.a.a.a() != null && !this.a.a.a().equals("")) {
               this.a[0].checkInfo(this.a.a.a());
               av.a().a(this.a);
               GameSrc.a.a();
               return;
            }

            main.a.checkInfo(ab.fj);
            return;
         }

         while(true) {
            if (var1 >= this.a.length) {
               av.a().a(this.a);
               GameSrc.a.a();
               break;
            }

            if (this.a[var1].a() == null || this.a[var1].a().equals("")) {
               main.a.checkInfo(ab.fj);
               break;
            }

            ++var1;
         }
      }

   }

   public final void a(int var1, String var2) {
      this.j = var1;
      this.a = var2;
      this.c = main.a.i - 20;
      if (this.c > 320) {
         this.c = 320;
      }

      (new StringBuffer("title= ")).append(var2);
      this.a = cg.f.a(var2, this.c - 20);
      this.a = (main.a.i - this.c) / 2;
      this.a = new bf[this.j];
      this.d = this.a.length * 35 + (this.a.length - 1) * 20 + 40;
      this.b = main.a.j - this.d - 40 - (this.a.length - 1) * 20;

      for(var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1] = new bf();
         this.a[var1].b = "";
         this.a[var1].a = this.a + 10;
         this.a[var1].b = this.b + 35 + (this.a.length - 1) * 20 + var1 * 35;
         this.a[var1].c = this.c - 20;
         this.a[var1].d = ag.e + 2;
         if (main.a.e) {
            this.a[0].a = false;
         } else {
            this.a[0].a = true;
         }

         if (!main.a.e) {
            super.c = this.a[0].a;
         }
      }

      super.a = new cd(ab.aO, this, 1, (Object)null);
      super.b = new cd(ab.aX, this, 2, (Object)null);
      if (main.a.e) {
         super.b.b = main.a.i / 2 + 18;
         super.a.b = main.a.i / 2 - 85;
         cd var4 = super.b;
         cd var3 = super.a;
         var1 = this.b + this.d + 5;
         var3.c = var1;
         var4.c = var1;
      }

      this.a();
   }

   public final void a(dm var1) {
      byte var3 = 0;
      GameSrc.a().a(var1);
      ar.a(var1, this.a, this.b, this.c, this.d, -1, true);

      int var2;
      for(var2 = 0; var2 < this.a.length; ++var2) {
         cg.g.a(var1, this.a[var2], main.a.i / 2, this.b + 15 + var2 * 20, 2);
      }

      for(var2 = var3; var2 < this.a.length; ++var2) {
         this.a[var2].a(var1);
      }

      super.a(var1);
   }

   public final void b() {
      GameSrc.a().b();

      for(int var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1].c();
      }

   }

   public final void c() {
      if (main.a.a[2]) {
         --this.i;
         if (this.i < 0) {
            this.i = this.a.length - 1;
         }
      } else if (main.a.a[8]) {
         ++this.i;
         if (this.i > this.a.length - 1) {
            this.i = 0;
         }
      }

      if (main.a.a[2] || main.a.a[8]) {
         main.a.onCancelChat();

         for(int var1 = 0; var1 < this.a.length; ++var1) {
            if (this.i == var1) {
               this.a[var1].a = true;
               if (!main.a.e) {
                  super.c = this.a[var1].a;
               }
            } else {
               this.a[var1].a = false;
            }

            if (main.a.j && main.a.a(this.a[var1].a, this.a[var1].b, this.a[var1].c, this.a[var1].d)) {
               this.i = var1;
               break;
            }
         }
      }

      super.c();
      main.a.onCancelChat();
   }
}
