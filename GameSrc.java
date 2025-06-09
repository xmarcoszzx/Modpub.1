package pasta;

import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.b;
import mod.Ativar;

public final class GameSrc extends ag implements az {
   private static Image A;
   private static Image B;
   private static Image C;
   private static Image D;
   private static Image E;
   private static Image F;
   private static Image G;
   public static int H;
   private static Image H;
   public static int I;
   private static Image I;
   public static int J;
   private static Image J;
   public static int K;
   private static Image K;
   public static int L;
   private static Image L;
   public static int Q;
   public static int R;
   public static int S;
   public static int T;
   private static int V;
   private static int W;
   private static int X;
   private static int Y;
   private static int Z;
   public static byte a;
   public static int a;
   public static long a;
   private static Vector a;
   public static Image a;
   private static b a;
   public static Char a;
   public static GameSrc a;
   public static MyVector a = new MyVector("vClan");
   private static cs a;
   public static dn a;
   public static boolean a = false;
   public static long[] a;
   private static Image[] a;
   public static aa[] a;
   public static al[] a;
   public static ba[] a;
   public static bj[] a;
   public static bo[] a;
   public static bu[] a;
   public static bz[] a;
   private static int aB;
   private static int aD;
   private static int aE;
   private static int aF;
   private static int aG;
   private static int aH;
   private static int aI;
   private static int aJ;
   private static int aK;
   private static int aL;
   private static int aN;
   private static int aO;
   private static int aP;
   private static int aR;
   private static int aS;
   private static int aT;
   private static int aU;
   private static int aa;
   private static int ab;
   private static int ac;
   private static int ad;
   private static int ag;
   private static int au;
   private static int az;
   public static byte b;
   public static int b;
   public static Image b;
   public static MyVector b;
   private static cs b;
   public static dn b;
   public static boolean b = false;
   public static al[] b;
   public static byte c;
   public static int c;
   public static Image c;
   public static MyVector c;
   public static boolean c;
   public static String[] c;
   public static byte d;
   public static int d;
   public static Image d;
   public static MyVector d;
   public static byte e;
   private static long e;
   public static Image e;
   public static MyVector e;
   public static byte f;
   private static long f;
   public static Image f;
   public static MyVector f;
   public static boolean f;
   public static byte g;
   public static Image g;
   public static MyVector g;
   public static int[] g;
   public static byte h;
   public static Image h;
   public static MyVector h;
   public static int[] h;
   public static byte i;
   public static int i;
   public static Image i;
   public static MyVector i;
   public static int j;
   public static Image j;
   private static MyVector j;
   public static int[] j;
   public static byte k;
   public static int k;
   public static Image k;
   public static int[] k;
   public static byte l;
   public static int l;
   public static Image l;
   public static boolean l;
   public static int[] l;
   public static int m;
   public static Image m;
   public static boolean m;
   public static int[] m;
   public static int n;
   public static Image n;
   public static boolean n;
   private static int[] n;
   public static int o;
   public static Image o;
   public static boolean o;
   private static int[] o;
   public static int p;
   public static Image p;
   private static int[] p;
   public static int q;
   public static Image q;
   private static int[] q;
   public static int r;
   public static Image r;
   public static boolean r;
   private static int[] r;
   public static int s;
   public static Image s;
   private static int[] s;
   public static int t;
   public static Image t;
   private static int[] t;
   public static int u;
   public static Image u;
   public static boolean u;
   private static int[] u;
   public static int v;
   public static Image v;
   private static int[] v;
   public static Image w;
   private static int[] w;
   public static int x;
   public static Image x;
   private static int[] x;
   public static int y;
   public static Image y;
   private static int[] y;
   public static Image z;
   private static int[] z;
   int A;
   private boolean A;
   private int[] A;
   public int B;
   private boolean B;
   private int[] B;
   public int C;
   private int[] C;
   public int D;
   private int[] D;
   public int E;
   private int[] E;
   public int F;
   public int G;
   public int M;
   public int N;
   public int O;
   public int P;
   public int U;
   public String a;
   private al a;
   public cw a;
   public dy a;
   public i a;
   public int[] a;
   public String[] a;
   public cl[] a;
   public dj[] a;
   private int aA = 0;
   private int aC = 0;
   private int aM;
   private int aQ;
   private int aV;
   private int aW;
   private int aX;
   private int aY;
   private int ae = 0;
   private int af;
   private int ah;
   private int ai;
   private int aj;
   private int ak;
   private int al;
   private int am;
   private int an;
   private int ao;
   private int ap;
   private int aq;
   private int ar;
   private int as;
   private int at;
   private int av = 0;
   private int aw = -1;
   private int ax;
   private int ay = -1;
   public long b;
   public String b;
   public int[] b;
   public String[] b;
   private long c;
   private String c;
   public int[] c;
   private long d;
   private String d = "";
   public cd d;
   public boolean d;
   public int[] d;
   private String[] d;
   public cd e;
   boolean e;
   public int[] e;
   private cd f;
   public int[] f;
   private long g;
   public boolean g;
   private long h;
   public boolean h;
   public boolean i = false;
   public int[] i;
   public byte j;
   public boolean j = false;
   public boolean k;
   public boolean p;
   public boolean q;
   public boolean s = false;
   public boolean t;
   private boolean v;
   public int w;
   private boolean w;
   private boolean x;
   private boolean y = false;
   public int z;
   private boolean z;

   static {
      new MyVector("vPtMap");
      b = new MyVector("vFriend");
      c = new MyVector("vEnemies");
      d = new MyVector("vCharInMap");
      e = new MyVector("vItemMap");
      j = new MyVector("vMobAttack");
      new MyVector("vSet");
      f = new MyVector("vMob");
      g = new MyVector("vNpc");
      h = new MyVector("vFlag");
      a = new cs();
      b = new cs();
      new MyVector("vItemUpGrade");
      c = false;
      a = dz.b("/mainImage/myTexture2dstat.png");
      b = dz.b("/mainImage/myTexture2dlineColor20.png");
      c = dz.b("/mainImage/myTexture2dlineColor21.png");
      d = dz.b("/mainImage/myTexture2dlineColor22.png");
      e = dz.b("/mainImage/myTexture2dlineColor00.png");
      f = dz.b("/mainImage/myTexture2dlineColor01.png");
      g = dz.b("/mainImage/myTexture2dlineColor02.png");
      i = 0;
      a = new dn();
      b = new dn();
      a = new b();
      y = 0;
      k = dz.b("/mainImage/myTexture2dbtnl.png");
      l = dz.b("/mainImage/myTexture2dbtnlf.png");
      m = dz.b("/mainImage/myTexture2dbtnl2.png");
      n = dz.b("/mainImage/myTexture2dbtnlf2.png");
      q = dz.b("/mainImage/myTexture2dpanel.png");
      r = dz.b("/mainImage/panel2.png");
      s = dz.b("/mainImage/myTexture2dHP.png");
      u = dz.b("/mainImage/SP.png");
      K = dz.b("/mainImage/myTexture2dhpLost.png");
      v = dz.b("/mainImage/myTexture2dmpLost.png");
      t = dz.b("/mainImage/myTexture2dMP.png");
      i = dz.b("/mainImage/myTexture2dskill.png");
      j = dz.b("/mainImage/myTexture2dskill2.png");
      h = dz.b("/mainImage/myTexture2dmenu.png");
      C = dz.b("/mainImage/myTexture2dfocus.png");
      if (main.a.e) {
         dz.b("/mainImage/myTexture2darrow.png");
         dz.b("/mainImage/myTexture2darrow2.png");
         A = dz.b("/mainImage/myTexture2dchat.png");
         B = dz.b("/mainImage/myTexture2dchat2.png");
         D = dz.b("/mainImage/myTexture2dfocus2.png");
         E = dz.b("/mainImage/myTexture2dPea0.png");
         F = dz.b("/mainImage/myTexture2dPea1.png");
         new StringBuffer("games--javaAnalog: false");
         o = dz.b("/mainImage/myTexture2danalog1.png");
         p = dz.b("/mainImage/myTexture2danalog2.png");
         G = dz.b("/mainImage/myTexture2dPea2.png");
         H = dz.b("/mainImage/myTexture2dPea3.png");
         I = dz.b("/mainImage/myTexture2dfirebtn0.png");
         J = dz.b("/mainImage/myTexture2dfirebtn1.png");
         byte var0;
         if (pasta.aa.a("analog") == 1) {
            var0 = 1;
         } else {
            var0 = 0;
         }

         y = var0;
         a = new b();
      }

      byte[] var1 = pasta.aa.a("NRdataVersion");
      byte[] var4 = pasta.aa.a("NRmapVersion");
      byte[] var2 = pasta.aa.a("NRskillVersion");
      byte[] var3 = pasta.aa.a("NRitemVersion");
      if (var1 != null) {
         a = var1[0];
      }

      if (var4 != null) {
         b = var4[0];
      }

      if (var2 != null) {
         c = var2[0];
      }

      if (var3 != null) {
         d = var3[0];
      }

      a = new al[5];
      b = new al[5];
      L = dz.b("/bg/trans.png");
      au = 0;
      w = dz.b("/mainImage/myTexture2dnut.png");
      x = dz.b("/mainImage/myTexture2dnutF.png");
      o = true;
      n = new int[]{3, -3, 3, -3};
      o = new int[]{3, -3, -3, 3};
      i = new MyVector("");
      z = dz.b("/mainImage/myTexture2darrow3.png");
      j = new int[5];
      k = new int[5];
      s = new int[5];
      t = new int[5];
      l = new int[5];
      c = new String[5];
      r = new int[5];
      u = new int[5];
      m = new int[8];

      for(int var5 = 0; var5 < 5; ++var5) {
         l[var5] = -1;
      }

      S = 140;
      T = 160;
      r = false;
      a = new Vector();
   }

   public GameSrc() {
      new cd("", 11021);
      this.e = new cd("  ", 11000);
      this.d = new cd("", 11001);
      this.e.a = h;
      this.e.d = dm.a(this.e.a) + 20;
      this.e.a = false;
      this.d.a = C;
      if (main.a.e) {
         this.e.b = 0;
         this.e.c = 50;
         this.d = null;
      } else {
         this.e.b = 0;
         this.e.c = b - 30;
         this.d.b = a - 32;
         this.d.c = b - 32;
      }

      super.c = this.d;
      I = 1;
      if (main.a.e) {
         c = true;
      }

   }

   public static byte a() {
      byte var0 = 0;
      if (Char.myCharz().a == null) {
         var0 = -1;
      } else {
         int var10001 = g.length;
         if (Char.myCharz().a.a <= var10001 - 1) {
            var0 = (byte)g[Char.myCharz().a.a];
         }
      }

      return var0;
   }

   public static int a() {
      int var0;
      if (Char.myCharz().a == null) {
         var0 = -1;
      } else {
         var0 = h[Char.myCharz().a.a];
      }

      return var0;
   }

   public static Char a(int var0) {
      int var1 = 0;

      Char var2;
      while(true) {
         if (var1 >= d.size()) {
            var2 = null;
            break;
         }

         Char var3 = (Char)d.elementAt(var1);
         var2 = var3;
         if (var3.charID == var0) {
            break;
         }

         ++var1;
      }

      return var2;
   }

   public static GameSrc a() {
      if (a == null) {
         a = new GameSrc();
      }

      return a;
   }

   private static as a(int var0, int var1) {
      as var9 = null;
      int var2 = 0;
      MyVector[] var11 = new MyVector[]{f, g, e, d};

      int var3;
      for(int var4 = 0; var4 < var11.length; ++var4) {
         for(int var5 = 0; var5 < var11[var4].size(); var2 = var3) {
            as var10;
            label36: {
               var10 = (as)var11[var4].elementAt(var5);
               if (!var10.f()) {
                  label34: {
                     if (var10 instanceof i) {
                        i var12 = (i)var10;
                        if (var12.h && var12.equals(Char.myCharz().b)) {
                           break label34;
                        }
                     }

                     int var6 = var10.a();
                     var3 = var10.b();
                     int var7 = var10.d();
                     int var8 = var10.c();
                     if (a(var0, var1, var6 - var7 / 2 - 30, var3 - var8 - 30, var7 + 60, var8 + 60)) {
                        if (var9 == null) {
                           var2 = cq.f(var0 - var6);
                           var3 = cq.f(var1 - var3) + var2;
                           var9 = var10;
                           if (var4 == 1) {
                              return var9;
                           }
                           break label36;
                        }

                        var6 = cq.f(var0 - var6);
                        var6 += cq.f(var1 - var3);
                        var3 = var6;
                        if (var6 < var2) {
                           break label36;
                        }
                     }
                  }
               }

               var3 = var2;
               var10 = var9;
            }

            var9 = var10;
            ++var5;
         }
      }

      return var9;
   }

   public static cm a() {
      int var0 = 0;

      cm var1;
      while(true) {
         if (var0 >= g.size()) {
            var1 = null;
            break;
         }

         cm var2 = (cm)g.elementAt(var0);
         var1 = var2;
         if (var2.all.a == a()) {
            break;
         }

         ++var0;
      }

      return var1;
   }

   public static cm a(short var0) {
      int var1 = 0;

      cm var2;
      while(true) {
         if (var1 >= g.size()) {
            var2 = null;
            break;
         }

         cm var3 = (cm)g.elementAt(var1);
         var2 = var3;
         if (var3.all.a == var0) {
            break;
         }

         ++var1;
      }

      return var2;
   }

   public static i a(byte var0) {
      return (i)f.elementAt(var0);
   }

   public static i a(int var0) {
      int var1 = 0;

      i var2;
      while(true) {
         if (var1 >= f.size()) {
            var2 = null;
            break;
         }

         i var3 = (i)f.elementAt(var1);
         var2 = var3;
         if (var3.q == var0) {
            break;
         }

         ++var1;
      }

      return var2;
   }

   public static void a(int var0, byte var1) {
      if (h.size() == 0) {
         pasta.av.a().b((byte)2, (byte)var1);
      } else {
         do var3;
         if (var0 == Char.myCharz().charID) {
            Char.myCharz();
            if (Char.a(var1)) {
               for(var0 = 0; var0 < h.size(); ++var0) {
                  var3 = (do)h.elementAt(var0);
                  if (var3 != null && var3.a == var1) {
                     Char.myCharz().Q = var3.a;
                  }
               }
            } else {
               Char.myCharz();
               if (!Char.a(var1)) {
                  pasta.av.a().b((byte)2, (byte)var1);
               }
            }
         } else if (a(var0) != null) {
            a(var0);
            if (Char.a(var1)) {
               for(int var2 = 0; var2 < h.size(); ++var2) {
                  var3 = (do)h.elementAt(var2);
                  if (var3 != null && var3.a == var1) {
                     a(var0).Q = var3.a;
                  }
               }
            } else {
               a(var0);
               if (!Char.a(var1)) {
                  pasta.av.a().b((byte)2, (byte)var1);
               }
            }
         }
      }

   }

   public static final void a(String var0, int var1, int var2, int var3, int var4) {
      int var5 = 0;

      while(true) {
         if (var5 >= 5) {
            var5 = -1;
            break;
         }

         if (l[var5] == -1) {
            break;
         }

         ++var5;
      }

      if (var5 != -1) {
         m[var5] = var4;
         c[var5] = var0;
         j[var5] = var1;
         k[var5] = var2;
         s[var5] = 0;
         int[] var6 = t;
         byte var7;
         if (var3 < 0) {
            var7 = -5;
         } else {
            var7 = 5;
         }

         var6[var5] = var7;
         l[var5] = 0;
         u[var5] = 0;
         r[var5] = 10;

         for(var1 = 0; var1 < 5; ++var1) {
            if (l[var1] != -1 && var5 != var1 && t[var5] < 0 && cq.f(j[var5] - j[var1]) <= 20 && r[var5] == r[var1]) {
               var6 = r;
               var6[var5] += 10;
            }
         }
      }

   }

   private void a(String var1, cd var2, cd var3) {
      this.a = new cw();
      this.a.a(var1, var2, var3);
   }

   public static void a(Image var0, Image var1, Image var2, float var3, float var4, float var5, dm var6) {
      int var11 = var6.c();
      int var8 = var6.d();
      int var10 = var6.e();
      int var9 = var6.f();
      var6.f((int)var3, (int)var4, (int)var5, 13);

      for(int var7 = 0; var7 < 4; ++var7) {
         var6.a(var1, (float)((var7 + 1) * 15) + var3, var4, 0);
      }

      var6.a(var0, var3, var4, 0);
      var6.a(var1, 100.0F + var3 - 30.0F, var4, 0);
      var6.a(var2, 100.0F + var3 - 15.0F, var4, 0);
      var6.f(var11, var8, var10, var9);
   }

   private void a(al var1, boolean var2) {
      if (TileMap.mapId != 112 && TileMap.mapId != 113 || Char.myCharz().d != 0) {
         if (Char.myCharz().a()) {
            this.b(var1);
         } else {
            this.aw = -1;
            if (var1 != null) {
               pasta.av.a().f(var1.a.a);
               this.n();
               Char.myCharz().a = var1;
               this.b(true);
            }
         }
      }

   }

   public static void a(dm var0, int var1) {
      for(int var2 = 0; var2 < TileMap.c.size(); ++var2) {
         by var3 = (by)TileMap.c.elementAt(var2);
         if (var3.a != -1 && var3.a == var1) {
            var3.a(var0);
         }
      }

      if (TileMap.mapId == 48 && var1 == 3 && !main.a.b && main.a.a != null && main.a.a[0] != 0) {
         for(var1 = 0; var1 < TileMap.c / main.a.a[0] + 1; ++var1) {
            var0.a(main.a.a[0], main.a.a[0] * var1, TileMap.d - main.a.b[0] - 70, 0);
         }
      }

   }

   private void a(dm var1, Char var2) {
      int var4 = var2.t * aN / var2.w;
      int var5 = var2.s * aP;
      int var6 = this.O * aN / var2.w;
      int var3 = this.M * aP;
      var1.f(main.a.i / 2 + 58 - dm.a(q), 0, 95, 100);
      var1.a(q, 0, dm.a(q), dm.b(q), 2, main.a.i / 2 + 60, 0, 24);
      var1.f(main.a.i / 2 + 60 - 83 - aN + aN - var6, 5, var6, 10);
      var1.a(K, main.a.i / 2 + 60 - 83, 5, 24);
      var1.f(0, 0, main.a.i, main.a.j);
      var1.f(main.a.i / 2 + 60 - 83 - aN + aN - var4, 5, var4, 10);
      var1.a(s, main.a.i / 2 + 60 - 83, 5, 24);
      var1.f(0, 0, main.a.i, main.a.j);
      var1.f(main.a.i / 2 + 60 - 83 - aP + aN - var3, 20, var3, 6);
      var1.a(v, main.a.i / 2 + 60 - 83, 20, 24);
      var1.f(0, 0, main.a.i, main.a.j);
      var1.f(main.a.i / 2 + 60 - 83 - aP + aN - var5, 20, var5, 6);
      var1.a(t, main.a.i / 2 + 60 - 83, 20, 24);
      var1.f(0, 0, main.a.i, main.a.j);
   }

   protected static void a(ds var0) {
      al var4 = Char.myCharz().a(var0);
      MyVector var2 = new MyVector("");

      for(int var1 = 0; var1 < 5; ++var1) {
         String var3 = String.valueOf(var1);
         var2.addElement(new cd(pasta.ab.bS + (var1 + 1), 11120, new Object[]{var4, var3}));
      }

      main.a.a.b(var2);
   }

   public static void a(String[] var0, cm var1) {
      MyVector var3 = new MyVector("");

      for(int var2 = 0; var2 < var0.length; ++var2) {
         var3.addElement(new cd(var0[var2], 11057, var1));
      }

      main.a.a.b(var3);
   }

   public static boolean a() {
      boolean var0;
      if (TileMap.mapId >= 53 && TileMap.mapId <= 62) {
         var0 = true;
      } else {
         var0 = false;
      }

      return var0;
   }

   private boolean a(int var1, int var2) {
      boolean var7;
      if (this.equals(b) && a().a != null) {
         var7 = false;
      } else {
         if (b.a.a != null && b.a.a.a != null) {
            int var3 = cq.f(b.b);
            int var6 = b.a.c;
            int var4 = cq.f(b.a);
            int var5 = b.a.d;
            if (a(var1 - k, var2 - l, var3 + var6 - 40, var4 + var5, 200, b.a.f)) {
               b.c = 10;
               var7 = true;
               return var7;
            }
         }

         var7 = false;
      }

      return var7;
   }

