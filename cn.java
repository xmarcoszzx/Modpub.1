package pasta;

public final class cn {
   public static eh a = new eh("item template");

   public static ItemTemplate a(short var0) {
      return (ItemTemplate)a.get(new Short(var0));
   }

   public static void a(ItemTemplate var0) {
      a.put(new Short(var0.templateId), var0);
   }
}
