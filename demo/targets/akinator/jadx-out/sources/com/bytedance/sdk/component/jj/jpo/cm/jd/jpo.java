package com.bytedance.sdk.component.jj.jpo.cm.jd;

import com.amazon.device.ads.DtbConstants;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: jd, reason: collision with root package name */
    private int f18623jd;
    private int jpo;

    public jpo(int i10, int i11, long j10) {
        if (i11 < i10) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.jpo = i10;
        this.f18623jd = i11;
    }

    public static jpo cm() {
        return new jpo(1, 100, -1L);
    }

    public static jpo my() {
        return new jpo(3, 100, DtbConstants.DEFAULT_CONFIG_CHECK_IN_TTL_IN_MILLISECONDS);
    }

    public static jpo wqx() {
        return new jpo(1, 100, DtbConstants.DEFAULT_CONFIG_CHECK_IN_TTL_IN_MILLISECONDS);
    }

    public int jd() {
        return this.f18623jd;
    }

    public int jpo() {
        return this.jpo;
    }
}
