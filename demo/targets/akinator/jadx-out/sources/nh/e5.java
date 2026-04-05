package nh;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e5 extends ej {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej f76204b;

    public e5(ej ejVar) {
        this.f76204b = ejVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76204b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return ((Map.Entry) this.f76204b.next()).getKey();
    }
}
