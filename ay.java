package pasta;

public final class ay implements ah {
   public ar a;
   public short a;
   public boolean a;
   public short b;
   public boolean b;
   public short c;
   public short d;

   public ay(short var1, short var2, short var3, short var4, boolean var5, boolean var6, String var7) {
      byte var8 = 24;
      super();
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      var7 = cq.a(var7);
      this.a = var5;
      this.b = var6;
      if ((TileMap.mapId != 21 && TileMap.mapId != 22 && TileMap.mapId != 23 || this.a < 0 || this.a > 24) && ((TileMap.mapId != 0 || Char.myCharz().k == 0) && (TileMap.mapId != 7 || Char.myCharz().k == 1) && (TileMap.mapId != 14 || Char.myCharz().k == 2) || !var6)) {
         int var9;
         if (!TileMap.c() && TileMap.mapId != 47) {
            if (!var5 && !var6) {
               this.a = new ar(var7, var1, var2 - 24);
               this.a.a = new cd((String)null, this, 1, this);
               this.a.a = true;
               this.a.b = false;
               ar.a(this.a);
            } else {
               if (TileMap.a()) {
                  this.a = new ar(var7, var1, var2 - 16);
               } else {
                  var9 = (var3 - var1) / 2;
                  byte var10;
                  if (var2 != 0) {
                     var10 = 16;
                  } else {
                     var10 = -32;
                  }

                  this.a = new ar(var7, var9 + var1, var2 - var10);
               }

               this.a.a = new cd((String)null, this, 2, this);
               this.a.a = true;
               this.a.b = false;
               ar.a(this.a);
            }

            TileMap.a.addElement(this);
         } else if (var2 <= 150 || !TileMap.c()) {
            var9 = (var3 - var1) / 2;
            if (var1 <= 100) {
               var8 = 48;
            }

            this.a = new ar(var7, var9 + var1, var4 - var8);
            this.a.a = new cd((String)null, this, 1, this);
            this.a.a = true;
            this.a.b = false;
            ar.a(this.a);
            TileMap.a.addElement(this);
         }
      }

   }

   public final void a(int var1, Object var2) {
      byte var3 = -1;
      byte var6;
      Char var7;
      switch(var1) {
      case 1:
         int var8 = (this.a + this.c) / 2;
         var1 = this.d;
         if (this.d > this.b + 24) {
            var1 = (this.b + this.d) / 2;
         }

         GameSrc.a().z = 0;
         Char.myCharz().a = new ck(var8, var1);
         var7 = Char.myCharz();
         if (Char.myCharz().b - Char.myCharz().a.a > 0) {
            var6 = -1;
         } else {
            var6 = 1;
         }

         var7.i = var6;
         av.a().g();
         break;
      case 2:
         GameSrc.a().z = 0;
         if (Char.myCharz().a() != null) {
            av.a().g();
            pasta.a.e();
            av.a().p();
            Char.u = true;
         } else if (Char.myCharz().b() != null) {
            av.a().g();
            av.a().f();
            Char.v = true;
            Char.u = true;
            main.a.e();
            main.a.onCancelChat();
            pasta.a.e();
         } else {
            int var4 = (this.a + this.c) / 2;
            short var5 = this.d;
            Char.myCharz().a = new ck(var4, var5);
            var7 = Char.myCharz();
            if (Char.myCharz().b - Char.myCharz().a.a > 0) {
               var6 = var3;
            } else {
               var6 = 1;
            }

            var7.i = var6;
            Char.myCharz().b = new cd((String)null, this, 2, (Object)null);
         }
      }

   }
}
