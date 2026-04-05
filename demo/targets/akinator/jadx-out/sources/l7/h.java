package l7;

import androidx.lifecycle.a1;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends k0 {

    /* renamed from: b, reason: collision with root package name */
    public static final h f72553b = new h();

    /* renamed from: c, reason: collision with root package name */
    public static final g f72554c = new g();

    @Override // androidx.lifecycle.k0
    public void addObserver(a1 a1Var) {
        if (!(a1Var instanceof androidx.lifecycle.r)) {
            throw new IllegalArgumentException((a1Var + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        androidx.lifecycle.r rVar = (androidx.lifecycle.r) a1Var;
        g gVar = f72554c;
        rVar.onCreate(gVar);
        rVar.onStart(gVar);
        rVar.onResume(gVar);
    }

    @Override // androidx.lifecycle.k0
    public j0 getCurrentState() {
        return j0.f6618g;
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.k0
    public void removeObserver(a1 a1Var) {
    }
}
