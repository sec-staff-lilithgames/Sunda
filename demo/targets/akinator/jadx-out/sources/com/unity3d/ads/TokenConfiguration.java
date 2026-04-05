package com.unity3d.ads;

import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class TokenConfiguration {
    private final AdFormat adFormat;
    private final Map<String, String> extras;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TokenConfiguration(AdFormat adFormat) {
        this(adFormat, null, 2, 0 == true ? 1 : 0);
        e0.checkNotNullParameter(adFormat, "adFormat");
    }

    public final AdFormat getAdFormat() {
        return this.adFormat;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public TokenConfiguration(AdFormat adFormat, Map<String, String> extras) {
        e0.checkNotNullParameter(adFormat, "adFormat");
        e0.checkNotNullParameter(extras, "extras");
        this.adFormat = adFormat;
        this.extras = extras;
    }

    public /* synthetic */ TokenConfiguration(AdFormat adFormat, Map map, int i10, u uVar) {
        this(adFormat, (i10 & 2) != 0 ? p1.emptyMap() : map);
    }
}
