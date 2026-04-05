package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ae extends ke {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ud f76101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ud f76102f;

    public ae(ud udVar, ud udVar2) {
        this.f76101e = udVar;
        this.f76102f = udVar2;
    }

    @Override // nh.ke, nh.h0, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // nh.ke, nh.h0, nh.ud
    public int count(Object obj) {
        int iCount = this.f76101e.count(obj);
        if (iCount == 0) {
            return 0;
        }
        return Math.max(0, iCount - this.f76102f.count(obj));
    }

    @Override // nh.ke, nh.h0
    public final int e() {
        return z7.size(g());
    }

    @Override // nh.h0
    public final Iterator f() {
        return new xd(this.f76101e.entrySet().iterator(), this.f76102f, 1);
    }

    @Override // nh.h0
    public final Iterator g() {
        return new xd(this.f76101e.entrySet().iterator(), this.f76102f, 2);
    }
}
