package com.ironsource;

import com.ironsource.AbstractC3472u3;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class H9 extends AbstractC3472u3 {
    private static H9 Q;
    private String O;
    private final P8 P = Mb.U().s();

    private H9() {
        this.H = "ironbeast";
        this.G = 2;
        this.I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.O = "";
    }

    public static synchronized H9 i() {
        try {
            if (Q == null) {
                H9 h92 = new H9();
                Q = h92;
                h92.e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return Q;
    }

    @Override // com.ironsource.AbstractC3472u3
    public int c(C5 c52) {
        int iF = f(c52.c());
        return iF == AbstractC3472u3.e.BANNER.b() ? this.P.a(IronSource.a.BANNER) : iF == AbstractC3472u3.e.NATIVE_AD.b() ? this.P.a(IronSource.a.NATIVE_AD) : this.P.a(IronSource.a.f37252c);
    }

    @Override // com.ironsource.AbstractC3472u3
    public boolean d(C5 c52) {
        int iC = c52.c();
        return iC == D5.IS_CALLBACK_LOAD_SUCCESS.b() || iC == D5.IS_INSTANCE_OPENED.b() || iC == D5.IS_INSTANCE_CLOSED.b() || iC == D5.IS_AUCTION_SUCCESS.b() || iC == D5.IS_AUCTION_FAILED.b() || iC == D5.BN_INSTANCE_SHOW.b() || iC == D5.BN_AUCTION_SUCCESS.b() || iC == D5.BN_AUCTION_FAILED.b() || iC == D5.NT_INSTANCE_LOAD_SUCCESS.b() || iC == D5.NT_INSTANCE_SHOW.b() || iC == D5.NT_AUCTION_SUCCESS.b() || iC == D5.NT_AUCTION_FAILED.b();
    }

    @Override // com.ironsource.AbstractC3472u3
    public String e(int i10) {
        return this.O;
    }

    @Override // com.ironsource.AbstractC3472u3
    public void f(C5 c52) {
        this.O = c52.b().optString("placement");
    }

    @Override // com.ironsource.AbstractC3472u3
    public boolean j(C5 c52) {
        return false;
    }

    @Override // com.ironsource.AbstractC3472u3
    public void d() {
        com.google.android.gms.internal.play_billing.a.s(D5.IS_LOAD_CALLED, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.IS_INSTANCE_LOAD, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.IS_INSTANCE_LOAD_SUCCESS, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.IS_CALLBACK_LOAD_SUCCESS, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.IS_INSTANCE_LOAD_FAILED, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.IS_INSTANCE_LOAD_NO_FILL, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.IS_INSTANCE_READY_TRUE, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.IS_INSTANCE_READY_FALSE, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.BN_LOAD, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.BN_CALLBACK_LOAD_ERROR, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.BN_RELOAD, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.BN_CALLBACK_RELOAD_ERROR, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.BN_CALLBACK_RELOAD_SUCCESS, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.BN_INSTANCE_LOAD, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.BN_INSTANCE_RELOAD, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.BN_INSTANCE_LOAD_SUCCESS, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.BN_INSTANCE_LOAD_ERROR, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.BN_INSTANCE_RELOAD_SUCCESS, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.BN_INSTANCE_RELOAD_ERROR, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.BN_INSTANCE_SHOW, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.NT_LOAD, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.NT_CALLBACK_LOAD_ERROR, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.NT_INSTANCE_LOAD, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.NT_INSTANCE_LOAD_SUCCESS, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.NT_INSTANCE_LOAD_ERROR, this.J);
        com.google.android.gms.internal.play_billing.a.s(D5.NT_INSTANCE_SHOW, this.J);
    }
}
