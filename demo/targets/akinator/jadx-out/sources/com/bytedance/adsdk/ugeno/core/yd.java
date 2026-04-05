package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd {

    /* renamed from: cm, reason: collision with root package name */
    private View f17766cm;

    /* renamed from: jd, reason: collision with root package name */
    private jpo f17767jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f17768jj;
    Paint jpo;
    private int my;

    /* renamed from: qk, reason: collision with root package name */
    private String f17769qk;
    private AnimatorSet wqx = new AnimatorSet();

    public yd(View view, jpo jpoVar) {
        this.f17766cm = view;
        this.f17767jd = jpoVar;
        Paint paint = new Paint();
        this.jpo = paint;
        paint.setAntiAlias(true);
    }

    public void jd() {
        AnimatorSet animatorSet = this.wqx;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo() {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.core.yd.jpo():void");
    }

    public void jpo(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(this.f17769qk)) {
                return;
            }
            this.jpo.setColor(com.bytedance.adsdk.ugeno.qk.jpo.jpo(this.f17769qk));
            this.jpo.setAlpha(90);
            ((ViewGroup) this.f17766cm.getParent()).setClipChildren(true);
            canvas.drawCircle(this.my, this.f17768jj, Math.min(r0, r2) * 2 * iAnimation.getRipple(), this.jpo);
        } catch (Throwable th2) {
            Log.d("UGenAnimation", "ripple animation error " + th2.getMessage());
        }
    }

    public void jpo(int i10, int i11) {
        this.my = i10 / 2;
        this.f17768jj = i11 / 2;
    }
}
