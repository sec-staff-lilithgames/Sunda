package com.inmobi.media;

import android.content.Context;
import com.ironsource.C3191e4;
import com.ironsource.C3271ic;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class U extends X9 {
    public String A;
    public String B;
    public String C;
    public Map D;

    /* renamed from: y, reason: collision with root package name */
    public final C2675a0 f32310y;

    /* renamed from: z, reason: collision with root package name */
    public final C2804ha f32311z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(String str, Te te2, String str2, C2675a0 adPlacement, C2804ha c2804ha, F5 f52, boolean z10) {
        super(C3271ic.f36944b, str, te2, false, f52, "application/x-www-form-urlencoded", z10);
        kotlin.jvm.internal.e0.checkNotNullParameter(adPlacement, "adPlacement");
        this.f32310y = adPlacement;
        this.f32311z = c2804ha;
        this.A = "json";
        this.f32504m = C2925od.b();
        HashMap map = this.f32502k;
        if (map != null) {
            map.putAll(AbstractC2679a4.c());
            String str3 = C2778g1.f32856b;
            if (str3 != null) {
            }
            map.put("client-request-id", adPlacement.d());
            if (str2 != null) {
                map.put("u-appcache", str2);
            }
            map.put("sdk-flavor", "row");
        }
    }

    public static JSONObject a(String adType) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(adType, "adType");
        if (kotlin.jvm.internal.e0.areEqual(adType, "banner")) {
            return B5.f31649c.a();
        }
        if (!kotlin.jvm.internal.e0.areEqual("audio", adType)) {
            return new JSONObject();
        }
        C3069x5 c3069x5 = C3069x5.f33562c;
        JSONObject jSONObject = new JSONObject();
        long j10 = c3069x5.f32338a / 1000;
        if (j10 != 0) {
            jSONObject.put("a-lastAudioPlayedTs", String.valueOf(j10));
        }
        int i10 = c3069x5.f32339b;
        if (i10 > 0) {
            jSONObject.put("a-audioFreq", String.valueOf(i10));
        }
        Context contextD = C2925od.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = I6.f31865b;
            I6 i6A = H6.a(contextD, "audio_pref_file");
            kotlin.jvm.internal.e0.checkNotNullParameter("user_mute_count", C3191e4.h.W);
            int i11 = i6A.f31866a.getInt("user_mute_count", -1);
            if (i11 > 0) {
                jSONObject.put("a-umc", String.valueOf(i11));
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cc  */
    @Override // com.inmobi.media.X9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.U.f():void");
    }
}
