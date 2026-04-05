package u1;

import android.view.MotionEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q0 f87650e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(q0 q0Var) {
        super(1);
        this.f87650e = q0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MotionEvent) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(MotionEvent motionEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(motionEvent, "motionEvent");
        this.f87650e.getOnTouchEvent().invoke(motionEvent);
    }
}
