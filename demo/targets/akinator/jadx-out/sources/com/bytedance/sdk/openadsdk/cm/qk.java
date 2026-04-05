package com.bytedance.sdk.openadsdk.cm;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk {

    /* renamed from: cm, reason: collision with root package name */
    private long f19631cm;

    /* renamed from: jd, reason: collision with root package name */
    private long f19632jd;
    private long jpo;
    private long my;
    private long wqx;

    public void cm(long j10) {
        if (this.f19631cm <= 0) {
            this.f19631cm = j10;
        }
    }

    public void jd(long j10) {
        if (this.f19632jd <= 0) {
            this.f19632jd = j10;
        }
    }

    public void jpo(long j10) {
        if (this.jpo <= 0) {
            this.jpo = j10;
        }
    }

    public void my(long j10) {
        if (this.my <= 0) {
            this.my = j10;
        }
    }

    public void wqx(long j10) {
        if (this.wqx <= 0) {
            this.wqx = j10;
        }
    }

    public JSONObject jd() {
        return jpo((JSONObject) null);
    }

    public boolean jpo() {
        return this.jpo > 0;
    }

    public void jpo(long j10, float f10) {
        if (f10 > 0.0f) {
            jpo(j10);
        }
        double d10 = f10;
        if (d10 >= 0.25d) {
            jpo(j10);
            jd(j10);
        }
        if (d10 >= 0.5d) {
            jpo(j10);
            jd(j10);
            wqx(j10);
        }
        if (d10 >= 0.75d) {
            jpo(j10);
            jd(j10);
            wqx(j10);
            cm(j10);
        }
        if (f10 >= 1.0f) {
            jpo(j10);
            jd(j10);
            wqx(j10);
            cm(j10);
            my(j10);
        }
    }

    public JSONObject jpo(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        long j10 = this.jpo;
        if (j10 > 0) {
            jSONObject.put("show_start", j10);
            long j11 = this.f19632jd;
            if (j11 > 0) {
                jSONObject.put("show_firstQuartile", j11);
                long j12 = this.wqx;
                if (j12 > 0) {
                    jSONObject.put("show_mid", j12);
                    long j13 = this.f19631cm;
                    if (j13 > 0) {
                        jSONObject.put("show_thirdQuartile", j13);
                        long j14 = this.my;
                        if (j14 > 0) {
                            jSONObject.put("show_full", j14);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
