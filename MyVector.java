package pasta;

import java.io.PrintStream;
import java.util.Vector;

public final class MyVector extends Vector {
   private String a;

   private MyVector() {
   }

   public MyVector(String var1) {
      this.a = var1;
   }

   public final void addElement(Object var1) {
      synchronized(this){}

      try {
         if (this.size() > 1000) {
            PrintStream var3 = System.out;
            StringBuffer var2 = new StringBuffer("||||||||||||||||||||||||||||||||||||||||||||");
            var3.println(var2.append(this.a).append(" num= ").append(this.size()).toString());
         }

         super.addElement(var1);
      } finally {
         ;
      }

   }

   public final void insertElementAt(Object var1, int var2) {
      synchronized(this){}

      try {
         if (this.size() > 1000) {
            PrintStream var4 = System.out;
            StringBuffer var3 = new StringBuffer("||||||||||||||||||||||||||||||||||||||||||||");
            var4.println(var3.append(this.a).append(" num= ").append(this.size()).toString());
         }

         super.insertElementAt(var1, var2);
      } finally {
         ;
      }

   }

   public final void removeAllElements() {
      synchronized(this){}

      try {
         super.removeAllElements();
      } finally {
         ;
      }

   }

   public final boolean removeElement(Object var1) {
      synchronized(this){}

      boolean var2;
      try {
         var2 = super.removeElement(var1);
      } finally {
         ;
      }

      return var2;
   }

   public final void removeElementAt(int var1) {
      synchronized(this){}

      try {
         super.removeElementAt(var1);
      } finally {
         ;
      }

   }
}
