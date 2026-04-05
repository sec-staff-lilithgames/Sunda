package a2;

import android.os.Handler;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.android.HandlerDispatcherKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z5 {

    /* renamed from: a, reason: collision with root package name */
    public static final z5 f3904a = new z5();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f3905b = new AtomicReference(w5.f3878a.getLifecycleAware());

    public final boolean compareAndSetFactory(w5 expected, w5 factory) {
        AtomicReference atomicReference;
        kotlin.jvm.internal.e0.checkNotNullParameter(expected, "expected");
        kotlin.jvm.internal.e0.checkNotNullParameter(factory, "factory");
        do {
            atomicReference = f3905b;
            if (atomicReference.compareAndSet(expected, factory)) {
                return true;
            }
        } while (atomicReference.get() == expected);
        return false;
    }

    public final p0.n3 createAndInstallWindowRecomposer$ui_release(View rootView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rootView, "rootView");
        p0.n3 n3VarCreateRecomposer = ((u5) ((w5) f3905b.get())).createRecomposer(rootView);
        i6.setCompositionContext(rootView, n3VarCreateRecomposer);
        GlobalScope globalScope = GlobalScope.INSTANCE;
        Handler handler = rootView.getHandler();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(handler, "rootView.handler");
        rootView.addOnAttachStateChangeListener(new x5(BuildersKt__Builders_commonKt.launch$default(globalScope, HandlerDispatcherKt.from(handler, "windowRecomposer cleanup").getImmediate(), null, new y5(n3VarCreateRecomposer, rootView, null), 2, null)));
        return n3VarCreateRecomposer;
    }

    public final w5 getAndSetFactory(w5 factory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(factory, "factory");
        Object andSet = f3905b.getAndSet(factory);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(andSet, "factory.getAndSet(factory)");
        return (w5) andSet;
    }

    public final void setFactory(w5 factory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(factory, "factory");
        f3905b.set(factory);
    }

    public final <R> R withFactory(w5 factory, kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(factory, "factory");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        w5 andSetFactory = getAndSetFactory(factory);
        try {
            R r10 = (R) block.invoke();
            kotlin.jvm.internal.b0.finallyStart(1);
            if (!compareAndSetFactory(factory, andSetFactory)) {
                throw new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
            }
            kotlin.jvm.internal.b0.finallyEnd(1);
            return r10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jvm.internal.b0.finallyStart(1);
                if (compareAndSetFactory(factory, andSetFactory)) {
                    kotlin.jvm.internal.b0.finallyEnd(1);
                    throw th3;
                }
                tu.h.addSuppressed(th2, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                throw th2;
            }
        }
    }
}
