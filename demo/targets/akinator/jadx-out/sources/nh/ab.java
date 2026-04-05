package nh;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ab extends h4 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f76096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bb f76097c;

    public ab(bb bbVar, Map.Entry entry) {
        this.f76096b = entry;
        this.f76097c = bbVar;
    }

    @Override // nh.h4
    public final Map.Entry c() {
        return this.f76096b;
    }

    @Override // nh.l4
    public final Object delegate() {
        return this.f76096b;
    }

    @Override // nh.h4, java.util.Map.Entry
    public Object setValue(Object obj) {
        mh.p1.checkArgument(((cb) this.f76097c.f76128e).f76154b.c(getKey(), obj));
        return super.setValue(obj);
    }
}
