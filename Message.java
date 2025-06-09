package pasta;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class Message {
   public byte a;
   private ByteArrayInputStream a = null;
   private ByteArrayOutputStream a = null;
   private DataInputStream a = null;
   private DataOutputStream a = null;

   public Message() {
   }

   public Message(byte var1) {
      this.a = var1;
      this.a = new ByteArrayOutputStream(1024);
      this.a = new DataOutputStream(this.a);
   }

   public Message(byte var1, byte[] var2) {
      this.a = var1;
      this.a = new ByteArrayInputStream(var2);
      this.a = new DataInputStream(this.a);
   }

   public final int a() {
      return this.a.readInt();
   }

   public final DataInputStream a() {
      return this.a;
   }

   public final DataOutputStream a() {
      return this.a;
   }

   public final void a() {
      try {
         if (this.a != null) {
            this.a.close();
         }

         if (this.a != null) {
            this.a.close();
         }
      } catch (IOException var2) {
      }

   }

   public final byte[] a() {
      return this.a.toByteArray();
   }
}
