package io.bidmachine;

import android.content.Context;
import android.view.ViewGroup;
import hr.d;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.ViewAd;
import io.bidmachine.ViewAdObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class ViewAd<AdType extends ViewAd<AdType, AdRequestType, AdObjectType, UnifiedAdRequestParamsType, AdListenerType>, AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, AdObjectType extends ViewAdObject<AdRequestType, ?, UnifiedAdRequestParamsType>, UnifiedAdRequestParamsType extends hr.d, AdListenerType extends AdListener<AdType>> extends BidMachineAd<AdType, AdRequestType, AdObjectType, up.b, UnifiedAdRequestParamsType, AdListenerType> {
    public ViewAd(Context context, AdsType adsType) {
        super(context, adsType);
    }

    public void hide() {
        AdObjectType loadedAdObject = getLoadedAdObject();
        if (loadedAdObject == null) {
            return;
        }
        loadedAdObject.hide();
    }

    @Override // io.bidmachine.BidMachineAd
    public boolean isDuplicateShowDisabled() {
        return false;
    }

    public void show(ViewGroup viewGroup) {
        AdObjectType adobjecttypePrepareShow = prepareShow();
        if (adobjecttypePrepareShow == null) {
            return;
        }
        try {
            adobjecttypePrepareShow.show(viewGroup, this.rendererConfiguration);
        } catch (Throwable th2) {
            nm.a.w(th2);
            processShowFail(pr.a.throwable("Exception showing view ad object", th2));
        }
    }
}
