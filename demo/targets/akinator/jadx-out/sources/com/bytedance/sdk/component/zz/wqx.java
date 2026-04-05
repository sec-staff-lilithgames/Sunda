package com.bytedance.sdk.component.zz;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class wqx implements View.OnTouchListener {

    /* renamed from: jd, reason: collision with root package name */
    private int f19101jd = -1;
    private ViewConfiguration jpo;

    public abstract void jpo(View.OnTouchListener onTouchListener);

    public boolean jpo(float f10, float f11, float f12, float f13, Context context) {
        if (this.jpo == null) {
            this.jpo = ViewConfiguration.get(context);
        }
        if (this.f19101jd == -1) {
            this.f19101jd = this.jpo.getScaledTouchSlop();
        }
        return Math.abs(f10 - f12) <= ((float) this.f19101jd) && Math.abs(f11 - f13) <= ((float) this.f19101jd);
    }
}
