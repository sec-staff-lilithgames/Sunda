package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class cb extends m4 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eb f76154b;

    public cb(eb ebVar) {
        this.f76154b = ebVar;
    }

    @Override // nh.e4
    /* renamed from: c */
    public final Collection delegate() {
        return this.f76154b.f76221h;
    }

    @Override // nh.m4
    public final Set d() {
        return this.f76154b.f76221h;
    }

    @Override // nh.e4, nh.l4
    public final Object delegate() {
        return this.f76154b.f76221h;
    }

    @Override // nh.e4, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Object, Object>> iterator() {
        return new bb(this, this.f76154b.f76221h.iterator(), 0);
    }
}
