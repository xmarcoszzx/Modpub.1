package pasta;

public final class gameFunc implements ah {
   private static boolean D;
   private static boolean E;
   private static boolean F;
   private static boolean G;
   private static boolean H;
   private static String a;
   private static MyVector a;
   public static eh a;
   public static boolean a;
   private static byte[] a;
   public static int[] a;
   private static ItemMap[] a;
   private static boolean autoBuff;
   private static boolean autoGive;
   private static boolean autoGoback;
   private static boolean autoInsist;
   private static boolean autoPick;
   private static boolean autoReap;
   public static boolean autoVenderItens;
   private static long b;
   private static MyVector b;
   public static boolean b;
   public static int[] b;
   private static long c;
   public static boolean c;
   public static int[] c;
   public static int charAttack;
   public static int cspeed;
   private static long d;
   public static boolean d;
   public static int[] d;
   public static int distanceAttack;
   private static int e;
   private static long e;
   public static boolean e;
   public static int[] e;
   private static int f;
   private static long f;
   public static int[] f;
   public static boolean fakeSkill;
   private static int g;
   private static long g;
   public static boolean g;
   public static int[] g;
   private static int h;
   private static long h;
   public static boolean h;
   private static int[] h;
   public static int i;
   private static long i;
   public static boolean i;
   private static int[] i;
   public static long instance;
   private static gameFunc instance;
   public static boolean j;
   private static int[] j;
   private static boolean kaioken;
   private static byte mobList;
   private static boolean o;
   private static boolean p;
   private static boolean q;
   public static boolean removeSmall;
   private static long removeTile;
   public static boolean showPetInfo;
   private static boolean t;
   private static boolean u;
   public static boolean updatePet;
   private static boolean usePeaToBuff;
   private static boolean useTDLTReap;
   private static boolean x;

   static {
      int var1;
      if (aa.a("gameDelay") == -1) {
         var1 = 27;
      } else {
         var1 = aa.a("gameDelay");
      }

      instance = (long)var1;
      a = new ItemMap[10];
      h = new int[10];
      byte var0;
      if (aa.a("levelMob") == -1) {
         var0 = 0;
      } else {
         var0 = (byte)aa.a("levelMob");
      }

      mobList = var0;
      a = new MyVector("mobList");
      autoPick = pasta.a.a("autoPick");
      autoGoback = pasta.a.a("autoGoback");
      i = -1;
      g = -1;
      j = pasta.a.a("removeTile");
      removeSmall = pasta.a.a("removeSmall");
      fakeSkill = pasta.a.a("fakeSkill");
      updatePet = pasta.a.a("updatePet");
      autoBuff = pasta.a.a("autoBuff");
      usePeaToBuff = pasta.a.a("usePeaToBuff");
      kaioken = pasta.a.a("kaioken");
      a = new byte[]{-1, -1, -1, -1, -1};
      showPetInfo = pasta.a.a("showPetInfo");
      cspeed = pasta.a.a("cspeed");
      autoInsist = pasta.a.a("autoInsist");
      autoGive = pasta.a.a("autoGive");
      autoReap = pasta.a.a("autoReap");
      useTDLTReap = pasta.a.a("useTDLTReap");
      j = new int[3];
      distanceAttack = pasta.a.a("distanceAttack");
      b = new MyVector("charAttack");
   }

   private static MyVector a() {
      MyVector var1 = new MyVector("list");

      for(int var0 = 0; var0 < a.length; ++var0) {
         if (a[var0] != -1) {
            var1.addElement(new Byte(a[var0]));
         }
      }

      return var1;
   }

   public static void a(int var0) {
      if (b) {
         int var1 = pasta.a.a(var0);
         if (var1 >= 0) {
            pasta.a.c();
            goToMap(var1);
         } else {
            if (var1 == -7) {
               var0 = b.length;
            } else if (var1 == -6) {
               var0 = a.length;
            } else if (var1 == -5) {
               var0 = c.length;
            } else if (var1 == -4) {
               var0 = d.length;
            } else if (var1 == -3) {
               var0 = e.length;
            } else if (var1 == -2) {
               var0 = f.length;
            } else {
               var0 = g.length;
            }

            int[] var2;
            if (var1 == -7) {
               var2 = b;
            } else if (var1 == -6) {
               var2 = a;
            } else if (var1 == -5) {
               var2 = c;
            } else if (var1 == -4) {
               var2 = d;
            } else if (var1 == -3) {
               var2 = e;
            } else if (var1 == -2) {
               var2 = f;
            } else {
               var2 = g;
            }

            main.a.a.a = new String[var0];
            main.a.a.b = new String[var0];

            for(var1 = 0; var1 < var0; ++var1) {
               main.a.a.a[var1] = TileMap.a[var2[var1]];
               main.a.a.b[var1] = String.valueOf(var2[var1]);
            }

            main.a.a.b();
            main.a.a.t();
         }
      } else {
         av.a().q(var0);
      }

   }

   private static boolean a() {
      boolean var1 = true;
      if (!GameSrc.m) {
         for(int var0 = 0; var0 < Char.myCharz().arrItemBag.length; ++var0) {
            Item var2 = Char.myCharz().arrItemBag[var0];
            if (var2 != null && var2.itemTemplate.templateId == 521) {
               String var4 = pasta.a.a(var2).substring(18, pasta.a.a(var2).length());

               try {
                  var0 = Integer.parseInt(var4.substring(0, var4.length() - 5));
               } catch (NumberFormatException var3) {
                  var1 = false;
                  return var1;
               }

               if (var0 > 0) {
                  return var1;
               }
               break;
            }
         }

         var1 = false;
      }

      return var1;
   }

   private static void autoPickItem() {
      if (!GameSrc.m || !GameSrc.l) {
         int var0;
         ItemMap var2;
         for(var0 = 0; !o && var0 < GameSrc.e.size(); ++var0) {
            var2 = (ItemMap)GameSrc.e.elementAt(var0);
            if (var2 != null && (var2.playerId == -1 || var2.playerId == Char.myCharz().charID)) {
               boolean var1;
               if (var2.a.templateId == 225 || var2.a.templateId == 353 || var2.a.templateId == 354 || var2.a.templateId == 355 || var2.a.templateId == 356 || var2.a.templateId == 357 || var2.a.templateId == 358 || var2.a.templateId == 359 || var2.a.templateId == 360 || var2.a.templateId == 362 || autoVenderItens && (var2.a.templateId == 76 || var2.a.templateId == 188 || var2.a.templateId == 189 || var2.a.templateId == 190)) {
                  var1 = true;
               } else {
                  var1 = false;
               }

               if (!var1) {
                  a[e] = var2;
                  ++e;
               }
            }

            if (var0 + 1 >= GameSrc.e.size() && e != 0 || e == 10) {
               j[0] = TileMap.mapId;
               j[1] = Char.myCharz().b;
               j[2] = Char.myCharz().ad;
               o = true;
            }
         }

         if (o && e > 0) {
            if (!GameSrc.e.contains(a[e - 1])) {
               h[e - 1] = 0;
               --e;
            } else {
               if (h[e - 1] > 50) {
                  var2 = a[e - 1];
                  GameSrc.e.removeElement(var2);
                  return;
               }

               if (Char.myCharz().h == 1) {
                  if (Char.myCharz().a.a.a == 7) {
                     h();
                  }

                  if (pasta.a.a(a[e - 1]) > 48) {
                     teleTo(a[e - 1].a, a[e - 1].b, 0);
                  }

                  Char.myCharz().a((int)3);
                  var2 = a[e - 1];
                  Char.myCharz().a = var2;
                  var2 = Char.myCharz().a;
                  GameSrc.a().a((as)var2);
                  GameSrc.a().z = 0;
                  int[] var3 = h;
                  var0 = e - 1;
                  int var10002 = var3[var0]++;
               }
            }
         }

         if (o && e == 0) {
            o = false;
            if ((!a || !GameSrc.l) && !x && TileMap.mapId == j[0]) {
               teleTo(j[1], j[2], 0);
            }
         }
      }

   }

   public static void b() {
      boolean var0;
      if (main.a.a == GameSrc.a()) {
         var0 = true;
      } else {
         var0 = false;
      }

      int var6;
      if (var0) {
         for(var6 = 0; var6 < main.a.a.d.size(); ++var6) {
            if (((ef)main.a.a.d.elementAt(var6)).a.endsWith("cmd exit")) {
               pasta.a.a();
            }
         }

         if (Char.myCharz().n != 1 && Char.myCharz().n != cspeed) {
            var6 = cspeed;
            Char.myCharz().n = var6;
         }

         if (p && GameSrc.a().z != 0 && Char.myCharz().a != null && !a.contains(new Integer(Char.myCharz().a.q))) {
            a.addElement(new Integer(Char.myCharz().a.q));
            pasta.a.onChat("adicionado monstros na posição: " + Char.myCharz().a.q);
         }

         if (!c && !e && !u && Char.myCharz().n != 1) {
            if (autoPick && !pasta.a.a() && main.a.g % 10 == 0) {
               autoPickItem();
            }

            if (H && !pasta.a.a() && main.a.g % 12 == 0 && Char.myCharz().a.a.c == 1 && System.currentTimeMillis() - Char.myCharz().a.b > (long)(Char.myCharz().a.b + 100)) {
               MyVector var5;
               if (Char.myCharz().a == null || Char.myCharz().a.h == 0 || Char.myCharz().a.h == 1 || Char.myCharz().a.c <= 0 || !GameSrc.a(Char.myCharz().a) || Char.myCharz().a.a.a == 23 && Char.myCharz().a.b != 0) {
                  if (Char.myCharz().a != null && Char.myCharz().a.charID != -Char.myCharz().charID) {
                     Char var7 = Char.myCharz().a;
                     Char.myCharz();
                     if (Char.b(var7) && (Char.myCharz().a.a.a != 23 || Char.myCharz().a.aj == 0)) {
                        var5 = new MyVector("vChar");
                        var5.addElement(Char.myCharz().a);
                        pasta.e.a(new MyVector("null"), var5, 2);
                        pasta.a.a(Char.myCharz().a);
                     }
                  }
               } else {
                  var5 = new MyVector("vMob");
                  var5.addElement(Char.myCharz().a);
                  pasta.e.a(var5, new MyVector("null"), 1);
                  pasta.a.a(Char.myCharz().a);
               }
            }

            if (D && (TileMap.mapId == 131 || TileMap.mapId == 132 || TileMap.mapId == 133) && !pasta.a.a() && main.a.g % 12 == 0) {
               j();
            }

            if (autoBuff && Char.myCharz().y && !pasta.a.a() && main.a.g % 15 == 0) {
               m();
            }

            if (a && !GameSrc.m && GameSrc.l && main.a.g % 20 == 0) {
               q();
            }

            if (x && Char.myCharz().y && !pasta.a.a() && !o && main.a.g % 20 == 0) {
               n();
            }

            if (kaioken && Char.myCharz().y && !pasta.a.a() && Char.myCharz().h == 1 && main.a.g % 25 == 0) {
               o();
            }

            if (E && Char.myCharz().y && !pasta.a.a() && main.a.g % 25 == 0) {
               f();
            }

            if (!pasta.a.a() && TileMap.mapId != Char.myCharz().k + 21 && a().size() != 0 && main.a.g % 80 == 0) {
               k();
            }

            if (!a || !GameSrc.l || TileMap.mapId != Char.myCharz().k + 21) {
               if (i != TileMap.mapId) {
                  i = TileMap.mapId;
               }

               if (g != TileMap.h) {
                  g = TileMap.h;
               }
            }

            if (a && a() && GameSrc.l) {
               var6 = f + 1;
               f = var6;
               if (var6 % '舔' == 0) {
                  pasta.e.useItens((short)521);
               }

               if (GameSrc.m && f % '襎' == 0) {
                  pasta.e.useItens((short)521);
                  f = 0;
               }
            }

            if (a && GameSrc.l && TileMap.mapId == Char.myCharz().k + 21 && !Char.myCharz().b && Char.myCharz().h == 4 && Char.myCharz().c < 250) {
               s();
               goToMap(i);
               q = true;
               e = true;
            }
         }

         if (updatePet && Char.myCharz().y && System.currentTimeMillis() - h > 1000L) {
            pasta.e.a();
            h = System.currentTimeMillis();
         }

         if ((autoGoback || q) && pasta.a.b() && main.a.g % 30 == 0) {
            if (!t && Char.myCharz().h == 14) {
               t = true;
               d = System.currentTimeMillis();
            }

            if (t && Char.myCharz().h == 14 && System.currentTimeMillis() - d >= 60000L) {
               av.a().j();
            }

            if (t && Char.myCharz().t == Char.myCharz().w) {
               t = false;
            }

            if (e && !pasta.a.a() && (TileMap.mapId == i || i == -1) && System.currentTimeMillis() - e > 1000L) {
               if (g != -1 && TileMap.h != g) {
                  var6 = g;
                  av.a().d(var6);
                  e = System.currentTimeMillis();
               } else if (g == -1 || TileMap.h == g) {
                  if (TileMap.mapId == j[0]) {
                     teleTo(j[1], j[2], 0);
                  }

                  e = false;
                  if (q) {
                     q = false;
                  }
               }
            }
         }

         if (G && !c && !e && main.a.g % 35 == 0) {
            i();
         }

         if (autoVenderItens && !e && main.a.g % 40 == 0) {
            r();
         }

         if (main.a.g % 100 == 0) {
            l();
         }
      }

      if (pasta.a.c() && (g || h) && (!g || System.currentTimeMillis() - g >= 600000L)) {
         long var3 = System.currentTimeMillis();
         long var1 = g;
         if (g) {
            var6 = 120000;
         } else {
            var6 = 20000;
         }

         if (var3 - var1 >= (long)var6) {
            if (main.a.a != null) {
               pasta.a.c();
               main.a.a = null;
            }

            main.a.b();
         }

         var3 = System.currentTimeMillis();
         var1 = g;
         if (g) {
            var6 = 125000;
         } else {
            var6 = 25000;
         }

         if (var3 - var1 >= (long)var6) {
            if (g) {
               var1 = System.currentTimeMillis() - 600000L;
            } else {
               var1 = System.currentTimeMillis();
            }

            g = var1;
            if (au.i == 2) {
               var0 = true;
            } else {
               var0 = false;
            }

            if (var0) {
               if (h) {
                  h = false;
               }

               if (g) {
                  g = false;
               }

               if (!i) {
                  i = true;
               }

               main.a.a.a(3, (Object)null);
               q = true;
               e = true;
            }
         }
      }

   }

