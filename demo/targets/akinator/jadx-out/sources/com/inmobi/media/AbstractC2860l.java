package com.inmobi.media;

import android.net.Uri;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2860l {
    public static String a(C2826j asset, File file, long j10, long j11) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", asset.f32940b);
            jSONObject.put("saved_url", Uri.fromFile(file));
            jSONObject.put("size_in_bytes", file.length());
            jSONObject.put("download_started_at", j10);
            jSONObject.put("download_ended_at", j11);
        } catch (JSONException e10) {
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return sv.k0.replace$default(string, "\"", "\\\"", false, 4, (Object) null);
    }
}
