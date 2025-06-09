package pasta;

public class a {
   public static int a;
   private static String a;
   public static boolean a;
   private static String b;
   public static boolean b;
   private static int e;
   public int b;
   public int c;
   public int d;

   public a(int var1, int var2, int var3) {
      this.c = var1;
      this.d = var2;
      this.b = var3;
   }

   public static int a() {
      return GameSrc.a().a.ap;
   }

   public static int a(int var0) {
      int var1;
      try {
         var1 = Integer.parseInt(main.a.a.b[var0]);
      } catch (NumberFormatException var3) {
         var0 -= 8;
         return var0;
      }

      var0 = var1;
      return var0;
   }

   public static int a(String var0) {
      int var1;
      if (var0.equals("cspeed")) {
         if (aa.a(var0) == -1) {
            var1 = 6;
         } else {
            var1 = aa.a(var0);
         }
      } else if (aa.a(var0) == -1) {
         var1 = 100;
      } else {
         var1 = aa.a(var0);
      }

      return var1;
   }

   public static int a(Char var0) {
      return (int)Math.sqrt((double)((Char.myCharz().b - var0.b) * (Char.myCharz().b - var0.b) + (Char.myCharz().c - var0.c) * (Char.myCharz().c - var0.c)));
   }

   public static int a(ItemMap var0) {
      return (int)Math.sqrt((double)((Char.myCharz().b - var0.a) * (Char.myCharz().b - var0.a) + (Char.myCharz().c - var0.b) * (Char.myCharz().c - var0.b)));
   }

   public static int a(i var0) {
      return (int)Math.sqrt((double)((Char.myCharz().b - var0.l) * (Char.myCharz().b - var0.l) + (Char.myCharz().c - var0.m) * (Char.myCharz().c - var0.m)));
   }

   public static String a(String var0) {
      String var2 = "";

      for(int var1 = 0; var1 < var0.length(); ++var1) {
         var2 = var2 + (char)(var0.charAt(var1) - 556 - var1 % 9);
      }

      return new String(var2);
   }

   public static String a(Item var0) {
      return var0.a[0].a();
   }

   public static short a() {
      return Char.myCharz().a.a;
   }

   public static void a() {
      ek.g();
      if (au.e) {
         main.a.a.a();
      } else {
         main.a.a.h();
      }

   }

   public static void a(int var0, int var1) {
      Char.myCharz().a = new ck(var0, var1);
   }

   public static void a(String var0, String var1, int var2) {
      if (var0 != null) {
         a = true;
         a = var0;
         b = var1;
         e = var2;
      }

   }

   public static void a(al var0) {
      var0.a = true;
      var0.b = System.currentTimeMillis();
   }

   public static void a(dm var0) {
      if (a && (!b || e <= 4990)) {
         bw.a(main.a.k - 75, 10, 150, 55, var0);
         if (b && !gameFunc.c) {
            main.a.a(main.a.k - cg.t.a(a) / 2 - 10, 38, var0);
            cg.t.a(var0, a, main.a.k + 5, 31, 2);
         } else if (b != null) {
            cg.t.a(var0, a, main.a.k, 23, 2);
            cg.m.a(var0, b, main.a.k, 40, 2);
         } else {
            cg.t.a(var0, a, main.a.k, 31, 2);
         }
      }

   }

   public static void a(i var0) {
      var0.e = var0.l;
      var0.f = var0.m;
   }

   public static boolean a() {
      boolean var0;
      if (Char.myCharz().h != 14 && Char.myCharz().t > 0) {
         var0 = false;
      } else {
         var0 = true;
      }

      return var0;
   }

   public static boolean a(String var0) {
      boolean var1 = true;
      if (aa.a(var0) != 1) {
         var1 = false;
      }

      return var1;
   }

   public static void b() {
      if (!gameFunc.updatePet) {
         if (main.a.i > Panel.n * 2) {
            Panel var0 = new Panel();
            main.a.b = var0;
            var0.a[7] = new String[][]{{""}};
            main.a.b.g();
            main.a.b.t();
         }

         main.a.a.q();
         main.a.a.t();
      }

   }

