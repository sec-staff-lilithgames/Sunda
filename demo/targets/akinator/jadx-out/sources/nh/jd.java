package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class jd extends ig {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f76397b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kd f76398c;

    public jd(kd kdVar, Object obj) {
        this.f76397b = obj;
        this.f76398c = kdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Object> iterator() {
        return new id(this, this.f76397b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f76398c.f76425h.containsKey(this.f76397b) ? 1 : 0;
    }
}