   public static final boolean a(int var0, int var1, int var2) {
      boolean var4 = true;
      byte var3;
      if (x[0] == -1) {
         var3 = 0;
      } else {
         var3 = 1;
      }

      if (x[var3] != -1) {
         var4 = false;
      } else {
         x[var3] = 0;
         z[var3] = var2;
         v[var3] = var0;
         w[var3] = var1;
      }

      return var4;
   }

   private static boolean a(int var0, int var1, int var2, int var3, int var4, int var5) {
      boolean var6;
      if (var0 >= var2 && var0 <= var2 + var4 && var1 >= var3 && var1 <= var3 + var5) {
         var6 = true;
      } else {
         var6 = false;
      }

      return var6;
   }

   private boolean a(as var1) {
      boolean var6 = false;
      boolean var5;
      if (var1 == null) {
         var5 = var6;
      } else {
         int var4 = var1.b();
         int var2 = Char.myCharz().c;
         var5 = var6;
         if (var4 < var2) {
            while(true) {
               var5 = var6;
               if (var4 >= var2) {
                  break;
               }

               int var3 = var2 - 5;
               var2 = var3;
               if (TileMap.a(Char.myCharz().b, var3, 8192)) {
                  this.z = 0;
                  Char.myCharz();
                  Char.myCharz().a = null;
                  var5 = true;
                  break;
               }
            }
         }
      }

      return var5;
   }

   public static boolean a(i var0) {
      boolean var2 = false;
      boolean var1;
      if (var0 == null) {
         var1 = var2;
      } else if (Char.myCharz().d == 5) {
         var1 = true;
      } else {
         if (Char.myCharz().g()) {
            var1 = var2;
            if (!var0.h) {
               return var1;
            }
         }

         if (Char.myCharz().b != null) {
            var1 = var2;
            if (var0.equals(Char.myCharz().b)) {
               return var1;
            }
         }

         Char var3 = a(var0.q);
         if (var3 == null) {
            var1 = true;
         } else if (var3.d == 5) {
            var1 = true;
         } else {
            Char.myCharz();
            var1 = var2;
            if (Char.b(var3)) {
               var1 = true;
            }
         }
      }

      return var1;
   }

   private static Char b() {
      int var0 = 0;

      Char var1;
      while(true) {
         if (var0 >= d.size()) {
            var1 = null;
            break;
         }

         Char var2 = (Char)d.elementAt(var0);
         if (var2.d != 0) {
            var1 = var2;
            if (var2 != myCharz()) {
               break;
            }
         }

         ++var0;
      }

      return var1;
   }

   private void b(al var1) {
      if ((TileMap.mapId != 112 && TileMap.mapId != 113 || Char.myCharz().d != 0) && this.f()) {
         this.aw = -1;
         if (var1 != null) {
            pasta.av.a().f(var1.a.a);
            this.n();
            Char.myCharz().a = var1;
            Char.myCharz();
            Char.l();
            Char.myCharz();
            this.z = 0;
         }
      }

   }

   public static void b(dm var0) {
      if (!main.a.b) {
         var0.a(L, main.a.i, main.a.j);
      }

   }

   private void b(dm var1, Char var2) {
      if (var2 != null && (!Char.myCharz().y || !pasta.c.a() || Char.b().w == 0)) {
         int var3;
         int var4;
         int var5;
         if (var2.charID == Char.myCharz().charID) {
            var3 = this.O * aN / var2.w;
            var4 = this.M * aP / var2.x;
            var5 = var2.t * aN / var2.w;
         } else {
            var3 = var2.am * aN / var2.w;
            var4 = var2.al * aP / 100;
            var5 = var2.t * aN / var2.w;
         }

         if (Char.myCharz().e > 0) {
            int var6 = Char.myCharz().c * aO / Char.myCharz().d;
            var1.a(r, 58, 29, 0);
            var1.f(83, 31, var6, 10);
            var1.a(u, 83, 31, 0);
            var1.f(0, 0, main.a.i, main.a.j);
            cg.s.a(var1, Char.myCharz().c + ":" + Char.myCharz().c + "/" + Char.myCharz().d, 115, 29, 2);
         }

         if (var2.charID != Char.myCharz().charID) {
            var1.f(dm.a(q) - 95, 0, 95, 100);
         }

         var1.a(q, 0, 0, 0);
         var1.f(83, 5, var3, 10);
         var1.a(K, 83, 5, 0);
         var1.f(0, 0, main.a.i, main.a.j);
         var1.f(83, 5, var5, 10);
         var1.a(s, 83, 5, 0);
         var1.f(0, 0, main.a.i, main.a.j);
         var1.f(83, 20, var4, 6);
         var1.a(v, 83, 20, 0);
         var1.f(0, 0, main.a.i, main.a.j);
         var1.f(83, 20, var4, 6);
         var1.a(t, 83, 20, 0);
         var1.f(0, 0, main.a.i, main.a.j);
         if (Char.myCharz().s == 0 && main.a.g % 10 > 5) {
            var1.f(83, 20, 2, 6);
            var1.a(v, 83, 20, 0);
            var1.f(0, 0, main.a.i, main.a.j);
         }
      }

   }

   protected static void b(ds var0) {
      al var2 = Char.myCharz().a(var0);
      String[] var5;
      if (bf.b) {
         var5 = pasta.ab.e;
      } else {
         var5 = pasta.ab.f;
      }

      MyVector var4 = new MyVector("");

      for(int var1 = 0; var1 < 5; ++var1) {
         String var3 = String.valueOf(var1);
         var4.addElement(new cd(var5[var1], 11121, new Object[]{var2, var3}));
      }

      main.a.a.b(var4);
   }

   private void b(boolean var1) {
      byte var2 = -1;
      byte var5 = 1;
      if (Char.myCharz().a != null && Char.myCharz().a.c >= Char.myCharz().c + 48 && TileMap.a(Char.myCharz().b, Char.myCharz().c, 2)) {
         this.z = 0;
         Char.myCharz().a = null;
         Char.v = false;
         Char.myCharz().x = false;
      } else {
         ++au;
         ay var8 = Char.myCharz().a();
         ay var7 = Char.myCharz().b();
         if (!var1 && var8 != null && (Char.myCharz().a == null || Char.myCharz().a != null && Char.myCharz().a.r == 0)) {
            var8.a.a.a();
         } else if (var1 || var7 == null || Char.myCharz().a != null && (Char.myCharz().a == null || Char.myCharz().a.r != 0)) {
            if ((TileMap.mapId != 51 || Char.myCharz().a == null) && Char.myCharz().h != 14) {
               Char var18 = Char.myCharz();
               Char.myCharz().e = 0;
               var18.d = 0;
               if (Char.myCharz().a() && Char.myCharz().i()) {
                  if (this.f()) {
                     Char.myCharz();
                     Char.myCharz();
                     Char.l();
                  }
               } else {
                  boolean var9;
                  byte var12;
                  if (this.a((as)Char.myCharz().a)) {
                     var9 = false;
                  } else if (this.a((as)Char.myCharz().a)) {
                     var9 = false;
                  } else if (this.a((as)Char.myCharz().a)) {
                     var9 = false;
                  } else if (bq.a().a) {
                     var9 = false;
                  } else {
                     label419: {
                        if (!pasta.a.b) {
                           Char.myCharz();
                           if (!Char.v) {
                              if (Char.myCharz().a != null && Char.myCharz().a.a.a == 6 && Char.myCharz().a != null) {
                                 x();
                                 var9 = false;
                              } else if (Char.myCharz().a != null && Char.myCharz().a.a.c == 2 && Char.myCharz().a == null && Char.myCharz().a.a.a != 6) {
                                 if (!this.f()) {
                                    var9 = false;
                                 } else {
                                    var9 = true;
                                 }
                              } else if (Char.myCharz().a != null || Char.myCharz().a == null && Char.myCharz().a == null && Char.myCharz().a == null && Char.myCharz().a == null) {
                                 var9 = false;
                              } else {
                                 int var3;
                                 int var4;
                                 byte var10;
                                 boolean var14;
                                 int var17;
                                 if (Char.myCharz().a != null) {
                                    if (Char.myCharz().a.a() && Char.myCharz().a.h == 4) {
                                       Char.myCharz().a = null;
                                       Char.myCharz().a = null;
                                    }

                                    l = true;
                                    if (!a(Char.myCharz().a)) {
                                       var9 = false;
                                       break label419;
                                    }

                                    if (this.a != null) {
                                       var9 = false;
                                       break label419;
                                    }

                                    if (Char.myCharz().a == null) {
                                       var9 = false;
                                       break label419;
                                    }

                                    if (Char.myCharz().a()) {
                                       var9 = false;
                                       break label419;
                                    }

                                    if (Char.myCharz().a.h == 1 || Char.myCharz().a.h == 0 || Char.myCharz().a.a.c == 4) {
                                       var9 = false;
                                       break label419;
                                    }

                                    if (!this.f()) {
                                       var9 = false;
                                       break label419;
                                    }

                                    if (Char.myCharz().b < Char.myCharz().a.a()) {
                                       Char.myCharz().i = 1;
                                    } else {
                                       Char.myCharz().i = -1;
                                    }

                                    int var6 = Math.abs(Char.myCharz().b - Char.myCharz().a.a());
                                    var3 = Math.abs(Char.myCharz().c - Char.myCharz().a.b());
                                    Char.myCharz().d = 0;
                                    if (var6 > Char.myCharz().a.c || var3 > Char.myCharz().a.d) {
                                       if (!(Char.myCharz().a instanceof be) && !(Char.myCharz().a instanceof ci)) {
                                          var14 = false;
                                       } else {
                                          var14 = true;
                                       }

                                       var4 = Char.myCharz().a.c;
                                       if (var14) {
                                          var10 = 50;
                                       } else {
                                          var10 = 20;
                                       }

                                       if (Char.myCharz().b > Char.myCharz().a.a()) {
                                          var2 = 1;
                                       }

                                       var17 = (var4 - var10) * var2;
                                       if (var6 <= Char.myCharz().a.c) {
                                          var17 = 0;
                                       }

                                       Char.myCharz().a = new ck(var17 + Char.myCharz().a.a(), Char.myCharz().a.b());
                                       Char.myCharz().b = new cd((String)null, (ah)null, 8002, (Object)null);
                                       main.a.e();
                                       main.a.onCancelChat();
                                       var9 = false;
                                       break label419;
                                    }

                                    if (Char.myCharz().a.a.a != 20) {
                                       if (var3 > var6 && cq.f(Char.myCharz().c - Char.myCharz().a.b()) > 30 && Char.myCharz().a.a().c == 4) {
                                          Char.myCharz().a = new ck(Char.myCharz().b + Char.myCharz().i, Char.myCharz().a.b());
                                          Char.myCharz().b = new cd((String)null, (ah)null, 8002, (Object)null);
                                          main.a.e();
                                          main.a.onCancelChat();
                                          var9 = false;
                                          break label419;
                                       }

                                       if (!(Char.myCharz().a instanceof be) && !(Char.myCharz().a instanceof ci)) {
                                          var14 = false;
                                       } else {
                                          var14 = true;
                                       }

                                       if (Char.myCharz().a.c > 100) {
                                          byte var13 = 60;
                                          var17 = var13;
                                          if (var6 < 20) {
                                             Char.myCharz().teleTo(Char.myCharz().b, Char.myCharz().c);
                                             var17 = var13;
                                          }
                                       } else {
                                          var17 = 20;
                                       }

                                       boolean var16;
                                       label330: {
                                          (new StringBuffer("dt= ")).append(var17);
                                          if ((TileMap.b(Char.myCharz().b, Char.myCharz().c + 3) & 2) == 2) {
                                             byte var15;
                                             if (Char.myCharz().b > Char.myCharz().a.a()) {
                                                var15 = 1;
                                             } else {
                                                var15 = -1;
                                             }

                                             if ((TileMap.b(var15 * var17 + Char.myCharz().a.a(), Char.myCharz().c + 3) & 2) != 2) {
                                                var16 = true;
                                                break label330;
                                             }
                                          }

                                          var16 = false;
                                       }

                                       if (var6 <= var17 && !var16) {
                                          if (var6 >= 30) {
                                             if (Char.myCharz().b <= Char.myCharz().a.a()) {
                                                var17 = -var17;
                                             }

                                             Char.myCharz().a = new ck(var17 + Char.myCharz().b, Char.myCharz().c);
                                             Char.myCharz().b = new cd((String)null, (ah)null, 8002, (Object)null);
                                             main.a.e();
                                             main.a.onCancelChat();
                                             var9 = false;
                                             break label419;
                                          }

                                          if (Char.myCharz().b > Char.myCharz().a.a()) {
                                             var18 = Char.myCharz();
                                             var4 = Char.myCharz().a.a();
                                             if (var14) {
                                                var10 = 30;
                                             } else {
                                                var10 = 0;
                                             }

                                             var18.b = var10 + var17 + var4;
                                             Char.myCharz().i = -1;
                                          } else {
                                             var18 = Char.myCharz();
                                             var4 = Char.myCharz().a.a();
                                             if (var14) {
                                                var10 = 30;
                                             } else {
                                                var10 = 0;
                                             }

                                             var18.b = var4 - var17 - var10;
                                             Char.myCharz().i = 1;
                                          }

                                          pasta.av.a().g();
                                       }

                                       main.a.e();
                                       main.a.onCancelChat();
                                    }
                                 } else {
                                    if (Char.myCharz().a != null) {
                                       if (Char.myCharz().a.Q) {
                                          var9 = false;
                                       } else {
                                          if (Char.myCharz().b < Char.myCharz().a.b) {
                                             Char.myCharz().i = 1;
                                          } else {
                                             Char.myCharz().i = -1;
                                          }

                                          if (Char.myCharz().b < Char.myCharz().a.b) {
                                             Char.myCharz().a.i = -1;
                                          } else {
                                             Char.myCharz().a.i = 1;
                                          }

                                          var3 = Math.abs(Char.myCharz().b - Char.myCharz().a.b);
                                          if (Math.abs(Char.myCharz().c - Char.myCharz().a.c) > 40) {
                                             Char.myCharz().c = Char.myCharz().a.c - 40;
                                          }

                                          if (var3 < 60) {
                                             main.a.e();
                                             main.a.onCancelChat();
                                             if (this.ae == 0) {
                                                if (Char.myCharz().a != null && Char.myCharz().a.a == 0) {
                                                   if (Char.myCharz().a.a < 4 && Char.myCharz().a.all.a == 4) {
                                                      var9 = false;
                                                      break label419;
                                                   }

                                                   if (Char.myCharz().a.a < 3 && Char.myCharz().a.all.a == 3) {
                                                      var9 = false;
                                                      break label419;
                                                   }
                                                }

                                                this.ae = 50;
                                                pasta.a.e();
                                                pasta.av.a().g();
                                                pasta.av.a().g(Char.myCharz().a.all.a);
                                             }
                                          } else {
                                             var3 = cq.a.nextInt(20);
                                             if (Char.myCharz().b > Char.myCharz().a.b) {
                                                var2 = 1;
                                             }

                                             Char.myCharz().a = new ck((var3 + 20) * var2 + Char.myCharz().a.b, Char.myCharz().c);
                                             Char.myCharz().b = new cd((String)null, (ah)null, 8002, (Object)null);
                                             main.a.e();
                                             main.a.onCancelChat();
                                          }

                                          var9 = false;
                                       }
                                       break label419;
                                    }

                                    if (Char.myCharz().a != null) {
                                       if (this.a != null) {
                                          var9 = false;
                                          break label419;
                                       }

                                       if (Char.myCharz().b < Char.myCharz().a.b) {
                                          Char.myCharz().i = 1;
                                       } else {
                                          Char.myCharz().i = -1;
                                       }

                                       var4 = Math.abs(Char.myCharz().b - Char.myCharz().a.b);
                                       var3 = Math.abs(Char.myCharz().c - Char.myCharz().a.c);
                                       Char.myCharz();
                                       if (!Char.b(Char.myCharz().a) && !Char.myCharz().b()) {
                                          if (var4 < 60 && var3 < 40) {
                                             Char.myCharz();
                                             this.w();
                                             if (!main.a.e && Char.myCharz().a.charID >= 0 && TileMap.mapId != 51 && TileMap.mapId != 52 && this.a == null) {
                                                main.a.a.a(Char.myCharz().a);
                                                main.a.a.t();
                                                pasta.av.a().b(Char.myCharz().a.charID);
                                                pasta.av.a().s(Char.myCharz().a.charID);
                                             }
                                          } else {
                                             var3 = cq.a.nextInt(20);
                                             if (Char.myCharz().b > Char.myCharz().a.b) {
                                                var2 = 1;
                                             }

                                             Char.myCharz().a = new ck((var3 + 20) * var2 + Char.myCharz().a.b, Char.myCharz().a.c);
                                             Char.myCharz().b = new cd((String)null, (ah)null, 8002, (Object)null);
                                             main.a.e();
                                             main.a.onCancelChat();
                                          }

                                          var9 = false;
                                          break label419;
                                       }

                                       if (Char.myCharz().a == null) {
                                          var9 = false;
                                          break label419;
                                       }

                                       if (!this.f()) {
                                          var9 = false;
                                          break label419;
                                       }

                                       if (Char.myCharz().b < Char.myCharz().a.b) {
                                          Char.myCharz().i = 1;
                                       } else {
                                          Char.myCharz().i = -1;
                                       }

                                       Char.myCharz().d = 0;
                                       if (var4 > Char.myCharz().a.c || var3 > Char.myCharz().a.d) {
                                          var3 = Char.myCharz().a.c;
                                          if (Char.myCharz().b > Char.myCharz().a.b) {
                                             var2 = 1;
                                          }

                                          var17 = (var3 - 20) * var2;
                                          if (var4 <= Char.myCharz().a.c) {
                                             var17 = 0;
                                          }

                                          Char.myCharz().a = new ck(var17 + Char.myCharz().a.b, Char.myCharz().a.c);
                                          Char.myCharz().b = new cd((String)null, (ah)null, 8002, (Object)null);
                                          main.a.e();
                                          main.a.onCancelChat();
                                          var9 = false;
                                          break label419;
                                       }

                                       if (Char.myCharz().a.a.a != 20) {
                                          if (Char.myCharz().a.c > 60) {
                                             var10 = 60;
                                             var12 = var10;
                                             if (var4 < 20) {
                                                Char.myCharz().teleTo(Char.myCharz().b, Char.myCharz().c);
                                                var12 = var10;
                                             }
                                          } else {
                                             var12 = 20;
                                          }

                                          label344: {
                                             if ((TileMap.b(Char.myCharz().b, Char.myCharz().c + 3) & 2) == 2) {
                                                byte var11;
                                                if (Char.myCharz().b > Char.myCharz().a.b) {
                                                   var11 = 1;
                                                } else {
                                                   var11 = -1;
                                                }

                                                if ((TileMap.b(var11 * var12 + Char.myCharz().a.b, Char.myCharz().c + 3) & 2) != 2) {
                                                   var14 = true;
                                                   break label344;
                                                }
                                             }

                                             var14 = false;
                                          }

                                          if (var4 <= var12 && !var14) {
                                             if (Char.myCharz().b > Char.myCharz().a.b) {
                                                Char.myCharz().b = var12 + Char.myCharz().a.b;
                                                Char.myCharz().i = -1;
                                             } else {
                                                Char.myCharz().b = Char.myCharz().a.b - var12;
                                                Char.myCharz().i = 1;
                                             }

                                             pasta.av.a().g();
                                          }

                                          main.a.e();
                                          main.a.onCancelChat();
                                       }
                                    } else if (Char.myCharz().a != null) {
                                       x();
                                       var9 = false;
                                       break label419;
                                    }
                                 }

                                 var9 = true;
                              }
                              break label419;
                           }
                        }

                        var9 = false;
                     }
                  }

                  if (var9) {
                     if (Char.myCharz().c() && Char.myCharz().i()) {
                        if (this.f()) {
                           Char.myCharz();
                           Char.myCharz().m();
                        } else {
                           Char.myCharz().n();
                        }
                     } else {
                        var1 = TileMap.a(Char.myCharz().b, Char.myCharz().c, 2);
                        (new StringBuffer("my skill id= ")).append(Char.myCharz().a.a);
                        Char var19 = Char.myCharz();
                        bj var20 = a[Char.myCharz().a.a];
                        var12 = var5;
                        if (var1) {
                           var12 = 0;
                        }

                        var19.a(var20, var12);
                        if (var1) {
                           Char.myCharz().T = 20;
                        }

                        Char.myCharz();
                     }
                  }
               }

               if (Char.myCharz().b()) {
                  this.z = 0;
               }
            }
         } else {
            var7.a.a.a();
         }
      }

   }

