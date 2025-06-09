package pasta;

import javax.microedition.io.ConnectionNotFoundException;
import main.GameMidlet;

public final class h extends ag implements ah {
   public static h a;
   private int a;
   private bf a;
   private String[] a;
   private int b;
   private bf b;
   private int c;
   private int d;
   private int i;

   public h() {
      this.c = main.a.i - 20;
      if (this.c > 320) {
         this.c = 320;
      }

      this.a = cg.g.a(ab.aH, this.c - 20);
      this.a = (main.a.i - this.c) / 2;
      this.b = main.a.j - 150 - (this.a.length - 1) * 20;
      this.d = (this.a.length - 1) * 20 + 110;
      this.a = new bf();
      this.a.b = ab.aF;
      this.a.a = this.a + 10;
      this.a.b = this.b + 35 + (this.a.length - 1) * 20;
      this.a.c = this.c - 20;
      this.a.d = ag.e + 2;
      if (main.a.e) {
         this.a.a = false;
      } else {
         this.a.a = true;
      }

      this.a.goToMap(0);
      if (!main.a.e) {
         super.c = this.a.a;
      }

      this.b = new bf();
      this.b.b = ab.aG;
      this.b.a = this.a + 10;
      this.b.b = this.a.b + 35;
      this.b.c = this.c - 20;
      this.b.d = ag.e + 2;
      this.b.a = false;
      this.b.goToMap(0);
      super.a = new cd(ab.aO, this, 1, (Object)null);
      super.b = new cd(ab.aI, this, 2, (Object)null);
      if (main.a.e) {
         super.b.b = main.a.i / 2 + 18;
         super.a.b = main.a.i / 2 - 85;
         cd var2 = super.b;
         cd var3 = super.a;
         int var1 = this.b + this.d + 5;
         var3.c = var1;
         var2.c = var1;
      }

   }

   public static h a() {
      if (a == null) {
         a = new h();
      }

      return a;
   }

   public final void a() {
      this.i = 0;

      try {
         if (ab.a == 0) {
            GameMidlet.e.platformRequest("http://ngocrongonline.com/");
         }

         if (ab.a == 2) {
            GameMidlet.e.platformRequest("http://dragonball.indonaga.com/");
         }

         if (ab.a == 1) {
            GameMidlet.e.platformRequest("http://world.teamobi.com/games-page-0.html");
         }
      } catch (ConnectionNotFoundException var2) {
         var2.printStackTrace();
      }

   }

   public final void a(int var1) {
      if (this.a.a) {
         this.a.a(var1);
      } else if (this.b.a) {
         this.b.a(var1);
      }

      super.a(var1);
   }

   public final void a(int var1, Object var2) {
      if (var1 == 1) {
         GameSrc.a.a();
         a = null;
      }

      if (var1 == 2) {
         if (this.a.a() != null && !this.a.a().equals("")) {
            if (this.b.a() != null && !this.b.a().equals("")) {
               av.a().a(this.a.a(), this.b.a());
               GameSrc.a.a();
               a = null;
            } else {
               main.a.checkInfo(ab.aK);
            }
         } else {
            main.a.checkInfo(ab.aJ);
         }
      }

   }

   public final void a(dm var1) {
      GameSrc.a().a(var1);
      ar.a(var1, this.a, this.b, this.c, this.d, -1, true);

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         cg.g.a(var1, this.a[var2], main.a.i / 2, this.b + 15 + var2 * 20, 2);
      }

      this.a.a(var1);
      this.b.a(var1);
      super.a(var1);
   }

   public final void b() {
      GameSrc.a().b();
      this.a.c();
      this.b.c();
   }

   public final void c() {
      if (main.a.a[2]) {
         --this.i;
         if (this.i < 0) {
            this.i = 1;
         }
      } else if (main.a.a[8]) {
         ++this.i;
         if (this.i > 1) {
            this.i = 1;
         }
      }

      if (main.a.a[2] || main.a.a[8]) {
         main.a.onCancelChat();
         if (this.i == 1) {
            this.a.a = false;
            this.b.a = true;
            if (!main.a.e) {
               super.c = this.b.a;
            }
         } else if (this.i == 0) {
            this.a.a = true;
            this.b.a = false;
            if (!main.a.e) {
               super.c = this.a.a;
            }
         } else {
            this.a.a = false;
            this.b.a = false;
         }
      }

      if (main.a.j) {
         if (main.a.a(this.a.a, this.a.b, this.a.c, this.a.d)) {
            this.i = 0;
         } else if (main.a.a(this.b.a, this.b.b, this.b.c, this.b.d)) {
            this.i = 1;
         }
      }

      super.c();
      main.a.onCancelChat();
   }
}
