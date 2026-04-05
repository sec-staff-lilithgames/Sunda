package yr;

import wr.m6;
import xr.c5;
import xr.w6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x0 implements w6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f95119a;

    public x0(v0 v0Var) {
        this.f95119a = v0Var;
    }

    @Override // xr.w6
    public void onPingTimeout() {
        synchronized (this.f95119a.f95069n) {
            this.f95119a.f95079x = m6.f91047o.withDescription("Keepalive failed. Considering connection dead");
            c5.closeQuietly(this.f95119a.f95060e);
        }
    }

    @Override // xr.w6
    public void ping() {
        synchronized (this.f95119a.f95069n) {
            this.f95119a.f95074s.ping(false, 0, 57005);
            this.f95119a.f95074s.flush();
        }
        this.f95119a.f95058c.reportKeepAliveSent();
    }
}
