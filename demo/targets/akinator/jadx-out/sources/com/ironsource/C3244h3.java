package com.ironsource;

import com.ironsource.N0;
import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.h3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C3244h3 extends P0 {
    public C3244h3(N0 n02, Gb gb2) {
        super(n02, gb2);
    }

    private boolean n() {
        return b().b() > 0;
    }

    private boolean p() {
        return b().d() >= 0;
    }

    public void l() {
        if (o()) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    public void m() {
        if (o()) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    public boolean o() {
        return b().a() == N0.a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    public void q() {
        if (o() && d()) {
            IronLog.INTERNAL.verbose();
            a(b().c());
        }
    }

    public void r() {
        if (!n()) {
            IronLog.INTERNAL.verbose("banner reload interval is disabled");
        } else if (o() && p()) {
            IronLog.INTERNAL.verbose();
            a(b().d());
        }
    }
}
