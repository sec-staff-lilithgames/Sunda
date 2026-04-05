package fn;

import io.bidmachine.iab.vast.processor.VastAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.bidmachine.iab.vast.t f55776b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f55777c;

    public v(y yVar, io.bidmachine.iab.vast.t tVar) {
        this.f55777c = yVar;
        this.f55776b = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        y yVar = this.f55777c;
        io.bidmachine.iab.vast.t tVar = this.f55776b;
        try {
            VastAd vastAd = tVar.getVastAd();
            yVar.addVerificationScriptResourceList(vastAd != null ? vastAd.getAdVerificationsExtensionList() : null);
            yVar.setSkipOffset(Float.valueOf(tVar.getFusedVideoCloseTimeSec()));
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
