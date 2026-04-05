package com.facebook.ads.redexgen.core;

import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class NU {
    public final long A00;
    public final TF A01;
    public final String A02;
    public final JSONObject A03;

    public NU(JSONObject jSONObject, TF tf2, String str, long j10) {
        this.A03 = jSONObject;
        this.A01 = tf2;
        this.A02 = str;
        this.A00 = j10;
    }

    public final long A00() {
        return this.A00;
    }

    public final TF A01() {
        return this.A01;
    }

    public final String A02() {
        return this.A02;
    }

    public final JSONObject A03() {
        return this.A03;
    }
}
