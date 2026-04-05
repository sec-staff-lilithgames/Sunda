package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ua {

    /* renamed from: a, reason: collision with root package name */
    public final Ta f32362a;

    public Ua(AdConfig.PingsV2Config pingsV2Config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pingsV2Config, "pingsV2Config");
        this.f32362a = pingsV2Config.getEnableOkhttp() ? new C2939pa(pingsV2Config) : new Z6(pingsV2Config);
    }

    public final Na a(Ja ping) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ping, "ping");
        Ta ta2 = this.f32362a;
        Object objA = ta2 != null ? ta2.a(ping) : null;
        if (objA instanceof Y9) {
            Y9 y92 = (Y9) objA;
            String str = ping.f31913a;
            y92.a();
            y92.b();
            return new Na(ping, y92.a(), y92.b());
        }
        if (!(objA instanceof Z9)) {
            EnumC3000t4[] enumC3000t4Arr = EnumC3000t4.f33385a;
            return new Na(ping, -106, "Ping response is unknown");
        }
        Z9 z92 = (Z9) objA;
        String str2 = ping.f31913a;
        Integer num = z92.f32601c;
        int iIntValue = num != null ? num.intValue() : 0;
        S9 s92 = z92.f32602d;
        return new Na(ping, iIntValue, s92 != null ? s92.f32267b : null);
    }
}
