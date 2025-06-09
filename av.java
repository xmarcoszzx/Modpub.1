package pasta;

import java.io.DataOutputStream;
import java.io.IOException;

public final class av {
   public static long a;
   private static av a;
   public static boolean a;
   public static long b;
   public static long c;
   public static long d;
   ca a = at.a();

   public static Message a(byte var0) {
      Message var1 = new Message((byte)-29);
      var1.a().writeByte(var0);
      return var1;
   }

   public static av a() {
      if (a == null) {
         a = new av();
      }

      return a;
   }

   private static Message b(byte var0) {
      Message var1 = new Message((byte)-28);
      var1.a().writeByte(var0);
      return var1;
   }

   public final void a() {
      label152: {
         label151: {
            Message var1;
            Exception var2;
            label154: {
               label149: {
                  label148: {
                     try {
                        var1 = new Message((byte)112);
                        break label148;
                     } catch (Exception var21) {
                        var2 = var21;
                     } finally {
                        ;
                     }

                     var1 = null;
                     break label149;
                  }

                  try {
                     var1.a().writeByte(0);
                     this.a.a(var1);
                     break label151;
                  } catch (Exception var19) {
                     var2 = var19;
                  } finally {
                     break label154;
                  }
               }

               try {
                  var2.printStackTrace();
               } finally {
                  break label154;
               }

               break label152;
            }

            var1.a();
            throw var2;
         }

      }

   }

