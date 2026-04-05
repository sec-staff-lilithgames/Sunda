package c7;

import kotlinx.coroutines.sync.Semaphore;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public Object f11826i;

    /* renamed from: j, reason: collision with root package name */
    public Semaphore f11827j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f11828k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f11829l;

    /* renamed from: m, reason: collision with root package name */
    public int f11830m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, zu.d dVar) {
        super(dVar);
        this.f11829l = bVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f11828k = obj;
        this.f11830m |= Integer.MIN_VALUE;
        return this.f11829l.decode(this);
    }
}
