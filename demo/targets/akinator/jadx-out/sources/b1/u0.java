package b1;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u0 extends t0 implements Iterator, lv.c {
    public u0(i0 i0Var, Iterator<? extends Map.Entry<Object, Object>> it) {
        super(i0Var, it);
    }

    @Override // java.util.Iterator
    public Object next() {
        Map.Entry entry = this.f8689g;
        if (entry == null) {
            throw new IllegalStateException();
        }
        a();
        return entry.getKey();
    }
}
