package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public kotlin.jvm.internal.z0 f70535i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f70536j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f70537k;

    /* renamed from: l, reason: collision with root package name */
    public int f70538l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(p pVar, zu.d dVar) {
        super(dVar);
        this.f70537k = pVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70536j = obj;
        this.f70538l |= Integer.MIN_VALUE;
        return this.f70537k.writeData$datastore_core_release(null, false, this);
    }
}
