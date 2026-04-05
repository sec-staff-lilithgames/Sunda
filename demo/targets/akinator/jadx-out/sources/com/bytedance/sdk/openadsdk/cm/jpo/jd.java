package com.bytedance.sdk.openadsdk.cm.jpo;

import com.amazon.device.ads.DTBMetricReport;
import com.ironsource.C3191e4;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jd {

    /* renamed from: cm, reason: collision with root package name */
    public int f19544cm;
    public AtomicInteger jpo = new AtomicInteger(0);

    /* renamed from: jd, reason: collision with root package name */
    public AtomicInteger f19545jd = new AtomicInteger(0);
    public AtomicLong wqx = new AtomicLong(0);
    public AtomicInteger my = new AtomicInteger(0);

    /* renamed from: jj, reason: collision with root package name */
    public Map<Integer, Integer> f19546jj = new HashMap();

    /* renamed from: qk, reason: collision with root package name */
    public AtomicBoolean f19547qk = new AtomicBoolean(false);

    public jd(int i10) {
        this.f19544cm = i10;
    }

    public JSONObject jd() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", this.jpo.get());
            jSONObject.put(C3191e4.f.f36439e, this.f19545jd.get());
            jSONObject.put("type", this.f19544cm);
            jSONObject.put(DTBMetricReport.TIME, this.my.get());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public JSONObject jpo() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", this.jpo.get());
            jSONObject.put(C3191e4.f.f36439e, this.f19545jd.get());
            jSONObject.put("type", this.f19544cm);
            jSONObject.put(GalEuEfxjome.rHhP, this.wqx.get() / this.jpo.get());
            JSONObject jSONObject2 = new JSONObject();
            if (this.f19546jj.size() > 0) {
                for (Map.Entry<Integer, Integer> entry : this.f19546jj.entrySet()) {
                    jSONObject2.put(String.valueOf(entry.getKey()), entry.getValue());
                }
            }
            jSONObject.put("fail_error_code", jSONObject2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
