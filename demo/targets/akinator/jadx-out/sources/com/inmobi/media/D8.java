package com.inmobi.media;

import com.fyber.inneractive.sdk.external.NativeAdContent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class D8 extends C2903n8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8(String assetId, String assetName, C2920o8 assetStyle, String url) {
        super(assetId, assetName, NativeAdContent.ViewTag.AD_ICON, assetStyle, 16);
        kotlin.jvm.internal.e0.checkNotNullParameter(assetId, "assetId");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetName, "assetName");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetStyle, "assetStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        this.f33140e = url;
    }
}
