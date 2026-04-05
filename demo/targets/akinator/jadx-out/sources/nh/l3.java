package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l3 extends hd {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n3 f76440f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(n3 n3Var) {
        super(n3Var);
        this.f76440f = n3Var;
    }

    @Override // nh.h0, nh.ud
    public Set<td> entrySet() {
        return new k3(this);
    }

    @Override // nh.hd, nh.h0, nh.ud
    public int remove(Object obj, int i10) {
        jh.i.o(i10, "occurrences");
        if (i10 == 0) {
            return count(obj);
        }
        n3 n3Var = this.f76440f;
        Collection<Object> collection = n3Var.f76492h.asMap().get(obj);
        int i11 = 0;
        if (collection == null) {
            return 0;
        }
        Iterator<Object> it = collection.iterator();
        while (it.hasNext()) {
            if (n3Var.f76493i.apply(ec.immutableEntry(obj, it.next())) && (i11 = i11 + 1) <= i10) {
                it.remove();
            }
        }
        return i11;
    }
}
