package pasta;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class bl {
   public int a;
   public Image a;
   private br[] a;
   private em[] a;
   public short[] a;
   public int b;
   public int c;

   private void a(DataInputStream var1) {
      byte var12 = 0;

      byte var3;
      boolean var10001;
      try {
         var3 = var1.readByte();
         this.a = new em[var3];
      } catch (Exception var30) {
         var10001 = false;
         return;
      }

      int var2;
      for(var2 = 0; var2 < var3; ++var2) {
         em[] var14;
         em var15;
         try {
            var14 = this.a;
            var15 = new em();
         } catch (Exception var29) {
            var10001 = false;
            return;
         }

         var14[var2] = var15;

         try {
            this.a[var2].a = var1.readByte();
            this.a[var2].b = (short)var1.readUnsignedByte();
            this.a[var2].c = (short)var1.readUnsignedByte();
            this.a[var2].d = (short)var1.readUnsignedByte();
            this.a[var2].e = (short)var1.readUnsignedByte();
         } catch (Exception var28) {
            var10001 = false;
            return;
         }
      }

      try {
         this.a = new br[var1.readShort()];
      } catch (Exception var27) {
         var10001 = false;
         return;
      }

      int var7 = 0;
      short var6 = 0;
      short var5 = 0;
      int var31 = 0;
      var2 = 0;

      while(true) {
         try {
            if (var7 >= this.a.length) {
               this.a = new short[var1.readShort()];
               break;
            }
         } catch (Exception var26) {
            var10001 = false;
            return;
         }

         br var33;
         br[] var34;
         try {
            var34 = this.a;
            var33 = new br();
         } catch (Exception var21) {
            var10001 = false;
            return;
         }

         var34[var7] = var33;

         byte var13;
         try {
            var13 = var1.readByte();
            this.a[var7].a = new short[var13];
            this.a[var7].b = new short[var13];
            this.a[var7].a = new byte[var13];
         } catch (Exception var20) {
            var10001 = false;
            return;
         }

         int var9;
         for(int var8 = 0; var8 < var13; var2 = var9) {
            try {
               this.a[var7].a[var8] = var1.readShort();
               this.a[var7].b[var8] = var1.readShort();
               this.a[var7].a[var8] = var1.readByte();
            } catch (Exception var19) {
               var10001 = false;
               return;
            }

            short var4 = var6;
            short var11 = var5;
            int var10 = var31;
            var9 = var2;
            if (var7 == 0) {
               var4 = var6;

               try {
                  if (var6 > this.a[var7].a[var8]) {
                     var4 = this.a[var7].a[var8];
                  }
               } catch (Exception var25) {
                  var10001 = false;
                  return;
               }

               var6 = var5;

               try {
                  if (var5 > this.a[var7].b[var8]) {
                     var6 = this.a[var7].b[var8];
                  }
               } catch (Exception var24) {
                  var10001 = false;
                  return;
               }

               int var32 = var31;

               try {
                  if (var31 < this.a[var7].a[var8] + this.a[this.a[var7].a[var8]].d) {
                     var32 = this.a[var7].a[var8] + this.a[this.a[var7].a[var8]].d;
                  }
               } catch (Exception var23) {
                  var10001 = false;
                  return;
               }

               var31 = var2;

               try {
                  if (var2 < this.a[var7].b[var8] + this.a[this.a[var7].a[var8]].e) {
                     var31 = this.a[var7].b[var8] + this.a[this.a[var7].a[var8]].e;
                  }
               } catch (Exception var22) {
                  var10001 = false;
                  return;
               }

               try {
                  this.b = var32 - var4;
                  this.c = var31 - var6;
               } catch (Exception var18) {
                  var10001 = false;
                  return;
               }

               var9 = var31;
               var10 = var32;
               var11 = var6;
            }

            ++var8;
            var6 = var4;
            var5 = var11;
            var31 = var10;
         }

         ++var7;
      }

      var2 = var12;

      while(true) {
         try {
            if (var2 >= this.a.length) {
               break;
            }
         } catch (Exception var17) {
            var10001 = false;
            break;
         }

         try {
            this.a[var2] = var1.readShort();
         } catch (Exception var16) {
            var10001 = false;
            break;
         }

         ++var2;
      }

   }

   private void a(DataInputStream var1, byte var2) {
      byte var12 = 0;

      byte var4;
      boolean var10001;
      try {
         var4 = var1.readByte();
         this.a = new em[var4];
      } catch (Exception var33) {
         var10001 = false;
         return;
      }

      int var3;
      for(var3 = 0; var3 < var4; ++var3) {
         em var14;
         em[] var15;
         try {
            var15 = this.a;
            var14 = new em();
         } catch (Exception var32) {
            var10001 = false;
            return;
         }

         var15[var3] = var14;

         try {
            this.a[var3].a = var1.readByte();
         } catch (Exception var31) {
            var10001 = false;
            return;
         }

         if (var2 == 1) {
            try {
               this.a[var3].b = (short)var1.readUnsignedByte();
               this.a[var3].c = (short)var1.readUnsignedByte();
            } catch (Exception var30) {
               var10001 = false;
               return;
            }
         } else {
            try {
               this.a[var3].b = var1.readShort();
               this.a[var3].c = var1.readShort();
            } catch (Exception var29) {
               var10001 = false;
               return;
            }
         }

         try {
            this.a[var3].d = (short)var1.readUnsignedByte();
            this.a[var3].e = (short)var1.readUnsignedByte();
         } catch (Exception var28) {
            var10001 = false;
            return;
         }
      }

      try {
         this.a = new br[var1.readShort()];
      } catch (Exception var27) {
         var10001 = false;
         return;
      }

      int var7 = 0;
      short var6 = 0;
      short var35 = 0;
      var3 = 0;
      int var34 = 0;

      while(true) {
         try {
            if (var7 >= this.a.length) {
               this.a = new short[var1.readShort()];
               break;
            }
         } catch (Exception var26) {
            var10001 = false;
            return;
         }

         br[] var37;
         br var38;
         try {
            var37 = this.a;
            var38 = new br();
         } catch (Exception var21) {
            var10001 = false;
            return;
         }

         var37[var7] = var38;

         byte var13;
         try {
            var13 = var1.readByte();
            this.a[var7].a = new short[var13];
            this.a[var7].b = new short[var13];
            this.a[var7].a = new byte[var13];
         } catch (Exception var20) {
            var10001 = false;
            return;
         }

         int var9;
         for(int var8 = 0; var8 < var13; var34 = var9) {
            try {
               this.a[var7].a[var8] = var1.readShort();
               this.a[var7].b[var8] = var1.readShort();
               this.a[var7].a[var8] = var1.readByte();
            } catch (Exception var19) {
               var10001 = false;
               return;
            }

            short var5 = var6;
            short var11 = var35;
            int var10 = var3;
            var9 = var34;
            if (var7 == 0) {
               var5 = var6;

               try {
                  if (var6 > this.a[var7].a[var8]) {
                     var5 = this.a[var7].a[var8];
                  }
               } catch (Exception var25) {
                  var10001 = false;
                  return;
               }

               var6 = var35;

               try {
                  if (var35 > this.a[var7].b[var8]) {
                     var6 = this.a[var7].b[var8];
                  }
               } catch (Exception var24) {
                  var10001 = false;
                  return;
               }

               int var36 = var3;

               try {
                  if (var3 < this.a[var7].a[var8] + this.a[this.a[var7].a[var8]].d) {
                     var36 = this.a[var7].a[var8] + this.a[this.a[var7].a[var8]].d;
                  }
               } catch (Exception var23) {
                  var10001 = false;
                  return;
               }

               var3 = var34;

               try {
                  if (var34 < this.a[var7].b[var8] + this.a[this.a[var7].a[var8]].e) {
                     var3 = this.a[var7].b[var8] + this.a[this.a[var7].a[var8]].e;
                  }
               } catch (Exception var22) {
                  var10001 = false;
                  return;
               }

               try {
                  this.b = var36 - var5;
                  this.c = var3 - var6;
               } catch (Exception var18) {
                  var10001 = false;
                  return;
               }

               var9 = var3;
               var10 = var36;
               var11 = var6;
            }

            ++var8;
            var6 = var5;
            var35 = var11;
            var3 = var10;
         }

         ++var7;
      }

      var34 = var12;

      while(true) {
         try {
            if (var34 >= this.a.length) {
               break;
            }
         } catch (Exception var17) {
            var10001 = false;
            break;
         }

         try {
            this.a[var34] = var1.readShort();
         } catch (Exception var16) {
            var10001 = false;
            break;
         }

         ++var34;
      }

   }

   private void b(DataInputStream var1) {
      byte var12 = 0;

      Exception var10000;
      label155: {
         byte var3;
         StringBuffer var15;
         boolean var10001;
         try {
            var3 = var1.readByte();
            var15 = new StringBuffer("small num= ");
            var15.append(var3);
            this.a = new em[var3];
         } catch (Exception var30) {
            var10000 = var30;
            var10001 = false;
            break label155;
         }

         int var2;
         for(var2 = 0; var2 < var3; ++var2) {
            em[] var16;
            em var35;
            try {
               var16 = this.a;
               var35 = new em();
            } catch (Exception var29) {
               var10000 = var29;
               var10001 = false;
               break label155;
            }

            var16[var2] = var35;

            try {
               this.a[var2].a = var1.readByte();
               this.a[var2].b = var1.readByte();
               this.a[var2].c = var1.readByte();
               this.a[var2].d = var1.readByte();
               this.a[var2].e = var1.readByte();
            } catch (Exception var28) {
               var10000 = var28;
               var10001 = false;
               break label155;
            }
         }

         short var13;
         try {
            var13 = var1.readShort();
            var15 = new StringBuffer("nFrame= ");
            var15.append(var13).append("---------------------------");
            this.a = new br[var13];
         } catch (Exception var27) {
            var10000 = var27;
            var10001 = false;
            break label155;
         }

         int var7 = 0;
         short var6 = 0;
         short var4 = 0;
         int var32 = 0;
         var2 = 0;

         label131:
         while(true) {
            if (var7 >= var13) {
               short var34;
               try {
                  var34 = var1.readShort();
                  var15 = new StringBuffer("nFrame count = ");
                  var15.append(var34).append(" ...........................................................");
                  this.a = new short[var34];
               } catch (Exception var18) {
                  var10000 = var18;
                  var10001 = false;
                  break;
               }

               for(var2 = var12; var2 < var34; ++var2) {
                  try {
                     this.a[var2] = var1.readShort();
                  } catch (Exception var17) {
                     var10000 = var17;
                     var10001 = false;
                     break label131;
                  }
               }

               return;
            }

            br var36;
            br[] var37;
            try {
               var37 = this.a;
               var36 = new br();
            } catch (Exception var22) {
               var10000 = var22;
               var10001 = false;
               break;
            }

            var37[var7] = var36;

            byte var14;
            try {
               var14 = var1.readByte();
               this.a[var7].a = new short[var14];
               this.a[var7].b = new short[var14];
               this.a[var7].a = new byte[var14];
            } catch (Exception var21) {
               var10000 = var21;
               var10001 = false;
               break;
            }

            int var9;
            for(int var8 = 0; var8 < var14; var2 = var9) {
               try {
                  this.a[var7].a[var8] = var1.readShort();
                  this.a[var7].b[var8] = var1.readShort();
                  this.a[var7].a[var8] = var1.readByte();
               } catch (Exception var20) {
                  var10000 = var20;
                  var10001 = false;
                  break label131;
               }

               short var5 = var6;
               short var11 = var4;
               int var10 = var32;
               var9 = var2;
               if (var7 == 0) {
                  var5 = var6;

                  try {
                     if (var6 > this.a[var7].a[var8]) {
                        var5 = this.a[var7].a[var8];
                     }
                  } catch (Exception var26) {
                     var10000 = var26;
                     var10001 = false;
                     break label131;
                  }

                  var6 = var4;

                  try {
                     if (var4 > this.a[var7].b[var8]) {
                        var6 = this.a[var7].b[var8];
                     }
                  } catch (Exception var25) {
                     var10000 = var25;
                     var10001 = false;
                     break label131;
                  }

                  int var33 = var32;

                  try {
                     if (var32 < this.a[var7].a[var8] + this.a[this.a[var7].a[var8]].d) {
                        var33 = this.a[var7].a[var8] + this.a[this.a[var7].a[var8]].d;
                     }
                  } catch (Exception var24) {
                     var10000 = var24;
                     var10001 = false;
                     break label131;
                  }

                  var32 = var2;

                  try {
                     if (var2 < this.a[var7].b[var8] + this.a[this.a[var7].a[var8]].e) {
                        var32 = this.a[var7].b[var8] + this.a[this.a[var7].a[var8]].e;
                     }
                  } catch (Exception var23) {
                     var10000 = var23;
                     var10001 = false;
                     break label131;
                  }

                  try {
                     this.b = var33 - var5;
                     this.c = var32 - var6;
                  } catch (Exception var19) {
                     var10000 = var19;
                     var10001 = false;
                     break label131;
                  }

                  var9 = var32;
                  var10 = var33;
                  var11 = var6;
               }

               ++var8;
               var6 = var5;
               var4 = var11;
               var32 = var10;
            }

            ++var7;
         }
      }

      Exception var31 = var10000;
      var31.printStackTrace();
   }

   public final void a(String var1) {
      DataInputStream var2;
      try {
         InputStream var4 = e.a(var1);
         var2 = new DataInputStream(var4);
      } catch (Exception var3) {
         return;
      }

      this.b(var2);
   }

   public final void a(dm var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.a != null && this.a.length != 0) {
         br var15 = this.a[var2];

         for(var2 = 0; var2 < var15.a.length; ++var2) {
            byte var8 = var15.a[var2];

            int var7;
            em var14;
            label71: {
               for(var7 = 0; var7 < this.a.length; ++var7) {
                  if (this.a[var7].a == var8) {
                     var14 = this.a[var7];
                     break label71;
                  }
               }

               var14 = null;
            }

            boolean var10001;
            if (var5 == -1) {
               try {
                  var1.a(this.a, var14.b, var14.c, var14.d, var14.e, 0, var3 + var15.a[var2], var4 + var15.b[var2], 0);
               } catch (Exception var26) {
                  var10001 = false;
                  continue;
               }
            }

            int var9;
            short var10;
            int var11;
            int var13;
            Image var16;
            int var27;
            if (var5 == 0) {
               short var12;
               try {
                  var16 = this.a;
                  var11 = var14.b;
                  var27 = var14.c;
                  var13 = var14.d;
                  var9 = var14.e;
                  var10 = var15.a[var2];
                  var12 = var15.b[var2];
               } catch (Exception var25) {
                  var10001 = false;
                  continue;
               }

               if (var6 < 4 && var6 > 0) {
                  try {
                     var7 = main.a.o;
                  } catch (Exception var24) {
                     var10001 = false;
                     continue;
                  }
               } else {
                  var7 = 0;
               }

               try {
                  var1.a(var16, var11, var27, var13, var9, 0, var10 + var3, var12 + var4 - var7, 0);
               } catch (Exception var23) {
                  var10001 = false;
                  continue;
               }
            }

            int var32;
            if (var5 == 1) {
               short var28;
               short var29;
               int var30;
               try {
                  var16 = this.a;
                  var13 = var14.b;
                  var11 = var14.c;
                  var32 = var14.d;
                  var30 = var14.e;
                  var28 = var15.a[var2];
                  var29 = var15.b[var2];
               } catch (Exception var22) {
                  var10001 = false;
                  continue;
               }

               if (var6 < 4 && var6 > 0) {
                  try {
                     var7 = main.a.o;
                  } catch (Exception var21) {
                     var10001 = false;
                     continue;
                  }
               } else {
                  var7 = 0;
               }

               try {
                  var1.a(var16, var13, var11, var32, var30, 2, var3 - var28, var29 + var4 - var7, bk.b);
               } catch (Exception var20) {
                  var10001 = false;
                  continue;
               }
            }

            if (var5 == 2) {
               short var31;
               try {
                  var16 = this.a;
                  var27 = var14.b;
                  var32 = var14.c;
                  var13 = var14.d;
                  var9 = var14.e;
                  var10 = var15.a[var2];
                  var31 = var15.b[var2];
               } catch (Exception var19) {
                  var10001 = false;
                  continue;
               }

               if (var6 < 4 && var6 > 0) {
                  try {
                     var7 = main.a.o;
                  } catch (Exception var18) {
                     var10001 = false;
                     continue;
                  }
               } else {
                  var7 = 0;
               }

               try {
                  var1.a(var16, var27, var32, var13, var9, 7, var3 - var10, var31 + var4 - var7, bk.f);
               } catch (Exception var17) {
                  var10001 = false;
               }
            }
         }
      }

   }

   public final void a(byte[] var1) {
      this.b(new DataInputStream(new ByteArrayInputStream(var1)));
   }

   public final void a(byte[] var1, byte var2) {
      this.a(new DataInputStream(new ByteArrayInputStream(var1)), var2);
   }

   public final void b(String var1) {
      DataInputStream var4;
      try {
         InputStream var2 = e.a(var1);
         var4 = new DataInputStream(var2);
      } catch (Exception var3) {
         return;
      }

      this.a(var4);
   }
}
