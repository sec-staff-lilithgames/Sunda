package oq;

import android.view.View;
import android.view.ViewPropertyAnimator;
import dq.d0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ir.m f79729a;

    /* renamed from: b, reason: collision with root package name */
    public final i f79730b;

    /* renamed from: c, reason: collision with root package name */
    public final f f79731c;

    /* renamed from: d, reason: collision with root package name */
    public ViewPropertyAnimator f79732d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f79733e;

    public a(ir.m tag, i animatorFactory, f valuesCalculator) {
        e0.checkNotNullParameter(tag, "tag");
        e0.checkNotNullParameter(animatorFactory, "animatorFactory");
        e0.checkNotNullParameter(valuesCalculator, "valuesCalculator");
        this.f79729a = tag;
        this.f79730b = animatorFactory;
        this.f79731c = valuesCalculator;
        this.f79733e = new AtomicBoolean(false);
    }

    public final void a(View view, br.i eventType) {
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(eventType, "eventType");
        e eVarB = this.f79731c.b(view, eventType);
        view.setAlpha(eVarB.a());
        view.setTranslationX(eVarB.b());
        view.setTranslationY(eVarB.c());
        d0.b(this.f79729a, "Prepare animation for event: " + eventType + "; initial values: " + eVarB, new Object[0]);
    }

    public final boolean b() {
        return this.f79733e.get();
    }

    public final void a(View view, br.i eventType, Runnable runnable, Runnable runnable2, boolean z10) {
        e0.checkNotNullParameter(eventType, "eventType");
        if (runnable != null) {
            runnable.run();
        }
        ir.m mVar = this.f79729a;
        if (view == null) {
            d0.b(mVar, "Animation not started for event: " + eventType + "; view is null", new Object[0]);
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        if (!b() && !z10) {
            e eVarA = this.f79731c.a(view, eventType);
            ViewPropertyAnimator viewPropertyAnimatorA = this.f79730b.a(view, eventType, eVarA);
            if (viewPropertyAnimatorA == null) {
                view.setAlpha(eVarA.a());
                view.setTranslationX(eVarA.b());
                view.setTranslationY(eVarA.c());
                d0.b(mVar, "Apply values without animation for event: " + eventType + "; target values: " + eVarA, new Object[0]);
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            }
            d0.b(mVar, "Start animation for event: " + eventType + "; target values: " + eVarA, new Object[0]);
            this.f79733e.set(true);
            ViewPropertyAnimator viewPropertyAnimatorWithEndAction = viewPropertyAnimatorA.withEndAction(new on.z(5, this, runnable2));
            viewPropertyAnimatorWithEndAction.start();
            this.f79732d = viewPropertyAnimatorWithEndAction;
            return;
        }
        d0.b(mVar, "Animation is already running for event: " + eventType, new Object[0]);
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public final void a() {
        d0.b(this.f79729a, "Cancel animation", new Object[0]);
        ViewPropertyAnimator viewPropertyAnimator = this.f79732d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            viewPropertyAnimator.setListener(null);
            viewPropertyAnimator.setUpdateListener(null);
        }
        this.f79732d = null;
        this.f79733e.set(false);
    }
}
