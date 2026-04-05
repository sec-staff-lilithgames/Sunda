package io.bidmachine;

import android.content.Context;
import hr.d;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.IAd;
import java.util.concurrent.atomic.AtomicBoolean;
import up.a;
import up.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class BidMachineAd<SelfType extends IAd, AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, AdObjectType extends up.a, AdObjectParamsType extends up.b, UnifiedAdRequestParamsType extends hr.d, AdListenerType extends AdListener<SelfType>> implements IAd<SelfType, AdRequestType> {
    AdRequestType adRequest;
    private final AdsType adsType;
    private final ContextProvider contextProvider;
    private AdListenerType listener;
    protected RendererConfiguration rendererConfiguration;
    private final pr.n tag = new pr.n("BidMachineAd");
    private b1 currentState = b1.f60311b;
    private final AdRequest.AdRequestListener<AdRequestType> adRequestListener = new q0(this);
    private final i internalAdRequestListener = new r0(this);
    final AdProcessCallback adProcessCallback = new a1(this);
    final BidMachineTrackingObject trackingObject = new p0(this);
    protected final AtomicBoolean isFinishTracked = new AtomicBoolean(false);
    protected final AtomicBoolean isCloseTracked = new AtomicBoolean(false);

    public BidMachineAd(Context context, AdsType adsType) {
        this.contextProvider = new SimpleContextProvider(context);
        this.adsType = adsType;
    }

    private void attachRequest(AdRequestType adrequesttype) {
        if (adrequesttype != null) {
            adrequesttype.addListener(this.adRequestListener);
            adrequesttype.addInternalListener(this.internalAdRequestListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyAdRequest() {
        AdRequestType adrequesttype = this.adRequest;
        this.adRequest = null;
        if (adrequesttype != null) {
            detachRequest(adrequesttype);
            adrequesttype.destroy();
        }
    }

    private void detachRequest(AdRequestType adrequesttype) {
        if (adrequesttype != null) {
            adrequesttype.removeListener(this.adRequestListener);
            adrequesttype.removeInternalListener(this.internalAdRequestListener);
        }
    }

    private boolean isNetworkAvailableDuringShow() {
        return kotlin.jvm.internal.d0.f71824a || nm.j.isNetworkAvailable(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$log$0(String str) {
        StringBuilder sb2 = new StringBuilder(this.adsType.name());
        up.c auctionResult = getAuctionResult();
        if (auctionResult != null) {
            sb2.append(" (");
            sb2.append(((k0) auctionResult).getNetworkKey());
            sb2.append(")");
        }
        return ((Object) sb2) + " - " + str;
    }

    private void processRequest(AdRequestType adrequesttype) {
        log("process request start");
        if (getAuctionResult() != null) {
            processRequestSuccess(adrequesttype);
        } else {
            this.currentState = b1.f60312c;
            adrequesttype.request(getContext());
        }
    }

    private void trackEvent(TrackEventType trackEventType, pr.a aVar) {
        this.trackingObject.eventFinish(trackEventType, getAdsType(), getAdResponse(), aVar);
    }

    @Override // io.bidmachine.IAd
    public boolean canShow() {
        return isLoaded() && isCanShowAd() && isNetworkAvailableDuringShow();
    }

    public abstract AdObjectType createAdObject(ContextProvider contextProvider, AdRequestType adrequesttype, NetworkAdapter networkAdapter, up.b bVar, AdProcessCallback adProcessCallback);

    @Override // io.bidmachine.IAd
    public void destroy() {
        this.adProcessCallback.processDestroy();
        this.trackingObject.clear();
    }

    public final n getAdResponse() {
        AdRequestType adrequesttype = this.adRequest;
        if (adrequesttype != null) {
            return adrequesttype.getAdResponse();
        }
        return null;
    }

    public AdsType getAdsType() {
        return this.adsType;
    }

    @Override // io.bidmachine.IAd
    public up.c getAuctionResult() {
        AdRequestType adrequesttype = this.adRequest;
        if (adrequesttype != null) {
            return adrequesttype.getAuctionResult();
        }
        return null;
    }

    public Context getContext() {
        return this.contextProvider.getApplicationContext();
    }

    public ContextProvider getContextProvider() {
        return this.contextProvider;
    }

    public final AdObjectType getLoadedAdObject() {
        n adResponse = getAdResponse();
        if (adResponse == null) {
            return null;
        }
        try {
            return (AdObjectType) adResponse.getAdObject();
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean isCanShowAd() {
        n adResponse = getAdResponse();
        return (adResponse == null || adResponse.wasShown()) ? false : true;
    }

    @Override // io.bidmachine.IAd
    public boolean isDestroyed() {
        return this.currentState == b1.f60316h;
    }

    public abstract boolean isDuplicateShowDisabled();

    @Override // io.bidmachine.IAd
    public boolean isExpired() {
        return this.currentState == b1.f60317i;
    }

    @Override // io.bidmachine.IAd
    public boolean isLoaded() {
        return getLoadedAdObject() != null && this.currentState == b1.f60314f;
    }

    @Override // io.bidmachine.IAd
    public boolean isLoading() {
        b1 b1Var = this.currentState;
        return b1Var == b1.f60312c || b1Var == b1.f60313e;
    }

    @Override // io.bidmachine.IAd
    public SelfType load(AdRequestType adrequesttype) {
        log("load requested");
        this.trackingObject.eventStart(TrackEventType.Load);
        if (!n1.a().f61920c.get()) {
            processRequestFail(pr.a.internal("BidMachine not initialized"));
            return this;
        }
        if (this.currentState != b1.f60311b) {
            log("request process abort because it's already processing");
            return this;
        }
        if (adrequesttype == null) {
            processRequestFail(pr.a.notFound("AdRequest"));
            return this;
        }
        detachRequest(this.adRequest);
        this.adRequest = adrequesttype;
        attachRequest(adrequesttype);
        processRequest(adrequesttype);
        return this;
    }

    public final void log(String str) {
        nm.a.d(this.tag, new ao.n(21, this, str));
    }

    public AdObjectType prepareShow() {
        return (AdObjectType) prepareShow(isDuplicateShowDisabled());
    }

    public void processPrepareShow() {
        trackEvent(TrackEventType.ImpressionOpportunity, null);
    }

    public void processRequestFail(pr.a aVar) {
        if (this.currentState.ordinal() > 2) {
            return;
        }
        trackEvent(TrackEventType.Load, aVar);
        this.adProcessCallback.processLoadFail(aVar);
    }

    public void processRequestSuccess(AdRequestType adrequesttype) {
        if (this.currentState.ordinal() > 2) {
            return;
        }
        this.currentState = b1.f60313e;
        n adResponse = adrequesttype.getAdResponse();
        if (adResponse == null) {
            processRequestFail(pr.a.incorrectContent("AdResponse is null"));
        } else {
            log("start loading");
            adResponse.loadAdObject(this.contextProvider, adrequesttype, this, this.adProcessCallback);
        }
    }

    public void processShowFail(pr.a aVar) {
        trackEvent(TrackEventType.Show, aVar);
        this.adProcessCallback.processShowFail(aVar);
    }

    public SelfType setListener(AdListenerType adlistenertype) {
        this.listener = adlistenertype;
        return this;
    }

    @Override // io.bidmachine.IAd
    public SelfType setRendererConfiguration(RendererConfiguration rendererConfiguration) {
        this.rendererConfiguration = rendererConfiguration;
        return this;
    }

    public String toString() {
        return this.tag + ", state - " + this.currentState + ", auctionResult - " + getAuctionResult();
    }

    private AdObjectType prepareShow(boolean z10) {
        processPrepareShow();
        if (!isNetworkAvailableDuringShow()) {
            processShowFail(pr.a.f81787e);
            return null;
        }
        if (isDestroyed()) {
            processShowFail(pr.a.f81796n);
            return null;
        }
        if (isExpired()) {
            processShowFail(pr.a.f81795m);
            return null;
        }
        if (!isLoaded()) {
            processShowFail(pr.a.internal("Ad not loaded"));
            return null;
        }
        if (!z10 || isCanShowAd()) {
            return (AdObjectType) getLoadedAdObject();
        }
        processShowFail(pr.a.f81794l);
        return null;
    }
}
