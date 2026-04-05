package com.inmobi.media;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.f1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2761f1 extends Z5 {

    /* renamed from: g, reason: collision with root package name */
    public final int f32828g;

    /* renamed from: h, reason: collision with root package name */
    public final String f32829h;

    public C2761f1(String str, int i10, String trace) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(trace, "trace");
        StringBuilder sb2 = new StringBuilder("reason - ");
        sb2.append(i10);
        sb2.append(" description - ");
        sb2.append(str == null ? "ApplicationExit" : str);
        String message = sb2.toString();
        ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
        kotlin.jvm.internal.e0.checkNotNullParameter("AppExitEvent", "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.e0.checkNotNullParameter(trace, "trace");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "AppExitEvent");
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, message);
            jSONObject.put("stack", trace);
        } catch (JSONException e10) {
            e10.toString();
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        super("AppExitReasonReporting", "AppExitReasonEvent", string);
        this.f32828g = i10;
        this.f32829h = trace;
    }
}
