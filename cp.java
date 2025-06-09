package pasta;

public final class cp implements ah {
   public static cs a;
   int a;
   public String a;
   cd a;
   public boolean a;
   int b;
   cd b;
   public boolean b;
   public int c = 0;
   public int d;
   public int e;
   public int f;
   public int g;
   int h;
   int i;
   private int j;
   private int k;
   private int l = 24;
   private int m = 50;

   public cp() {
      new MyVector("vItems");
      this.a = new cd(ab.bb, this, 1, (Object)null);
      this.b = new cd(ab.aO, this, 2, (Object)null);
   }

   private void b() {
      this.d = this.a + this.b;
   }

   public final void a() {
      Char.myCharz();
      this.a = true;
      this.b = false;
      this.b = 170;
      this.k = 170;
      this.a = main.a.i / 2 - this.b / 2;
      this.j = main.a.j / 2 - this.k / 2;
      if (main.a.j < 240) {
         this.j -= 10;
      }

      this.e = this.a;
      this.d = 0;
      this.c = q.a.size();
      if (main.a.e) {
         this.a.b = this.a;
         this.a.c = this.j + this.k + 5;
         this.b.b = this.a + this.b - 68;
         this.b.c = this.j + this.k + 5;
      }

      cs var1 = new cs();
      a = var1;
      var1.a(this.c, this.l, this.a, this.j + this.m, this.b, this.k - this.m);
   }

   public final void a(int var1, Object var2) {
      if (var1 == 2) {
         this.b();
      }

      if (var1 == 1 && this.i >= 0) {
         this.b();
         if (Char.myCharz().a == null) {
            av.a().a((byte)2, (byte)((q)q.a.elementAt(this.i)).a, this.a);
         } else {
            av.a().a((byte)4, (byte)((q)q.a.elementAt(this.i)).a, "");
         }
      }

   }

   public final void a(dm var1) {
      var1.a(-this.e, 0);
      ar.a(var1, this.a, this.j - 17, this.b, this.k + 17, -1, true);
      cg var8 = cg.f;
      String var7 = ab.cH;
      int var2 = this.a;
      var8.a(var1, var7, this.b / 2 + var2, this.j - 7, 2);
      if (this.i >= 0 && this.i <= q.a.size() - 1) {
         q var9 = (q)q.a.elementAt(this.i);
         if (var9.a != null) {
            Char.myCharz().a(var1, var9.a, main.a.i / 2, this.j + 45, 1, false);
         }
      }

      Char.myCharz().a(var1, main.a.i / 2, this.j + 45, 1, Char.myCharz().C, false);
      var1.f(this.a, this.j + this.m, this.b, this.k - this.m - 10);
      if (a != null) {
         var1.a(0, -a.d);
      }

      for(var2 = 0; var2 < this.c; ++var2) {
         int var4 = this.a + 10;
         int var5 = this.j + this.l * var2 + this.m;
         int var6 = this.l;
         int var3;
         if (a != null) {
            var3 = a.d;
         } else {
            var3 = 0;
         }

         if (var6 + var5 - var3 >= this.j + this.m) {
            if (a != null) {
               var3 = a.d;
            } else {
               var3 = 0;
            }

            if (var5 - var3 <= this.j + this.m + this.k) {
               q var11 = (q)q.a.elementAt(var2);
               cg var10 = cg.o;
               if (var2 == this.i) {
                  var10 = cg.q;
               }

               if (var11.a != null) {
                  var10.a(var1, var11.a, var4 + 20, var5, 0);
               }

               if (var11.b > 0) {
                  var10.a(var1, var11.b + " " + ab.bf, this.b + var4 - 20, var5, 1);
               } else if (var11.c > 0) {
                  var10.a(var1, var11.c + " " + ab.bg, this.b + var4 - 20, var5, 1);
               }

               if (var11.a != null) {
                  ao.a(var1, var11.a[0], var4, var5, 0, 0);
               }
            }
         }
      }

      var1.a(0, -var1.b());
      var1.f(0, 0, main.a.i, main.a.j);
      bw.a(var1, this.a, (cd)null, this.b);
   }
}
