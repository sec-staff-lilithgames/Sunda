package com.ironsource;

import android.content.Context;
import com.ironsource.Me;
import com.ironsource.V;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class P9 {

    /* renamed from: a, reason: collision with root package name */
    public static final P9 f35180a = new P9();

    /* renamed from: b, reason: collision with root package name */
    private static final C3303k9 f35181b = new C3303k9();

    private P9() {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements InterfaceC3432re {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f35182a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3317l5 f35183b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InitListener f35184c;

        public b(Context context, C3317l5 c3317l5, InitListener initListener) {
            this.f35182a = context;
            this.f35183b = c3317l5;
            this.f35184c = initListener;
        }

        @Override // com.ironsource.InterfaceC3432re
        public void a(C3326le sdkConfig) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sdkConfig, "sdkConfig");
            P9.f35180a.a(this.f35182a, sdkConfig.d(), this.f35183b, this.f35184c);
        }

        @Override // com.ironsource.InterfaceC3432re
        public void a(C3364ne error) {
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
            P9.f35180a.a(this.f35184c, this.f35183b, error);
        }
    }

    public final void a(Context context, InitRequest initRequest, InitListener initializationListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(initRequest, "initRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(initializationListener, "initializationListener");
        IronLog.API.info("IronSourceAds.init() appkey: " + initRequest.getAppKey() + ", legacyAdFormats: " + initRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        f35181b.a(new lh(initRequest, 0, context, initializationListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitRequest initRequest, Context context, InitListener initializationListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initRequest, "$initRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.e0.checkNotNullParameter(initializationListener, "$initializationListener");
        C3317l5 c3317l5 = new C3317l5();
        Ae.f33847a.c(context, new C3466te(initRequest.getAppKey(), null, uu.k0.toMutableList(f35181b.a(initRequest.getLegacyAdFormats())), 2, null), new b(context, c3317l5, initializationListener));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements InitListener {
        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(IronSourceError error) {
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, Me me2, C3317l5 c3317l5, InitListener initListener) {
        String strT = com.ironsource.mediationsdk.r.m().t();
        C3160c9 c3160c9F = me2.f();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(c3160c9F, "serverResponse.initialConfiguration");
        NetworkSettings networkSettingsB = me2.k().b("IronSource");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(networkSettingsB, "serverResponse.providerS…s.IRONSOURCE_CONFIG_NAME)");
        JSONObject interstitialSettings = networkSettingsB.getInterstitialSettings();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(interstitialSettings, "networkSettings.interstitialSettings");
        c3160c9F.a(new V.a(interstitialSettings));
        c3160c9F.a(ConfigFile.getConfigFile().getPluginType());
        c3160c9F.b(strT);
        new X(new C3430rc()).a(context, c3160c9F, new a());
        a(me2, c3317l5, initListener);
    }

    private final void a(Me me2, C3317l5 c3317l5, InitListener initListener) {
        J1 j1E;
        A1 a1B = me2.c().b();
        new Nb().a((a1B == null || (j1E = a1B.e()) == null) ? null : j1E.b(), true);
        String sessionId = com.ironsource.mediationsdk.r.m().t();
        C3306kc c3306kcA = C3306kc.f37095e.a();
        c3306kcA.a(me2.k());
        c3306kcA.a(me2.c());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sessionId, "sessionId");
        c3306kcA.a(sessionId);
        c3306kcA.g();
        long jA = C3317l5.a(c3317l5);
        C3303k9 c3303k9 = f35181b;
        Me.a aVarH = me2.h();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(aVarH, "serverResponse.origin");
        c3303k9.a(jA, aVarH);
        c3303k9.b(new ch(initListener, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitListener initListener) {
        IronLog.CALLBACK.info("InitListener.onInitSuccess()");
        if (initListener != null) {
            initListener.onInitSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InitListener initListener, C3317l5 c3317l5, C3364ne c3364ne) {
        long jA = C3317l5.a(c3317l5);
        C3303k9 c3303k9 = f35181b;
        c3303k9.a(c3364ne, jA);
        c3303k9.b(new gi(6, c3364ne, initListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3364ne error, InitListener initListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
        IronLog.CALLBACK.info("InitListener.onInitFailed() error " + error);
        if (initListener != null) {
            initListener.onInitFailed(f35181b.a(error));
        }
    }

    public final void a(String key, String value) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        com.ironsource.mediationsdk.r.m().a(key, arrayList);
    }
}
