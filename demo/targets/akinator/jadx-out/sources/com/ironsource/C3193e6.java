package com.ironsource;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.e6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3193e6 implements Lc {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC3211f6 f36569a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<InterfaceC3229g6> f36570b = new WeakReference<>(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.e6$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36571a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final String f36572b = "impressions";

        private a() {
        }
    }

    public final void a(InterfaceC3211f6 loadListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(loadListener, "loadListener");
        this.f36569a = loadListener;
    }

    @Override // com.ironsource.Lc
    public void onInterstitialAdRewarded(String str, int i10) {
        InterfaceC3229g6 interfaceC3229g6 = this.f36570b.get();
        if (interfaceC3229g6 != null) {
            interfaceC3229g6.onAdInstanceDidReward(str, i10);
        }
    }

    @Override // com.ironsource.Lc
    public void onInterstitialClick() {
        InterfaceC3229g6 interfaceC3229g6 = this.f36570b.get();
        if (interfaceC3229g6 != null) {
            interfaceC3229g6.onAdInstanceDidClick();
        }
    }

    @Override // com.ironsource.Lc
    public void onInterstitialClose() {
        InterfaceC3229g6 interfaceC3229g6 = this.f36570b.get();
        if (interfaceC3229g6 != null) {
            interfaceC3229g6.onAdInstanceDidDismiss();
        }
    }

    @Override // com.ironsource.Lc
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        InterfaceC3229g6 interfaceC3229g6;
        if (!kotlin.jvm.internal.e0.areEqual(str, "impressions") || (interfaceC3229g6 = this.f36570b.get()) == null) {
            return;
        }
        interfaceC3229g6.onAdInstanceDidBecomeVisible();
    }

    @Override // com.ironsource.Lc
    public void onInterstitialLoadFailed(String description) {
        kotlin.jvm.internal.e0.checkNotNullParameter(description, "description");
        InterfaceC3211f6 interfaceC3211f6 = this.f36569a;
        if (interfaceC3211f6 != null) {
            interfaceC3211f6.a(description);
        }
    }

    @Override // com.ironsource.Lc
    public void onInterstitialLoadSuccess(M9 adInstance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        InterfaceC3211f6 interfaceC3211f6 = this.f36569a;
        if (interfaceC3211f6 != null) {
            interfaceC3211f6.a(adInstance);
        }
    }

    @Override // com.ironsource.Lc
    public void onInterstitialOpen() {
        InterfaceC3229g6 interfaceC3229g6 = this.f36570b.get();
        if (interfaceC3229g6 != null) {
            interfaceC3229g6.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.Lc
    public void onInterstitialShowFailed(String str) {
        InterfaceC3229g6 interfaceC3229g6 = this.f36570b.get();
        if (interfaceC3229g6 != null) {
            interfaceC3229g6.a(str);
        }
    }

    public final void a(InterfaceC3229g6 showListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(showListener, "showListener");
        this.f36570b = new WeakReference<>(showListener);
    }

    @Override // com.ironsource.Lc
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.Lc
    public void onInterstitialShowSuccess() {
    }

    @Override // com.ironsource.Lc
    public void onInterstitialInitFailed(String str) {
    }
}
