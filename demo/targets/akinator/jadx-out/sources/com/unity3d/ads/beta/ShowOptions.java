package com.unity3d.ads.beta;

import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ShowOptions {
    private final Map<String, String> extras;

    /* JADX WARN: Multi-variable type inference failed */
    public ShowOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public ShowOptions(Map<String, String> extras) {
        e0.checkNotNullParameter(extras, "extras");
        this.extras = extras;
    }

    public /* synthetic */ ShowOptions(Map map, int i10, u uVar) {
        this((i10 & 1) != 0 ? p1.emptyMap() : map);
    }
}
