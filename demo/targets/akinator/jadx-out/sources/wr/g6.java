package wr;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g6 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h6 f90945b;

    public g6(h6 h6Var) {
        this.f90945b = h6Var;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        h6 h6Var = this.f90945b;
        int priority = h6Var.getPriority(obj) - h6Var.getPriority(obj2);
        return priority != 0 ? priority : obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
