package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.be, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3147be extends AbstractC3472u3 {
    private static C3147be Q;
    private String O;
    private final P8 P = Mb.U().s();

    private C3147be() {
        this.H = "outcome";
        this.G = 3;
        this.I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.O = "";
    }

    public static synchronized C3147be i() {
        try {
            if (Q == null) {
                C3147be c3147be = new C3147be();
                Q = c3147be;
                c3147be.e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return Q;
    }

    @Override // com.ironsource.AbstractC3472u3
    public int c(C5 c52) {
        return this.P.a(IronSource.a.REWARDED_VIDEO);
    }

    @Override // com.ironsource.AbstractC3472u3
    public boolean d(C5 c52) {
        int iC = c52.c();
        return iC == D5.FIRST_INSTANCE.b() || iC == D5.INIT_COMPLETE.b() || iC == D5.SDK_INIT_FAILED.b() || iC == D5.SDK_INIT_SUCCESS.b() || iC == D5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.b() || iC == D5.RV_BUSINESS_INSTANCE_OPENED.b() || iC == D5.RV_INSTANCE_CLOSED.b() || iC == D5.RV_BUSINESS_INSTANCE_REWARDED.b() || iC == D5.RV_AUCTION_FAILED.b() || iC == D5.RV_AUCTION_SUCCESS.b();
    }

    @Override // com.ironsource.AbstractC3472u3
    public String e(int i10) {
        return (i10 == 15 || (i10 >= 300 && i10 < 400)) ? this.O : "";
    }

    @Override // com.ironsource.AbstractC3472u3
    public void f(C5 c52) {
        if (c52.c() == 15 || (c52.c() >= 300 && c52.c() < 400)) {
            this.O = c52.b().optString("placement");
        }
    }

    @Override // com.ironsource.AbstractC3472u3
    public boolean j(C5 c52) {
        return false;
    }

    @Override // com.ironsource.AbstractC3472u3
    public void d() {
        com.google.android.gms.internal.play_billing.a.s(D5.RV_BUSINESS_MEDIATION_LOAD, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.RV_BUSINESS_INSTANCE_LOAD, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.RV_INSTANCE_LOAD_FAILED, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.RV_INSTANCE_SHOW_CHANCE, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.RV_INSTANCE_READY_TRUE, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.RV_INSTANCE_READY_FALSE, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.RV_INSTANCE_LOAD_FAILED_REASON, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.RV_INSTANCE_LOAD_NO_FILL, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.RV_MEDIATION_LOAD_ERROR, this.J);
    }
}
