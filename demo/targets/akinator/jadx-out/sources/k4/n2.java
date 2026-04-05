package k4;

import kotlinx.coroutines.sync.Mutex;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n2 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public Mutex f70427i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f70428j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f70429k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p2 f70430l;

    /* renamed from: m, reason: collision with root package name */
    public int f70431m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(p2 p2Var, zu.d dVar) {
        super(dVar);
        this.f70430l = p2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70429k = obj;
        this.f70431m |= Integer.MIN_VALUE;
        return this.f70430l.tryLock(null, this);
    }
}
