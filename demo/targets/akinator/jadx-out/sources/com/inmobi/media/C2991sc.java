package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.sc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2991sc implements Ra {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3093yc f33371a;

    public C2991sc(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc) {
        this.f33371a = gestureDetectorOnGestureListenerC3093yc;
    }

    public final void a(String id2, int i10, String str, long j10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(GestureDetectorOnGestureListenerC3093yc.f33611b1, "access$getTAG$cp(...)");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", i10);
        if (str != null) {
            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str);
        }
        jSONObject.put("retryCount", i11);
        String string = jSONObject.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        this.f33371a.c("window.imraidview.broadcastEvent('onPingComplete', '" + id2 + "', " + j10 + ", '" + string + "');");
    }
}
