package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.v1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3487v1 extends AbstractC3472u3 {
    public C3487v1() {
        this.H = "outcome";
        this.G = 4;
        this.I = IronSourceConstants.APP_EVENT_TYPE;
        e();
    }

    @Override // com.ironsource.AbstractC3472u3
    public int c(C5 c52) {
        return 1;
    }

    @Override // com.ironsource.AbstractC3472u3
    public void d() {
    }

    @Override // com.ironsource.AbstractC3472u3
    public String e(int i10) {
        return "";
    }

    @Override // com.ironsource.AbstractC3472u3
    public boolean h(C5 c52) {
        return false;
    }

    @Override // com.ironsource.AbstractC3472u3
    public boolean j(C5 c52) {
        return false;
    }

    @Override // com.ironsource.AbstractC3472u3
    public boolean d(C5 event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        int iC = event.c();
        return iC == D5.FIRST_INSTANCE.b() || iC == D5.INIT_COMPLETE.b() || iC == D5.SDK_INIT_FAILED.b() || iC == D5.SDK_INIT_SUCCESS.b();
    }

    @Override // com.ironsource.AbstractC3472u3
    public void f(C5 c52) {
    }
}
