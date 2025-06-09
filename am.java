package pasta;

import main.GameMidlet;

public final class am extends ag implements ah {
   private int a;
   private bf a;
   private boolean a = false;
   private int b;
   private bf b;
   private boolean b = false;
   private int c;
   private bf c;
   private int d;
   private bf d;
   private cd d;
   private bf e;
   private cd e;
   private bf f;
   private cd f;
   private bf g;
   private cd g;
   private bf h;
   private cd h;
   private int i;
   private bf i;
   private cd i;
   private int j = 130;
   private int k = -1;
   private int l = 2;
   private int m = 0;
   private int n = -40;
   private int o = 1;

   static {
      int[] var0 = new int[]{0, 8, 2, 6, 9};
   }

   public am(byte var1) {
      byte var2 = (byte)((int)(System.currentTimeMillis() % 9L));
      TileMap.i = var2;
      if (var2 == 5 || TileMap.i == 6) {
         TileMap.i = 4;
      }

      GameSrc.transMap(-1, -1);
      GameSrc.k = 100;
      GameSrc.l = 200;
      if (main.a.j > 200) {
         this.c = main.a.l - 80;
      } else {
         this.c = main.a.l - 65;
      }

      this.b = -50;
      this.d = main.a.l - ag.e - 5;
      if (main.a.j <= 160) {
         this.d = 20;
      }

      this.i = new bf();
      this.i.goToMap(1);
      this.i.c = 220;
      this.i.d = ag.e + 2;
      this.i.b = "Số điện thoại/ địa chỉ email";
      if (var1 == 1) {
         this.i.checkInfo("01234567890");
      }

      this.a = new bf();
      this.a.c = 220;
      this.a.d = ag.e + 2;
      this.a.a = true;
      this.a.b = "Họ và tên";
      if (var1 == 1) {
         this.a.checkInfo("Nguyễn Văn A");
      }

      this.a.goToMap(0);
      this.b = new bf();
      this.b.goToMap(1);
      this.b.c = 70;
      this.b.d = ag.e + 2;
      this.b.b = "Ngày sinh";
      if (var1 == 1) {
         this.b.checkInfo("01");
      }

      this.c = new bf();
      this.c.goToMap(1);
      this.c.c = 70;
      this.c.d = ag.e + 2;
      this.c.b = "Tháng sinh";
      if (var1 == 1) {
         this.c.checkInfo("01");
      }

      this.d = new bf();
      this.d.goToMap(1);
      this.d.c = 70;
      this.d.d = ag.e + 2;
      this.d.b = "Năm sinh";
      if (var1 == 1) {
         this.d.checkInfo("1980");
      }

      this.e = new bf();
      this.e.goToMap(0);
      this.e.c = 220;
      this.e.d = ag.e + 2;
      this.e.b = "Địa chỉ đăng ký thường trú";
      if (var1 == 1) {
         this.e.checkInfo("123 đường số 1, Quận 1, TP.HCM");
      }

      this.f = new bf();
      this.f.goToMap(1);
      this.f.c = 220;
      this.f.d = ag.e + 2;
      this.f.b = "Số Chứng minh nhân dân hoặc số hộ chiếu";
      if (var1 == 1) {
         this.f.checkInfo("123456789");
      }

      this.g = new bf();
      this.g.goToMap(1);
      this.g.c = 220;
      this.g.d = ag.e + 2;
      this.g.b = "Ngày cấp";
      if (var1 == 1) {
         this.g.checkInfo("01/01/1990");
      }

      this.h = new bf();
      this.h.goToMap(0);
      this.h.c = 220;
      this.h.d = ag.e + 2;
      this.h.b = "Nơi cấp";
      if (var1 == 1) {
         this.h.checkInfo("TP.HCM");
      }

      this.d += 35;
      this.a = true;
      this.a = 0;
      String var3;
      if (main.a.i > 200) {
         var3 = ab.an;
      } else {
         var3 = ab.ao;
      }

      this.d = new cd(var3, main.a.a, 888393, (Object)null);
      new cd(ab.aY, this, 2001, (Object)null);
      this.f = new cd(ab.ap, this, 2002, (Object)null);
      this.h = new cd(ab.ba, this, 10021, (Object)null);
      cd var7 = new cd(ab.aN, this, 2003, (Object)null);
      this.g = var7;
      super.a = var7;
      if (main.a.e) {
         this.d.b = main.a.i / 2 - 100;
         this.g.b = main.a.i / 2 - ag.f - 8;
         if (main.a.j >= 200) {
            this.d.c = main.a.j / 2 - 40;
            this.g.c = this.j + 110;
         }

         this.h.b = main.a.i / 2 + 3;
         this.h.c = this.j + 110;
         this.f.b = main.a.i / 2 - 84;
         this.f.c = this.g.c;
      }

      short var5 = 184;
      if (184 >= main.a.i) {
         var5 = 152;
      }

      this.i = main.a.i / 2 - var5 / 2;
      this.j = 5;
      this.a.a = this.i + 10;
      this.a.b = this.j + 20;
      this.i = new cd(ab.aX, this, 2008, (Object)null);
      this.i.b = 260;
      this.i.c = main.a.j - 60;
      this.e = new cd("Thoát", this, 1003, (Object)null);
      this.e.b = 260;
      this.e.c = main.a.j - 30;
      if (main.a.i < 250) {
         this.i.b = main.a.i / 2 - 80;
         this.e.b = main.a.i / 2 + 10;
         var7 = this.e;
         cd var4 = this.i;
         int var6 = main.a.j - 25;
         var4.c = var6;
         var7.c = var6;
      }

      super.b = this.i;
      super.a = this.e;
   }

