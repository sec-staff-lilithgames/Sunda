package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class X implements W {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3414qc f35697a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Nc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3160c9 f35698a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InitListener f35699b;

        public a(C3160c9 c3160c9, InitListener initListener) {
            this.f35698a = c3160c9;
            this.f35699b = initListener;
        }

        @Override // com.ironsource.Nc
        public void onFail(C3477u8 error) {
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
            IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + error);
            this.f35699b.onInitFailed(C3559z5.f39348a.a(new IronSourceError(error.a(), error.b())));
        }

        @Override // com.ironsource.Nc
        public void onSuccess() {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            V vE = this.f35698a.e();
            com.google.android.gms.internal.play_billing.a.u("controllerURL = ", vE != null ? vE.c() : null, ironLog);
            V vE2 = this.f35698a.e();
            ironLog.verbose("controllerConfig = " + (vE2 != null ? vE2.a() : null));
            V vE3 = this.f35698a.e();
            ironLog.verbose("debugMode = " + (vE3 != null ? Integer.valueOf(vE3.b()) : null));
            com.google.android.gms.internal.play_billing.a.u("applicationKey = ", this.f35698a.d(), ironLog);
            com.google.android.gms.internal.play_billing.a.u("userId = ", this.f35698a.h(), ironLog);
            this.f35699b.onInitSuccess();
        }
    }

    public X(InterfaceC3414qc networkInitApi) {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkInitApi, "networkInitApi");
        this.f35697a = networkInitApi;
    }

    @Override // com.ironsource.W
    public void a(Context context, C3160c9 initConfig, InitListener initListener) {
        JSONObject jSONObjectA;
        String strC;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(initConfig, "initConfig");
        kotlin.jvm.internal.e0.checkNotNullParameter(initListener, "initListener");
        InterfaceC3414qc interfaceC3414qc = this.f35697a;
        V vE = initConfig.e();
        interfaceC3414qc.a(vE != null ? vE.b() : 0);
        V vE2 = initConfig.e();
        if (vE2 != null && (strC = vE2.c()) != null) {
            this.f35697a.b(strC);
        }
        V vE3 = initConfig.e();
        if (vE3 != null && (jSONObjectA = vE3.a()) != null) {
            InterfaceC3414qc interfaceC3414qc2 = this.f35697a;
            String string = jSONObjectA.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "applicationConfig.toString()");
            interfaceC3414qc2.a(string);
        }
        Map<String, String> mapA = new C3380oc().a();
        this.f35697a.a(new a(initConfig, initListener));
        this.f35697a.a(context, initConfig.d(), initConfig.h(), mapA);
    }
}
