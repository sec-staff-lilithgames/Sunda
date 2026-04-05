package jm;

import android.content.Context;
import tm.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f69682b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f69683c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr.i f69684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f69685f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f69686g;

    public g(i iVar, k kVar, Context context, hr.i iVar2, String str) {
        this.f69686g = iVar;
        this.f69682b = kVar;
        this.f69683c = context;
        this.f69684e = iVar2;
        this.f69685f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        hr.i iVar = this.f69684e;
        Context context = this.f69683c;
        i iVar2 = this.f69686g;
        k kVar = this.f69682b;
        try {
            q qVarBuild = q.newBuilder().setCacheControl(kVar.f69699g).setPlaceholderTimeoutSec(kVar.f69700h).setCloseTime(kVar.f69701i).forceUseNativeCloseButton(kVar.f69697e).setListener(new j(context, iVar, iVar2.f69690c)).setR1(kVar.f69702j).setR2(kVar.f69703k).setDurationSec(kVar.f69705m).setProductLink(kVar.f69704l).setCloseStyle(kVar.f69706n).setCountDownStyle(kVar.f69707o).setProgressStyle(kVar.f69708p).setAdMeasurer(iVar2.f69690c).build(context);
            iVar2.f69689b = qVarBuild;
            qVarBuild.load(this.f69685f);
        } catch (Throwable th2) {
            nm.a.w(th2);
            iVar.onAdLoadFailed(pr.a.throwable("Exception loading MRAID fullscreen object", th2));
        }
    }
}
