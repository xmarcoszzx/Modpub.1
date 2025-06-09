package pasta;

import java.util.Vector;

final class ct implements Runnable {
   private final Vector a;
   private at a;

   public ct(at var1) {
      this.a = var1;
      this.a = new Vector();
   }

   static Vector a(ct var0) {
      return var0.a;
   }

   public final void a(Message var1) {
      this.a.addElement(var1);
   }

   public final void run() {
      while(this.a.b) {
         label38: {
            Exception var10000;
            label37: {
               boolean var10001;
               try {
                  if (!this.a.d) {
                     break label38;
                  }
               } catch (Exception var6) {
                  var10000 = var6;
                  var10001 = false;
                  break label37;
               }

               while(true) {
                  int var1;
                  try {
                     var1 = this.a.size();
                  } catch (Exception var5) {
                     var10000 = var5;
                     var10001 = false;
                     break;
                  }

                  if (var1 <= 0) {
                     break label38;
                  }

                  try {
                     Message var7 = (Message)this.a.elementAt(0);
                     this.a.removeElementAt(0);
                     at.a(this.a, var7);
                  } catch (Exception var4) {
                     var10000 = var4;
                     var10001 = false;
                     break;
                  }
               }
            }

            Exception var2 = var10000;
            var2.printStackTrace();
            continue;
         }

         try {
            Thread.sleep(10L);
         } catch (Exception var3) {
         }
      }

   }
}
