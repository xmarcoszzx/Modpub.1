package pasta;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class j implements aj {
   public static eh a = new eh("frame new boss");
   private static j a;
   public static boolean a;
   public static boolean b;
   private float a;
   private Message a;

   private static Image a(byte[] var0) {
      Image var2;
      try {
         var2 = Image.createImage(var0, 0, var0.length);
      } catch (Exception var1) {
         var2 = null;
      }

      return var2;
   }

   public static j a() {
      if (a == null) {
         a = new j();
      }

      return a;
   }

   private static void a(byte var0) {
      byte var2 = -1;
      (new StringBuffer("is loading map = ")).append(Char.w);
      GameSrc.a().z = 0;
      GameSrc.n = false;
      bv.a = null;
      GameSrc.a.b = false;
      GameSrc.b.b = false;
      GameSrc.u = 0;
      main.a.a.a = false;
      aw.a();
      if (!GameSrc.b && !bv.a) {
         GameSrc.a();
         GameSrc.e();
      }

      int var1;
      if (var0 == 1) {
         var1 = Char.myCharz().b;
      } else {
         var1 = -1;
      }

      if (var0 != 0) {
         var2 = 0;
      }

      GameSrc.transMap(var1, var2);
      TileMap.b();
      TileMap.a(TileMap.e);
      Char.myCharz().d = 0;
      Char.myCharz().h = 4;
      Char.myCharz().a = null;
      Char.myCharz().a = null;
      Char.myCharz().a = null;
      Char.myCharz().a = null;
      Char.myCharz().a = null;
      Char.myCharz().a = null;
      Char.myCharz().c(false);
      Char.myCharz().b = null;
      main.a.j();
      if (Char.myCharz().c >= TileMap.d - 100) {
         Char.myCharz().p = true;
         Char var6 = Char.myCharz();
         var6.b += cq.f(cq.b(0, 80));
         av.a().g();
      }

      GameSrc.a().l();
      main.a.a(TileMap.i);
      Char.v = false;

      for(var1 = 0; var1 < Char.myCharz().c.size(); ++var1) {
         Char.myCharz().c.elementAt(var1);
      }

      main.a.e();
      main.a.onCancelChat();
      GameSrc.a().O = Char.myCharz().t;
      GameSrc.a().M = Char.myCharz().s;
      Char.u = false;
      GameSrc.a().a();
      if (Char.myCharz().c <= 10 && var0 != 0 && var0 != 2) {
         int var4 = Char.myCharz().b;
         int var7 = Char.myCharz().c;
         int var3 = Char.myCharz().V;
         int var5 = Char.myCharz().i;
         if (var0 == 1) {
            var1 = Char.myCharz().k;
         } else {
            var1 = var0;
         }

         bn.a(new bn(var4, var7, var3, var5, 1, true, var1));
         Char.myCharz().b = true;
      }

      if (var0 == 2) {
         Char.myCharz().f();
      }

      if (GameSrc.a().i) {
         if (TileMap.mapId == GameSrc.a().E && TileMap.h == GameSrc.a().F) {
            GameSrc.a().c(GameSrc.a().C, GameSrc.a().D);
         }

         if (dm.a > 1) {
            GameSrc.a().q();
         }
      }

      pasta.a.g();
      pasta.a.a(TileMap.a, ab.bC + " " + TileMap.h, 30);
      main.a.f();
      main.a.d = false;
      e.c();
      e.b();
   }

   private static void a(DataInputStream var0) {
      GameSrc.d = var0.readByte();
      cn.a.clear();
      GameSrc.a().a = new cl[var0.readUnsignedByte()];

      int var4;
      for(var4 = 0; var4 < GameSrc.a().a.length; ++var4) {
         GameSrc.a().a[var4] = new cl();
         GameSrc.a().a[var4].a = var4;
         GameSrc.a().a[var4].a = var0.readUTF();
         GameSrc.a();
         var0.readByte();
      }

      short var5 = var0.readShort();

      for(var4 = 0; var4 < var5; ++var4) {
         short var3 = (short)var4;
         byte var1 = var0.readByte();
         byte var2 = var0.readByte();
         String var6 = var0.readUTF();
         String var7 = var0.readUTF();
         var0.readByte();
         cn.a(new ItemTemplate(var3, var1, var2, var6, var7, var0.readInt(), var0.readShort(), var0.readShort(), var0.readBoolean()));
      }

   }

   private static void a(Message var0, int var1) {
      boolean var4 = false;
      boolean var3 = false;

      Exception var10000;
      label149: {
         byte var2;
         bd var7;
         boolean var10001;
         try {
            var7 = new bd();
            var2 = var0.a().readByte();
            var7.b = var2;
            var7.a = var0.a().readInt();
            var7.c = var0.a().readInt();
            var7.a = var0.a().readUTF();
            var7.b = var0.a().readByte();
            var7.a = (long)(var0.a().readInt() + 1000000000);
            GameSrc.f = false;
         } catch (Exception var21) {
            var10000 = var21;
            var10001 = false;
            break label149;
         }

         if (var2 == 0) {
            label151: {
               String var5;
               try {
                  var5 = var0.a().readUTF();
                  StringBuffer var6 = new StringBuffer("str chat ");
                  var6.append(var5);
                  GameSrc.f = true;
                  if (cg.k.a(var5) > Panel.n - 60) {
                     var7.a = cg.k.a(var5, Panel.n - 10);
                     break label151;
                  }
               } catch (Exception var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label149;
               }

               try {
                  var7.a = new String[1];
                  var7.a[0] = var5;
               } catch (Exception var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label149;
               }
            }

            try {
               var7.a = var0.a().readByte();
            } catch (Exception var14) {
               var10000 = var14;
               var10001 = false;
               break label149;
            }

            var4 = var3;
         } else if (var2 == 1) {
            label152: {
               try {
                  var7.d = var0.a().readByte();
                  var7.e = var0.a().readByte();
               } catch (Exception var13) {
                  var10000 = var13;
                  var10001 = false;
                  break label149;
               }

               var3 = var4;

               label136: {
                  try {
                     if (var0.a().readByte() != 1) {
                        break label136;
                     }
                  } catch (Exception var20) {
                     var10000 = var20;
                     var10001 = false;
                     break label149;
                  }

                  var3 = true;
               }

               if (var3) {
                  try {
                     GameSrc.f = true;
                  } catch (Exception var12) {
                     var10000 = var12;
                     var10001 = false;
                     break label149;
                  }
               }

               label130: {
                  try {
                     if (var7.c == Char.myCharz().charID) {
                        break label130;
                     }

                     if (var7.d < var7.e) {
                        var7.b = new String[]{ab.bX};
                        break label130;
                     }
                  } catch (Exception var19) {
                     var10000 = var19;
                     var10001 = false;
                     break label149;
                  }

                  try {
                     var7.b = null;
                  } catch (Exception var11) {
                     var10000 = var11;
                     var10001 = false;
                     break label149;
                  }
               }

               var4 = var3;

               try {
                  if (main.a.a.a == null) {
                     break label152;
                  }

                  main.a.a.transMap(var7.d, var7.e);
               } catch (Exception var18) {
                  var10000 = var18;
                  var10001 = false;
                  break label149;
               }

               var4 = var3;
            }
         } else {
            var4 = var3;
            if (var2 == 2) {
               label154: {
                  var4 = var3;

                  try {
                     if (Char.myCharz().b != 0) {
                        break label154;
                     }

                     GameSrc.f = true;
                     var7.b = new String[]{ab.ba, ab.bY};
                  } catch (Exception var17) {
                     var10000 = var17;
                     var10001 = false;
                     break label149;
                  }

                  var4 = var3;
               }
            }
         }

         label155: {
            try {
               if (main.a.a != GameSrc.a) {
                  GameSrc.f = false;
                  break label155;
               }
            } catch (Exception var10) {
               var10000 = var10;
               var10001 = false;
               break label149;
            }

            try {
               if (main.a.a.a && main.a.a.h == 0 && main.a.a.i == 3) {
                  GameSrc.f = false;
               }
            } catch (Exception var9) {
               var10000 = var9;
               var10001 = false;
               break label149;
            }
         }

         try {
            bd.a(var7, var1, var4);
            return;
         } catch (Exception var8) {
            var10000 = var8;
            var10001 = false;
         }
      }

      Exception var22 = var10000;
      var22.printStackTrace();
   }

   private static void a(al var0) {
      if (Char.myCharz().a == null) {
         Char.myCharz().a = var0;
      } else if (var0.a.equals(Char.myCharz().a.a)) {
         Char.myCharz().a = var0;
      }

      Char.myCharz().a.addElement(var0);
      if ((var0.a.c == 1 || var0.a.c == 4 || var0.a.c == 2 || var0.a.c == 3) && (var0.a.a == 0 || var0.a.a > 0 && var0.a > 0)) {
         if (var0.a.a == Char.myCharz().charID) {
            av.a().f(Char.myCharz().charID);
         }

         Char.myCharz().b.addElement(var0);
      }

   }

   private static boolean a(Char var0, Message var1) {
      boolean var4 = true;

      Exception var10000;
      label78: {
         StringBuffer var5;
         boolean var10001;
         try {
            var0.r = var1.a().readByte();
            var0.l = var1.a().readBoolean();
            var0.d = var1.a().readByte();
            var5 = new StringBuffer("ADD TYPE PK= ");
            var5.append(var0.d).append(" to player ").append(var0.charID);
            var0.a = GameSrc.a[var1.a().readByte()];
            var0.k = var1.a().readByte();
            var0.V = var1.a().readShort();
            var0.a = var1.a().readUTF();
            var0.t = var1.a();
            var0.am = var0.t;
            if (var0.t == 0) {
               var0.h = 14;
            }
         } catch (Exception var12) {
            var10000 = var12;
            var10001 = false;
            break label78;
         }

         try {
            var0.w = var1.a();
            if (var0.c >= TileMap.d - 100) {
               var0.p = true;
            }
         } catch (Exception var11) {
            var10000 = var11;
            var10001 = false;
            break label78;
         }

         try {
            var0.X = var1.a().readShort();
            var0.W = var1.a().readShort();
            var0.Y = var1.a().readUnsignedByte();
            var5 = new StringBuffer(" body= ");
            var5.append(var0.X).append(" leg= ").append(var0.W).append(" bag=").append(var0.Y).append("BAG ==").append(var0.Y).append("*********************************");
            var0.m = true;
            var1.a().readByte();
            if (var0.Z == -1) {
               var0.h();
            }
         } catch (Exception var10) {
            var10000 = var10;
            var10001 = false;
            break label78;
         }

         try {
            if (var0.X == -1) {
               var0.j();
            }
         } catch (Exception var9) {
            var10000 = var9;
            var10001 = false;
            break label78;
         }

         try {
            if (var0.W == -1) {
               var0.k();
            }
         } catch (Exception var8) {
            var10000 = var8;
            var10001 = false;
            break label78;
         }

         byte var3;
         try {
            var0.b = var1.a().readShort();
            var0.c = var1.a().readShort();
            var0.ac = var0.b;
            var0.ad = var0.c;
            var0.u = var1.a().readShort();
            var0.v = var1.a().readShort();
            var3 = var1.a().readByte();
         } catch (Exception var7) {
            var10000 = var7;
            var10001 = false;
            break label78;
         }

         int var2 = 0;

         while(true) {
            if (var2 >= var3) {
               return var4;
            }

            try {
               var1.a().readByte();
               var1.a().readInt();
               var1.a().readInt();
               cz var14 = new cz(var1.a().readShort());
               var0.c.addElement(var14);
            } catch (Exception var6) {
               var10000 = var6;
               var10001 = false;
               break;
            }

            ++var2;
         }
      }

      Exception var13 = var10000;
      var13.printStackTrace();
      var4 = false;
      return var4;
   }

   private static void b(DataInputStream var0) {
      GameSrc.c = var0.readByte();
      GameSrc.a().a = new dj[var0.readByte()];

      int var1;
      for(var1 = 0; var1 < GameSrc.a().a.length; ++var1) {
         GameSrc.a().a[var1] = new dj();
         GameSrc.a();
         GameSrc.a();
         var0.readUTF();
      }

      GameSrc.a = new bz[var0.readByte()];

      for(var1 = 0; var1 < GameSrc.a.length; ++var1) {
         GameSrc.a[var1] = new bz();
         GameSrc.a[var1].a = var1;
         var0.readUTF();
         GameSrc.a[var1].a = new ds[var0.readByte()];

         for(int var2 = 0; var2 < GameSrc.a[var1].a.length; ++var2) {
            GameSrc.a[var1].a[var2] = new ds();
            GameSrc.a[var1].a[var2].a = var0.readByte();
            GameSrc.a[var1].a[var2].a = var0.readUTF();
            GameSrc.a[var1].a[var2].a = var0.readByte();
            GameSrc.a[var1].a[var2].b = var0.readByte();
            GameSrc.a[var1].a[var2].c = var0.readByte();
            GameSrc.a[var1].a[var2].d = var0.readShort();
            GameSrc.a[var1].a[var2].b = var0.readUTF();
            short var3 = 130;
            if (main.a.i == 128 || main.a.j <= 208) {
               var3 = 100;
            }

            GameSrc.a[var1].a[var2].a = cg.m.a(var0.readUTF(), var3);
            GameSrc.a[var1].a[var2].a = new al[var0.readByte()];

            for(int var4 = 0; var4 < GameSrc.a[var1].a[var2].a.length; ++var4) {
               GameSrc.a[var1].a[var2].a[var4] = new al();
               GameSrc.a[var1].a[var2].a[var4].a = var0.readShort();
               GameSrc.a[var1].a[var2].a[var4].a = GameSrc.a[var1].a[var2];
               GameSrc.a[var1].a[var2].a[var4].a = var0.readByte();
               GameSrc.a[var1].a[var2].a[var4].a = var0.readLong();
               GameSrc.a[var1].a[var2].a[var4].e = var0.readShort();
               GameSrc.a[var1].a[var2].a[var4].b = var0.readInt();
               GameSrc.a[var1].a[var2].a[var4].c = var0.readShort();
               GameSrc.a[var1].a[var2].a[var4].d = var0.readShort();
               var0.readByte();
               GameSrc.a[var1].a[var2].a[var4].b = var0.readShort();
               var0.readShort();
               GameSrc.a[var1].a[var2].a[var4].a = var0.readUTF();
               ec.a(GameSrc.a[var1].a[var2].a[var4]);
            }
         }
      }

   }

   private static void b(Message var0) {
      Item var2;
      MyVector var3;
      try {
         int var1 = var0.a().readUnsignedByte();
         var2 = GameSrc.a.c[var1];
         var0.a().readInt();
         var0.a().readByte();
         var3 = new MyVector("item.options");
         var2.a = var3;
      } catch (Exception var6) {
         var6.printStackTrace();
         return;
      }

      while(true) {
         try {
            var3 = var2.a;
            db var4 = new db(var0.a().readUnsignedByte(), var0.a().readUnsignedShort());
            var3.addElement(var4);
         } catch (Exception var5) {
            return;
         }
      }
   }

   private static void b(Message var0, int var1) {
      boolean var10001;
      byte var4;
      int[][] var6;
      try {
         var4 = var0.a().readByte();
         var6 = new int[var4][];
      } catch (Exception var11) {
         var10001 = false;
         return;
      }

      int var2 = 0;

      while(true) {
         if (var2 >= var4) {
            try {
               eh var12 = a;
               StringBuffer var7 = new StringBuffer(String.valueOf(var1));
               var12.put(var7.toString(), var6);
            } catch (Exception var8) {
               var10001 = false;
            }
            break;
         }

         byte var5;
         try {
            var5 = var0.a().readByte();
            var6[var2] = new int[var5];
         } catch (Exception var10) {
            var10001 = false;
            break;
         }

         for(int var3 = 0; var3 < var5; ++var3) {
            try {
               var6[var2][var3] = var0.a().readByte();
            } catch (Exception var9) {
               var10001 = false;
               return;
            }
         }

         ++var2;
      }

   }

   private static void c(DataInputStream var0) {
      byte var4 = 0;
      GameSrc.b = var0.readByte();
      TileMap.a = new String[var0.readUnsignedByte()];

      for(int var1 = 0; var1 < TileMap.a.length; ++var1) {
         TileMap.a[var1] = var0.readUTF();
      }

      cm.all = new u[var0.readByte()];

      byte var5;
      for(var5 = 0; var5 < cm.all.length; ++var5) {
         cm.all[var5] = new u();
         cm.all[var5].a = var5;
         cm.all[var5].a = var0.readUTF();
         cm.all[var5].b = var0.readShort();
         cm.all[var5].c = var0.readShort();
         cm.all[var5].d = var0.readShort();
         cm.all[var5].a = new String[var0.readByte()][];

         for(int var2 = 0; var2 < cm.all[var5].a.length; ++var2) {
            cm.all[var5].a[var2] = new String[var0.readByte()];

            for(int var3 = 0; var3 < cm.all[var5].a[var2].length; ++var3) {
               cm.all[var5].a[var2][var3] = var0.readUTF();
            }
         }
      }

      i.a = new cv[var0.readByte()];

      for(var5 = var4; var5 < i.a.length; ++var5) {
         i.a[var5] = new cv();
         i.a[var5].c = var0.readByte();
         i.a[var5].a = var0.readUTF();
         i.a[var5].a = var0.readInt();
         i.a[var5].a = var0.readByte();
         i.a[var5].b = var0.readByte();
         i.a[var5].d = var0.readByte();
      }

   }

   private static void c(Message var0) {
      Exception var10000;
      label699: {
         short var4;
         StringBuffer var15;
         boolean var10001;
         label700: {
            try {
               var15 = new StringBuffer("123 char= ");
               var15.append(Char.myCharz());
               Char var103 = Char.myCharz();
               Char var16 = Char.myCharz();
               Char.myCharz();
               var4 = var0.a().readShort();
               var16.R = var4;
               var103.b = var4;
               var103 = Char.myCharz();
               var16 = Char.myCharz();
               Char.myCharz();
               var4 = var0.a().readShort();
               var16.S = var4;
               var103.c = var4;
               Char.myCharz().ac = Char.myCharz().b;
               Char.myCharz().ad = Char.myCharz().c;
               var15 = new StringBuffer("head= ");
               var15.append(Char.myCharz().V).append(" body= ").append(Char.myCharz().X).append(" left= ").append(Char.myCharz().W).append(" x= ").append(Char.myCharz().b).append(" y= ").append(Char.myCharz().c).append(" chung toc= ").append(Char.myCharz().k);
               if (Char.myCharz().b >= 0 && Char.myCharz().b <= 100) {
                  Char.myCharz().i = 1;
                  break label700;
               }
            } catch (Exception var88) {
               var10000 = var88;
               var10001 = false;
               break label699;
            }

            try {
               if (Char.myCharz().b >= TileMap.a - 100 && Char.myCharz().b <= TileMap.a) {
                  Char.myCharz().i = -1;
               }
            } catch (Exception var87) {
               var10000 = var87;
               var10001 = false;
               break label699;
            }
         }

         byte var5;
         try {
            var5 = var0.a().readByte();
            var15 = new StringBuffer("vGo size= ");
            var15.append(var5);
            if (!GameSrc.a.a) {
               GameSrc.a.b = Char.myCharz().b - GameSrc.k;
               GameSrc.a.a = Char.myCharz().c - GameSrc.l;
            }
         } catch (Exception var86) {
            var10000 = var86;
            var10001 = false;
            break label699;
         }

         int var90;
         for(var90 = 0; var90 < var5; ++var90) {
            try {
               new ay(var0.a().readShort(), var0.a().readShort(), var0.a().readShort(), var0.a().readShort(), var0.a().readBoolean(), var0.a().readBoolean(), var0.a().readUTF());
            } catch (Exception var85) {
               var10000 = var85;
               var10001 = false;
               break label699;
            }
         }

         try {
            var5 = var0.a().readByte();
            i.b.removeAllElements();
         } catch (Exception var84) {
            var10000 = var84;
            var10001 = false;
            break label699;
         }

         byte var6;
         byte var7;
         int var8;
         boolean var12;
         for(byte var91 = 0; var91 < var5; ++var91) {
            i var19;
            try {
               var0.a().readBoolean();
               var12 = var0.a().readBoolean();
               var0.a().readBoolean();
               boolean var14 = var0.a().readBoolean();
               boolean var13 = var0.a().readBoolean();
               var6 = var0.a().readByte();
               var7 = var0.a().readByte();
               var8 = var0.a().readInt();
               var0.a().readByte();
               var19 = new i(var91, var12, var14, var13, var6, var7, var8, var0.a().readInt(), var0.a().readShort(), var0.a().readShort(), var0.a().readByte(), var0.a().readByte());
               var19.v = var19.e;
               var19.w = var19.f;
               var19.g = var0.a().readBoolean();
               var6 = i.a[var19.r].c;
            } catch (Exception var80) {
               var10000 = var80;
               var10001 = false;
               break label699;
            }

            if (var6 != 0) {
               if (var91 % 3 == 0) {
                  try {
                     var19.g = -1;
                  } catch (Exception var79) {
                     var10000 = var79;
                     var10001 = false;
                     break label699;
                  }
               } else {
                  try {
                     var19.g = 1;
                  } catch (Exception var78) {
                     var10000 = var78;
                     var10001 = false;
                     break label699;
                  }
               }

               try {
                  var19.e += 10 - var91 % 20;
               } catch (Exception var77) {
                  var10000 = var77;
                  var10001 = false;
                  break label699;
               }
            }

            try {
               var19.h = false;
            } catch (Exception var76) {
               var10000 = var76;
               var10001 = false;
               break label699;
            }

            s var104 = null;
            ci var17 = null;

            be var105;
            label658: {
               try {
                  if (var19.r == 70) {
                     var105 = new be(var91, (short)var19.e, (short)var19.f, var19.c, var19.d, var19.u);
                     break label658;
                  }
               } catch (Exception var83) {
                  var10000 = var83;
                  var10001 = false;
                  break label699;
               }

               var105 = null;
            }

            try {
               if (var19.r == 71) {
                  var104 = new s(var91, (short)var19.e, (short)var19.f, var19.c, var19.d);
               }
            } catch (Exception var82) {
               var10000 = var82;
               var10001 = false;
               break label699;
            }

            try {
               if (var19.r == 72) {
                  var17 = new ci(var91, (short)var19.e, (short)var19.f, var19.c, var19.d);
               }
            } catch (Exception var75) {
               var10000 = var75;
               var10001 = false;
               break label699;
            }

            bm var18;
            label645: {
               try {
                  if (var19.g) {
                     var18 = new bm(var91, (short)var19.e, (short)var19.f, var19.r, var19.c, var19.d);
                     break label645;
                  }
               } catch (Exception var81) {
                  var10000 = var81;
                  var10001 = false;
                  break label699;
               }

               var18 = null;
            }

            if (var18 != null) {
               try {
                  GameSrc.f.addElement(var18);
               } catch (Exception var74) {
                  var10000 = var74;
                  var10001 = false;
                  break label699;
               }
            } else if (var105 != null) {
               try {
                  GameSrc.f.addElement(var105);
               } catch (Exception var73) {
                  var10000 = var73;
                  var10001 = false;
                  break label699;
               }
            } else if (var104 != null) {
               try {
                  GameSrc.f.addElement(var104);
               } catch (Exception var72) {
                  var10000 = var72;
                  var10001 = false;
                  break label699;
               }
            } else if (var17 != null) {
               try {
                  GameSrc.f.addElement(var17);
               } catch (Exception var71) {
                  var10000 = var71;
                  var10001 = false;
                  break label699;
               }
            } else {
               try {
                  GameSrc.f.addElement(var19);
               } catch (Exception var70) {
                  var10000 = var70;
                  var10001 = false;
                  break label699;
               }
            }
         }

         var90 = 0;

         String var106;
         while(true) {
            try {
               if (var90 >= i.a.size()) {
                  if (Char.myCharz().b != null && GameSrc.a(Char.myCharz().b.q) == null) {
                     Char.myCharz().b.a();
                     Char.myCharz().b.e = Char.myCharz().b;
                     Char.myCharz().b.f = Char.myCharz().c - 40;
                     GameSrc.f.addElement(Char.myCharz().b);
                  }
                  break;
               }
            } catch (Exception var68) {
               var10000 = var68;
               var10001 = false;
               break label699;
            }

            label610: {
               try {
                  var106 = (String)i.a.elementAt(var90);
                  if (i.a(var106)) {
                     break label610;
                  }

                  i.a[Integer.parseInt(var106)].a = null;
                  i.a.removeElementAt(var90);
               } catch (Exception var69) {
                  var10000 = var69;
                  var10001 = false;
                  break label699;
               }

               --var90;
            }

            ++var90;
         }

         try {
            var0.a().readByte();
            var5 = var0.a().readByte();
            var15 = new StringBuffer("NPC size= ");
            var15.append(var5);
         } catch (Exception var67) {
            var10000 = var67;
            var10001 = false;
            break label699;
         }

         short var98;
         for(var90 = 0; var90 < var5; ++var90) {
            short var9;
            byte var10;
            short var93;
            try {
               var7 = var0.a().readByte();
               var98 = var0.a().readShort();
               var9 = var0.a().readShort();
               var10 = var0.a().readByte();
               var15 = new StringBuffer("tempalte = ");
               var15.append(var10);
               var93 = var0.a().readShort();
            } catch (Exception var64) {
               var10000 = var64;
               var10001 = false;
               break label699;
            }

            if (var10 != 6) {
               label707: {
                  try {
                     if (Char.myCharz().a.a >= 7 && (Char.myCharz().a.a != 7 || Char.myCharz().a.a > 1)) {
                        break label707;
                     }
                  } catch (Exception var66) {
                     var10000 = var66;
                     var10001 = false;
                     break label699;
                  }

                  if (var10 == 7 || var10 == 8 || var10 == 9) {
                     continue;
                  }
               }

               label572: {
                  try {
                     if (Char.myCharz().a.a >= 6) {
                        break label572;
                     }
                  } catch (Exception var65) {
                     var10000 = var65;
                     var10001 = false;
                     break label699;
                  }

                  if (var10 == 16) {
                     continue;
                  }
               }

               if (var10 == 4) {
                  try {
                     GameSrc var112 = GameSrc.a();
                     dy var107 = new dy(var90, var7, var98, var9, var10, var93);
                     var112.a = var107;
                     av.a().b((byte)2);
                     GameSrc.g.addElement(GameSrc.a().a);
                  } catch (Exception var63) {
                     var10000 = var63;
                     var10001 = false;
                     break label699;
                  }
               } else {
                  try {
                     cm var114 = new cm(var90, var7, var98, var9 + 3, var10, var93);
                     GameSrc.g.addElement(var114);
                  } catch (Exception var62) {
                     var10000 = var62;
                     var10001 = false;
                     break label699;
                  }
               }
            }
         }

         try {
            var6 = var0.a().readByte();
            var15 = new StringBuffer("item size = ");
            var15.append(var6);
         } catch (Exception var61) {
            var10000 = var61;
            var10001 = false;
            break label699;
         }

         var90 = 0;

         label554:
         while(true) {
            int var92;
            boolean var94;
            short var96;
            if (var90 >= var6) {
               label710: {
                  short var97;
                  label711: {
                     try {
                        if (main.a.b && (!main.a.b || TileMap.mapId != 51 && TileMap.mapId != 103)) {
                           break label711;
                        }
                     } catch (Exception var54) {
                        var10000 = var54;
                        var10001 = false;
                        break;
                     }

                     try {
                        var96 = var0.a().readShort();
                        TileMap.c.removeAllElements();
                        if (dm.a == 1) {
                           by.a();
                        }
                     } catch (Exception var53) {
                        var10000 = var53;
                        var10001 = false;
                        break;
                     }

                     try {
                        by.a.removeAllElements();
                        var15 = new StringBuffer("nItem= ");
                        var15.append(var96);
                     } catch (Exception var40) {
                        var10000 = var40;
                        var10001 = false;
                        break;
                     }

                     int var95;
                     StringBuffer var109;
                     eh var119;
                     for(var95 = 0; var95 < var96; ++var95) {
                        by var108;
                        try {
                           var4 = var0.a().readShort();
                           var97 = var0.a().readShort();
                           var98 = var0.a().readShort();
                           if (TileMap.a(var4) == null) {
                              continue;
                           }

                           by var120 = TileMap.a(var4);
                           var108 = new by();
                           var108.a = var4;
                           var108.a = var120.a;
                           var108.e = var120.e;
                           var108.f = var120.f;
                           var108.c = TileMap.a * var97;
                           var108.d = TileMap.a * var98;
                           var108.a = var120.a;
                           var12 = TileMap.a(var108.a);
                        } catch (Exception var48) {
                           var10000 = var48;
                           var10001 = false;
                           break label554;
                        }

                        if (var12) {
                           byte var99;
                           if (var95 % 2 == 0) {
                              var99 = 0;
                           } else {
                              var99 = 2;
                           }

                           try {
                              var108.b = var99;
                              if (TileMap.mapId == 45) {
                                 var108.b = 0;
                              }
                           } catch (Exception var39) {
                              var10000 = var39;
                              var10001 = false;
                              break label554;
                           }
                        }

                        MyVector var121;
                        label500: {
                           label714: {
                              Image var113;
                              StringBuffer var116;
                              Image var124;
                              label732: {
                                 eh var122;
                                 try {
                                    var122 = by.a;
                                    var109 = new StringBuffer(String.valueOf(var108.a));
                                    if (var122.containsKey(var109.toString())) {
                                       break label500;
                                    }

                                    if (dm.a == 1) {
                                       var15 = new StringBuffer("/mapBackGround/");
                                       var113 = dz.c(var15.append(var108.a).append(".png").toString());
                                       break label732;
                                    }
                                 } catch (Exception var52) {
                                    var10000 = var52;
                                    var10001 = false;
                                    break label554;
                                 }

                                 var94 = false;

                                 byte[] var111;
                                 try {
                                    var15 = new StringBuffer(String.valueOf(dm.a));
                                    var111 = aa.a(var15.append("bgItem").append(var108.a).toString());
                                 } catch (Exception var36) {
                                    var10000 = var36;
                                    var10001 = false;
                                    break label554;
                                 }

                                 if (var111 != null) {
                                    boolean var101 = var94;

                                    label718: {
                                       try {
                                          if (by.a == null) {
                                             break label718;
                                          }

                                          var15 = new StringBuffer("Small  last= ");
                                          var15.append(var111.length % 127).append("new Version= ").append(by.a[var108.a]);
                                       } catch (Exception var51) {
                                          var10000 = var51;
                                          var10001 = false;
                                          break label554;
                                       }

                                       var101 = var94;

                                       try {
                                          if (var111.length % 127 == by.a[var108.a]) {
                                             break label718;
                                          }
                                       } catch (Exception var50) {
                                          var10000 = var50;
                                          var10001 = false;
                                          break label554;
                                       }

                                       var101 = true;
                                    }

                                    var94 = var101;
                                    if (!var101) {
                                       try {
                                          var113 = Image.createImage(var111, 0, var111.length);
                                       } catch (Exception var35) {
                                          var10000 = var35;
                                          var10001 = false;
                                          break label554;
                                       }

                                       if (var113 != null) {
                                          try {
                                             var122 = by.a;
                                             var116 = new StringBuffer(String.valueOf(var108.a));
                                             var122.put(var116.toString(), var113);
                                          } catch (Exception var34) {
                                             var10000 = var34;
                                             var10001 = false;
                                             break label554;
                                          }

                                          var94 = var101;
                                       } else {
                                          var94 = true;
                                       }
                                    }
                                 } else {
                                    var94 = true;
                                 }

                                 if (var94) {
                                    try {
                                       var15 = new StringBuffer("/mapBackGround/");
                                       var113 = dz.c(var15.append(var108.a).append(".png").toString());
                                    } catch (Exception var33) {
                                       var10000 = var33;
                                       var10001 = false;
                                       break label554;
                                    }

                                    var124 = var113;
                                    if (var113 == null) {
                                       try {
                                          var124 = Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
                                          av.a().c(var108.a);
                                       } catch (Exception var32) {
                                          var10000 = var32;
                                          var10001 = false;
                                          break label554;
                                       }
                                    }

                                    try {
                                       eh var117 = by.a;
                                       var109 = new StringBuffer(String.valueOf(var108.a));
                                       var117.put(var109.toString(), var124);
                                    } catch (Exception var31) {
                                       var10000 = var31;
                                       var10001 = false;
                                       break label554;
                                    }
                                 }
                                 break label714;
                              }

                              var124 = var113;
                              if (var113 == null) {
                                 try {
                                    var124 = Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
                                    at.b().a();
                                    av.a().c(var108.a);
                                 } catch (Exception var38) {
                                    var10000 = var38;
                                    var10001 = false;
                                    break label554;
                                 }
                              }

                              try {
                                 var119 = by.a;
                                 var116 = new StringBuffer(String.valueOf(var108.a));
                                 var119.put(var116.toString(), var124);
                              } catch (Exception var37) {
                                 var10000 = var37;
                                 var10001 = false;
                                 break label554;
                              }
                           }

                           try {
                              var121 = by.b;
                              var15 = new StringBuffer(String.valueOf(var108.a));
                              var121.addElement(var15.toString());
                           } catch (Exception var30) {
                              var10000 = var30;
                              var10001 = false;
                              break label554;
                           }
                        }

                        try {
                           var15 = new StringBuffer(String.valueOf(var108.a));
                           if (!by.a(var15.toString())) {
                              var121 = by.a;
                              var15 = new StringBuffer(String.valueOf(var108.a));
                              var121.addElement(var15.toString());
                           }
                        } catch (Exception var49) {
                           var10000 = var49;
                           var10001 = false;
                           break label554;
                        }

                        try {
                           TileMap.c.addElement(var108);
                        } catch (Exception var29) {
                           var10000 = var29;
                           var10001 = false;
                           break label554;
                        }
                     }

                     var90 = 0;

                     while(true) {
                        label720: {
                           try {
                              if (var90 >= by.b.size()) {
                                 da.a = false;
                                 da.b = 0;
                                 dh.a.removeAllElements();
                                 da.a.removeAllElements();
                                 cx.b.removeAllElements();
                                 var96 = var0.a().readShort();
                                 break;
                              }
                           } catch (Exception var45) {
                              var10000 = var45;
                              var10001 = false;
                              break label554;
                           }

                           try {
                              var106 = (String)by.b.elementAt(var90);
                              if (by.a(var106)) {
                                 break label720;
                              }

                              by.a.remove(var106);
                              eh var110 = by.a;
                              var109 = new StringBuffer(String.valueOf(var106));
                              if (var110.containsKey(var109.append("blend1").toString())) {
                                 var110 = by.a;
                                 var109 = new StringBuffer(String.valueOf(var106));
                                 var110.remove(var109.append("blend1").toString());
                              }
                           } catch (Exception var46) {
                              var10000 = var46;
                              var10001 = false;
                              break label554;
                           }

                           try {
                              var119 = by.a;
                              StringBuffer var115 = new StringBuffer(String.valueOf(var106));
                              if (var119.containsKey(var115.append("blend3").toString())) {
                                 var119 = by.a;
                                 var115 = new StringBuffer(String.valueOf(var106));
                                 var119.remove(var115.append("blend3").toString());
                              }
                           } catch (Exception var47) {
                              var10000 = var47;
                              var10001 = false;
                              break label554;
                           }

                           try {
                              by.b.removeElementAt(var90);
                           } catch (Exception var28) {
                              var10000 = var28;
                              var10001 = false;
                              break label554;
                           }

                           --var90;
                        }

                        ++var90;
                     }

                     for(var90 = 0; var90 < var96; ++var90) {
                        int var11;
                        int var100;
                        int var102;
                        String[] var125;
                        label434: {
                           String var123;
                           label433: {
                              label723: {
                                 try {
                                    var106 = var0.a().readUTF();
                                    var123 = var0.a().readUTF();
                                    if (!var106.equals("eff")) {
                                       break label433;
                                    }

                                    if (Panel.k > 0) {
                                       continue;
                                    }

                                    var125 = cq.a(var123, ".", 0);
                                    var8 = Integer.parseInt(var125[0]);
                                    var11 = Integer.parseInt(var125[1]);
                                    var100 = Integer.parseInt(var125[2]);
                                    var102 = Integer.parseInt(var125[3]);
                                    if (var125.length <= 4) {
                                       break label723;
                                    }
                                 } catch (Exception var44) {
                                    var10000 = var44;
                                    var10001 = false;
                                    break label554;
                                 }

                                 try {
                                    var92 = Integer.parseInt(var125[4]);
                                    var95 = Integer.parseInt(var125[5]);
                                    break label434;
                                 } catch (Exception var27) {
                                    var10000 = var27;
                                    var10001 = false;
                                    break label554;
                                 }
                              }

                              var92 = -1;
                              var95 = 1;
                              break label434;
                           }

                           try {
                              if (var106.equals("beff") && Panel.k <= 1) {
                                 da.a(Integer.parseInt(var123));
                              }
                              continue;
                           } catch (Exception var25) {
                              var10000 = var25;
                              var10001 = false;
                              break label554;
                           }
                        }

                        cx var126;
                        try {
                           var126 = new cx(var8, var100, var102, var11, var92, var95);
                           if (var125.length > 6) {
                              var126.b = Integer.parseInt(var125[6]);
                              if (var125.length > 7) {
                                 var126.c = Integer.parseInt(var125[7]);
                                 var126.d = Integer.parseInt(var125[8]);
                              }
                           }
                        } catch (Exception var43) {
                           var10000 = var43;
                           var10001 = false;
                           break label554;
                        }

                        try {
                           dh.a(var126);
                        } catch (Exception var26) {
                           var10000 = var26;
                           var10001 = false;
                           break label554;
                        }
                     }

                     var90 = 0;

                     while(true) {
                        try {
                           if (var90 >= cx.a.size()) {
                              break label710;
                           }
                        } catch (Exception var41) {
                           var10000 = var41;
                           var10001 = false;
                           break label554;
                        }

                        label409: {
                           try {
                              var106 = (String)cx.a.elementAt(var90);
                              if (cx.a(var106)) {
                                 break label409;
                              }

                              cx.a(Integer.parseInt(var106));
                              cx.a.removeElementAt(var90);
                           } catch (Exception var42) {
                              var10000 = var42;
                              var10001 = false;
                              break label554;
                           }

                           --var90;
                        }

                        ++var90;
                     }
                  }

                  try {
                     var97 = var0.a().readShort();
                  } catch (Exception var24) {
                     var10000 = var24;
                     var10001 = false;
                     break;
                  }

                  for(var90 = 0; var90 < var97; ++var90) {
                     try {
                        var0.a().readShort();
                        var0.a().readShort();
                        var0.a().readShort();
                     } catch (Exception var23) {
                        var10000 = var23;
                        var10001 = false;
                        break label554;
                     }
                  }

                  try {
                     var97 = var0.a().readShort();
                  } catch (Exception var22) {
                     var10000 = var22;
                     var10001 = false;
                     break;
                  }

                  for(var90 = 0; var90 < var97; ++var90) {
                     try {
                        var0.a().readUTF();
                        var0.a().readUTF();
                     } catch (Exception var21) {
                        var10000 = var21;
                        var10001 = false;
                        break label554;
                     }
                  }
               }

               try {
                  TileMap.j = var0.a().readByte();
                  a(var0.a().readByte());
                  Char.w = false;
                  return;
               } catch (Exception var20) {
                  var10000 = var20;
                  var10001 = false;
                  break;
               }
            }

            short var2;
            short var3;
            try {
               var2 = var0.a().readShort();
               var3 = var0.a().readShort();
               var98 = var0.a().readShort();
               var96 = var0.a().readShort();
               var92 = var0.a().readInt();
            } catch (Exception var58) {
               var10000 = var58;
               var10001 = false;
               break;
            }

            short var1 = 0;
            if (var92 == -2) {
               try {
                  var1 = var0.a().readShort();
               } catch (Exception var57) {
                  var10000 = var57;
                  var10001 = false;
                  break;
               }
            }

            ItemMap var118;
            try {
               var118 = new ItemMap(var92, var2, var3, var98, var96, var1);
            } catch (Exception var56) {
               var10000 = var56;
               var10001 = false;
               break;
            }

            var92 = 0;

            while(true) {
               label549: {
                  try {
                     if (var92 < GameSrc.e.size()) {
                        break label549;
                     }
                  } catch (Exception var60) {
                     var10000 = var60;
                     var10001 = false;
                     break label554;
                  }

                  var94 = false;
                  break;
               }

               label544: {
                  try {
                     if (((ItemMap)GameSrc.e.elementAt(var92)).d == var118.d) {
                        break label544;
                     }
                  } catch (Exception var59) {
                     var10000 = var59;
                     var10001 = false;
                     break label554;
                  }

                  ++var92;
                  continue;
               }

               var94 = true;
               break;
            }

            if (!var94) {
               try {
                  GameSrc.e.addElement(var118);
               } catch (Exception var55) {
                  var10000 = var55;
                  var10001 = false;
                  break;
               }
            }

            ++var90;
         }
      }

      Exception var89 = var10000;
      var89.printStackTrace();
   }

   private static void d(DataInputStream var0) {
      GameSrc.a = var0.readByte();
      (new StringBuffer("vcData= ")).append(GameSrc.a).append(" vData=").append(GameSrc.e);
      aa.a("NR_dart", o.a(var0));
      aa.a("NR_arrow", o.a(var0));
      aa.a("NR_effect", o.a(var0));
      aa.a("NR_image", o.a(var0));
      aa.a("NR_part", o.a(var0));
      aa.a("NR_skill", o.a(var0));
      aa.a("NRdata");
   }

   private void d(Message param1) {
      // $FF: Couldn't be decompiled
   }

   private static void e(DataInputStream var0) {
      int var4 = 0;
      GameSrc.d = var0.readByte();
      byte var5 = var0.readByte();
      if (var5 == 0) {
         GameSrc.a().a = new cl[var0.readUnsignedByte()];

         for(var4 = 0; var4 < GameSrc.a().a.length; ++var4) {
            GameSrc.a().a[var4] = new cl();
            GameSrc.a().a[var4].a = var4;
            GameSrc.a().a[var4].a = var0.readUTF();
            GameSrc.a();
            var0.readByte();
         }
      } else {
         byte var1;
         byte var2;
         short var3;
         String var6;
         String var7;
         short var8;
         if (var5 == 1) {
            cn.a.clear();

            for(var8 = var0.readShort(); var4 < var8; ++var4) {
               var3 = (short)var4;
               var1 = var0.readByte();
               var2 = var0.readByte();
               var6 = var0.readUTF();
               var7 = var0.readUTF();
               var0.readByte();
               cn.a(new ItemTemplate(var3, var1, var2, var6, var7, var0.readInt(), var0.readShort(), var0.readShort(), var0.readBoolean()));
            }
         } else if (var5 == 2) {
            var4 = var0.readShort();

            for(var8 = var0.readShort(); var4 < var8; ++var4) {
               var3 = (short)var4;
               var2 = var0.readByte();
               var1 = var0.readByte();
               var7 = var0.readUTF();
               var6 = var0.readUTF();
               var0.readByte();
               cn.a(new ItemTemplate(var3, var2, var1, var7, var6, var0.readInt(), var0.readShort(), var0.readShort(), var0.readBoolean()));
            }

            byte[] var9 = new byte[var0.available()];
            var0.readFully(var9);
            aa.a("NRitem", var9);
            aa.a("NRitemVersion", new byte[]{GameSrc.d});
            ek.f = false;
            if (GameSrc.e == GameSrc.a && GameSrc.f == GameSrc.b && GameSrc.g == GameSrc.c && GameSrc.h == GameSrc.d) {
               GameSrc.a();
               GameSrc.i();
               GameSrc.a();
               GameSrc.g();
               GameSrc.a();
               GameSrc.h();
               GameSrc.a();
               GameSrc.j();
               av.a().o();
            }
         }
      }

   }

   private static void e(Message param0) {
      // $FF: Couldn't be decompiled
   }

   private static void f(Message param0) {
      // $FF: Couldn't be decompiled
   }

   private static void g(Message param0) {
      // $FF: Couldn't be decompiled
   }

   public final void a(Message param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(boolean var1) {
      if (var1) {
         System.out.println("connect 1 ok");
         GameMidlet.a = au.b[au.a];
         GameMidlet.b = au.a[au.a];
         au.i = 2;
         aa.a("svselect", au.a);
         aa.a("NRIPlink", (GameMidlet.a + ":" + GameMidlet.b).getBytes());
         av.a().c();
         av.a();
      } else {
         System.out.println("connect 2 ok");
         av var2 = av.a();
         if (aa.a("clienttype") != -1) {
            dz.a = aa.a("clienttype");
         }

         try {
            Message var3 = av.a((byte)2);
            var3.a().writeByte(dz.a);
            var3.a().writeByte(dm.a);
            StringBuffer var4 = new StringBuffer("gui zoomlevel = ");
            var4.append(dm.a);
            var3.a().writeBoolean(false);
            var3.a().writeInt(main.a.i);
            var3.a().writeInt(main.a.j);
            var3.a().writeBoolean(bf.b);
            var3.a().writeBoolean(main.a.e);
            DataOutputStream var7 = var3.a();
            StringBuffer var5 = new StringBuffer(String.valueOf(System.getProperty("microedition.platform")));
            var7.writeUTF(var5.append("|1.9.8").toString());
            var2.a = at.b();
            var2.a.a(var3);
            var2.a = at.a();
            var3.a();
         } catch (IOException var6) {
            var6.printStackTrace();
         }

         av.a();
      }

   }

   public final void b(boolean var1) {
      if (!var1) {
         System.out.println("connect 2 fail");
         if (main.a.a == main.a.a && au.d && !av.a) {
            main.a.a.g();
         }

         if (main.a.a == main.a.a && !av.a) {
            dz.a(var1);
         }
      } else {
         System.out.println("---connect 1 fail");
         dz.a(var1);
      }

   }

   public final void c(boolean var1) {
      if (!var1) {
         System.out.println("connect 2 fail");
         if (main.a.a == main.a.a && !av.a) {
            main.a.a.g();
         }

         if (main.a.a == main.a.a && !av.a) {
            dz.b(var1);
         }
      } else {
         System.out.println("connect 1 fail");
         dz.b(var1);
      }

   }
}
