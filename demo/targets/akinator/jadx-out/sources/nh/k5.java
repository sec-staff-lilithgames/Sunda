package nh;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k5 extends ej {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f76415b;

    public k5(ej ejVar) {
        this.f76415b = ejVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76415b.hasNext();
    }

    @Override // java.util.Iterator
    public Map.Entry<Object, l6> next() {
        return new j5((Map.Entry) this.f76415b.next());
    }
}
