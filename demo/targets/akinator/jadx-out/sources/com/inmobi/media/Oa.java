package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Oa implements P2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Pa f32094a;

    public Oa(Pa pa2) {
        this.f32094a = pa2;
    }

    @Override // com.inmobi.media.P2
    public final void a(Config config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        if (config instanceof AdConfig) {
            AdConfig.PingsV2Config pingsV2Config = ((AdConfig) config).getPingsV2Config();
            Pa pa2 = this.f32094a;
            pa2.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(pingsV2Config, QpyI.CaPahQ);
            pa2.f32136f = pingsV2Config;
        }
    }
}
