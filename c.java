package pasta;

public final class c {
   private static String a = pasta.a.a("ɰʟʏʖʟʟɒɵʕʘʙɎɿʢʠ");
   private static String b = pasta.a.a("ɯʜʒʔɐʓℑʜɔɝɥʚʤʓʛʘʘʦ");

   public static void a(dm var0) {
      if (Char.myCharz().y && a() && Char.b().w != 0) {
         int var3 = Char.b().N * 61 / Char.b().h;
         int var2 = Char.b().t * 66 / Char.b().w;
         int var1 = Char.b().s * 59 / Char.b().x;
         var0.a(GameSrc.r, 58, 29, 0);
         var0.f(83, 31, var3, 10);
         var0.a(GameSrc.u, 83, 31, 0);
         var0.f(0, 0, main.a.i, main.a.j);
         var0.a(GameSrc.q, 0, 0, 0);
         var0.f(83, 5, var2, 10);
         var0.a(GameSrc.s, 83, 5, 0);
         var0.f(0, 0, main.a.i, main.a.j);
         var0.f(83, 20, var1, 6);
         var0.a(GameSrc.t, 83, 20, 0);
         var0.f(0, 0, main.a.i, main.a.j);
         if (main.a.g % 300 > 150) {
            cg.m.a(var0, "Đệ tử", 42, 9, 2);
            cg.m.a(var0, o.a(Char.b().a), 42, 22, 2);
         } else {
            cg.m.a(var0, "Tiềm năng", 42, 9, 2);
            cg.m.a(var0, o.a(Char.b().b), 42, 22, 2);
         }
      }

      if (!GameSrc.a && !main.a.q) {
         if (main.a.i > 250) {
            var0.a(main.a.a, 160, 6, 0);
            cg.s.a(var0, a, 180, 3, 0);
            cg.s.a(var0, b, 180, 14, 0);
         } else {
            var0.a(main.a.a, 5, main.a.j - 67, 0);
            cg.s.a(var0, a, 25, main.a.j - 70, 0);
            cg.s.a(var0, b, 25, main.a.j - 59, 0);
         }
      }

   }

   public static boolean a() {
      boolean var0;
      if (gameFunc.showPetInfo && !GameSrc.a().g) {
         var0 = true;
      } else {
         var0 = false;
      }

      return var0;
   }

   public static void b(dm var0) {
      String var1;
      if (gameFunc.g) {
         cg var3 = cg.s;
         StringBuffer var2 = new StringBuffer("Đang chờ bảo trì");
         if (main.a.g % 80 < 20) {
            var1 = "";
         } else if (main.a.g % 80 < 40) {
            var1 = ".";
         } else if (main.a.g % 80 < 60) {
            var1 = "..";
         } else {
            var1 = "...";
         }

         var3.a(var0, var2.append(var1).toString(), 2, 2, 0, cg.o);
      } else if (gameFunc.h) {
         cg var4 = cg.s;
         StringBuffer var5 = new StringBuffer("Đang chờ kết nối");
         if (main.a.g % 80 < 20) {
            var1 = "";
         } else if (main.a.g % 80 < 40) {
            var1 = ".";
         } else if (main.a.g % 80 < 60) {
            var1 = "..";
         } else {
            var1 = "...";
         }

         var4.a(var0, var5.append(var1).toString(), 2, 2, 0, cg.o);
      }

   }
}
