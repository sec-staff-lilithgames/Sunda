package uu;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f2 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Object f88718i;

    /* renamed from: j, reason: collision with root package name */
    public Iterator f88719j;

    /* renamed from: k, reason: collision with root package name */
    public Object f88720k;

    /* renamed from: l, reason: collision with root package name */
    public int f88721l;

    /* renamed from: m, reason: collision with root package name */
    public int f88722m;

    /* renamed from: n, reason: collision with root package name */
    public int f88723n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f88724o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f88725p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f88726q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Iterator f88727r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f88728s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f88729t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(int i10, int i11, Iterator it, boolean z10, boolean z11, zu.d dVar) {
        super(2, dVar);
        this.f88725p = i10;
        this.f88726q = i11;
        this.f88727r = it;
        this.f88728s = z10;
        this.f88729t = z11;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        f2 f2Var = new f2(this.f88725p, this.f88726q, this.f88727r, this.f88728s, this.f88729t, dVar);
        f2Var.f88724o = obj;
        return f2Var;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b2 -> B:31:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0111 -> B:52:0x0115). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0136 -> B:59:0x0139). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0162 -> B:70:0x0165). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uu.f2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(rv.v vVar, zu.d<? super tu.x0> dVar) {
        return ((f2) create(vVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