   public final void a() {
      System.out.println("Res switch");
      aw.a();
      this.a.a = true;
      this.b.a = false;
      if (main.a.e) {
         this.a.a = false;
      }

      super.a();
   }

   public final void a(int var1) {
      if (this.a.a) {
         this.a.a(var1);
      } else if (this.b.a) {
         this.b.a(var1);
      }

      super.a(var1);
   }

   public final void a(int var1, Object var2) {
      boolean var3 = false;
      StringBuffer var5 = null;
      Object var6 = null;
      switch(var1) {
      case 1000:
         try {
            GameMidlet.e.platformRequest((String)var2);
         } catch (Exception var41) {
            var41.printStackTrace();
         }

         main.a.f();
         break;
      case 1001:
         main.a.f();
         this.b = false;
         break;
      case 1003:
         main.a.a.a();
         at.a().b();
         break;
      case 1004:
         au.onCancelChat();
         main.a.a.a();
         break;
      case 1005:
         try {
            GameMidlet.e.platformRequest("http://ngocrongonline.com");
         } catch (Exception var40) {
            var40.printStackTrace();
         }
         break;
      case 2001:
         if (this.a) {
            this.a = false;
         } else {
            this.a = true;
         }
         break;
      case 2002:
         if (this.a.a().equals("")) {
            main.a.checkInfo(ab.M);
         } else {
            this.a.a().toCharArray();
            if (this.b.a().equals("")) {
               main.a.checkInfo(ab.N);
            } else if (this.a.a().length() < 5) {
               main.a.checkInfo(ab.O);
            } else {
               boolean var48;
               String var51;
               label633: {
                  if (ab.a == 2) {
                     if (this.a.a().indexOf("@") == -1 || this.a.a().indexOf(".") == -1) {
                        var51 = ab.Q;
                        var48 = var3;
                        break label633;
                     }
                  } else {
                     label632: {
                        label576: {
                           try {
                              Long.parseLong(this.a.a());
                              if (this.a.a().length() < 8 || this.a.a().length() > 12 || !this.a.a().startsWith("0") && !this.a.a().startsWith("84")) {
                                 var51 = ab.P;
                                 break label576;
                              }
                           } catch (Exception var42) {
                              if (this.a.a().indexOf("@") != -1 && this.a.a().indexOf(".") != -1) {
                                 break label632;
                              }

                              var51 = ab.Q;
                              var48 = var3;
                              break label633;
                           }

                           var51 = null;
                        }

                        var48 = true;
                        break label633;
                     }
                  }

                  var51 = null;
                  var48 = var3;
               }

               if (var51 != null) {
                  main.a.checkInfo(var51);
               } else {
                  ai var52 = main.a.a;
                  var5 = new StringBuffer(String.valueOf(ab.Y));
                  if (var48) {
                     var51 = ab.Z + ": ";
                  } else {
                     var51 = ab.aa + ": ";
                  }

                  var52.a(var5.append(var51).append(this.a.a()).append("\n").append(ab.U).append(": ").append(this.b.a()).toString(), new cd(ab.aZ, this, 4000, (Object)null), (cd)null, new cd(ab.aT, main.a.a, 8882, (Object)null));
               }

               main.a.a = main.a.a;
            }
         }
         break;
      case 2003:
         MyVector var50 = new MyVector("vMenu Login");
         var50.addElement(new cd(ab.R, this, 2004, (Object)null));
         var50.addElement(new cd(ab.S, this, 1004, (Object)null));
         var50.addElement(new cd(ab.T, this, 1003, (Object)null));
         var50.addElement(new cd(ab.az, this, 1005, (Object)null));
         if (aa.a("lowGraphic") == 1) {
            var50.addElement(new cd(ab.bx, this, 10041, (Object)null));
         } else {
            var50.addElement(new cd(ab.by, this, 10042, (Object)null));
         }

         var50.addElement(new cd(ab.aU, main.a.a, 8885, (Object)null));
         main.a.a.b(var50);
         break;
      case 2004:
         main.a.f();
         main.a.checkInfo(ab.eY);
         this.b = true;
         this.b.a = false;
         this.a.a = true;
         break;
      case 2008:
         if (!this.b.a().equals("") && !this.c.a().equals("") && !this.d.a().equals("") && !this.e.a().equals("") && !this.f.a().equals("") && !this.g.a().equals("") && !this.h.a().equals("") && !this.i.a().equals("") && !this.a.a().equals("")) {
            main.a.checkInfo(ab.ar);
            av var14 = av.a();
            Object var4 = this.b.a();
            String var12 = this.c.a();
            String var15 = this.d.a();
            String var8 = this.e.a();
            String var13 = this.f.a();
            String var9 = this.g.a();
            String var11 = this.h.a();
            String var10 = this.i.a();
            String var7 = this.a.a();

            label612: {
               Message var49;
               label631: {
                  label610: {
                     label609: {
                        try {
                           var49 = new Message((byte)42);
                           break label609;
                        } catch (Exception var46) {
                           var4 = var46;
                        } finally {
                           ;
                        }

                        var49 = (Message)var6;
                        break label610;
                     }

                     try {
                        var49.a().writeUTF((String)var4);
                        var49.a().writeUTF(var12);
                        var49.a().writeUTF(var15);
                        var49.a().writeUTF(var8);
                        var49.a().writeUTF(var13);
                        var49.a().writeUTF(var9);
                        var49.a().writeUTF(var11);
                        var49.a().writeUTF(var10);
                        var49.a().writeUTF(var7);
                        var14.a.a(var49);
                        break label612;
                     } catch (Exception var44) {
                        var4 = var44;
                     } finally {
                        break label631;
                     }
                  }

                  try {
                     ((Throwable)var4).printStackTrace();
                  } finally {
                     break label631;
                  }

                  break;
               }

               var49.a();
               throw var4;
            }

         } else {
            main.a.checkInfo("Vui lòng điền đầy đủ thông tin");
         }
         break;
      case 10021:
         this.b = false;
         this.b.a = false;
         this.a.a = true;
         super.a = this.g;
      }

   }

