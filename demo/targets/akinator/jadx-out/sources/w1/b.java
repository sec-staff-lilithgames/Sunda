package w1;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends f0 implements l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f90319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar) {
        super(1);
        this.f90319e = lVar;
    }

    @Override // kv.l
    public final Boolean invoke(r1.a e10) {
        e0.checkNotNullParameter(e10, "e");
        if (e10 instanceof d) {
            return (Boolean) this.f90319e.invoke(e10);
        }
        throw new IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.");
    }
}
