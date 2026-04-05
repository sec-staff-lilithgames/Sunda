package oq;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Map f79745a;

    public i(Map<br.i, br.l> params) {
        e0.checkNotNullParameter(params, "params");
        this.f79745a = params;
    }

    public final ViewPropertyAnimator a(View view, br.i eventType, e targetValues) {
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(eventType, "eventType");
        e0.checkNotNullParameter(targetValues, "targetValues");
        br.l lVar = (br.l) this.f79745a.get(eventType);
        if (lVar == null) {
            return null;
        }
        ViewPropertyAnimator viewPropertyAnimatorWithStartAction = view.animate().alpha(targetValues.a()).translationX(targetValues.b()).translationY(targetValues.c()).setDuration(lVar.getDuration()).withStartAction(new al.b(6));
        br.k function = lVar.getFunction();
        int i10 = function == null ? -1 : h.f79744a[function.ordinal()];
        viewPropertyAnimatorWithStartAction.setInterpolator(i10 != 1 ? i10 != 2 ? i10 != 3 ? new LinearInterpolator() : new AccelerateDecelerateInterpolator() : new DecelerateInterpolator() : new AccelerateInterpolator());
        return viewPropertyAnimatorWithStartAction;
    }
}
