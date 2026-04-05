package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.jj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends jj {
    private static volatile my jpo;

    private my(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jj
    public /* bridge */ /* synthetic */ jj.wqx jpo() {
        return super.jpo();
    }

    public static my jpo(Context context) {
        if (jpo == null) {
            synchronized (my.class) {
                try {
                    if (jpo == null) {
                        jpo = new my(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }
}
