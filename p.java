package pasta;

import java.io.IOException;

public final class p {
   float a;
   int a;
   long a;
   boolean a;
   int[] a;
   int b;
   long b;
   int[] b;
   int c;
   int d;
   int e;
   int f;
   int g;
   int h;
   int i;
   int j;

   public p() {
   }

   public p(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 0;
      super();
      this.i = 0;
      this.j = 16711680;
      this.a = 0L;
      this.b = 150L;
      this.a = true;
      this.a = new int[2];
      this.b = new int[2];
      this.g = var2;
      this.d = var1;
      this.a = 1.0F;
      this.c = var3;
      this.h = var4;
      this.a = main.a.i;
      this.b = main.a.j;
      this.a = System.currentTimeMillis();

      for(var3 = var6; var3 < 2; ++var3) {
         this.a[var3] = var1;
         this.b[var3] = var2;
      }

      this.j = var5;
   }

   public static void a(Message var0) {
      byte var10;
      boolean var10001;
      try {
         var10 = var0.a;
      } catch (Exception var247) {
         var10001 = false;
         return;
      }

      Char var256;
      cx var257;
      byte var1;
      int var263;
      short var264;
      short var8;
      short var265;
      short var9;
      byte var266;
      int var11;
      byte var268;
      short var12;
      int var269;
      short var13;
      int var270;
      short var14;
      byte var271;
      short var15;
      Exception var10000;
      short var16;
      short var17;
      int var274;
      boolean var19;
      int var275;
      long var20;
      Char var22;
      db[] var23;
      StringBuffer var280;
      cm var282;
      int[] var288;
      Item var289;
      StringBuffer var290;
      Char[] var291;
      int[] var296;
      byte[] var306;
      String var308;
      Exception var253;
      String var254;
      StringBuffer var255;
      switch(var10) {
      case -128:
         label2000: {
            try {
               var10 = var0.a().readByte();
               var22 = GameSrc.a(var0.a().readInt());
            } catch (Exception var246) {
               var10000 = var246;
               var10001 = false;
               break label2000;
            }

            if (var10 == 0) {
               label2001: {
                  try {
                     var13 = var0.a().readShort();
                     var266 = var0.a().readByte();
                     var271 = var0.a().readByte();
                     var264 = var0.a().readShort();
                     var1 = var0.a().readByte();
                  } catch (Exception var244) {
                     var10000 = var244;
                     var10001 = false;
                     break label2001;
                  }

                  if (var22 == null) {
                     break;
                  }

                  try {
                     var257 = new cx(var13, var22, var266, var271, var264, var1);
                     var22.a(var257);
                     break;
                  } catch (Exception var241) {
                     var10000 = var241;
                     var10001 = false;
                  }
               }
            } else if (var10 == 1) {
               label2002: {
                  try {
                     var264 = var0.a().readShort();
                  } catch (Exception var245) {
                     var10000 = var245;
                     var10001 = false;
                     break label2002;
                  }

                  if (var22 == null) {
                     break;
                  }

                  try {
                     var22.c(0, var264);
                     break;
                  } catch (Exception var242) {
                     var10000 = var242;
                     var10001 = false;
                  }
               }
            } else {
               if (var10 != 2 || var22 == null) {
                  break;
               }

               try {
                  var22.c(-1, 0);
                  break;
               } catch (Exception var243) {
                  var10000 = var243;
                  var10001 = false;
               }
            }
         }

         var253 = var10000;

         try {
            var253.printStackTrace();
         } catch (Exception var36) {
            var10001 = false;
         }
         break;
      case -127:
         try {
            b(var0);
         } catch (Exception var240) {
            var10001 = false;
         }
         break;
      case -126:
         try {
            var10 = var0.a().readByte();
            var280 = new StringBuffer("type quay= ");
            var280.append(var10);
         } catch (Exception var239) {
            var10001 = false;
            break;
         }

         if (var10 == 1) {
            try {
               var0.a().readByte();
               String var302 = var0.a().readUTF();
               var308 = var0.a().readUTF();
               GameSrc.a().b(var302, var308);
            } catch (Exception var238) {
               var10001 = false;
               break;
            }
         }

         if (var10 == 0) {
            try {
               GameSrc.a().b(var0.a().readUTF());
            } catch (Exception var237) {
               var10001 = false;
            }
         }
         break;
      case -125:
         try {
            bq.a().a = false;
            var308 = var0.a().readUTF();
            var290 = new StringBuffer("titile= ");
            var290.append(var308);
            var266 = var0.a().readByte();
            dq.a().a(var266, (String)var308);
         } catch (Exception var236) {
            var10001 = false;
            break;
         }

         for(var263 = 0; var263 < var266; ++var263) {
            try {
               dq.a().a[var263].b = var0.a().readUTF();
               var271 = var0.a().readByte();
            } catch (Exception var235) {
               var10001 = false;
               return;
            }

            if (var271 == 0) {
               try {
                  dq.a().a[var263].goToMap(1);
               } catch (Exception var234) {
                  var10001 = false;
                  return;
               }
            }

            if (var271 == 1) {
               try {
                  dq.a().a[var263].goToMap(0);
               } catch (Exception var233) {
                  var10001 = false;
                  return;
               }
            }

            if (var271 == 2) {
               try {
                  dq.a().a[var263].goToMap(2);
               } catch (Exception var232) {
                  var10001 = false;
                  return;
               }
            }
         }

         return;
      case -124:
         try {
            var10 = var0.a().readByte();
            var266 = var0.a().readByte();
         } catch (Exception var231) {
            var10001 = false;
            break;
         }

         if (var266 == 0) {
            if (var10 == 2) {
               label2070: {
                  try {
                     var269 = var0.a().readInt();
                     if (var269 == Char.myCharz().charID) {
                        Char.myCharz().x();
                        break label2070;
                     }
                  } catch (Exception var230) {
                     var10001 = false;
                     break;
                  }

                  try {
                     if (GameSrc.a(var269) != null) {
                        GameSrc.a(var269).x();
                     }
                  } catch (Exception var229) {
                     var10001 = false;
                     break;
                  }
               }
            }

            try {
               var270 = var0.a().readUnsignedByte();
               var274 = var0.a().readInt();
               var280 = new StringBuffer("playerID= ");
               var280.append(var274).append(" skillID= ").append(var270);
            } catch (Exception var217) {
               var10001 = false;
               break;
            }

            if (var270 == 32) {
               if (var10 == 1) {
                  label2033: {
                     try {
                        var269 = var0.a().readInt();
                        if (var274 == Char.myCharz().charID) {
                           Char.myCharz().aj = var270;
                           GameSrc.a(var269).a(Char.myCharz());
                           break label2033;
                        }
                     } catch (Exception var226) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (GameSrc.a(var274) != null && var269 != Char.myCharz().charID) {
                           GameSrc.a(var274).aj = var270;
                           GameSrc.a(var269).a(GameSrc.a(var274));
                           break label2033;
                        }
                     } catch (Exception var227) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (GameSrc.a(var274) != null && var269 == Char.myCharz().charID) {
                           GameSrc.a(var274).aj = var270;
                           Char.myCharz().a(GameSrc.a(var274));
                        }
                     } catch (Exception var215) {
                        var10001 = false;
                        break;
                     }
                  }
               } else {
                  label2072: {
                     try {
                        if (var274 == Char.myCharz().charID) {
                           Char.myCharz().u();
                           break label2072;
                        }
                     } catch (Exception var228) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (GameSrc.a(var274) != null) {
                           GameSrc.a(var274).u();
                        }
                     } catch (Exception var216) {
                        var10001 = false;
                        break;
                     }
                  }
               }
            }

