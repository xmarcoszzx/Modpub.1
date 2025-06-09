package pasta;

public final class f {
   public static String a = "Độ trễ game";
   public static String b = "Tốc độ chạy";
   public static String c = "Phạm vi tấn công";

   public static void a() {
      if (bq.a().b.equals(a) || bq.a().b.equals(b) || bq.a().b.equals(c)) {
         bq.a().b = "Chat ";
         bq.a().a.b = "Chat";
         bq.a().a.goToMap(0);
      }

   }

   public static void a(String var0, String var1, int var2) {
      bq.a().b.a = ab.aO;
      bq.a().b = var0;
      bq.a().a.b = var1;
      bq.a().a = "";
      if (main.a.a == null) {
         bq.a().a = true;
         bq.a().a.goToMap(1);
         if (main.a.e) {
            bq.a().a.a();
         }
      }

   }

   public static boolean a(String var0) {
      boolean var2 = false;
      if (bq.a().b.equals(a)) {
         long var3 = Long.parseLong(var0);
         if (var3 >= 1L && var3 <= 100L) {
            gameFunc.instance = var3;
         } else {
            gameFunc.instance = 27L;
         }

         main.a.checkInfo("Độ trễ game (tỉ lệ nghịch với tốc độ game): " + gameFunc.instance);
         aa.a("gameDelay", (int)gameFunc.instance);
      } else {
         int var1;
         if (bq.a().b.equals(b)) {
            var1 = Integer.parseInt(var0);
            if (var1 >= 0 && var1 <= 127) {
               if (Char.myCharz().n == 1) {
                  Char.myCharz().n = var1;
               }

               gameFunc.cspeed = var1;
            } else {
               gameFunc.cspeed = 6;
            }

            if (var1 == 1) {
               main.a.checkInfo("Lưu ý: Hầu hết mọi chức năng đều không hoạt động khi tốc độ chạy bằng 1");
            } else {
               pasta.a.onChat("Tốc độ chạy: " + gameFunc.cspeed);
            }

            aa.a("cspeed", gameFunc.cspeed);
         } else {
            if (!bq.a().b.equals(c)) {
               return var2;
            }

            var1 = Integer.parseInt(var0);
            if (var1 >= 0 && var1 <= 127) {
               gameFunc.distanceAttack = var1;
            } else {
               gameFunc.distanceAttack = 100;
            }

            main.a.checkInfo("Phạm vi tấn công (không có hiệu lực với tự động đánh quái): " + gameFunc.distanceAttack);
            aa.a("distanceAttack", gameFunc.distanceAttack);
         }
      }

      bq.a().b = "Chat ";
      bq.a().a.b = "Chat";
      bq.a().a.goToMap(0);
      var2 = true;
      return var2;
   }
}
