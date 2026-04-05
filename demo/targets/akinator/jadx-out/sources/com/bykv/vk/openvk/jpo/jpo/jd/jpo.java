package com.bykv.vk.openvk.jpo.jpo.jd;

import com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jd;
import com.ironsource.C3434s;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: cm, reason: collision with root package name */
    public static int f16683cm = 10;

    /* renamed from: jd, reason: collision with root package name */
    public static int f16684jd = 10;
    public static int jpo = 10;
    private static jd my = null;
    public static int wqx = 10;

    public static int cm() {
        return wqx;
    }

    public static int jd() {
        return jpo;
    }

    public static void jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jpo = jSONObject.optInt("splash", 10);
            f16684jd = jSONObject.optInt(C3434s.f38309j, 10);
            wqx = jSONObject.optInt("brand", 10);
            int iOptInt = jSONObject.optInt("other", 10);
            f16683cm = iOptInt;
            if (jpo < 0) {
                jpo = 10;
            }
            if (f16684jd < 0) {
                f16684jd = 10;
            }
            if (wqx < 0) {
                wqx = 10;
            }
            if (iOptInt < 0) {
                f16683cm = 10;
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public static int my() {
        return f16683cm;
    }

    public static int wqx() {
        return f16684jd;
    }

    public static void jpo(jd jdVar) {
        my = jdVar;
    }

    public static void jpo() {
        jd jdVar = my;
        if (jdVar != null) {
            jdVar.cm();
        }
    }
}
