package com.ironsource;

import com.ironsource.D0;
import com.ironsource.InterfaceC3323lb;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.mb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3341mb extends AbstractC3547ya implements Wb {

    /* renamed from: d, reason: collision with root package name */
    private final UUID f37216d;

    /* renamed from: e, reason: collision with root package name */
    private final C3305kb f37217e;

    /* renamed from: f, reason: collision with root package name */
    private Tb f37218f;

    /* renamed from: g, reason: collision with root package name */
    private String f37219g;

    /* renamed from: h, reason: collision with root package name */
    private C3325ld f37220h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC3379ob f37221i;

    /* renamed from: j, reason: collision with root package name */
    private AdapterNativeAdData f37222j;

    /* renamed from: k, reason: collision with root package name */
    private AdapterNativeAdViewBinder f37223k;

    public /* synthetic */ C3341mb(UUID uuid, C3305kb c3305kb, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? C3561z7.f39356a.a() : uuid, c3305kb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3341mb this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        IronLog.API.info(String.valueOf(this$0));
        try {
            Tb tb2 = this$0.f37218f;
            if (tb2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("nativeAdController");
                tb2 = null;
            }
            tb2.q();
            this$0.f37221i = null;
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3341mb this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        Tb tb2 = null;
        if (this$0.c()) {
            IronLog.INTERNAL.warning(C3350n0.a(this$0.a(), "Native ad load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.a(true);
        if (this$0.d()) {
            Tb tb3 = this$0.f37218f;
            if (tb3 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("nativeAdController");
            } else {
                tb2 = tb3;
            }
            tb2.r();
        }
    }

    @Override // com.ironsource.AbstractC3547ya
    public boolean d() {
        this.f37218f = e();
        return true;
    }

    public final AdapterNativeAdViewBinder l() {
        return this.f37223k;
    }

    public final String m() {
        AdapterNativeAdData adapterNativeAdData = this.f37222j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    public final void n() {
        a(new ai(this, 1));
    }

    @Override // com.ironsource.Wb
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        String string = this.f37216d.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "adId.toString()");
        b(new gi(18, this, new LevelPlayAdError(ironSourceError, string, b())));
    }

    private final Tb e() {
        this.f37220h = a().c(this.f37219g);
        UUID uuid = this.f37216d;
        String strB = b();
        C3325ld c3325ld = this.f37220h;
        if (c3325ld == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("placement");
            c3325ld = null;
        }
        C3181dc c3181dc = new C3181dc(uuid, strB, c3325ld);
        a(c3181dc);
        return new Tb(this, a(), c3181dc);
    }

    public final void f() {
        a(new ai(this, 0));
    }

    public final UUID g() {
        return this.f37216d;
    }

    public final String h() {
        AdapterNativeAdData adapterNativeAdData = this.f37222j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    public final String i() {
        AdapterNativeAdData adapterNativeAdData = this.f37222j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    public final String j() {
        AdapterNativeAdData adapterNativeAdData = this.f37222j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    public final InterfaceC3323lb.a k() {
        NativeAdDataInterface.Image icon;
        AdapterNativeAdData adapterNativeAdData = this.f37222j;
        if (adapterNativeAdData == null || (icon = adapterNativeAdData.getIcon()) == null) {
            return null;
        }
        return new InterfaceC3323lb.a(icon.getDrawable(), icon.getUri());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3341mb(UUID adId, C3305kb nativeAd) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeAd, "nativeAd");
        IronSource.a aVar = IronSource.a.NATIVE_AD;
        super(new C3350n0(aVar, D0.b.MEDIATION));
        this.f37216d = adId;
        this.f37217e = nativeAd;
        this.f37219g = "";
        a().e().a(new C3349n(aVar, adId, b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3341mb this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC3379ob interfaceC3379ob = this$0.f37221i;
        if (interfaceC3379ob != null) {
            interfaceC3379ob.b(this$0.f37217e, adInfo);
        }
    }

    public final void a(InterfaceC3379ob interfaceC3379ob) {
        a(new gi(20, this, interfaceC3379ob));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3341mb this$0, InterfaceC3379ob interfaceC3379ob) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f37221i = interfaceC3379ob;
    }

    @Override // com.ironsource.Wb
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        b(new bi(this, adInfo, 0));
    }

    @Override // com.ironsource.Wb
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        IronLog.CALLBACK.info(String.valueOf(this));
        Qb qb2 = new Qb();
        Tb tb2 = this.f37218f;
        if (tb2 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("nativeAdController");
            tb2 = null;
        }
        tb2.a(qb2);
        this.f37222j = qb2.a();
        this.f37223k = qb2.b();
        b(new bi(this, adInfo, 1));
    }

    public final void b(String placementName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placementName, "placementName");
        a(new gi(19, this, placementName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3341mb this$0, LevelPlayAdError levelPlayError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(levelPlayError, "$levelPlayError");
        InterfaceC3379ob interfaceC3379ob = this$0.f37221i;
        if (interfaceC3379ob != null) {
            interfaceC3379ob.a(this$0.f37217e, levelPlayError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3341mb this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC3379ob interfaceC3379ob = this$0.f37221i;
        if (interfaceC3379ob != null) {
            interfaceC3379ob.c(this$0.f37217e, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3341mb this$0, String placementName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(placementName, "$placementName");
        this$0.f37219g = placementName;
    }
}
