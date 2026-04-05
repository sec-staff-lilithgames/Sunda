package nh;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class wd extends ke {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ud f76742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ud f76743f;

    public wd(ud udVar, ud udVar2) {
        this.f76742e = udVar;
        this.f76743f = udVar2;
    }

    @Override // nh.h0
    public final Set c() {
        return og.union(this.f76742e.elementSet(), this.f76743f.elementSet());
    }

    @Override // nh.h0, java.util.AbstractCollection, java.util.Collection, nh.ud
    public boolean contains(Object obj) {
        return this.f76742e.contains(obj) || this.f76743f.contains(obj);
    }

    @Override // nh.ke, nh.h0, nh.ud
    public int count(Object obj) {
        return Math.max(this.f76742e.count(obj), this.f76743f.count(obj));
    }

    @Override // nh.h0
    public final Iterator f() {
        throw new AssertionError("should never be called");
    }

    @Override // nh.h0
    public final Iterator g() {
        ud udVar = this.f76742e;
        Iterator<td> it = udVar.entrySet().iterator();
        ud udVar2 = this.f76743f;
        return new vd(it, udVar2, udVar2.entrySet().iterator(), udVar, 0);
    }

    @Override // nh.h0, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f76742e.isEmpty() && this.f76743f.isEmpty();
    }
}
