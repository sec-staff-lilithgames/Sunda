package g0;

import android.os.Build;
import android.view.View;
import java.util.List;
import x3.s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x0 extends s2.b implements Runnable, x3.q0, View.OnAttachStateChangeListener {

    /* renamed from: e, reason: collision with root package name */
    public final x3 f56622e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f56623f;

    /* renamed from: g, reason: collision with root package name */
    public x3.e3 f56624g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(x3 composeInsets) {
        super(!composeInsets.getConsumes() ? 1 : 0);
        kotlin.jvm.internal.e0.checkNotNullParameter(composeInsets, "composeInsets");
        this.f56622e = composeInsets;
    }

    public final x3 getComposeInsets() {
        return this.f56622e;
    }

    public final boolean getPrepared() {
        return this.f56623f;
    }

    public final x3.e3 getSavedInsets() {
        return this.f56624g;
    }

    @Override // x3.q0
    public x3.e3 onApplyWindowInsets(View view, x3.e3 insets) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
        if (this.f56623f) {
            this.f56624g = insets;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return insets;
            }
        } else {
            x3 x3Var = this.f56622e;
            x3.update$default(x3Var, insets, 0, 2, null);
            if (x3Var.getConsumes()) {
                x3.e3 CONSUMED = x3.e3.f91568b;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(CONSUMED, "CONSUMED");
                return CONSUMED;
            }
        }
        return insets;
    }

    @Override // x3.s2.b
    public void onEnd(x3.s2 animation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
        this.f56623f = false;
        x3.e3 e3Var = this.f56624g;
        if (animation.getDurationMillis() != 0 && e3Var != null) {
            this.f56622e.update(e3Var, animation.getTypeMask());
        }
        this.f56624g = null;
        super.onEnd(animation);
    }

    @Override // x3.s2.b
    public void onPrepare(x3.s2 animation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
        this.f56623f = true;
        super.onPrepare(animation);
    }

    @Override // x3.s2.b
    public x3.e3 onProgress(x3.e3 insets, List<x3.s2> runningAnimations) {
        kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
        kotlin.jvm.internal.e0.checkNotNullParameter(runningAnimations, "runningAnimations");
        x3 x3Var = this.f56622e;
        x3.update$default(x3Var, insets, 0, 2, null);
        if (!x3Var.getConsumes()) {
            return insets;
        }
        x3.e3 CONSUMED = x3.e3.f91568b;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(CONSUMED, "CONSUMED");
        return CONSUMED;
    }

    @Override // x3.s2.b
    public s2.a onStart(x3.s2 animation, s2.a bounds) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
        kotlin.jvm.internal.e0.checkNotNullParameter(bounds, "bounds");
        this.f56623f = false;
        s2.a aVarOnStart = super.onStart(animation, bounds);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(aVarOnStart, "super.onStart(animation, bounds)");
        return aVarOnStart;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f56623f) {
            this.f56623f = false;
            x3.e3 e3Var = this.f56624g;
            if (e3Var != null) {
                x3.update$default(this.f56622e, e3Var, 0, 2, null);
                this.f56624g = null;
            }
        }
    }

    public final void setPrepared(boolean z10) {
        this.f56623f = z10;
    }

    public final void setSavedInsets(x3.e3 e3Var) {
        this.f56624g = e3Var;
    }
}
