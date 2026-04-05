package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u3 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public kotlin.jvm.internal.a1 f53331i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53332j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z3 f53333k;

    /* renamed from: l, reason: collision with root package name */
    public int f53334l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(z3 z3Var, zu.d dVar) {
        super(dVar);
        this.f53333k = z3Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f53332j = obj;
        this.f53334l |= Integer.MIN_VALUE;
        return this.f53333k.m3794doFlingAnimationQWom1Mo(0L, this);
    }
}
