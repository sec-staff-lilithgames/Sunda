package com.inmobi.media;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.v8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3038v8 extends X8 {
    public /* synthetic */ C3038v8(String str, String str2, C3021u8 c3021u8, String str3, String str4) {
        this(str, str2, c3021u8, str3, new ArrayList(), str4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3038v8(String assetId, String assetName, C3021u8 assetStyle, String str, List trackers, String interactionMode) {
        super(assetId, assetName, NativeAdContent.ViewTag.CTA, assetStyle, str);
        kotlin.jvm.internal.e0.checkNotNullParameter(assetId, "assetId");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetName, "assetName");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetStyle, "assetStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(trackers, "trackers");
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionMode, "interactionMode");
        kotlin.jvm.internal.e0.checkNotNullParameter(trackers, "trackers");
        this.f33154s.addAll(trackers);
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionMode, "<set-?>");
        this.f33142g = interactionMode;
    }
}
