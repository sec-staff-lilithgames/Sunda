package a2;

import android.os.SystemClock;
import android.view.MotionEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f3896e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(t tVar) {
        super(0);
        this.f3896e = tVar;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m64invoke();
        return tu.x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m64invoke() {
        t tVar = this.f3896e;
        MotionEvent motionEvent = tVar.f3812g0;
        if (motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 7 || actionMasked == 9) {
                tVar.f3814h0 = SystemClock.uptimeMillis();
                tVar.post(tVar.f3820k0);
            }
        }
    }
}
