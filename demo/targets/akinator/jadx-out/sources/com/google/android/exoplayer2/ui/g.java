package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import java.text.NumberFormat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28196b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f28195a = i10;
        this.f28196b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f28195a;
        Object obj = this.f28196b;
        switch (i10) {
            case 0:
                h hVar = (h) obj;
                int i11 = h.R;
                hVar.getClass();
                hVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.invalidate(hVar.f28199b);
                break;
            case 1:
                dg.d dVar = (dg.d) obj;
                ColorDrawable colorDrawable = dg.d.f52185z;
                dVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar.f52195j.setAlpha((int) (255.0f * fFloatValue));
                dVar.f52209x = fFloatValue;
                break;
            case 2:
                dh.l lVar = (dh.l) obj;
                lVar.getClass();
                lVar.f52279d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                io.odeeo.internal.w1.m.a((kv.l) obj, valueAnimator);
                break;
            case 4:
                io.bidmachine.media3.ui.e eVar = (io.bidmachine.media3.ui.e) obj;
                int i12 = io.bidmachine.media3.ui.e.R;
                eVar.getClass();
                eVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eVar.invalidate(eVar.f61728b);
                break;
            case 5:
                boolean z10 = AkActivity.f21679y;
                kotlin.jvm.internal.e0.checkNotNull(valueAnimator);
                Object animatedValue = valueAnimator.getAnimatedValue();
                kotlin.jvm.internal.e0.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) animatedValue).intValue();
                TextView textView = ((AkActivity) obj).f21691n;
                kotlin.jvm.internal.e0.checkNotNull(textView);
                textView.setText(NumberFormat.getInstance().format(iIntValue));
                break;
            case 6:
                r7.a0 a0Var = (r7.a0) obj;
                boolean z11 = r7.a0.X;
                if (!a0Var.getAsyncUpdatesEnabled()) {
                    a8.b bVar = a0Var.f83863s;
                    if (bVar != null) {
                        bVar.setProgress(a0Var.f83848c.getAnimatedValueAbsolute());
                        break;
                    }
                } else {
                    a0Var.invalidateSelf();
                    break;
                }
                break;
            case 7:
                ((ClippableRoundedCornerLayout) obj).updateCornerRadii((float[]) valueAnimator.getAnimatedValue());
                break;
            case 8:
                ((View) obj).setAlpha(0.0f);
                break;
            case 9:
                ((m.b) obj).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 10:
                ((qg.p) obj).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                wg.t tVar = (wg.t) obj;
                tVar.f90617j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                tVar.f90623p.getTextView().setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((ImageButton) obj).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
