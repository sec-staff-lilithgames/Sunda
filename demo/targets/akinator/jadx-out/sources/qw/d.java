package qw;

import java.util.Iterator;
import pw.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public rv.v f83556i;

    /* renamed from: j, reason: collision with root package name */
    public pw.r f83557j;

    /* renamed from: k, reason: collision with root package name */
    public uu.u f83558k;

    /* renamed from: l, reason: collision with root package name */
    public n0 f83559l;

    /* renamed from: m, reason: collision with root package name */
    public Iterator f83560m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f83561n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f83562o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f83563p;

    /* renamed from: q, reason: collision with root package name */
    public int f83564q;

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f83563p = obj;
        this.f83564q |= Integer.MIN_VALUE;
        return g.collectRecursively(null, null, null, null, false, false, this);
    }
}
