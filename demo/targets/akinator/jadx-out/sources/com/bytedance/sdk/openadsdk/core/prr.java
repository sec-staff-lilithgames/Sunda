package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class prr {

    /* renamed from: jd, reason: collision with root package name */
    private boolean f20828jd;
    private final com.bytedance.sdk.openadsdk.utils.jpo jpo = new com.bytedance.sdk.openadsdk.utils.jpo();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {
        private static final prr jpo = new prr();
    }

    public static prr jpo() {
        return jpo.jpo;
    }

    public boolean cm() {
        return this.jpo.jpo();
    }

    public void jd() {
        try {
            Context contextJpo = sq.jpo();
            if (contextJpo instanceof Application) {
                ((Application) contextJpo).registerActivityLifecycleCallbacks(this.jpo);
                this.f20828jd = true;
            } else {
                if (contextJpo == null || contextJpo.getApplicationContext() == null) {
                    return;
                }
                ((Application) contextJpo.getApplicationContext()).registerActivityLifecycleCallbacks(this.jpo);
                this.f20828jd = true;
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th2);
        }
    }

    public com.bytedance.sdk.openadsdk.utils.jpo my() {
        return this.jpo;
    }

    public boolean wqx() {
        return this.f20828jd;
    }

    public boolean jpo(boolean z10) {
        return this.jpo.jpo(z10);
    }
}
