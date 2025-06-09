package pasta;

import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class bv extends ag implements ah {
   private static int a;
   private static bf a;
   public static bv a;
   public static boolean a = false;
   private static int[] a = new int[]{2, 13, 8};
   private static int[][] a = new int[][]{{64, 30, 31}, {9, 29, 32}, {6, 27, 28}};
   private static int b;
   private static int[] b = new int[]{1, 12, 7};
   private static int c;
   private int[] c;
   private int d;
   private int i;
   private int j;
   private int k;
   private int l;

   public bv() {
      int[] var8 = new int[]{0, 4, 8};
      this.c = var8;
      this.d = 168;
      this.i = 350;
      this.j = 45;

      label145: {
         Exception var10000;
         Exception var35;
         label144: {
            boolean var10001;
            label149: {
               byte[] var10;
               try {
                  if (main.a.b) {
                     break label149;
                  }

                  var10 = new byte[3];
               } catch (Exception var17) {
                  var10000 = var17;
                  var10001 = false;
                  break label144;
               }

               var10[0] = 39;
               var10[1] = 40;
               var10[2] = 41;

               boolean var7;
               try {
                  var7 = main.a.b;
               } catch (Exception var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label144;
               }

               if (!var7) {
                  int var1 = 0;

                  label142:
                  while(true) {
                     label151: {
                        int var2;
                        try {
                           var2 = var10.length;
                        } catch (Exception var26) {
                           var10000 = var26;
                           var10001 = false;
                           break label151;
                        }

                        if (var1 >= var2) {
                           break;
                        }

                        short var3;
                        MyVector var9;
                        DataInputStream var11;
                        StringBuffer var27;
                        MyVector[] var29;
                        try {
                           var27 = new StringBuffer("/mymap/mapTable");
                           InputStream var28 = pasta.e.a(var27.append(var10[var1]).toString());
                           var11 = new DataInputStream(var28);
                           var3 = var11.readShort();
                           var29 = cj.a;
                           var9 = new MyVector("MapTemplate.vCurrItem[a] ");
                        } catch (Exception var25) {
                           var10000 = var25;
                           var10001 = false;
                           break label151;
                        }

                        var29[var1] = var9;
                        var2 = 0;

                        while(true) {
                           if (var2 >= var3) {
                              ++var1;
                              continue label142;
                           }

                           label153: {
                              by var12;
                              try {
                                 short var5 = var11.readShort();
                                 short var6 = var11.readShort();
                                 short var4 = var11.readShort();
                                 if (TileMap.a(var5) == null) {
                                    break label153;
                                 }

                                 by var30 = TileMap.a(var5);
                                 var12 = new by();
                                 var12.a = var5;
                                 var12.a = var30.a;
                                 var12.e = var30.e;
                                 var12.f = var30.f;
                                 var12.c = TileMap.a * var6;
                                 var12.d = TileMap.a * var4;
                                 var12.a = var30.a;
                                 cj.a[var1].addElement(var12);
                                 eh var31 = by.a;
                                 var27 = new StringBuffer(String.valueOf(var12.a));
                                 var7 = var31.containsKey(var27.toString());
                              } catch (Exception var24) {
                                 var10000 = var24;
                                 var10001 = false;
                                 break;
                              }

                              if (!var7) {
                                 eh var13;
                                 StringBuffer var33;
                                 Image var34;
                                 try {
                                    var27 = new StringBuffer("/mapBackGround/");
                                    var34 = dz.b(var27.append(var12.a).append(".png").toString());
                                    var13 = by.a;
                                    var33 = new StringBuffer(String.valueOf(var12.a));
                                    var13.put(var33.toString(), var34);
                                 } catch (Exception var23) {
                                    Image var32;
                                    try {
                                       var27 = new StringBuffer("/mapBackGround/");
                                       var32 = dz.c(var27.append(var12.a).append(".png").toString());
                                    } catch (Exception var22) {
                                       var10000 = var22;
                                       var10001 = false;
                                       break;
                                    }

                                    var34 = var32;
                                    if (var32 == null) {
                                       try {
                                          var34 = Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
                                          av.a().c(var12.a);
                                       } catch (Exception var21) {
                                          var10000 = var21;
                                          var10001 = false;
                                          break;
                                       }
                                    }

                                    try {
                                       var13 = by.a;
                                       var33 = new StringBuffer(String.valueOf(var12.a));
                                       var13.put(var33.toString(), var34);
                                    } catch (Exception var20) {
                                       var10000 = var20;
                                       var10001 = false;
                                       break;
                                    }
                                 }

                                 try {
                                    var9 = by.b;
                                    var27 = new StringBuffer(String.valueOf(var12.a));
                                    var9.addElement(var27.toString());
                                 } catch (Exception var19) {
                                    var10000 = var19;
                                    var10001 = false;
                                    break;
                                 }
                              }

                              try {
                                 var27 = new StringBuffer(String.valueOf(var12.a));
                                 if (!by.a(var27.toString())) {
                                    var9 = by.a;
                                    var27 = new StringBuffer(String.valueOf(var12.a));
                                    var9.addElement(var27.toString());
                                 }
                              } catch (Exception var18) {
                                 var10000 = var18;
                                 var10001 = false;
                                 break;
                              }
                           }

                           ++var2;
                        }
                     }

                     var35 = var10000;

                     try {
                        var35.printStackTrace();
                        break;
                     } catch (Exception var15) {
                        var10000 = var15;
                        var10001 = false;
                        break label144;
                     }
                  }
               }
            }

            try {
               a(new byte[]{39, 40, 41});
               break label145;
            } catch (Exception var14) {
               var10000 = var14;
               var10001 = false;
            }
         }

         var35 = var10000;
         var35.printStackTrace();
      }

      if (main.a.i <= 200) {
         GameSrc.d(128, 100);
         GameSrc.R = (main.a.i - 128) / 2;
         GameSrc.Q = 10;
         this.i += 15;
         this.j -= 15;
      }

      a = 1;
      bf var36 = new bf();
      a = var36;
      var36.c = main.a.a.a.c;
      if (main.a.i < 200) {
         a.c = 60;
      }

      a.d = 26;
      if (main.a.i < 200) {
         a.a = GameSrc.R + 45;
         a.b = GameSrc.Q + 12;
      } else {
         a.a = main.a.i / 2 - a.c / 2;
         a.b = 35;
      }

      if (!main.a.e) {
         a.a = true;
      }

      a.goToMap(0);
      a.b = ab.am;
      if (a.a().equals("@")) {
         a.checkInfo(main.a.a.a.a().substring(0, main.a.a.a.a().indexOf("@")));
      }

      a = 1;
      b = 0;
      super.b = new cd(ab.bd, this, 8000, (Object)null);
      super.a = new cd(ab.be, this, 8001, (Object)null);
      if (!main.a.e) {
         super.c = a.a;
      }

   }

   public static bv a() {
      if (a == null) {
         a = new bv();
      }

      return a;
   }

   private static void a(byte[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         DataInputStream var3 = new DataInputStream(pasta.e.a("/mymap/" + var0[var1]));
         cj.a[var1] = (char)var3.read();
         cj.b[var1] = (char)var3.read();
         cj.a[var1] = new int[var3.available()];

         for(int var2 = 0; var2 < cj.a[var1] * cj.b[var1]; ++var2) {
            cj.a[var1][var2] = var3.read();
         }

         cj.b[var1] = new int[cj.a[var1].length];
      }

   }

   private void onCancelChat() {
      TileMap.a = new int[cj.a[a].length];

      for(int var1 = 0; var1 < cj.a[a].length; ++var1) {
         TileMap.a[var1] = cj.a[a][var1];
      }

      TileMap.b = cj.b[a];
      TileMap.d = cj.d[a];
      TileMap.c = cj.c[a];
      TileMap.e = cj.c[a];
      TileMap.a = cj.a[a];
      TileMap.b = cj.b[a];
      TileMap.e = this.c[a] + 1;
      TileMap.b();
      main.a.a(this.c[a]);
      GameSrc.transMap(this.d, this.i);
   }

   public final void a() {
      ek.a = false;
      main.a.a.a = false;
      main.a.f();
      super.a();
      a = cq.b(0, 3);
      b = cq.b(0, 3);
      this.onCancelChat();
      Char.w = false;
      if (a != null) {
         a.b = ab.am;
      }

   }

   public final void a(int var1) {
      a.a(var1);
   }

   public final void a(int var1, Object var2) {
      switch(var1) {
      case 8000:
         if (a.a().equals("")) {
            main.a.checkInfo(ab.ai);
         } else if (a.a().length() < 5) {
            main.a.checkInfo(ab.aj);
         } else if (a.a().length() > 15) {
            main.a.checkInfo(ab.ak);
         } else {
            pasta.a.e();
            av var4 = av.a();
            String var5 = a.a();
            int var3 = a;
            var1 = a[a][b];
            Message var8 = new Message((byte)-28);

            try {
               var8.a().writeByte(2);
               var8.a().writeUTF(var5);
               var8.a().writeByte(var3);
               var8.a().writeByte(var1);
               StringBuffer var6 = new StringBuffer("name= ");
               var6.append(var5).append(" gender= ").append(var3).append(" hair=").append(var1);
            } catch (Exception var7) {
               var7.printStackTrace();
            }

            var4.a.a(var8);
         }
         break;
      case 8001:
         if (main.a.a.g) {
            main.a.a(ab.eX, new cd(ab.aS, this, 10019, (Object)null), new cd(ab.aT, this, 10020, (Object)null));
         } else {
            at.a().b();
            main.a.a.a();
         }
         break;
      case 10019:
         at.a().b();
         main.a.f();
         main.a.a.a();
         break;
      case 10020:
         main.a.f();
      }

   }

   public final void a(dm var1) {
      if (!Char.w) {
         main.a.b(var1);
         var1.a(-GameSrc.k, -GameSrc.l);
         if (!main.a.b) {
            for(int var2 = 0; var2 < cj.a[a].size(); ++var2) {
               by var7 = (by)cj.a[a].elementAt(var2);
               if (var7.a != -1 && var7.a == 1) {
                  var7.a(var1);
               }
            }
         }

         TileMap.a(var1);
         byte var11;
         if (main.a.i == 128) {
            var11 = 20;
         } else {
            var11 = 30;
         }

         int var3 = a[a][b];
         int var4 = a[a];
         int var5 = b[a];
         var1.a(TileMap.b, this.d, this.i + this.j, 3);
         aa var10 = GameSrc.a[var3];
         aa var16 = GameSrc.a[var4];
         aa var9 = GameSrc.a[var5];
         short var14 = var10.a[Char.a[this.l][0][0]].a;
         var4 = this.d;
         var3 = Char.a[this.l][0][1];
         ao.a(var1, var14, var10.a[Char.a[this.l][0][0]].a + var4 + var3, this.i - Char.a[this.l][0][2] + var10.a[Char.a[this.l][0][0]].b + this.j, 0, 0);
         short var12 = var16.a[Char.a[this.l][1][0]].a;
         var4 = this.d;
         var5 = Char.a[this.l][1][1];
         ao.a(var1, var12, var16.a[Char.a[this.l][1][0]].a + var4 + var5, this.i - Char.a[this.l][1][2] + var16.a[Char.a[this.l][1][0]].b + this.j, 0, 0);
         var12 = var9.a[Char.a[this.l][2][0]].a;
         var4 = this.d;
         var5 = Char.a[this.l][2][1];
         ao.a(var1, var12, var9.a[Char.a[this.l][2][0]].a + var4 + var5, this.i - Char.a[this.l][2][2] + var9.a[Char.a[this.l][2][0]].b + this.j, 0, 0);
         if (!main.a.b) {
            for(var3 = 0; var3 < cj.a[a].size(); ++var3) {
               by var8 = (by)cj.a[a].elementAt(var3);
               if (var8.a != -1 && var8.a == 3) {
                  var8.a(var1);
               }
            }
         }

         var1.a(-var1.a(), -var1.b());
         int var6;
         Image var18;
         if (main.a.i < 200) {
            bw.b(GameSrc.R, GameSrc.Q, GameSrc.S, GameSrc.T, var1);
            var14 = var10.a[Char.a[0][0][0]].a;
            var4 = main.a.i / 2;
            var3 = Char.a[0][0][1];
            ao.a(var1, var14, var10.a[Char.a[0][0][0]].a + var4 + var3, GameSrc.Q + 30 + var11 * 3 - Char.a[0][0][2] + var10.a[Char.a[0][0][0]].b + this.j, 0, 0);
            var12 = var16.a[Char.a[0][1][0]].a;
            var4 = main.a.i / 2;
            var5 = Char.a[0][1][1];
            ao.a(var1, var12, var16.a[Char.a[0][1][0]].a + var4 + var5, GameSrc.Q + 30 + var11 * 3 - Char.a[0][1][2] + var16.a[Char.a[0][1][0]].b + this.j, 0, 0);
            var14 = var9.a[Char.a[0][2][0]].a;
            var3 = main.a.i / 2;
            var4 = Char.a[0][2][1];
            ao.a(var1, var14, var9.a[Char.a[0][2][0]].a + var3 + var4, GameSrc.Q + 30 + var11 * 3 - Char.a[0][2][2] + var9.a[Char.a[0][2][0]].b + this.j, 0, 0);

            for(var3 = 0; var3 < ab.b.length; ++var3) {
               if (c == var3) {
                  var18 = GameSrc.z;
                  var5 = GameSrc.R;
                  byte var17;
                  if (main.a.g % 7 > 3) {
                     var17 = 1;
                  } else {
                     var17 = 0;
                  }

                  var1.a(var18, 0, 0, 13, 16, 2, var5 + 10 + var17, GameSrc.Q + 35 + var3 * var11, bk.f);
                  var18 = GameSrc.z;
                  var5 = GameSrc.R;
                  var6 = GameSrc.S;
                  if (main.a.g % 7 > 3) {
                     var17 = 1;
                  } else {
                     var17 = 0;
                  }

                  var1.a(var18, 0, 0, 13, 16, 0, var5 + var6 - 10 - var17, GameSrc.Q + 35 + var3 * var11, bk.f);
               }

               cg.f.a(var1, ab.b[var3], GameSrc.R + 20, GameSrc.Q + 30 + var3 * var11, 0);
            }

            cg.f.a(var1, ab.c[a], GameSrc.R + 70, GameSrc.Q + 30 + var11, 0);
            cg.f.a(var1, ab.e[a][b], GameSrc.R + 55, GameSrc.Q + 30 + (var11 << 1), 0);
         } else {
            byte var13;
            if (main.a.i > main.a.j) {
               var11 = 100;
               var13 = 45;
            } else {
               var11 = 110;
               var13 = 60;
            }

            byte var15;
            for(var4 = 0; var4 < 3; ++var4) {
               if (var4 != a) {
                  var1.a(GameSrc.k, main.a.i / 2 - 78 + var4 * 78, var11, 3);
               } else {
                  if (c == 1) {
                     var18 = GameSrc.z;
                     var6 = main.a.i / 2;
                     if (main.a.g % 7 > 3) {
                        var15 = 1;
                     } else {
                        var15 = 0;
                     }

                     var1.a(var18, 0, 0, 13, 16, 4, var6 - 78 + var4 * 78, var11 - 20 + var15, bk.f);
                  }

                  var1.a(GameSrc.l, main.a.i / 2 - 78 + var4 * 78, var11, 3);
               }

               cg.f.a(var1, ab.c[var4], main.a.i / 2 - 78 + var4 * 78, var11 - 5, 2);
            }

            for(var4 = 0; var4 < 3; ++var4) {
               if (var4 != b) {
                  var1.a(GameSrc.k, main.a.i / 2 - 78 + var4 * 78, var11 + var13, 3);
               } else {
                  if (c == 2) {
                     var18 = GameSrc.z;
                     var6 = main.a.i / 2;
                     if (main.a.g % 7 > 3) {
                        var15 = 1;
                     } else {
                        var15 = 0;
                     }

                     var1.a(var18, 0, 0, 13, 16, 4, var6 - 78 + var4 * 78, var11 + var13 - 20 + var15, bk.f);
                  }

                  var1.a(GameSrc.l, main.a.i / 2 - 78 + var4 * 78, var11 + var13, 3);
               }

               cg.f.a(var1, ab.e[a][var4], main.a.i / 2 - 78 + var4 * 78, var11 + var13 - 5, 2);
            }

            if (c == 0) {
               var18 = GameSrc.z;
               var3 = main.a.i / 2;
               if (main.a.g % 7 > 3) {
                  var11 = 1;
               } else {
                  var11 = 0;
               }

               var1.a(var18, 0, 0, 13, 16, 4, var3, var11 + 20, bk.f);
            }
         }

         a.a(var1);
         var1.f(0, 0, main.a.i, main.a.j);
         cg.c.a(var1, ab.aA + " " + ek.a, 5, 5, 0, cg.f);
         super.a(var1);
      }

   }

   public final void b() {
      ++this.k;
      if (this.k > 30) {
         this.k = 0;
      }

      if (this.k % 15 < 5) {
         this.l = 0;
      } else {
         this.l = 1;
      }

      a.c();
      if (c != 0) {
         a.a = false;
      }

   }

   public final void c() {
      int var1;
      if (main.a.a[2]) {
         var1 = c - 1;
         c = var1;
         if (var1 < 0) {
            c = ab.b.length - 1;
         }
      }

      if (main.a.a[8]) {
         var1 = c + 1;
         c = var1;
         if (var1 >= ab.b.length) {
            c = 0;
         }
      }

      if (c == 0) {
         if (!main.a.e) {
            super.c = a.a;
         }

         a.c();
      }

      if (c == 1) {
         if (main.a.a[4]) {
            var1 = a - 1;
            a = var1;
            if (var1 < 0) {
               a = ab.c.length - 1;
            }

            this.onCancelChat();
         }

         if (main.a.a[6]) {
            var1 = a + 1;
            a = var1;
            if (var1 > ab.c.length - 1) {
               a = 0;
            }

            this.onCancelChat();
         }

         super.c = null;
      }

      if (c == 2) {
         if (main.a.a[4]) {
            var1 = b - 1;
            b = var1;
            if (var1 < 0) {
               b = ab.e[0].length - 1;
            }
         }

         if (main.a.a[6]) {
            var1 = b + 1;
            b = var1;
            if (var1 > ab.e[0].length - 1) {
               b = 0;
            }
         }

         super.c = null;
      }

      if (main.a.j) {
         byte var2 = 110;
         byte var5 = 60;
         if (main.a.i > main.a.j) {
            var2 = 100;
            var5 = 40;
         }

         if (main.a.a(main.a.i / 2 - 117, 15, 234, 80)) {
            c = 0;
            a.a = true;
         }

         if (main.a.a(main.a.i / 2 - 117, var2 - 30, 234, var5 + 5)) {
            c = 1;
            int var3 = a;
            int var4 = (main.a.a - (main.a.i / 2 - 117)) / 78;
            a = var4;
            if (var4 < 0) {
               a = 0;
            }

            if (a > ab.c.length - 1) {
               a = ab.c.length - 1;
            }

            if (var3 != a) {
               this.onCancelChat();
            }
         }

         if (main.a.a(main.a.i / 2 - 117, var2 - 30 + var5 + 5, 234, 65)) {
            c = 2;
            int var6 = b;
            var1 = (main.a.a - (main.a.i / 2 - 117)) / 78;
            b = var1;
            if (var1 < 0) {
               b = 0;
            }

            if (b > ab.e[0].length - 1) {
               b = ab.e[0].length - 1;
            }

            if (var6 != c) {
               this.onCancelChat();
            }
         }
      }

      super.c();
      main.a.e();
      main.a.onCancelChat();
   }
}
