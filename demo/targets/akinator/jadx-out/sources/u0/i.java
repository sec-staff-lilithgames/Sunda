package u0;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i implements Iterator, lv.c {

    /* renamed from: b, reason: collision with root package name */
    public final g f87496b;

    public i(f fVar) {
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new y(this);
        }
        this.f87496b = new g(fVar, uVarArr);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f87496b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f87496b.remove();
    }

    public final void setValue(Object obj, Object obj2) {
        this.f87496b.setValue(obj, obj2);
    }

    @Override // java.util.Iterator
    public Map.Entry<Object, Object> next() {
        return (Map.Entry) this.f87496b.next();
    }
}
