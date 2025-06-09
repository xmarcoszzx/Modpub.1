package pasta;

public final class ItemTemplate {
   public int a;
   public String a;
   public boolean a;
   public byte b;
   public String b;
   public short b;
   public short c;
   public short templateId;
   public byte type;

   public ItemTemplate(short var1, byte var2, byte var3, String var4, String var5, int var6, short var7, short var8, boolean var9) {
      this.templateId = var1;
      this.type = var2;
      this.b = var3;
      this.a = var4;
      this.a = cq.a(this.a);
      this.b = var5;
      this.b = cq.a(this.b);
      this.a = var6;
      this.b = var7;
      this.c = var8;
      this.a = var9;
   }
}
