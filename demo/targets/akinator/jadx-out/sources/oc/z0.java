package oc;

import java.util.function.Predicate;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class z0 implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78969a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f78969a) {
            case 0:
                rc.c cVar = (rc.c) obj;
                return (((rc.m) cVar.f84134a).getParameterCount() == 1 && ((rc.m) cVar.f84134a).getRawParameterType(0) == String.class && cVar.f84135b != tb.m.f86750e) ? false : true;
            case 1:
                return ((jc.t) obj).isNull();
            default:
                rc.d0 d0Var = (rc.d0) obj;
                return (d0Var.couldDeserialize() || d0Var.isExplicitlyIncluded()) ? false : true;
        }
    }
}
