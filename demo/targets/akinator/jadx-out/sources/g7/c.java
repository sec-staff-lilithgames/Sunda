package g7;

import kotlin.jvm.internal.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public a f57375i;

    /* renamed from: j, reason: collision with root package name */
    public l7.i f57376j;

    /* renamed from: k, reason: collision with root package name */
    public Object f57377k;

    /* renamed from: l, reason: collision with root package name */
    public Object f57378l;

    /* renamed from: m, reason: collision with root package name */
    public b1 f57379m;

    /* renamed from: n, reason: collision with root package name */
    public b1 f57380n;

    /* renamed from: o, reason: collision with root package name */
    public b1 f57381o;

    /* renamed from: p, reason: collision with root package name */
    public b1 f57382p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f57383q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f57384r;

    /* renamed from: s, reason: collision with root package name */
    public int f57385s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, zu.d dVar) {
        super(dVar);
        this.f57384r = aVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f57383q = obj;
        this.f57385s |= Integer.MIN_VALUE;
        return a.access$execute(this.f57384r, null, null, null, null, this);
    }
}
