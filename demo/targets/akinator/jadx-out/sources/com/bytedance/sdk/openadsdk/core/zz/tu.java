package com.bytedance.sdk.openadsdk.core.zz;

import android.os.SystemClock;
import com.ironsource.C3191e4;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class tu implements com.bytedance.sdk.openadsdk.core.ju.qk.wqx {

    /* renamed from: jj, reason: collision with root package name */
    private String f21139jj;
    private long jpo = 0;

    /* renamed from: jd, reason: collision with root package name */
    private long f21138jd = 0;
    private int wqx = 0;

    /* renamed from: cm, reason: collision with root package name */
    private String f21137cm = null;
    private String my = null;

    /* renamed from: qk, reason: collision with root package name */
    private final AtomicBoolean f21140qk = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.ju.qk.wqx
    public void jd(String str) {
        this.my = str;
        this.f21138jd = SystemClock.elapsedRealtime();
        this.f21140qk.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.qk.wqx
    public void jpo(String str) {
        this.f21139jj = str;
        this.jpo = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.qk.wqx
    public void jpo(int i10, String str, String str2) {
        this.wqx = i10;
        this.f21137cm = str;
        this.my = str2;
        this.f21138jd = SystemClock.elapsedRealtime();
        this.f21140qk.set(false);
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, String str) {
        if (this.f21140qk.get()) {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, false, str, "success", this.f21138jd - this.jpo, this.my, this.f21139jj, 0, null);
        } else {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, false, str, C3191e4.f.f36439e, this.f21138jd - this.jpo, this.my, this.f21139jj, this.wqx, this.f21137cm);
        }
    }
}
