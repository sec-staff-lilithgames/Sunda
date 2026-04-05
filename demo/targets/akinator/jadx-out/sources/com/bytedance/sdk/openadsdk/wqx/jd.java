package com.bytedance.sdk.openadsdk.wqx;

import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.tu;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    private static volatile jd jpo;

    /* renamed from: jd, reason: collision with root package name */
    private final tu<com.bytedance.sdk.openadsdk.cm.jpo> f21634jd = sq.wqx();

    private jd() {
    }

    public static jd jpo() {
        if (jpo == null) {
            synchronized (jd.class) {
                try {
                    if (jpo == null) {
                        jpo = new jd();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    public void jpo(String str, List<FilterWord> list, String str2) {
        jpo(str, list, null, null, str2);
    }

    public void jpo(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        this.f21634jd.jpo(str, list, jSONObject, str2, str3);
    }
}
