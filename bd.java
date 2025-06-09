package pasta;

public final class bd implements ah {
   public static MyVector a = new MyVector("v Message");
   public byte a;
   public int a;
   public long a;
   public String a;
   public String[] a;
   public byte b;
   public int b;
   public String[] b;
   public int c;
   public int d;
   public int e;
   private int f;

   public static void a(bd var0, int var1, boolean var2) {
      int var3 = 0;

      while(true) {
         if (var3 >= a.size()) {
            if (var1 == -1) {
               a.addElement(var0);
            } else {
               a.insertElementAt(var0, 0);
            }

            if (a.size() > 20) {
               a.removeElementAt(a.size() - 1);
            }
            break;
         }

         bd var4 = (bd)a.elementAt(var3);
         if (var4.a == var0.a) {
            a.removeElement(var4);
            if (!var2) {
               a.insertElementAt(var0, var3);
            } else {
               a.insertElementAt(var0, 0);
            }
            break;
         }

         if (var4.e != 0 && var4.d == var4.e) {
            a.removeElement(var4);
         }

         ++var3;
      }

   }

   public final void a() {
      if (this.a != 0L) {
         this.f = (int)(System.currentTimeMillis() / 1000L - this.a);
      }

   }

   public final void a(int var1, Object var2) {
   }

   public final void a(dm var1, int var2, int var3) {
      cg var4 = cg.f;
      if (this.b == 0) {
         var4 = cg.a;
      } else if (this.b == 1) {
         var4 = cg.h;
      } else if (this.b == 2) {
         var4 = cg.g;
      }

      if (this.b == 0) {
         var4.a(var1, this.a, var2 + 3, var3 + 1, 0);
         String var5;
         StringBuffer var6;
         cg var7;
         if (this.a == 0) {
            var7 = cg.o;
            var6 = new StringBuffer(String.valueOf(this.a[0]));
            if (this.a.length > 1) {
               var5 = "...";
            } else {
               var5 = "";
            }

            var7.a(var1, var6.append(var5).toString(), var2 + 3, var3 + 11, 0);
         } else {
            var7 = cg.p;
            var6 = new StringBuffer(String.valueOf(this.a[0]));
            if (this.a.length > 1) {
               var5 = "...";
            } else {
               var5 = "";
            }

            var7.a(var1, var6.append(var5).toString(), var2 + 3, var3 + 11, 0);
         }

         cg.o.a(var1, o.c(this.f) + " " + ab.cR, main.a.a.q + var2 - 3, var3 + 1, 1);
      }

      if (this.b == 1) {
         var4.a(var1, this.a + " (" + this.d + "/" + this.e + ")", var2 + 3, var3 + 1, 0);
         cg.q.a(var1, ab.co + " " + o.c(this.f) + " " + ab.cR, var2 + 3, var3 + 11, 0);
      }

      if (this.b == 2) {
         var4.a(var1, this.a, var2 + 3, var3 + 1, 0);
         cg.q.a(var1, ab.cI, var2 + 3, var3 + 11, 0);
      }

   }
}
