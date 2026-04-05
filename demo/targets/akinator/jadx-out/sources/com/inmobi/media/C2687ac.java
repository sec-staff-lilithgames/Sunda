package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import kotlin.reflect.KProperty;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ac, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2687ac {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f32653a = {kotlin.jvm.internal.c1.property1(new kotlin.jvm.internal.s0(C2687ac.class, "areImraidLogsEnabled", "getAreImraidLogsEnabled()Z", 0))};

    public static JSONObject a(String browser, String event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(browser, "browser");
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("browser", browser);
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, event);
        return jSONObject;
    }
}
