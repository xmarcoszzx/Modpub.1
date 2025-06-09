package pasta;

public abstract class eb {
   public cd a;
   public cd b;
   public cd c;

   public void a(int var1) {
      switch(var1) {
      case -39:
      case -2:
         main.a.b[8] = true;
         main.a.a[8] = true;
         break;
      case -38:
      case -1:
         main.a.b[2] = true;
         main.a.a[2] = true;
         break;
      case -22:
      case -7:
         main.a.b[13] = true;
         main.a.a[13] = true;
         break;
      case -21:
      case -6:
         main.a.b[12] = true;
         main.a.a[12] = true;
         break;
      case -5:
      case 10:
         main.a.b[5] = true;
         main.a.a[5] = true;
      }

   }

   public void a(dm var1) {
      var1.a(-var1.a(), -var1.b());
      var1.f(0, 0, main.a.i, main.a.j);
      bw.a(var1, this.a, this.b, this.c);
   }

   public void b() {
      if (this.b != null && (main.a.a[5] || ag.a(this.b))) {
         main.a.a[5] = false;
         main.a.i = false;
         ag.h = -1;
         main.a.j = false;
         if (this.b != null) {
            this.b.a();
         }

         ag.h = -1;
      }

      if (this.a != null && (main.a.a[12] || ag.a(this.a))) {
         main.a.a[12] = false;
         main.a.i = false;
         ag.h = -1;
         main.a.j = false;
         if (this.a != null) {
            this.a.a();
         }

         ag.h = -1;
      }

      if (this.c != null && (main.a.a[13] || ag.a(this.c))) {
         main.a.a[13] = false;
         main.a.i = false;
         main.a.j = false;
         ag.h = -1;
         if (this.c != null) {
            this.c.a();
         }

         ag.h = -1;
      }

      main.a.onCancelChat();
      main.a.e();
   }
}
