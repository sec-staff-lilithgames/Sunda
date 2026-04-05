package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.g;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ScarBannerAdHandler implements g {
    private final IEventSender _eventSender;
    private final String _operationId;

    public ScarBannerAdHandler(IEventSender iEventSender, String str) {
        this._eventSender = iEventSender;
        this._operationId = str;
    }

    @Override // com.unity3d.scar.adapter.common.g, com.unity3d.scar.adapter.common.e
    public void onAdClicked() {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_CLICKED, this._operationId);
    }

    @Override // com.unity3d.scar.adapter.common.g, com.unity3d.scar.adapter.common.e
    public void onAdClosed() {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_CLOSED, this._operationId);
    }

    @Override // com.unity3d.scar.adapter.common.g, com.unity3d.scar.adapter.common.e
    public void onAdFailedToLoad(int i10, String str) {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_LOAD_FAILED, this._operationId, Integer.valueOf(i10), str);
    }

    @Override // com.unity3d.scar.adapter.common.g
    public void onAdImpression() {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_IMPRESSION, this._operationId);
    }

    @Override // com.unity3d.scar.adapter.common.g, com.unity3d.scar.adapter.common.e
    public void onAdLoaded() {
        BannerViewCache.getInstance().addScarContainer(this._operationId);
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_LOADED, this._operationId);
    }

    @Override // com.unity3d.scar.adapter.common.g, com.unity3d.scar.adapter.common.e
    public void onAdOpened() {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_OPENED, this._operationId);
    }
}
