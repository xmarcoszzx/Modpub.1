package pasta;

import main.GameMidlet;

final class eg implements Runnable {
   private at a;

   eg(at var1) {
      this.a = var1;
   }

   private void a(Message var1) {
      boolean var4 = false;
      byte var3 = var1.a().readByte();
      this.a.a = new byte[var3];

      int var2;
      for(var2 = 0; var2 < var3; ++var2) {
         this.a.a[var2] = var1.a().readByte();
      }

      for(var2 = 0; var2 < this.a.a.length - 1; ++var2) {
         byte[] var5 = this.a.a;
         int var6 = var2 + 1;
         var5[var6] ^= this.a.a[var2];
      }

      this.a.d = true;
      GameMidlet.c = var1.a().readUTF();
      GameMidlet.d = var1.a().readInt();
      if (var1.a().readByte() != 0) {
         var4 = true;
      }

      GameMidlet.f = var4;
      System.out.println("is connectt 2= " + GameMidlet.f);
      if (this.a.a && GameMidlet.f) {
         main.a.c();
      }

   }

   public final void run() {
      label217:
      while(true) {
         boolean var8;
         boolean var10001;
         try {
            var8 = this.a.a();
         } catch (Exception var26) {
            var10001 = false;
            break;
         }

         if (!var8) {
            break;
         }

         byte var1;
         try {
            var1 = this.a.a.readByte();
            if (this.a.d) {
               var1 = at.a(this.a, var1);
            }
         } catch (Exception var25) {
            var10001 = false;
            break;
         }

         int var33;
         Message var34;
         int var5;
         int var6;
         int var7;
         StringBuffer var11;
         if (var1 != -32 && var1 != -66 && var1 != 11 && var1 != -67 && var1 != -74 && var1 != -87 && var1 != 66) {
            label224: {
               try {
                  if (this.a.d) {
                     byte var3 = this.a.a.readByte();
                     byte var2 = this.a.a.readByte();
                     var33 = (at.a(this.a, var3) & 255) << 8 | at.a(this.a, var2) & 255;
                     break label224;
                  }
               } catch (Exception var32) {
                  var10001 = false;
                  break;
               }

               try {
                  var33 = this.a.a.readUnsignedShort();
               } catch (Exception var19) {
                  var10001 = false;
                  break;
               }
            }

            byte[] var35;
            try {
               var35 = new byte[var33];
            } catch (Exception var18) {
               var10001 = false;
               break;
            }

            var6 = 0;
            var5 = 0;

            while(var5 != -1 && var6 < var33) {
               try {
                  var7 = this.a.a.read(var35, var6, var33 - var6);
               } catch (Exception var17) {
                  var10001 = false;
                  break label217;
               }

               var5 = var7;
               if (var7 > 0) {
                  var6 += var7;

                  try {
                     at var36 = this.a;
                     var36.b += var6 + 5;
                     var5 = at.a().b + at.a().a;
                     var36 = this.a;
                     var11 = new StringBuffer(String.valueOf(var5 / 1024));
                     var36.a = var11.append(".").append(var5 % 1024 / 102).append("Kb").toString();
                  } catch (Exception var16) {
                     var10001 = false;
                     break label217;
                  }

                  var5 = var7;
               }
            }

            label227: {
               try {
                  if (!this.a.d) {
                     break label227;
                  }
               } catch (Exception var31) {
                  var10001 = false;
                  break;
               }

               var33 = 0;

               while(true) {
                  try {
                     if (var33 >= var35.length) {
                        break;
                     }
                  } catch (Exception var30) {
                     var10001 = false;
                     break label217;
                  }

                  try {
                     var35[var33] = at.a(this.a, var35[var33]);
                  } catch (Exception var15) {
                     var10001 = false;
                     break label217;
                  }

                  ++var33;
               }
            }

            try {
               var34 = new Message(var1, var35);
            } catch (Exception var14) {
               var10001 = false;
               break;
            }
         } else {
            byte[] var10;
            try {
               byte var4 = at.a(this.a, this.a.a.readByte());
               var7 = (at.a(this.a, this.a.a.readByte()) + 128 + (at.a(this.a, this.a.a.readByte()) + 128 << 8) << 8) + var4 + 128;
               var10 = new byte[var7];
            } catch (Exception var24) {
               var10001 = false;
               break;
            }

            var5 = 0;
            var33 = 0;

            while(var33 != -1 && var5 < var7) {
               try {
                  var6 = this.a.a.read(var10, var5, var7 - var5);
               } catch (Exception var23) {
                  var10001 = false;
                  break label217;
               }

               var33 = var6;
               if (var6 > 0) {
                  var5 += var6;

                  try {
                     at var9 = this.a;
                     var9.b += var5 + 5;
                     var33 = at.a().b + at.a().a;
                     var9 = this.a;
                     var11 = new StringBuffer(String.valueOf(var33 / 1024));
                     var9.a = var11.append(".").append(var33 % 1024 / 102).append("Kb").toString();
                  } catch (Exception var22) {
                     var10001 = false;
                     break label217;
                  }

                  var33 = var6;
               }
            }

            label231: {
               try {
                  if (!this.a.d) {
                     break label231;
                  }
               } catch (Exception var29) {
                  var10001 = false;
                  break;
               }

               var33 = 0;

               while(true) {
                  try {
                     if (var33 >= var10.length) {
                        break;
                     }
                  } catch (Exception var28) {
                     var10001 = false;
                     break label217;
                  }

                  try {
                     var10[var33] = at.a(this.a, var10[var33]);
                  } catch (Exception var21) {
                     var10001 = false;
                     break label217;
                  }

                  ++var33;
               }
            }

            try {
               var34 = new Message(var1, var10);
            } catch (Exception var20) {
               var10001 = false;
               break;
            }
         }

         Exception var10000;
         label161: {
            try {
               if (var34.a == -27) {
                  this.a(var34);
                  continue;
               }
            } catch (Exception var27) {
               var10000 = var27;
               var10001 = false;
               break label161;
            }

            try {
               this.a.a.a(var34);
               continue;
            } catch (Exception var13) {
               var10000 = var13;
               var10001 = false;
            }
         }

         Exception var37 = var10000;

         try {
            var37.printStackTrace();
         } catch (Exception var12) {
            var10001 = false;
            break;
         }
      }

      if (this.a.b) {
         if (this.a.a != null) {
            if (System.currentTimeMillis() - this.a.a > 500L) {
               this.a.a.c(this.a.a);
            } else {
               this.a.a.b(this.a.a);
            }
         }

         if (at.a(this.a) != null) {
            at.a(this.a);
         }
      }

   }
}
