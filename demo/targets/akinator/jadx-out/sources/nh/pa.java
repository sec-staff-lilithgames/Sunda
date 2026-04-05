package nh;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class pa extends xa {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qa f76557b;

    public pa(qa qaVar) {
        this.f76557b = qaVar;
    }

    @Override // nh.xa
    public final Map c() {
        return this.f76557b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Object, Object>> iterator() {
        qa qaVar = this.f76557b;
        Set setC = qaVar.c();
        return new o7(setC.iterator(), qaVar.f76582g, 1);
    }
}
