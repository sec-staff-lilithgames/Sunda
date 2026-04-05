package com.mbridge.msdk.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.dynview.moffer.b;
import com.mbridge.msdk.video.dynview.moffer.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBridgeRelativeLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private d f44529a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f44530b;

    /* renamed from: c, reason: collision with root package name */
    private AnimatorSet f44531c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f44532d;

    /* renamed from: e, reason: collision with root package name */
    private b f44533e;

    public MBridgeRelativeLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f44531c;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        d dVar;
        super.onDetachedFromWindow();
        if (!this.f44530b && (dVar = this.f44529a) != null) {
            this.f44530b = true;
            dVar.a();
        }
        AnimatorSet animatorSet = this.f44531c;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        b bVar;
        super.onVisibilityChanged(view, i10);
        if (!(view instanceof MBridgeRelativeLayout) || i10 != 0 || (bVar = this.f44533e) == null || this.f44532d) {
            return;
        }
        this.f44532d = true;
        bVar.a();
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f44531c = animatorSet;
    }

    public void setMoreOfferCacheReportCallBack(b bVar) {
        this.f44533e = bVar;
    }

    public void setMoreOfferShowFailedCallBack(d dVar) {
        this.f44529a = dVar;
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
