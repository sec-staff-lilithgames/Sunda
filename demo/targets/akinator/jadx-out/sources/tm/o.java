package tm;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f87108a = new e0(y.f87151c);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f87109b;

    public o(q qVar) {
        this.f87109b = qVar;
    }

    public q build(Context context) {
        q qVar = this.f87109b;
        p pVar = qVar.f87114c;
        e0 e0Var = this.f87108a;
        e0Var.setListener(pVar);
        qVar.f87115d = e0Var.build(context);
        return qVar;
    }

    public o forceUseNativeCloseButton(boolean z10) {
        this.f87108a.forceUseNativeCloseButton(z10);
        return this;
    }

    public o setAdMeasurer(sm.b bVar) {
        this.f87108a.setAdMeasurer(bVar);
        return this;
    }

    public o setAllowedNativeFeatures(String[] strArr) {
        this.f87108a.setAllowedNativeFeatures(strArr);
        return this;
    }

    public o setBaseUrl(String str) {
        this.f87108a.setBaseUrl(str);
        return this;
    }

    public o setCacheControl(qm.a aVar) {
        this.f87108a.setCacheControl(aVar);
        return this;
    }

    public o setCloseStyle(um.p pVar) {
        this.f87108a.setCloseStyle(pVar);
        return this;
    }

    public o setCloseTime(float f10) {
        this.f87108a.setCloseTimeSec(f10);
        return this;
    }

    public o setCountDownStyle(um.p pVar) {
        this.f87108a.setCountDownStyle(pVar);
        return this;
    }

    public o setDurationSec(float f10) {
        this.f87108a.setDurationSec(f10);
        return this;
    }

    public o setIsTag(boolean z10) {
        this.f87108a.setIsTag(z10);
        return this;
    }

    public o setListener(r rVar) {
        this.f87109b.f87116e = rVar;
        return this;
    }

    public o setLoadingStyle(um.p pVar) {
        this.f87108a.setLoadingStyle(pVar);
        return this;
    }

    public o setPageFinishedScript(String str) {
        this.f87108a.setPageFinishedScript(str);
        return this;
    }

    public o setPlaceholderTimeoutSec(float f10) {
        this.f87108a.setPlaceholderTimeoutSec(f10);
        return this;
    }

    public o setProductLink(String str) {
        this.f87108a.setProductLink(str);
        return this;
    }

    public o setProgressStyle(um.p pVar) {
        this.f87108a.setProgressStyle(pVar);
        return this;
    }

    public o setR1(boolean z10) {
        this.f87108a.setR1(z10);
        return this;
    }

    public o setR2(boolean z10) {
        this.f87108a.setR2(z10);
        return this;
    }
}
