package xr;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x0 extends ArrayDeque {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f93225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0 f93226c;

    public x0(y0 y0Var, int i10) {
        this.f93226c = y0Var;
        this.f93225b = i10;
    }

    @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public boolean add(wr.c2 c2Var) {
        if (size() == this.f93225b) {
            removeFirst();
        }
        this.f93226c.f93251e++;
        return super.add((x0) c2Var);
    }
}
