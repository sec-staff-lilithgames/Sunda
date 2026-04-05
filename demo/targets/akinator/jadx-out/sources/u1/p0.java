package u1;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p0 extends i0 {

    /* renamed from: e, reason: collision with root package name */
    public l0 f87653e = l0.f87623b;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0 f87654f;

    public p0(q0 q0Var) {
        this.f87654f = q0Var;
    }

    public final void b(m mVar) {
        List<c0> changes = mVar.getChanges();
        int size = changes.size();
        int i10 = 0;
        while (true) {
            l0 l0Var = l0.f87624c;
            q0 q0Var = this.f87654f;
            if (i10 >= size) {
                x1.d0 layoutCoordinates$ui_release = getLayoutCoordinates$ui_release();
                if (layoutCoordinates$ui_release == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                w0.m7382toMotionEventScoped4ec7I(mVar, layoutCoordinates$ui_release.mo7829localToRootMKHz9U(i1.h.f59344b.m4173getZeroF1C5BW0()), new n0(this, q0Var));
                if (this.f87653e == l0Var) {
                    int size2 = changes.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        changes.get(i11).consume();
                    }
                    g internalPointerEvent$ui_release = mVar.getInternalPointerEvent$ui_release();
                    if (internalPointerEvent$ui_release == null) {
                        return;
                    }
                    internalPointerEvent$ui_release.setSuppressMovementConsumption(!q0Var.getDisallowIntercept$ui_release());
                    return;
                }
                return;
            }
            if (changes.get(i10).isConsumed()) {
                if (this.f87653e == l0Var) {
                    x1.d0 layoutCoordinates$ui_release2 = getLayoutCoordinates$ui_release();
                    if (layoutCoordinates$ui_release2 == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    w0.m7381toCancelMotionEventScoped4ec7I(mVar, layoutCoordinates$ui_release2.mo7829localToRootMKHz9U(i1.h.f59344b.m4173getZeroF1C5BW0()), new m0(q0Var));
                }
                this.f87653e = l0.f87625e;
                return;
            }
            i10++;
        }
    }

    @Override // u1.i0
    public boolean getShareWithSiblings() {
        return true;
    }

    @Override // u1.i0
    public void onCancel() {
        if (this.f87653e == l0.f87624c) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            q0 q0Var = this.f87654f;
            w0.emptyCancelMotionEventScope(jUptimeMillis, new o0(q0Var));
            this.f87653e = l0.f87623b;
            q0Var.setDisallowIntercept$ui_release(false);
        }
    }

    @Override // u1.i0
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo7319onPointerEventH0pRuoY(m pointerEvent, o pass, long j10) {
        boolean z10;
        kotlin.jvm.internal.e0.checkNotNullParameter(pointerEvent, "pointerEvent");
        kotlin.jvm.internal.e0.checkNotNullParameter(pass, "pass");
        List<c0> changes = pointerEvent.getChanges();
        q0 q0Var = this.f87654f;
        if (q0Var.getDisallowIntercept$ui_release()) {
            z10 = true;
            break;
        }
        int size = changes.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = changes.get(i10);
            if (n.changedToDownIgnoreConsumed(c0Var) || n.changedToUpIgnoreConsumed(c0Var)) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        l0 l0Var = this.f87653e;
        l0 l0Var2 = l0.f87625e;
        o oVar = o.f87648e;
        if (l0Var != l0Var2) {
            if (pass == o.f87646b && z10) {
                b(pointerEvent);
            }
            if (pass == oVar && !z10) {
                b(pointerEvent);
            }
        }
        if (pass == oVar) {
            int size2 = changes.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (!n.changedToUpIgnoreConsumed(changes.get(i11))) {
                    return;
                }
            }
            this.f87653e = l0.f87623b;
            q0Var.setDisallowIntercept$ui_release(false);
        }
    }
}
