package com.bytedance.sdk.openadsdk.core.p000if.jd;

import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.bytedance.sdk.openadsdk.core.p000if.jd.wqx;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends wqx implements Comparable<jpo> {
    public long jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.if.jd.jpo$jpo, reason: collision with other inner class name */
    public static class C0116jpo {

        /* renamed from: jd, reason: collision with root package name */
        private final long f20376jd;
        private final String jpo;
        private wqx.EnumC0117wqx wqx = wqx.EnumC0117wqx.TRACKING_URL;

        public C0116jpo(String str, long j10) {
            this.jpo = str;
            this.f20376jd = j10;
        }

        public jpo jpo() {
            return new jpo(this.f20376jd, this.jpo, this.wqx, Boolean.FALSE);
        }
    }

    public jpo(long j10, String str, wqx.EnumC0117wqx enumC0117wqx, Boolean bool) {
        super(str, enumC0117wqx, bool);
        this.jpo = j10;
    }

    public JSONObject jd() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", wqx());
        jSONObject.put("trackingMilliseconds", this.jpo);
        return jSONObject;
    }

    public long jpo() {
        return this.jpo;
    }

    public String toString() {
        return super.toString();
    }

    public static int jpo(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length == 3) {
            try {
                return (int) ((Float.parseFloat(strArrSplit[2]) * 1000.0f) + (Integer.parseInt(strArrSplit[1]) * DtbConstants.NETWORK_READ_TIMEOUT) + (Integer.parseInt(strArrSplit[0]) * 3600000));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public boolean jpo(long j10) {
        return this.jpo <= j10 && !my();
    }

    @Override // java.lang.Comparable
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    public int compareTo(jpo jpoVar) {
        if (jpoVar == null) {
            return 1;
        }
        long j10 = this.jpo;
        long j11 = jpoVar.jpo;
        if (j10 > j11) {
            return 1;
        }
        return j10 < j11 ? -1 : 0;
    }
}
