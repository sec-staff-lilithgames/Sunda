package com.inmobi.media;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Lf extends Z5 {

    /* renamed from: g, reason: collision with root package name */
    public final StackTraceElement[] f32013g;

    public Lf(StackTraceElement[] stackTrace) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(stackTrace, "stackTrace");
        ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
        kotlin.jvm.internal.e0.checkNotNullParameter("Blocked", "name");
        kotlin.jvm.internal.e0.checkNotNullParameter("MainThreadBlocked", PglCryptUtils.KEY_MESSAGE);
        kotlin.jvm.internal.e0.checkNotNullParameter(stackTrace, "stackTrace");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "Blocked");
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, "MainThreadBlocked");
            jSONObject.put("stack", AbstractC2809hf.a(stackTrace));
        } catch (JSONException e10) {
            e10.toString();
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        super("ANRWatchDog", "ANRWatchDogEvent", string);
        this.f32013g = stackTrace;
    }
}
