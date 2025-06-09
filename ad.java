package pasta;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class ad {
   private SocketConnection a;

   public ad(String var1, int var2) {
      try {
         StringBuffer var3 = new StringBuffer("socket://");
         this.a = (SocketConnection)Connector.open(var3.append(var1).append(":").append(var2).toString());
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }

   public final DataInputStream a() {
      DataInputStream var1;
      try {
         var1 = this.a.openDataInputStream();
      } catch (IOException var2) {
         var2.printStackTrace();
         var1 = null;
      }

      return var1;
   }

   public final DataOutputStream a() {
      DataOutputStream var1;
      try {
         var1 = this.a.openDataOutputStream();
      } catch (IOException var2) {
         var2.printStackTrace();
         var1 = null;
      }

      return var1;
   }

   public final void a() {
      try {
         this.a.close();
      } catch (IOException var2) {
         var2.printStackTrace();
      }

   }
}
