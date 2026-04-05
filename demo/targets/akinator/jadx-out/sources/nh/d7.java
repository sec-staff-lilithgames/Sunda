package nh;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d7 extends d4 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f76178c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76179e;

    public d7(Iterable iterable, int i10) {
        this.f76178c = iterable;
        this.f76179e = i10;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        Iterable iterable = this.f76178c;
        boolean z10 = iterable instanceof List;
        int i10 = this.f76179e;
        if (z10) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), i10), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        z7.advance(it, i10);
        return new c7(it);
    }
}
