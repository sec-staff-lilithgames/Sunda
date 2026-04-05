package k4;

import kotlinx.coroutines.sync.Mutex;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public p f70270i;

    /* renamed from: j, reason: collision with root package name */
    public Mutex f70271j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f70272k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f70273l;

    /* renamed from: m, reason: collision with root package name */
    public int f70274m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p pVar, zu.d dVar) {
        super(dVar);
        this.f70273l = pVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70272k = obj;
        this.f70274m |= Integer.MIN_VALUE;
        return p.access$decrementCollector(this.f70273l, this);
    }
}
