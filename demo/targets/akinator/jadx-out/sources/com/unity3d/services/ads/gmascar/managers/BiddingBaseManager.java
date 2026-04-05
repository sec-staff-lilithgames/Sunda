package com.unity3d.services.ads.gmascar.managers;

import a2.s;
import com.ironsource.environment.thread.a;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.ads.gmascar.utils.IScarAdFormatProvider;
import com.unity3d.services.ads.gmascar.utils.ScarRequestHandler;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.ScarMetric;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class BiddingBaseManager implements IBiddingManager {
    private final boolean _isAsyncTokenCall;
    private final ScarRequestHandler _scarRequestHandler;
    protected final AtomicBoolean isUploadPermitted;
    private final IScarAdFormatProvider scarAdFormatProvider;
    private final AtomicReference<BiddingSignals> signals;
    private final String tokenIdentifier;
    private final IUnityAdsTokenListener unityAdsTokenListener;

    public BiddingBaseManager(IUnityAdsTokenListener iUnityAdsTokenListener) {
        this(null, iUnityAdsTokenListener, new ScarRequestHandler());
    }

    private synchronized void attemptUpload() {
        if (this.signals.get() != null && this.isUploadPermitted.compareAndSet(true, false)) {
            uploadSignals();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchSignals$1() {
        GMA.getInstance().getSCARBiddingSignals(this.scarAdFormatProvider.buildAdFormatList(), new IBiddingSignalsListener() { // from class: com.unity3d.services.ads.gmascar.managers.BiddingBaseManager.1
            @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
            public void onSignalsFailure(String str) {
                BiddingBaseManager.this.sendFetchResult(str);
            }

            @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
            public void onSignalsReady(BiddingSignals biddingSignals) {
                BiddingBaseManager.this.onSignalsReady(biddingSignals);
                BiddingBaseManager.this.sendFetchResult("");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUnityAdsTokenReady$0(String str) {
        this.unityAdsTokenListener.onUnityAdsTokenReady(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$uploadSignals$2(BiddingSignals biddingSignals) {
        try {
            this._scarRequestHandler.makeUploadRequest(this.tokenIdentifier, biddingSignals, new ConfigurationReader().getCurrentConfiguration().getScarBiddingUrl());
            getMetricSender().sendMetric(ScarMetric.hbSignalsUploadSuccess(this._isAsyncTokenCall));
        } catch (Exception e10) {
            getMetricSender().sendMetric(ScarMetric.hbSignalsUploadFailure(this._isAsyncTokenCall, e10.getLocalizedMessage()));
        }
    }

    public void fetchSignals() {
        getMetricSender().sendMetric(ScarMetric.hbSignalsFetchStart(this._isAsyncTokenCall));
        new Thread(new s(this, 27)).start();
    }

    @Override // com.unity3d.services.ads.gmascar.managers.IBiddingManager
    public String getFormattedToken(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String tokenIdentifier = getTokenIdentifier();
        return (tokenIdentifier == null || tokenIdentifier.isEmpty()) ? str : i.d(tokenIdentifier, ":", str);
    }

    public SDKMetricsSender getMetricSender() {
        return (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
    }

    @Override // com.unity3d.services.ads.gmascar.managers.IBiddingManager
    public String getTokenIdentifier() {
        return this.tokenIdentifier;
    }

    public void onSignalsReady(BiddingSignals biddingSignals) {
        this.signals.set(biddingSignals);
        attemptUpload();
    }

    @Override // com.unity3d.ads.IUnityAdsTokenListener
    public final void onUnityAdsTokenReady(String str) {
        if (this.unityAdsTokenListener != null) {
            Utilities.wrapCustomerListener(new a(7, this, str));
        }
    }

    public void permitSignalsUpload() {
        this.isUploadPermitted.set(true);
        attemptUpload();
    }

    public void permitUpload() {
        this.isUploadPermitted.set(true);
    }

    public void sendFetchResult(String str) {
        if (str != "") {
            getMetricSender().sendMetric(ScarMetric.hbSignalsFetchFailure(this._isAsyncTokenCall, str));
        } else {
            getMetricSender().sendMetric(ScarMetric.hbSignalsFetchSuccess(this._isAsyncTokenCall));
        }
    }

    public abstract void start();

    public void uploadSignals() {
        getMetricSender().sendMetric(ScarMetric.hbSignalsUploadStart(this._isAsyncTokenCall));
        BiddingSignals biddingSignals = this.signals.get();
        if (biddingSignals == null || biddingSignals.isEmpty()) {
            getMetricSender().sendMetric(ScarMetric.hbSignalsUploadFailure(this._isAsyncTokenCall, "null or empty signals"));
        } else {
            new Thread(new a(6, this, biddingSignals)).start();
        }
    }

    public BiddingBaseManager(IScarAdFormatProvider iScarAdFormatProvider, IUnityAdsTokenListener iUnityAdsTokenListener) {
        this(iScarAdFormatProvider, iUnityAdsTokenListener, new ScarRequestHandler());
    }

    public BiddingBaseManager(IScarAdFormatProvider iScarAdFormatProvider, IUnityAdsTokenListener iUnityAdsTokenListener, ScarRequestHandler scarRequestHandler) {
        this.isUploadPermitted = new AtomicBoolean(false);
        this.signals = new AtomicReference<>();
        this.tokenIdentifier = UUID.randomUUID().toString();
        this.unityAdsTokenListener = iUnityAdsTokenListener;
        this._isAsyncTokenCall = iUnityAdsTokenListener != null;
        this._scarRequestHandler = scarRequestHandler;
        this.scarAdFormatProvider = iScarAdFormatProvider;
    }
}
