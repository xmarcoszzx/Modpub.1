package pasta;

public final class an {
   private int a;
   private Char a;
   private MyVector a = new MyVector("vDARTS");
   private ba a;
   public bj a;
   private boolean a = true;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h = 0;
   private int i = 0;

   public an(Char var1, int var2, bj var3, int var4, int var5) {
      this.a = var3;
      this.a = var1;
      this.a = GameSrc.a[var2];
      this.d = this.a.a;
      this.e = var4;
      this.f = var5;
      Object var6;
      if (var1.a == null) {
         var6 = var1.a;
      } else {
         var6 = var1.a;
      }

      var2 = cq.a(((as)var6).a() - var4, ((as)var6).b() - var5);
      this.a = var2;
      this.b = this.d * cq.b(var2) >> 10;
      var4 = this.d;
      this.c = cq.a(var2) * var4 >> 10;
   }

   private void b() {
      if (!this.a.A && this.e >= GameSrc.k && this.e <= GameSrc.k + main.a.i) {
         aw.a();
      }

      this.a.o();
      if (this.a.A) {
         this.a.A = false;
         if (this.a.x && this.a.j && this.a.h != 14 && this.a.h != 5) {
            this.a.x = false;
         }

         GameSrc.a().teleTo(this.e, this.f);
      }

      this.a.a = null;
      this.a.z = false;
      this.a.a = null;
      this.a.b = null;
   }

   public final void a() {
      if (this.a) {
         if (this.a.a == null && this.a.a == null) {
            this.b();
         } else {
            Object var3;
            if (this.a.a == null) {
               var3 = this.a.a;
            } else {
               var3 = this.a.a;
            }

            int var1 = 0;

            while(true) {
               if (var1 >= this.a.b) {
                  for(var1 = 0; var1 < this.a.size(); ++var1) {
                     cu var5 = (cu)this.a.elementAt(var1);
                     ++var5.a;
                     if (var5.a >= this.a.a.length) {
                        this.a.removeElementAt(var1);
                     }
                  }

                  return;
               }

               if (this.a.a.length > 0) {
                  this.a.addElement(new cu(this.e, this.f));
               }

               byte var2;
               if (this.a.a() > ((as)var3).a()) {
                  var2 = 10;
               } else {
                  var2 = -10;
               }

               this.h = var2 + ((as)var3).a() - this.e;
               this.i = ((as)var3).b() - ((as)var3).c() / 2 - this.f;
               ++this.g;
               if (cq.f(this.h) < 20 && cq.f(this.i) < 20) {
                  if (this.a.a != null && this.a.a.j) {
                     this.a.a.a(this.a.a.y, 0, this.a.a.f, this.a.a.e);
                  }

                  this.b();
                  break;
               }

               int var4 = cq.a(this.h, this.i);
               if (Math.abs(var4 - this.a) < 90 || this.h * this.h + this.i * this.i > 4096) {
                  if (Math.abs(var4 - this.a) < 15) {
                     this.a = var4;
                  } else if ((var4 - this.a < 0 || var4 - this.a >= 180) && var4 - this.a >= -180) {
                     this.a = cq.c(this.a - 15);
                  } else {
                     this.a = cq.c(this.a + 15);
                  }
               }

               if (this.d < 8192) {
                  this.d += 1024;
               }

               this.b = this.d * cq.b(this.a) >> 10;
               this.c = this.d * cq.a(this.a) >> 10;
               this.h += this.b;
               this.e += this.h >> 10;
               this.h &= 1023;
               this.i += this.c;
               this.f += this.i >> 10;
               this.i &= 1023;
               ++var1;
            }
         }
      }

   }

   public final void a(dm var1) {
      if (this.a) {
         int var2 = n.a(360 - this.a);
         byte var3 = n.a[var2];
         int var4 = n.a[var2];

         cu var6;
         for(var2 = this.a.size() / 2; var2 < this.a.size(); ++var2) {
            var6 = (cu)this.a.elementAt(var2);
            ao.a(var1, this.a.b[var6.a], var6.b, var6.c, 0, 3);
         }

         int var5 = main.a.g % this.a.b.length;
         ao.a(var1, this.a.b[var5][var3], this.e, this.f, var4, 3);

         for(var2 = 0; var2 < this.a.size(); ++var2) {
            var6 = (cu)this.a.elementAt(var2);
            ao.a(var1, this.a.a[var6.a], var6.b, var6.c, 0, 3);
         }

         ao.a(var1, this.a.a[var5][var3], this.e, this.f, var4, 3);

         for(var2 = 0; var2 < this.a.size(); ++var2) {
            var6 = (cu)this.a.elementAt(var2);
            if (cq.f(n.a.nextInt(100)) < this.a.a) {
               short var7;
               if (main.a.g % 2 == 0) {
                  var7 = this.a.c[var6.a];
               } else {
                  var7 = this.a.d[var6.a];
               }

               ao.a(var1, var7, var6.b, var6.c, 0, 3);
            }
         }

         var1.a(16711680);
      }

   }
}
