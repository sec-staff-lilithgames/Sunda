package io.bidmachine;

import android.content.Context;
import io.bidmachine.AdListener;
import io.bidmachine.FullScreenAd;
import io.bidmachine.FullScreenAdObject;
import io.bidmachine.FullScreenAdRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class FullScreenAd<SelfType extends FullScreenAd<SelfType, AdRequestType, AdObjectType, ListenerType>, AdRequestType extends FullScreenAdRequest<AdRequestType>, AdObjectType extends FullScreenAdObject<AdRequestType>, ListenerType extends AdListener<SelfType>> extends BidMachineAd<SelfType, AdRequestType, AdObjectType, up.b, hr.j, ListenerType> {
    public FullScreenAd(Context context, AdsType adsType) {
        super(context, adsType);
    }

    private void resetTracked() {
        this.isFinishTracked.set(false);
        this.isCloseTracked.set(false);
    }

    @Override // io.bidmachine.BidMachineAd
    public boolean isDuplicateShowDisabled() {
        return true;
    }

    public void show() {
        AdObjectType adobjecttypePrepareShow = prepareShow();
        if (adobjecttypePrepareShow == null) {
            return;
        }
        try {
            resetTracked();
            adobjecttypePrepareShow.show(getContextProvider(), this.rendererConfiguration);
        } catch (Throwable th2) {
            nm.a.w(th2);
            processShowFail(pr.a.throwable("Exception showing fullscreen object", th2));
        }
    }
}
