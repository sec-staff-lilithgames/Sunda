package com.unity3d.services.ads.gmascar;

import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeFactory;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import java.util.List;
import kl.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class GMA {
    private static GMA instance;
    private final GMAScarAdapterBridge _gmaScarAdapterBridge;

    private GMA(GMAEventSender gMAEventSender) {
        this._gmaScarAdapterBridge = new GMAScarAdapterBridge(new MobileAdsBridgeFactory().createMobileAdsBridge(), new InitializeListenerBridge(), new InitializationStatusBridge(), new AdapterStatusBridge(), new WebViewErrorHandler(gMAEventSender), new ScarAdapterFactory(), gMAEventSender);
    }

    public static GMA getInstance() {
        return getInstance(new GMAEventSender());
    }

    public GMAScarAdapterBridge getBridge() {
        return this._gmaScarAdapterBridge;
    }

    public void getSCARBiddingSignals(boolean z10, IBiddingSignalsListener iBiddingSignalsListener) {
        this._gmaScarAdapterBridge.getSCARBiddingSignals(z10, new BiddingSignalsHandler(z10, iBiddingSignalsListener));
    }

    public boolean hasSCARBiddingSupport() {
        return this._gmaScarAdapterBridge.hasSCARBiddingSupport();
    }

    public static GMA getInstance(GMAEventSender gMAEventSender) {
        if (instance == null) {
            instance = new GMA(gMAEventSender);
        }
        return instance;
    }

    public void getSCARBiddingSignals(List<e> list, IBiddingSignalsListener iBiddingSignalsListener) {
        this._gmaScarAdapterBridge.getSCARBiddingSignals(list, new BiddingSignalsHandler(list.contains(e.f71585f), iBiddingSignalsListener));
    }
}
