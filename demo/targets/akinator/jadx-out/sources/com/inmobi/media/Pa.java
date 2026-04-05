package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Pa {

    /* renamed from: a, reason: collision with root package name */
    public final Za f32131a;

    /* renamed from: b, reason: collision with root package name */
    public final La f32132b;

    /* renamed from: c, reason: collision with root package name */
    public final Ua f32133c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Ma f32134d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f32135e;

    /* renamed from: f, reason: collision with root package name */
    public AdConfig.PingsV2Config f32136f;

    public Pa(Za dao, La la2, Ua networkHandler) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dao, "dao");
        kotlin.jvm.internal.e0.checkNotNullParameter(networkHandler, "networkHandler");
        this.f32131a = dao;
        this.f32132b = la2;
        this.f32133c = networkHandler;
        this.f32134d = Ma.f32031a;
        this.f32135e = new ConcurrentHashMap();
        Oa oa2 = new Oa(this);
        LinkedHashMap linkedHashMap = Q2.f32149a;
        Config configA = O2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, C2925od.b(), oa2);
        kotlin.jvm.internal.e0.checkNotNull(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
        this.f32136f = ((AdConfig) configA).getPingsV2Config();
    }

    public final void a(Ja ping, ExecutorService executorService, kv.l onPingResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ping, "ping");
        kotlin.jvm.internal.e0.checkNotNullParameter(onPingResponse, "onPingResponse");
        if (this.f32134d == Ma.f32031a || this.f32135e.containsKey(ping.f31914b)) {
            return;
        }
        this.f32135e.put(ping.f31914b, ping.f31913a);
        if (executorService != null) {
            executorService.execute(new io.bidmachine.media3.exoplayer.b1(onPingResponse, 21, this, ping));
        }
    }

    public static final void a(kv.l onPingResponse, Pa this$0, Ja ping) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onPingResponse, "$onPingResponse");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(ping, "$ping");
        onPingResponse.invoke(this$0.f32133c.a(ping));
        this$0.f32135e.remove(ping.f31914b);
    }

    public final boolean a(Ma ma2) {
        int iOrdinal = ma2.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    if (this.f32134d.compareTo(Ma.f32033c) >= 0) {
                        return false;
                    }
                } else {
                    throw new tu.t();
                }
            } else if (this.f32134d != Ma.f32033c) {
                return false;
            }
        } else if (this.f32134d == Ma.f32031a) {
            return false;
        }
        return true;
    }
}
