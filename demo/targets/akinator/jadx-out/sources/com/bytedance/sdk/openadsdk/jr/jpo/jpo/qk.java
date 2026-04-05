package com.bytedance.sdk.openadsdk.jr.jpo.jpo;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.tic;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk {
    public static jj jpo(Context context, String str) {
        return wqx.jpo() ? new my(context, str) : tic.cm(context) ? new cm(context, str) : new jpo(context, str);
    }
}
