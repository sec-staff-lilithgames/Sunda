package com.bytedance.sdk.component.jj.jpo.wqx;

import com.bytedance.sdk.component.jj.jpo.my;
import com.bytedance.sdk.component.jj.jpo.xyk;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    public static void jpo(AtomicLong atomicLong, int i10) {
        my myVarHna = xyk.qk().hna();
        if (myVarHna == null || !myVarHna.qk() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i10);
    }
}
