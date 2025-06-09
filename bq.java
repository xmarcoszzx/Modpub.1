package pasta;

public final class bq implements ah {
   private static bq a;
   private int a;
   private long a = 0L;
   public String a;
   public az a;
   public bf a;
   public cd a;
   public boolean a = false;
   private int b;
   public String b;
   public cd b;
   private int c;
   public cd c = null;
   private int d;

   public bq() {
      this.b = ab.aV + " ";
      this.a = new bf();
      this.a.b = ab.aV;
      this.a.c = main.a.i - 32;
      if (this.a.c > 250) {
         this.a.c = 250;
      }

      this.a.d = ag.e + 2;
      this.a.a = main.a.i / 2 - this.a.c / 2;
      this.a.a = true;
      this.a.a(80);
   }

   public static bq a() {
      bq var0;
      if (a == null) {
         var0 = new bq();
         a = var0;
      } else {
         var0 = a;
      }

      return var0;
   }

   public final void a() {
      this.a = new cd(ab.aX, this, 8000, 1, main.a.j - ag.g + 1);
      this.b = new cd(ab.aP, this, 8001, main.a.i - 70, main.a.j - ag.g + 1);
      this.c = null;
      this.c = this.a.c + 28;
      this.d = this.a.d + 26;
      this.a = main.a.i / 2 - this.c / 2;
      this.b = this.a.b - 18;
      if (this.c > 320) {
         this.c = 320;
      }

      this.a.b = this.a;
      this.b.b = this.a + this.c - 68;
      if (main.a.e) {
         bf var1 = this.a;
         var1.b -= 5;
         this.b -= 20;
         this.d += 30;
         this.a.b = main.a.i / 2 - 68 - 5;
         this.b.b = main.a.i / 2 + 5;
         this.a.c = main.a.j - 30;
         this.b.c = main.a.j - 30;
      }

   }

   public final void a(int var1) {
      if (this.a) {
         this.a.a(var1);
      }

      if (this.a.a().equals("")) {
         this.b.a = ab.aO;
      } else {
         this.b.a = ab.aP;
      }

   }

   public final void a(int var1, Object var2) {
      switch(var1) {
      case 8000:
         if (this.a != null) {
            long var3 = System.currentTimeMillis();
            if (var3 - this.a >= 1000L) {
               this.a = var3;
               this.a.onChatFromMe(this.a.a(), this.a);
               this.a.checkInfo("");
               this.b.a = ab.aO;
            }
         }
         break;
      case 8001:
         if (this.a.a().equals("")) {
            this.a = false;
            this.a.onCancelChat();
         }

         this.a.b();
      }

   }

   public final void a(int var1, az var2, String var3) {
      this.b.a = ab.aO;
      this.a = var3;
      this.a.a(var1);
      if (!this.a.a().equals("") && main.a.a == null) {
         this.a = var2;
         this.a = true;
      }

   }

   public final void a(dm var1) {
      if (this.a && dz.a != 5 && dz.a != 3) {
         ar.a(var1, this.a, this.b, this.c, this.d, -1, true);
         cg var5 = cg.g;
         String var6 = this.b + this.a;
         int var3 = this.a.a;
         int var4 = this.a.b;
         byte var2;
         if (main.a.e) {
            var2 = 17;
         } else {
            var2 = 12;
         }

         var5.a(var1, var6, var3, var4 - var2, 0);
         bw.a(var1, this.a, (cd)null, this.b);
         this.a.a(var1);
      }

   }

   public final void b() {
      if (this.a) {
         if (dz.a != 5 && dz.a != 3) {
            this.a.c();
         }

         if (this.a.c) {
            this.a.c = false;
            this.a.onChatFromMe(this.a.a(), this.a);
            this.a.checkInfo("");
            this.b.a = ab.aO;
         }
      }

   }

   public final void checkInfo(String var1) {
      this.b.a = ab.aO;
      this.a = var1;
      if (main.a.a == null) {
         this.a = true;
         if (main.a.e) {
            this.a.a();
         }
      }

   }
}
