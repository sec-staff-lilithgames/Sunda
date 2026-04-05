package e0;

import e0.m;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g1 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public h1 f53064i;

    /* renamed from: j, reason: collision with root package name */
    public CoroutineScope f53065j;

    /* renamed from: k, reason: collision with root package name */
    public m.c f53066k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f53067l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h1 f53068m;

    /* renamed from: n, reason: collision with root package name */
    public int f53069n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(h1 h1Var, zu.d dVar) {
        super(dVar);
        this.f53068m = h1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f53067l = obj;
        this.f53069n |= Integer.MIN_VALUE;
        return this.f53068m.processDragStop(null, null, this);
    }
}
