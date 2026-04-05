package qg;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.app.l1;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import x3.p2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final /* synthetic */ class k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f83195b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f83196c;

    public /* synthetic */ k(int i10, Object obj, Object obj2) {
        this.f83194a = i10;
        this.f83195b = obj;
        this.f83196c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f83194a;
        Object obj = this.f83196c;
        Object obj2 = this.f83195b;
        switch (i10) {
            case 0:
                t0.setBoundsFromRect(((n) obj2).f83201b, (Rect) obj);
                return;
            case 1:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                yg.j jVar = (yg.j) obj;
                int i11 = AppBarLayout.D;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar.setElevation(fFloatValue);
                Drawable drawable = appBarLayout.f28861z;
                if (drawable instanceof yg.j) {
                    ((yg.j) drawable).setElevation(fFloatValue);
                }
                Iterator it = appBarLayout.f28855t.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    jVar.getResolvedTintColor();
                    throw null;
                }
                Iterator it2 = appBarLayout.f28856u.iterator();
                while (it2.hasNext()) {
                    ((AppBarLayout.d) it2.next()).onUpdate(fFloatValue, jVar.getResolvedTintColor(), fFloatValue / appBarLayout.B);
                }
                return;
            case 2:
                yg.j jVar2 = (yg.j) obj2;
                View view = (View) obj;
                jVar2.setInterpolation(1.0f - valueAnimator.getAnimatedFraction());
                view.setBackground(jVar2);
                view.setAlpha(1.0f);
                return;
            case 3:
                wg.t tVar = (wg.t) obj2;
                Rect rect = (Rect) obj;
                tVar.getClass();
                rect.right = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                tVar.f90617j.setClipBounds(rect);
                return;
            default:
                ((l1) ((p2) obj2)).onAnimationUpdate((View) obj);
                return;
        }
    }
}