   public static void b(String var0) {
      if (var0.equals("Why don't you attack, master?")) {
         h();
         i var4 = null;
         int var2 = 0;

         for(int var1 = 0; var1 < GameSrc.f.size(); ++var1) {
            i var3 = (i)GameSrc.f.elementAt(var1);
            if (var3.h != 0 && var3.h != 1 && var3.c > 0 && !var3.h && pasta.a.a(var3) > var2) {
               var2 = pasta.a.a(var3);
               var4 = var3;
            }
         }

         if (var4 != null) {
            MyVector var5 = new MyVector("vMob");
            var5.addElement(var4);
            pasta.e.a(var5, new MyVector("null"), 1);
         }
      }

   }

   public static void c() {
      j[0] = -1;
      i = -1;
      g = -1;
      a[0] = -1;
      a[1] = -1;
      a[2] = -1;
      a[3] = -1;
      a[4] = -1;
   }

   public static void checkInfo(String var0) {
      if (var0.equals("Você não pode ir para esta área ainda") || var0.equals("Não é possível entrar nesta área.") || var0.equals("A força deve ser inferior a 1,5 milhão para entrar")) {
         d = true;
      }

      if (var0.startsWith("Hệ thống sẽ bảo trì")) {
         g = true;
      }

      if (var0.endsWith("hãy thoát game ngay để tránh mất mát vật phẩm.")) {
         pasta.a.a();
         g = System.currentTimeMillis();
      }

      if (var0.equals(ab.r)) {
         h = true;
         g = System.currentTimeMillis();
      }

   }

   private void e() {
      byte var2 = 0;
      MyVector var4 = new MyVector("vMob");
      var4.addElement(new cd("Ativa", this, 4, ""));
      MyVector var3 = new MyVector("vMobMap");

      int var1;
      for(var1 = 0; var1 < GameSrc.f.size(); ++var1) {
         i var5 = (i)GameSrc.f.elementAt(var1);
         if (!var3.contains(var5.a().a)) {
            var3.addElement(var5.a().a);
         }
      }

      for(var1 = var2; var1 < var3.size(); ++var1) {
         String var6 = (String)var3.elementAt(var1);
         var4.addElement(new cd(var6, this, 4, var6));
      }

      main.a.a.b(var4);
   }

   private static void f() {
      boolean var1 = false;
      int var0 = 0;

      boolean var3;
      while(true) {
         if (var0 >= Char.myCharz().arrItemBag.length) {
            var3 = var1;
            break;
         }

         Item var2 = Char.myCharz().arrItemBag[var0];
         if (var2 != null && var2.itemTemplate.templateId == 454) {
            var3 = true;
            break;
         }

         ++var0;
      }

      if (var3) {
         if (Char.myCharz().d) {
            pasta.e.useItens((short)454);
            if (F) {
               av.a().d((byte)3);
               Char.b().a = 3;
            }
         } else if (!Char.myCharz().d && Char.myCharz().t < Char.myCharz().w * 50 / 100) {
            pasta.e.useItens((short)454);
         }
      }

   }

   private static void g() {
      int var3 = 0;
      boolean var1 = false;

      short var0;
      for(var0 = 0; var3 < Char.myCharz().arrItemBag.length; ++var3) {
         Item var4 = Char.myCharz().arrItemBag[var3];
         boolean var2 = var1;
         if (var4 != null) {
            label51: {
               if (var4.itemTemplate.type == 6) {
                  var1 = true;
               }

               if (var4.itemTemplate.templateId != 211) {
                  var2 = var1;
                  if (var4.itemTemplate.templateId != 212) {
                     break label51;
                  }
               }

               var2 = var1;
               if (var4.itemTemplate.templateId > var0) {
                  var0 = var4.itemTemplate.templateId;
                  continue;
               }
            }
         }

         var1 = var2;
      }

      if (var1 && (Char.myCharz().t <= Char.myCharz().w * 20 / 100 || Char.myCharz().s <= Char.myCharz().x * 10 / 100)) {
         GameSrc.a().o();
      }

      if (var0 != 0 && (short)Char.myCharz().N < Char.myCharz().h * 5 / 100 && System.currentTimeMillis() - c >= 10000L) {
         pasta.e.useItens(var0);
         c = System.currentTimeMillis();
      }

   }

   public static gameFunc gI() {
      if (instance == null) {
         instance = new gameFunc();
      }

      return instance;
   }

   private static int[] getGoWay(int[] var0, int var1) {
      byte var4 = 0;
      MyVector var6 = new MyVector("vGoWays");
      MyVector var7 = new MyVector("vWayGo");

      int var2;
      for(var2 = 0; var2 < var0.length; ++var2) {
         var7.addElement(new Integer(var0[var2]));
      }

      MyVector var9 = (MyVector)a.get(var7.lastElement());

      int var3;
      int[] var11;
      for(var2 = 0; var2 < var9.size(); ++var2) {
         a var8 = (a)var9.elementAt(var2);
         if (var1 == var8.c) {
            var7.addElement(new Integer(var1));
            var11 = new int[var7.size()];
            var1 = var4;

            while(true) {
               var0 = var11;
               if (var1 >= var11.length) {
                  return var0;
               }

               var11[var1] = (Integer)var7.elementAt(var1);
               ++var1;
            }
         }

         if (!var7.contains(new Integer(var8.c))) {
            MyVector var5 = new MyVector("vSmallWay");

            for(var3 = 0; var3 < var7.size(); ++var3) {
               var5.addElement(var7.elementAt(var3));
            }

            var5.addElement(new Integer(var8.c));
            int[] var12 = new int[var5.size()];

            for(var3 = 0; var3 < var12.length; ++var3) {
               var12[var3] = (Integer)var5.elementAt(var3);
            }

            var11 = getGoWay(var12, var1);
            if (var11 != null) {
               for(var3 = 0; var3 < var11.length; ++var3) {
                  var6.addElement(var11);
               }
            }
         }
      }

      var3 = 10000;
      var0 = null;

      for(var2 = 0; var2 < var6.size(); ++var2) {
         var11 = (int[])var6.elementAt(var2);
         var1 = var11.length - 1;

         boolean var10;
         while(true) {
            if (var1 < 2) {
               var10 = false;
               break;
            }

            if (var11[var1] == 24 && var11[var1 - 1] == 102 && (var11[var1 - 2] == 27 || var11[var1 - 2] == 28 || var11[var1 - 2] == 29)) {
               var10 = true;
               break;
            }

            if (var11[var1] == 80 && var11[var1 - 1] == 105 && pasta.a.a() <= 30) {
               var10 = true;
               break;
            }

            --var1;
         }

         if (var11.length < var3 && !var10) {
            var3 = var11.length;
            var0 = var11;
         }
      }

      return var0;
   }

   public static void goToMap(int var0) {
      if (var0 == TileMap.mapId) {
         pasta.a.onChat("Você já está aqui");
      } else if ((var0 == 84 || var0 == 104) && pasta.a.a() <= 15 || var0 >= 63 && var0 <= 83 && pasta.a.a() <= 21 || var0 >= 105 && var0 <= 110 && (pasta.a.a() <= 21 || pasta.a.a() == 23) || var0 >= 131 && var0 <= 133 && pasta.a.a() <= 21 || var0 >= 92 && var0 <= 103 && pasta.a.a() <= 24) {
         pasta.a.onChat("Por favor, complete a missão primeiro");
      } else {
         int var2 = 0;

         int var3;
         for(int var1 = 0; var1 < i.length; var2 = var3) {
            label43: {
               if (TileMap.mapId != i[var1]) {
                  var3 = var2;
                  if (var0 != i[var1]) {
                     break label43;
                  }
               }

               var3 = var2 + 1;
            }

            ++var1;
         }

         if (var2 == 2) {
            c = true;
            pasta.g.a = getGoWay(new int[]{TileMap.mapId}, var0);
            pasta.g.a = var0;
            (new Thread(new g())).start();
         } else {
            pasta.a.onChat("Không thể thực hiện");
            if (e) {
               e = false;
               if (q) {
                  q = false;
               }
            }
         }
      }

   }

