package yw;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class r0 extends ArrayList {
    public r0(int i10) {
        super(i10);
    }

    public Object bottom() {
        if (size() <= 0) {
            return null;
        }
        return get(0);
    }

    public Object pop() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return remove(size - 1);
    }

    public Object push(Object obj) {
        add(obj);
        return obj;
    }

    public Object top() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return get(size - 1);
    }
}
