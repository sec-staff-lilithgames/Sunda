package com.digidust.elokence.akinator.graphic;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import da.b;
import da.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AkinatorLoadingBar extends View {

    /* renamed from: b, reason: collision with root package name */
    public boolean f21749b;

    /* renamed from: c, reason: collision with root package name */
    public Paint f21750c;

    /* renamed from: e, reason: collision with root package name */
    public List f21751e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f21752f;

    public AkinatorLoadingBar(Context context) {
        super(context);
        this.f21752f = new float[]{1.0f, 1.0f, 1.0f};
        a();
    }

    public final void a() {
        Paint paint = new Paint();
        this.f21750c = paint;
        paint.setColor(-16777216);
        this.f21750c.setStyle(Paint.Style.FILL);
        this.f21750c.setAntiAlias(true);
    }

    public List<Animator> createAnimation() {
        ArrayList arrayList = new ArrayList();
        int[] iArr = {AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, PsExtractor.VIDEO_STREAM_MASK, 360};
        for (int i10 = 0; i10 < 3; i10++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.3f, 1.0f);
            valueAnimatorOfFloat.setDuration(750L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(iArr[i10]);
            valueAnimatorOfFloat.addUpdateListener(new b(this, i10));
            valueAnimatorOfFloat.start();
            arrayList.add(valueAnimatorOfFloat);
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fMin = (Math.min(getWidth(), getHeight()) - 10.0f) / 24.0f;
        float f10 = 2.0f * fMin;
        float width = (getWidth() / 2) - (f10 + 5.0f);
        float height = getHeight() / 2;
        for (int i10 = 0; i10 < 3; i10++) {
            canvas.save();
            float f11 = i10;
            canvas.translate((f11 * 5.0f) + (f10 * f11) + width, height);
            float f12 = this.f21752f[i10];
            canvas.scale(f12, f12);
            canvas.drawCircle(0.0f, 0.0f, fMin, this.f21750c);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f21749b) {
            return;
        }
        this.f21749b = true;
        this.f21751e = createAnimation();
    }

    public void setAnimationStatus(c cVar) {
        List list = this.f21751e;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) this.f21751e.get(i10);
            boolean zIsRunning = animator.isRunning();
            int iOrdinal = cVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2 && zIsRunning) {
                        animator.cancel();
                    }
                } else if (zIsRunning) {
                    animator.end();
                }
            } else if (!zIsRunning) {
                animator.start();
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (getVisibility() != i10) {
            super.setVisibility(i10);
            if (i10 == 4) {
                setAnimationStatus(c.f51955c);
            } else if (i10 == 8) {
                setAnimationStatus(c.f51956e);
            } else {
                setAnimationStatus(c.f51954b);
            }
        }
    }

    public AkinatorLoadingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21752f = new float[]{1.0f, 1.0f, 1.0f};
        a();
    }

    public AkinatorLoadingBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21752f = new float[]{1.0f, 1.0f, 1.0f};
        a();
    }

    public AkinatorLoadingBar(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f21752f = new float[]{1.0f, 1.0f, 1.0f};
        a();
    }
}
