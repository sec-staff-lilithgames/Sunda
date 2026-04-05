package k4;

import kotlinx.coroutines.sync.Mutex;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m2 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public Object f70419i;

    /* renamed from: j, reason: collision with root package name */
    public Mutex f70420j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f70421k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p2 f70422l;

    /* renamed from: m, reason: collision with root package name */
    public int f70423m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(p2 p2Var, zu.d dVar) {
        super(dVar);
        this.f70422l = p2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70421k = obj;
        this.f70423m |= Integer.MIN_VALUE;
        return this.f70422l.lock(null, this);
    }
}
