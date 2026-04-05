package nh;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class sa extends xa {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ta f76639b;

    public sa(ta taVar) {
        this.f76639b = taVar;
    }

    @Override // nh.xa
    public final Map c() {
        return this.f76639b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Object, Object>> iterator() {
        return ((i0) this.f76639b).f76342f.b();
    }
}
