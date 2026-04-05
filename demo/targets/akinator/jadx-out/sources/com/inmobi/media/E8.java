package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class E8 extends C2903n8 {
    public /* synthetic */ E8(String str, String str2, C2920o8 c2920o8, String str3, String str4, JSONObject jSONObject) {
        this(str, str2, c2920o8, str3, new ArrayList(), str4, jSONObject);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E8(String assetId, String assetName, C2920o8 assetStyle, String url, List trackers, String interactionMode, JSONObject jSONObject) {
        super(assetId, assetName, "IMAGE", assetStyle, trackers);
        kotlin.jvm.internal.e0.checkNotNullParameter(assetId, "assetId");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetName, "assetName");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetStyle, "assetStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(trackers, "trackers");
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionMode, "interactionMode");
        this.f33140e = url;
        if (jSONObject != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(interactionMode, "<set-?>");
            this.f33142g = interactionMode;
        }
    }
}
