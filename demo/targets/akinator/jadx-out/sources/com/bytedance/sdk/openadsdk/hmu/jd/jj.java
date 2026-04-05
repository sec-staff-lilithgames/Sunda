package com.bytedance.sdk.openadsdk.hmu.jd;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.nzb;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj {
    public static boolean jpo(View view, int i10) {
        return jpo(view, false, i10);
    }

    public static boolean jpo(View view, boolean z10, int i10) {
        if (view == null) {
            return false;
        }
        return nzb.jpo(view, z10 ? 30 : 50, i10, false);
    }
}
