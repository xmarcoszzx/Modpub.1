package pasta;

import java.io.PrintStream;
import java.util.Hashtable;

public final class eh extends Hashtable {
   private String a;

   public eh(String var1) {
      this.a = var1;
   }

   public final void clear() {
      synchronized(this){}

      try {
         super.clear();
      } finally {
         ;
      }

   }

   public final Object put(Object var1, Object var2) {
      synchronized(this){}

      try {
         if (this.size() > 1000) {
            PrintStream var3 = System.out;
            StringBuffer var4 = new StringBuffer("HASSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS name= ");
            var3.println(var4.append(this.a).toString());
         }

         var1 = super.put(var1, var2);
      } finally {
         ;
      }

      return var1;
   }

   public final Object remove(Object var1) {
      synchronized(this){}

      try {
         var1 = super.remove(var1);
      } finally {
         ;
      }

      return var1;
   }
}
