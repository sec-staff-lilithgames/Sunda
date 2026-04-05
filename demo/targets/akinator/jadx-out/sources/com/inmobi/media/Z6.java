package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Z6 implements Ta {
    public Z6(AdConfig.PingsV2Config pingsConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pingsConfig, "pingsConfig");
    }

    @Override // com.inmobi.media.Ta
    public final Object a(Ja ping) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ping, "ping");
        X9 mRequest = new X9(ping.f31913a, null);
        HashMap map = new HashMap(ping.f31915c);
        map.put("user-agent", C2925od.k());
        mRequest.f32500i.putAll(map);
        mRequest.f32515x = false;
        mRequest.f32511t = false;
        mRequest.f32512u = false;
        mRequest.f32509r = ping.f31916d;
        kotlin.jvm.internal.e0.checkNotNullParameter(mRequest, "request");
        kotlin.jvm.internal.e0.checkNotNullParameter(mRequest, "mRequest");
        return mRequest.b();
    }
}
