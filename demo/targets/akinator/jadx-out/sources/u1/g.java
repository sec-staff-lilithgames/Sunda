package u1;

import android.view.MotionEvent;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Map f87567a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f87568b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f87569c;

    public g(Map<b0, c0> changes, e0 pointerInputEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(changes, "changes");
        kotlin.jvm.internal.e0.checkNotNullParameter(pointerInputEvent, "pointerInputEvent");
        this.f87567a = changes;
        this.f87568b = pointerInputEvent;
    }

    public final Map<b0, c0> getChanges() {
        return this.f87567a;
    }

    public final MotionEvent getMotionEvent() {
        return this.f87568b.getMotionEvent();
    }

    public final e0 getPointerInputEvent() {
        return this.f87568b;
    }

    public final boolean getSuppressMovementConsumption() {
        return this.f87569c;
    }

    /* renamed from: issuesEnterExitEvent-0FcD4WY, reason: not valid java name */
    public final boolean m7315issuesEnterExitEvent0FcD4WY(long j10) {
        f0 f0Var;
        List<f0> pointers = this.f87568b.getPointers();
        int size = pointers.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                f0Var = null;
                break;
            }
            f0Var = pointers.get(i10);
            if (b0.m7258equalsimpl0(f0Var.m7310getIdJ3iCeTQ(), j10)) {
                break;
            }
            i10++;
        }
        f0 f0Var2 = f0Var;
        if (f0Var2 != null) {
            return f0Var2.getIssuesEnterExit();
        }
        return false;
    }

    public final void setSuppressMovementConsumption(boolean z10) {
        this.f87569c = z10;
    }
}
