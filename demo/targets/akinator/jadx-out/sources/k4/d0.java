package k4;

import kotlinx.coroutines.sync.Mutex;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public p f70306i;

    /* renamed from: j, reason: collision with root package name */
    public Mutex f70307j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f70308k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f70309l;

    /* renamed from: m, reason: collision with root package name */
    public int f70310m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(p pVar, zu.d dVar) {
        super(dVar);
        this.f70309l = pVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70308k = obj;
        this.f70310m |= Integer.MIN_VALUE;
        return p.access$incrementCollector(this.f70309l, this);
    }
}
