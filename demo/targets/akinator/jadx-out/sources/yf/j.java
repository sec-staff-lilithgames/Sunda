package yf;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import x3.z1;
import y3.p;
import y3.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class j implements x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f94394b;

    public j(SwipeDismissBehavior swipeDismissBehavior) {
        this.f94394b = swipeDismissBehavior;
    }

    @Override // y3.x
    public boolean perform(View view, p pVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.f94394b;
        if (!swipeDismissBehavior.canSwipeDismissView(view)) {
            return false;
        }
        boolean z10 = view.getLayoutDirection() == 1;
        int i10 = swipeDismissBehavior.f28944h;
        z1.offsetLeftAndRight(view, (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        swipeDismissBehavior.getClass();
        return true;
    }
}
