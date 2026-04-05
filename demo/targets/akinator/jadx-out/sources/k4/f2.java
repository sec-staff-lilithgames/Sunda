package k4;

import kotlinx.coroutines.sync.Mutex;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f2 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public g2 f70329i;

    /* renamed from: j, reason: collision with root package name */
    public Mutex f70330j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f70331k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g2 f70332l;

    /* renamed from: m, reason: collision with root package name */
    public int f70333m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(g2 g2Var, zu.d dVar) {
        super(dVar);
        this.f70332l = g2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70331k = obj;
        this.f70333m |= Integer.MIN_VALUE;
        return this.f70332l.runIfNeeded(this);
    }
}