   public static boolean b() {
      boolean var1 = true;
      if (!Char.myCharz().b && !b && !Char.u && !Char.w && !j.b && !c()) {
         boolean var0;
         if (main.a.a == z.a()) {
            var0 = true;
         } else {
            var0 = false;
         }

         if (!var0) {
            return var1;
         }
      }

      var1 = false;
      return var1;
   }

   public static void c() {
      g();
   }

   public static boolean c() {
      boolean var0;
      if (main.a.a != main.a.a && main.a.a != main.a.a) {
         var0 = false;
      } else {
         var0 = true;
      }

      return var0;
   }

   public static void d() {
      if (gameFunc.fakeSkill) {
         int var0;
         short var1;
         int var2;
         for(var0 = 0; var0 <= 2; ++var0) {
            for(var1 = (short)(var0 * 14); var1 <= (short)(var0 * 14 + 6); ++var1) {
               GameSrc.a[var1].a = new dt[GameSrc.a[(9 - (var0 << 1)) * 7 + var1].a.length];

               for(var2 = 0; var2 < GameSrc.a[var1].a.length; ++var2) {
                  GameSrc.a[var1].a[var2] = new dt();
                  GameSrc.a[var1].a[var2].a = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].a[var2].a;
                  GameSrc.a[var1].a[var2].b = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].a[var2].b;
                  GameSrc.a[var1].a[var2].c = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].a[var2].c;
                  GameSrc.a[var1].a[var2].d = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].a[var2].d;
                  GameSrc.a[var1].a[var2].e = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].a[var2].e;
                  GameSrc.a[var1].a[var2].f = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].a[var2].f;
                  GameSrc.a[var1].a[var2].g = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].a[var2].g;
                  GameSrc.a[var1].a[var2].h = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].a[var2].h;
                  GameSrc.a[var1].a[var2].i = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].a[var2].i;
                  GameSrc.a[var1].a[var2].j = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].a[var2].j;
                  GameSrc.a[var1].a[var2].k = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].a[var2].k;
                  GameSrc.a[var1].a[var2].l = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].a[var2].l;
                  GameSrc.a[var1].a[var2].m = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].a[var2].m;
               }
            }
         }

         for(var0 = 0; var0 <= 2; ++var0) {
            for(var1 = (short)(var0 * 14); var1 <= (short)(var0 * 14 + 6); ++var1) {
               GameSrc.a[var1].b = new dt[GameSrc.a[(9 - (var0 << 1)) * 7 + var1].b.length];

               for(var2 = 0; var2 < GameSrc.a[var1].b.length; ++var2) {
                  GameSrc.a[var1].b[var2] = new dt();
                  GameSrc.a[var1].b[var2].a = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].b[var2].a;
                  GameSrc.a[var1].b[var2].b = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].b[var2].b;
                  GameSrc.a[var1].b[var2].c = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].b[var2].c;
                  GameSrc.a[var1].b[var2].d = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].b[var2].d;
                  GameSrc.a[var1].b[var2].e = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].b[var2].e;
                  GameSrc.a[var1].b[var2].f = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].b[var2].f;
                  GameSrc.a[var1].b[var2].g = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].b[var2].g;
                  GameSrc.a[var1].b[var2].h = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].b[var2].h;
                  GameSrc.a[var1].b[var2].i = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].b[var2].i;
                  GameSrc.a[var1].b[var2].j = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].b[var2].j;
                  GameSrc.a[var1].b[var2].k = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].b[var2].k;
                  GameSrc.a[var1].b[var2].l = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].b[var2].l;
                  GameSrc.a[var1].b[var2].m = GameSrc.a[(9 - (var0 << 1)) * 7 + var1].b[var2].m;
               }
            }
         }
      }

   }

   public static void e() {
      a(ab.ar, (String)null, 1000);
      b = true;
   }

   public static void f() {
      if (e > 0) {
         int var0 = e - 1;
         e = var0;
         if (var0 == 0) {
            g();
         }
      }

   }

   public static void g() {
      a = "";
      b = null;
      b = false;
      e = 0;
      a = false;
   }

   public static void onChat(String var0) {
      GameSrc.a.a(var0, 0);
   }
}
