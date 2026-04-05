package o4;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements k4.n {

    /* renamed from: a, reason: collision with root package name */
    public final k4.n f77480a;

    public f(k4.n delegate) {
        e0.checkNotNullParameter(delegate, "delegate");
        this.f77480a = delegate;
    }

    @Override // k4.n
    public Flow<j> getData() {
        return this.f77480a.getData();
    }

    @Override // k4.n
    public Object updateData(kv.p pVar, zu.d<? super j> dVar) {
        return this.f77480a.updateData(new e(pVar, null), dVar);
    }
}
