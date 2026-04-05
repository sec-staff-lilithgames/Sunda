package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.dt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd extends qk {

    /* renamed from: jd, reason: collision with root package name */
    private long f20975jd;
    private long jpo;

    public yd(Context context) {
        super(context);
        setVisibility(8);
        setClickable(true);
    }

    public boolean cm() {
        return this.jpo > 0 && this.f20975jd > 0;
    }

    public long getDisplayDuration() {
        if (this.jpo == 0) {
            return 0L;
        }
        if (this.f20975jd == 0) {
            this.f20975jd = SystemClock.elapsedRealtime();
        }
        return this.f20975jd - this.jpo;
    }

    public void jd(dt dtVar, int i10) {
        if (isShown()) {
            return;
        }
        jd();
        setVisibility(0);
        this.jpo = SystemClock.elapsedRealtime();
        jpo(dtVar, i10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.qk
    public boolean jpo() {
        return false;
    }

    public void wqx() {
        setVisibility(8);
        if (this.jpo != 0) {
            this.f20975jd = SystemClock.elapsedRealtime();
        }
    }
}
