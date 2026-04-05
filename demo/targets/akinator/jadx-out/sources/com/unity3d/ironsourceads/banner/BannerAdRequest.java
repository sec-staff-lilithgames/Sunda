package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C3549yc;
import com.ironsource.InterfaceC3567zd;
import com.ironsource.X9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.AdSize;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BannerAdRequest {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50597a;

    /* renamed from: b, reason: collision with root package name */
    private final String f50598b;

    /* renamed from: c, reason: collision with root package name */
    private final String f50599c;

    /* renamed from: d, reason: collision with root package name */
    private final AdSize f50600d;

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f50601e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3567zd f50602f;

    /* renamed from: g, reason: collision with root package name */
    private final String f50603g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final Context f50604a;

        /* renamed from: b, reason: collision with root package name */
        private final String f50605b;

        /* renamed from: c, reason: collision with root package name */
        private final String f50606c;

        /* renamed from: d, reason: collision with root package name */
        private final AdSize f50607d;

        /* renamed from: e, reason: collision with root package name */
        private Bundle f50608e;

        public Builder(Context context, String instanceId, String adm, AdSize size) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(instanceId, "instanceId");
            e0.checkNotNullParameter(adm, "adm");
            e0.checkNotNullParameter(size, "size");
            this.f50604a = context;
            this.f50605b = instanceId;
            this.f50606c = adm;
            this.f50607d = size;
        }

        public final BannerAdRequest build() {
            IronLog.API.info("instanceId: " + this.f50605b + ", size: " + this.f50607d.getSizeDescription());
            return new BannerAdRequest(this.f50604a, this.f50605b, this.f50606c, this.f50607d, this.f50608e, null);
        }

        public final String getAdm() {
            return this.f50606c;
        }

        public final Context getContext() {
            return this.f50604a;
        }

        public final String getInstanceId() {
            return this.f50605b;
        }

        public final AdSize getSize() {
            return this.f50607d;
        }

        public final Builder withExtraParams(Bundle extraParams) {
            e0.checkNotNullParameter(extraParams, "extraParams");
            this.f50608e = extraParams;
            return this;
        }
    }

    public /* synthetic */ BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle, u uVar) {
        this(context, str, str2, adSize, bundle);
    }

    public final String getAdId$mediationsdk_release() {
        return this.f50603g;
    }

    public final String getAdm() {
        return this.f50599c;
    }

    public final Context getContext() {
        return this.f50597a;
    }

    public final Bundle getExtraParams() {
        return this.f50601e;
    }

    public final String getInstanceId() {
        return this.f50598b;
    }

    public final InterfaceC3567zd getProviderName$mediationsdk_release() {
        return this.f50602f;
    }

    public final AdSize getSize() {
        return this.f50600d;
    }

    private BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle) {
        this.f50597a = context;
        this.f50598b = str;
        this.f50599c = str2;
        this.f50600d = adSize;
        this.f50601e = bundle;
        this.f50602f = new C3549yc(str);
        String strB = X9.b();
        e0.checkNotNullExpressionValue(strB, "generateMultipleUniqueInstanceId()");
        this.f50603g = strB;
    }
}
