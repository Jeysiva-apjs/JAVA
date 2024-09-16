import java.util.ArrayList;

public class ModArrayList<E> extends ArrayList<E>{

    public E getUsingMod(int idx){ 
        idx = Math.abs(idx) %  this.size();
        return this.get(idx);
    }

}
