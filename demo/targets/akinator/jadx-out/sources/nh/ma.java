package nh;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ma extends ej {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f76476b;

    public ma(Iterator it) {
        this.f76476b = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76476b.hasNext();
    }

    @Override // java.util.Iterator
    public Map.Entry<Object, Object> next() {
        Map.Entry entry = (Map.Entry) this.f76476b.next();
        mh.p1.checkNotNull(entry);
        return new la(entry);
    }
}