   public final void a(dm var1) {
      main.a.b(var1);
      if (pasta.k.a == null && pasta.k.b == null) {
         if (main.a.a == null) {
            this.i = 5;
            if (main.a.i < 260) {
               this.i = (main.a.i - 240) / 2;
            }

            this.j = (main.a.j - 233) / 2;
            ar.a(var1, this.i, this.j, 240, 233, -1, true);
            this.i.a = this.i + 10;
            this.i.b = this.j + 15;
            this.a.a = this.i.a;
            this.a.b = this.i.b + 30;
            this.b.a = this.i + 10;
            this.b.b = this.a.b + 30;
            this.c.a = this.b.a + 75;
            this.c.b = this.b.b;
            this.d.a = this.c.a + 75;
            this.d.b = this.c.b;
            this.e.a = this.a.a;
            this.e.b = this.b.b + 30;
            this.f.a = this.a.a;
            this.f.b = this.e.b + 30;
            this.g.a = this.a.a;
            this.g.b = this.f.b + 30;
            this.h.a = this.a.a;
            this.h.b = this.g.b + 30;
            this.a.a(var1);
            this.b.a(var1);
            this.c.a(var1);
            this.d.a(var1);
            this.e.a(var1);
            this.f.a(var1);
            this.g.a(var1);
            this.h.a(var1);
            this.i.a(var1);
            if (main.a.i < 176) {
               cg.g.a(var1, ab.ab + ":", this.a.a - 35, this.a.b + 7, 0);
               cg.g.a(var1, ab.ac + ":", this.b.a - 35, this.b.b + 7, 0);
               cg.g.a(var1, ab.aA + ": " + null, main.a.i / 2, this.b.b + 32, 2);
            }
         }

         var1.a(main.a.m);
         var1.e(main.a.i - 40, 4, 36, 11);
         cg.o.a(var1, "1.9.8", main.a.i - 22, 4, 2);
         main.a.a(var1);
         if (main.a.a == null) {
            if (main.a.i > 250) {
               cg.c.a(var1, "Dưới 18 tuổi", 260, 10, 0, cg.f);
               cg.c.a(var1, "chỉ có thể chơi", 260, 25, 0, cg.f);
               cg.c.a(var1, "180p 1 ngày", 260, 40, 0, cg.f);
            } else {
               cg.c.a(var1, "Dưới 18 tuổi chỉ có thể chơi", main.a.i / 2, 5, 2, cg.f);
               cg.c.a(var1, "180p 1 ngày", main.a.i / 2, 15, 2, cg.f);
            }
         }

         super.a(var1);
      }

   }

