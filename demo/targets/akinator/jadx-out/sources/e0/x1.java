package e0;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x1 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public v1.f f53379i;

    /* renamed from: j, reason: collision with root package name */
    public Channel f53380j;

    /* renamed from: k, reason: collision with root package name */
    public m2 f53381k;

    /* renamed from: l, reason: collision with root package name */
    public CoroutineScope f53382l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f53383m;

    /* renamed from: n, reason: collision with root package name */
    public int f53384n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f53385o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f53386p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v5 f53387q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v5 f53388r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m2 f53389s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Channel f53390t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f53391u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(CoroutineScope coroutineScope, v5 v5Var, v5 v5Var2, m2 m2Var, Channel channel, boolean z10, zu.d dVar) {
        super(2, dVar);
        this.f53386p = coroutineScope;
        this.f53387q = v5Var;
        this.f53388r = v5Var2;
        this.f53389s = m2Var;
        this.f53390t = channel;
        this.f53391u = z10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        x1 x1Var = new x1(this.f53386p, this.f53387q, this.f53388r, this.f53389s, this.f53390t, this.f53391u, dVar);
        x1Var.f53385o = obj;
        return x1Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:25|(1:62)|26|27|57|28|(7:31|32|(0)(0)|40|41|17|(2:55|56)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        r6 = r1;
        r3 = r4;
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cd, code lost:
    
        r3.mo5139trySendJP2dKIU(e0.l.f53148a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d3, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3 A[Catch: all -> 0x0025, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0025, blocks: (B:7:0x001e, B:32:0x0098, B:48:0x00c7, B:51:0x00d3), top: B:59:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0092 -> B:32:0x0098). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00cd -> B:41:0x00ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00da -> B:17:0x0047). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.x1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(u1.c cVar, zu.d<? super tu.x0> dVar) {
        return ((x1) create(cVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
