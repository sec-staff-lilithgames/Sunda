package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f49303a;

    /* renamed from: b, reason: collision with root package name */
    public final List f49304b;

    /* renamed from: c, reason: collision with root package name */
    public final List f49305c;

    public a(b0 b0Var, List<b0> clickTrackingList, List<b0> customClickList) {
        e0.checkNotNullParameter(clickTrackingList, "clickTrackingList");
        e0.checkNotNullParameter(customClickList, "customClickList");
        this.f49303a = b0Var;
        this.f49304b = clickTrackingList;
        this.f49305c = customClickList;
    }

    public final b0 a() {
        return this.f49303a;
    }

    public final List<b0> b() {
        return this.f49304b;
    }

    public final List<b0> c() {
        return this.f49305c;
    }
}