   public final void a(byte param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte param1, byte param2, byte param3, short param4) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte var1, byte var2, int var3) {
      label152: {
         label151: {
            Message var4;
            Exception var5;
            label154: {
               label149: {
                  label148: {
                     try {
                        var4 = new Message((byte)-59);
                        break label148;
                     } catch (Exception var24) {
                        var5 = var24;
                     } finally {
                        ;
                     }

                     var4 = null;
                     break label149;
                  }

                  try {
                     var4.a().writeByte(var1);
                     var4.a().writeByte(var2);
                     var4.a().writeInt(var3);
                     this.a.a(var4);
                     break label151;
                  } catch (Exception var22) {
                     var5 = var22;
                  } finally {
                     break label154;
                  }
               }

               try {
                  var5.printStackTrace();
               } finally {
                  break label154;
               }

               break label152;
            }

            var4.a();
            throw var5;
         }

      }

   }

   public final void a(byte param1, byte param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte param1, byte param2, short param3) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte param1, int param2, byte param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte param1, int param2, byte param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public final void a(char param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(int var1) {
      label152: {
         label151: {
            Message var2;
            Exception var3;
            label154: {
               label149: {
                  label148: {
                     try {
                        var2 = new Message((byte)-76);
                        break label148;
                     } catch (Exception var22) {
                        var3 = var22;
                     } finally {
                        ;
                     }

                     var2 = null;
                     break label149;
                  }

                  try {
                     var2.a().writeByte(var1);
                     this.a.a(var2);
                     break label151;
                  } catch (Exception var20) {
                     var3 = var20;
                  } finally {
                     break label154;
                  }
               }

               try {
                  var3.printStackTrace();
               } finally {
                  break label154;
               }

               break label152;
            }

            var2.a();
            throw var3;
         }

      }

   }

   public final void a(int param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(int var1, int var2) {
      label152: {
         label151: {
            Message var3;
            Object var4;
            label154: {
               label149: {
                  label148: {
                     try {
                        var3 = new Message((byte)-30);
                        var3.a().writeByte(16);
                        break label148;
                     } catch (Exception var23) {
                        var4 = var23;
                     } finally {
                        ;
                     }

                     var3 = null;
                     break label149;
                  }

                  try {
                     var3.a().writeByte(var1);
                     var3.a().writeShort(var2);
                     var4 = new StringBuffer("gửi tăng tiềm năng NUM= ");
                     ((StringBuffer)var4).append(var2).append(" type= ").append(var1);
                     this.a.a(var3);
                     break label151;
                  } catch (Exception var21) {
                     var4 = var21;
                  } finally {
                     break label154;
                  }
               }

               try {
                  ((Throwable)var4).printStackTrace();
               } finally {
                  break label154;
               }

               break label152;
            }

            var3.a();
            throw var4;
         }

      }

   }

   public final void a(int var1, int var2, int var3) {
      label152: {
         label151: {
            Message var4;
            Exception var5;
            label154: {
               label149: {
                  label148: {
                     try {
                        var4 = new Message((byte)22);
                        break label148;
                     } catch (Exception var24) {
                        var5 = var24;
                     } finally {
                        ;
                     }

                     var4 = null;
                     break label149;
                  }

                  try {
                     var4.a().writeByte(var1);
                     var4.a().writeByte(var2);
                     var4.a().writeByte(var3);
                     this.a.a(var4);
                     break label151;
                  } catch (Exception var22) {
                     var5 = var22;
                  } finally {
                     break label154;
                  }
               }

               try {
                  var5.printStackTrace();
               } finally {
                  break label154;
               }

               break label152;
            }

            var4.a();
            throw var5;
         }

      }

   }

   public final void a(int param1, String param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public final void a(int param1, byte[] param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(String param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(String param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(String var1, String var2, String var3, byte var4) {
      (new StringBuffer("Login ")).append(var1).append(" ").append(var2).append(" ").append(var3);

      try {
         Message var5 = a((byte)0);
         var5.a().writeUTF(var1);
         var5.a().writeUTF(var2);
         var5.a().writeUTF(var3);
         var5.a().writeByte(var4);
         var5.a().writeByte(ab.a);
         this.a.a(var5);
         var5.a();
      } catch (IOException var6) {
         var6.printStackTrace();
      }

   }

   public final void a(MyVector param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(MyVector var1, MyVector var2, int var3) {
      i var7 = null;
      byte var5 = 0;
      byte var6 = 0;
      byte var4 = 0;

      boolean var10001;
      try {
         StringBuffer var8 = new StringBuffer("SEND ATTACT vChar=  ");
         var8.append(var2.size());
      } catch (Exception var27) {
         var10001 = false;
         return;
      }

      if (var3 != 0) {
         Message var28;
         label184: {
            label185: {
               try {
                  if (var1.size() > 0 && var2.size() > 0) {
                     break label185;
                  }
               } catch (Exception var26) {
                  var10001 = false;
                  return;
               }

               label186: {
                  Message var29;
                  try {
                     if (var1.size() <= 0) {
                        break label186;
                     }

                     var29 = new Message((byte)54);
                  } catch (Exception var23) {
                     var10001 = false;
                     return;
                  }

                  var3 = var5;

                  while(true) {
                     try {
                        if (var3 >= var1.size()) {
                           break;
                        }
                     } catch (Exception var21) {
                        var10001 = false;
                        return;
                     }

                     label138: {
                        try {
                           var7 = (i)var1.elementAt(var3);
                           if (!var7.h) {
                              var29.a().writeByte(var7.q);
                              break label138;
                           }
                        } catch (Exception var22) {
                           var10001 = false;
                           return;
                        }

                        try {
                           var29.a().writeByte(-1);
                           var29.a().writeInt(var7.q);
                        } catch (Exception var11) {
                           var10001 = false;
                           return;
                        }
                     }

                     ++var3;
                  }

                  var28 = var29;
                  break label184;
               }

               var28 = var7;

               try {
                  if (var2.size() <= 0) {
                     break label184;
                  }

                  var28 = new Message((byte)-60);
               } catch (Exception var20) {
                  var10001 = false;
                  return;
               }

               var3 = var6;

               while(true) {
                  try {
                     if (var3 >= var2.size()) {
                        break label184;
                     }
                  } catch (Exception var19) {
                     var10001 = false;
                     return;
                  }

                  try {
                     Char var31 = (Char)var2.elementAt(var3);
                     var28.a().writeInt(var31.charID);
                  } catch (Exception var10) {
                     var10001 = false;
                     return;
                  }

                  ++var3;
               }
            }

            Message var32;
            if (var3 == 1) {
               try {
                  var32 = new Message((byte)-4);
               } catch (Exception var18) {
                  var10001 = false;
                  return;
               }
            } else if (var3 == 2) {
               try {
                  var32 = new Message((byte)67);
               } catch (Exception var17) {
                  var10001 = false;
                  return;
               }
            } else {
               var32 = null;
            }

            try {
               var32.a().writeByte(var1.size());
            } catch (Exception var16) {
               var10001 = false;
               return;
            }

            var3 = 0;

            while(true) {
               try {
                  if (var3 >= var1.size()) {
                     break;
                  }
               } catch (Exception var25) {
                  var10001 = false;
                  return;
               }

               try {
                  i var33 = (i)var1.elementAt(var3);
                  var32.a().writeByte(var33.q);
               } catch (Exception var15) {
                  var10001 = false;
                  return;
               }

               ++var3;
            }

            var3 = var4;

            while(true) {
               try {
                  if (var3 >= var2.size()) {
                     break;
                  }
               } catch (Exception var24) {
                  var10001 = false;
                  return;
               }

               Char var30;
               try {
                  var30 = (Char)var2.elementAt(var3);
               } catch (Exception var14) {
                  var10001 = false;
                  return;
               }

               if (var30 != null) {
                  try {
                     var32.a().writeInt(var30.charID);
                  } catch (Exception var13) {
                     var10001 = false;
                     return;
                  }
               } else {
                  try {
                     var32.a().writeInt(-1);
                  } catch (Exception var12) {
                     var10001 = false;
                     return;
                  }
               }

               ++var3;
            }

            var28 = var32;
         }

         if (var28 != null) {
            try {
               this.a.a(var28);
            } catch (Exception var9) {
               var10001 = false;
            }
         }
      }

   }

   public final void a(short var1) {
      label152: {
         label151: {
            Message var2;
            Exception var3;
            label154: {
               label149: {
                  label148: {
                     try {
                        var2 = new Message((byte)-66);
                        break label148;
                     } catch (Exception var22) {
                        var3 = var22;
                     } finally {
                        ;
                     }

                     var2 = null;
                     break label149;
                  }

                  try {
                     var2.a().writeShort(var1);
                     this.a.a(var2);
                     break label151;
                  } catch (Exception var20) {
                     var3 = var20;
                  } finally {
                     break label154;
                  }
               }

               try {
                  var3.printStackTrace();
               } finally {
                  break label154;
               }

               break label152;
            }

            var2.a();
            throw var3;
         }

      }

   }

   public final void a(short param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(short param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(Item[] param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(bf[] param1) {
      // $FF: Couldn't be decompiled
   }

   public final void b() {
      label152: {
         label151: {
            Message var1;
            Exception var2;
            label154: {
               label149: {
                  label148: {
                     try {
                        var1 = new Message((byte)-55);
                        break label148;
                     } catch (Exception var21) {
                        var2 = var21;
                     } finally {
                        ;
                     }

                     var1 = null;
                     break label149;
                  }

                  try {
                     this.a.a(var1);
                     break label151;
                  } catch (Exception var19) {
                     var2 = var19;
                  } finally {
                     break label154;
                  }
               }

               try {
                  var2.printStackTrace();
               } finally {
                  break label154;
               }

               break label152;
            }

            var1.a();
            throw var2;
         }

      }

   }

   public final void b(byte var1) {
      Message var2 = new Message((byte)-34);

      try {
         var2.a().writeByte(var1);
         this.a.a(var2);
         var2.a();
      } catch (Exception var3) {
      }

   }

   public final void b(byte param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   public final void b(byte param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void b(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void b(int var1, byte var2) {
      (new StringBuffer("REMOTE CLAN id = ")).append(var1).append(" role= ").append(var2);

      label162: {
         label161: {
            Message var3;
            Exception var4;
            label166: {
               label159: {
                  label158: {
                     try {
                        var3 = new Message((byte)-56);
                        break label158;
                     } catch (Exception var23) {
                        var4 = var23;
                     } finally {
                        ;
                     }

                     var3 = null;
                     break label159;
                  }

                  try {
                     var3.a().writeInt(var1);
                     var3.a().writeByte(var2);
                     this.a.a(var3);
                     break label161;
                  } catch (Exception var21) {
                     var4 = var21;
                  } finally {
                     break label166;
                  }
               }

               try {
                  var4.printStackTrace();
               } finally {
                  break label166;
               }

               break label162;
            }

            var3.a();
            throw var4;
         }

      }

   }

   public final void b(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void b(String param1) {
      // $FF: Couldn't be decompiled
   }

   public final void b(String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void b(short param1) {
      // $FF: Couldn't be decompiled
   }

   public final void c() {
      if (aa.a("clienttype") != -1) {
         dz.a = aa.a("clienttype");
      }

      try {
         Message var1 = a((byte)2);
         var1.a().writeByte(dz.a);
         var1.a().writeByte(dm.a);
         StringBuffer var2 = new StringBuffer("gui zoomlevel = ");
         var2.append(dm.a);
         var1.a().writeBoolean(false);
         var1.a().writeInt(main.a.i);
         var1.a().writeInt(main.a.j);
         var1.a().writeBoolean(bf.b);
         var1.a().writeBoolean(main.a.e);
         DataOutputStream var3 = var1.a();
         var2 = new StringBuffer(String.valueOf(System.getProperty("microedition.platform")));
         var3.writeUTF(var2.append("|2.2.9").toString());
         this.a.a(var1);
         var1.a();
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }

   public final void c(byte param1) {
      // $FF: Couldn't be decompiled
   }

   public final void c(byte param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   public final void c(byte param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void c(int var1) {
      label152: {
         label151: {
            Message var2;
            Exception var3;
            label154: {
               label149: {
                  label148: {
                     try {
                        var2 = new Message((byte)-54);
                        break label148;
                     } catch (Exception var22) {
                        var3 = var22;
                     } finally {
                        ;
                     }

                     var2 = null;
                     break label149;
                  }

                  try {
                     var2.a().writeInt(var1);
                     this.a.a(var2);
                     break label151;
                  } catch (Exception var20) {
                     var3 = var20;
                  } finally {
                     break label154;
                  }
               }

               try {
                  var3.printStackTrace();
               } finally {
                  break label154;
               }

               break label152;
            }

            var2.a();
            throw var3;
         }

      }

   }

   public final void c(String param1) {
      // $FF: Couldn't be decompiled
   }

   public final void c(short param1) {
      // $FF: Couldn't be decompiled
   }

   public final void d() {
      label102: {
         Message var1;
         label94: {
            label93: {
               try {
                  var1 = new Message((byte)-120);
                  break label93;
               } catch (Exception var13) {
               } finally {
                  ;
               }

               var1 = null;
               break label94;
            }

            Exception var2;
            try {
               this.a.a(var1);
               break label102;
            } catch (Exception var11) {
               var2 = var11;
            } finally {
               a = dz.a();
               var1.a();
               throw var2;
            }
         }

         a = dz.a();
         var1.a();
         return;
      }

   }

   public final void d(byte param1) {
      // $FF: Couldn't be decompiled
   }

   public final void d(int var1) {
      Message var2 = new Message((byte)21);

      try {
         var2.a().writeByte(var1);
         this.a.a(var2);
         var2.a();
      } catch (Exception var3) {
      }

   }

   public final void d(String param1) {
      // $FF: Couldn't be decompiled
   }

   public final void e() {
      Message var1;
      label101: {
         label93: {
            label92: {
               try {
                  try {
                     var1 = new Message((byte)-121);
                     break label92;
                  } catch (Exception var14) {
                  }
               } catch (Throwable var15) {
                  Object var2 = null;
                  b = dz.a();
                  ((Message)var2).a();
                  throw var15;
               }

               var1 = null;
               break label93;
            }

            try {
               this.a.a(var1);
               break label101;
            } catch (Exception var12) {
            } finally {
               ;
            }
         }

         b = dz.a();
         var1.a();
         return;
      }

      b = dz.a();
      var1.a();
   }

   public final void e(int var1) {
      label152: {
         label151: {
            Message var2;
            Exception var3;
            label154: {
               label149: {
                  label148: {
                     try {
                        var2 = new Message((byte)11);
                        break label148;
                     } catch (Exception var22) {
                        var3 = var22;
                     } finally {
                        ;
                     }

                     var2 = null;
                     break label149;
                  }

                  try {
                     var2.a().writeByte(var1);
                     this.a.a(var2);
                     break label151;
                  } catch (Exception var20) {
                     var3 = var20;
                  } finally {
                     break label154;
                  }
               }

               try {
                  var3.printStackTrace();
               } finally {
                  break label154;
               }

               break label152;
            }

            var2.a();
            throw var3;
         }

      }

   }

   public final void f() {
      Message var1 = new Message((byte)-23);
      this.a.a(var1);
      var1.a();
   }

   public final void f(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void g() {
      byte var1 = 1;
      (new StringBuffer("SEND MOVE")).append(Char.myCharz().b).append(",").append(Char.myCharz().c);
      int var3 = Char.myCharz().b;
      int var4 = Char.myCharz().R;
      int var2 = Char.myCharz().c - Char.myCharz().S;
      if (!Char.u && (var3 - var4 != 0 || var2 != 0) && !j.b && !Char.myCharz().b && Char.myCharz().c > 0 && !Char.myCharz().N) {
         Exception var10000;
         label100: {
            Message var6;
            boolean var10001;
            label101: {
               label102: {
                  label103: {
                     Char var5;
                     try {
                        var6 = new Message((byte)-7);
                        Char.myCharz().R = Char.myCharz().b;
                        Char.myCharz().S = Char.myCharz().c;
                        Char.myCharz();
                        Char.myCharz();
                        Char.myCharz();
                        Char.myCharz();
                        if (TileMap.a(Char.myCharz().b / TileMap.a, Char.myCharz().c / TileMap.a) != 0) {
                           break label103;
                        }

                        var6.a().writeByte(1);
                        if (!Char.myCharz().h) {
                           break label101;
                        }

                        if (Char.myCharz().q) {
                           break label102;
                        }

                        var5 = Char.myCharz();
                        var4 = var5.s;
                        var3 = Char.myCharz().ag / 100;
                     } catch (Exception var15) {
                        var10000 = var15;
                        var10001 = false;
                        break label100;
                     }

                     label75: {
                        try {
                           if (Char.myCharz().k != 1) {
                              break label75;
                           }
                        } catch (Exception var14) {
                           var10000 = var14;
                           var10001 = false;
                           break label100;
                        }

                        var1 = 2;
                     }

                     try {
                        var5.s = var4 - var1 * var3;
                        break label102;
                     } catch (Exception var12) {
                        var10000 = var12;
                        var10001 = false;
                        break label100;
                     }
                  }

                  try {
                     var6.a().writeByte(0);
                     break label101;
                  } catch (Exception var10) {
                     var10000 = var10;
                     var10001 = false;
                     break label100;
                  }
               }

               try {
                  if (Char.myCharz().s < 0) {
                     Char.myCharz().s = 0;
                  }
               } catch (Exception var13) {
                  var10000 = var13;
                  var10001 = false;
                  break label100;
               }

               try {
                  GameSrc.a().p = true;
                  GameSrc.a().N = 0;
               } catch (Exception var11) {
                  var10000 = var11;
                  var10001 = false;
                  break label100;
               }
            }

            try {
               var6.a().writeShort(Char.myCharz().b);
            } catch (Exception var9) {
               var10000 = var9;
               var10001 = false;
               break label100;
            }

            if (var2 != 0) {
               try {
                  var6.a().writeShort(Char.myCharz().c);
               } catch (Exception var8) {
                  var10000 = var8;
                  var10001 = false;
                  break label100;
               }
            }

            try {
               this.a.a(var6);
               ++GameSrc.v;
               var6.a();
               return;
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
            }
         }

         Exception var16 = var10000;
         var16.printStackTrace();
      }

   }

   public final void g(int var1) {
      (new StringBuffer("npc id")).append(var1);

      label162: {
         label161: {
            Message var2;
            Exception var3;
            label166: {
               label159: {
                  label158: {
                     try {
                        var2 = new Message((byte)33);
                        break label158;
                     } catch (Exception var22) {
                        var3 = var22;
                     } finally {
                        ;
                     }

                     var2 = null;
                     break label159;
                  }

                  try {
                     var2.a().writeShort(var1);
                     this.a.a(var2);
                     break label161;
                  } catch (Exception var20) {
                     var3 = var20;
                  } finally {
                     break label166;
                  }
               }

               try {
                  var3.printStackTrace();
               } finally {
                  break label166;
               }

               break label162;
            }

            var2.a();
            throw var3;
         }

      }

   }

   public final void h() {
      // $FF: Couldn't be decompiled
   }

   public final void h(int var1) {
      label152: {
         label151: {
            Message var2;
            Exception var3;
            label154: {
               label149: {
                  label148: {
                     try {
                        var2 = new Message((byte)37);
                        break label148;
                     } catch (Exception var22) {
                        var3 = var22;
                     } finally {
                        ;
                     }

                     var2 = null;
                     break label149;
                  }

                  try {
                     var2.a().writeInt(var1);
                     this.a.a(var2);
                     break label151;
                  } catch (Exception var20) {
                     var3 = var20;
                  } finally {
                     break label154;
                  }
               }

               try {
                  var3.printStackTrace();
               } finally {
                  break label154;
               }

               break label152;
            }

            var2.a();
            throw var3;
         }

      }

   }

   public final void i() {
      label152: {
         label151: {
            Message var1;
            Exception var2;
            label154: {
               label149: {
                  label148: {
                     try {
                        var1 = new Message((byte)50);
                        break label148;
                     } catch (Exception var21) {
                        var2 = var21;
                     } finally {
                        ;
                     }

                     var1 = null;
                     break label149;
                  }

                  try {
                     this.a.a(var1);
                     break label151;
                  } catch (Exception var19) {
                     var2 = var19;
                  } finally {
                     break label154;
                  }
               }

               try {
                  var2.printStackTrace();
               } finally {
                  break label154;
               }

               break label152;
            }

            var1.a();
            throw var2;
         }

      }

   }

   public final void i(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void j() {
      label152: {
         label151: {
            Message var1;
            Exception var2;
            label154: {
               label149: {
                  label148: {
                     try {
                        var1 = new Message((byte)-16);
                        break label148;
                     } catch (Exception var21) {
                        var2 = var21;
                     } finally {
                        ;
                     }

                     var1 = null;
                     break label149;
                  }

                  try {
                     this.a.a(var1);
                     break label151;
                  } catch (Exception var19) {
                     var2 = var19;
                  } finally {
                     break label154;
                  }
               }

               try {
                  var2.printStackTrace();
               } finally {
                  break label154;
               }

               break label152;
            }

            var1.a();
            throw var2;
         }

      }

   }

   public final void j(int var1) {
      label152: {
         label151: {
            Message var2;
            Exception var3;
            label154: {
               label149: {
                  label148: {
                     try {
                        var2 = new Message((byte)76);
                        break label148;
                     } catch (Exception var22) {
                        var3 = var22;
                     } finally {
                        ;
                     }

                     var2 = null;
                     break label149;
                  }

                  try {
                     var2.a().writeInt(var1);
                     this.a.a(var2);
                     break label151;
                  } catch (Exception var20) {
                     var3 = var20;
                  } finally {
                     break label154;
                  }
               }

               try {
                  var3.printStackTrace();
               } finally {
                  break label154;
               }

               break label152;
            }

            var2.a();
            throw var3;
         }

      }

   }

   public final void k() {
      // $FF: Couldn't be decompiled
   }

   public final void k(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void l() {
      // $FF: Couldn't be decompiled
   }

   public final void l(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void m() {
      // $FF: Couldn't be decompiled
   }

   public final void m(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void n() {
      // $FF: Couldn't be decompiled
   }

   public final void n(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void o() {
      // $FF: Couldn't be decompiled
   }

   public final void o(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void p() {
      label152: {
         label151: {
            Message var1;
            Exception var2;
            label154: {
               label149: {
                  label148: {
                     try {
                        var1 = new Message((byte)-33);
                        break label148;
                     } catch (Exception var21) {
                        var2 = var21;
                     } finally {
                        ;
                     }

                     var1 = null;
                     break label149;
                  }

                  try {
                     this.a.a(var1);
                     break label151;
                  } catch (Exception var19) {
                     var2 = var19;
                  } finally {
                     break label154;
                  }
               }

               try {
                  var2.printStackTrace();
               } finally {
                  break label154;
               }

               break label152;
            }

            var1.a();
            throw var2;
         }

      }

   }

   public final void p(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void q() {
      label152: {
         label151: {
            Message var1;
            Exception var2;
            label154: {
               label149: {
                  label148: {
                     try {
                        var1 = new Message((byte)-38);
                        break label148;
                     } catch (Exception var21) {
                        var2 = var21;
                     } finally {
                        ;
                     }

                     var1 = null;
                     break label149;
                  }

                  try {
                     this.a.a(var1);
                     break label151;
                  } catch (Exception var19) {
                     var2 = var19;
                  } finally {
                     break label154;
                  }
               }

               try {
                  var2.printStackTrace();
               } finally {
                  break label154;
               }

               break label152;
            }

            var1.a();
            throw var2;
         }

      }

   }

   public final void q(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void r() {
      label152: {
         label151: {
            Message var1;
            Exception var2;
            label154: {
               label149: {
                  label148: {
                     try {
                        var1 = new Message((byte)-114);
                        break label148;
                     } catch (Exception var21) {
                        var2 = var21;
                     } finally {
                        ;
                     }

                     var1 = null;
                     break label149;
                  }

                  try {
                     this.a.a(var1);
                     break label151;
                  } catch (Exception var19) {
                     var2 = var19;
                  } finally {
                     break label154;
                  }
               }

               try {
                  var2.printStackTrace();
               } finally {
                  break label154;
               }

               break label152;
            }

            var1.a();
            throw var2;
         }

      }

   }

   public final void r(int var1) {
      label152: {
         label151: {
            Message var2;
            Exception var3;
            label154: {
               label149: {
                  label148: {
                     try {
                        var2 = new Message((byte)-118);
                        break label148;
                     } catch (Exception var22) {
                        var3 = var22;
                     } finally {
                        ;
                     }

                     var2 = null;
                     break label149;
                  }

                  try {
                     var2.a().writeInt(var1);
                     this.a.a(var2);
                     break label151;
                  } catch (Exception var20) {
                     var3 = var20;
                  } finally {
                     break label154;
                  }
               }

               try {
                  var3.printStackTrace();
               } finally {
                  break label154;
               }

               break label152;
            }

            var2.a();
            throw var3;
         }

      }

   }

   public final void s(int var1) {
      label152: {
         label151: {
            Message var2;
            Exception var3;
            label154: {
               label149: {
                  label148: {
                     try {
                        var2 = new Message((byte)-30);
                        break label148;
                     } catch (Exception var22) {
                        var3 = var22;
                     } finally {
                        ;
                     }

                     var2 = null;
                     break label149;
                  }

                  try {
                     var2.a().writeByte(63);
                     var2.a().writeInt(var1);
                     this.a.a(var2);
                     break label151;
                  } catch (Exception var20) {
                     var3 = var20;
                  } finally {
                     break label154;
                  }
               }

               try {
                  var3.printStackTrace();
               } finally {
                  break label154;
               }

               break label152;
            }

            var2.a();
            throw var3;
         }

      }

   }
}
