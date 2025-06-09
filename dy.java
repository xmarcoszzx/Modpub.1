package pasta;

import javax.microedition.lcdui.Image;

public final class dy extends cm implements ah {
   public static boolean U = true;
   private static Image all = dz.b("/mainImage/myTexture2dhatdau.png");
   public boolean S;
   public boolean T;
   public boolean V;
   private boolean W;
   private ar all = new ar("", 0, 0);
   public int ao;
   public int ap;
   public int aq;
   public int ar;
   public int as;
   private int at = 0;
   public int[] b;
   public int[] c;
   public String d;
   public long f;
   public long g;

   public dy(int var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.all.a = new cd((String)null, this, 1, (Object)null);
      pasta.ar.a(this.all);
   }

   public final void a(int var1, Object var2) {
      if (var1 == 1) {
         pasta.av.a().b((byte)1);
      }

   }

   public final void b(dm var1) {
      if (this.ao != 0) {
         pasta.ao.a(var1, this.ao, super.b, super.c, 0, bk.c);
         if (Char.myCharz().a != null && Char.myCharz().a.equals(this)) {
            var1.a(pasta.i.a, 0, 0, 9, 6, 0, super.b, super.c - pasta.ao.a[this.ao][4] - 1, 33);
            if (this.d != null) {
               cg.n.a(var1, this.d, super.b, super.c - pasta.ao.a[this.ao][4] - 20, 2, cg.o);
            }
         } else if (this.d != null) {
            cg.n.a(var1, this.d, super.b, super.c - pasta.ao.a[this.ao][4] - 17, 2, cg.o);
         }

         int var2 = 0;

         while(true) {
            boolean var10001;
            int var3;
            try {
               var3 = this.ap;
            } catch (Exception var6) {
               var10001 = false;
               break;
            }

            if (var2 >= var3) {
               break;
            }

            try {
               var1.a(all, super.b + this.b[var2] - pasta.ao.a[this.ao][3] / 2, super.c + this.c[var2] - pasta.ao.a[this.ao][4], 0);
            } catch (Exception var5) {
               var10001 = false;
               break;
            }

            ++var2;
         }

         if (super.aa >= 0 && super.a != null && super.d == 0) {
            pasta.ao.a(var1, super.a.a[super.aa].c, super.b + super.a.a[super.aa].a + pasta.ao.a[this.ao][3] / 2 + 5, super.c - 15 + super.a.a[super.aa].b, 0, 3);
            if (main.a.g % 2 == 0) {
               ++super.aa;
               if (super.aa >= super.a.a.length) {
                  super.aa = 0;
               }
            }
         }
      }

   }

   public final void onCancelChat() {
      this.all.b = U;
      this.g = System.currentTimeMillis();
      if (this.g - this.f >= 1000L) {
         --this.as;
         this.f = this.g;
         if (this.as < 0) {
            this.as = 0;
         }
      }

      if (!this.S) {
         if (this.ap < this.ar && this.as == 0) {
            this.W = true;
         }
      } else if (this.as == 0) {
         this.S = false;
         this.W = true;
      }

      if (this.W) {
         ++this.at;
         if (this.at == 20) {
            label496: {
               this.at = 0;
               this.W = false;
               Object var28 = pasta.av.a();

               label482: {
                  Message var27;
                  label491: {
                     label480: {
                        label479: {
                           try {
                              var27 = new Message((byte)-34);
                              break label479;
                           } catch (Exception var25) {
                              var28 = var25;
                           } finally {
                              ;
                           }

                           var27 = null;
                           break label480;
                        }

                        try {
                           var27.a().writeByte(2);
                           ((av)var28).a.a(var27);
                           break label482;
                        } catch (Exception var23) {
                           var28 = var23;
                        } finally {
                           break label491;
                        }
                     }

                     try {
                        ((Throwable)var28).printStackTrace();
                     } finally {
                        break label491;
                     }

                     break label496;
                  }

                  var27.a();
                  throw var28;
               }

            }
         }
      }

      if (this.T) {
         this.T = false;
         int var1;
         int var2;
         int var3;
         String var4;
         ar var5;
         String var6;
         if ((this.as < 0 || this.ap >= this.ar) && (this.as < 0 || !this.S) && !this.V) {
            if (this.ap == this.ar && !this.S) {
               var5 = this.all;
               var6 = pasta.ab.ca;
               var4 = this.ap + "/" + this.ar;
               var3 = super.b;
               var2 = super.c;
               var1 = pasta.ao.a[this.ao][4];
               var5.a(new String[]{var6, var4}, var3, var2 - 20 - var1);
            }
         } else {
            var5 = this.all;
            if (!this.S) {
               var4 = this.ap + "/" + this.ar;
            } else {
               var4 = pasta.ab.bQ;
            }

            var6 = pasta.o.b(this.as);
            var2 = super.b;
            var1 = super.c;
            var3 = pasta.ao.a[this.ao][4];
            var5.a(new String[]{var4, var6}, var2, var1 - 20 - var3);
         }
      }

      if (this.as >= 0 && this.ap < this.ar || this.as >= 0 && this.S) {
         this.all.a[this.all.a.length - 1] = pasta.o.b(this.as);
      }

      if (this.V) {
         this.all.b = false;
         pasta.y.a(98, super.b + this.b[this.ap - 1] - pasta.ao.a[this.ao][3] / 2, super.c + this.c[this.ap - 1] - pasta.ao.a[this.ao][4], 1);
         --this.ap;
         if (main.a.g % 2 == 0) {
            pasta.aw.a();
         }

         if (this.ap == this.aq) {
            this.all.b = true;
            this.T = true;
            this.V = false;
         }
      }

      super.onCancelChat();
   }
}
