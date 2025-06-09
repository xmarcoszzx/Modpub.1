package pasta;

final class bi implements Runnable {
   private int a;
   private final String a;
   final at a;

   bi(at var1, String var2, int var3) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
   }

   public final void run() {
      at.e = false;
      (new Thread(new de(this))).start();
      this.a.c = true;
      this.a.b = true;

      try {
         String var2 = this.a;
         int var1 = this.a;
         at var4 = this.a;
         ad var3 = new ad(var2, var1);
         at.a(var4, var3);
         at.a(this.a, at.a(this.a).a());
         this.a.a = at.a(this.a).a();
         Thread var7 = new Thread(at.a(this.a));
         var7.start();
         var4 = this.a;
         eg var8 = new eg(this.a);
         Thread var10 = new Thread(var8);
         var4.a = var10;
         this.a.a.start();
         this.a.a = System.currentTimeMillis();
         at var9 = this.a;
         Message var11 = new Message((byte)-27);
         at.a(var9, var11);
         this.a.c = false;
         this.a.a.a(this.a.a);
      } catch (Exception var6) {
         try {
            Thread.sleep(500L);
         } catch (InterruptedException var5) {
         }

         if (at.e) {
         }
      }

   }
}
