package vw;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class z2 extends ArrayList {
    public z2 build() {
        z2 z2Var = new z2();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            z2Var.register((x2) it.next());
        }
        return z2Var;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            x2 x2Var = (x2) it.next();
            if (x2Var != null && !x2Var.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public x2 lookup(int i10) {
        if (i10 <= size()) {
            return (x2) get(i10 - 1);
        }
        return null;
    }

    public void register(x2 x2Var) {
        int index = x2Var.getIndex();
        int size = size();
        for (int i10 = 0; i10 < index; i10++) {
            if (i10 >= size) {
                add(null);
            }
            int i11 = index - 1;
            if (i10 == i11) {
                set(i11, x2Var);
            }
        }
    }

    public x2 take() {
        while (!isEmpty()) {
            x2 x2Var = (x2) remove(0);
            if (!x2Var.isEmpty()) {
                return x2Var;
            }
        }
        return null;
    }
}
