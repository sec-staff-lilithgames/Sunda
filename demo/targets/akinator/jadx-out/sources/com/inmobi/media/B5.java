package com.inmobi.media;

import android.content.Context;
import com.ironsource.C3191e4;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class B5 extends U1 {

    /* renamed from: c, reason: collision with root package name */
    public static final B5 f31649c = new B5();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f31650d = new AtomicBoolean(true);

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        AtomicBoolean atomicBoolean = f31650d;
        jSONObject.put("a-audioBannerEnabled", String.valueOf(atomicBoolean.get()));
        if (atomicBoolean.get()) {
            long j10 = this.f32338a / 1000;
            if (j10 != 0) {
                jSONObject.put("a-lastAudioBannerPlayedTs", String.valueOf(j10));
            }
            int i10 = this.f32339b;
            if (i10 > 0) {
                jSONObject.put("a-audioBannerFreq", String.valueOf(i10));
            }
            Context contextD = C2925od.d();
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6 i6A = H6.a(contextD, "banner_audio_pref_file");
                kotlin.jvm.internal.e0.checkNotNullParameter("user_mute_count", C3191e4.h.W);
                int i11 = i6A.f31866a.getInt("user_mute_count", -1);
                if (i11 > 0) {
                    jSONObject.put("a-b-umc", String.valueOf(i11));
                }
            }
        }
        return jSONObject;
    }
}
