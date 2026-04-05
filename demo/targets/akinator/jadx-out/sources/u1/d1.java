package u1;

import kotlinx.coroutines.Job;
import u1.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d1 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public Job f87541i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f87542j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g1.a f87543k;

    /* renamed from: l, reason: collision with root package name */
    public int f87544l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(g1.a aVar, zu.d dVar) {
        super(dVar);
        this.f87543k = aVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f87542j = obj;
        this.f87544l |= Integer.MIN_VALUE;
        return this.f87543k.withTimeout(0L, null, this);
    }
}
