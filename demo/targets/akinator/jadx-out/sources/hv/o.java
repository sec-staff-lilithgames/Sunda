package hv;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public uu.u f59231i;

    /* renamed from: j, reason: collision with root package name */
    public d f59232j;

    /* renamed from: k, reason: collision with root package name */
    public Object f59233k;

    /* renamed from: l, reason: collision with root package name */
    public Object f59234l;

    /* renamed from: m, reason: collision with root package name */
    public Object f59235m;

    /* renamed from: n, reason: collision with root package name */
    public Object f59236n;

    /* renamed from: o, reason: collision with root package name */
    public Object f59237o;

    /* renamed from: p, reason: collision with root package name */
    public Object f59238p;

    /* renamed from: q, reason: collision with root package name */
    public Object f59239q;

    /* renamed from: r, reason: collision with root package name */
    public int f59240r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f59241s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f59242t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, zu.d dVar) {
        super(2, dVar);
        this.f59242t = pVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        o oVar = new o(this.f59242t, dVar);
        oVar.f59241s = obj;
        return oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x019b, code lost:
    
        if (r1.yield(r12, r18) == r2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02af, code lost:
    
        if (r1.yield(r14, r18) == r2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0255, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0277 -> B:63:0x0255). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x02af -> B:63:0x0255). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x02b2 -> B:63:0x0255). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.nio.file.FileSystemLoopException, hv.i {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hv.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(rv.v vVar, zu.d<? super x0> dVar) {
        return ((o) create(vVar, dVar)).invokeSuspend(x0.f87415a);
    }
}
