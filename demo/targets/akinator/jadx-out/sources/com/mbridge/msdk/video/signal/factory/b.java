package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.a;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.impl.i;
import com.mbridge.msdk.video.signal.impl.j;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.video.signal.impl.m;
import com.mbridge.msdk.video.signal.impl.n;
import com.mbridge.msdk.video.signal.impl.o;
import com.mbridge.msdk.video.signal.impl.q;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b extends a {

    /* renamed from: h, reason: collision with root package name */
    private Activity f45190h;

    /* renamed from: i, reason: collision with root package name */
    private WebView f45191i;

    /* renamed from: j, reason: collision with root package name */
    private MBridgeVideoView f45192j;

    /* renamed from: k, reason: collision with root package name */
    private MBridgeContainerView f45193k;

    /* renamed from: l, reason: collision with root package name */
    private CampaignEx f45194l;

    /* renamed from: m, reason: collision with root package name */
    private MBridgeBTContainer f45195m;

    /* renamed from: n, reason: collision with root package name */
    private a.InterfaceC0353a f45196n;

    /* renamed from: o, reason: collision with root package name */
    private String f45197o;

    /* renamed from: p, reason: collision with root package name */
    private List<CampaignEx> f45198p;

    public b(Activity activity) {
        this.f45190h = activity;
    }

    public void a(k kVar) {
        this.f45184b = kVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        WebView webView = this.f45191i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f45183a == null) {
            this.f45183a = new i(webView);
        }
        return this.f45183a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.i getIJSRewardVideoV1() {
        Activity activity;
        MBridgeContainerView mBridgeContainerView = this.f45193k;
        if (mBridgeContainerView == null || (activity = this.f45190h) == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.f45188f == null) {
            this.f45188f = new o(activity, mBridgeContainerView);
        }
        return this.f45188f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f45190h == null || this.f45195m == null) {
            return super.getJSBTModule();
        }
        if (this.f45189g == null) {
            this.f45189g = new j(this.f45190h, this.f45195m);
        }
        return this.f45189g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        CampaignEx campaignEx;
        List<CampaignEx> list;
        Activity activity = this.f45190h;
        if (activity == null || (campaignEx = this.f45194l) == null) {
            return super.getJSCommon();
        }
        if (this.f45184b == null) {
            this.f45184b = new k(activity, campaignEx);
        }
        if (this.f45194l.getDynamicTempCode() == 5 && (list = this.f45198p) != null) {
            d dVar = this.f45184b;
            if (dVar instanceof k) {
                ((k) dVar).a(list);
            }
        }
        this.f45184b.setActivity(this.f45190h);
        this.f45184b.setUnitId(this.f45197o);
        this.f45184b.a(this.f45196n);
        return this.f45184b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        MBridgeContainerView mBridgeContainerView = this.f45193k;
        if (mBridgeContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f45187e == null) {
            this.f45187e = new m(mBridgeContainerView);
        }
        return this.f45187e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        WebView webView = this.f45191i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f45186d == null) {
            this.f45186d = new n(webView);
        }
        return this.f45186d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.j getJSVideoModule() {
        MBridgeVideoView mBridgeVideoView = this.f45192j;
        if (mBridgeVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f45185c == null) {
            this.f45185c = new q(mBridgeVideoView);
        }
        return this.f45185c;
    }

    public void a(List<CampaignEx> list) {
        this.f45198p = list;
    }

    public b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f45190h = activity;
        this.f45195m = mBridgeBTContainer;
        this.f45191i = webView;
    }

    public b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, a.InterfaceC0353a interfaceC0353a) {
        this.f45190h = activity;
        this.f45191i = webView;
        this.f45192j = mBridgeVideoView;
        this.f45193k = mBridgeContainerView;
        this.f45194l = campaignEx;
        this.f45196n = interfaceC0353a;
        this.f45197o = mBridgeVideoView.getUnitId();
    }
}
