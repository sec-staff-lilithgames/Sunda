package com.unity3d.ironsourceads.interstitial;

import android.os.Bundle;
import com.ironsource.C3549yc;
import com.ironsource.InterfaceC3567zd;
import com.ironsource.X9;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InterstitialAdRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f50616a;

    /* renamed from: b, reason: collision with root package name */
    private final String f50617b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f50618c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3567zd f50619d;

    /* renamed from: e, reason: collision with root package name */
    private final String f50620e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f50621a;

        /* renamed from: b, reason: collision with root package name */
        private final String f50622b;

        /* renamed from: c, reason: collision with root package name */
        private Bundle f50623c;

        public Builder(String instanceId, String adm) {
            e0.checkNotNullParameter(instanceId, "instanceId");
            e0.checkNotNullParameter(adm, "adm");
            this.f50621a = instanceId;
            this.f50622b = adm;
        }

        public final InterstitialAdRequest build() {
            IronLog.API.info("instanceId: " + this.f50621a);
            return new InterstitialAdRequest(this.f50621a, this.f50622b, this.f50623c, null);
        }

        public final String getAdm() {
            return this.f50622b;
        }

        public final String getInstanceId() {
            return this.f50621a;
        }

        public final Builder withExtraParams(Bundle extraParams) {
            e0.checkNotNullParameter(extraParams, "extraParams");
            this.f50623c = extraParams;
            return this;
        }
    }

    public /* synthetic */ InterstitialAdRequest(String str, String str2, Bundle bundle, u uVar) {
        this(str, str2, bundle);
    }

    public final String getAdId$mediationsdk_release() {
        return this.f50620e;
    }

    public final String getAdm() {
        return this.f50617b;
    }

    public final Bundle getExtraParams() {
        return this.f50618c;
    }

    public final String getInstanceId() {
        return this.f50616a;
    }

    public final InterfaceC3567zd getProviderName$mediationsdk_release() {
        return this.f50619d;
    }

    private InterstitialAdRequest(String str, String str2, Bundle bundle) {
        this.f50616a = str;
        this.f50617b = str2;
        this.f50618c = bundle;
        this.f50619d = new C3549yc(str);
        String strB = X9.b();
        e0.checkNotNullExpressionValue(strB, "generateMultipleUniqueInstanceId()");
        this.f50620e = strB;
    }
}
