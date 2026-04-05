package nh;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class lb extends xa {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mb f76448b;

    public lb(mb mbVar) {
        this.f76448b = mbVar;
    }

    @Override // nh.xa
    public final Map c() {
        return this.f76448b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Object, Object>> iterator() {
        return this.f76448b.a();
    }
}
