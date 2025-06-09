package pasta;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import main.GameMidlet;

public abstract class cf extends Canvas implements Runnable {
   public static boolean a;

   public cf() {
      this.setFullScreenMode(true);
      int var1 = super.getWidth();
      int var2 = super.getHeight();
      if (var1 * var2 >= 2073600) {
         dm.a = 4;
      } else if (var1 * var2 >= 691200) {
         dm.a = 3;
      } else if (var1 * var2 > 153600) {
         dm.a = 2;
      } else {
         dm.a = 1;
      }

   }

   public static void a(GameMidlet var0) {
      Display.getDisplay(var0).setCurrent(main.a.a);
   }

   public final int a() {
      int var1 = super.getWidth();
      int var2 = var1 / dm.a;
      byte var3;
      if (var1 % dm.a == 0) {
         var3 = 0;
      } else {
         var3 = 1;
      }

      return var3 + var2;
   }

   protected abstract void a();

   public final int b() {
      int var1 = super.getHeight();
      int var2 = var1 / dm.a;
      byte var3;
      if (var1 % dm.a == 0) {
         var3 = 0;
      } else {
         var3 = 1;
      }

      return var3 + var2;
   }

   protected abstract void c(int var1, int var2);

   public int getHeight() {
      return super.getHeight();
   }

   public int getWidth() {
      return super.getWidth();
   }

   protected final void pointerDragged(int var1, int var2) {
      this.transMap(var1 / dm.a, var2 / dm.a);
   }

   protected final void pointerPressed(int var1, int var2) {
      this.teleTo(var1 / dm.a, var2 / dm.a);
   }

   protected final void pointerReleased(int var1, int var2) {
      this.c(var1 / dm.a, var2 / dm.a);
   }

   public void run() {
      try {
         Thread.sleep(100L);
      } catch (Exception var6) {
      }

      a = true;

      while(a) {
         gameFunc.b();
         long var1 = System.currentTimeMillis();
         this.a();
         this.repaint();
         this.serviceRepaints();
         var1 = System.currentTimeMillis() - var1;

         try {
            if (var1 < gameFunc.instance) {
               while(true) {
                  long var3 = System.currentTimeMillis();
                  Thread.sleep(gameFunc.instance - var1);
                  if (System.currentTimeMillis() - var3 >= gameFunc.instance - var1) {
                     break;
                  }
               }
            } else {
               Thread.sleep(1L);
            }
         } catch (Exception var7) {
            var7.printStackTrace();
         }
      }

   }

   protected abstract void teleTo(int var1, int var2);

   protected abstract void transMap(int var1, int var2);
}
