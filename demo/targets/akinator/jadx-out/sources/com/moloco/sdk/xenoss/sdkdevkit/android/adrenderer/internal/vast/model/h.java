package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f49335a;

    /* renamed from: b, reason: collision with root package name */
    public final List f49336b;

    public h(String clickThroughUrl, List<String> clickTrackingUrls) {
        e0.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        e0.checkNotNullParameter(clickTrackingUrls, "clickTrackingUrls");
        this.f49335a = clickThroughUrl;
        this.f49336b = clickTrackingUrls;
    }

    public final String a() {
        return this.f49335a;
    }

    public final List<String> b() {
        return this.f49336b;
    }
}
