package com.bytedance.sdk.openadsdk.sq.cm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    public static long jpo() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis - (jCurrentTimeMillis % 86400000);
    }

    public static boolean jpo(long j10) {
        return j10 - (j10 % 86400000) == jpo();
    }
}