   public static boolean b() {
      boolean var0;
      if (TileMap.mapId >= 63) {
         var0 = true;
      } else {
         var0 = false;
      }

      return var0;
   }

   private static boolean b(int var0, int var1) {
      boolean var4 = false;
      int var2 = 0;

      boolean var3;
      while(true) {
         if (var2 >= pasta.ar.a.size()) {
            var3 = var4;
            break;
         }

         ar var5 = (ar)pasta.ar.a.elementAt(var2);
         if (a(var0, var1, var5.b, var5.c, var5.d, var5.e)) {
            if (var5.c <= 24 && TileMap.c()) {
               var3 = var4;
               if (Char.myCharz().d != 0) {
                  break;
               }
            }

            if (var5.b) {
               var5.b();
               var3 = true;
               break;
            }
         }

         ++var2;
      }

      return var3;
   }

   public static void c(dm var0) {
      var0.a(-var0.a(), -var0.b());
      var0.f(0, -200, main.a.i, main.a.j + 200);
   }

   public static void c(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         for(int var1 = 0; var1 < Char.myCharz().b.size(); ++var1) {
            al var2 = (al)Char.myCharz().b.elementAt(var1);
            if (var2.a.a == var0[0]) {
               Char.myCharz().a = var2;
               break;
            }
         }
      } else if (Char.myCharz().b.size() > 0) {
         Char.myCharz().a = (al)Char.myCharz().b.elementAt(0);
      }

