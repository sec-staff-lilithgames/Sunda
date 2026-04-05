package e0;

import e0.m;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f1 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public h1 f53045i;

    /* renamed from: j, reason: collision with root package name */
    public CoroutineScope f53046j;

    /* renamed from: k, reason: collision with root package name */
    public m.b f53047k;

    /* renamed from: l, reason: collision with root package name */
    public f0.b f53048l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f53049m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h1 f53050n;

    /* renamed from: o, reason: collision with root package name */
    public int f53051o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(h1 h1Var, zu.d dVar) {
        super(dVar);
        this.f53050n = h1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f53049m = obj;
        this.f53051o |= Integer.MIN_VALUE;
        return this.f53050n.processDragStart(null, null, this);
    }
}
