package l2;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public m f72297i;

    /* renamed from: j, reason: collision with root package name */
    public List f72298j;

    /* renamed from: k, reason: collision with root package name */
    public w f72299k;

    /* renamed from: l, reason: collision with root package name */
    public int f72300l;

    /* renamed from: m, reason: collision with root package name */
    public int f72301m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f72302n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f72303o;

    /* renamed from: p, reason: collision with root package name */
    public int f72304p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, zu.d dVar) {
        super(dVar);
        this.f72303o = mVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f72302n = obj;
        this.f72304p |= Integer.MIN_VALUE;
        return this.f72303o.load(this);
    }
}
