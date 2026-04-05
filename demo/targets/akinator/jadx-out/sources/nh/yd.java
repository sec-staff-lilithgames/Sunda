package nh;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class yd extends ke {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ud f76793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ud f76794f;

    public yd(ud udVar, ud udVar2) {
        this.f76793e = udVar;
        this.f76794f = udVar2;
    }

    @Override // nh.h0
    public final Set c() {
        return og.intersection(this.f76793e.elementSet(), this.f76794f.elementSet());
    }

    @Override // nh.ke, nh.h0, nh.ud
    public int count(Object obj) {
        int iCount = this.f76793e.count(obj);
        if (iCount == 0) {
            return 0;
        }
        return Math.min(iCount, this.f76794f.count(obj));
    }

    @Override // nh.h0
    public final Iterator f() {
        throw new AssertionError("should never be called");
    }

    @Override // nh.h0
    public final Iterator g() {
        return new xd(this.f76793e.entrySet().iterator(), this.f76794f, 0);
    }
}
