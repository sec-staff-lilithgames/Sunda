package com.bytedance.adsdk.jd.my;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {
    public static com.bytedance.adsdk.jd.wqx.jpo.qk cm(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        return new com.bytedance.adsdk.jd.wqx.jpo.qk(jpo(jsonReader, qkVar, ef.jpo));
    }

    public static com.bytedance.adsdk.jd.wqx.jpo.cm jd(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        return new com.bytedance.adsdk.jd.wqx.jpo.cm(jpo(jsonReader, qkVar, opi.jpo));
    }

    public static com.bytedance.adsdk.jd.wqx.jpo.yd jj(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        return new com.bytedance.adsdk.jd.wqx.jpo.yd(jpo(jsonReader, com.bytedance.adsdk.jd.jj.jj.jpo(), qkVar, zz.jpo));
    }

    public static com.bytedance.adsdk.jd.wqx.jpo.jd jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        return jpo(jsonReader, qkVar, true);
    }

    public static com.bytedance.adsdk.jd.wqx.jpo.xyk my(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        return new com.bytedance.adsdk.jd.wqx.jpo.xyk(jpo(jsonReader, com.bytedance.adsdk.jd.jj.jj.jpo(), qkVar, nzb.jpo));
    }

    public static com.bytedance.adsdk.jd.wqx.jpo.jpo qk(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        return new com.bytedance.adsdk.jd.wqx.jpo.jpo(jpo(jsonReader, qkVar, qk.jpo));
    }

    public static com.bytedance.adsdk.jd.wqx.jpo.jj wqx(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar) throws IOException {
        return new com.bytedance.adsdk.jd.wqx.jpo.jj(rq.jpo(jsonReader, qkVar, com.bytedance.adsdk.jd.jj.jj.jpo(), pdm.jpo, true));
    }

    public static com.bytedance.adsdk.jd.wqx.jpo.jd jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar, boolean z10) throws IOException {
        return new com.bytedance.adsdk.jd.wqx.jpo.jd(jpo(jsonReader, z10 ? com.bytedance.adsdk.jd.jj.jj.jpo() : 1.0f, qkVar, Cif.jpo));
    }

    public static com.bytedance.adsdk.jd.wqx.jpo.wqx jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar, int i10) throws IOException {
        return new com.bytedance.adsdk.jd.wqx.jpo.wqx(jpo(jsonReader, qkVar, new prr(i10)));
    }

    private static <T> List<com.bytedance.adsdk.jd.qk.jpo<T>> jpo(JsonReader jsonReader, com.bytedance.adsdk.jd.qk qkVar, roc<T> rocVar) throws IOException {
        return rq.jpo(jsonReader, qkVar, 1.0f, rocVar, false);
    }

    private static <T> List<com.bytedance.adsdk.jd.qk.jpo<T>> jpo(JsonReader jsonReader, float f10, com.bytedance.adsdk.jd.qk qkVar, roc<T> rocVar) throws IOException {
        return rq.jpo(jsonReader, qkVar, f10, rocVar, false);
    }
}