   private static void h() {
      int var1 = 5000;
      if (!Char.myCharz().o && !Char.myCharz().B && !Char.myCharz().c() && Char.myCharz().a() == null && Char.myCharz().a.b > 5000 || Char.myCharz().a.a.a == 11) {
         al var4 = null;
         int var0 = 0;

         while(true) {
            int var2;
            if (main.a.e) {
               var2 = GameSrc.b.length;
            } else {
               var2 = GameSrc.a.length;
            }

            if (var0 >= var2) {
               if (var4 != null) {
                  GameSrc.a().a(var4);
               }
               break;
            }

            al var3;
            if (main.a.e) {
               var3 = GameSrc.b[var0];
            } else {
               var3 = GameSrc.a[var0];
            }

            al var5 = var4;
            var2 = var1;
            if (var3 != null) {
               var5 = var4;
               var2 = var1;
               if (!var3.a) {
                  var5 = var4;
                  var2 = var1;
                  if (var3.b < var1) {
                     var2 = var3.b;
                     var5 = var3;
                  }
               }
            }

            ++var0;
            var4 = var5;
            var1 = var2;
         }
      }

   }

   private static void i() {
      int var0 = 0;

      boolean var2;
      while(true) {
         if (var0 >= GameSrc.d.size()) {
            var2 = false;
            break;
         }

         Char var1 = (Char)GameSrc.d.elementAt(var0);
         if (var1 != null && var1.charID > 0 && var1.e != 0) {
            var2 = true;
            break;
         }

         ++var0;
      }

      if (System.currentTimeMillis() - removeTile > 1000L) {
         if (!var2 && Char.myCharz().e != 8) {
            pasta.e.a((byte)1, (byte)8);
         } else if (var2 && Char.myCharz().e != 0) {
            pasta.e.a((byte)1, (byte)0);
         }

         removeTile = System.currentTimeMillis();
      }

   }

   private static void j() {
      int var0;
      for(var0 = 0; var0 < GameSrc.e.size(); ++var0) {
         ItemMap var2 = (ItemMap)GameSrc.e.elementAt(var0);
         if (var2 != null && pasta.a.a(var2) <= 60) {
            int var1 = var2.d;
            av.a().i(var1);
         }
      }

      g();

      for(var0 = 0; var0 < GameSrc.d.size(); ++var0) {
         Char var5 = (Char)GameSrc.d.elementAt(var0);
         if (var5 != null && pasta.a.a(var5) <= distanceAttack && var5.d == 5 && !b.contains(var5)) {
            b.addElement(var5);
         }
      }

      h();
      if (b.size() > 0 && System.currentTimeMillis() - Char.myCharz().a.b > (long)(Char.myCharz().a.b + 100)) {
         try {
            Char var3 = (Char)b.elementAt(h);
            if (GameSrc.d.contains(var3)) {
               if (pasta.a.a(var3) <= distanceAttack) {
                  MyVector var6 = new MyVector("vChar");
                  var6.addElement(var3);
                  MyVector var7 = new MyVector("null");
                  pasta.e.a(var7, var6, 2);
                  pasta.a.a(Char.myCharz().a);
                  var0 = h + 1;
                  h = var0;
                  if (var0 >= b.size()) {
                     h = 0;
                  }
               } else {
                  b.removeElement(var3);
               }
            } else {
               b.removeElement(var3);
            }
         } catch (Exception var4) {
            b.removeAllElements();
            h = 0;
         }
      }

   }

