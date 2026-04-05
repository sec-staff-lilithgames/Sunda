package zk;

import android.animation.ValueAnimator;
import android.view.View;
import com.inmobi.media.C2727d1;
import com.inmobi.media.C2987s8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class i0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2987s8 f98123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f98124c;

    public /* synthetic */ i0(C2987s8 c2987s8, View view, int i10) {
        this.f98122a = i10;
        this.f98123b = c2987s8;
        this.f98124c = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f98122a) {
            case 0:
                C2727d1.b(this.f98123b, this.f98124c, valueAnimator);
                break;
            default:
                C2727d1.a(this.f98123b, this.f98124c, valueAnimator);
                break;
        }
    }
}
