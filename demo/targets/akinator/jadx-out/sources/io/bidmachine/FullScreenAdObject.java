package io.bidmachine;

import io.bidmachine.FullScreenAdRequest;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class FullScreenAdObject<AdRequestType extends FullScreenAdRequest<AdRequestType>> extends AdObjectImpl<AdRequestType, up.b, hr.h, hr.i, hr.j> {
    private final AtomicBoolean isShowing;
    private final h2 thresholdTask;

    public FullScreenAdObject(ContextProvider contextProvider, AdProcessCallback adProcessCallback, AdRequestType adrequesttype, up.b bVar, hr.h hVar) {
        super(contextProvider, adProcessCallback, adrequesttype, bVar, hVar);
        this.isShowing = new AtomicBoolean(false);
        this.thresholdTask = new g2(this);
    }

    private void cancelImpressionThresholdTask() {
        h2 h2Var = this.thresholdTask;
        h2Var.getClass();
        nm.j.cancelBackgroundThreadTask(h2Var);
    }

    private void startImpressionThresholdTask() {
        h2 h2Var = this.thresholdTask;
        long timeThresholdMs = getParams().getVisibilityParams().getTimeThresholdMs();
        h2Var.getClass();
        nm.j.onBackgroundThread(h2Var, timeThresholdMs);
    }

    @Override // io.bidmachine.AdObjectImpl, up.a
    public void onClosed(boolean z10) {
        this.isShowing.set(false);
        super.onClosed(z10);
        cancelImpressionThresholdTask();
    }

    @Override // io.bidmachine.AdObjectImpl, up.a
    public void onFinished() {
        super.onFinished();
        cancelImpressionThresholdTask();
    }

    @Override // io.bidmachine.AdObjectImpl, up.a
    public void onImpression() {
        super.onImpression();
        cancelImpressionThresholdTask();
    }

    @Override // io.bidmachine.AdObjectImpl, up.a
    public void onShowFailed() {
        this.isShowing.set(false);
        super.onShowFailed();
    }

    @Override // io.bidmachine.AdObjectImpl, up.a
    public void onShown() {
        super.onShown();
        startImpressionThresholdTask();
    }

    public void show(ContextProvider contextProvider, RendererConfiguration rendererConfiguration) throws Throwable {
        if (this.isShowing.get()) {
            nm.a.d("Fullscreen ad already showing, please wait until the ad closes");
            return;
        }
        this.isShowing.set(true);
        getUnifiedAd().show(contextProvider, getUnifiedAdCallback(), rendererConfiguration);
        getProcessCallback().processFillAd();
    }

    @Override // io.bidmachine.AdObjectImpl, up.a
    public hr.i createUnifiedCallback(AdProcessCallback adProcessCallback) {
        return new i2(adProcessCallback);
    }
}
