package androidx.datastore.preferences.protobuf;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j3 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f5920b;

    /* renamed from: c, reason: collision with root package name */
    public r f5921c;

    public j3(x xVar) {
        if (!(xVar instanceof l3)) {
            this.f5920b = null;
            this.f5921c = (r) xVar;
            return;
        }
        l3 l3Var = (l3) xVar;
        ArrayDeque arrayDeque = new ArrayDeque(l3Var.f5956k);
        this.f5920b = arrayDeque;
        arrayDeque.push(l3Var);
        x xVar2 = l3Var.f5953h;
        while (xVar2 instanceof l3) {
            l3 l3Var2 = (l3) xVar2;
            this.f5920b.push(l3Var2);
            xVar2 = l3Var2.f5953h;
        }
        this.f5921c = (r) xVar2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5921c != null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public r next() {
        r rVar;
        r rVar2 = this.f5921c;
        if (rVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f5920b;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                rVar = null;
                break;
            }
            x xVar = ((l3) arrayDeque.pop()).f5954i;
            while (xVar instanceof l3) {
                l3 l3Var = (l3) xVar;
                arrayDeque.push(l3Var);
                xVar = l3Var.f5953h;
            }
            rVar = (r) xVar;
        } while (rVar.isEmpty());
        this.f5921c = rVar;
        return rVar2;
    }
}
