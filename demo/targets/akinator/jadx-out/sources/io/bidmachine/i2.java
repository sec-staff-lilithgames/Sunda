package io.bidmachine;

import io.bidmachine.AdObjectImpl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i2 extends AdObjectImpl.BaseUnifiedAdCallback implements hr.i {
    @Override // hr.i
    public void onAdClosed() {
        this.processCallback.processClosed();
    }

    @Override // hr.i
    public void onAdFinished() {
        this.processCallback.processFinished();
    }

    @Override // hr.i
    public void onAdLoaded() {
        this.processCallback.processLoadSuccess();
    }
}
