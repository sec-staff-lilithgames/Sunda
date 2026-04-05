package androidx.lifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public l1 f6641i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6642j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m f6643k;

    /* renamed from: l, reason: collision with root package name */
    public int f6644l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, zu.d dVar) {
        super(dVar);
        this.f6643k = mVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f6642j = obj;
        this.f6644l |= Integer.MIN_VALUE;
        return this.f6643k.emitSource$lifecycle_livedata_release(null, this);
    }
}
