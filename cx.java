package pasta;

import java.io.InputStream;

public final class cx {
   public static MyVector a = new MyVector("vLastEff");
   public static MyVector b = new MyVector("vNewEff");
   private static MyVector c = new MyVector("vEffData");
   public int a;
   private Char a;
   private boolean a;
   private int[] a;
   public int b;
   private boolean b = true;
   private int[] b;
   public int c;
   private boolean c;
   private int[] c;
   public int d;
   private int[] d;
   public int e;
   private int[] e;
   public int f;
   public int g;
   public int h;
   public int i = 0;
   public int j = 0;
   private int k;
   private int l;
   private int m;
   private int n;

   public cx() {
      int[] var1 = new int[10];
      var1[5] = 1;
      var1[6] = 1;
      var1[7] = 1;
      var1[8] = 1;
      var1[9] = 1;
      this.a = var1;
      this.b = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
      this.c = new int[]{4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
      this.d = new int[]{6, 6, 6, 6, 6, 7, 7, 7, 7, 7};
      this.e = new int[]{8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
      this.c = false;
   }

   public cx(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = new int[10];
      var7[5] = 1;
      var7[6] = 1;
      var7[7] = 1;
      var7[8] = 1;
      var7[9] = 1;
      this.a = var7;
      this.b = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
      this.c = new int[]{4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
      this.d = new int[]{6, 6, 6, 6, 6, 7, 7, 7, 7, 7};
      this.e = new int[]{8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
      this.c = false;
      this.f = var2;
      this.g = var3;
      this.a = var1;
      this.h = var4;
      this.l = var5;
      this.m = var6;
      if (a(var1) == null) {
         bl var10 = new bl();
         var10.a = var1;
         var2 = var1;
         if (var1 >= 42) {
            var2 = var1;
            if (var1 <= 46) {
               var2 = 106;
            }
         }

         String var9 = "/x" + dm.a + "/effectdata/" + var2 + "/data";
         InputStream var12 = null;

         label39: {
            InputStream var8;
            try {
               var8 = pasta.e.a(var9);
            } catch (Exception var11) {
               break label39;
            }

            var12 = var8;
         }

         if (var12 == null) {
            av.a().a((short)var2);
         } else {
            if (var2 > 100 && var2 < 200) {
               var10.b(var9);
            } else {
               var10.a(var9);
            }

            var10.a = dz.b("/effectdata/" + var2 + "/img.png");
         }

         a(var10);
         a.addElement(String.valueOf(this.a));
      }

      this.c = -1;
      this.d = -1;
      this.b = 1;
      if (!a(String.valueOf(this.a))) {
         b.addElement(String.valueOf(this.a));
      }

   }

   public cx(int var1, Char var2, int var3, int var4, int var5, byte var6) {
      int[] var7 = new int[10];
      var7[5] = 1;
      var7[6] = 1;
      var7[7] = 1;
      var7[8] = 1;
      var7[9] = 1;
      this.a = var7;
      this.b = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
      this.c = new int[]{4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
      this.d = new int[]{6, 6, 6, 6, 6, 7, 7, 7, 7, 7};
      this.e = new int[]{8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
      this.c = false;
      this.a = var2;
      this.a = var1;
      this.h = var3;
      this.l = var4;
      this.m = var5;
      this.i = var6;
      if (a(var1) == null) {
         bl var8 = new bl();
         var8.a = var1;
         var3 = var1;
         if (var1 >= 42) {
            var3 = var1;
            if (var1 <= 46) {
               var3 = 106;
            }
         }

         String var9 = "/x" + dm.a + "/effectdata/" + var3 + "/data";
         InputStream var11 = null;

         label35: {
            InputStream var12;
            try {
               var12 = pasta.e.a(var9);
            } catch (Exception var10) {
               break label35;
            }

            var11 = var12;
         }

         if (var11 == null) {
            av.a().a((short)var3);
         } else {
            if (var3 > 100 && var3 < 200) {
               var8.b(var9);
            } else {
               var8.a(var9);
            }

            var8.a = dz.b("/effectdata/" + var3 + "/img.png");
         }

         a(var8);
      }

      this.c = -1;
      this.d = -1;
      this.j = -1;
      this.b = 4;
   }

   public static bl a(int var0) {
      int var1 = 0;

      bl var2;
      while(true) {
         if (var1 >= c.size()) {
            var2 = null;
            break;
         }

         bl var3 = (bl)c.elementAt(var1);
         var2 = var3;
         if (var3.a == var0) {
            break;
         }

         ++var1;
      }

      return var2;
   }

   public static void a(int var0) {
      for(int var1 = 0; var1 < c.size(); ++var1) {
         bl var2 = (bl)c.elementAt(var1);
         if (var2.a == var0) {
            c.removeElement(var2);
            break;
         }
      }

   }

   private static void a(bl var0) {
      c.addElement(var0);
      if (TileMap.mapId != 130 && c.size() > 10) {
         for(int var1 = 0; var1 < 5; ++var1) {
            c.removeElementAt(0);
         }
      }

   }

   private boolean a() {
      boolean var1;
      if (!this.b) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public static boolean a(String var0) {
      boolean var2 = false;

      for(int var1 = 0; var1 < b.size(); ++var1) {
         if (((String)b.elementAt(var1)).equals(var0)) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public final void a() {
      label315: {
         boolean var10001;
         label316: {
            try {
               if (this.a < 42 || this.a > 46) {
                  break label316;
               }

               if (this.a == 42) {
                  this.k = this.a[this.e];
               }
            } catch (Exception var30) {
               var10001 = false;
               break label315;
            }

            try {
               if (this.a == 43) {
                  this.k = this.b[this.e];
               }
            } catch (Exception var7) {
               var10001 = false;
               break label315;
            }

            try {
               if (this.a == 44) {
                  this.k = this.c[this.e];
               }
            } catch (Exception var6) {
               var10001 = false;
               break label315;
            }

            try {
               if (this.a == 45) {
                  this.k = this.d[this.e];
               }
            } catch (Exception var5) {
               var10001 = false;
               break label315;
            }

            try {
               if (this.a == 46) {
                  this.k = this.e[this.e];
               }
            } catch (Exception var4) {
               var10001 = false;
               break label315;
            }

            try {
               ++this.e;
               if (this.e > this.a.length - 1) {
                  this.e = 0;
               }

               return;
            } catch (Exception var3) {
               var10001 = false;
               break label315;
            }
         }

         label318: {
            label319: {
               int var1;
               try {
                  if (a(this.a) == null || a(this.a).a == null) {
                     return;
                  }

                  if (a(this.a).a == null) {
                     break label318;
                  }

                  if (this.c) {
                     break label319;
                  }

                  this.c = true;
                  var1 = a(this.a).a.length - 1;
               } catch (Exception var29) {
                  var10001 = false;
                  break label315;
               }

               if (var1 > 0) {
                  try {
                     if (this.b != 1) {
                        this.e = cq.b(0, var1);
                     }
                  } catch (Exception var18) {
                     var10001 = false;
                     break label315;
                  }
               }

               try {
                  if (this.b == 0) {
                     this.e = cq.b(this.c, this.d);
                  }
               } catch (Exception var17) {
                  var10001 = false;
                  break label315;
               }
            }

            label331: {
               label322: {
                  label323: {
                     label324: {
                        try {
                           switch(this.b) {
                           case 0:
                              break label322;
                           case 1:
                           case 3:
                              break label324;
                           case 2:
                              break label323;
                           case 4:
                              break;
                           default:
                              break label331;
                           }
                        } catch (Exception var28) {
                           var10001 = false;
                           break label315;
                        }

                        try {
                           this.f = this.a.b;
                           this.g = this.a.c;
                           if (this.e < a(this.a).a.length) {
                              ++this.e;
                           }
                           break label331;
                        } catch (Exception var22) {
                           var10001 = false;
                           break label315;
                        }
                     }

                     try {
                        if (this.e < a(this.a).a.length) {
                           ++this.e;
                        }
                        break label331;
                     } catch (Exception var24) {
                        var10001 = false;
                        break label315;
                     }
                  }

                  try {
                     if (this.e < a(this.a).a.length) {
                        ++this.e;
                     }
                  } catch (Exception var15) {
                     var10001 = false;
                     break label315;
                  }

                  try {
                     ++this.n;
                     if (this.n == this.m) {
                        this.n = 0;
                        this.j = cq.b(0, 2);
                     }
                     break label331;
                  } catch (Exception var23) {
                     var10001 = false;
                     break label315;
                  }
               }

               label271: {
                  try {
                     if (!cq.a(this.f - 50, this.g - 50, 100, 100, Char.myCharz().b, Char.myCharz().c) || this.e <= this.c || this.e >= this.d) {
                        break label271;
                     }

                     if (this.e < this.d) {
                        this.e = this.d;
                     }
                  } catch (Exception var27) {
                     var10001 = false;
                     break label315;
                  }

                  try {
                     this.a = true;
                  } catch (Exception var16) {
                     var10001 = false;
                     break label315;
                  }
               }

               try {
                  if (!this.a) {
                     ++this.e;
                     if (this.e == this.d) {
                        this.e = this.c;
                     }
                     break label331;
                  }
               } catch (Exception var26) {
                  var10001 = false;
                  break label315;
               }

               try {
                  if (this.e < a(this.a).a.length) {
                     ++this.e;
                  }
               } catch (Exception var25) {
                  var10001 = false;
                  break label315;
               }
            }

            try {
               if (this.e <= a(this.a).a.length - 1) {
                  this.k = a(this.a).a[this.e];
               }
            } catch (Exception var14) {
               var10001 = false;
               break label315;
            }
         }

         label328: {
            label232: {
               try {
                  if (this.e < a(this.a).a.length - 1) {
                     break label328;
                  }

                  if (this.b != 0 && this.b != 3) {
                     break label232;
                  }
               } catch (Exception var21) {
                  var10001 = false;
                  break label315;
               }

               try {
                  this.b = false;
               } catch (Exception var13) {
                  var10001 = false;
                  break label315;
               }
            }

            try {
               if (this.m == -1) {
                  dh.a.removeElement(this);
               }
            } catch (Exception var12) {
               var10001 = false;
               break label315;
            }

            try {
               if (this.b == 2) {
                  this.e = 0;
                  return;
               }
            } catch (Exception var11) {
               var10001 = false;
               break label315;
            }

            label219: {
               try {
                  if (this.b != 4) {
                     break label219;
                  }

                  if (this.l == -1) {
                     this.e = 0;
                     return;
                  }
               } catch (Exception var20) {
                  var10001 = false;
                  break label315;
               }

               try {
                  ++this.n;
                  if (this.n == this.m) {
                     this.n = 0;
                     --this.l;
                     this.e = 0;
                     if (this.l == 0) {
                        this.a.c(0, this.a);
                        return;
                     }
                  }

                  return;
               } catch (Exception var8) {
                  var10001 = false;
                  break label315;
               }
            }

            try {
               this.a = false;
               if (this.l == -1) {
                  ++this.n;
                  if (this.n == this.m) {
                     this.n = 0;
                     this.e = 0;
                     if (this.m > 1) {
                        this.j = cq.b(0, 2);
                        return;
                     }
                  }

                  return;
               }
            } catch (Exception var19) {
               var10001 = false;
               break label315;
            }

            try {
               ++this.n;
               if (this.n == this.m) {
                  this.n = 0;
                  --this.l;
                  this.e = 0;
                  if (this.l == 0) {
                     dh.a.removeElement(this);
                     return;
                  }
               }

               return;
            } catch (Exception var9) {
               var10001 = false;
               break label315;
            }
         }

         try {
            this.b = true;
            return;
         } catch (Exception var10) {
            var10001 = false;
         }
      }

      dh.a.removeElement(this);
   }

   public final void a(dm var1) {
      if (this.a() && a(this.a) != null && a(this.a).a != null) {
         a(this.a).a(var1, this.k, this.f, this.g, this.j, this.h);
      }

   }

   public final void a(dm var1, int var2, int var3) {
      if (this.a() && a(this.a).a != null) {
         a(this.a).a(var1, this.k, this.f + var2, this.g + var3, this.j, this.h);
      }

   }
}
