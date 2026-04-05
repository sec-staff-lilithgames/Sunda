package com.bytedance.sdk.component.jj.jpo.jpo.jpo;

import android.content.Context;
import com.bytedance.sdk.component.jj.jpo.jpo.jpo.jd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends jd {
    private static volatile jpo jpo;

    private jpo(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.jpo.jd
    public /* bridge */ /* synthetic */ jd.C0085jd jpo() {
        return super.jpo();
    }

    public static jpo jpo(Context context) {
        if (jpo == null) {
            synchronized (jpo.class) {
                try {
                    if (jpo == null) {
                        jpo = new jpo(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }
}
