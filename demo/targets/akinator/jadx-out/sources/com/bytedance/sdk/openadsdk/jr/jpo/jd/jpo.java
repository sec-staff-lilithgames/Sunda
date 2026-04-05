package com.bytedance.sdk.openadsdk.jr.jpo.jd;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.core.settings.au;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.ironsource.Q6;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: cm, reason: collision with root package name */
    private static volatile jpo f21247cm;
    private AtomicLong jpo = new AtomicLong(0);

    /* renamed from: jd, reason: collision with root package name */
    private int f21248jd = 0;
    private String wqx = "";

    private jpo() {
    }

    public static jpo jpo() {
        if (f21247cm == null) {
            synchronized (jpo.class) {
                try {
                    if (f21247cm == null) {
                        f21247cm = new jpo();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f21247cm;
    }

    public String jd() {
        return wqx() ? this.wqx : "";
    }

    public boolean wqx() {
        return au.jrx().se(Q6.U0);
    }

    public void jpo(String str) {
        this.wqx = str;
    }

    public void jpo(boolean z10) {
        if (this.f21248jd == 1 || !TextUtils.isEmpty(jd())) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (z10 || this.jpo.get() <= jElapsedRealtime) {
            this.jpo.set(jElapsedRealtime + 300000);
            duq.jpo((xyk) new DeviceUtils.wqx());
        }
    }

    public void jpo(int i10) {
        this.f21248jd = i10;
    }

    public void jpo(JSONObject jSONObject) {
        if (!wqx() || jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(Q6.U0, this.wqx);
        } catch (JSONException unused) {
        }
    }
}
