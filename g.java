package pasta;

public final class g implements Runnable {
   public static int a;
   public static int[] a;

   public final void run() {
      for(int var1 = 0; var1 < a.length - 1; ++var1) {
         MyVector var10 = (MyVector)gameFunc.a.get(new Integer(a[var1]));

         for(int var2 = 0; var2 < var10.size(); ++var2) {
            a var9 = (a)var10.elementAt(var2);
            if (var9.c == a[var1 + 1]) {
               if (TileMap.a.size() == 0 || var9.d != -1 && GameSrc.g.size() == 0) {
                  try {
                     Thread.sleep(500L);
                  } catch (InterruptedException var12) {
                  }
               }

               long var5 = System.currentTimeMillis();
               gameFunc.transMap(var9.d, var9.b);

               while(TileMap.mapId != var9.c) {
                  if (gameFunc.d || !gameFunc.e && pasta.a.a()) {
                     gameFunc.c = false;
                     if (gameFunc.d) {
                        gameFunc.d = false;
                     }

                     return;
                  }

                  if (TileMap.mapId != a[var1]) {
                     gameFunc.goToMap(a);
                     return;
                  }

                  long var3 = var5;
                  if (pasta.a.b()) {
                     long var7 = System.currentTimeMillis();
                     short var14;
                     if (var9.d != -1) {
                        var14 = 1000;
                     } else {
                        var14 = 2000;
                     }

                     var3 = var5;
                     if (var7 - var5 > (long)var14) {
                        var3 = System.currentTimeMillis();
                        gameFunc.transMap(var9.d, var9.b);
                     }
                  }

                  try {
                     Thread.sleep(500L);
                  } catch (InterruptedException var13) {
                     var5 = var3;
                     continue;
                  }

                  var5 = var3;
               }

               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var11) {
               }
               break;
            }
         }
      }

      gameFunc.c = false;
      pasta.a.onChat("Đến nơi rồi");
   }
}
