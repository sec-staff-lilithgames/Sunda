package vm;

import io.bidmachine.iab.vast.a0;
import io.bidmachine.iab.vast.activity.VastActivity;
import io.bidmachine.iab.vast.activity.VastView;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VastActivity f89306a;

    public a(VastActivity vastActivity) {
        this.f89306a = vastActivity;
    }

    @Override // io.bidmachine.iab.vast.a0
    public void onClick(VastView vastView, io.bidmachine.iab.vast.t tVar, um.k kVar, String str) {
        VastActivity vastActivity = this.f89306a;
        io.bidmachine.iab.vast.b bVar = vastActivity.f60412g;
        if (bVar != null) {
            ((lm.d) bVar).onVastClick(vastActivity, tVar, kVar, str);
        }
    }

    @Override // io.bidmachine.iab.vast.a0
    public void onComplete(VastView vastView, io.bidmachine.iab.vast.t tVar) {
        VastActivity vastActivity = this.f89306a;
        io.bidmachine.iab.vast.b bVar = vastActivity.f60412g;
        if (bVar != null) {
            ((lm.d) bVar).onVastComplete(vastActivity, tVar);
        }
    }

    @Override // io.bidmachine.iab.vast.a0
    public void onFinish(VastView vastView, io.bidmachine.iab.vast.t tVar, boolean z10) {
        ConcurrentHashMap concurrentHashMap = VastActivity.f60404k;
        this.f89306a.c(tVar, z10);
    }

    @Override // io.bidmachine.iab.vast.a0
    public void onOrientationRequested(VastView vastView, io.bidmachine.iab.vast.t tVar, int i10) {
        int forceOrientation = tVar.getForceOrientation();
        if (forceOrientation > -1) {
            i10 = forceOrientation;
        }
        ConcurrentHashMap concurrentHashMap = VastActivity.f60404k;
        this.f89306a.b(i10);
    }

    @Override // io.bidmachine.iab.vast.a0
    public void onShowFailed(VastView vastView, io.bidmachine.iab.vast.t tVar, qm.b bVar) {
        ConcurrentHashMap concurrentHashMap = VastActivity.f60404k;
        io.bidmachine.iab.vast.b bVar2 = this.f89306a.f60412g;
        if (bVar2 != null) {
            ((lm.d) bVar2).onVastShowFailed(tVar, bVar);
        }
    }

    @Override // io.bidmachine.iab.vast.a0
    public void onShown(VastView vastView, io.bidmachine.iab.vast.t tVar) {
        VastActivity vastActivity = this.f89306a;
        io.bidmachine.iab.vast.b bVar = vastActivity.f60412g;
        if (bVar != null) {
            ((lm.d) bVar).onVastShown(vastActivity, tVar);
        }
    }
}
