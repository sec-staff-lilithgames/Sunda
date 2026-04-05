package u1;

import android.os.SystemClock;
import android.view.MotionEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w0 {
    public static final void a(m mVar, long j10, kv.l lVar, boolean z10) {
        MotionEvent motionEvent$ui_release = mVar.getMotionEvent$ui_release();
        if (motionEvent$ui_release == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent$ui_release.getAction();
        if (z10) {
            motionEvent$ui_release.setAction(3);
        }
        motionEvent$ui_release.offsetLocation(-i1.h.m4185getXimpl(j10), -i1.h.m4186getYimpl(j10));
        lVar.invoke(motionEvent$ui_release);
        motionEvent$ui_release.offsetLocation(i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10));
        motionEvent$ui_release.setAction(action);
    }

    public static final void emptyCancelMotionEventScope(long j10, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        MotionEvent motionEvent = MotionEvent.obtain(j10, j10, 3, 0.0f, 0.0f, 0);
        motionEvent.setSource(0);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(motionEvent, "motionEvent");
        block.invoke(motionEvent);
        motionEvent.recycle();
    }

    public static /* synthetic */ void emptyCancelMotionEventScope$default(long j10, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = SystemClock.uptimeMillis();
        }
        emptyCancelMotionEventScope(j10, lVar);
    }

    /* renamed from: toCancelMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m7381toCancelMotionEventScoped4ec7I(m toCancelMotionEventScope, long j10, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(toCancelMotionEventScope, "$this$toCancelMotionEventScope");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        a(toCancelMotionEventScope, j10, block, true);
    }

    /* renamed from: toMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m7382toMotionEventScoped4ec7I(m toMotionEventScope, long j10, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(toMotionEventScope, "$this$toMotionEventScope");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        a(toMotionEventScope, j10, block, false);
    }
}
