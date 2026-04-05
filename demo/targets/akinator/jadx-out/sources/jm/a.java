package jm;

import android.content.Context;
import tm.e0;
import tm.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f69668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hr.f f69669c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f69670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f69671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f69672g;

    public a(c cVar, k kVar, hr.f fVar, Context context, String str) {
        this.f69672g = cVar;
        this.f69668b = kVar;
        this.f69669c = fVar;
        this.f69670e = context;
        this.f69671f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        hr.f fVar = this.f69669c;
        k kVar = this.f69668b;
        c cVar = this.f69672g;
        try {
            l0 l0VarBuild = new e0().setCacheControl(kVar.f69699g).setPlaceholderTimeoutSec(kVar.f69700h).setListener(new f(fVar)).setAdMeasurer(cVar.f69676c).build(this.f69670e);
            cVar.f69675b = l0VarBuild;
            l0VarBuild.load(this.f69671f);
        } catch (Throwable th2) {
            nm.a.w(th2);
            fVar.onAdLoadFailed(pr.a.throwable("Exception loading MRAID banner object", th2));
        }
    }
}