   public final void b() {
      this.a.c();
      this.b.c();
      this.c.c();
      this.d.c();
      this.e.c();
      this.f.c();
      this.h.c();
      this.i.c();
      this.g.c();

      int var1;
      for(var1 = 0; var1 < cb.b.size(); ++var1) {
         ((cb)cb.b.elementAt(var1)).a();
      }

      var1 = GameSrc.k + 1;
      GameSrc.k = var1;
      if (var1 > main.a.i * 3 + 100) {
         GameSrc.k = 100;
      }

      if (pasta.k.a == null) {
         if (this.c != this.b) {
            this.b += this.c - this.b >> 1;
         }

         if (this.m >= 0) {
            this.n += this.o * this.m;
            this.m += this.o * this.l;
            if (this.m <= 0) {
               this.o = -this.o;
            }

            if (this.n > 0) {
               this.o = -this.o;
               this.m -= this.l * 2;
            }
         }

         if (this.k >= 0 && main.a.g % 100 == 0) {
            ++this.k;
            if (this.k >= ab.i.length) {
               this.k = 0;
            }

            if (main.a.a == main.a.a && main.a.a.a) {
               main.a.a.a(ab.i[this.k]);
            }
         }

         if (main.a.e) {
            if (this.b) {
               super.b = this.f;
               super.a = this.h;
            } else {
               super.b = this.i;
               super.a = this.e;
            }
         } else if (this.b) {
            super.b = this.f;
            super.a = this.h;
         } else {
            super.b = this.i;
            super.a = this.e;
         }
      }

   }

   public final void c() {
      if (!main.a.e) {
         if (this.a.a) {
            super.c = this.a.a;
         } else {
            super.c = this.b.a;
         }
      }

      if (main.a.a[2]) {
         --this.a;
         if (this.a < 0) {
            this.a = 1;
         }
      } else if (main.a.a[8]) {
         ++this.a;
         if (this.a > 1) {
            this.a = 1;
         }
      }

      if (main.a.a[2] || main.a.a[8]) {
         main.a.onCancelChat();
         if (this.a == 1) {
            this.a.a = false;
            this.b.a = true;
         } else if (this.a == 0) {
            this.a.a = true;
            this.b.a = false;
         } else {
            this.a.a = false;
            this.b.a = false;
         }
      }

      if (main.a.e) {
         if (this.b) {
            super.b = this.f;
            super.a = this.h;
         } else {
            super.b = this.i;
            super.a = this.e;
         }
      } else if (this.b) {
         super.b = this.f;
         super.a = this.h;
      } else {
         super.b = this.i;
         super.a = this.e;
      }

      if (main.a.j) {
         if (main.a.a(this.a.a, this.a.b, this.a.c, this.a.d)) {
            this.a = 0;
         } else if (main.a.a(this.b.a, this.b.b, this.b.c, this.b.d)) {
            this.a = 1;
         }
      }

      super.c();
      main.a.onCancelChat();
   }
}
