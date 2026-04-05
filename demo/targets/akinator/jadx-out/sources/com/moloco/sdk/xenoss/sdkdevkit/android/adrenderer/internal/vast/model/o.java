package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f49359a;

    /* renamed from: b, reason: collision with root package name */
    public final List f49360b;

    public o(String clickThroughUrl, List<String> clickTrackingUrlList) {
        e0.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        e0.checkNotNullParameter(clickTrackingUrlList, "clickTrackingUrlList");
        this.f49359a = clickThroughUrl;
        this.f49360b = clickTrackingUrlList;
    }

    public final String a() {
        return this.f49359a;
    }

    public final List<String> b() {
        return this.f49360b;
    }
}
