package u1;

import android.view.MotionEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0 f87640e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0 f87641f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p0 p0Var, q0 q0Var) {
        super(1);
        this.f87640e = p0Var;
        this.f87641f = q0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MotionEvent) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(MotionEvent motionEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(motionEvent, "motionEvent");
        int actionMasked = motionEvent.getActionMasked();
        q0 q0Var = this.f87641f;
        if (actionMasked == 0) {
            this.f87640e.f87653e = ((Boolean) q0Var.getOnTouchEvent().invoke(motionEvent)).booleanValue() ? l0.f87624c : l0.f87625e;
        } else {
            q0Var.getOnTouchEvent().invoke(motionEvent);
        }
    }
}
