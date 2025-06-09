package pasta;

public final class SaleItens implements Runnable {
   public static boolean sellDone;

   public final void run() {
      for(int var1 = Char.myCharz().arrItemBag.length - 1; var1 >= 0; --var1) {
         Item var2 = Char.myCharz().arrItemBag[var1];
         if (var2 != null && var2.itemTemplate.type <= 4 && var2.a.length <= 2) {
            e.a((byte)0, (byte)1, (short)var2.b);
            e.a((byte)1, (byte)1, (short)var2.b);

            try {
               Thread.sleep(1000L);
            } catch (InterruptedException var3) {
            }
         }
      }

      sellDone = true;
      if (TileMap.mapId != gameFunc.i) {
         gameFunc.goToMap(gameFunc.i);
      }

   }
}