      if (Char.myCharz().a != null) {
         pasta.av.a().f(Char.myCharz().a.a.a);
         Char.myCharz();
      }

   }

   public static boolean c() {
      int var0 = Char.myCharz().arrItemBag.length - 1;

      boolean var1;
      while(true) {
         if (var0 < 0) {
            var1 = true;
            break;
         }

         if (Char.myCharz().arrItemBag[var0] == null) {
            var1 = false;
            break;
         }

         --var0;
      }

      return var1;
   }

   public static void d(int var0, int var1) {
      if (main.a.i == 128 || main.a.j <= 208) {
         var0 = 126;
         var1 = 160;
      }

      S = var0;
      T = var1;
      R = c - var0 / 2;
      Q = Y - var1 / 2;
      if (main.a.e) {
         if (main.a.j <= 240) {
            Q -= 10;
         }

         if (main.a.e && !main.a.g && main.a.a instanceof GameSrc) {
            S = 310;
            R = a / 2 - S / 2;
         }
      }

      if (Q < -10) {
         Q = -10;
      }

      if (main.a.j > 208 && Q < 0) {
         Q = 0;
      }

      if (main.a.j == 208 && Q < 10) {
         Q = 10;
      }

   }

   private void d(dm var1) {
      if (this.aW != 0) {
         String var3 = "";

         for(int var2 = 0; var2 < this.A.length; ++var2) {
            var3 = var3 + this.B[var2] + " ";
         }

         pasta.ar.a(var1, 20, 45, 95, 35, 16777215, false);
         cg.f.a(var1, pasta.ab.g, 68, 50, 2);
         cg.f.a(var1, var3, 68, 65, 2);
      }

   }

   public static void e() {
      // $FF: Couldn't be decompiled
   }

   private void e(int var1, int var2) {
      b var4 = a;
      boolean var3;
      if (y == 0) {
         var3 = false;
      } else if ((main.a.a < 0 || main.a.a > var4.b || main.a.b < var4.a || main.a.b > var4.c) && main.a.a < main.a.i - 50) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (!var3) {
         Char.myCharz();
         if (var1 < TileMap.c && var1 > TileMap.c - 32) {
            Char.myCharz().a = new ck(TileMap.c, var2);
         } else if (var1 < 32 && var1 > 0) {
            Char.myCharz().a = new ck(0, var2);
         } else {
            this.am = var1;
            this.an = var2;
            this.x = false;
            Char.myCharz().T = 0;
            short var5;
            if (Char.myCharz().h && Char.myCharz().s > 0) {
               var5 = 0;
            } else {
               var5 = 1000;
            }

            if (this.an <= Char.myCharz().c || cq.f(this.am - Char.myCharz().b) >= 12) {
               for(var2 = 0; var2 < var5 + 60 && this.an + var2 < TileMap.d - 24; var2 += 24) {
                  if (TileMap.a(this.am, this.an + var2, 2)) {
                     this.an = TileMap.a(var2 + this.an);
                     this.x = true;
                     break;
                  }
               }

               for(var2 = 0; var2 < var5 + 40; var2 += 24) {
                  if (TileMap.a(this.am, this.an - var2, 2)) {
                     this.an = TileMap.a(this.an - var2);
                     this.x = true;
                     break;
                  }
               }

               this.e = true;
               Char.myCharz().T = 0;
               if (!this.x && this.an < Char.myCharz().c - 50) {
                  Char.myCharz().T = 20;
               }

               this.z = 0;
               if (Char.myCharz().I) {
                  Char.myCharz().u();
               }

               Char.myCharz().a = new ck(this.am, this.an);
               Char var7 = Char.myCharz();
               byte var6;
               if (Char.myCharz().b - Char.myCharz().a.a > 0) {
                  var6 = -1;
               } else {
                  var6 = 1;
               }

               var7.i = var6;
               Char.myCharz().b = null;
               l = false;
            }
         }
      }

   }

   private void e(dm var1) {
      if (!Char.w) {
         c(var1);
         if (this.e() && Char.myCharz().a != null) {
            var1.a(main.a.i / 2 - 62, 0);
            this.b(var1, Char.myCharz().a);
            var1.a(-(main.a.i / 2 - 65), 0);
            this.a(var1, Char.myCharz());
            Char.myCharz().a((dm)var1, (int)15, (int)20, (int)0);
            int var10002 = main.a.i - 15;
            Char.myCharz().a.a((dm)var1, (int)var10002, (int)20, (int)2);
         } else if (TileMap.mapId == 130 && myCharz() != null && b() != null) {
            var1.a(main.a.i / 2 - 62, 0);
            this.b(var1, myCharz());
            var1.a(-(main.a.i / 2 - 65), 0);
            this.a(var1, b());
            myCharz().a((dm)var1, (int)15, (int)20, (int)0);
            b().a((dm)var1, (int)(main.a.i - 15), (int)20, (int)2);
         } else {
            this.b(var1, Char.myCharz());
            if (Char.myCharz().a() == null && Char.myCharz().b() == null) {
               int var10003;
               if (Char.myCharz().a != null) {
                  if (Char.myCharz().a.a() != null) {
                     var10003 = this.aQ / 2;
                     cg.m.a(var1, Char.myCharz().a.a().a, var10003, 9, 2);
                  }

                  if (Char.myCharz().a.r != 0) {
                     cg.m.a(var1, pasta.o.a((long)Char.myCharz().a.c), this.aQ / 2, 22, 2);
                  }
               } else if (Char.myCharz().a != null) {
                  var10003 = this.aQ / 2;
                  cg.m.a(var1, Char.myCharz().a.all.a, var10003, 9, 2);
                  if (Char.myCharz().a.all.a == 4) {
                     cg.m.a(var1, a().a.ap + "/" + a().a.ar, this.aQ / 2, 22, 2);
                  }
               } else if (Char.myCharz().a != null) {
                  var10003 = this.aQ / 2;
                  cg.m.a(var1, Char.myCharz().a.a, var10003, 9, 2);
                  cg.m.a(var1, pasta.o.a((long)Char.myCharz().a.t), this.aQ / 2, 22, 2);
               } else {
                  var10003 = this.aQ / 2;
                  cg.m.a(var1, Char.myCharz().a, var10003, 9, 2);
                  cg.m.a(var1, pasta.o.a(Char.myCharz().a), this.aQ / 2, 22, 2);
               }
            } else {
               cg.m.a(var1, pasta.ab.bc, this.aQ / 2, 8, 2);
            }
         }

         var1.a(-var1.a(), -var1.b());
         if (this.e() && this.aM > 0) {
            this.g = System.currentTimeMillis();
            if (this.g - this.h >= 1000L) {
               this.h = System.currentTimeMillis();
               --this.aM;
            }

            cg.c.a(var1, String.valueOf(this.aM), main.a.i / 2, 13, 2, cg.f);
         }

         if (this.A) {
            var1.a(ItemMap.a, 40, 35, 33);
            --this.ax;
            if (this.ax < 0) {
               this.ax = 0;
               this.A = false;
            }
         }
      }

   }

   public static void f() {
      bn.a.removeAllElements();
      d.removeAllElements();
      e.removeAllElements();
      cb.b.removeAllElements();
      cb.e.removeAllElements();
      cb.d.removeAllElements();
      cb.f.removeAllElements();
      cb.a.removeAllElements();
      j.removeAllElements();
      f.removeAllElements();
      g.removeAllElements();
      Char.myCharz().f.removeAllElements();
   }

   private void f(dm var1) {
      int var2;
      int var3;
      if (this.a != null) {
         dr.a(var1, Char.myCharz().b, Char.myCharz().c);
         var1.a(-var1.a(), -var1.b());
         if (!main.a.a.a && !main.a.a.a && pasta.k.a == null && main.a.e) {
            for(var2 = 0; var2 < this.a.length(); ++var2) {
               var3 = (main.a.i - this.a.length() * aB) / 2 + aB * var2 + aB / 2;
               if (this.i[var2] == -1) {
                  var1.a(w, var3, main.a.j - 25, 3);
                  cg.f.a(var1, String.valueOf(this.a.charAt(var2)), var3, main.a.j - 30, 2);
               } else {
                  var1.a(x, var3, main.a.j - 25, 3);
                  cg.g.a(var1, String.valueOf(this.a.charAt(var2)), var3, main.a.j - 30, 2);
               }
            }
         }
      } else if (main.a.a == null && pasta.k.a == null && !main.a.a.a && !main.a.a.a && Char.myCharz().a.a != 0 && !bq.a().a && main.a.a != pasta.h.a) {
         long var6 = System.currentTimeMillis() - this.d;
         var2 = 0;
         if (var6 < 10000L) {
            var2 = (int)(20L * var6 / 10000L);
         }

         int var4;
         int var5;
         Image var8;
         if (!main.a.e) {
            if (pasta.ag.h == 10) {
               var8 = j;
            } else {
               var8 = i;
            }

            var1.a(var8, aK + K - 1, L - 1, 0);
            pasta.ao.a(var1, 542, aK + K + 3, L + 3, 0, 0);
            cg.o.a(var1, "" + t, aK + K + 23, L + 13, 1);
            if (var6 < 10000L) {
               var1.a(2721889);
               var2 = (int)(20L * var6 / 10000L);
               var1.e(aK + K + 3, L + 3 + var2, 20, 20 - var2);
            }
         } else if (Char.myCharz().h != 14) {
            if (a.a) {
               if (y != 1) {
                  var1.a(9670800);
                  var1.e(K + 9, L + 10, 22, 20);
                  var1.a(16777215);
                  var5 = K;
                  var4 = L;
                  if (var2 != 0) {
                     var3 = 20 - var2;
                  } else {
                     var3 = 0;
                  }

                  if (var2 == 0) {
                     var2 = 20;
                  }

                  var1.e(var5 + 9, var3 + var4 + 10, 22, var2);
                  if (pasta.ag.h == 10) {
                     var8 = F;
                  } else {
                     var8 = E;
                  }

                  var1.a(var8, K, L, 0);
                  cg.p.a(var1, "" + t, K + 20, L + 15, 2);
               } else if (y == 1) {
                  if (pasta.ag.h == 10) {
                     var8 = j;
                  } else {
                     var8 = i;
                  }

                  var1.a(var8, aK + K - 1, L - 1, 0);
                  pasta.ao.a(var1, 542, aK + K + 3, L + 3, 0, 0);
                  cg.o.a(var1, "" + t, aK + K + 23, L + 13, 1);
                  if (var6 < 10000L) {
                     var1.a(2721889);
                     var2 = (int)(20L * var6 / 10000L);
                     var1.e(aK + K + 3, L + 3 + var2, 20, 20 - var2);
                  }
               }
            } else if (!a.a) {
               if (y != 1) {
                  var1.a(9670800);
                  var1.e(K + 9, L + 10, 22, 20);
                  var1.a(16777215);
                  var4 = K;
                  var5 = L;
                  if (var2 != 0) {
                     var3 = 20 - var2;
                  } else {
                     var3 = 0;
                  }

                  if (var2 == 0) {
                     var2 = 20;
                  }

                  var1.e(var4 + 9, var3 + var5 + 10, 22, var2);
                  if (pasta.ag.h == 10) {
                     var8 = F;
                  } else {
                     var8 = E;
                  }

                  var1.a(var8, K, L, 0);
                  cg.p.a(var1, "" + t, K + 20, L + 15, 2);
               } else {
                  var1.a(9670800);
                  var1.e(K + 10, L + 10, 20, 18);
                  var1.a(16777215);
                  var5 = K;
                  var4 = L;
                  if (var2 != 0) {
                     var3 = 20 - var2;
                  } else {
                     var3 = 0;
                  }

                  if (var2 == 0) {
                     var2 = 18;
                  }

                  var1.e(var5 + 10, var3 + var4 + 10, 20, var2);
                  if (pasta.ag.h == 10) {
                     var8 = H;
                  } else {
                     var8 = G;
                  }

                  var1.a(var8, K + 20, L + 20, 3);
                  cg.p.a(var1, "" + t, K + 21, L + 14, 2);
               }
            }
         }

         if (c) {
            al[] var11;
            if (main.a.e) {
               var11 = b;
            } else {
               var11 = a;
            }

            if (!main.a.e) {
               var1.a(11152401);
               var1.e(aK + K + 2, L - 10, 20, 10);
               cg.s.a(var1, "*", aK + K + 12, L - 8, 2);
            }

            var2 = 0;

            while(true) {
               if (main.a.e) {
                  var3 = this.av;
               } else {
                  var3 = var11.length;
               }

               if (var2 >= var3) {
                  break;
               }

               if (!main.a.e) {
                  String[] var9;
                  if (bf.b) {
                     var9 = new String[]{"Q", "W", "E", "R", "T"};
                  } else {
                     var9 = new String[]{"7", "8", "9", "1", "3"};
                  }

                  var1.a(11152401);
                  var1.e(aK + p[var2] + 2, q[var2] - 10, 20, 10);
                  cg.s.a(var1, var9[var2], aK + p[var2] + 12, q[var2] - 10, 2);
               }

               al var10 = var11[var2];
               if (var10 != Char.myCharz().a) {
                  var1.a(i, aK + p[var2] - 1, q[var2] - 1, 0);
               }

               if (var10 != null) {
                  if (var10 == Char.myCharz().a) {
                     var1.a(j, aK + p[var2] - 1, q[var2] - 1, 0);
                     if (main.a.e) {
                        var1.a(pasta.i.a, 0, 12, 9, 6, 0, aK + p[var2] + 8, q[var2] - 7, 0);
                     }
                  }

                  var3 = aK + p[var2] + 13;
                  var4 = q[var2] + 13;
                  pasta.ao.a(var1, var10.a.d, var3, var4, 0, bk.f);
                  var6 = System.currentTimeMillis() - var10.b;
                  if (var6 < (long)var10.b) {
                     var1.a(2721889);
                     if (var10.a && main.a.g % 6 > 2) {
                        var1.a(876862);
                     }

                     var5 = (int)(var6 * 20L / (long)var10.b);
                     var1.e(var3 - 10, var4 - 10 + var5, 20, 20 - var5);
                  } else {
                     var10.a = false;
                  }

                  if (var2 == this.aw && main.a.g % 10 > 5 || var2 == this.ay) {
                     var1.a(ItemMap.a, aK + p[var2] + 13, q[var2] + 14, 3);
                  }
               }

               ++var2;
            }
         }

         if (y != 0 && Char.myCharz().h != 14) {
            if (pasta.ag.h == 5) {
               var8 = J;
            } else {
               var8 = I;
            }

            var1.a(var8, aG + 20, aH + 20, 3);
            a.a(var1);
            if (pasta.ag.h == 13) {
               var8 = D;
            } else {
               var8 = C;
            }

            var1.a(var8, aI + 20, aJ + 20, 3);
         }
      }

   }

   private boolean f() {
      boolean var1 = false;
      if (Char.myCharz().a == null || (Char.myCharz().a.a.b == 1 || Char.myCharz().s >= Char.myCharz().a.e) && (Char.myCharz().a.a.b != 1 || Char.myCharz().s >= Char.myCharz().x * Char.myCharz().a.e / 100)) {
         if (Char.myCharz().a != null && (Char.myCharz().a.a.a <= 0 || Char.myCharz().a.a != 0)) {
            var1 = true;
         } else {
            main.a.checkInfo(pasta.ab.aB);
         }
      } else {
         a.a(pasta.ab.bk, 0);
         this.z = 0;
      }

      return var1;
   }

   public static void g() {
      // $FF: Couldn't be decompiled
   }

   private boolean g() {
      boolean var1;
      if (!Char.myCharz().B && !Char.myCharz().A && !Char.myCharz().C && !Char.myCharz().G && !this.y && !Char.myCharz().n) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public static void h() {
      // $FF: Couldn't be decompiled
   }

   private static boolean h() {
      boolean var1 = true;
      boolean var0;
      if (!main.a.f && main.a.a == a()) {
         var0 = var1;
      } else {
         var0 = var1;
         if (main.a.e) {
            var0 = var1;
            if (!bq.a().a) {
               var0 = var1;
               if (!pasta.a.a) {
                  var0 = var1;
                  if (main.a.a == null) {
                     var0 = var1;
                     if (pasta.k.a == null) {
                        var0 = var1;
                        if (!main.a.a.a) {
                           var0 = var1;
                           if (!main.a.a.a) {
                              var0 = false;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var0;
   }

   public static void i() {
      // $FF: Couldn't be decompiled
   }

   public static void j() {
      // $FF: Couldn't be decompiled
   }

   public static void k() {
      a = null;
   }

   public static void m() {
      byte var1 = 0;
      al[] var2;
      if (main.a.e) {
         var2 = b;
      } else {
         var2 = a;
      }

      p = new int[var2.length];
      q = new int[var2.length];
      ag = 30;
      if (main.a.i <= 320) {
         aL = b - ag - 6;
         aK = c - var2.length * ag / 2 - 25;
      } else {
         ag = 40;
         aK = 10;
         aL = main.a.j - ag + 7;
      }

      int var0;
      for(var0 = 0; var0 < p.length; ++var0) {
         p[var0] = ag * var0;
         q[var0] = aL;
      }

      K = var2.length * ag;
      L = aL;
      if (main.a.e) {
         aK = 17;
         aL = main.a.j - 40;
         if (a.a && y == 1) {
            K = var2.length * ag;
            L = aL;
         } else {
            K = main.a.i - 45;
            L = main.a.j - 45;
         }

         var0 = var1;
         if (y != 0) {
            var0 = main.a.i - 45;
            aG = var0;
            aI = var0;
            if (a.c) {
               aK = a.b - 20;
               ag = 35;
               K = aG - 45;
            } else if (a.b) {
               K = aG - 45;
            }

            var0 = main.a.j - 45;
            aH = var0;
            aJ = var0 - 45;
            var0 = var1;
         }

         while(var0 < p.length) {
            p[var0] = ag * var0;
            q[var0] = aL;
            ++var0;
         }
      }

   }

   private static Char myCharz() {
      int var0 = 0;

      Char var1;
      while(true) {
         if (var0 >= d.size()) {
            var1 = null;
            break;
         }

         Char var2 = (Char)d.elementAt(var0);
         var1 = var2;
         if (var2.d != 0) {
            break;
         }

         ++var0;
      }

      return var1;
   }

   public static void r() {
      for(int var0 = 0; var0 < Char.myCharz().b.size() - 1; ++var0) {
         al var2 = (al)Char.myCharz().b.elementAt(var0);

         for(int var1 = var0 + 1; var1 < Char.myCharz().b.size(); ++var1) {
            al var3 = (al)Char.myCharz().b.elementAt(var1);
            if (var3.a.a < var2.a.a) {
               Char.myCharz().b.setElementAt(var3, var0);
               Char.myCharz().b.setElementAt(var2, var1);
               var2 = var3;
            }
         }
      }

   }

   public static void t() {
      TileMap.a();
   }

   public static final void transMap(int var0, int var1) {
      boolean var3 = true;
      a = main.a.i;
      i = 39;
      b = main.a.j;
      int var2 = main.a.j;
      c = a >> 1;
      Y = b >> 1;
      X = b - 120;
      d = (b << 1) / 3;
      j = a / 6;
      V = a / TileMap.a + 2;
      W = b / TileMap.a + 2;
      if (a % 24 != 0) {
         ++V;
      }

      o = (TileMap.a - 1) * TileMap.a - a;
      ad = (TileMap.b - 1) * TileMap.a - b;
      if (var0 == -1 && var1 == -1) {
         var0 = Char.myCharz().b - c + j * Char.myCharz().i;
         m = var0;
         k = var0;
         var0 = Char.myCharz().c - d;
         n = var0;
         l = var0;
      } else {
         var0 = var0 - X + j * Char.myCharz().i;
         m = var0;
         k = var0;
         var0 = var1 - d;
         n = var0;
         l = var0;
      }

      if (k < 24) {
         m = 24;
         k = 24;
      }

      if (k > o) {
         var0 = o;
         m = var0;
         k = var0;
      }

      if (l < 0) {
         n = 0;
         l = 0;
      }

      if (l > ad) {
         var0 = ad;
         n = var0;
         l = var0;
      }

      var0 = k / TileMap.a - 1;
      p = var0;
      if (var0 < 0) {
         p = 0;
      }

      q = l / TileMap.a;
      r = p + V;
      s = q + W;
      if (q < 0) {
         q = 0;
      }

      if (s > TileMap.b - 1) {
         s = TileMap.b - 1;
      }

      var0 = r - p << 2;
      TileMap.p = var0;
      if (var0 > TileMap.a) {
         TileMap.p = TileMap.a;
      }

      var0 = s - q << 2;
      TileMap.q = var0;
      if (var0 > TileMap.b) {
         TileMap.q = TileMap.b;
      }

      var0 = (Char.myCharz().b - a * 2) / TileMap.a;
      TileMap.l = var0;
      if (var0 < 0) {
         TileMap.l = 0;
      }

      var0 = TileMap.l + TileMap.p;
      TileMap.m = var0;
      if (var0 > TileMap.a) {
         TileMap.m = TileMap.a;
      }

      var0 = (Char.myCharz().c - b * 2) / TileMap.a;
      TileMap.n = var0;
      if (var0 < 0) {
         TileMap.n = 0;
      }

      var0 = TileMap.n + TileMap.q;
      TileMap.o = var0;
      if (var0 > TileMap.b) {
         TileMap.o = TileMap.b;
      }

      bq.a().a = a;
      bq.a().a.b = main.a.j - 35 - bq.a().a.d;
      bq.a().a();
      if (main.a.e) {
         aD = b - 88;
         aE = a - 40;
         aF = 2;
         if (main.a.i <= 240) {
            aE = a - 35;
            aF = 5;
         }

         aG = a - 55;
         aH = aD + 35;
         aI = a - 37;
         aJ = aD - 1;
         if (main.a.i >= 450) {
            aJ -= 12;
            L -= 7;
            aG -= 10;
            aH -= 5;
            aI -= 10;
         }
      }

      m();
      byte var6;
      if (main.a.i > 200) {
         var6 = 40;
      } else {
         var6 = 30;
      }

      aB = var6;
      Panel var4;
      if (pasta.aa.a("viewchat") == -1) {
         var4 = main.a.a;
      } else {
         Panel var5 = main.a.a;
         var4 = var5;
         if (pasta.aa.a("viewchat") != 1) {
            var3 = false;
            var4 = var5;
         }
      }

      var4.i = var3;
   }

   private static void u() {
      byte[] var1 = new byte[b.length];

      for(int var0 = 0; var0 < b.length; ++var0) {
         if (b[var0] == null) {
            var1[var0] = -1;
         } else {
            var1[var0] = b[var0].a.a;
         }
      }

      pasta.av.a().a(var1);
   }

   private static void v() {
      byte[] var1 = new byte[a.length];

      for(int var0 = 0; var0 < a.length; ++var0) {
         if (a[var0] == null) {
            var1[var0] = -1;
         } else {
            var1[var0] = a[var0].a.a;
         }
      }

      pasta.av.a().a(var1);
   }

   private void w() {
      int var1 = 0;
      this.z = 0;
      main.a.e();
      if (Char.myCharz().a.charID >= 0 && Char.myCharz().charID >= 0) {
         MyVector var5 = main.a.a.e;
         if (var5.size() <= 0) {
            if (Char.myCharz().a != null && Char.myCharz().a.a > 1) {
               var5.addElement(new cd(pasta.ab.cg, 11112, Char.myCharz().a));
               var5.addElement(new cd(pasta.ab.cT, 11113, Char.myCharz().a));
            }

            if (Char.myCharz().a != null && Char.myCharz().b < 2 && Char.myCharz().a.z == -1) {
               var5.addElement(new cd(pasta.ab.d[4], 110391));
            }

            if (Char.myCharz().a.h != 14 && Char.myCharz().a.h != 5) {
               if (Char.myCharz().a != null && Char.myCharz().a.a >= 14) {
                  var5.addElement(new cd(pasta.ab.d[0], 2003));
               }
            } else {
               Char.myCharz().a.a.getClass();
            }

            if (Char.myCharz().a != null && Char.myCharz().a.a == Char.myCharz().a.z && Char.myCharz().a.h != 14 && Char.myCharz().a != null && Char.myCharz().a.a >= 14) {
               var5.addElement(new cd(pasta.ab.d[1], 2004));
            }

            for(int var2 = Char.myCharz().a.a.length; var1 < var2; ++var1) {
               ds var4 = Char.myCharz().a.a[var1];
               al var3 = Char.myCharz().a(var4);
               if (var3 != null && var4.a() && var3.a > 0) {
                  var5.addElement(new cd(var4.a, 12004, var3));
               }
            }
         }
      }

   }

   private static void x() {
      if (Char.myCharz().a != null) {
         if (Char.myCharz().b < Char.myCharz().a.a) {
            Char.myCharz().i = 1;
         } else {
            Char.myCharz().i = -1;
         }

         int var0 = Math.abs(Char.myCharz().b - Char.myCharz().a.a);
         int var1 = Math.abs(Char.myCharz().c - Char.myCharz().a.b);
         if (var0 <= 40 && var1 < 40) {
            main.a.e();
            main.a.onCancelChat();
            if (Char.myCharz().a.a.templateId != 673) {
               pasta.av.a().i(Char.myCharz().a.d);
            } else {
               cm var2 = new cm(5, 0, -100, 100, 5, a.a[Char.myCharz().k][2]);
               Char.myCharz();
               String var3 = pasta.ab.aq;
               Char.myCharz();
               var2.an = 673;
               a();
               a(new String[]{"Có", "Không"}, var2);
               pasta.k.a(var3, var2);
            }
         } else {
            Char.myCharz().a = new ck(Char.myCharz().a.a, Char.myCharz().a.b);
            Char.myCharz().b = new cd((String)null, (ah)null, 8002, (Object)null);
            main.a.e();
            main.a.onCancelChat();
         }
      }

   }

   public final void a() {
      // $FF: Couldn't be decompiled
   }

   public final void a(int var1) {
      super.a(var1);
   }

   public final void a(int var1, Object var2) {
      byte var3 = 0;
      Object var7 = null;
      Object var6 = null;
      (new StringBuffer("PERFORM WITH ID = ")).append(var1);
      Object var5;
      Message var78;
      int var80;
      dw var81;
      Char var84;
      switch(var1) {
      case 1:
         main.a.f();
         break;
      case 2:
         main.a.a.a = false;
         break;
      case 2000:
         this.a = null;
         if ((Char)var2 == null) {
            pasta.av.a().a((byte)1, (byte)3, (int)-1);
         } else {
            pasta.av.a().a((byte)1, (byte)3, (int)((Char)var2).charID);
            pasta.av.a().g();
         }
         break;
      case 2001:
         main.a.f();
         break;
      case 2003:
         main.a.f();
         pasta.a.e();
         pasta.av.a().a((byte)0, (byte)3, (int)Char.myCharz().a.charID);
         break;
      case 2004:
         main.a.f();
         pasta.av.a().a((byte)0, (byte)4, (int)Char.myCharz().a.charID);
         break;
      case 2005:
         main.a.f();
         this.a = null;
         if ((Char)var2 == null) {
            pasta.av.a().a((byte)1, (byte)4, (int)-1);
         } else {
            pasta.av.a().a((byte)1, (byte)4, (int)((Char)var2).charID);
         }
         break;
      case 2006:
         main.a.f();
         pasta.av.a().a((byte)2, (byte)4, (int)Char.myCharz().a.charID);
         break;
      case 2007:
         main.a.f();
         GameMidlet.e.a();
         break;
      case 2009:
         this.a = null;
         break;
      case 8002:
         this.b(true);
         main.a.e();
         main.a.onCancelChat();
         break;
      case 11000:
         gameFunc.gI().a();
         break;
      case 11001:
         Char.myCharz().q();
         break;
      case 11002:
         main.a.a.B();
         break;
      case 11038:
         MyVector var88 = new MyVector("");
         var88.addElement(new cd(pasta.ab.h[1], 110381));
         var88.addElement(new cd(pasta.ab.h[2], 110382));
         var88.addElement(new cd(pasta.ab.h[3], 110383));
         main.a.a.b(var88);
         break;
      case 11057:
         cb.d.removeAllElements();
         cb.b.removeAllElements();
         cm var86 = (cm)var2;
         if (var86.an == 0) {
            pasta.av.a().a((short)var86.all.a, (byte)main.a.a.a);
         } else if (main.a.a.a == 0) {
            pasta.av.a().i(var86.an);
         }
         break;
      case 11059:
         this.a(b[this.aw], false);
         super.b = null;
         break;
      case 11067:
         if (TileMap.h != 0) {
            pasta.av.a().d((int)0);
            pasta.a.e();
         } else {
            a.a(pasta.ab.aD, 0);
         }
         break;
      case 11111:
         if (Char.myCharz().a != null) {
            pasta.a.e();
            if (main.a.a.e.size() <= 0) {
               Char.myCharz();
               this.w();
            }

            main.a.a.a(Char.myCharz().a);
            main.a.a.t();
            pasta.av.a().b(Char.myCharz().a.charID);
            pasta.av.a().s(Char.myCharz().a.charID);
         }
         break;
      case 11112:
         var84 = (Char)var2;
         pasta.av.a().a((byte)1, (int)var84.charID);
         break;
      case 11113:
         var84 = (Char)var2;
         if (var84 != null) {
            pasta.av.a().a((byte)0, (int)var84.charID, (byte)-1, (int)-1);
         }
         break;
      case 11114:
         this.a = null;
         var84 = (Char)var2;
         if (var84 != null) {
            pasta.av.a().a((byte)1, (int)var84.charID, (byte)-1, (int)-1);
         }
         break;
      case 11115:
         if (Char.myCharz().a == null) {
            break;
         }

         pasta.a.e();
         var5 = pasta.av.a();
         var80 = Char.myCharz().a.charID;
         short var79 = (short)Char.myCharz().a.m;

         label1187: {
            label1201: {
               label1185: {
                  label1184: {
                     try {
                        var78 = new Message((byte)-30);
                        break label1184;
                     } catch (Exception var76) {
                        var5 = var76;
                     } finally {
                        ;
                     }

                     var78 = (Message)var6;
                     break label1185;
                  }

                  try {
                     var78.a().writeByte(64);
                     var78.a().writeInt(var80);
                     var78.a().writeShort(var79);
                     ((av)var5).a.a(var78);
                     break label1187;
                  } catch (Exception var74) {
                     var5 = var74;
                  } finally {
                     break label1201;
                  }
               }

               try {
                  ((Throwable)var5).printStackTrace();
               } finally {
                  break label1201;
               }

               break;
            }

            var78.a();
            throw var5;
         }

         break;
      case 11120:
         Object[] var83 = (Object[])var2;
         al var87 = (al)var83[0];
         var80 = Integer.parseInt((String)var83[1]);

         for(var1 = 0; var1 < b.length; ++var1) {
            if (b[var1] == var87) {
               b[var1] = null;
            }
         }

         b[var80] = var87;
         u();
         break;
      case 11121:
         Object[] var85 = (Object[])var2;
         al var82 = (al)var85[0];
         int var4 = Integer.parseInt((String)var85[1]);

         for(var1 = var3; var1 < a.length; ++var1) {
            if (a[var1] == var82) {
               a[var1] = null;
            }
         }

         a[var4] = var82;
         v();
         break;
      case 12000:
         pasta.av.a().a((byte)1, (byte)-1, (String)null);
         break;
      case 12001:
         main.a.f();
         break;
      case 12002:
         main.a.f();
         var81 = (dw)var2;
         pasta.av.a().a((byte)1, (int)-1, (int)var81.a, (int)var81.b);
         this.a = null;
         break;
      case 12003:
         var81 = (dw)var2;
         main.a.f();
         pasta.av.a().a((byte)2, (int)-1, (int)var81.a, (int)var81.b);
         this.a = null;
         break;
      case 12004:
         this.a((al)var2, true);
         Char.myCharz();
         break;
      case 110001:
         gameFunc.gI().a();
         break;
      case 110004:
         main.a.a.a = false;
         break;
      case 110382:
         var5 = pasta.av.a();

         label1168: {
            label1197: {
               label1166: {
                  label1165: {
                     try {
                        var78 = new Message((byte)-15);
                        break label1165;
                     } catch (Exception var71) {
                        var5 = var71;
                     } finally {
                        ;
                     }

                     var78 = null;
                     break label1166;
                  }

                  try {
                     ((av)var5).a.a(var78);
                     break label1168;
                  } catch (Exception var69) {
                     var5 = var69;
                  } finally {
                     break label1197;
                  }
               }

               try {
                  ((Throwable)var5).printStackTrace();
               } finally {
                  break label1197;
               }

               break;
            }

            var78.a();
            throw var5;
         }

         break;
      case 110383:
         pasta.av.a().j();
         break;
      case 110391:
         pasta.av.a().a((byte)0, (int)Char.myCharz().a.charID, (int)-1, (int)-1);
         break;
      case 888351:
         pasta.av.a().d((byte)5);
         main.a.f();
      }

   }

   public final void a(int var1, String var2, byte var3) {
      Char var4 = a(var1);
      if (var4 != null) {
         if (var3 == 3) {
            this.a(var2, new cd(pasta.ab.aX, 2000, var4), new cd(pasta.ab.aO, 2009, var4));
         }

         if (var3 == 4) {
            this.a(var2, new cd(pasta.ab.aX, 2005, var4), new cd(pasta.ab.aO, 2009, var4));
         }
      }

   }

   public final void a(String var1, int var2, int var3) {
      dw var4 = new dw();
      var4.b = var3;
      var4.a = var2;
      this.a(var1, new cd(pasta.ab.aS, 12002, var4), new cd(pasta.ab.aT, 12003, var4));
   }

   public final void a(Message var1) {
      pasta.a.g();

      label37: {
         Exception var10000;
         label41: {
            boolean var10001;
            try {
               this.a = new int[var1.a().readByte()];
               this.b = new int[this.a.length];
               this.c = new int[this.a.length];
               this.d = new int[this.a.length];
               this.e = new int[this.a.length];
               this.a = new String[this.a.length];
               this.f = new int[this.a.length];
               this.b = new String[this.a.length];
            } catch (Exception var6) {
               var10000 = var6;
               var10001 = false;
               break label41;
            }

            int var2 = 0;

            while(true) {
               int var3;
               try {
                  var3 = this.a.length;
               } catch (Exception var4) {
                  var10000 = var4;
                  var10001 = false;
                  break;
               }

               if (var2 >= var3) {
                  break label37;
               }

               try {
                  this.a[var2] = var1.a().readByte();
                  this.b[var2] = var1.a().readByte();
                  this.c[var2] = var1.a().readByte();
                  this.d[var2] = var1.a().readByte();
                  if (var1.a().readByte() == 1) {
                     this.a[var2] = var1.a().readUTF();
                     this.e[var2] = var1.a().readInt();
                     this.b[var2] = var1.a().readUTF();
                     this.f[var2] = var1.a().readInt();
                  }
               } catch (Exception var5) {
                  var10000 = var5;
                  var10001 = false;
                  break;
               }

               ++var2;
            }
         }

         Exception var7 = var10000;
         var7.printStackTrace();
      }

      main.a.a.s();
      main.a.a.t();
   }

   public final void a(al var1) {
      if (!Char.myCharz().z && !this.g() && Char.myCharz().a.a > 1) {
         Char.myCharz().a = var1;
         if (this.a != var1 && this.a != null) {
            pasta.av.a().f(var1.a.a);
            this.n();
            this.a = var1;
            this.aw = -1;
            a().z = 0;
         } else if (Char.myCharz().a()) {
            this.b(var1);
            this.a = var1;
         } else {
            this.aw = -1;
            if (var1 != null) {
               if (this.a != var1) {
                  pasta.av.a().f(var1.a.a);
                  this.n();
               }

               if (Char.myCharz().a != null || !Char.myCharz().b()) {
                  if (Char.myCharz().i()) {
                     this.b(true);
                  }

                  this.a = var1;
               }
            }
         }
      }

   }

   public final void a(as var1) {
      if ((var1.equals(Char.myCharz().a) || this.a == null) && !this.a(var1)) {
         if (var1 != null && this.aC <= 0) {
            label65: {
               this.aC = 10;
               int var2 = var1.a();
               var2 = cq.f(Char.myCharz().b - var2);
               byte var4;
               if (var2 <= 80) {
                  var4 = 1;
               } else if (var2 > 80 && var2 <= 200) {
                  var4 = 2;
               } else if (var2 > 200 && var2 <= 400) {
                  var4 = 3;
               } else {
                  var4 = 4;
               }

               label42: {
                  if (!var1.equals(Char.myCharz().a)) {
                     if (!var1.equals(Char.myCharz().a)) {
                        break label42;
                     }

                     Char.myCharz();
                     if (!Char.b(Char.myCharz().a)) {
                        break label42;
                     }
                  }

                  pasta.y.a(135, var1.a(), var1.b(), var4);
                  break label65;
               }

               if (var1.equals(Char.myCharz().a) || var1.equals(Char.myCharz().a) || var1.equals(Char.myCharz().a)) {
                  pasta.y.a(136, var1.a(), var1.b(), var4);
               }
            }
         }

         Char.myCharz();
         Char.myCharz().a = null;
         Char var3 = Char.myCharz();
         Char.myCharz().e = 0;
         var3.d = 0;
         var1.i();
         this.z = 10;
         this.b(true);
         this.am = var1.a();
         this.an = var1.b();
         this.x = false;
         this.e = true;
      }

   }

   public final void a(dm var1) {
      x = 0;
      if (o) {
         if (this.g || this.h && pasta.k.a == null) {
            ++this.A;
            if (this.A < 30 && this.A >= 0 && main.a.g % 4 == 0 || this.A >= 30 && this.A <= 50 && main.a.g % 3 == 0 || this.A > 50) {
               var1.a(16777215);
               var1.e(0, 0, main.a.i, main.a.j);
               if (this.A > 50) {
                  if (this.h) {
                     this.h = false;
                     this.A = 0;
                     if (this.k) {
                        this.c(this.C, this.D);
                     } else {
                        this.i = false;
                        dh.a(17);
                        if (this.j) {
                           this.j = false;
                           dh.a(25);
                        }
                     }
                  }

                  this.e(var1);
                  var1.a(-k, -l);
                  var1.a(0, main.a.o);
                  Char.myCharz().b(var1);
                  dz.a(var1);
                  c(var1);
                  this.f(var1);
               }

               return;
            }
         }

         main.a.b(var1);
         if ((this.i || this.s) && TileMap.i != 3) {
            b(var1);
         }

         if (J > 0) {
            var1.a(-k + n[J % n.length], -l + o[J % o.length]);
            --J;
         } else {
            var1.a(-k, -l);
         }

         if (this.y) {
            byte var2;
            if (main.a.g % 3 == 0) {
               var2 = 3;
            } else {
               var2 = -3;
            }

            var1.a(var2, 0);
         }

         da.c(var1);
         dh.a(var1);
         TileMap.a(var1);
         TileMap.b(var1);

         Char var14;
         int var44;
         for(var44 = 0; var44 < d.size(); ++var44) {
            var14 = (Char)d.elementAt(var44);
            if (var14.D && TileMap.mapId == 128) {
               var14.a((dm)var1, (int)var14.b, (int)var14.c, (int)0);
            }
         }

         if (Char.myCharz().D && TileMap.mapId == 128) {
            Char.myCharz().a((dm)var1, (int)Char.myCharz().b, (int)Char.myCharz().c, (int)0);
         }

         a(var1, 2);
         if (Char.myCharz().a != null && main.a.e) {
            if (pasta.ag.h == 20) {
               var1.a(B, Char.myCharz().a.b + k, Char.myCharz().a.c + l, 3);
            } else {
               var1.a(A, Char.myCharz().a.b + k, Char.myCharz().a.c + l, 3);
            }
         }

         da.f(var1);

         for(var44 = 0; var44 < cb.f.size(); ++var44) {
            ((cb)cb.f.elementAt(var44)).a(var1);
         }

         for(var44 = 0; var44 < bn.a.size(); ++var44) {
            ((bn)bn.a.elementAt(var44)).a(var1);
         }

         cm var51;
         for(var44 = 0; var44 < g.size(); ++var44) {
            var51 = (cm)g.elementAt(var44);
            if (var51.t > 0) {
               var51.c(var1);
            }
         }

         for(var44 = 0; var44 < g.size(); ++var44) {
            ((cm)g.elementAt(var44)).b(var1);
         }

         var1.a(0, main.a.o);

         for(var44 = 0; var44 < d.size(); ++var44) {
            try {
               var14 = (Char)d.elementAt(var44);
            } catch (Exception var21) {
               var14 = null;
            }

            if (var14 != null && (!main.a.a.a || !main.a.a.a()) && var14.m) {
               var14.c(var1);
            }
         }

         Char.myCharz().c(var1);
         dh.b(var1);

         for(var44 = 0; var44 < f.size(); ++var44) {
            ((i)f.elementAt(var44)).a(var1);
         }

         for(var44 = 0; var44 < bn.a.size(); ++var44) {
            ((bn)bn.a.elementAt(var44)).b(var1);
         }

         for(var44 = 0; var44 < d.size(); ++var44) {
            try {
               var14 = (Char)d.elementAt(var44);
            } catch (Exception var20) {
               var14 = null;
            }

            if (var14 != null && (!main.a.a.a || !main.a.a.a())) {
               var14.b(var1);
            }
         }

         Char.myCharz().b(var1);
         if (Char.myCharz().a != null && Char.myCharz().a() != null && Char.myCharz().ab < Char.myCharz().a().length) {
            Char.myCharz().d(var1);
            Char.myCharz().a(var1);
         }

         for(var44 = 0; var44 < d.size(); ++var44) {
            try {
               var14 = (Char)d.elementAt(var44);
            } catch (Exception var19) {
               var14 = null;
            }

            if (var14 != null && (!main.a.a.a || !main.a.a.a()) && var14.a != null && var14.a() != null && var14.ab < var14.a().length) {
               var14.d(var1);
               var14.a(var1);
            }
         }

         for(var44 = 0; var44 < e.size(); ++var44) {
            ((ItemMap)e.elementAt(var44)).a(var1);
         }

         var1.a(0, -main.a.o);

         for(var44 = 0; var44 < 2; ++var44) {
            if (x[var44] != -1) {
               if (z[var44] == 1) {
                  var1.a(a[y[var44]], v[var44], w[var44], 3);
               } else {
                  var1.a(a[y[var44]], 0, 0, dm.a(a[y[var44]]), dm.b(a[y[var44]]), 2, v[var44], w[var44], 3);
               }
            }
         }

         for(var44 = 0; var44 < cb.b.size(); ++var44) {
            cb var55 = (cb)cb.b.elementAt(var44);
            if (!(var55 instanceof k)) {
               var55.a(var1);
            }
         }

         if (!main.a.b) {
            for(var44 = 0; var44 < cb.e.size(); ++var44) {
               ((cb)cb.e.elementAt(var44)).a(var1);
            }
         }

         for(var44 = 0; var44 < cb.d.size(); ++var44) {
            ((cb)cb.d.elementAt(var44)).a(var1);
         }

         a(var1, 3);

         for(var44 = 0; var44 < g.size(); ++var44) {
            ((cm)g.elementAt(var44)).e(var1);
         }

         dh.c(var1);

         for(var44 = 0; var44 < g.size(); ++var44) {
            var51 = (cm)g.elementAt(var44);
            if (var51 != null && var51.a != null) {
               var51.a.a(var1, var51.b, var51.c - var51.B - main.a.o, var51.i);
            }
         }

         for(var44 = 0; var44 < d.size(); ++var44) {
            try {
               var14 = (Char)d.elementAt(var44);
            } catch (Exception var18) {
               var14 = null;
            }

            if (var14 != null && var14.a != null) {
               var14.a.a(var1, var14.b, var14.c - var14.B, var14.i);
            }
         }

         if (Char.myCharz().a != null) {
            Char.myCharz().a.a(var1, Char.myCharz().b, Char.myCharz().c - Char.myCharz().B, Char.myCharz().i);
         }

         da.d(var1);

         for(var44 = 0; var44 < TileMap.c.size(); ++var44) {
            by var56 = (by)TileMap.c.elementAt(var44);
            if (var56.a != -1 && var56.a > 3) {
               var56.a(var1);
            }
         }

         pasta.ar.a(var1);
         if (TileMap.mapId == 120) {
            if (this.j != 100) {
               var44 = this.j * dm.a(K) / 100;
               var1.a(K, TileMap.c / 2 - dm.a(K) / 2, 220, 0);
               var1.f(TileMap.c / 2 - dm.a(K) / 2, 220, var44, 10);
               var1.a(s, TileMap.c / 2 - dm.a(K) / 2, 220, 0);
               var1.f(0, 0, main.a.i, main.a.j);
            }

            if (this.t) {
               ++this.U;
               if (main.a.g % 3 == 0) {
                  dh.a(new cx(19, cq.b(TileMap.c / 2 - 50, TileMap.c / 2 + 50), 340, 2, 1, -1));
               }

               if (main.a.g % 15 == 0) {
                  dh.a(new cx(18, cq.b(TileMap.c / 2 - 5, TileMap.c / 2 + 5), cq.b(300, 320), 2, 1, -1));
               }

               if (this.U == 100) {
                  this.teleTo(TileMap.c / 2, 300);
               }

               if (this.U == 110) {
                  this.U = 0;
                  this.t = false;
               }
            }
         }

         da.a(var1);

         boolean var53;
         label752: {
            for(var44 = 0; var44 < da.a.size(); ++var44) {
               if (((da)da.a.elementAt(var44)).a == 0) {
                  var53 = false;
                  break label752;
               }
            }

            var53 = true;
         }

         if (dm.a <= 1) {
            var53 = false;
         }

         int var3;
         int var4;
         if (var53 && !this.i) {
            var3 = TileMap.c / (dm.a(TileMap.c) + 50);
            var44 = var3;
            if (var3 <= 0) {
               var44 = 1;
            }

            if (TileMap.e != 28) {
               for(var3 = 0; var3 < var44; ++var3) {
                  var4 = (dm.a(TileMap.c) + 50) * var3 + 100 - k / 2;
                  if (dm.a(TileMap.c) + var4 >= k && var4 <= k + main.a.i && dm.b(TileMap.c) - 20 >= l && -20 <= l + main.a.j) {
                     var1.a(TileMap.c, (dm.a(TileMap.c) + 50) * var3 + 100 - k / 2, -20, 0);
                  }
               }
            }
         }

         dz.a(var1);

         byte var46;
         label980: {
            boolean var10001;
            k var57;
            try {
               var57 = pasta.k.a;
            } catch (Exception var43) {
               var10001 = false;
               break label980;
            }

            if (var57 == null) {
               label984: {
                  byte var45;
                  try {
                     var45 = a();
                  } catch (Exception var42) {
                     var10001 = false;
                     break label984;
                  }

                  if (var45 != -1) {
                     label985: {
                        var51 = null;
                        var44 = 0;

                        while(true) {
                           try {
                              if (var44 >= g.size()) {
                                 break;
                              }
                           } catch (Exception var39) {
                              var10001 = false;
                              break label985;
                           }

                           cm var15;
                           label715: {
                              label945: {
                                 cm var16;
                                 try {
                                    var16 = (cm)g.elementAt(var44);
                                    if (var16.all.a != var45) {
                                       break label945;
                                    }
                                 } catch (Exception var41) {
                                    var10001 = false;
                                    break label985;
                                 }

                                 if (var51 == null) {
                                    var15 = var16;
                                    break label715;
                                 }

                                 var15 = var16;

                                 try {
                                    if (cq.f(var16.b - Char.myCharz().b) < cq.f(var51.b - Char.myCharz().b)) {
                                       break label715;
                                    }
                                 } catch (Exception var40) {
                                    var10001 = false;
                                    break label985;
                                 }
                              }

                              var15 = var51;
                           }

                           ++var44;
                           var51 = var15;
                        }

                        if (var51 != null) {
                           label986: {
                              try {
                                 if (var51.h == 15 || var51.b > k && var51.b < k + a && var51.c > l && var51.c < l + b) {
                                    break label986;
                                 }
                              } catch (Exception var38) {
                                 var10001 = false;
                                 break label986;
                              }

                              int var8;
                              int var9;
                              try {
                                 if (main.a.g % 10 < 5) {
                                    break label986;
                                 }

                                 var9 = var51.b - Char.myCharz().b;
                                 var8 = var51.c - Char.myCharz().c;
                              } catch (Exception var37) {
                                 var10001 = false;
                                 break label986;
                              }

                              byte var5 = 0;
                              byte var6 = 0;
                              byte var7 = 0;
                              if (var9 > 0 && var8 >= 0) {
                                 label947: {
                                    label948: {
                                       try {
                                          if (cq.f(var9) < cq.f(var8)) {
                                             break label948;
                                          }

                                          var4 = a - 10;
                                          var44 = b / 2 + 30;
                                       } catch (Exception var36) {
                                          var10001 = false;
                                          break label986;
                                       }

                                       try {
                                          if (main.a.e) {
                                             var44 = b / 2 + 10;
                                          }
                                       } catch (Exception var35) {
                                          var10001 = false;
                                          break label986;
                                       }

                                       var46 = 0;
                                       break label947;
                                    }

                                    try {
                                       var4 = a / 2;
                                       var44 = b - 10;
                                    } catch (Exception var32) {
                                       var10001 = false;
                                       break label986;
                                    }

                                    var46 = 5;
                                 }
                              } else {
                                 var44 = var6;
                                 var46 = var7;
                                 var4 = var5;
                                 if (var9 >= 0) {
                                    var44 = var6;
                                    var46 = var7;
                                    var4 = var5;
                                    if (var8 < 0) {
                                       label949: {
                                          label950: {
                                             try {
                                                if (cq.f(var9) < cq.f(var8)) {
                                                   break label950;
                                                }

                                                var4 = a - 10;
                                                var44 = b / 2 + 30;
                                             } catch (Exception var34) {
                                                var10001 = false;
                                                break label986;
                                             }

                                             try {
                                                if (main.a.e) {
                                                   var44 = b / 2 + 10;
                                                }
                                             } catch (Exception var33) {
                                                var10001 = false;
                                                break label986;
                                             }

                                             var46 = 0;
                                             break label949;
                                          }

                                          try {
                                             var4 = a / 2;
                                          } catch (Exception var31) {
                                             var10001 = false;
                                             break label986;
                                          }

                                          var44 = 10;
                                          var46 = 6;
                                       }
                                    }
                                 }
                              }

                              if (var9 < 0 && var8 >= 0) {
                                 label951: {
                                    label952: {
                                       try {
                                          if (cq.f(var9) < cq.f(var8)) {
                                             break label952;
                                          }
                                       } catch (Exception var30) {
                                          var10001 = false;
                                          break label986;
                                       }

                                       var4 = 10;

                                       try {
                                          var44 = b / 2 + 30;
                                       } catch (Exception var26) {
                                          var10001 = false;
                                          break label986;
                                       }

                                       try {
                                          if (main.a.e) {
                                             var44 = b / 2 + 10;
                                          }
                                       } catch (Exception var29) {
                                          var10001 = false;
                                          break label986;
                                       }

                                       var46 = 3;
                                       break label951;
                                    }

                                    try {
                                       var4 = a / 2;
                                       var44 = b;
                                    } catch (Exception var25) {
                                       var10001 = false;
                                       break label986;
                                    }

                                    var46 = 5;
                                    var44 -= 10;
                                 }
                              } else if (var9 <= 0 && var8 < 0) {
                                 label953: {
                                    label954: {
                                       try {
                                          if (cq.f(var9) >= cq.f(var8)) {
                                             break label954;
                                          }
                                       } catch (Exception var28) {
                                          var10001 = false;
                                          break label986;
                                       }

                                       try {
                                          var4 = a / 2;
                                       } catch (Exception var23) {
                                          var10001 = false;
                                          break label986;
                                       }

                                       var46 = 6;
                                       var44 = 10;
                                       break label953;
                                    }

                                    var4 = 10;

                                    try {
                                       var44 = b / 2 + 30;
                                    } catch (Exception var24) {
                                       var10001 = false;
                                       break label986;
                                    }

                                    try {
                                       if (main.a.e) {
                                          var44 = b / 2 + 10;
                                       }
                                    } catch (Exception var27) {
                                       var10001 = false;
                                       break label986;
                                    }

                                    var46 = 3;
                                 }
                              }

                              try {
                                 c(var1);
                                 var1.a(z, 0, 0, 13, 16, var46, var4, var44, bk.f);
                              } catch (Exception var22) {
                                 var10001 = false;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if (!a && I == 1 && !main.a.a.a) {
            this.e(var1);
         }

         c(var1);
         pasta.c.a(var1);
         if (!a) {
            if (main.a.q) {
               if (main.a.i > 250) {
                  var1.a(main.a.a, 160, 6, 0);
                  cg.s.a(var1, "DRAGON ZENKAI \ud83c\udde7\ud83c\uddf7", 180, 2, 0);
                  cg.s.a(var1, "YT: Dragon 4k", 180, 12, 0);
                  cg.s.a(var1, "Dv: Oseias/Schayder", 180, 22, 0);
               } else {
                  var1.a(main.a.a, 5, main.a.j - 67, 0);
                  cg.s.a(var1, "\ud83c\udfc6.", 25, main.a.j - 70, 0);
                  cg.s.a(var1, "ZENKAI S+.", 25, main.a.j - 60, 0);
               }
            }

            var1.a(-var1.a(), -var1.b());
            if ((TileMap.mapId == 128 || TileMap.mapId == 127) && k != 0) {
               var1.a(0);
               var1.e(3, 88, 54, 8);
               var1.a(16711680);
               var1.f(5, 90, k, 4);
               var1.e(5, 90, 50, 4);
               var1.f(0, 0, 3000, 3000);
               cg.c.a(var1, "Mabu", 30, 98, 2, cg.f);
            }

            if (Char.myCharz().K) {
               var14 = Char.myCharz();
               ++var14.ak;
               if (main.a.g % 3 == 0) {
                  var1.a(16777215);
                  var1.e(0, 0, main.a.i, main.a.j);
               }

               if (Char.myCharz().ak >= 100) {
                  Char.myCharz().z();
               }
            }

            for(var44 = 0; var44 < d.size(); ++var44) {
               try {
                  var14 = (Char)d.elementAt(var44);
               } catch (Exception var17) {
                  var14 = null;
               }

               if (var14 != null && var14.K && Char.a(var14)) {
                  ++var14.ak;
                  if (main.a.g % 3 == 0) {
                     var1.a(16777215);
                     var1.e(0, 0, main.a.i, main.a.j);
                  }

                  if (var14.ak >= 100) {
                     var14.z();
                  }
               }
            }

            c(var1);
            this.f(var1);
            c(var1);
            if (main.a.e && main.a.f && !h()) {
               c(var1);
               if (!TileMap.b() && !this.e()) {
                  if (pasta.ag.h == 15) {
                     var1.a(B, aE + 17, aF + 17, 3);
                  } else {
                     var1.a(A, aE + 17, aF + 17, 3);
                  }
               }
            }

            c(var1);
            String var58;
            if (a.size() != 0 && u) {
               var1.f(0, main.a.j - 13, main.a.i, 15);
               var1.a(0, main.a.j - 13, main.a.i, 15, 0);
               var58 = (String)a.elementAt(0);
               cg.e.a(var1, var58, this.aX, main.a.j - 12, 0);
            }

            if (!main.a.a.a && main.a.a == null && pasta.k.a == null && pasta.k.b == null && main.a.a.equals(a)) {
               super.a(var1);
            }

            c(var1);
            if (Char.all.size() != 0) {
               var44 = i.size() * 12;
            } else {
               var44 = 0;
            }

            int var49 = var44 + 100;
            int var47;
            if (Char.myCharz().a != null) {
               int var48 = (main.a.j - 100 - 60) / 12;
               var4 = 0;
               var3 = 0;

               for(var44 = 0; var4 < d.size(); var3 = var47) {
                  label575: {
                     var14 = (Char)d.elementAt(var4);
                     if (var14.z != -1 && var14.z == Char.myCharz().a.a) {
                        if (var14.d() && var14.b < Char.myCharz().b) {
                           if (Char.all.size() != 0) {
                              var47 = var48 - i.size();
                           } else {
                              var47 = var48;
                           }

                           if (var3 <= var47) {
                              cg.r.a(var1, var14.a, 20, var49 - 12 + var3 * 12, 0, cg.o);
                              var14.a(var1, 10, var3 * 12 + var49 - 5);
                              var47 = var3 + 1;
                              var3 = var44;
                              var44 = var47;
                              break label575;
                           }
                        } else if (var14.d() && var14.b > Char.myCharz().b && var44 <= var48) {
                           cg.r.a(var1, var14.a, main.a.i - 25, var49 - 12 + var44 * 12, 1, cg.o);
                           var14.a(var1, main.a.i - 15, var44 * 12 + var49 - 5);
                           var47 = var44 + 1;
                           var44 = var3;
                           var3 = var47;
                           break label575;
                        }
                     }

                     var47 = var44;
                     var44 = var3;
                     var3 = var47;
                  }

                  ++var4;
                  var47 = var44;
                  var44 = var3;
               }
            }

            bq.a().a(var1);
            if (f && !main.a.a.a && main.a.g % 4 == 0) {
               var1.a(ItemMap.a, this.e.b + 15, this.e.c + 30, 33);
            }

            if (this.y) {
               this.at += 5;
               if (this.aq >= 0) {
                  this.aq += this.at;
               }

               if (this.aq < 0) {
                  --this.aq;
                  if (this.aq == -20) {
                     this.y = false;
                     this.aq = 0;
                     this.at = 0;
                  }
               } else if ((this.ar - this.aq > 0 || this.aq < TileMap.c) && this.aq > 0) {
                  var1.a(16777215);
                  if (!main.a.b && dz.a != 3 && dz.a != 5) {
                     var1.a(this.ar - this.aq, this.as - this.aq, this.aq * 2, this.aq * 2);
                  } else {
                     var1.e(0, 0, main.a.i, main.a.j);
                  }
               } else {
                  this.aq = -1;
               }
            }

            for(var44 = 0; var44 < Char.all.size(); ++var44) {
               bx var52 = (bx)Char.all.elementAt(var44);
               var3 = this.e.b + 32 + var44 * 24;
               pasta.ao.a(var1, var52.a, var3, 55, 0, 3);
               var58 = var52.b + "'";
               if (var52.b == 0) {
                  var58 = var52.a + "s";
               }

               cg.c.a(var1, var58, var3, 70, 2, cg.f);
            }

            for(var44 = 0; var44 < i.size(); ++var44) {
               bx var59 = (bx)i.elementAt(var44);
               var47 = this.e.b;
               if (Char.all.size() != 0) {
                  var46 = 5;
               } else {
                  var46 = 25;
               }

               byte var50;
               if (Char.all.size() != 0) {
                  var50 = 90;
               } else {
                  var50 = 45;
               }

               var59.a(var1, var46 + var47, var50 + var44 * 12);
            }

            this.d(var1);
            if (pasta.ab.a == 1) {
               long var12 = dz.a();
               long var10 = a;
               cg var60 = cg.c;
               Calendar var54 = Calendar.getInstance();
               var54.setTime(new Date(var12 + var10 + 25200000L));
               var44 = var54.get(11);
               var3 = var54.get(12);
               var60.a(var1, var44 + "h" + var3 + "m", 10, main.a.j - 65, 0, cg.f);
            }

            if (!this.d.equals("")) {
               for(var44 = 0; var44 < this.d.length; ++var44) {
                  cg.c.a(var1, this.d[var44], 5, var44 * 18 + 85, 0, cg.f);
               }
            }
         }
      }

   }

   public final void a(boolean var1) {
      this.k = true;
      this.h = true;
      this.z = true;
      if (var1) {
         dh.a(new cx(20, Char.myCharz().b, Char.myCharz().c - 77, 2, 8, 1));
      }

   }

   public final void a(byte[] var1) {
      int var2 = 0;
      b = new al[5];
      if (var1 != null) {
         for(var2 = 0; var2 < var1.length; ++var2) {
            for(int var3 = 0; var3 < Char.myCharz().b.size(); ++var3) {
               al var4 = (al)Char.myCharz().b.elementAt(var3);
               if (var4.a.a == var1[var2]) {
                  b[var2] = var4;
                  break;
               }
            }
         }
      } else {
         while(true) {
            if (var2 >= b.length || var2 >= Char.myCharz().b.size()) {
               u();
               break;
            }

            al var5 = (al)Char.myCharz().b.elementAt(var2);
            b[var2] = var5;
            ++var2;
         }
      }

   }

   public final void autoPickItem() {
      this.k = false;
      this.h = true;
      this.z = false;
   }

   public final void b() {
      byte var5 = 1;
      byte var4 = 0;
      if (H > 0) {
         --H;
      }

      if (main.a.g % 100 == 0 && TileMap.mapId == 137) {
         J = 30;
      }

      int var91;
      int var92;
      if (l && main.a.g % 20 == 0) {
         if (this.G > 0) {
            --this.G;
         }

         if (m && !n && Char.myCharz().h != 14 && Char.myCharz().h != 5 && !Char.myCharz().o && !Char.myCharz().B && !Char.myCharz().c()) {
            int var3 = 0;

            boolean var1;
            boolean var2;
            i var6;
            for(var1 = false; var3 < f.size(); var1 = var2) {
               var6 = (i)f.elementAt(var3);
               var2 = var1;
               if (var6.h != 0) {
                  var2 = var1;
                  if (var6.h != 1) {
                     var2 = true;
                  }
               }

               ++var3;
            }

            if (var1) {
               var91 = 0;

               while(true) {
                  if (var91 >= Char.myCharz().arrItemBag.length) {
                     var1 = false;
                     break;
                  }

                  Item var93 = Char.myCharz().arrItemBag[var91];
                  if (var93 != null && var93.itemTemplate.type == 6) {
                     var1 = true;
                     break;
                  }

                  ++var91;
               }

               if (!var1 && main.a.g % 150 == 0) {
                  pasta.av.a().r();
               }

               if (Char.myCharz().t <= Char.myCharz().w * 20 / 100 || Char.myCharz().s <= Char.myCharz().x * 20 / 100) {
                  this.o();
               }

               if (Char.myCharz().a == null || Char.myCharz().a != null && Char.myCharz().a.h) {
                  for(var91 = 0; var91 < f.size(); ++var91) {
                     var6 = (i)f.elementAt(var91);
                     if (var6.h != 0 && var6.h != 1 && var6.c > 0 && !var6.h) {
                        Char.myCharz().b = var6.e;
                        Char.myCharz().c = var6.f;
                        Char.myCharz().a = var6;
                        pasta.av.a().g();
                        break;
                     }
                  }
               } else if (Char.myCharz().a.c <= 0 || Char.myCharz().a.h == 1 || Char.myCharz().a.h == 0) {
                  Char.myCharz().a = null;
               }

               if (Char.myCharz().a != null && this.G == 0 && (Char.myCharz().a() == null || Char.myCharz().ab >= Char.myCharz().a().length || Char.myCharz().a == null || Char.myCharz().a == null)) {
                  al var7 = null;
                  al var94;
                  if (main.a.e) {
                     for(var92 = 0; var92 < b.length; var7 = var94) {
                        var94 = var7;
                        if (b[var92] != null) {
                           var94 = var7;
                           if (!b[var92].a) {
                              var94 = var7;
                              if (b[var92].a.a != 10) {
                                 var94 = var7;
                                 if (b[var92].a.a != 11) {
                                    var94 = var7;
                                    if (b[var92].a.a != 14) {
                                       var94 = var7;
                                       if (b[var92].a.a != 23) {
                                          var94 = var7;
                                          if (b[var92].a.a != 7) {
                                             var94 = var7;
                                             if (Char.myCharz().a() == null) {
                                                if (b[var92].a.b == 2) {
                                                   var91 = 1;
                                                } else if (b[var92].a.b != 1) {
                                                   var91 = b[var92].e;
                                                } else {
                                                   var91 = b[var92].e * Char.myCharz().x / 100;
                                                }

                                                var94 = var7;
                                                if (Char.myCharz().s >= var91) {
                                                   if (var7 == null) {
                                                      var94 = b[var92];
                                                   } else {
                                                      var94 = var7;
                                                      if (var7.b < b[var92].b) {
                                                         var94 = b[var92];
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        ++var92;
                     }

                     if (var7 != null) {
                        this.a(var7);
                        this.a((as)Char.myCharz().a);
                     }
                  } else {
                     var7 = null;

                     for(var92 = 0; var92 < a.length; var7 = var94) {
                        var94 = var7;
                        if (a[var92] != null) {
                           var94 = var7;
                           if (!a[var92].a) {
                              var94 = var7;
                              if (a[var92].a.a != 10) {
                                 var94 = var7;
                                 if (a[var92].a.a != 11) {
                                    var94 = var7;
                                    if (a[var92].a.a != 14) {
                                       var94 = var7;
                                       if (a[var92].a.a != 23) {
                                          var94 = var7;
                                          if (a[var92].a.a != 7) {
                                             var94 = var7;
                                             if (Char.myCharz().a() == null) {
                                                if (a[var92].a.b == 2) {
                                                   var91 = 1;
                                                } else if (a[var92].a.b != 1) {
                                                   var91 = a[var92].e;
                                                } else {
                                                   var91 = a[var92].e * Char.myCharz().x / 100;
                                                }

                                                var94 = var7;
                                                if (Char.myCharz().s >= var91) {
                                                   if (var7 == null) {
                                                      var94 = a[var92];
                                                   } else {
                                                      var94 = var7;
                                                      if (var7.b < a[var92].b) {
                                                         var94 = a[var92];
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        ++var92;
                     }

                     if (var7 != null) {
                        this.a(var7);
                        this.a((as)Char.myCharz().a);
                     }
                  }
               }
            }
         }
      }

      int var10002;
      int[] var96;
      if (this.aW != 0) {
         if (System.currentTimeMillis() - f > 1000L) {
            f = System.currentTimeMillis();
            ++az;
         }

         if (az > 20) {
            for(var91 = 0; var91 < this.A.length; ++var91) {
               this.B[var91] = this.A[var91];
            }

            --this.aW;
            if (this.aW == 0) {
               this.d = "";
               a.a(this.c, 0);
               az = 0;
            }
         } else if (this.aV > this.A.length - 1) {
            --this.aW;
            if (this.aW == 0) {
               this.d = "";
               a.a(this.c, 0);
            }
         } else {
            if (this.aV < this.B.length) {
               if (this.C[this.aV] == 15) {
                  if (this.B[this.aV] == this.A[this.aV] - 1) {
                     this.E[this.aV] = 10;
                  }

                  if (this.B[this.aV] == this.A[this.aV]) {
                     this.C[this.aV] = -1;
                     ++this.aV;
                  }
               } else if (main.a.g % 5 == 0) {
                  var96 = this.C;
                  var91 = this.aV;
                  var10002 = var96[var91]++;
               }
            }

            for(var91 = 0; var91 < this.A.length; ++var91) {
               if (this.C[var91] != -1) {
                  var96 = this.D;
                  var10002 = var96[var91]++;
                  if (this.D[var91] > this.C[var91] + this.E[var91]) {
                     this.D[var91] = 0;
                     var96 = this.B;
                     var10002 = var96[var91]++;
                     if (this.B[var91] >= 10) {
                        this.B[var91] = 0;
                     }
                  }
               }
            }
         }
      }

      pasta.ao.d();
      ++this.af;
      if (this.af == 100) {
         this.af = 0;
      }

      label951: {
         Exception var10000;
         label1065: {
            boolean var10001;
            try {
               if (v == 1) {
                  e = System.currentTimeMillis();
               }
            } catch (Exception var56) {
               var10000 = var56;
               var10001 = false;
               break label1065;
            }

            label948: {
               Message var95;
               av var97;
               try {
                  if (v != 100) {
                     break label948;
                  }

                  v = 0;
                  var91 = (int)(System.currentTimeMillis() - e) / 1000;
                  var97 = pasta.av.a();
                  var95 = new Message((byte)-78);
               } catch (Exception var90) {
                  var10000 = var90;
                  var10001 = false;
                  break label1065;
               }

               try {
                  var95.a().writeInt(var91);
                  var97.a.a(var95);
                  var95.a();
               } catch (Exception var8) {
               }
            }

            label942: {
               try {
                  if (u <= 0) {
                     break label942;
                  }

                  var91 = u - 1;
                  u = var91;
               } catch (Exception var89) {
                  var10000 = var89;
                  var10001 = false;
                  break label1065;
               }

               if (var91 == 0) {
                  try {
                     pasta.j.b = false;
                  } catch (Exception var55) {
                     var10000 = var55;
                     var10001 = false;
                     break label1065;
                  }
               }
            }

            label1066: {
               label1067: {
                  try {
                     if (a) {
                        break label1066;
                     }

                     if (k == m && l == n) {
                        break label1067;
                     }
                  } catch (Exception var88) {
                     var10000 = var88;
                     var10001 = false;
                     break label1065;
                  }

                  try {
                     ab = m - k << 2;
                     ac = n - l << 2;
                     Z += ab;
                     k += Z >> 4;
                     Z &= 15;
                     aa += ac;
                     l += aa >> 4;
                     aa &= 15;
                     if (k < 24) {
                        k = 24;
                     }
                  } catch (Exception var87) {
                     var10000 = var87;
                     var10001 = false;
                     break label1065;
                  }

                  try {
                     if (k > o) {
                        k = o;
                     }
                  } catch (Exception var54) {
                     var10000 = var54;
                     var10001 = false;
                     break label1065;
                  }

                  try {
                     if (l < 0) {
                        l = 0;
                     }
                  } catch (Exception var86) {
                     var10000 = var86;
                     var10001 = false;
                     break label1065;
                  }

                  try {
                     if (l > ad) {
                        l = ad;
                     }
                  } catch (Exception var53) {
                     var10000 = var53;
                     var10001 = false;
                     break label1065;
                  }
               }

               try {
                  var91 = k / TileMap.a - 1;
                  p = var91;
               } catch (Exception var52) {
                  var10000 = var52;
                  var10001 = false;
                  break label1065;
               }

               if (var91 < 0) {
                  try {
                     p = 0;
                  } catch (Exception var51) {
                     var10000 = var51;
                     var10001 = false;
                     break label1065;
                  }
               }

               try {
                  q = l / TileMap.a;
                  r = p + V;
                  s = q + W;
                  if (q < 0) {
                     q = 0;
                  }
               } catch (Exception var50) {
                  var10000 = var50;
                  var10001 = false;
                  break label1065;
               }

               try {
                  if (s > TileMap.b - 1) {
                     s = TileMap.b - 1;
                  }
               } catch (Exception var85) {
                  var10000 = var85;
                  var10001 = false;
                  break label1065;
               }

               try {
                  var91 = (Char.myCharz().b - a * 2) / TileMap.a;
                  TileMap.l = var91;
               } catch (Exception var49) {
                  var10000 = var49;
                  var10001 = false;
                  break label1065;
               }

               if (var91 < 0) {
                  try {
                     TileMap.l = 0;
                  } catch (Exception var48) {
                     var10000 = var48;
                     var10001 = false;
                     break label1065;
                  }
               }

               try {
                  var91 = TileMap.l + TileMap.p;
                  TileMap.m = var91;
                  if (var91 > TileMap.a) {
                     var91 = TileMap.a;
                     TileMap.m = var91;
                     TileMap.l = var91 - TileMap.p;
                  }
               } catch (Exception var84) {
                  var10000 = var84;
                  var10001 = false;
                  break label1065;
               }

               try {
                  var91 = (Char.myCharz().c - b * 2) / TileMap.a;
                  TileMap.n = var91;
               } catch (Exception var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label1065;
               }

               if (var91 < 0) {
                  try {
                     TileMap.n = 0;
                  } catch (Exception var46) {
                     var10000 = var46;
                     var10001 = false;
                     break label1065;
                  }
               }

               try {
                  var91 = TileMap.n + TileMap.q;
                  TileMap.o = var91;
                  if (var91 > TileMap.b) {
                     var91 = TileMap.b;
                     TileMap.o = var91;
                     TileMap.n = var91 - TileMap.q;
                  }
               } catch (Exception var83) {
                  var10000 = var83;
                  var10001 = false;
                  break label1065;
               }

               try {
                  b.a();
                  a.a();
               } catch (Exception var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label1065;
               }
            }

            try {
               bq.a().b();
            } catch (Exception var44) {
               var10000 = var44;
               var10001 = false;
               break label1065;
            }

            var91 = 0;

            while(true) {
               try {
                  if (var91 >= d.size()) {
                     break;
                  }
               } catch (Exception var82) {
                  var10000 = var82;
                  var10001 = false;
                  break label1065;
               }

               try {
                  ((Char)d.elementAt(var91)).onCancelChat();
               } catch (Exception var43) {
                  var10000 = var43;
                  var10001 = false;
                  break label1065;
               }

               ++var91;
            }

            var91 = 0;

            while(true) {
               try {
                  if (var91 >= bn.a.size()) {
                     Char.myCharz().onCancelChat();
                     if (Char.myCharz().h == 1 && main.a.g % 100 == 0) {
                        System.gc();
                     }
                     break;
                  }
               } catch (Exception var81) {
                  var10000 = var81;
                  var10001 = false;
                  break label1065;
               }

               try {
                  ((bn)bn.a.elementAt(var91)).a();
               } catch (Exception var42) {
                  var10000 = var42;
                  var10001 = false;
                  break label1065;
               }

               ++var91;
            }

            try {
               if (this.a != null) {
                  this.a.a();
               }
            } catch (Exception var41) {
               var10000 = var41;
               var10001 = false;
               break label1065;
            }

            try {
               dh.a();
            } catch (Exception var40) {
               var10000 = var40;
               var10001 = false;
               break label1065;
            }

            var91 = 0;

            while(true) {
               try {
                  if (var91 >= f.size()) {
                     break;
                  }
               } catch (Exception var80) {
                  var10000 = var80;
                  var10001 = false;
                  break label1065;
               }

               try {
                  ((i)f.elementAt(var91)).onCancelChat();
               } catch (Exception var39) {
                  var10000 = var39;
                  var10001 = false;
                  break label1065;
               }

               ++var91;
            }

            var91 = 0;

            while(true) {
               try {
                  if (var91 >= g.size()) {
                     this.av = b.length;
                     var91 = b.length - 1;
                     break;
                  }
               } catch (Exception var79) {
                  var10000 = var79;
                  var10001 = false;
                  break label1065;
               }

               try {
                  ((cm)g.elementAt(var91)).onCancelChat();
               } catch (Exception var38) {
                  var10000 = var38;
                  var10001 = false;
                  break label1065;
               }

               ++var91;
            }

            for(; var91 >= 0; --var91) {
               try {
                  if (b[var91] != null) {
                     this.av = var91 + 1;
                     break;
                  }
               } catch (Exception var78) {
                  var10000 = var78;
                  var10001 = false;
                  break label1065;
               }

               try {
                  --this.av;
               } catch (Exception var37) {
                  var10000 = var37;
                  var10001 = false;
                  break label1065;
               }
            }

            label1074: {
               try {
                  if (this.av == 1 && main.a.e) {
                     aK = -200;
                     break label1074;
                  }
               } catch (Exception var77) {
                  var10000 = var77;
                  var10001 = false;
                  break label1065;
               }

               try {
                  if (aK < 0) {
                     m();
                  }
               } catch (Exception var76) {
                  var10000 = var76;
                  var10001 = false;
                  break label1065;
               }
            }

            try {
               main.a.a().h();
            } catch (Exception var36) {
               var10000 = var36;
               var10001 = false;
               break label1065;
            }

            var91 = 0;

            label835:
            while(true) {
               if (var91 >= 5) {
                  try {
                     pasta.ar.c();
                  } catch (Exception var33) {
                     var10000 = var33;
                     var10001 = false;
                     break;
                  }

                  for(var91 = 0; var91 < 2; ++var91) {
                     try {
                        if (x[var91] == -1) {
                           continue;
                        }

                        var96 = x;
                     } catch (Exception var73) {
                        var10000 = var73;
                        var10001 = false;
                        break label835;
                     }

                     var10002 = var96[var91]++;

                     try {
                        var96 = v;
                        var96[var91] += z[var91] << 2;
                        var96 = w;
                     } catch (Exception var32) {
                        var10000 = var32;
                        var10001 = false;
                        break label835;
                     }

                     var10002 = var96[var91]--;

                     try {
                        if (x[var91] >= 6) {
                           x[var91] = -1;
                           continue;
                        }
                     } catch (Exception var74) {
                        var10000 = var74;
                        var10001 = false;
                        break label835;
                     }

                     try {
                        y[var91] = (x[var91] >> 1) % 3;
                     } catch (Exception var31) {
                        var10000 = var31;
                        var10001 = false;
                        break label835;
                     }
                  }

                  try {
                     if (aR != 0) {
                        aU = 0 - aR << 2;
                        aT += aU;
                        aR += aT >> 4;
                        aT &= 15;
                     }
                  } catch (Exception var30) {
                     var10000 = var30;
                     var10001 = false;
                     break;
                  }

                  try {
                     if (Math.abs(0 - aR) < 15 && aR < 0) {
                        aS = 0;
                     }
                  } catch (Exception var29) {
                     var10000 = var29;
                     var10001 = false;
                     break;
                  }

                  try {
                     if (Math.abs(0 - aR) < 15 && aR > 0) {
                        aS = 0;
                     }
                  } catch (Exception var28) {
                     var10000 = var28;
                     var10001 = false;
                     break;
                  }

                  try {
                     if (this.aC > 0) {
                        --this.aC;
                     }
                  } catch (Exception var27) {
                     var10000 = var27;
                     var10001 = false;
                     break;
                  }

                  label1079: {
                     as var98;
                     try {
                        if (!this.e) {
                           break label1079;
                        }

                        this.e = false;
                        var98 = a(this.am, this.an);
                     } catch (Exception var72) {
                        var10000 = var72;
                        var10001 = false;
                        break;
                     }

                     if (var98 != null) {
                        if (var98 == null) {
                           break label1079;
                        }

                        try {
                           if (!var98.equals(Char.myCharz().a) || TileMap.mapId != 51) {
                              break label1079;
                           }
                        } catch (Exception var71) {
                           var10000 = var71;
                           var10001 = false;
                           break;
                        }
                     }

                     try {
                        pasta.y.a(134, this.am, this.an + main.a.o / 2, 3);
                     } catch (Exception var26) {
                        var10000 = var26;
                        var10001 = false;
                        break;
                     }
                  }

                  var91 = 0;

                  while(true) {
                     try {
                        if (var91 >= e.size()) {
                           var91 = cb.c.size() - 1;
                           break;
                        }
                     } catch (Exception var70) {
                        var10000 = var70;
                        var10001 = false;
                        break label835;
                     }

                     try {
                        ((ItemMap)e.elementAt(var91)).a();
                     } catch (Exception var25) {
                        var10000 = var25;
                        var10001 = false;
                        break label835;
                     }

                     ++var91;
                  }

                  for(; var91 >= 0; --var91) {
                     try {
                        cb.b.removeElement(cb.c.elementAt(var91));
                        cb.c.removeElementAt(var91);
                     } catch (Exception var24) {
                        var10000 = var24;
                        var10001 = false;
                        break label835;
                     }
                  }

                  var91 = 0;

                  while(true) {
                     try {
                        if (var91 >= cb.b.size()) {
                           break;
                        }
                     } catch (Exception var69) {
                        var10000 = var69;
                        var10001 = false;
                        break label835;
                     }

                     try {
                        ((cb)cb.b.elementAt(var91)).a();
                     } catch (Exception var23) {
                        var10000 = var23;
                        var10001 = false;
                        break label835;
                     }

                     ++var91;
                  }

                  var91 = 0;

                  while(true) {
                     try {
                        if (var91 >= cb.d.size()) {
                           break;
                        }
                     } catch (Exception var68) {
                        var10000 = var68;
                        var10001 = false;
                        break label835;
                     }

                     try {
                        ((cb)cb.d.elementAt(var91)).a();
                     } catch (Exception var22) {
                        var10000 = var22;
                        var10001 = false;
                        break label835;
                     }

                     ++var91;
                  }

                  var91 = 0;

                  while(true) {
                     try {
                        if (var91 >= cb.e.size()) {
                           break;
                        }
                     } catch (Exception var67) {
                        var10000 = var67;
                        var10001 = false;
                        break label835;
                     }

                     try {
                        ((cb)cb.e.elementAt(var91)).a();
                     } catch (Exception var21) {
                        var10000 = var21;
                        var10001 = false;
                        break label835;
                     }

                     ++var91;
                  }

                  var91 = 0;

                  while(true) {
                     try {
                        if (var91 >= cb.f.size()) {
                           break;
                        }
                     } catch (Exception var66) {
                        var10000 = var66;
                        var10001 = false;
                        break label835;
                     }

                     try {
                        ((cb)cb.f.elementAt(var91)).a();
                     } catch (Exception var20) {
                        var10000 = var20;
                        var10001 = false;
                        break label835;
                     }

                     ++var91;
                  }

                  var91 = 0;

                  while(true) {
                     try {
                        if (var91 >= cb.a.size()) {
                           da.b();
                           a.a();
                           b.a();
                           if (a != null && !a.equals(Char.myCharz())) {
                              a.onCancelChat();
                           }
                           break;
                        }
                     } catch (Exception var65) {
                        var10000 = var65;
                        var10001 = false;
                        break label835;
                     }

                     try {
                        ((cb)cb.a.elementAt(var91)).a();
                     } catch (Exception var19) {
                        var10000 = var19;
                        var10001 = false;
                        break label835;
                     }

                     ++var91;
                  }

                  try {
                     ++this.aA;
                     if (this.aA > 3) {
                        this.aA = 0;
                     }
                  } catch (Exception var18) {
                     var10000 = var18;
                     var10001 = false;
                     break;
                  }

                  label1088: {
                     try {
                        if (this.q) {
                           ++this.P;
                           if (this.P == 20) {
                              this.P = 0;
                              this.q = false;
                           }
                           break label1088;
                        }
                     } catch (Exception var64) {
                        var10000 = var64;
                        var10001 = false;
                        break;
                     }

                     label1089: {
                        try {
                           if (this.O <= Char.myCharz().t) {
                              break label1089;
                           }

                           var92 = this.O - Char.myCharz().t >> 1;
                        } catch (Exception var63) {
                           var10000 = var63;
                           var10001 = false;
                           break;
                        }

                        var91 = var92;
                        if (var92 <= 0) {
                           var91 = 1;
                        }

                        try {
                           this.O -= var91;
                           break label1088;
                        } catch (Exception var17) {
                           var10000 = var17;
                           var10001 = false;
                           break;
                        }
                     }

                     try {
                        this.O = Char.myCharz().t;
                     } catch (Exception var16) {
                        var10000 = var16;
                        var10001 = false;
                        break;
                     }
                  }

                  label1090: {
                     try {
                        if (this.p) {
                           ++this.N;
                           if (this.N == 20) {
                              this.N = 0;
                              this.p = false;
                           }
                           break label1090;
                        }
                     } catch (Exception var62) {
                        var10000 = var62;
                        var10001 = false;
                        break;
                     }

                     label1091: {
                        try {
                           if (this.M <= Char.myCharz().s) {
                              break label1091;
                           }

                           var91 = this.M - Char.myCharz().s >> 1;
                        } catch (Exception var61) {
                           var10000 = var61;
                           var10001 = false;
                           break;
                        }

                        if (var91 <= 0) {
                           var91 = var5;
                        }

                        try {
                           this.M -= var91;
                           break label1090;
                        } catch (Exception var15) {
                           var10000 = var15;
                           var10001 = false;
                           break;
                        }
                     }

                     try {
                        this.M = Char.myCharz().s;
                     } catch (Exception var14) {
                        var10000 = var14;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     if (this.ae > 0) {
                        --this.ae;
                     }
                  } catch (Exception var13) {
                     var10000 = var13;
                     var10001 = false;
                     break;
                  }

                  label702: {
                     try {
                        if (!this.d()) {
                           break label702;
                        }
                     } catch (Exception var60) {
                        var10000 = var60;
                        var10001 = false;
                        break;
                     }

                     while(true) {
                        try {
                           if (this.D - 100 >= l) {
                              break;
                           }
                        } catch (Exception var59) {
                           var10000 = var59;
                           var10001 = false;
                           break label835;
                        }

                        try {
                           --l;
                        } catch (Exception var12) {
                           var10000 = var12;
                           var10001 = false;
                           break label835;
                        }
                     }
                  }

                  var91 = 0;

                  while(true) {
                     try {
                        if (var91 >= Char.all.size()) {
                           break;
                        }
                     } catch (Exception var58) {
                        var10000 = var58;
                        var10001 = false;
                        break label835;
                     }

                     try {
                        ((bx)Char.all.elementAt(var91)).a();
                     } catch (Exception var11) {
                        var10000 = var11;
                        var10001 = false;
                        break label835;
                     }

                     ++var91;
                  }

                  var91 = var4;

                  while(true) {
                     try {
                        if (var91 >= i.size()) {
                           if (!this.B) {
                              break label951;
                           }

                           this.aX -= 2;
                           if (this.aX >= -this.aY) {
                              break label951;
                           }

                           this.aX = main.a.i;
                           a.removeElementAt(0);
                           if (a.size() != 0) {
                              break;
                           }

                           this.s = false;
                           this.B = false;
                           break label951;
                        }
                     } catch (Exception var57) {
                        var10000 = var57;
                        var10001 = false;
                        break label835;
                     }

                     try {
                        ((bx)i.elementAt(var91)).a();
                     } catch (Exception var10) {
                        var10000 = var10;
                        var10001 = false;
                        break label835;
                     }

                     ++var91;
                  }

                  try {
                     this.aY = cg.c.a((String)a.elementAt(0));
                     break label951;
                  } catch (Exception var9) {
                     var10000 = var9;
                     var10001 = false;
                     break;
                  }
               }

               label1096: {
                  label831: {
                     try {
                        if (l[var91] == -1) {
                           break label1096;
                        }

                        if (l[var91] > r[var91]) {
                           var96 = u;
                           break label831;
                        }
                     } catch (Exception var75) {
                        var10000 = var75;
                        var10001 = false;
                        break;
                     }

                     try {
                        var96 = l;
                        var96[var91] += cq.f(t[var91]);
                        var96 = j;
                        var96[var91] += s[var91];
                        var96 = k;
                        var96[var91] += t[var91];
                        break label1096;
                     } catch (Exception var35) {
                        var10000 = var35;
                        var10001 = false;
                        break;
                     }
                  }

                  var10002 = var96[var91]++;

                  try {
                     if (u[var91] == 25) {
                        u[var91] = 0;
                        l[var91] = -1;
                        r[var91] = 0;
                        s[var91] = 0;
                        j[var91] = 0;
                     }
                  } catch (Exception var34) {
                     var10000 = var34;
                     var10001 = false;
                     break;
                  }
               }

               ++var91;
            }
         }

         Exception var99 = var10000;
         var99.printStackTrace();
      }

      if (main.a.g % 4000 == 1000) {
         pasta.x.a(pasta.x.a);
      }

   }

   public final void b(String var1) {
      this.d = var1;
      this.d = cg.k.a(this.d, 500);
   }

   public final void b(String var1, String var2) {
      this.A = new int[var1.length()];
      this.B = new int[var1.length()];
      this.C = new int[var1.length()];
      this.D = new int[var1.length()];
      this.E = new int[var1.length()];

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         this.A[var3] = Short.parseShort(String.valueOf(var1.charAt(var3)));
         this.B[var3] = cq.b(0, 11);
         this.C[var3] = 1;
         this.E[var3] = 0;
      }

      this.aW = 100;
      this.aV = 0;
      this.c = var2;
      f = dz.a();
   }

   public final void b(byte[] var1) {
      int var2 = 0;
      a = new al[5];
      if (var1 != null) {
         for(var2 = 0; var2 < var1.length; ++var2) {
            for(int var3 = 0; var3 < Char.myCharz().b.size(); ++var3) {
               al var4 = (al)Char.myCharz().b.elementAt(var3);
               if (var4.a.a == var1[var2]) {
                  a[var2] = var4;
                  break;
               }
            }
         }
      } else {
         while(true) {
            if (var2 >= a.length || var2 >= Char.myCharz().b.size()) {
               v();
               break;
            }

            al var5 = (al)Char.myCharz().b.elementAt(var2);
            a[var2] = var5;
            ++var2;
         }
      }

   }

   public final void c() {
      if (!pasta.j.b && !Char.myCharz().b && !pasta.a.b) {
         int var1;
         int var2;
         int var3;
         int var4;
         char[] var8;
         if (main.a.e && !bq.a().a && !main.a.a.a && !h()) {
            label1092: {
               pasta.ag.h = -1;
               if (main.a.f) {
                  label1053: {
                     if (main.a.a(0, 0, 60, 50) && main.a.i && main.a.j) {
                        if (Char.myCharz().a != null) {
                           Char.myCharz().a.a();
                        }

                        Char.myCharz().a = null;
                        main.a.j();
                        this.A = true;
                        this.ax = 5;
                        break label1092;
                     }

                     if (!TileMap.b() && main.a.a(aE, aF, 34, 34)) {
                        pasta.ag.h = 15;
                        main.a.o = false;
                        this.d = false;
                        bq.a().b = pasta.ab.aV;
                        if (main.a.i && main.a.j) {
                           bq.a().checkInfo("");
                           pasta.aw.a();
                           Char.myCharz().a = null;
                           main.a.j();
                           break label1092;
                        }
                     }

                     if (Char.myCharz().a != null && main.a.a(Char.myCharz().a.b - 17, Char.myCharz().a.c - 17, 34, 34)) {
                        pasta.ag.h = 20;
                        main.a.o = false;
                        this.d = false;
                        if (main.a.i && main.a.j) {
                           main.a.j();
                           Char.myCharz().a.a();
                           break label1092;
                        }
                     }

                     if (y != 0 && Char.myCharz().h != 14) {
                        if (main.a.a(aG, aH, 40, 40)) {
                           pasta.ag.h = 5;
                           if (main.a.j) {
                              main.a.a[5] = true;
                              main.a.j = false;
                              main.a.o = false;
                              main.a.i = false;
                           }
                        }

                        a.a();
                        if (main.a.a(aI, aJ, 34, 34)) {
                           pasta.ag.h = 13;
                           main.a.o = false;
                           this.d = false;
                           if (main.a.i && main.a.j) {
                              Char.myCharz().q();
                              main.a.j = false;
                              main.a.o = false;
                              main.a.i = false;
                           }
                        }
                     }

                     if (y == 0) {
                        if (!main.a.a(K, L, 40, 40)) {
                           break label1053;
                        }
                     } else if (!main.a.a(K, L, 34, 34)) {
                        break label1053;
                     }

                     if (Char.myCharz().h != 14 && this.a == null) {
                        pasta.ag.h = 10;
                        main.a.o = false;
                        this.d = false;
                        if (main.a.i && main.a.j) {
                           main.a.a[10] = true;
                           main.a.j = false;
                           main.a.o = false;
                           main.a.i = false;
                        }
                     }
                  }
               }

               if (this.a != null) {
                  if (!h()) {
                     for(var1 = 0; var1 < this.a.length(); ++var1) {
                        this.i[var1] = -1;
                        if (main.a.f) {
                           var3 = (main.a.i - this.a.length() * aB) / 2;
                           var4 = this.a.length();
                           var2 = aB;
                           if (main.a.a(var3, main.a.j - 40, var4 * var2, aB)) {
                              var2 = (main.a.a - var3) / aB;
                              if (var1 == var2) {
                                 this.i[var1] = 1;
                              }

                              if (main.a.i && main.a.j && var1 == var2) {
                                 var8 = this.b.toCharArray();
                                 MyVector var9 = new MyVector("");

                                 for(var2 = 0; var2 < var8.length; ++var2) {
                                    var9.addElement(String.valueOf(var8[var2]));
                                 }

                                 var9.removeElementAt(0);
                                 var9.insertElementAt(String.valueOf(this.a.charAt(var1)), var9.size());
                                 this.b = "";

                                 for(var2 = 0; var2 < var9.size(); ++var2) {
                                    this.b = this.b + ((String)var9.elementAt(var2)).toUpperCase();
                                 }

                                 pasta.av.a().a(this.a.charAt(var1));
                              }
                           }
                        }
                     }
                  }
               } else if (c) {
                  if (this.g()) {
                     break label1092;
                  }

                  this.ay = -1;
                  if (main.a.a(aK + p[0] - ag / 2 + 12, q[0] - ag / 2 + 12, b.length * ag, ag) || !main.a.f && main.a.a(aK + p[0] - ag / 2 + 12, q[0] - ag / 2 + 12, ag, b.length * ag)) {
                     main.a.o = false;
                     this.d = false;
                     var1 = (main.a.e - (aK + p[0] - ag / 2 + 12)) / ag;
                     this.ay = var1;
                     if (main.a.i && main.a.j) {
                        main.a.j = false;
                        main.a.o = false;
                        main.a.i = false;
                        this.aw = var1;
                        if (this.aw > b.length - 1) {
                           this.aw = b.length - 1;
                        }

                        al var12 = b[this.aw];
                        if (var12 != null) {
                           this.a(var12);
                        }
                     }
                  }
               }

               if (main.a.j) {
                  if (main.a.b[1] || main.a.b[2] || main.a.b[3] || main.a.b[4] || main.a.b[6]) {
                     main.a.j = false;
                  }

                  main.a.b[1] = false;
                  main.a.b[2] = false;
                  main.a.b[3] = false;
                  main.a.b[4] = false;
                  main.a.b[6] = false;
               }
            }
         }

         long var5 = System.currentTimeMillis();
         if (main.a.a[2] || main.a.a[4] || main.a.a[6] || main.a.a[1] || main.a.a[3]) {
            this.z = 0;
            l = false;
         }

         boolean var11;
         if (main.a.a[5]) {
            if (this.z == 0) {
               if (var5 - this.c < 800L) {
                  if (Char.myCharz().a != null && (Char.myCharz().a.a.b != 1 && Char.myCharz().s < Char.myCharz().a.e || Char.myCharz().a.a.b == 1 && Char.myCharz().s < Char.myCharz().x * Char.myCharz().a.e / 100)) {
                     var11 = false;
                  } else if (Char.myCharz().a != null && (Char.myCharz().a.a.a <= 0 || Char.myCharz().a.a != 0)) {
                     var11 = true;
                  } else {
                     var11 = false;
                  }

                  if (var11) {
                     label926: {
                        if (Char.myCharz().a == null) {
                           if (Char.myCharz().a == null) {
                              break label926;
                           }

                           Char.myCharz();
                           if (!Char.b(Char.myCharz().a)) {
                              break label926;
                           }
                        }

                        this.z = 10;
                        main.a.a[5] = false;
                     }
                  }
               }
            } else {
               this.z = 0;
               boolean[] var13 = main.a.a;
               main.a.a[6] = false;
               var13[4] = false;
            }

            this.c = var5;
         }

         label917: {
            if (main.a.g % 5 == 0 && this.z > 0 && Char.myCharz().a == null) {
               label1145: {
                  if (Char.myCharz().a != null && (Char.myCharz().a.a.b() || Char.myCharz().a.a)) {
                     break label917;
                  }

                  if (Char.myCharz().a == null || Char.myCharz().a.h == 1 || Char.myCharz().a.h == 0 || Char.myCharz().a != null) {
                     if (Char.myCharz().a == null) {
                        break label1145;
                     }

                     Char.myCharz();
                     if (!Char.b(Char.myCharz().a)) {
                        break label1145;
                     }
                  }

                  if (Char.myCharz().a.a) {
                     break label917;
                  }

                  this.b(true);
               }
            }

            if (this.z > 1) {
               --this.z;
            }
         }

         if (pasta.k.a != null) {
            cd var14 = pasta.k.a.a;
            if ((main.a.a[5] || pasta.ag.a(var14)) && var14 != null) {
               main.a.j = false;
               main.a.a[5] = false;
               pasta.ag.h = -1;
               if (var14 != null) {
                  var14.a();
               }
            }
         } else if (!bq.a().a) {
            if ((main.a.a[12] || pasta.ag.a(main.a.a.a)) && super.a != null) {
               main.a.j = false;
               main.a.i = false;
               main.a.a[12] = false;
               pasta.ag.h = -1;
               if (super.a != null) {
                  super.a.a();
               }
            }

            if ((main.a.a[13] || pasta.ag.a(main.a.a.c)) && super.c != null) {
               main.a.j = false;
               main.a.i = false;
               main.a.a[13] = false;
               pasta.ag.h = -1;
               if (super.c != null) {
                  super.c.a();
               }
            }

            if ((main.a.a[5] || pasta.ag.a(main.a.a.b)) && super.b != null) {
               main.a.j = false;
               main.a.a[5] = false;
               pasta.ag.h = -1;
               if (super.b != null) {
                  super.b.a();
               }
            }
         } else {
            if (bq.a().a != null && (main.a.a[12] || pasta.ag.a(bq.a().a)) && bq.a().a != null) {
               bq.a().a.a();
            }

            if (bq.a().b != null && (main.a.a[13] || pasta.ag.a(bq.a().b)) && bq.a().b != null) {
               bq.a().b.a();
            }

            bq.a();
         }

         if (Char.myCharz().a != null) {
            for(var1 = 0; var1 < main.a.a.length; ++var1) {
               if (main.a.a[var1]) {
                  Char.myCharz().a = null;
                  break;
               }
            }
         }

         if (bq.a().a && main.a.p != 0) {
            bq.a().a(main.a.p);
            main.a.p = 0;
         } else if (!main.a.a.a && !Char.v) {
            if (main.a.a[10]) {
               main.a.a[10] = false;
               this.o();
               main.a.onCancelChat();
            }

            if (main.a.a[11] && this.a == null) {
               if (this.a != null) {
                  this.a.a.a();
               } else if (b.a.a != null && b.a.a.a != null) {
                  main.a.a.m();
                  main.a.a.t();
               }

               main.a.a[11] = false;
               main.a.onCancelChat();
            }

            if (main.a.p != 0 && bf.b && main.a.p == 32) {
               this.o();
               main.a.p = 0;
               main.a.onCancelChat();
            }

            if (main.a.p != 0 && this.a == null && bf.b && main.a.p == 121) {
               if (this.a != null) {
                  this.a.a.a();
                  main.a.p = 0;
                  main.a.onCancelChat();
               } else if (b.a.a != null && b.a.a.a != null) {
                  main.a.a.m();
                  main.a.a.t();
                  main.a.p = 0;
                  main.a.onCancelChat();
               }
            }

            if (main.a.a[10] && this.a == null) {
               main.a.a[10] = false;
               b.c = 10;
               main.a.onCancelChat();
            }

            if (!a.a() && y != 1) {
               Char.myCharz().i = true;
               if (main.a.o) {
                  main.a.o = false;
                  this.d = true;
                  this.al = 0;
                  var1 = main.a.a;
                  this.aj = var1;
                  this.ah = var1;
                  var1 = main.a.b;
                  this.ak = var1;
                  this.ai = var1;
               }

               if (this.d) {
                  var2 = main.a.a - this.ah;
                  var1 = main.a.b - this.ai;
                  if (!this.v && (cq.f(main.a.a - this.aj) > 15 || cq.f(main.a.b - this.ak) > 15)) {
                     this.v = true;
                  }

                  this.ah = main.a.a;
                  this.ai = main.a.b;
                  ++this.al;
                  if (this.v) {
                     Char.myCharz().i = false;
                     k -= var2;
                     l -= var1;
                     if (k < 24) {
                        var3 = (24 - k) / 3;
                        if (var3 != 0) {
                           var4 = k;
                           k = var2 - var2 / var3 + var4;
                        }
                     }

                     if (k < 24) {
                        k = 24;
                     }

                     if (k > o) {
                        var3 = (k - o) / 3;
                        if (var3 != 0) {
                           var4 = k;
                           k = var2 - var2 / var3 + var4;
                        }
                     }

                     if (k > o) {
                        k = o;
                     }

                     if (l < 0) {
                        var3 = (0 - l) / 3;
                        if (var3 != 0) {
                           var2 = l;
                           l = var1 - var1 / var3 + var2;
                        }
                     }

                     if (l < 0) {
                        l = 0;
                     }

                     if (l > ad) {
                        l = ad;
                     }

                     m = k;
                     n = l;
                  }
               }

               if (this.d && main.a.j) {
                  this.d = false;
                  this.v = false;
                  if (cq.f(main.a.a - this.aj) > 15 || cq.f(main.a.b - this.ak) > 15) {
                     main.a.j = false;
                  }
               }
            }

            Char var16;
            if (!Char.myCharz().B && !this.g()) {
               if (this.a != null && this.a.a != null && this.a.a.a()) {
                  this.a.a.a();
               } else {
                  label811: {
                     if (this.a != null) {
                        var2 = (main.a.i - aB * 5) / 2;
                        var1 = aB;
                        if (main.a.a(var2, main.a.j - 40, var1 * 5, aB)) {
                           var11 = true;
                           break label811;
                        }
                     }

                     var11 = false;
                  }

                  if (!var11) {
                     var5 = System.currentTimeMillis();
                     if (this.b != 0L && var5 - this.b > 300L) {
                        this.b = 0L;
                        main.a.o = false;
                        if (!this.w) {
                           var2 = main.a.a + this.ao;
                           var1 = main.a.b + this.ap;
                           if (!b(var2, var1) && !this.a(var2, var1)) {
                              this.e(var2, var1);
                           }

                           main.a.j = false;
                        }
                     }

                     if (main.a.j) {
                        boolean var7;
                        label1134: {
                           var1 = main.a.a + k;
                           var2 = main.a.b + l;
                           Char.myCharz();
                           as var15 = a(var1, var2);
                           if (var15 != null) {
                              label1147: {
                                 if (Char.myCharz().g() && Char.myCharz().a != null && !var15.equals(Char.myCharz().a) && !var15.equals(Char.myCharz().a.b) && var15 instanceof Char) {
                                    var16 = (Char)var15;
                                    if (var16.d != 5 && !var16.g()) {
                                       this.e(var1, var2);
                                       break label1147;
                                    }
                                 }

                                 if (Char.myCharz().a == var15 || Char.myCharz().a == var15) {
                                    this.a(var15);
                                    var7 = true;
                                    break label1134;
                                 }

                                 if (TileMap.mapId == 51 && var15.equals(Char.myCharz().a)) {
                                    this.e(var1, var2);
                                 } else {
                                    if (Char.myCharz().a != null || Char.myCharz().a != null || Char.myCharz().a != null || Char.myCharz().a() != null) {
                                       var7 = false;
                                       break label1134;
                                    }

                                    Char.myCharz().a((Object)var15);
                                    var15.i();
                                 }
                              }
                           }

                           var7 = false;
                        }

                        this.w = var7;
                        if (var5 - this.b < 300L) {
                           label1161: {
                              this.b = 0L;
                              var1 = main.a.a + this.ao;
                              var2 = main.a.b + this.ap;
                              Char.myCharz();
                              as var17 = a(var1, var2);
                              if (var17 != null) {
                                 if (!(var17 instanceof i) || a((i)var17)) {
                                    label1141: {
                                       if (this.a(var17) || !var17.equals(Char.myCharz().a) && this.a != null) {
                                          break label1161;
                                       }

                                       if (Char.myCharz().g() && Char.myCharz().a != null && !var17.equals(Char.myCharz().a) && !var17.equals(Char.myCharz().a.b) && var17 instanceof Char) {
                                          Char var18 = (Char)var17;
                                          if (var18.d != 5 && !var18.g()) {
                                             break label1141;
                                          }
                                       }

                                       if (TileMap.mapId != 51 || !var17.equals(Char.myCharz().a)) {
                                          this.a(var17);
                                          break label1161;
                                       }
                                    }
                                 }
                              } else if (b(var1, var2) || this.a(var1, var2)) {
                                 break label1161;
                              }

                              this.e(var1, var2);
                           }
                        } else {
                           this.b = var5;
                           this.ao = k;
                           this.ap = l;
                        }

                        main.a.j = false;
                     }
                  }
               }
            }

            if (Char.myCharz().a != null && Char.myCharz().a.a()) {
               Char.myCharz().a.a();
            }

            if (Char.myCharz().a == null) {
               if (Char.myCharz().h == 1) {
                  if (main.a.a[5]) {
                     main.a.a[5] = false;
                     this.b(false);
                  } else if (main.a.b[2]) {
                     if (!Char.myCharz().x) {
                        if (Char.myCharz().b - Char.myCharz().R != 0 || Char.myCharz().c - Char.myCharz().S != 0) {
                           pasta.av.a().g();
                        }

                        Char.myCharz().e = -10;
                        Char.myCharz().d = 0;
                        Char.myCharz().h = 3;
                        Char.myCharz().f = 0;
                     }
                  } else if (main.a.b[4]) {
                     l = false;
                     Char.myCharz().k = false;
                     if (Char.myCharz().i == 1) {
                        Char.myCharz().i = -1;
                     } else if (!Char.myCharz().x) {
                        if (Char.myCharz().b - Char.myCharz().R != 0) {
                           pasta.av.a().g();
                        }

                        Char.myCharz().h = 2;
                        Char.myCharz().d = -Char.myCharz().n;
                     }

                     Char.myCharz().I = false;
                  } else if (main.a.b[6]) {
                     l = false;
                     Char.myCharz().k = false;
                     if (Char.myCharz().i == -1) {
                        Char.myCharz().i = 1;
                     } else if (!Char.myCharz().x) {
                        if (Char.myCharz().b - Char.myCharz().R != 0) {
                           pasta.av.a().g();
                        }

                        Char.myCharz().h = 2;
                        Char.myCharz().d = Char.myCharz().n;
                     }

                     Char.myCharz().I = false;
                  }
               } else if (Char.myCharz().h == 2) {
                  if (main.a.a[5]) {
                     main.a.a[5] = false;
                     this.b(true);
                  } else if (!main.a.b[2]) {
                     if (main.a.b[4]) {
                        l = false;
                        if (Char.myCharz().i == 1) {
                           Char.myCharz().i = -1;
                        } else {
                           var16 = Char.myCharz();
                           var1 = -Char.myCharz().n;
                           Char.myCharz();
                           var16.d = var1;
                        }
                     } else if (main.a.b[6]) {
                        l = false;
                        if (Char.myCharz().i == -1) {
                           Char.myCharz().i = 1;
                        } else {
                           var16 = Char.myCharz();
                           var1 = Char.myCharz().n;
                           Char.myCharz();
                           var16.d = var1;
                        }
                     }
                  } else {
                     if (Char.myCharz().b - Char.myCharz().R != 0 || Char.myCharz().c - Char.myCharz().S != 0) {
                        pasta.av.a().g();
                     }

                     Char.myCharz().e = -10;
                     Char.myCharz().h = 3;
                     Char.myCharz().f = 0;
                  }
               } else if (Char.myCharz().h == 3) {
                  l = false;
                  if (main.a.a[5]) {
                     main.a.a[5] = false;
                     this.b(true);
                  }

                  if (!main.a.b[4] && (!main.a.b[1] || this.a != null)) {
                     if (main.a.b[6] || main.a.b[3] && this.a == null) {
                        if (Char.myCharz().i == -1) {
                           Char.myCharz().i = 1;
                        } else {
                           Char.myCharz().d = Char.myCharz().n;
                        }
                     }
                  } else if (Char.myCharz().i == 1) {
                     Char.myCharz().i = -1;
                  } else {
                     Char.myCharz().d = -Char.myCharz().n;
                  }

                  if ((main.a.b[2] || (main.a.b[1] || main.a.b[3]) && this.a == null) && Char.myCharz().h && Char.myCharz().s > 0 && Char.myCharz().f < 8 && Char.myCharz().e > -4) {
                     var16 = Char.myCharz();
                     ++var16.f;
                     Char.myCharz().e = -7;
                  }
               } else if (Char.myCharz().h == 4) {
                  if (main.a.a[5]) {
                     main.a.a[5] = false;
                     this.b(true);
                  }

                  if (main.a.b[2] && Char.myCharz().s > 0 && Char.myCharz().h) {
                     l = false;
                     if ((Char.myCharz().b - Char.myCharz().R != 0 || Char.myCharz().c - Char.myCharz().S != 0) && (cq.f(Char.myCharz().b - Char.myCharz().R) > 96 || cq.f(Char.myCharz().c - Char.myCharz().S) > 24)) {
                        pasta.av.a().g();
                     }

                     Char.myCharz().e = -10;
                     Char.myCharz().h = 3;
                     Char.myCharz().f = 0;
                  }

                  if (main.a.b[4]) {
                     l = false;
                     if (Char.myCharz().i == 1) {
                        Char.myCharz().i = -1;
                     } else {
                        var16 = Char.myCharz();
                        ++var16.f;
                        Char.myCharz().d = -Char.myCharz().n;
                        if (Char.myCharz().f > 5 && Char.myCharz().e > 6) {
                           Char.myCharz().h = 10;
                           Char.myCharz().f = 0;
                           Char.myCharz().e = 0;
                        }
                     }
                  } else if (main.a.b[6]) {
                     l = false;
                     if (Char.myCharz().i == -1) {
                        Char.myCharz().i = 1;
                     } else {
                        var16 = Char.myCharz();
                        ++var16.f;
                        Char.myCharz().d = Char.myCharz().n;
                        if (Char.myCharz().f > 5 && Char.myCharz().e > 6) {
                           Char.myCharz().h = 10;
                           Char.myCharz().f = 0;
                           Char.myCharz().e = 0;
                        }
                     }
                  }
               } else if (Char.myCharz().h == 10) {
                  if (main.a.a[5]) {
                     main.a.a[5] = false;
                     this.b(true);
                  }

                  if (Char.myCharz().h && Char.myCharz().s > 0) {
                     if (!main.a.b[2]) {
                        if (main.a.b[4]) {
                           l = false;
                           if (Char.myCharz().i == 1) {
                              Char.myCharz().i = -1;
                           } else {
                              Char.myCharz().d = -(Char.myCharz().n + 1);
                           }
                        } else if (main.a.b[6]) {
                           if (Char.myCharz().i == -1) {
                              Char.myCharz().i = 1;
                           } else {
                              Char.myCharz().d = Char.myCharz().n + 1;
                           }
                        }
                     } else {
                        l = false;
                        if ((Char.myCharz().b - Char.myCharz().R != 0 || Char.myCharz().c - Char.myCharz().S != 0) && (cq.f(Char.myCharz().b - Char.myCharz().R) > 96 || cq.f(Char.myCharz().c - Char.myCharz().S) > 24)) {
                           pasta.av.a().g();
                        }

                        Char.myCharz().e = -10;
                        Char.myCharz().h = 3;
                        Char.myCharz().f = 0;
                     }
                  }
               } else if (Char.myCharz().h == 7) {
                  if (main.a.a[5]) {
                     main.a.a[5] = false;
                  }

                  if (main.a.b[4]) {
                     l = false;
                     if (Char.myCharz().i == 1) {
                        Char.myCharz().i = -1;
                     } else {
                        Char.myCharz().d = -Char.myCharz().n + 2;
                     }
                  } else if (main.a.b[6]) {
                     l = false;
                     if (Char.myCharz().i == -1) {
                        Char.myCharz().i = 1;
                     } else {
                        Char.myCharz().d = Char.myCharz().n - 2;
                     }
                  }
               }

               if (main.a.a[8] && main.a.p != 56) {
                  main.a.a[8] = false;
                  Char.myCharz().T = 0;
               }

               if (main.a.a[10]) {
                  main.a.a[10] = false;
                  this.o();
               }

               if (main.a.p != 0) {
                  if (this.a == null) {
                     if (bf.b) {
                        if (main.a.p == 113) {
                           if (a[0] != null) {
                              this.a(a[0]);
                           }
                        } else if (main.a.p == 119) {
                           if (a[1] != null) {
                              this.a(a[1]);
                           }
                        } else if (main.a.p == 101) {
                           if (a[2] != null) {
                              this.a(a[2]);
                           }
                        } else if (main.a.p == 114) {
                           if (a[3] != null) {
                              this.a(a[3]);
                           }
                        } else if (main.a.p == 116) {
                           if (a[4] != null) {
                              this.a(a[4]);
                           }
                        } else if (main.a.p != 50 && main.a.p != 53) {
                           bq.a().a(main.a.p, this, "");
                        }
                     } else if (!main.a.c) {
                        bq.a().a(main.a.p, this, "");
                     } else if (main.a.p == 55) {
                        if (a[0] != null) {
                           this.a(a[0]);
                        }
                     } else if (main.a.p == 56) {
                        if (a[1] != null) {
                           this.a(a[1]);
                        }
                     } else if (main.a.p == 57) {
                        if (a[2] != null) {
                           this.a(a[2]);
                        }
                     } else if (main.a.p == 49) {
                        if (a[3] != null) {
                           this.a(a[3]);
                        }
                     } else if (main.a.p == 51) {
                        if (a[4] != null) {
                           this.a(a[4]);
                        }
                     } else if (main.a.p == 48) {
                        bq.a().checkInfo("");
                     }
                  } else {
                     var8 = this.b.toCharArray();
                     MyVector var10 = new MyVector("");

                     for(var1 = 0; var1 < var8.length; ++var1) {
                        var10.addElement(String.valueOf(var8[var1]));
                     }

                     String var20;
                     label634: {
                        var10.removeElementAt(0);
                        String var19 = String.valueOf((char)main.a.p);
                        if (!var19.equals("") && var19 != null) {
                           var20 = var19;
                           if (!var19.equals("\n")) {
                              break label634;
                           }
                        }

                        var20 = "-";
                     }

                     var10.insertElementAt(var20, var10.size());
                     this.b = "";

                     for(var1 = 0; var1 < var10.size(); ++var1) {
                        this.b = this.b + ((String)var10.elementAt(var1)).toUpperCase();
                     }

                     pasta.av.a().a((char)main.a.p);
                  }

                  main.a.p = 0;
               }

               main.a.onCancelChat();
            }
         }
      }

   }

   public final void c(int var1, int var2) {
      (new StringBuffer("VE RONG THAN O VI TRI x= ")).append(var1).append(" y=").append(var2);
      this.q();
      byte var3;
      if (this.j) {
         var3 = 25;
      } else {
         var3 = 17;
      }

      dh.a(new cx(var3, var1, var2 - 77, 2, -1, 1));
   }

   public final void checkInfo(String var1) {
      if (!this.B) {
         this.aY = cg.e.a(var1);
         this.aX = main.a.i;
         this.B = true;
      }

      String var2 = var1;
      if (var1.startsWith("!")) {
         var2 = var1.substring(1, var1.length());
         this.s = true;
      }

      a.addElement(var2);
   }

   public final boolean d() {
      boolean var1;
      if (this.z) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final boolean e() {
      boolean var1;
      if (TileMap.mapId != 130 && TileMap.mapId != 51 && TileMap.mapId != 112 && TileMap.mapId != 113 && TileMap.mapId != 129 || Char.myCharz().d == 0 && (TileMap.mapId != 130 || myCharz() == null || b() == null)) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public final void goToMap(int var1) {
      Char var2 = a(var1);
      if (var2 != null) {
         this.a(var2.a + pasta.ab.dK, new cd(pasta.ab.aS, 11114, var2), new cd(pasta.ab.aT, 2009, var2));
      }

   }

   public final void l() {
      if (a == null) {
         a = new Image[3];

         for(int var1 = 0; var1 < 3; ++var1) {
            a[var1] = dz.b("/e/sp" + var1 + ".png");
         }
      }

      v = new int[2];
      w = new int[2];
      x = new int[2];
      y = new int[2];
      z = new int[2];
      int[] var2 = x;
      x[1] = -1;
      var2[0] = -1;
      this.aQ = 84;
      aN = 66;
      aP = 59;
      aO = 61;
   }

   public final void n() {
      main.a.a.a = false;
      bq var1 = bq.a();
      var1.a.checkInfo("");
      var1.a = false;
      bq.a().c = null;
      if (Char.myCharz().t > 0 && Char.myCharz().h != 14 && Char.myCharz().h != 5) {
         c = true;
      } else {
         if (Char.myCharz().H) {
            this.f = new cd(pasta.ab.h[0], 11038);
            super.b = this.f;
            Char.myCharz().t = 0;
         }

         c = false;
      }

      cs var2 = b;
      var2.a = 0;
      var2.b = 0;
      var2.c = 0;
      var2.d = 0;
      var2.e = 0;
      var2.f = 0;
      var2.g = 0;
      var2.h = 0;
      var2.k = 0;
      var2.l = 0;
      var2.i = 0;
      var2.j = 0;
   }

   public final void o() {
      if (!Char.myCharz().P && !Char.myCharz().M && Char.myCharz().aj <= 0) {
         long var1 = System.currentTimeMillis();
         if (var1 - this.d >= 10000L) {
            if (!Char.myCharz().h()) {
               a.a(pasta.ab.aC, 0);
            } else {
               pasta.y.a(11, Char.myCharz(), 5);
               pasta.y.a(104, Char.myCharz(), 4);
               this.d = var1;
               pasta.aw.a();
            }
         }
      }

   }

   public final void onCancelChat() {
      pasta.f.a();
   }

   public final void onChatFromMe(String var1, String var2) {
      boolean var4 = false;
      Ativar.gI().Onchat(var1);
      bq.a().a = false;
      if (!pasta.f.a(var1)) {
         if (var2.equals(pasta.ab.ch)) {
            if (b.d != Char.myCharz().charID) {
               pasta.av.a().a(var1, b.d);
            }
         } else if (!var1.equals("")) {
            boolean var3;
            if (var1.equals("pingABCD")) {
               pasta.av.a().d();
               pasta.av.a().e();
               if (r) {
                  var3 = false;
               } else {
                  var3 = true;
               }

               r = var3;
            }

            if (var1.equals("icon")) {
               if (cq.a) {
                  var3 = false;
               } else {
                  var3 = true;
               }

               cq.a = var3;
            }

            if (var1.equals("big")) {
               if (cq.b) {
                  var3 = var4;
               } else {
                  var3 = true;
               }

               cq.b = var3;
            }

            av var27 = pasta.av.a();

            Message var29;
            label336: {
               Message var26;
               Exception var28;
               label332: {
                  label316: {
                     try {
                        StringBuffer var5 = new StringBuffer("Send chat ");
                        var5.append(var1);
                        var29 = new Message((byte)44);
                        break label316;
                     } catch (Exception var24) {
                        var28 = var24;
                     } finally {
                        ;
                     }

                     var26 = null;
                     break label332;
                  }

                  try {
                     var29.a().writeUTF(var1);
                     var27.a.a(var29);
                     break label336;
                  } catch (Exception var22) {
                     var28 = var22;
                  } finally {
                     ;
                  }

                  var26 = var29;
               }

               try {
                  var28.printStackTrace();
               } finally {
                  var26.a();
                  throw var28;
               }

               return;
            }

            var29.a();
         }
      }

   }

   public final void q() {
      this.i = true;
      this.B = dm.a(main.a.e[main.a.e.length - 1]);
   }

   public final void s() {
      long var1 = System.currentTimeMillis();
      this.h = var1;
      this.g = var1;
      this.aM = 180;
   }

   public final void teleTo(int var1, int var2) {
      if (!this.y) {
         pasta.aw.a();
         this.y = true;
         this.aq = 0;
         this.at = 0;
         this.ar = var1 - k;
         this.as = var2 - l;
      }

   }
}