   private static void k() {
      if ((!a || !GameSrc.l) && !Char.myCharz().o && !Char.myCharz().B && !Char.myCharz().c() && Char.myCharz().C != 16 && Char.myCharz().C != 31) {
         for(int var1 = 0; var1 < a.length; ++var1) {
            if (a[var1] != -1) {
               int var0;
               int var2;
               al var3;
               al var4;
               MyVector var5;
               if (main.a.e) {
                  var4 = null;

                  for(var2 = 0; var2 < GameSrc.b.length; var4 = var3) {
                     var3 = var4;
                     if (GameSrc.b[var2] != null) {
                        var3 = var4;
                        if (!GameSrc.b[var2].a) {
                           var3 = var4;
                           if (GameSrc.b[var2].a.a == a[var1]) {
                              var3 = var4;
                              if (Char.myCharz().a() == null) {
                                 if (GameSrc.b[var2].a.b == 2) {
                                    var0 = 1;
                                 } else if (GameSrc.b[var2].a.b == 1) {
                                    var0 = GameSrc.b[var2].e * Char.myCharz().x / 100;
                                 } else {
                                    var0 = GameSrc.b[var2].e;
                                 }

                                 var3 = var4;
                                 if (Char.myCharz().s >= var0) {
                                    if (var4 == null) {
                                       var3 = GameSrc.b[var2];
                                    } else {
                                       var3 = var4;
                                       if (var4.b < GameSrc.b[var2].b) {
                                          var3 = GameSrc.b[var2];
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }

                     ++var2;
                  }

                  if (var4 != null) {
                     GameSrc.a().a(var4);
                     if (var4.a.a == 7) {
                        var5 = new MyVector("myChar");
                        var5.addElement(Char.myCharz());
                        pasta.e.a(new MyVector("null"), var5, 2);
                     } else {
                        GameSrc.a().a(var4);
                     }

                     pasta.a.a(var4);
                  }
               } else {
                  var4 = null;

                  for(var2 = 0; var2 < GameSrc.a.length; var4 = var3) {
                     var3 = var4;
                     if (GameSrc.a[var2] != null) {
                        var3 = var4;
                        if (!GameSrc.a[var2].a) {
                           var3 = var4;
                           if (GameSrc.a[var2].a.a == a[var1]) {
                              var3 = var4;
                              if (Char.myCharz().a() == null) {
                                 if (GameSrc.a[var2].a.b == 2) {
                                    var0 = 1;
                                 } else if (GameSrc.a[var2].a.b == 1) {
                                    var0 = GameSrc.a[var2].e * Char.myCharz().x / 100;
                                 } else {
                                    var0 = GameSrc.a[var2].e;
                                 }

                                 var3 = var4;
                                 if (Char.myCharz().s >= var0) {
                                    if (var4 == null) {
                                       var3 = GameSrc.a[var2];
                                    } else {
                                       var3 = var4;
                                       if (var4.b < GameSrc.a[var2].b) {
                                          var3 = GameSrc.a[var2];
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }

                     ++var2;
                  }

                  if (var4 != null) {
                     GameSrc.a().a(var4);
                     if (var4.a.a == 7) {
                        var5 = new MyVector("myChar");
                        var5.addElement(Char.myCharz());
                        pasta.e.a(new MyVector("null"), var5, 2);
                     } else {
                        GameSrc.a().a(var4);
                     }

                     pasta.a.a(var4);
                  }
               }
            }
         }
      }

   }

   private static void l() {
      if (autoInsist && System.currentTimeMillis() - i > 310000L) {
         av.a().a(1, (String)null, -1);
         i = System.currentTimeMillis();
      }

      int var0;
      Item var3;
      boolean var4;
      if (autoGive) {
         var0 = 0;

         while(true) {
            if (var0 >= Char.myCharz().b.length) {
               var4 = false;
               break;
            }

            var3 = Char.myCharz().b[var0];
            if (var3 != null && var3.itemTemplate.type == 6) {
               var4 = true;
               break;
            }

            ++var0;
         }

         if (var4) {
            for(var0 = 0; var0 < bd.a.size(); ++var0) {
               bd var6 = (bd)bd.a.elementAt(var0);
               if (var6 != null && var6.b == 1 && var6.c != Char.myCharz().charID && var6.d < 5) {
                  var0 = var6.a;
                  av.a().c(var0);
                  break;
               }
            }
         }
      }

      if (autoReap && TileMap.mapId == Char.myCharz().k + 21) {
         if (GameSrc.g.size() != 0) {
            label130: {
               if (!GameSrc.a().a.S) {
                  int var1 = 0;

                  int var2;
                  for(var0 = 0; var1 < Char.myCharz().b.length; var0 = var2) {
                     var3 = Char.myCharz().b[var1];
                     var2 = var0;
                     if (var3 != null) {
                        var2 = var0;
                        if (var3.itemTemplate.type == 6) {
                           var2 = var0 + var3.quantity;
                        }
                     }

                     ++var1;
                  }

                  if (pasta.a.a() > 0) {
                     var2 = GameSrc.t;
                     byte var5;
                     if (Char.myCharz().k == 1) {
                        var5 = 20;
                     } else {
                        var5 = 10;
                     }

                     if (var2 < var5 || var0 < 20) {
                        var4 = true;
                        break label130;
                     }
                  }
               }

               var4 = false;
            }

            if (var4) {
               charAttack = pasta.a.a();
               av.a().g(4);
               pasta.e.a((short)4, (byte)0);
            }
         }

         if (charAttack > 0 && pasta.a.a() < charAttack) {
            charAttack = 0;
         }
      }

      if (useTDLTReap && !pasta.a.a() && a() && GameSrc.t == 0) {
         if (GameSrc.m) {
            av.a().r();
         }

         pasta.e.useItens((short)521);
      }

   }

   private static void m() {
      MyVector var3 = null;
      al var2 = null;
      byte var1 = 0;
      if (Char.b().t < Char.b().w * 20 / 100 || Char.b().s < Char.b().x * 10 / 100 || Char.myCharz().t < Char.myCharz().w * 40 / 100) {
         int var0;
         if (Char.myCharz().k == 1) {
            Char var4;
            if (main.a.e) {
               for(var0 = 0; var0 < GameSrc.b.length; ++var0) {
                  if (GameSrc.b[var0] != null && !GameSrc.b[var0].a && GameSrc.b[var0].a.a == 7 && Char.myCharz().a() == null && Char.myCharz().s >= GameSrc.b[var0].e * Char.myCharz().x / 100) {
                     if (var2 == null) {
                        var2 = GameSrc.b[var0];
                     } else if (var2.b < GameSrc.b[var0].b) {
                        var2 = GameSrc.b[var0];
                     }
                  }
               }

               if (var2 != null) {
                  GameSrc.a().a(var2);
                  var3 = new MyVector("myPet");

                  for(var0 = 0; var0 < GameSrc.d.size(); ++var0) {
                     var4 = (Char)GameSrc.d.elementAt(var0);
                     if (var4 != null && var4.charID == -Char.myCharz().charID) {
                        var3.addElement(var4);
                        break;
                     }
                  }

                  pasta.e.a(new MyVector("null"), var3, 2);
                  pasta.a.a(var2);
               }
            } else {
               var0 = 0;

               for(var2 = var3; var0 < GameSrc.a.length; ++var0) {
                  if (GameSrc.a[var0] != null && !GameSrc.a[var0].a && GameSrc.a[var0].a.a == 7 && Char.myCharz().a() == null && Char.myCharz().s >= GameSrc.a[var0].e * Char.myCharz().x / 100) {
                     if (var2 == null) {
                        var2 = GameSrc.a[var0];
                     } else if (var2.b < GameSrc.a[var0].b) {
                        var2 = GameSrc.a[var0];
                     }
                  }
               }

               if (var2 != null) {
                  GameSrc.a().a(var2);
                  var3 = new MyVector("myPet");

                  for(var0 = 0; var0 < GameSrc.d.size(); ++var0) {
                     var4 = (Char)GameSrc.d.elementAt(var0);
                     if (var4 != null && var4.charID == -Char.myCharz().charID) {
                        var3.addElement(var4);
                        break;
                     }
                  }

                  pasta.e.a(new MyVector("null"), var3, 2);
                  pasta.a.a(var2);
               }
            }
         }

         label154: {
            if (Char.myCharz().k != 1) {
               var0 = var1;
               if (Char.b().t > 0) {
                  break label154;
               }
            }

            if (!usePeaToBuff || Char.b().t <= 0) {
               return;
            }

            var0 = var1;
            if (Char.b().t >= Char.b().w * 10 / 100) {
               var0 = var1;
               if (Char.b().s >= Char.b().x * 5 / 100) {
                  var0 = var1;
                  if (Char.myCharz().t >= Char.myCharz().w * 20 / 100) {
                     if (Char.myCharz().s >= Char.myCharz().x * 10 / 100) {
                        return;
                     }

                     var0 = var1;
                  }
               }
            }
         }

         while(var0 < Char.myCharz().arrItemBag.length) {
            Item var5 = Char.myCharz().arrItemBag[var0];
            if (var5 != null && var5.itemTemplate.type == 6) {
               GameSrc.a().o();
               break;
            }

            ++var0;
         }
      }

   }

   private static void n() {
      if (Char.myCharz().a != null && (Char.myCharz().a == null || !Char.myCharz().a.h)) {
         if (Char.myCharz().a.c <= 0 || Char.myCharz().a.h == 1 || Char.myCharz().a.h == 0) {
            Char.myCharz().a = null;
         }
      } else {
         i var3 = null;
         int var1 = 10000;
         int var0 = 0;

         while(true) {
            int var2;
            if (a.size() != 0) {
               var2 = a.size();
            } else {
               var2 = GameSrc.f.size();
            }

            if (var0 >= var2) {
               if (var3 != null) {
                  pasta.a.a(var3);
                  teleTo(var3.e, var3.f, 0);
                  Char.myCharz().a((int)0);
                  Char.myCharz().a = var3;
               }
               break;
            }

            if (a.size() != 0) {
               var2 = (Integer)a.elementAt(var0);
            } else {
               var2 = var0;
            }

            label59: {
               i var4;
               try {
                  var4 = (i)GameSrc.f.elementAt(var2);
                  if (var4.a().c >= 4 || var4.h == 0 || var4.h == 1 || var4.c <= 0 || var4.h || var4.a == 1 || pasta.a.a(var4) >= var1) {
                     break label59;
                  }

                  var2 = pasta.a.a(var4);
               } catch (Exception var5) {
                  a.removeAllElements();
                  var3 = null;
                  break label59;
               }

               var1 = var2;
               var3 = var4;
            }

            ++var0;
         }
      }

   }

   private static void o() {
      for(int var0 = 0; var0 < GameSrc.d.size(); ++var0) {
         Char var1 = (Char)GameSrc.d.elementAt(var0);
         if (var1 != null && var1.charID == -Char.myCharz().charID && Char.b().t > 0 && pasta.a.a(var1) > 60) {
            var0 = Char.myCharz().c--;
            av.a().g();
            var0 = Char.myCharz().c++;
            av.a().g();
            break;
         }
      }

   }

   private void onCancelChat() {
      MyVector var3 = new MyVector("skillList");

      for(int var1 = 1; var1 <= 5; ++var1) {
         al var2;
         if (main.a.e) {
            var2 = GameSrc.b[var1 - 1];
         } else {
            var2 = GameSrc.a[var1 - 1];
         }

         if (var2 != null && (var2.a.c == 3 && var2.a.a != 14 || var2.a.a == 7)) {
            StringBuffer var4 = (new StringBuffer("Tự dùng\nchiêu ")).append(var1).append("\n");
            String var5;
            if (a[var1 - 1] != -1) {
               var5 = "Desligar";
            } else {
               var5 = "Ligar";
            }

            var3.addElement(new cd(var4.append(var5).toString(), this, 25, new Integer(var1 - 1)));
         }
      }

      if (var3.size() != 0) {
         main.a.a.b(var3);
      } else {
         main.a.checkInfo("Nenhum movimento válido foi encontrado no intervalo de teclas de atalho");
      }

   }

   private static void q() {
      al var7 = null;
      Object var8 = null;
      byte var4 = 0;
      byte var3 = 0;
      if (GameSrc.a().G > 0) {
         GameSrc var6 = GameSrc.a();
         --var6.G;
      }

      if (!o && !GameSrc.n && !pasta.a.a() && Char.myCharz().h != 5 && !Char.myCharz().o && !Char.myCharz().B && !Char.myCharz().c()) {
         int var0 = 0;
         boolean var2 = false;

         while(true) {
            int var1;
            if (a.size() != 0) {
               var1 = a.size();
            } else {
               var1 = GameSrc.f.size();
            }

            i var14;
            if (var0 >= var1) {
               if (var2) {
                  g();
                  if (Char.myCharz().a == null || Char.myCharz().a != null && Char.myCharz().a.h) {
                     var1 = 10000;
                     var14 = null;
                     var0 = 0;

                     while(true) {
                        int var12;
                        if (a.size() != 0) {
                           var12 = a.size();
                        } else {
                           var12 = GameSrc.f.size();
                        }

                        if (var0 >= var12) {
                           if (var14 != null) {
                              pasta.a.a(var14);
                              teleTo(var14.e, var14.f, 0);
                              Char.myCharz().a((int)0);
                              Char.myCharz().a = var14;
                           }
                           break;
                        }

                        if (a.size() != 0) {
                           var12 = (Integer)a.elementAt(var0);
                        } else {
                           var12 = var0;
                        }

                        i var9 = (i)GameSrc.f.elementAt(var12);
                        if (var9.h != 0 && var9.h != 1 && var9.c > 0 && !var9.h && (mobList == 2 || mobList == 0 && var9.a != 1 || mobList == 1 && var9.a == 1) && (a.length() <= 0 || var9.a().a.equals(a)) && pasta.a.a(var9) < var1) {
                           var1 = pasta.a.a(var9);
                           var14 = var9;
                        }

                        ++var0;
                     }
                  } else if (Char.myCharz().a.c <= 0 || Char.myCharz().a.h == 1 || Char.myCharz().a.h == 0) {
                     GameSrc.a().z = 0;
                     Char.myCharz().a = null;
                  }

                  if (System.currentTimeMillis() - b >= 0L && Char.myCharz().a != null && GameSrc.a().G == 0 && (Char.myCharz().a() == null || Char.myCharz().ab >= Char.myCharz().a().length || Char.myCharz().a == null || Char.myCharz().a == null)) {
                     var1 = var4;
                     al var15;
                     MyVector var16;
                     if (main.a.e) {
                        var7 = (al)var8;

                        for(var1 = var3; var1 < GameSrc.b.length; var7 = var15) {
                           var15 = var7;
                           if (GameSrc.b[var1] != null) {
                              var15 = var7;
                              if (!GameSrc.b[var1].a) {
                                 var15 = var7;
                                 if (GameSrc.b[var1].a.a != 10) {
                                    var15 = var7;
                                    if (GameSrc.b[var1].a.a != 11) {
                                       var15 = var7;
                                       if (GameSrc.b[var1].a.a != 14) {
                                          var15 = var7;
                                          if (GameSrc.b[var1].a.a != 23) {
                                             label313: {
                                                if (GameSrc.b[var1].a.a == 7) {
                                                   var15 = var7;
                                                   if (Char.myCharz().t > Char.myCharz().w * 40 / 100) {
                                                      break label313;
                                                   }
                                                }

                                                if (GameSrc.b[var1].a.a == 8 && Char.myCharz().t > Char.myCharz().w * 50 / 100) {
                                                   var15 = var7;
                                                   if (Char.myCharz().s > Char.myCharz().x * 25 / 100) {
                                                      break label313;
                                                   }
                                                }

                                                var15 = var7;
                                                if (Char.myCharz().a() == null) {
                                                   if (GameSrc.b[var1].a.b == 2) {
                                                      var0 = 1;
                                                   } else if (GameSrc.b[var1].a.b == 1) {
                                                      var0 = GameSrc.b[var1].e * Char.myCharz().x / 100;
                                                   } else {
                                                      var0 = GameSrc.b[var1].e;
                                                   }

                                                   var15 = var7;
                                                   if (Char.myCharz().s >= var0) {
                                                      if (var7 == null) {
                                                         var15 = GameSrc.b[var1];
                                                      } else {
                                                         var15 = var7;
                                                         if (var7.b < GameSrc.b[var1].b) {
                                                            var15 = GameSrc.b[var1];
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

                           ++var1;
                        }

                        if (var7 != null) {
                           GameSrc.a().a(var7);
                           if (var7.a.a == 7) {
                              var16 = new MyVector("myChar");
                              var16.addElement(Char.myCharz());
                              pasta.e.a(new MyVector("null"), var16, 2);
                              pasta.a.a(var7);
                           } else {
                              var14 = Char.myCharz().a;
                              GameSrc.a().a((as)var14);
                           }
                        }
                     } else {
                        while(var1 < GameSrc.a.length) {
                           var15 = var7;
                           if (GameSrc.a[var1] != null) {
                              var15 = var7;
                              if (!GameSrc.a[var1].a) {
                                 var15 = var7;
                                 if (GameSrc.a[var1].a.a != 10) {
                                    var15 = var7;
                                    if (GameSrc.a[var1].a.a != 11) {
                                       var15 = var7;
                                       if (GameSrc.a[var1].a.a != 14) {
                                          var15 = var7;
                                          if (GameSrc.a[var1].a.a != 23) {
                                             label319: {
                                                if (GameSrc.a[var1].a.a == 7) {
                                                   var15 = var7;
                                                   if (Char.myCharz().t > Char.myCharz().w * 40 / 100) {
                                                      break label319;
                                                   }
                                                }

                                                if (GameSrc.a[var1].a.a == 8 && Char.myCharz().t > Char.myCharz().w * 50 / 100) {
                                                   var15 = var7;
                                                   if (Char.myCharz().s > Char.myCharz().x * 25 / 100) {
                                                      break label319;
                                                   }
                                                }

                                                var15 = var7;
                                                if (Char.myCharz().a() == null) {
                                                   if (GameSrc.a[var1].a.b == 2) {
                                                      var0 = 1;
                                                   } else if (GameSrc.a[var1].a.b == 1) {
                                                      var0 = GameSrc.a[var1].e * Char.myCharz().x / 100;
                                                   } else {
                                                      var0 = GameSrc.a[var1].e;
                                                   }

                                                   var15 = var7;
                                                   if (Char.myCharz().s >= var0) {
                                                      if (var7 == null) {
                                                         var15 = GameSrc.a[var1];
                                                      } else {
                                                         var15 = var7;
                                                         if (var7.b < GameSrc.a[var1].b) {
                                                            var15 = GameSrc.a[var1];
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

                           ++var1;
                           var7 = var15;
                        }

                        if (var7 != null) {
                           GameSrc.a().a(var7);
                           if (var7.a.a == 7) {
                              var16 = new MyVector("myChar");
                              var16.addElement(Char.myCharz());
                              pasta.e.a(new MyVector("null"), var16, 2);
                              pasta.a.a(var7);
                           } else {
                              var14 = Char.myCharz().a;
                              GameSrc.a().a((as)var14);
                           }
                        }
                     }
                  }
               }
               break;
            }

            if (a.size() != 0) {
               var1 = (Integer)a.elementAt(var0);
            } else {
               var1 = var0;
            }

            boolean var13;
            label278: {
               int var5;
               label277: {
                  label296: {
                     boolean var10001;
                     try {
                        var14 = (i)GameSrc.f.elementAt(var1);
                     } catch (Exception var11) {
                        var10001 = false;
                        break label296;
                     }

                     var13 = var2;

                     try {
                        if (var14.h == 0) {
                           break label278;
                        }

                        var5 = var14.h;
                        break label277;
                     } catch (Exception var10) {
                        var10001 = false;
                     }
                  }

                  a.removeAllElements();
                  var13 = false;
                  break label278;
               }

               var13 = var2;
               if (var5 != 1) {
                  var13 = true;
               }
            }

            ++var0;
            var2 = var13;
         }
      }

   }

   private static void r() {
      int var2 = 0;

      int var0;
      int var1;
      for(var0 = 0; var0 < Char.myCharz().arrItemBag.length; var2 = var1) {
         var1 = var2;
         if (Char.myCharz().arrItemBag[var0] != null) {
            var1 = var2 + 1;
         }

         ++var0;
      }

      if (!u && var2 > Char.myCharz().arrItemBag.length - 3) {
         u = true;
         s();
         j[1] = Char.myCharz().b;
         j[2] = Char.myCharz().ad;
         g = TileMap.h;
         i = TileMap.mapId;
         if (TileMap.mapId != Char.myCharz().k + 24) {
            goToMap(Char.myCharz().k + 24);
         }
      }

      if (u && TileMap.mapId == Char.myCharz().k + 24) {
         for(var0 = 0; var0 < GameSrc.g.size(); ++var0) {
            cm var3 = (cm)GameSrc.g.elementAt(var0);
            if (Math.abs(Char.myCharz().b - var3.b) > 24 && var3.all.a == 16) {
               teleTo(var3.b, Char.myCharz().c, 0);
               f = System.currentTimeMillis();
               break;
            }
         }
      }

      if (f != 0L && System.currentTimeMillis() - f > 2000L) {
         f = 0L;
         (new Thread(new SaleItens())).start();
      }

      if (SaleItens.sellDone && TileMap.mapId == i && System.currentTimeMillis() - e > 1000L) {
         if (g != -1 && TileMap.h != g) {
            var0 = g;
            av.a().d(var0);
            e = System.currentTimeMillis();
         } else if (g == -1 || TileMap.h == g) {
            teleTo(j[1], j[2], 0);
            u = false;
            SaleItens.sellDone = false;
         }
      }

   }

   private static void s() {
      a = new eh("hashMap");
      MyVector var1 = new MyVector("vMap0");
      var1.addElement(new a(1, -1, 0));
      byte var0;
      if (Char.myCharz().k == 0) {
         var0 = 2;
      } else {
         var0 = 1;
      }

      var1.addElement(new a(42, -1, var0));
      if (Char.myCharz().k == 0) {
         var1.addElement(new a(21, -1, 1));
      }

      a.put(new Integer(0), var1);
      var1 = new MyVector("vMap7");
      var1.addElement(new a(8, -1, 0));
      if (Char.myCharz().k == 1) {
         var0 = 2;
      } else {
         var0 = 1;
      }

      var1.addElement(new a(43, -1, var0));
      if (Char.myCharz().k == 1) {
         var1.addElement(new a(22, -1, 1));
      }

      a.put(new Integer(7), var1);
      var1 = new MyVector("vMap14");
      var1.addElement(new a(15, -1, 0));
      if (Char.myCharz().k == 2) {
         var0 = 2;
      } else {
         var0 = 1;
      }

      var1.addElement(new a(44, -1, var0));
      if (Char.myCharz().k == 2) {
         var1.addElement(new a(23, -1, 1));
      }

      a.put(new Integer(14), var1);
      var1 = new MyVector("vMap42");
      var1.addElement(new a(0, -1, 0));
      a.put(new Integer(42), var1);
      var1 = new MyVector("vMap43");
      var1.addElement(new a(7, -1, 0));
      a.put(new Integer(43), var1);
      var1 = new MyVector("vMap44");
      var1.addElement(new a(14, -1, 0));
      var1.addElement(new a(52, -1, 1));
      a.put(new Integer(44), var1);
      var1 = new MyVector("vMapHome");
      var1.addElement(new a(Char.myCharz().k * 7, -1, 0));
      a.put(new Integer(Char.myCharz().k + 21), var1);
      var1 = new MyVector("vMap1");
      var1.addElement(new a(0, -1, 0));
      var1.addElement(new a(2, -1, 1));
      var1.addElement(new a(47, -1, 2));
      a.put(new Integer(1), var1);
      var1 = new MyVector("vMap8");
      var1.addElement(new a(7, -1, 0));
      var1.addElement(new a(9, -1, 1));
      a.put(new Integer(8), var1);
      var1 = new MyVector("vMap15");
      var1.addElement(new a(14, -1, 0));
      var1.addElement(new a(16, -1, 1));
      a.put(new Integer(15), var1);
      var1 = new MyVector("vMap2");
      var1.addElement(new a(1, -1, 0));
      var1.addElement(new a(3, -1, 1));
      var1.addElement(new a(24, -1, 2));
      a.put(new Integer(2), var1);
      var1 = new MyVector("vMap9");
      var1.addElement(new a(8, -1, 0));
      var1.addElement(new a(11, -1, 1));
      var1.addElement(new a(25, -1, 2));
      a.put(new Integer(9), var1);
      var1 = new MyVector("vMap16");
      var1.addElement(new a(15, -1, 0));
      var1.addElement(new a(17, -1, 1));
      var1.addElement(new a(26, -1, 2));
      a.put(new Integer(16), var1);
      var1 = new MyVector("vMap3");
      var1.addElement(new a(2, -1, 0));
      var1.addElement(new a(4, -1, 1));
      var1.addElement(new a(27, -1, 2));
      a.put(new Integer(3), var1);
      var1 = new MyVector("vMap11");
      var1.addElement(new a(9, -1, 0));
      var1.addElement(new a(12, -1, 1));
      var1.addElement(new a(31, -1, 2));
      a.put(new Integer(11), var1);
      var1 = new MyVector("vMap17");
      var1.addElement(new a(16, -1, 0));
      var1.addElement(new a(18, -1, 1));
      var1.addElement(new a(35, -1, 2));
      a.put(new Integer(17), var1);
      var1 = new MyVector("vMap4");
      var1.addElement(new a(3, -1, 0));
      var1.addElement(new a(5, -1, 1));
      a.put(new Integer(4), var1);
      var1 = new MyVector("vMap12");
      var1.addElement(new a(11, -1, 0));
      var1.addElement(new a(13, -1, 1));
      a.put(new Integer(12), var1);
      var1 = new MyVector("vMap18");
      var1.addElement(new a(17, -1, 0));
      var1.addElement(new a(20, -1, 1));
      a.put(new Integer(18), var1);
      var1 = new MyVector("vMap5");
      var1.addElement(new a(4, -1, 0));
      var1.addElement(new a(6, -1, 1));
      var1.addElement(new a(29, -1, 2));
      a.put(new Integer(5), var1);
      var1 = new MyVector("vMap13");
      var1.addElement(new a(12, -1, 0));
      var1.addElement(new a(10, -1, 1));
      var1.addElement(new a(33, -1, 2));
      a.put(new Integer(13), var1);
      var1 = new MyVector("vMap20");
      var1.addElement(new a(18, -1, 0));
      var1.addElement(new a(19, -1, 1));
      var1.addElement(new a(37, -1, 2));
      a.put(new Integer(20), var1);
      var1 = new MyVector("vMap29");
      var1.addElement(new a(28, -1, 0));
      var1.addElement(new a(30, -1, 1));
      var1.addElement(new a(5, -1, 2));
      var1.addElement(new a(102, 38, 1));
      a.put(new Integer(29), var1);
      var1 = new MyVector("vMap33");
      var1.addElement(new a(32, -1, 0));
      var1.addElement(new a(13, -1, 1));
      var1.addElement(new a(34, -1, 2));
      a.put(new Integer(33), var1);
      var1 = new MyVector("vMap37");
      var1.addElement(new a(20, -1, 0));
      var1.addElement(new a(38, -1, 1));
      var1.addElement(new a(36, -1, 2));
      a.put(new Integer(37), var1);
      var1 = new MyVector("vMap30");
      var1.addElement(new a(29, -1, 0));
      a.put(new Integer(30), var1);
      var1 = new MyVector("vMap34");
      var1.addElement(new a(33, -1, 0));
      a.put(new Integer(34), var1);
      var1 = new MyVector("vMap38");
      var1.addElement(new a(37, -1, 0));
      a.put(new Integer(38), var1);
      var1 = new MyVector("vMap28");
      var1.addElement(new a(27, -1, 0));
      var1.addElement(new a(29, -1, 1));
      var1.addElement(new a(102, 38, 1));
      a.put(new Integer(28), var1);
      var1 = new MyVector("vMap32");
      var1.addElement(new a(31, -1, 0));
      var1.addElement(new a(33, -1, 1));
      a.put(new Integer(32), var1);
      var1 = new MyVector("vMap36");
      var1.addElement(new a(35, -1, 0));
      var1.addElement(new a(38, -1, 1));
      a.put(new Integer(36), var1);
      var1 = new MyVector("vMap27");
      var1.addElement(new a(3, -1, 0));
      var1.addElement(new a(28, -1, 1));
      var1.addElement(new a(102, 38, 1));
      a.put(new Integer(27), var1);
      var1 = new MyVector("vMap31");
      var1.addElement(new a(11, -1, 0));
      var1.addElement(new a(32, -1, 1));
      a.put(new Integer(31), var1);
      var1 = new MyVector("vMap35");
      var1.addElement(new a(17, -1, 0));
      var1.addElement(new a(36, -1, 1));
      a.put(new Integer(35), var1);
      var1 = new MyVector("vMap6");
      var1.addElement(new a(5, -1, 0));
      a.put(new Integer(6), var1);
      var1 = new MyVector("vMap10");
      var1.addElement(new a(13, -1, 0));
      a.put(new Integer(10), var1);
      var1 = new MyVector("vMap19");
      var1.addElement(new a(20, -1, 0));
      var1.addElement(new a(109, 12, 0));
      if (pasta.a.a() == 23) {
         var0 = 0;
      } else {
         var0 = 1;
      }

      var1.addElement(new a(68, 12, var0));
      a.put(new Integer(19), var1);
      var1 = new MyVector("vMap24");
      var1.addElement(new a(2, -1, 0));
      var1.addElement(new a(25, 10, 0));
      var1.addElement(new a(26, 10, 1));
      var1.addElement(new a(84, 10, 2));
      a.put(new Integer(24), var1);
      var1 = new MyVector("vMap25");
      var1.addElement(new a(9, -1, 0));
      var1.addElement(new a(24, 11, 0));
      var1.addElement(new a(26, 11, 1));
      var1.addElement(new a(84, 11, 2));
      a.put(new Integer(25), var1);
      var1 = new MyVector("vMap26");
      var1.addElement(new a(16, -1, 0));
      var1.addElement(new a(24, 12, 0));
      var1.addElement(new a(25, 12, 1));
      var1.addElement(new a(84, 12, 2));
      a.put(new Integer(26), var1);
      var1 = new MyVector("vMap47");
      var1.addElement(new a(1, -1, 1));
      var1.addElement(new a(111, -1, 2));
      a.put(new Integer(47), var1);
      var1 = new MyVector("vMap111");
      var1.addElement(new a(47, -1, 0));
      a.put(new Integer(111), var1);
      var1 = new MyVector("vMap52");
      var1.addElement(new a(44, -1, 0));
      a.put(new Integer(52), var1);
      var1 = new MyVector("vMap84");
      var1.addElement(new a(104, -1, 0));
      var1.addElement(new a(Char.myCharz().k + 24, 10, 0));
      a.put(new Integer(84), var1);
      var1 = new MyVector("vMap104");
      var1.addElement(new a(84, -1, 0));
      a.put(new Integer(104), var1);
      var1 = new MyVector("vMap80");
      var1.addElement(new a(79, -1, 0));
      var1.addElement(new a(105, -1, 1));
      var1.addElement(new a(131, 60, 0));
      a.put(new Integer(80), var1);
      var1 = new MyVector("vMap79");
      var1.addElement(new a(83, -1, 0));
      var1.addElement(new a(80, -1, 1));
      a.put(new Integer(79), var1);
      var1 = new MyVector("vMap83");
      var1.addElement(new a(82, -1, 0));
      var1.addElement(new a(79, -1, 1));
      a.put(new Integer(83), var1);
      var1 = new MyVector("vMap82");
      var1.addElement(new a(81, -1, 0));
      var1.addElement(new a(83, -1, 1));
      a.put(new Integer(82), var1);
      var1 = new MyVector("vMap81");
      var1.addElement(new a(82, -1, 0));
      var1.addElement(new a(77, -1, 1));
      a.put(new Integer(81), var1);
      var1 = new MyVector("vMap77");
      var1.addElement(new a(76, -1, 0));
      var1.addElement(new a(81, -1, 1));
      a.put(new Integer(77), var1);
      var1 = new MyVector("vMap76");
      var1.addElement(new a(75, -1, 0));
      var1.addElement(new a(77, -1, 1));
      a.put(new Integer(76), var1);
      var1 = new MyVector("vMap75");
      var1.addElement(new a(74, -1, 0));
      var1.addElement(new a(76, -1, 1));
      a.put(new Integer(75), var1);
      var1 = new MyVector("vMap74");
      var1.addElement(new a(73, -1, 0));
      var1.addElement(new a(75, -1, 1));
      a.put(new Integer(74), var1);
      var1 = new MyVector("vMap73");
      var1.addElement(new a(74, -1, 0));
      var1.addElement(new a(67, -1, 1));
      a.put(new Integer(73), var1);
      var1 = new MyVector("vMap67");
      var1.addElement(new a(66, -1, 0));
      var1.addElement(new a(73, -1, 1));
      a.put(new Integer(67), var1);
      var1 = new MyVector("vMap66");
      var1.addElement(new a(63, -1, 0));
      var1.addElement(new a(67, -1, 1));
      a.put(new Integer(66), var1);
      var1 = new MyVector("vMap63");
      var1.addElement(new a(65, -1, 0));
      var1.addElement(new a(66, -1, 1));
      a.put(new Integer(63), var1);
      var1 = new MyVector("vMap65");
      var1.addElement(new a(64, -1, 0));
      var1.addElement(new a(63, -1, 1));
      a.put(new Integer(65), var1);
      var1 = new MyVector("vMap64");
      var1.addElement(new a(65, -1, 0));
      var1.addElement(new a(72, -1, 1));
      a.put(new Integer(64), var1);
      var1 = new MyVector("vMap72");
      var1.addElement(new a(71, -1, 0));
      var1.addElement(new a(64, -1, 1));
      a.put(new Integer(72), var1);
      var1 = new MyVector("vMap71");
      var1.addElement(new a(70, -1, 0));
      var1.addElement(new a(72, -1, 1));
      a.put(new Integer(71), var1);
      var1 = new MyVector("vMap70");
      var1.addElement(new a(69, -1, 0));
      var1.addElement(new a(71, -1, 1));
      a.put(new Integer(70), var1);
      var1 = new MyVector("vMap69");
      var1.addElement(new a(68, -1, 0));
      var1.addElement(new a(70, -1, 1));
      a.put(new Integer(69), var1);
      var1 = new MyVector("vMap68");
      var1.addElement(new a(69, -1, 0));
      var1.addElement(new a(19, 12, 0));
      a.put(new Integer(68), var1);
      var1 = new MyVector("vMap131");
      var1.addElement(new a(132, -1, 0));
      var1.addElement(new a(80, 60, 1));
      a.put(new Integer(131), var1);
      var1 = new MyVector("vMap132");
      var1.addElement(new a(131, -1, 0));
      var1.addElement(new a(133, -1, 1));
      a.put(new Integer(132), var1);
      var1 = new MyVector("vMap133");
      var1.addElement(new a(132, -1, 0));
      a.put(new Integer(133), var1);
      var1 = new MyVector("vMap102");
      var1.addElement(new a(92, -1, 0));
      var1.addElement(new a(24, 38, 1));
      a.put(new Integer(102), var1);
      var1 = new MyVector("vMap92");
      var1.addElement(new a(93, -1, 0));
      var1.addElement(new a(102, -1, 1));
      a.put(new Integer(92), var1);
      var1 = new MyVector("vMap93");
      var1.addElement(new a(92, -1, 0));
      var1.addElement(new a(94, -1, 1));
      a.put(new Integer(93), var1);
      var1 = new MyVector("vMap94");
      var1.addElement(new a(93, -1, 0));
      var1.addElement(new a(96, -1, 1));
      a.put(new Integer(94), var1);
      var1 = new MyVector("vMap96");
      var1.addElement(new a(94, -1, 0));
      var1.addElement(new a(97, -1, 1));
      a.put(new Integer(96), var1);
      var1 = new MyVector("vMap97");
      var1.addElement(new a(98, -1, 0));
      var1.addElement(new a(96, -1, 1));
      a.put(new Integer(97), var1);
      var1 = new MyVector("vMap98");
      var1.addElement(new a(97, -1, 0));
      var1.addElement(new a(99, -1, 1));
      a.put(new Integer(98), var1);
      var1 = new MyVector("vMap99");
      var1.addElement(new a(98, -1, 0));
      var1.addElement(new a(100, -1, 1));
      a.put(new Integer(99), var1);
      var1 = new MyVector("vMap100");
      var1.addElement(new a(99, -1, 0));
      var1.addElement(new a(103, -1, 1));
      a.put(new Integer(100), var1);
      var1 = new MyVector("vMap103");
      var1.addElement(new a(100, -1, 0));
      a.put(new Integer(103), var1);
      var1 = new MyVector("vMap105");
      var1.addElement(new a(108, -1, 0));
      var1.addElement(new a(109, -1, 1));
      var1.addElement(new a(80, -1, 2));
      a.put(new Integer(105), var1);
      var1 = new MyVector("vMap109");
      var1.addElement(new a(106, -1, 0));
      var1.addElement(new a(105, -1, 1));
      var1.addElement(new a(108, -1, 2));
      a.put(new Integer(109), var1);
      var1 = new MyVector("vMap106");
      var1.addElement(new a(109, -1, 0));
      var1.addElement(new a(107, -1, 1));
      var1.addElement(new a(110, -1, 2));
      a.put(new Integer(106), var1);
      var1 = new MyVector("vMap108");
      var1.addElement(new a(107, -1, 0));
      var1.addElement(new a(105, -1, 1));
      var1.addElement(new a(109, -1, 2));
      a.put(new Integer(108), var1);
      var1 = new MyVector("vMap107");
      var1.addElement(new a(106, -1, 0));
      var1.addElement(new a(110, -1, 1));
      var1.addElement(new a(108, -1, 2));
      a.put(new Integer(107), var1);
      var1 = new MyVector("vMap110");
      var1.addElement(new a(107, -1, 0));
      var1.addElement(new a(106, -1, 1));
      a.put(new Integer(110), var1);
      int[] var2 = new int[]{42, 0, 1, 47, 111, 2, 24, 3, 4, 5, 6, 27, 28, 29, 30};
      b = var2;
      a = new int[]{43, 7, 8, 9, 25, 11, 12, 13, 10, 31, 32, 33, 34};
      c = new int[]{52, 44, 14, 15, 16, 26, 17, 18, 20, 19, 35, 36, 37, 38, 84, 104};
      d = new int[]{68, 69, 70, 71, 72, 64, 65, 63, 66, 67, 73, 74, 75, 76, 77, 81, 82, 83, 79, 80};
      e = new int[]{131, 132, 133};
      f = new int[]{102, 92, 93, 94, 96, 97, 98, 99, 100, 103};
      g = new int[]{105, 109, 106, 108, 107, 110};
      var2 = new int[]{Char.myCharz().k + 21, 42, 0, 1, 47, 111, 2, 24, 3, 4, 5, 6, 27, 28, 29, 30, 43, 7, 8, 9, 25, 11, 12, 13, 10, 31, 32, 33, 34, 52, 44, 14, 15, 16, 26, 17, 18, 20, 19, 35, 36, 37, 38, 84, 104, 68, 69, 70, 71, 72, 64, 65, 63, 66, 67, 73, 74, 75, 76, 77, 81, 82, 83, 79, 80, 131, 132, 133, 102, 92, 93, 94, 96, 97, 98, 99, 100, 103, 105, 109, 106, 108, 107, 110};
      i = var2;
   }

   private static void teleTo(int var0, int var1, int var2) {
      if (TileMap.mapId == 16 && var2 == 2) {
         Char.myCharz().b = 300;
         Char.myCharz().c = 288;
         av.a().g();
         Char.myCharz().b = 300;
         Char.myCharz().c = 289;
         av.a().g();
         Char.myCharz().b = 300;
         Char.myCharz().c = 288;
         av.a().g();
      } else if (!c && (Math.abs(Char.myCharz().b - var0) <= 576 || !TileMap.a(var0, var1, 2))) {
         int var6 = Math.abs((Char.myCharz().b - var0) % 48);
         int var5 = Math.abs((Char.myCharz().b - var0) / 48);
         byte var7;
         if (Char.myCharz().b > var0) {
            var7 = -1;
         } else {
            var7 = 0;
         }

         if (Char.myCharz().b < var0) {
            var7 = 1;
         }

         for(int var3 = 0; var3 < var5; ++var3) {
            if (!TileMap.a(Char.myCharz().b + var7 * 48, Char.myCharz().c, 2)) {
               for(var0 = 96; var0 <= 1296; var0 += 24) {
                  if (TileMap.a(Char.myCharz().b + var7 * 48, var0, 2)) {
                     int var4 = var0;
                     if (var0 % 24 != 0) {
                        var4 = var0 - var0 % 24;
                     }

                     if (var4 < Char.myCharz().c || TileMap.a(Char.myCharz().b + var7 * 48, 0, 4) || TileMap.a(Char.myCharz().b + var7 * 48, 0, 8) || TileMap.a(Char.myCharz().b + var7 * 24, Char.myCharz().c, 8192) || TileMap.a(Char.myCharz().b + var7 * 48, Char.myCharz().c, 8192)) {
                        Char.myCharz().c = var4;
                     }
                     break;
                  }
               }
            }

            var0 = Char.myCharz().b;
            Char.myCharz().b = var0 + var7 * 48;
            av.a().g();
         }

         var0 = Char.myCharz().b;
         Char.myCharz().b = var7 * var6 + var0;
         Char.myCharz().c = var1;
         av.a().g();
         b = System.currentTimeMillis() + (long)(var5 * 100);
      } else {
         Char.myCharz().b = var0;
         Char.myCharz().c = var1;
         av.a().g();
         Char.myCharz().b = var0;
         Char.myCharz().c = var1 + 1;
         av.a().g();
         Char.myCharz().b = var0;
         Char.myCharz().c = var1;
         av.a().g();
      }

   }

   public static void transMap(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a() {
      MyVector var2 = new MyVector("vMenu");
      var2.addElement(new cd("Inventário", this, 1, (Object)null));
      var2.addElement(new cd("Auto Corre", this, 2, (Object)null));
      StringBuffer var3 = new StringBuffer("Auto\nTreino\n");
      String var1;
      if (a) {
         var1 = "Desligar";
      } else {
         var1 = "Ligar";
      }

      var2.addElement(new cd(var3.append(var1).toString(), this, 3, (Object)null));
      var2.addElement(new cd("Opcões\nAuto Treino", this, 14, (Object)null));
      var2.addElement(new cd("Funções\nPara\nDicipolos", this, 17, (Object)null));
      var3 = new StringBuffer("Coleta Auto\n");
      if (autoPick) {
         var1 = "Desligar";
      } else {
         var1 = "Ligar";
      }

      var2.addElement(new cd(var3.append(var1).toString(), this, 5, (Object)null));
      var3 = new StringBuffer("Vender\nItens\n");
      if (autoVenderItens) {
         var1 = "Desligar";
      } else {
         var1 = "Ligar";
      }

      var2.addElement(new cd(var3.append(var1).toString(), this, 6, (Object)null));
      var3 = new StringBuffer("Marca\nLocalizacão\n");
      if (autoGoback) {
         var1 = "Desligar";
      } else {
         var1 = "Ligar";
      }

      var2.addElement(new cd(var3.append(var1).toString(), this, 7, (Object)null));
      var2.addElement(new cd("Gráficos", this, 8, (Object)null));
      main.a.a.b(var2);
   }

   public final void a(int var1, Object var2) {
      byte var10 = 1;
      byte var15 = 1;
      byte var5 = 1;
      byte var14 = 1;
      byte var4 = 1;
      boolean var22 = true;
      byte var11 = 1;
      byte var7 = 1;
      byte var12 = 1;
      byte var8 = 1;
      byte var13 = 1;
      byte var6 = 1;
      byte var16 = 1;
      byte var9 = 0;
      boolean var20 = false;
      byte var3 = 0;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var21 = false;
      MyVector var23;
      StringBuffer var24;
      byte var25;
      String var26;
      StringBuffer var30;
      switch(var1) {
      case 1:
         main.a.a.r();
         main.a.a.t();
         break;
      case 2:
         if (pasta.a.a()) {
            main.a.checkInfo("Não consigo me mover quando estou exausto");
         } else {
            s();
            b = true;
            main.a.a.a = new String[8];
            main.a.a.b = new String[8];
            main.a.a.a[0] = "Para Casa";
            main.a.a.b[0] = String.valueOf(Char.myCharz().k + 21);
            main.a.a.a[1] = "Planeta Terra";
            main.a.a.b[1] = "Selecione o destino para o planeta Terra";
            main.a.a.a[2] = "Planeta Namekuseijin";
            main.a.a.b[2] = "Selecione o destino para o planeta Namekuseijin";
            main.a.a.a[3] = "Planeta Sadala";
            main.a.a.b[3] = "Selecione o destino para o planeta Sadala";
            main.a.a.a[4] = "Planeta Freeza";
            main.a.a.b[4] = "Selecione o destino para o planeta Freeza";
            main.a.a.a[5] = "Yardrat";
            main.a.a.b[5] = "Selecione o destino para o planeta Yardrat";
            main.a.a.a[6] = "Futuro";
            main.a.a.b[6] = "Selecione o destino para o Futuro";
            main.a.a.a[7] = "Cold";
            main.a.a.b[7] = "Selecione o destino para o planeta Cold";
            main.a.a.b();
            main.a.a.t();
         }
         break;
      case 3:
         if (a) {
            a = false;
            pasta.a.onChat("Auto Treino Desligado");
         } else if (p) {
            p = false;
            if (a.size() == 0) {
               this.e();
            } else {
               a = "";
               a = true;
               pasta.a.onChat("Auto Treino Ligado");
            }
         } else {
            this.e();
         }
         break;
      case 4:
         a = (String)var2;
         a = true;
         pasta.a.onChat("Auto Treino ligado");
         break;
      case 5:
         if (D) {
            main.a.checkInfo("O upload automático do Yarrdrat está ativado. Esta função está desativada");
         } else {
            if (autoPick) {
               var17 = false;
            } else {
               var17 = true;
            }

            autoPick = var17;
            if (autoPick) {
               var26 = "Ativado";
            } else {
               var26 = "Desligado";
            }

            pasta.a.onChat(var26 + " Pega Itens Automaticamente ");
            if (autoPick) {
               var25 = var16;
            } else {
               var25 = 0;
            }

            aa.a("autoPick", var25);
         }
         break;
      case 6:
         if (autoVenderItens) {
            var17 = var21;
         } else {
            var17 = true;
         }

         autoVenderItens = var17;
         if (autoVenderItens) {
            var26 = "A seleção automática de ouro está desativada. Ativada";
         } else {
            var26 = "Desligado";
         }

         main.a.checkInfo(var26 + " cópia lixo automaticamente ");
         break;
      case 7:
         if (autoGoback) {
            var17 = false;
         } else {
            var17 = true;
         }

         autoGoback = var17;
         if (autoGoback) {
            var26 = "Se morre você voltará para esse mesmo local. Ativado";
         } else {
            var26 = "Desligado";
         }

         main.a.checkInfo(var26 + " reviver automaticamente ");
         if (autoGoback) {
            var25 = var10;
         } else {
            var25 = 0;
         }

         aa.a("autoGoback", var25);
         break;
      case 8:
         var23 = new MyVector("general");
         var24 = new StringBuffer("Esconder\nO Mapa\n");
         if (j) {
            var26 = "Ativa";
         } else {
            var26 = "Ligar";
         }

         var23.addElement(new cd(var24.append(var26).toString(), this, 9, (Object)null));
         var24 = new StringBuffer("Remove efeitos\nPlay Invisível\n");
         if (removeSmall) {
            var26 = "Ativa";
         } else {
            var26 = "Ligar";
         }

         var23.addElement(new cd(var24.append(var26).toString(), this, 10, (Object)null));
         var24 = new StringBuffer("Fake\nKaioken\n");
         if (fakeSkill) {
            var26 = "Ativa";
         } else {
            var26 = "Ligar";
         }

         var23.addElement(new cd(var24.append(var26).toString(), this, 11, (Object)null));
         if (main.a.e) {
            var24 = new StringBuffer("Remove\nNotificações do NV\n");
            if (GameSrc.u) {
               var26 = "Ativa";
            } else {
               var26 = "Ligar";
            }

            var23.addElement(new cd(var24.append(var26).toString(), this, 12, (Object)null));
         }

         var24 = new StringBuffer("Pendurado\nCom bastões PK\n");
         if (G) {
            var26 = "Ativa";
         } else {
            var26 = "Ligar";
         }

         var23.addElement(new cd(var24.append(var26).toString(), this, 37, (Object)null));
         var23.addElement(new cd("Velocidade Do\nPersonagem\n" + cspeed, this, 26, (Object)null));
         var23.addElement(new cd("Velocidade\nDo Game\n" + instance, this, 13, (Object)null));
         main.a.a.b(var23);
         break;
      case 9:
         if (j) {
            var17 = false;
         } else {
            var17 = true;
         }

         j = var17;
         if (j) {
            var25 = var15;
         } else {
            var25 = 0;
         }

         aa.a("removeTile", var25);
         break;
      case 10:
         if (removeSmall) {
            var17 = false;
         } else {
            var17 = true;
         }

         removeSmall = var17;
         if (removeSmall) {
            var25 = var5;
         } else {
            var25 = 0;
         }

         aa.a("removeSmall", var25);
         break;
      case 11:
         if (fakeSkill) {
            var25 = var9;
         } else {
            var25 = 1;
         }

         aa.a("fakeSkill", var25);
         main.a.a(ab.cd, (int)8885);
         break;
      case 12:
         if (GameSrc.u) {
            var25 = 1;
         } else {
            var25 = 0;
         }

         aa.a("serverchat", var25);
         if (var25 == 1) {
            var17 = var20;
         } else {
            var17 = true;
         }

         GameSrc.u = var17;
         main.a.a.B();
         if (GameSrc.u) {
            var26 = "desligado";
         } else {
            var26 = "Desligado";
         }

         pasta.a.onChat(var26 + " notificação do servidor na parte inferior da tela");
         break;
      case 13:
         if (D) {
            main.a.checkInfo("A latência do jogo está bloqueada na velocidade original para evitar atrasos. Desative o upload automático do Yardart para usar esta função");
         } else {
            pasta.f.a(pasta.f.a, "insira a velocidade (1 - 100)", 1);
         }
         break;
      case 14:
         var23 = new MyVector("typeMob");
         if (!p) {
            var24 = new StringBuffer("Add\nMonstros\n");
            if (a.size() != 0) {
               var26 = "Desligar";
            } else {
               var26 = "Ligar";
            }

            var26 = var24.append(var26).toString();
         } else if (a.size() == 0) {
            var26 = "Cancelari\nLista";
         } else {
            var26 = "pare ah\nLista";
         }

         var23.addElement(new cd(var26, this, 15, (Object)null));
         if (mobList == 2) {
            var26 = "Bate Em\nTodos";
         } else if (mobList == 1) {
            var26 = "Bate Só Em\nSuper";
         } else {
            var26 = "Bate Em\nMonstros\nNormais";
         }

         var23.addElement(new cd(var26, this, 16, (Object)null));
         var24 = new StringBuffer("Ataque Auto\n");
         if (H) {
            var26 = "Desligar";
         } else {
            var26 = "Ligar";
         }

         var23.addElement(new cd(var24.append(var26).toString(), this, 38, (Object)null));
         var24 = new StringBuffer("Farma\nYardrat\n");
         if (D) {
            var26 = "Desligar";
         } else {
            var26 = "Ligar";
         }

         var23.addElement(new cd(var24.append(var26).toString(), this, 32, (Object)null));
         var23.addElement(new cd("Gama De\nNomes\n" + distanceAttack, this, 33, (Object)null));
         main.a.a.b(var23);
         break;
      case 15:
         if (a.size() == 0 && !p) {
            main.a.checkInfo("Toque duas vezes no monstro para adicionar a lista");
            if (a) {
               a = false;
            }

            if (x) {
               x = false;
            }

            p = true;
         } else if (a.size() != 0 && p) {
            main.a.checkInfo("Lista salva, habilite a luta automática contra monstros para lutar de acordo com a lista salva");
            p = false;
         } else if (a.size() != 0 && !p) {
            a.removeAllElements();
            pasta.a.onChat("Lista inteira de monstros removida");
         } else {
            pasta.a.onChat("Gravação de dados cancelada");
            p = false;
         }
         break;
      case 16:
         if (mobList == 2) {
            var3 = 1;
         } else if (mobList != 1) {
            var3 = 2;
         }

         mobList = var3;
         var30 = new StringBuffer("Selecionado ");
         if (mobList == 2) {
            var26 = "Acerta Tudo";
         } else if (mobList == 1) {
            var26 = "Bate apenas em super";
         } else {
            var26 = "Luta contra apenas monstros normais";
         }

         pasta.a.onChat(var30.append(var26).toString());
         aa.a("levelMob", mobList);
         break;
      case 17:
         var23 = new MyVector("petMenu");
         if (Char.myCharz().y) {
            var24 = new StringBuffer("Auto\nbuff Diciple\n");
            if (autoBuff) {
               var26 = "Desligar";
            } else {
               var26 = "Ligar";
            }

            var23.addElement(new cd(var24.append(var26).toString(), this, 18, (Object)null));
            if (Char.myCharz().k == 1) {
               var24 = new StringBuffer("Dùng đậu\nđể buff\n");
               if (usePeaToBuff) {
                  var26 = "Desligar";
               } else {
                  var26 = "Ligar";
               }

               var23.addElement(new cd(var24.append(var26).toString(), this, 19, (Object)null));
            }

            var24 = new StringBuffer("Esquivar\nDe Super Monstro\n");
            if (x) {
               var26 = "Desligar";
            } else {
               var26 = "Ligar";
            }

            var23.addElement(new cd(var24.append(var26).toString(), this, 20, (Object)null));
            var24 = new StringBuffer("Função\nKaioken\n");
            if (kaioken) {
               var26 = "Desligar";
            } else {
               var26 = "Ligar";
            }

            var23.addElement(new cd(var24.append(var26).toString(), this, 21, (Object)null));
            var24 = new StringBuffer("Mostra Barra\nDe Energia\n");
            if (showPetInfo) {
               var26 = "Desligar";
            } else {
               var26 = "Ligar";
            }

            var23.addElement(new cd(var24.append(var26).toString(), this, 24, (Object)null));
            var24 = new StringBuffer("Fusao\nAutomatica\n");
            if (E) {
               var26 = "Desligar";
            } else {
               var26 = "Ligar";
            }

            var23.addElement(new cd(var24.append(var26).toString(), this, 34, (Object)null));
         }

         var24 = new StringBuffer("Usar\nSkill Auto\n");
         if (a().size() != 0) {
            var26 = "Desligar";
         } else {
            var26 = "Ligar";
         }

         var23.addElement(new cd(var24.append(var26).toString(), this, 23, (Object)null));
         var23.addElement(new cd("Funções \nDe Feijão", this, 27, (Object)null));
         main.a.a.b(var23);
         break;
      case 18:
         if (!updatePet) {
            updatePet = true;
            aa.a("updatePet", 1);
         }

         if (autoBuff) {
            var17 = false;
         } else {
            var17 = true;
         }

         autoBuff = var17;
         if (!var17 && !kaioken && !showPetInfo) {
            updatePet = false;
            aa.a("updatePet", 0);
         }

         if (autoBuff) {
            var25 = var14;
         } else {
            var25 = 0;
         }

         aa.a("autoBuff", var25);
         if (autoBuff) {
            var26 = "Ativado";
         } else {
            var26 = "Desligado";
         }

         pasta.a.onChat(var26 + " Buff Automaticamente o Dicipolo");
         break;
      case 19:
         if (usePeaToBuff) {
            var17 = false;
         } else {
            var17 = true;
         }

         usePeaToBuff = var17;
         if (usePeaToBuff) {
            var25 = var4;
         } else {
            var25 = 0;
         }

         aa.a("usePeaToBuff", var25);
         if (usePeaToBuff) {
            var26 = "Ativado";
         } else {
            var26 = "Desligado";
         }

         pasta.a.onChat(var26 + " Use feijões mágicos para buffar");
         break;
      case 20:
         if (a) {
            a = false;
         }

         if (E) {
            E = false;
         }

         if (kaioken) {
            kaioken = false;
            aa.a("kaioken", 0);
         }

         if (p) {
            p = false;
         }

         var17 = var22;
         if (x) {
            var17 = false;
         }

         x = var17;
         if (x) {
            var26 = "Ativado";
         } else {
            var26 = "Desligado";
         }

         pasta.a.onChat(var26 + " Você agora irar evitar os super monstros");
         break;
      case 21:
         if (a) {
            a = false;
         }

         if (E) {
            E = false;
         }

         if (x) {
            x = false;
         }

         if (!updatePet) {
            updatePet = true;
            aa.a("updatePet", 1);
         }

         if (kaioken) {
            var17 = false;
         } else {
            var17 = true;
         }

         kaioken = var17;
         if (!autoBuff && !kaioken && !showPetInfo) {
            updatePet = false;
            aa.a("updatePet", 0);
         }

         if (kaioken) {
            var25 = var11;
         } else {
            var25 = 0;
         }

         aa.a("kaioken", var25);
         if (kaioken) {
            var26 = "Ativado";
         } else {
            var26 = "Desligado";
         }

         pasta.a.onChat(var26 + " Ficará pulando para evitar Kaioken");
      case 22:
      default:
         break;
      case 23:
         this.onCancelChat();
         break;
      case 24:
         if (!updatePet) {
            updatePet = true;
            aa.a("updatePet", 1);
         }

         if (showPetInfo) {
            var17 = false;
         } else {
            var17 = true;
         }

         showPetInfo = var17;
         if (!autoBuff && !kaioken && !showPetInfo) {
            updatePet = false;
            aa.a("updatePet", 0);
         }

         if (showPetInfo) {
            var26 = "O status próprio será agora substituído pelo status de discípulo.  Ativado";
         } else {
            var26 = "Desligado";
         }

         main.a.checkInfo(var26 + " mostrar informações do dicipolo");
         if (showPetInfo) {
            var25 = var7;
         } else {
            var25 = 0;
         }

         aa.a("showPetInfo", var25);
         break;
      case 25:
         var1 = (Integer)var2;
         byte[] var29 = a;
         byte var27;
         if (a[var1] != -1) {
            var27 = -1;
         } else if (main.a.e) {
            var27 = GameSrc.b[var1].a.a;
         } else {
            var27 = GameSrc.a[var1].a.a;
         }

         var29[var1] = var27;
         if (a[var1] != -1) {
            var26 = "Ativado";
         } else {
            var26 = "Desligado";
         }

         var30 = (new StringBuffer(String.valueOf(var26))).append(" Usar Movimentos Automaticamente ");
         if (main.a.e) {
            var26 = GameSrc.b[var1].a.a;
         } else {
            var26 = GameSrc.a[var1].a.a;
         }

         pasta.a.onChat(var30.append(var26).toString());
         break;
      case 26:
         pasta.f.a(pasta.f.b, "Insira a Velocidade de Execução (0 - 127)", 1);
         break;
      case 27:
         var23 = new MyVector("Feijão");
         var24 = new StringBuffer("Pedi\nFeijão Auto\n");
         if (autoInsist) {
            var26 = "Desligar";
         } else {
            var26 = "Ligar";
         }

         var23.addElement(new cd(var24.append(var26).toString(), this, 28, (Object)null));
         var24 = new StringBuffer("Doar feijão\nAuto\n");
         if (autoGive) {
            var26 = "Desligar";
         } else {
            var26 = "Ligar";
         }

         var23.addElement(new cd(var24.append(var26).toString(), this, 29, (Object)null));
         var24 = new StringBuffer("Coleta feijão\nAuto\n");
         if (autoReap) {
            var26 = "Desligar";
         } else {
            var26 = "Ligar";
         }

         var23.addElement(new cd(var24.append(var26).toString(), this, 30, (Object)null));
         var24 = new StringBuffer("Coleta Feijão\nCom Auto treino\n");
         if (useTDLTReap) {
            var26 = "Desligar";
         } else {
            var26 = "Ligar";
         }

         var23.addElement(new cd(var24.append(var26).toString(), this, 31, (Object)null));
         main.a.a.b(var23);
         break;
      case 28:
         if (autoInsist) {
            var17 = false;
         } else {
            var17 = true;
         }

         autoInsist = var17;
         if (autoInsist) {
            var26 = "ativado";
         } else {
            var26 = "Desligado";
         }

         pasta.a.onChat(var26 + " Pedindo feijão auto");
         if (autoInsist) {
            var25 = var12;
         } else {
            var25 = 0;
         }

         aa.a("autoInsist", var25);
         break;
      case 29:
         if (autoGive) {
            var17 = false;
         } else {
            var17 = true;
         }

         autoGive = var17;
         if (autoGive) {
            var26 = "Ativado";
         } else {
            var26 = "Desligado";
         }

         pasta.a.onChat(var26 + " Passar automaticamente ");
         if (autoGive) {
            var25 = var8;
         } else {
            var25 = 0;
         }

         aa.a("autoGive", var25);
         break;
      case 30:
         if (autoReap) {
            var17 = false;
         } else {
            var17 = true;
         }

         autoReap = var17;
         if (autoReap) {
            var26 = "Esta função só funciona em ambientes internos. Ativada";
         } else {
            var26 = "Desligado";
         }

         main.a.checkInfo(var26 + " Colher Feijão Automaticamente ");
         if (autoReap) {
            var25 = var13;
         } else {
            var25 = 0;
         }

         aa.a("autoReap", var25);
         break;
      case 31:
         if (useTDLTReap) {
            var17 = false;
         } else {
            var17 = true;
         }

         useTDLTReap = var17;
         if (useTDLTReap) {
            var26 = "Esta função só funciona quando o inventário está vazio, possui TDLT e ainda é válido (acima de 0 minutos). Habilitou o uso automático de TDLT para colher grãos";
         } else {
            var26 = "Desligado";
         }

         main.a.checkInfo(var26 + " Usar auto treino para coleta Feijão");
         if (useTDLTReap) {
            var25 = var6;
         } else {
            var25 = 0;
         }

         aa.a("useTDLTReap", var25);
         break;
      case 32:
         if (autoPick) {
            autoPick = false;
            aa.a("autoPick", 0);
         }

         if (instance != 27L) {
            instance = 27L;
         }

         if (H) {
            H = false;
         }

         if (!D) {
            var17 = true;
         }

         D = var17;
         if (D) {
            var26 = "Ativado";
         } else {
            var26 = "Desligado";
         }

         main.a.checkInfo(var26 + " carregar Yardrat automaticamente ");
         break;
      case 33:
         pasta.f.a(pasta.f.c, "Insira a distância (0 - 127)", 1);
         break;
      case 34:
         if (E) {
            E = false;
            pasta.a.onChat("fusão automática desativada");
         } else {
            MyVector var28 = new MyVector("Opcões");
            var28.addElement(new cd("Para discípulos\nir para casa", this, 35, (Object)null));
            var28.addElement(new cd("Para discípulos\nproteger", this, 36, (Object)null));
            main.a.a.b(var28);
         }
         break;
      case 35:
         if (x) {
            x = false;
         }

         if (kaioken) {
            kaioken = false;
            aa.a("kaioken", 0);
         }

         if (!autoBuff && !kaioken && !showPetInfo) {
            updatePet = false;
            aa.a("updatePet", 0);
         }

         F = true;
         E = true;
         pasta.a.onChat("Habilitado o uso automático de brincos e enviado o discípulo para casa");
         break;
      case 36:
         if (x) {
            x = false;
         }

         if (kaioken) {
            kaioken = false;
            aa.a("kaioken", 0);
         }

         if (!autoBuff && !kaioken && !showPetInfo) {
            updatePet = false;
            aa.a("updatePet", 0);
         }

         F = false;
         E = true;
         pasta.a.onChat("fusão automática ativada");
         break;
      case 37:
         if (G) {
            var17 = var18;
         } else {
            var17 = true;
         }

         G = var17;
         if (G) {
            var26 = "Ativado";
         } else {
            var26 = "Desligado";
         }

         pasta.a.onChat(var26 + " ,levantar automaticamente uma bandeira negra contra PK");
         break;
      case 38:
         if (D) {
            D = false;
         }

         if (H) {
            var17 = var19;
         } else {
            var17 = true;
         }

         H = var17;
         if (H) {
            var26 = "Ativada";
         } else {
            var26 = "Desligado";
         }

         pasta.a.onChat(var26 + " Reprodução automática");
      }

   }
}
