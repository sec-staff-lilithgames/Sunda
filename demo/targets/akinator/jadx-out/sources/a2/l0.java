package a2;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p4 f3698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0 f3699f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(i0 i0Var, p4 p4Var) {
        super(0);
        this.f3698e = p4Var;
        this.f3699f = i0Var;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m51invoke();
        return tu.x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m51invoke() {
        p4 p4Var = this.f3698e;
        e2.n horizontalScrollAxisRange = p4Var.getHorizontalScrollAxisRange();
        e2.n verticalScrollAxisRange = p4Var.getVerticalScrollAxisRange();
        Float oldXValue = p4Var.getOldXValue();
        Float oldYValue = p4Var.getOldYValue();
        float fFloatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : ((Number) horizontalScrollAxisRange.getValue().invoke()).floatValue() - oldXValue.floatValue();
        float fFloatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : ((Number) verticalScrollAxisRange.getValue().invoke()).floatValue() - oldYValue.floatValue();
        if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
            int semanticsNodeId = p4Var.getSemanticsNodeId();
            i0 i0Var = this.f3699f;
            int iL = i0Var.l(semanticsNodeId);
            i0.o(i0Var, iL, 2048, 1, 8);
            AccessibilityEvent accessibilityEventCreateEvent$ui_release = i0Var.createEvent$ui_release(iL, 4096);
            if (horizontalScrollAxisRange != null) {
                accessibilityEventCreateEvent$ui_release.setScrollX((int) ((Number) horizontalScrollAxisRange.getValue().invoke()).floatValue());
                accessibilityEventCreateEvent$ui_release.setMaxScrollX((int) ((Number) horizontalScrollAxisRange.getMaxValue().invoke()).floatValue());
            }
            if (verticalScrollAxisRange != null) {
                accessibilityEventCreateEvent$ui_release.setScrollY((int) ((Number) verticalScrollAxisRange.getValue().invoke()).floatValue());
                accessibilityEventCreateEvent$ui_release.setMaxScrollY((int) ((Number) verticalScrollAxisRange.getMaxValue().invoke()).floatValue());
            }
            if (Build.VERSION.SDK_INT >= 28) {
                h0.setScrollEventDelta(accessibilityEventCreateEvent$ui_release, (int) fFloatValue, (int) fFloatValue2);
            }
            i0Var.m(accessibilityEventCreateEvent$ui_release);
        }
        if (horizontalScrollAxisRange != null) {
            p4Var.setOldXValue((Float) horizontalScrollAxisRange.getValue().invoke());
        }
        if (verticalScrollAxisRange != null) {
            p4Var.setOldYValue((Float) verticalScrollAxisRange.getValue().invoke());
        }
    }
}