            if (var270 == 33) {
               if (var10 == 1) {
                  label1852: {
                     try {
                        if (var274 == Char.myCharz().charID) {
                           Char.myCharz().J = true;
                           break label1852;
                        }
                     } catch (Exception var224) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (GameSrc.a(var274) != null) {
                           GameSrc.a(var274).J = true;
                        }
                     } catch (Exception var213) {
                        var10001 = false;
                        break;
                     }
                  }
               } else {
                  label2074: {
                     try {
                        if (var274 == Char.myCharz().charID) {
                           Char.myCharz().v();
                           break label2074;
                        }
                     } catch (Exception var225) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (GameSrc.a(var274) != null) {
                           GameSrc.a(var274).v();
                        }
                     } catch (Exception var214) {
                        var10001 = false;
                        break;
                     }
                  }
               }
            }

            if (var270 == 39) {
               if (var10 == 1) {
                  label1834: {
                     try {
                        if (var274 == Char.myCharz().charID) {
                           Char.myCharz().L = true;
                           break label1834;
                        }
                     } catch (Exception var222) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (GameSrc.a(var274) != null) {
                           GameSrc.a(var274).L = true;
                        }
                     } catch (Exception var211) {
                        var10001 = false;
                        break;
                     }
                  }
               } else {
                  label2076: {
                     try {
                        if (var274 == Char.myCharz().charID) {
                           Char.myCharz().y();
                           break label2076;
                        }
                     } catch (Exception var223) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (GameSrc.a(var274) != null) {
                           GameSrc.a(var274).y();
                        }
                     } catch (Exception var212) {
                        var10001 = false;
                        break;
                     }
                  }
               }
            }

            if (var270 == 40) {
               if (var10 == 1) {
                  label1816: {
                     try {
                        if (var274 == Char.myCharz().charID) {
                           Char.myCharz().M = true;
                           break label1816;
                        }
                     } catch (Exception var220) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (GameSrc.a(var274) != null) {
                           GameSrc.a(var274).M = true;
                        }
                     } catch (Exception var209) {
                        var10001 = false;
                        break;
                     }
                  }
               } else {
                  label2078: {
                     try {
                        if (var274 == Char.myCharz().charID) {
                           Char.myCharz().w();
                           break label2078;
                        }
                     } catch (Exception var221) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (GameSrc.a(var274) != null) {
                           GameSrc.a(var274).w();
                        }
                     } catch (Exception var210) {
                        var10001 = false;
                        break;
                     }
                  }
               }
            }

            if (var270 == 41) {
               if (var10 == 1) {
                  label1798: {
                     try {
                        if (var274 == Char.myCharz().charID) {
                           Char.myCharz().O = true;
                           break label1798;
                        }
                     } catch (Exception var218) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (GameSrc.a(var274) != null) {
                           GameSrc.a(var274).O = true;
                        }
                     } catch (Exception var207) {
                        var10001 = false;
                        break;
                     }
                  }
               } else {
                  label2080: {
                     try {
                        if (var274 == Char.myCharz().charID) {
                           Char.myCharz().A();
                           break label2080;
                        }
                     } catch (Exception var219) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (GameSrc.a(var274) != null) {
                           GameSrc.a(var274).A();
                        }
                     } catch (Exception var208) {
                        var10001 = false;
                        break;
                     }
                  }
               }
            }

            if (var270 == 42) {
               if (var10 == 1) {
                  try {
                     if (var274 == Char.myCharz().charID) {
                        Char.myCharz().P = true;
                     }
                  } catch (Exception var205) {
                     var10001 = false;
                     break;
                  }
               } else {
                  try {
                     if (var274 == Char.myCharz().charID) {
                        Char.myCharz().P = false;
                     }
                  } catch (Exception var206) {
                     var10001 = false;
                     break;
                  }
               }
            }
         }

         if (var266 == 1) {
            try {
               var11 = var0.a().readUnsignedByte();
               var1 = var0.a().readByte();
               var280 = new StringBuffer("modbHoldID= ");
               var280.append(var1).append(" skillID= ").append(var11).append("eff ID= ").append(var10);
            } catch (Exception var204) {
               var10001 = false;
               break;
            }

            if (var11 == 32) {
               if (var10 == 1) {
                  label1767: {
                     try {
                        var269 = var0.a().readInt();
                        if (var269 == Char.myCharz().charID) {
                           GameSrc.a(var1).b = var11;
                           Char.myCharz().a(GameSrc.a(var1));
                           break label1767;
                        }
                     } catch (Exception var203) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (GameSrc.a(var269) != null) {
                           GameSrc.a(var1).b = var11;
                           GameSrc.a(var269).a(GameSrc.a(var1));
                        }
                     } catch (Exception var201) {
                        var10001 = false;
                        break;
                     }
                  }
               } else {
                  try {
                     GameSrc.a(var1).j();
                  } catch (Exception var202) {
                     var10001 = false;
                     break;
                  }
               }
            }

            if (var11 == 40) {
               if (var10 == 1) {
                  try {
                     GameSrc.a(var1).k = true;
                  } catch (Exception var200) {
                     var10001 = false;
                     break;
                  }
               } else {
                  try {
                     GameSrc.a(var1).k();
                  } catch (Exception var199) {
                     var10001 = false;
                     break;
                  }
               }
            }

            if (var11 == 41) {
               if (var10 == 1) {
                  try {
                     GameSrc.a(var1).l = true;
                  } catch (Exception var197) {
                     var10001 = false;
                  }
               } else {
                  try {
                     GameSrc.a(var1).l();
                  } catch (Exception var198) {
                     var10001 = false;
                  }
               }
            }
         }
         break;
      case -123:
         try {
            var263 = var0.a().readInt();
            if (GameSrc.a(var263) != null) {
               GameSrc.a(var263).al = var0.a().readByte();
            }
         } catch (Exception var196) {
            var10001 = false;
         }
         break;
      case -122:
         try {
            var282 = GameSrc.a(var0.a().readShort());
            var266 = var0.a().readByte();
            var282.all = new int[var266];
         } catch (Exception var195) {
            var10001 = false;
            break;
         }

         for(var263 = 0; var263 < var266; ++var263) {
            try {
               var282.all[var263] = var0.a().readShort();
            } catch (Exception var194) {
               var10001 = false;
               return;
            }
         }

         try {
            var282.a(var0.a().readByte(), var0.a().readInt());
         } catch (Exception var193) {
            var10001 = false;
         }
         break;
      case -121:
         try {
            av.d = dz.a() - av.b;
            av.a().e();
         } catch (Exception var192) {
            var10001 = false;
         }
         break;
      case -120:
         try {
            av.c = dz.a() - av.a;
            av.a().d();
         } catch (Exception var191) {
            var10001 = false;
         }
         break;
      case -119:
         try {
            Char.myCharz().a = var0.a().readInt();
         } catch (Exception var190) {
            var10001 = false;
         }
         break;
      case -117:
         try {
            GameSrc.a().U = 0;
            GameSrc.a().j = var0.a().readByte();
            if (GameSrc.a().j == 100) {
               GameSrc.a().t = true;
            }
         } catch (Exception var189) {
            var10001 = false;
            break;
         }

         try {
            if (GameSrc.a().j == 101) {
               cm.R = true;
            }
         } catch (Exception var188) {
            var10001 = false;
         }
         break;
      case -116:
         label1718: {
            label1717: {
               try {
                  if (var0.a().readByte() == 1) {
                     break label1717;
                  }
               } catch (Exception var187) {
                  var10001 = false;
                  break;
               }

               var19 = false;
               break label1718;
            }

            var19 = true;
         }

         try {
            GameSrc.m = var19;
         } catch (Exception var186) {
            var10001 = false;
         }
         break;
      case -115:
         try {
            Char.myCharz().a(var0.a().readUTF(), var0.a().readShort(), var0.a().readShort(), var0.a().readShort());
         } catch (Exception var185) {
            var10001 = false;
         }
         break;
      case -113:
         try {
            var306 = new byte[5];
         } catch (Exception var184) {
            var10001 = false;
            break;
         }

         for(var263 = 0; var263 < 5; ++var263) {
            try {
               var306[var263] = var0.a().readByte();
               var290 = new StringBuffer("vlue i= ");
               var290.append(var306[var263]);
            } catch (Exception var183) {
               var10001 = false;
               return;
            }
         }

         try {
            GameSrc.a().b(var306);
            GameSrc.a().a(var306);
            GameSrc.a();
            GameSrc.c(var306);
         } catch (Exception var182) {
            var10001 = false;
         }
         break;
      case -111:
         MyVector var307;
         try {
            var265 = var0.a().readShort();
            var307 = new MyVector("");
            ei.a = var307;
         } catch (Exception var181) {
            var10001 = false;
            break;
         }

         for(var263 = 0; var263 < var265; ++var263) {
            try {
               String var294 = var0.a().readUTF();
               var1 = var0.a().readByte();
               var307 = ei.a;
               ei var300 = new ei(var294, var1);
               var307.addElement(var300);
            } catch (Exception var180) {
               var10001 = false;
               return;
            }
         }

         try {
            ei.a();
            ei.b();
         } catch (Exception var179) {
            var10001 = false;
         }
         break;
      case -110:
         try {
            var10 = var0.a().readByte();
         } catch (Exception var178) {
            var10001 = false;
            break;
         }

         if (var10 == 1) {
            try {
               var11 = var0.a().readInt();
               var280 = new StringBuffer(String.valueOf(var11));
               var306 = aa.a(var280.toString());
            } catch (Exception var177) {
               var10001 = false;
               break;
            }

            if (var306 == null) {
               try {
                  av.a().a((int)-1, (byte[])null);
               } catch (Exception var176) {
                  var10001 = false;
                  break;
               }
            } else {
               try {
                  av.a().a(var11, var306);
               } catch (Exception var175) {
                  var10001 = false;
                  break;
               }
            }
         }

         if (var10 == 0) {
            try {
               var263 = var0.a().readInt();
               var265 = var0.a().readShort();
               var306 = new byte[var265];
               var0.a().read(var306, 0, var265);
               var255 = new StringBuffer(String.valueOf(var263));
               aa.a(var255.toString(), var306);
            } catch (Exception var174) {
               var10001 = false;
            }
         }
         break;
      case -106:
         try {
            var8 = var0.a().readShort();
            var264 = var0.a().readShort();
            if (bx.a(var8)) {
               bx.a(var8).a(var264);
               break;
            }
         } catch (Exception var251) {
            var10001 = false;
            break;
         }

         try {
            bx var262 = new bx(var8, var264);
            Char.all.addElement(var262);
         } catch (Exception var173) {
            var10001 = false;
         }
         break;
      case -105:
         try {
            z.a().a = 0;
            z.a().b = var0.a().readShort();
            z var299 = z.a();
            z var305 = z.a();
            var20 = System.currentTimeMillis();
            var305.b = var20;
            var299.a = var20;
            z.a().a = var0.a().readByte();
            z.a().a();
         } catch (Exception var172) {
            var10001 = false;
         }
         break;
      case -103:
         try {
            var10 = var0.a().readByte();
            var280 = new StringBuffer("server gui ve actionFlag = ");
            var280.append(var10);
         } catch (Exception var171) {
            var10001 = false;
            break;
         }

         if (var10 == 0) {
            try {
               main.a.a.k.removeAllElements();
               var271 = var0.a().readByte();
            } catch (Exception var161) {
               var10001 = false;
               break;
            }

            for(var263 = 0; var263 < var271; ++var263) {
               try {
                  var289 = new Item();
                  var8 = var0.a().readShort();
               } catch (Exception var159) {
                  var10001 = false;
                  return;
               }

               if (var8 != -1) {
                  try {
                     var289.itemTemplate = cn.a(var8);
                     var266 = var0.a().readByte();
                  } catch (Exception var158) {
                     var10001 = false;
                     return;
                  }

                  if (var266 != -1) {
                     try {
                        var289.a = new db[var266];
                     } catch (Exception var157) {
                        var10001 = false;
                        return;
                     }

                     var11 = 0;

                     while(true) {
                        try {
                           if (var11 >= var289.a.length) {
                              break;
                           }
                        } catch (Exception var160) {
                           var10001 = false;
                           return;
                        }

                        try {
                           var270 = var0.a().readUnsignedByte();
                           var274 = var0.a().readUnsignedShort();
                        } catch (Exception var156) {
                           var10001 = false;
                           return;
                        }

                        if (var270 != -1) {
                           try {
                              var289.a[var11] = new db(var270, var274);
                           } catch (Exception var155) {
                              var10001 = false;
                              return;
                           }
                        }

                        ++var11;
                     }
                  }
               }

               try {
                  main.a.a.k.addElement(var289);
               } catch (Exception var154) {
                  var10001 = false;
                  return;
               }
            }

            try {
               main.a.a.i();
               main.a.a.t();
            } catch (Exception var153) {
               var10001 = false;
            }
         } else if (var10 == 1) {
            label2023: {
               try {
                  var263 = var0.a().readInt();
                  var1 = var0.a().readByte();
                  var255 = new StringBuffer("---------------actionFlag1:  ");
                  var255.append(var263).append(" : ").append(var1);
                  if (var263 == Char.myCharz().charID) {
                     Char.myCharz().e = var1;
                     break label2023;
                  }
               } catch (Exception var164) {
                  var10001 = false;
                  break;
               }

               try {
                  if (GameSrc.a(var263) != null) {
                     GameSrc.a(var263).e = var1;
                  }
               } catch (Exception var163) {
                  var10001 = false;
                  break;
               }
            }

            try {
               GameSrc.a();
               GameSrc.a(var263, var1);
            } catch (Exception var162) {
               var10001 = false;
            }
         } else if (var10 == 2) {
            do var261;
            try {
               var1 = var0.a().readByte();
               var265 = var0.a().readShort();
               var261 = new do();
               var261.a = var1;
               var261.a = var265;
               GameSrc.h.addElement(var261);
            } catch (Exception var170) {
               var10001 = false;
               break;
            }

            var263 = 0;

            while(true) {
               try {
                  if (var263 >= GameSrc.h.size()) {
                     break;
                  }
               } catch (Exception var169) {
                  var10001 = false;
                  return;
               }

               try {
                  var261 = (do)GameSrc.h.elementAt(var263);
                  var280 = new StringBuffer("i: ");
                  var280.append(var263).append("  cflag: ").append(var261.a).append("   IDimageFlag: ").append(var261.a);
               } catch (Exception var168) {
                  var10001 = false;
                  return;
               }

               ++var263;
            }

            var263 = 0;

            while(true) {
               try {
                  if (var263 >= GameSrc.d.size()) {
                     if (Char.myCharz().e == var1) {
                        Char.myCharz().Q = var265;
                     }

                     return;
                  }
               } catch (Exception var167) {
                  var10001 = false;
                  return;
               }

               try {
                  var256 = (Char)GameSrc.d.elementAt(var263);
               } catch (Exception var166) {
                  var10001 = false;
                  return;
               }

               if (var256 != null) {
                  try {
                     if (var256.e == var1) {
                        var256.Q = var265;
                     }
                  } catch (Exception var165) {
                     var10001 = false;
                     return;
                  }
               }

               ++var263;
            }
         }
         break;
      case -102:
         try {
            var10 = var0.a().readByte();
         } catch (Exception var152) {
            var10001 = false;
            break;
         }

         if (var10 != 0 && var10 == 1) {
            try {
               main.a.a.g = false;
               av.a().a(aa.a("acc"), aa.a("pass"), "1.9.8", (byte)0);
            } catch (Exception var151) {
               var10001 = false;
            }
         }
         break;
      case -101:
         try {
            main.a.a.g = true;
            main.a.b();
            var254 = var0.a().readUTF();
            var280 = new StringBuffer("userAo");
            aa.a(var280.append(au.a).toString(), var254);
            av.a().c();
            av.a().a(var254, "", "1.9.8", (byte)1);
         } catch (Exception var150) {
            var10001 = false;
         }
         break;
      case -100:
         boolean var281;
         label1571: {
            label1570: {
               try {
                  pasta.a.g();
                  if (main.a.i <= Panel.n * 2) {
                     break label1570;
                  }
               } catch (Exception var149) {
                  var10001 = false;
                  break;
               }

               var281 = true;
               break label1571;
            }

            var281 = false;
         }

         try {
            var268 = var0.a().readByte();
            var280 = new StringBuffer("t Indxe= ");
            var280.append(var268);
            main.a.a.a[var268] = var0.a().readByte();
            main.a.a.b[var268] = var0.a().readByte();
            var280 = new StringBuffer("max page= ");
            var280.append(main.a.a.a[var268]).append(" curr page= ").append(main.a.a.b[var268]);
            var274 = var0.a().readUnsignedByte();
            Char.myCharz().a[var268] = new Item[var274];
            Panel.d = ab.dA;
         } catch (Exception var148) {
            var10001 = false;
            break;
         }

         for(var11 = 0; var11 < var274; ++var11) {
            try {
               var8 = var0.a().readShort();
            } catch (Exception var146) {
               var10001 = false;
               return;
            }

            if (var8 != -1) {
               Item[] var297;
               try {
                  var297 = Char.myCharz().a[var268];
                  var289 = new Item();
               } catch (Exception var145) {
                  var10001 = false;
                  return;
               }

               var297[var11] = var289;

               try {
                  Char.myCharz().a[var268][var11].itemTemplate = cn.a(var8);
                  Char.myCharz().a[var268][var11].a = var0.a().readShort();
                  Char.myCharz().a[var268][var11].e = var0.a().readInt();
                  Char.myCharz().a[var268][var11].f = var0.a().readInt();
                  Char.myCharz().a[var268][var11].a = var0.a().readByte();
                  Char.myCharz().a[var268][var11].quantity = var0.a().readByte();
                  Char.myCharz().a[var268][var11].b = var0.a().readByte();
                  var271 = var0.a().readByte();
               } catch (Exception var144) {
                  var10001 = false;
                  return;
               }

               if (var271 != -1) {
                  try {
                     Char.myCharz().a[var268][var11].a = new db[var271];
                  } catch (Exception var143) {
                     var10001 = false;
                     return;
                  }

                  var269 = 0;

                  while(true) {
                     try {
                        if (var269 >= Char.myCharz().a[var268][var11].a.length) {
                           break;
                        }
                     } catch (Exception var147) {
                        var10001 = false;
                        return;
                     }

                     int var276;
                     try {
                        var276 = var0.a().readUnsignedByte();
                        var275 = var0.a().readUnsignedShort();
                     } catch (Exception var142) {
                        var10001 = false;
                        return;
                     }

                     if (var276 != -1) {
                        db var304;
                        try {
                           var23 = Char.myCharz().a[var268][var11].a;
                           var304 = new db(var276, var275);
                        } catch (Exception var141) {
                           var10001 = false;
                           return;
                        }

                        var23[var269] = var304;

                        try {
                           var289 = Char.myCharz().a[var268][var11];
                           Panel var298 = main.a.a;
                           var289.i = Panel.a(Char.myCharz().a[var268][var11]);
                        } catch (Exception var140) {
                           var10001 = false;
                           return;
                        }
                     }

                     ++var269;
                  }
               }

               try {
                  if (var0.a().readByte() == 1) {
                     var17 = var0.a().readShort();
                     var12 = var0.a().readShort();
                     var15 = var0.a().readShort();
                     var16 = var0.a().readShort();
                     Char.myCharz().a[var268][var11].a(var17, var12, var15, var16);
                  }
               } catch (Exception var139) {
                  var10001 = false;
                  return;
               }
            }
         }

         if (var281) {
            try {
               main.a.b.f();
            } catch (Exception var138) {
               var10001 = false;
               break;
            }
         }

         try {
            main.a.a.z();
            Panel var260 = main.a.a;
            main.a.a.d = 0;
            var260.e = 0;
         } catch (Exception var137) {
            var10001 = false;
         }
         break;
      case -89:
         label1518: {
            label1517: {
               try {
                  if (var0.a().readByte() == 1) {
                     break label1517;
                  }
               } catch (Exception var136) {
                  var10001 = false;
                  break;
               }

               var19 = false;
               break label1518;
            }

            var19 = true;
         }

         try {
            main.a.q = var19;
         } catch (Exception var135) {
            var10001 = false;
         }
         break;
      case 31:
         label2064: {
            try {
               var275 = var0.a().readInt();
               if (var0.a().readByte() != 1) {
                  break label2064;
               }

               var8 = var0.a().readShort();
            } catch (Exception var250) {
               var10001 = false;
               break;
            }

            var266 = -1;
            var23 = null;
            byte var273 = 0;
            var14 = 0;
            var296 = (int[])var23;
            var264 = var273;

            int[] var259;
            label1073: {
               label2065: {
                  try {
                     var271 = var0.a().readByte();
                  } catch (Exception var34) {
                     var10001 = false;
                     break label2065;
                  }

                  if (var271 <= 0) {
                     var259 = null;
                     var264 = 0;
                     var266 = var271;
                     break label1073;
                  }

                  var296 = (int[])var23;
                  var266 = var271;
                  var264 = var273;

                  byte var278;
                  try {
                     var278 = var0.a().readByte();
                  } catch (Exception var33) {
                     var10001 = false;
                     break label2065;
                  }

                  var296 = (int[])var23;
                  var266 = var271;
                  var264 = var273;

                  try {
                     var288 = new int[var278];
                  } catch (Exception var32) {
                     var10001 = false;
                     break label2065;
                  }

                  for(var270 = 0; var270 < var278; ++var270) {
                     var296 = var288;
                     var266 = var271;
                     var264 = var273;

                     try {
                        var288[var270] = var0.a().readByte();
                     } catch (Exception var31) {
                        var10001 = false;
                        break label2065;
                     }
                  }

                  var296 = var288;
                  var266 = var271;
                  var264 = var273;

                  try {
                     var13 = var0.a().readShort();
                  } catch (Exception var30) {
                     var10001 = false;
                     break label2065;
                  }

                  var296 = var288;
                  var266 = var271;
                  var264 = var13;

                  try {
                     var15 = var0.a().readShort();
                  } catch (Exception var29) {
                     var10001 = false;
                     break label2065;
                  }

                  var14 = var15;
                  var264 = var13;
                  var266 = var271;
                  var259 = var288;
                  break label1073;
               }

               var259 = var296;
            }

            label2067: {
               Char var295;
               ch var303;
               try {
                  if (var275 == Char.myCharz().charID) {
                     var295 = Char.myCharz();
                     var303 = new ch();
                     var295.a = var303;
                     Char.myCharz().a.a = var8;
                     break label2067;
                  }
               } catch (Exception var133) {
                  var10001 = false;
                  break;
               }

               try {
                  var295 = GameSrc.a(var275);
                  var303 = new ch();
                  var295.a = var303;
                  var295.a.a = var8;
               } catch (Exception var132) {
                  var10001 = false;
                  break;
               }

               if (var266 > 0) {
                  try {
                     var295.a.a(var266, var259, var264, var14);
                  } catch (Exception var131) {
                     var10001 = false;
                  }
               }
               break;
            }

            if (var266 > 0) {
               try {
                  Char.myCharz().a.a(var266, var259, var264, var14);
               } catch (Exception var130) {
                  var10001 = false;
               }
            }
            break;
         }

         try {
            if (var275 == Char.myCharz().charID) {
               Char.myCharz().a.a();
               Char.myCharz().a = null;
               break;
            }
         } catch (Exception var249) {
            var10001 = false;
            break;
         }

         try {
            var256 = GameSrc.a(var275);
            var256.a.a();
            var256.a = null;
         } catch (Exception var134) {
            var10001 = false;
         }
         break;
      case 42:
         try {
            main.a.f();
            ek.a = false;
            Char.w = false;
            var1 = var0.a().readByte();
            if (main.a.a == null) {
               am var258 = new am(var1);
               main.a.a = var258;
            }
         } catch (Exception var129) {
            var10001 = false;
            break;
         }

         try {
            main.a.a.a();
         } catch (Exception var128) {
            var10001 = false;
         }
         break;
      case 48:
         try {
            au.a = var0.a().readByte();
            main.a.a((ag)main.a.a);
            at.a().b();
            main.a.f();
            au.b = true;
         } catch (Exception var127) {
            var10001 = false;
         }
         break;
      case 51:
         r var293;
         try {
            var293 = (r)GameSrc.a(var0.a().readInt());
            var1 = var0.a().readByte();
            var8 = var0.a().readShort();
            var9 = var0.a().readShort();
            var266 = var0.a().readByte();
            var291 = new Char[var266];
            var296 = new int[var266];
         } catch (Exception var126) {
            var10001 = false;
            break;
         }

         for(var263 = 0; var263 < var266; ++var263) {
            try {
               var269 = var0.a().readInt();
               var290 = new StringBuffer("char ID=");
               var290.append(var269);
            } catch (Exception var124) {
               var10001 = false;
               return;
            }

            var291[var263] = null;

            label2006: {
               try {
                  if (var269 != Char.myCharz().charID) {
                     var291[var263] = GameSrc.a(var269);
                     break label2006;
                  }
               } catch (Exception var125) {
                  var10001 = false;
                  return;
               }

               try {
                  var291[var263] = Char.myCharz();
               } catch (Exception var123) {
                  var10001 = false;
                  return;
               }
            }

            try {
               var296[var263] = var0.a().readInt();
            } catch (Exception var122) {
               var10001 = false;
               return;
            }
         }

         try {
            var293.a(var1, var8, var9, var291, var296);
         } catch (Exception var121) {
            var10001 = false;
         }
         break;
      case 52:
         try {
            var10 = var0.a().readByte();
         } catch (Exception var120) {
            var10001 = false;
            break;
         }

         if (var10 == 1) {
            label1997: {
               try {
                  var11 = var0.a().readInt();
                  if (var11 == Char.myCharz().charID) {
                     Char.myCharz().c(true);
                     Char.myCharz().b = var0.a().readShort();
                     Char.myCharz().c = var0.a().readShort();
                     break label1997;
                  }
               } catch (Exception var119) {
                  var10001 = false;
                  break;
               }

               try {
                  var22 = GameSrc.a(var11);
               } catch (Exception var118) {
                  var10001 = false;
                  break;
               }

               if (var22 != null) {
                  try {
                     var22.c(true);
                     var22.b = var0.a().readShort();
                     var22.c = var0.a().readShort();
                  } catch (Exception var117) {
                     var10001 = false;
                     break;
                  }
               }
            }
         }

         if (var10 == 0) {
            label1998: {
               try {
                  var11 = var0.a().readInt();
                  if (var11 == Char.myCharz().charID) {
                     Char.myCharz().c(false);
                     break label1998;
                  }
               } catch (Exception var116) {
                  var10001 = false;
                  break;
               }

               try {
                  var22 = GameSrc.a(var11);
               } catch (Exception var115) {
                  var10001 = false;
                  break;
               }

               if (var22 != null) {
                  try {
                     var22.c(false);
                  } catch (Exception var114) {
                     var10001 = false;
                     break;
                  }
               }
            }
         }

         if (var10 == 2) {
            try {
               var269 = var0.a().readInt();
               var11 = var0.a().readInt();
               ((r)GameSrc.a(var269)).goToMap(var11);
            } catch (Exception var113) {
               var10001 = false;
               break;
            }
         }

         if (var10 == 3) {
            try {
               GameSrc.k = var0.a().readByte();
            } catch (Exception var112) {
               var10001 = false;
            }
         }
         break;
      case 93:
         try {
            var254 = cq.a(var0.a().readUTF());
            GameSrc.a().checkInfo(var254);
         } catch (Exception var111) {
            var10001 = false;
         }
         break;
      case 100:
         try {
            var266 = var0.a().readByte();
            var10 = var0.a().readByte();
         } catch (Exception var110) {
            var10001 = false;
            break;
         }

         var289 = null;
         if (var266 == 0) {
            try {
               var289 = Char.myCharz().c[var10];
            } catch (Exception var109) {
               var10001 = false;
               break;
            }
         }

         if (var266 == 1) {
            try {
               var289 = Char.myCharz().arrItemBag[var10];
            } catch (Exception var108) {
               var10001 = false;
               break;
            }
         }

         try {
            var8 = var0.a().readShort();
         } catch (Exception var107) {
            var10001 = false;
            break;
         }

         if (var8 != -1) {
            try {
               var289.itemTemplate = cn.a(var8);
               var289.quantity = var0.a().readInt();
               var0.a().readUTF();
               var0.a().readUTF();
               var10 = var0.a().readByte();
            } catch (Exception var106) {
               var10001 = false;
               break;
            }

            if (var10 != 0) {
               try {
                  var289.a = new db[var10];
               } catch (Exception var105) {
                  var10001 = false;
                  break;
               }

               var263 = 0;

               while(true) {
                  try {
                     if (var263 >= var289.a.length) {
                        return;
                     }

                     var269 = var0.a().readUnsignedByte();
                     var11 = var0.a().readUnsignedShort();
                  } catch (Exception var104) {
                     var10001 = false;
                     return;
                  }

                  if (var269 != -1) {
                     try {
                        var289.a[var263] = new db(var269, var11);
                     } catch (Exception var103) {
                        var10001 = false;
                        return;
                     }
                  }

                  ++var263;
               }
            }
         }
         break;
      case 101:
         be var286;
         try {
            var286 = pasta.i.a();
         } catch (Exception var102) {
            var10001 = false;
            break;
         }

         if (var286 != null) {
            try {
               var1 = var0.a().readByte();
            } catch (Exception var101) {
               var10001 = false;
               break;
            }

            if (var1 == 0 || var1 == 1 || var1 == 2 || var1 == 4 || var1 == 3) {
               if (var1 == 3) {
                  try {
                     var264 = var0.a().readShort();
                     var286.l = var264;
                     var286.y = var264;
                     var286.m = var0.a().readShort();
                     var286.n();
                  } catch (Exception var99) {
                     var10001 = false;
                     break;
                  }
               } else {
                  try {
                     var266 = var0.a().readByte();
                     var290 = new StringBuffer("CHUONG nChar= ");
                     var290.append(var266);
                     var291 = new Char[var266];
                     var288 = new int[var266];
                  } catch (Exception var98) {
                     var10001 = false;
                     break;
                  }

                  for(var263 = 0; var263 < var266; ++var263) {
                     try {
                        var269 = var0.a().readInt();
                        StringBuffer var292 = new StringBuffer("char ID=");
                        var292.append(var269);
                     } catch (Exception var97) {
                        var10001 = false;
                        return;
                     }

                     var291[var263] = null;

                     label2060: {
                        try {
                           if (var269 != Char.myCharz().charID) {
                              var291[var263] = GameSrc.a(var269);
                              break label2060;
                           }
                        } catch (Exception var100) {
                           var10001 = false;
                           return;
                        }

                        try {
                           var291[var263] = Char.myCharz();
                        } catch (Exception var96) {
                           var10001 = false;
                           return;
                        }
                     }

                     try {
                        var288[var263] = var0.a().readInt();
                     } catch (Exception var95) {
                        var10001 = false;
                        return;
                     }
                  }

                  try {
                     var286.a(var291, var288, var1);
                  } catch (Exception var94) {
                     var10001 = false;
                     break;
                  }
               }
            }

            if (var1 == 5) {
               try {
                  var286.m = true;
                  var286.h = 2;
               } catch (Exception var93) {
                  var10001 = false;
                  break;
               }
            }

            if (var1 == 6) {
               try {
                  var286.m();
                  var286.e = var0.a().readShort();
                  var286.f = var0.a().readShort();
               } catch (Exception var92) {
                  var10001 = false;
                  break;
               }
            }

            if (var1 == 7) {
               try {
                  var286.a((Char[])null, (int[])null, var1);
               } catch (Exception var91) {
                  var10001 = false;
                  break;
               }
            }

            if (var1 == 8) {
               try {
                  var264 = var0.a().readShort();
                  var286.l = var264;
                  var286.y = var264;
                  var286.m = var0.a().readShort();
                  var286.h = 2;
               } catch (Exception var90) {
                  var10001 = false;
                  break;
               }
            }

            if (var1 == 9) {
               try {
                  var286.m = -1000;
                  var286.l = -1000;
                  var286.y = -1000;
                  var286.f = -1000;
                  var286.e = -1000;
               } catch (Exception var89) {
                  var10001 = false;
               }
            }
         }
         break;
      case 102:
         try {
            var1 = var0.a().readByte();
         } catch (Exception var88) {
            var10001 = false;
            break;
         }

         if (var1 == 0 || var1 == 1 || var1 == 2 || var1 == 6) {
            ci var284;
            try {
               var284 = pasta.i.a();
            } catch (Exception var86) {
               var10001 = false;
               break;
            }

            if (var284 == null) {
               break;
            }

            if (var1 == 6) {
               try {
                  var284.m = -1000;
                  var284.l = -1000;
                  var284.z = -1000;
                  var284.y = -1000;
                  var284.f = -1000;
                  var284.e = -1000;
               } catch (Exception var70) {
                  var10001 = false;
               }
               break;
            }

            Char[] var283;
            int[] var287;
            try {
               var266 = var0.a().readByte();
               var283 = new Char[var266];
               var287 = new int[var266];
            } catch (Exception var85) {
               var10001 = false;
               break;
            }

            for(var263 = 0; var263 < var266; ++var263) {
               try {
                  var269 = var0.a().readInt();
               } catch (Exception var84) {
                  var10001 = false;
                  return;
               }

               var283[var263] = null;

               label2010: {
                  try {
                     if (var269 != Char.myCharz().charID) {
                        var283[var263] = GameSrc.a(var269);
                        break label2010;
                     }
                  } catch (Exception var87) {
                     var10001 = false;
                     return;
                  }

                  try {
                     var283[var263] = Char.myCharz();
                  } catch (Exception var83) {
                     var10001 = false;
                     return;
                  }
               }

               try {
                  var287[var263] = var0.a().readInt();
               } catch (Exception var82) {
                  var10001 = false;
                  return;
               }
            }

            try {
               var284.a(var283, var287, var1);
            } catch (Exception var81) {
               var10001 = false;
               break;
            }
         }

         if (var1 == 3 || var1 == 4 || var1 == 5 || var1 == 7) {
            s var285;
            try {
               var285 = pasta.i.a();
            } catch (Exception var79) {
               var10001 = false;
               break;
            }

            if (var285 == null) {
               break;
            }

            if (var1 == 7) {
               try {
                  var285.m = -1000;
                  var285.l = -1000;
                  var285.z = -1000;
                  var285.y = -1000;
                  var285.f = -1000;
                  var285.e = -1000;
               } catch (Exception var71) {
                  var10001 = false;
               }
               break;
            }

            if (var1 == 3 || var1 == 4) {
               try {
                  var266 = var0.a().readByte();
                  var291 = new Char[var266];
                  var288 = new int[var266];
               } catch (Exception var78) {
                  var10001 = false;
                  break;
               }

               for(var263 = 0; var263 < var266; ++var263) {
                  try {
                     var269 = var0.a().readInt();
                  } catch (Exception var77) {
                     var10001 = false;
                     return;
                  }

                  var291[var263] = null;

                  label2014: {
                     try {
                        if (var269 != Char.myCharz().charID) {
                           var291[var263] = GameSrc.a(var269);
                           break label2014;
                        }
                     } catch (Exception var80) {
                        var10001 = false;
                        return;
                     }

                     try {
                        var291[var263] = Char.myCharz();
                     } catch (Exception var76) {
                        var10001 = false;
                        return;
                     }
                  }

                  try {
                     var288[var263] = var0.a().readInt();
                  } catch (Exception var75) {
                     var10001 = false;
                     return;
                  }
               }

               try {
                  var285.a(var291, var288, var1);
               } catch (Exception var74) {
                  var10001 = false;
                  break;
               }
            }

            if (var1 == 5) {
               try {
                  var285.b(var0.a().readShort());
               } catch (Exception var73) {
                  var10001 = false;
                  break;
               }
            }
         }

         if (var1 > 9 && var1 < 30) {
            try {
               a(var0, var1);
            } catch (Exception var72) {
               var10001 = false;
            }
         }
         break;
      case 113:
         try {
            var271 = var0.a().readByte();
            byte var272 = var0.a().readByte();
            var270 = var0.a().readUnsignedByte();
            var265 = var0.a().readShort();
            var14 = var0.a().readShort();
            var264 = var0.a().readShort();
            var257 = new cx(var270, var265, var14, var272, var271, var264);
            dh.a(var257);
         } catch (Exception var69) {
            var10001 = false;
         }
         break;
      case 121:
         try {
            dz.a = var0.a().readUTF();
            var0.a().readUTF();
            var255 = new StringBuffer("SHOW AD public ID= ");
            var255.append(dz.a);
         } catch (Exception var68) {
            var10001 = false;
         }
         break;
      case 122:
         try {
            var8 = var0.a().readShort();
            var255 = new StringBuffer("second login = ");
            var255.append(var8);
            ek.a = var8;
            var20 = System.currentTimeMillis();
            ek.a = var20;
            ek.b = var20;
            main.a.f();
         } catch (Exception var67) {
            var10001 = false;
         }
         break;
      case 123:
         label2018: {
            try {
               var263 = var0.a().readInt();
               var9 = var0.a().readShort();
               var8 = var0.a().readShort();
               var1 = var0.a().readByte();
               var255 = new StringBuffer("SET POSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSss x= ");
               var255.append(var9).append(" y= ").append(var8).append("chaPos= ").append(var263).append("type Pos= ").append(var1);
               if (var263 == Char.myCharz().charID) {
                  var256 = Char.myCharz();
                  break label2018;
               }
            } catch (Exception var66) {
               var10001 = false;
               break;
            }

            try {
               if (GameSrc.a(var263) != null) {
                  var256 = GameSrc.a(var263);
                  break label2018;
               }
            } catch (Exception var65) {
               var10001 = false;
               break;
            }

            var256 = null;
         }

         if (var256 != null) {
            short var267;
            if (var1 == 0) {
               var267 = 60;
            } else {
               var267 = 173;
            }

            try {
               y.a(var267, var256, 1);
               var256.a(var9, var8, var1);
            } catch (Exception var64) {
               var10001 = false;
            }
         }
         break;
      case 124:
         try {
            var8 = var0.a().readShort();
            var254 = var0.a().readUTF();
            var280 = new StringBuffer("noi chuyen = ");
            var280.append(var254).append("npc ID= ").append(var8);
            var282 = GameSrc.a(var8);
         } catch (Exception var63) {
            var10001 = false;
            break;
         }

         if (var282 != null) {
            try {
               var282.checkInfo(var254);
            } catch (Exception var62) {
               var10001 = false;
            }
         }
         break;
      case 125:
         try {
            var1 = var0.a().readByte();
            var263 = var0.a().readInt();
            if (var263 == Char.myCharz().charID) {
               Char.myCharz().a(var1);
               break;
            }
         } catch (Exception var248) {
            var10001 = false;
            break;
         }

         try {
            if (GameSrc.a(var263) != null) {
               GameSrc.a(var263).a(var1);
            }
         } catch (Exception var61) {
            var10001 = false;
         }
         break;
      case 127:
         label1205: {
            try {
               var10 = var0.a().readByte();
            } catch (Exception var60) {
               var10000 = var60;
               var10001 = false;
               break label1205;
            }

            byte var2;
            if (var10 == 0) {
               label2047: {
                  MyVector var25;
                  try {
                     v.a();
                     var25 = new MyVector("");
                     var14 = var0.a().readShort();
                  } catch (Exception var58) {
                     var10000 = var58;
                     var10001 = false;
                     break label2047;
                  }

                  var11 = 0;

                  for(var263 = 0; var263 < var14; var11 = var269) {
                     byte var6;
                     byte var7;
                     dc var24;
                     try {
                        var24 = new dc();
                        var16 = var0.a().readShort();
                        var15 = var0.a().readShort();
                        var6 = var0.a().readByte();
                        var7 = var0.a().readByte();
                        var1 = var0.a().readByte();
                        var2 = var0.a().readByte();
                     } catch (Exception var56) {
                        var10000 = var56;
                        var10001 = false;
                        break label2047;
                     }

                     if (var2 == 0) {
                        try {
                           var12 = var0.a().readShort();
                        } catch (Exception var55) {
                           var10000 = var55;
                           var10001 = false;
                           break label2047;
                        }

                        var22 = null;
                     } else {
                        try {
                           var13 = var0.a().readShort();
                           var17 = var0.a().readShort();
                           var12 = var0.a().readShort();
                           short var18 = var0.a().readShort();
                           var22 = new Char();
                           var22.V = var13;
                           var22.X = var17;
                           var22.W = var12;
                           var22.Y = var18;
                        } catch (Exception var54) {
                           var10000 = var54;
                           var10001 = false;
                           break label2047;
                        }

                        var12 = -1;
                     }

                     byte var3;
                     byte var5;
                     String var26;
                     String var27;
                     try {
                        var26 = var0.a().readUTF();
                        var27 = var0.a().readUTF();
                        var3 = var0.a().readByte();
                        var5 = var0.a().readByte();
                        var268 = var0.a().readByte();
                     } catch (Exception var53) {
                        var10000 = var53;
                        var10001 = false;
                        break label2047;
                     }

                     var23 = null;
                     if (var268 != 0) {
                        try {
                           var23 = new db[var268];
                        } catch (Exception var52) {
                           var10000 = var52;
                           var10001 = false;
                           break label2047;
                        }

                        var270 = 0;

                        while(true) {
                           try {
                              if (var270 >= var23.length) {
                                 break;
                              }
                           } catch (Exception var57) {
                              var10000 = var57;
                              var10001 = false;
                              break label2047;
                           }

                           byte var4;
                           int var277;
                           int var279;
                           try {
                              var277 = var0.a().readUnsignedByte();
                              var279 = var0.a().readUnsignedShort();
                              var4 = var0.a().readByte();
                           } catch (Exception var51) {
                              var10000 = var51;
                              var10001 = false;
                              break label2047;
                           }

                           if (var277 != -1) {
                              db var28;
                              try {
                                 var28 = new db(var277, var279);
                              } catch (Exception var50) {
                                 var10000 = var50;
                                 var10001 = false;
                                 break label2047;
                              }

                              var23[var270] = var28;

                              try {
                                 var23[var270].a = var4;
                              } catch (Exception var49) {
                                 var10000 = var49;
                                 var10001 = false;
                                 break label2047;
                              }
                           }

                           ++var270;
                        }
                     }

                     try {
                        var24.a = var16;
                        var24.b = var263 + 1;
                        var24.c = var15;
                        var24.a = var6;
                        var24.d = var2;
                     } catch (Exception var48) {
                        var10000 = var48;
                        var10001 = false;
                        break label2047;
                     }

                     if (var12 != -1) {
                        try {
                           i var301 = new i();
                           var24.a = var301;
                           var24.a.r = var12;
                        } catch (Exception var47) {
                           var10000 = var47;
                           var10001 = false;
                           break label2047;
                        }
                     }

                     try {
                        var24.a = var26;
                        var24.b = var27;
                        var24.a = var22;
                        var24.a = var23;
                        var24.a();
                        var24.a(var3);
                        var24.b(var5);
                        var24.a(var7, var1);
                        var25.addElement(var24);
                     } catch (Exception var46) {
                        var10000 = var46;
                        var10001 = false;
                        break label2047;
                     }

                     var269 = var11;
                     if (var3 > 0) {
                        var269 = var11 + 1;
                     }

                     ++var263;
                  }

                  try {
                     v.a().a(var25, var11, var14);
                     return;
                  } catch (Exception var37) {
                     var10000 = var37;
                     var10001 = false;
                  }
               }
            } else if (var10 == 1) {
               label1147: {
                  try {
                     var264 = var0.a().readShort();
                     var1 = var0.a().readByte();
                     if (dc.a(v.a, var264) != null) {
                        dc.a(v.a, var264).b(var1);
                     }
                  } catch (Exception var44) {
                     var10000 = var44;
                     var10001 = false;
                     break label1147;
                  }

                  try {
                     v.onCancelChat();
                     return;
                  } catch (Exception var38) {
                     var10000 = var38;
                     var10001 = false;
                  }
               }
            } else if (var10 == 2) {
               label2052: {
                  try {
                     var12 = var0.a().readShort();
                     var1 = var0.a().readByte();
                  } catch (Exception var59) {
                     var10000 = var59;
                     var10001 = false;
                     break label2052;
                  }

                  var263 = 0;
                  var11 = 0;

                  while(true) {
                     try {
                        if (var11 >= v.a.size()) {
                           v.a.size();
                           v.goToMap(var263);
                           if (dc.a(v.b, var12) != null) {
                              dc.a(v.b, var12).a(var1);
                           }

                           return;
                        }
                     } catch (Exception var41) {
                        var10000 = var41;
                        var10001 = false;
                        break;
                     }

                     dc var252;
                     try {
                        var252 = (dc)v.a.elementAt(var11);
                     } catch (Exception var40) {
                        var10000 = var40;
                        var10001 = false;
                        break;
                     }

                     if (var252 != null) {
                        label2054: {
                           try {
                              if (var252.a == var12) {
                                 var252.a(var1);
                              }
                           } catch (Exception var39) {
                              var10000 = var39;
                              var10001 = false;
                              break;
                           }

                           try {
                              if (var252.e <= 0) {
                                 break label2054;
                              }
                           } catch (Exception var42) {
                              var10000 = var42;
                              var10001 = false;
                              break;
                           }

                           ++var263;
                        }
                     }

                     ++var11;
                  }
               }
            } else {
               label2055: {
                  if (var10 != 3) {
                     return;
                  }

                  try {
                     var264 = var0.a().readShort();
                     var2 = var0.a().readByte();
                     var1 = var0.a().readByte();
                     if (dc.a(v.a, var264) != null) {
                        dc.a(v.a, var264).a(var2, var1);
                     }
                  } catch (Exception var45) {
                     var10000 = var45;
                     var10001 = false;
                     break label2055;
                  }

                  try {
                     if (dc.a(v.b, var264) != null) {
                        dc.a(v.b, var264).a(var2, var1);
                     }

                     return;
                  } catch (Exception var43) {
                     var10000 = var43;
                     var10001 = false;
                  }
               }
            }
         }

         var253 = var10000;

         try {
            var253.printStackTrace();
         } catch (Exception var35) {
            var10001 = false;
         }
      }

   }

   private static void a(Message var0, int var1) {
      Exception var10000;
      label99: {
         bm var8;
         boolean var10001;
         try {
            var8 = pasta.i.a(var0.a().readByte());
         } catch (Exception var19) {
            var10000 = var19;
            var10001 = false;
            break label99;
         }

         if (var8 == null) {
            try {
               System.out.println("--boss new nulllllllll");
               return;
            } catch (Exception var9) {
               var10000 = var9;
               var10001 = false;
            }
         } else {
            label102: {
               if (var1 == 10) {
                  try {
                     var8.a(var0.a().readShort(), var0.a().readShort());
                  } catch (Exception var18) {
                     var10000 = var18;
                     var10001 = false;
                     break label102;
                  }
               }

               if (var1 >= 11 && var1 <= 20) {
                  byte var4;
                  Char[] var6;
                  int[] var7;
                  try {
                     var4 = var0.a().readByte();
                     var6 = new Char[var4];
                     var7 = new int[var4];
                  } catch (Exception var16) {
                     var10000 = var16;
                     var10001 = false;
                     break label102;
                  }

                  for(int var3 = 0; var3 < var4; ++var3) {
                     int var5;
                     try {
                        var5 = var0.a().readInt();
                     } catch (Exception var15) {
                        var10000 = var15;
                        var10001 = false;
                        break label102;
                     }

                     var6[var3] = null;

                     label105: {
                        try {
                           if (var5 != Char.myCharz().charID) {
                              var6[var3] = GameSrc.a(var5);
                              break label105;
                           }
                        } catch (Exception var17) {
                           var10000 = var17;
                           var10001 = false;
                           break label102;
                        }

                        try {
                           var6[var3] = Char.myCharz();
                        } catch (Exception var14) {
                           var10000 = var14;
                           var10001 = false;
                           break label102;
                        }
                     }

                     try {
                        var7[var3] = var0.a().readInt();
                     } catch (Exception var13) {
                        var10000 = var13;
                        var10001 = false;
                        break label102;
                     }
                  }

                  try {
                     byte var2 = var0.a().readByte();
                     var8.a(var6, var7, (byte)(var1 - 10), var2);
                  } catch (Exception var12) {
                     var10000 = var12;
                     var10001 = false;
                     break label102;
                  }
               }

               if (var1 == 21) {
                  try {
                     var8.y = var0.a().readShort();
                     var8.z = var0.a().readShort();
                     var8.m();
                  } catch (Exception var11) {
                     var10000 = var11;
                     var10001 = false;
                     break label102;
                  }
               }

               if (var1 != 23) {
                  return;
               }

               try {
                  var8.n();
                  return;
               } catch (Exception var10) {
                  var10000 = var10;
                  var10001 = false;
               }
            }
         }
      }

      Exception var20 = var10000;
      var20.printStackTrace();
   }

   public static void a(dm var0, int var1, int var2, int var3) {
      var0.a(var3);
      var0.e(var1, var2, 1, 2);
   }

   private static void b(Message var0) {
      int var3 = 0;
      byte var4 = 0;

      IOException var10000;
      label69: {
         byte var5;
         boolean var10001;
         try {
            var5 = var0.a().readByte();
         } catch (IOException var13) {
            var10000 = var13;
            var10001 = false;
            break label69;
         }

         short[] var6;
         if (var5 == 0) {
            label74: {
               try {
                  var5 = var0.a().readByte();
                  var6 = new short[var5];
               } catch (IOException var9) {
                  var10000 = var9;
                  var10001 = false;
                  break label74;
               }

               for(var3 = var4; var3 < var5; ++var3) {
                  try {
                     var6[var3] = var0.a().readShort();
                  } catch (IOException var8) {
                     var10000 = var8;
                     var10001 = false;
                     break label74;
                  }
               }

               try {
                  byte var1 = var0.a().readByte();
                  var3 = var0.a().readInt();
                  short var2 = var0.a().readShort();
                  w.a().a(var6, var1, var3, var2);
                  return;
               } catch (IOException var7) {
                  var10000 = var7;
                  var10001 = false;
               }
            }
         } else {
            label76: {
               if (var5 != 1) {
                  return;
               }

               byte var15;
               try {
                  var15 = var0.a().readByte();
                  var6 = new short[var15];
               } catch (IOException var12) {
                  var10000 = var12;
                  var10001 = false;
                  break label76;
               }

               for(; var3 < var15; ++var3) {
                  try {
                     var6[var3] = var0.a().readShort();
                  } catch (IOException var11) {
                     var10000 = var11;
                     var10001 = false;
                     break label76;
                  }
               }

               try {
                  w.a().a(var6);
                  return;
               } catch (IOException var10) {
                  var10000 = var10;
                  var10001 = false;
               }
            }
         }
      }

      IOException var14 = var10000;
      var14.printStackTrace();
   }
}
