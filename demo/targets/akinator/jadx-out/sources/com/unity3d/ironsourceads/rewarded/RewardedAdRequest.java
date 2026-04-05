package com.unity3d.ironsourceads.rewarded;

import android.os.Bundle;
import com.ironsource.C3549yc;
import com.ironsource.InterfaceC3567zd;
import com.ironsource.X9;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RewardedAdRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f50629a;

    /* renamed from: b, reason: collision with root package name */
    private final String f50630b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f50631c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3567zd f50632d;

    /* renamed from: e, reason: collision with root package name */
    private final String f50633e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f50634a;

        /* renamed from: b, reason: collision with root package name */
        private final String f50635b;

        /* renamed from: c, reason: collision with root package name */
        private Bundle f50636c;

        public Builder(String instanceId, String adm) {
            e0.checkNotNullParameter(instanceId, "instanceId");
            e0.checkNotNullParameter(adm, "adm");
            this.f50634a = instanceId;
            this.f50635b = adm;
        }

        public final RewardedAdRequest build() {
            IronLog.API.info("instanceId: " + this.f50634a);
            return new RewardedAdRequest(this.f50634a, this.f50635b, this.f50636c, null);
        }

        public final String getAdm() {
            return this.f50635b;
        }

        public final String getInstanceId() {
            return this.f50634a;
        }

        public final Builder withExtraParams(Bundle extraParams) {
            e0.checkNotNullParameter(extraParams, "extraParams");
            this.f50636c = extraParams;
            return this;
        }
    }

    public /* synthetic */ RewardedAdRequest(String str, String str2, Bundle bundle, u uVar) {
        this(str, str2, bundle);
    }

    public final String getAdId$mediationsdk_release() {
        return this.f50633e;
    }

    public final String getAdm() {
        return this.f50630b;
    }

    public final Bundle getExtraParams() {
        return this.f50631c;
    }

    public final String getInstanceId() {
        return this.f50629a;
    }

    public final InterfaceC3567zd getProviderName$mediationsdk_release() {
        return this.f50632d;
    }

    private RewardedAdRequest(String str, String str2, Bundle bundle) {
        this.f50629a = str;
        this.f50630b = str2;
        this.f50631c = bundle;
        this.f50632d = new C3549yc(str);
        String strB = X9.b();
        e0.checkNotNullExpressionValue(strB, "generateMultipleUniqueInstanceId()");
        this.f50633e = strB;
    }
}
