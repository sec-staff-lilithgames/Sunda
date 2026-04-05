package io.bidmachine;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.AdView;
import io.bidmachine.ViewAd;
import io.bidmachine.ViewAdObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class AdView<SelfType extends AdView<SelfType, AdType, AdRequestType, AdObjectType, ExternalAdListenerType>, AdType extends ViewAd<AdType, AdRequestType, AdObjectType, ?, AdListener<AdType>>, AdRequestType extends AdRequest<AdRequestType, ?, ?>, AdObjectType extends ViewAdObject<AdRequestType, ?, ?>, ExternalAdListenerType extends AdListener<SelfType>> extends FrameLayout implements IAd<SelfType, AdRequestType> {
    private final AdListener<AdType> adListener;
    private AdType currentAd;
    private ExternalAdListenerType externalListener;
    private boolean isAttachedToWindow;
    private boolean isShowPending;
    private AdType pendingAd;
    private RendererConfiguration rendererConfiguration;

    public AdView(Context context) {
        this(context, null);
    }

    private boolean canPerformShow() {
        return this.isAttachedToWindow && this.isShowPending && getVisibility() != 8;
    }

    private void performHide() {
        AdType adtype = this.currentAd;
        if (adtype != null) {
            adtype.hide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performShow() {
        if (canPerformShow()) {
            prepareDisplayRequest();
            AdType adtype = this.currentAd;
            if (adtype != null) {
                adtype.setRendererConfiguration(this.rendererConfiguration);
                this.currentAd.show(this);
                this.isShowPending = false;
            }
        }
    }

    private void prepareDisplayRequest() {
        AdType adtype;
        if (this.currentAd == null || ((adtype = this.pendingAd) != null && adtype.isLoaded())) {
            AdType adtype2 = this.currentAd;
            if (adtype2 != null) {
                adtype2.destroy();
            }
            this.currentAd = this.pendingAd;
            this.pendingAd = null;
        }
    }

    @Override // io.bidmachine.IAd
    public boolean canShow() {
        return canShow(this.currentAd) || canShow(this.pendingAd);
    }

    public abstract AdType createAd(Context context);

    @Override // io.bidmachine.IAd
    public void destroy() {
        AdType adtype = this.currentAd;
        if (adtype != null) {
            adtype.destroy();
            this.currentAd = null;
        }
        AdType adtype2 = this.pendingAd;
        if (adtype2 != null) {
            adtype2.destroy();
            this.pendingAd = null;
        }
    }

    @Override // io.bidmachine.IAd
    public up.c getAuctionResult() {
        AdType adtype = this.currentAd;
        if (adtype != null) {
            return adtype.getAuctionResult();
        }
        AdType adtype2 = this.pendingAd;
        if (adtype2 != null) {
            return adtype2.getAuctionResult();
        }
        return null;
    }

    public AdType getCurrentAd() {
        return this.currentAd;
    }

    public AdType getPendingAd() {
        return this.pendingAd;
    }

    @Override // io.bidmachine.IAd
    public boolean isDestroyed() {
        AdType adtype = this.pendingAd;
        if (adtype != null) {
            return adtype.isDestroyed();
        }
        AdType adtype2 = this.currentAd;
        return adtype2 != null && adtype2.isDestroyed();
    }

    @Override // io.bidmachine.IAd
    public boolean isExpired() {
        AdType adtype = this.pendingAd;
        if (adtype != null) {
            return adtype.isExpired();
        }
        AdType adtype2 = this.currentAd;
        return adtype2 != null && adtype2.isExpired();
    }

    @Override // io.bidmachine.IAd
    public boolean isLoaded() {
        return isLoaded(this.currentAd) || isLoaded(this.pendingAd);
    }

    @Override // io.bidmachine.IAd
    public boolean isLoading() {
        AdType adtype = this.pendingAd;
        return adtype != null && adtype.isLoading();
    }

    @Override // io.bidmachine.IAd
    public /* bridge */ /* synthetic */ IAd load(AdRequest adRequest) {
        return load((AdView<SelfType, AdType, AdRequestType, AdObjectType, ExternalAdListenerType>) adRequest);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        performShow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        this.isShowPending = true;
        performHide();
    }

    public SelfType setListener(ExternalAdListenerType externaladlistenertype) {
        this.externalListener = externaladlistenertype;
        return this;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (getVisibility() == 0) {
            performShow();
        }
    }

    public AdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean canShow(AdType adtype) {
        return adtype != null && adtype.canShow();
    }

    private boolean isLoaded(AdType adtype) {
        return adtype != null && adtype.isLoaded();
    }

    @Override // io.bidmachine.IAd
    public SelfType load(AdRequestType adrequesttype) {
        this.isShowPending = true;
        AdType adtype = this.pendingAd;
        if (adtype != null) {
            adtype.destroy();
        }
        AdType adtype2 = (AdType) createAd(getContext());
        this.pendingAd = adtype2;
        adtype2.setListener(this.adListener);
        this.pendingAd.load(adrequesttype);
        return this;
    }

    @Override // io.bidmachine.IAd
    public SelfType setRendererConfiguration(RendererConfiguration rendererConfiguration) {
        this.rendererConfiguration = rendererConfiguration;
        return this;
    }

    public AdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.isShowPending = false;
        this.isAttachedToWindow = false;
        this.adListener = new v(this);
    }
}
