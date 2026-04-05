package a2;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x1 implements g5 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f3881a;

    public x1(ViewConfiguration viewConfiguration) {
        kotlin.jvm.internal.e0.checkNotNullParameter(viewConfiguration, "viewConfiguration");
        this.f3881a = viewConfiguration;
    }

    @Override // a2.g5
    public long getDoubleTapMinTimeMillis() {
        return 40L;
    }

    @Override // a2.g5
    public long getDoubleTapTimeoutMillis() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // a2.g5
    public long getLongPressTimeoutMillis() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // a2.g5
    /* renamed from: getMinimumTouchTargetSize-MYxV2XQ */
    public /* bridge */ /* synthetic */ long mo36getMinimumTouchTargetSizeMYxV2XQ() {
        return super.mo36getMinimumTouchTargetSizeMYxV2XQ();
    }

    @Override // a2.g5
    public float getTouchSlop() {
        return this.f3881a.getScaledTouchSlop();
    }
}
