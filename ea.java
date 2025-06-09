package pasta;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import main.GameMidlet;

final class ea implements CommandListener {
   private final TextBox a;
   private bf a;

   ea(bf var1, TextBox var2) {
      this.a = var1;
      this.a = var2;
   }

   public final void commandAction(Command var1, Displayable var2) {
      boolean var4 = false;
      boolean var3 = var4;
      if (var1.getLabel().equals(ab.aX)) {
         this.a.checkInfo(this.a.getString());
         var3 = var4;
         if (!this.a.getString().equals("")) {
            var3 = true;
         }
      }

      cf.a(GameMidlet.e);
      main.a.a.setFullScreenMode(true);
      this.a.c = true;
      if (!var3) {
         f.a();
      }

   }
}
