package com.inmobi.media;

import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class P9 extends C2903n8 {

    /* renamed from: x, reason: collision with root package name */
    public final boolean f32128x;

    /* renamed from: y, reason: collision with root package name */
    public String f32129y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f32130z;

    public final void b() {
        this.f32130z = true;
    }

    public final void e(String str) {
        this.f32129y = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P9(String assetId, String str, C2920o8 assetStyle, String textValue, boolean z10) {
        super(assetId, str, "WEBVIEW", assetStyle, 16);
        kotlin.jvm.internal.e0.checkNotNullParameter(assetId, "assetId");
        kotlin.jvm.internal.e0.checkNotNullParameter(str, QFzuMMDfrzagDN.ZlD);
        kotlin.jvm.internal.e0.checkNotNullParameter(assetStyle, "assetStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(textValue, "textValue");
        this.f32128x = z10;
        this.f33140e = textValue;
    }
}
