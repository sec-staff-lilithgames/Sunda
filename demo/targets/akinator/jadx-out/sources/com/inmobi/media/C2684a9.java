package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.a9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2684a9 extends C2903n8 {

    /* renamed from: x, reason: collision with root package name */
    public final Z8 f32648x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f32649y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2684a9(String assetId, String assetName, C2920o8 assetStyle, Z8 timer) {
        super(assetId, assetName, "TIMER", assetStyle, 16);
        kotlin.jvm.internal.e0.checkNotNullParameter(assetId, "assetId");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetName, "assetName");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetStyle, "assetStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(timer, "timer");
        this.f32648x = timer;
    }

    public final void a(boolean z10) {
        this.f32649y = z10;
    }
}
