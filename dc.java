package pasta;

public final class dc {
   public byte a;
   public int a;
   long a;
   public String a;
   public Char a;
   private MyVector a;
   public i a;
   public k a;
   int[] a;
   public db[] a;
   public byte b;
   public int b;
   public String b;
   public byte c;
   public int c;
   public byte d;
   int d;
   public byte e;
   public byte f;

   public dc() {
      int[] var1 = new int[10];
      var1[5] = 1;
      var1[6] = 1;
      var1[7] = 1;
      var1[8] = 1;
      var1[9] = 1;
      this.a = var1;
      this.d = 0;
      this.a = new MyVector("");
   }

   public static dc a(MyVector var0, int var1) {
      dc var3;
      if (var0 != null) {
         for(int var2 = 0; var2 < var0.size(); ++var2) {
            dc var4 = (dc)var0.elementAt(var2);
            if (var4 != null) {
               var3 = var4;
               if (var4.a == var1) {
                  return var3;
               }
            }
         }
      }

      var3 = null;
      return var3;
   }

   public final void a() {
      this.a = new k();
      String var4 = "" + "\n|6|" + this.b + "\n--";
      String var5 = var4;
      if (this.a != null) {
         int var1 = 0;

         while(true) {
            int var2 = 0;

            boolean var8;
            while(true) {
               if (var2 >= this.a.length) {
                  var8 = false;
                  break;
               }

               if (!this.a[var2].a().equals("") && var1 == this.a[var2].a) {
                  var8 = true;
                  break;
               }

               ++var2;
            }

            var5 = var4;
            if (!var8) {
               break;
            }

            if (var1 == 0) {
               var5 = var4 + "\n|6|2|--" + ab.c + "--";
            } else {
               var5 = var4 + "\n|6|2|--" + ab.b + " Lv." + var1 + "--";
            }

            for(int var3 = 0; var3 < this.a.length; var5 = var4) {
               String var7 = this.a[var3].a();
               var4 = var5;
               if (!var7.equals("")) {
                  var4 = var5;
                  if (var1 == this.a[var3].a) {
                     String var6 = "1";
                     if (this.e == 0) {
                        var4 = "2";
                     } else {
                        var4 = var6;
                        if (this.a[var3].a != 0) {
                           if (this.f == 0) {
                              var4 = "2";
                           } else {
                              var4 = var6;
                              if (this.e < this.a[var3].a) {
                                 var4 = "2";
                              }
                           }
                        }
                     }

                     var4 = var5 + "\n|" + var4 + "|1|" + var7;
                  }
               }

               ++var3;
            }

            var4 = var5;
            if (var8) {
               ++var1;
               var4 = var5;
            }
         }
      }

      k var9 = this.a;
      var9.a = v.c;
      var9.d = v.a;
      var9.a = cg.k.a(var5, var9.a - 8);
      var9.b = 10000000;
      var9.a = null;
      var9.f = var9.a.length * 12;
      var9.e = v.b;
      var9.h = 10;
      var9.g = var9.f - v.d;
      if (var9.g < 0) {
         var9.g = 0;
      }

   }

   public final void a(byte var1) {
      this.e = var1;
      this.a();
   }

   public final void a(byte var1, byte var2) {
      this.b = var1;
      this.c = var2;
   }

   public final void a(dm var1, int var2, int var3) {
      int var4;
      int var5;
      ak var6;
      if (this.b == this.c && this.a.size() == 0) {
         var5 = cq.b(1, 5);

         for(var4 = 0; var4 < var5; ++var4) {
            var6 = new ak();
            var6.a = cq.b(5, 25);
            var6.b = cq.b(5, 25);
            var6.d = cq.b(0, 8) * var4;
            var6.e = 0;
            var6.c = -1;
            this.a.addElement(var6);
         }
      }

      for(var4 = 0; var4 < this.a.size(); var4 = var5 + 1) {
         var6 = (ak)this.a.elementAt(var4);
         var5 = var4;
         if (var6 != null) {
            if (var6.e < var6.d) {
               ++var6.e;
            }

            var5 = var4;
            if (var6.e >= var6.d) {
               var6.c = main.a.g / 3 % (v.a.c + 1);
               if (var6.c >= v.a.c) {
                  this.a.removeElementAt(var4);
                  var5 = var4 - 1;
               } else {
                  v.a.a(var6.c, var6.a + var2, var6.b + var3, 0, 3, var1);
                  var5 = var4;
               }
            }
         }
      }

   }

   public final void b(byte var1) {
      this.f = var1;
      this.a();
   }
}
