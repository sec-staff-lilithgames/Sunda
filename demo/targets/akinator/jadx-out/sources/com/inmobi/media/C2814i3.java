package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.i3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2814i3 implements P2 {
    @Override // com.inmobi.media.P2
    public final void a(Config config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        synchronized (this) {
            try {
                C2830j3 c2830j3 = C2830j3.f32954a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("j3", "<get-TAG>(...)");
                SignalsConfig signalsConfig = (SignalsConfig) config;
                C2830j3.f32957d = signalsConfig;
                C2830j3.f32959f = AbstractC2933p4.a(signalsConfig != null ? signalsConfig.getAK() : null);
                c2830j3.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
