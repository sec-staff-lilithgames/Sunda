package n6;

import androidx.lifecycle.l1;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k0 implements j0 {

    /* renamed from: c, reason: collision with root package name */
    public final l1 f75751c;

    /* renamed from: d, reason: collision with root package name */
    public final n1 f75752d;

    public k0(l1 state, n1 future) {
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.e0.checkNotNullParameter(future, "future");
        this.f75751c = state;
        this.f75752d = future;
    }

    @Override // n6.j0
    public n1 getResult() {
        return this.f75752d;
    }

    @Override // n6.j0
    public l1 getState() {
        return this.f75751c;
    }
}
