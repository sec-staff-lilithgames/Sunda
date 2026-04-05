package com.inmobi.media;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class C8 extends C2903n8 {

    /* renamed from: x, reason: collision with root package name */
    public final String f31709x;

    /* renamed from: y, reason: collision with root package name */
    public final tu.o f31710y;

    public /* synthetic */ C8(String str, String str2, C2920o8 c2920o8, String str3, String str4, JSONObject jSONObject) {
        this(str, str2, c2920o8, str3, new ArrayList(), str4, jSONObject);
    }

    public static final O4 a(C8 c82, String str) {
        c82.getClass();
        return Build.VERSION.SDK_INT < 28 ? new P4(str) : new Z0(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8(String assetId, String assetName, C2920o8 assetStyle, String url, List trackers, String interactionMode, JSONObject jSONObject) {
        super(assetId, assetName, "GIF", assetStyle, trackers);
        kotlin.jvm.internal.e0.checkNotNullParameter(assetId, "assetId");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetName, "assetName");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetStyle, "assetStyle");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(trackers, "trackers");
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionMode, "interactionMode");
        this.f31709x = "C8";
        this.f31710y = tu.q.lazy(new B8(this, url));
        C2925od.a(new al.a(url, this, jSONObject, interactionMode));
    }

    public static final void a(String url, C8 this$0, JSONObject jSONObject, String interactionMode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "$url");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionMode, "$interactionMode");
        C2826j c2826jB = AbstractC2807hd.a().b(url);
        this$0.f33140e = c2826jB != null ? c2826jB.f32941c : null;
        if (jSONObject != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(interactionMode, "<set-?>");
            this$0.f33142g = interactionMode;
        }
    }
}
