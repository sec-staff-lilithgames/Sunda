package e0;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public kotlin.jvm.internal.b1 f53358i;

    /* renamed from: j, reason: collision with root package name */
    public kotlin.jvm.internal.b1 f53359j;

    /* renamed from: k, reason: collision with root package name */
    public int f53360k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f53361l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Channel f53362m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o2 f53363n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v5 f53364o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(Channel channel, o2 o2Var, v5 v5Var, zu.d dVar) {
        super(2, dVar);
        this.f53362m = channel;
        this.f53363n = o2Var;
        this.f53364o = v5Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        w1 w1Var = new w1(this.f53362m, this.f53363n, this.f53364o, dVar);
        w1Var.f53361l = obj;
        return w1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dc, code lost:
    
        if (r10.processDragCancel(r5, r9) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f1, code lost:
    
        if (r10.processDragCancel(r1, r9) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cb, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0 A[Catch: CancellationException -> 0x0038, PHI: r1 r5
      0x00b0: PHI (r1v11 kotlin.jvm.internal.b1) = (r1v3 kotlin.jvm.internal.b1), (r1v18 kotlin.jvm.internal.b1) binds: [B:12:0x0033, B:31:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r5v7 kotlinx.coroutines.CoroutineScope) = (r5v4 kotlinx.coroutines.CoroutineScope), (r5v8 kotlinx.coroutines.CoroutineScope) binds: [B:12:0x0033, B:31:0x00ad] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {CancellationException -> 0x0038, blocks: (B:30:0x0099, B:33:0x00b0, B:35:0x00ba, B:40:0x00cd, B:42:0x00d1, B:12:0x0033), top: B:55:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba A[Catch: CancellationException -> 0x0038, TryCatch #1 {CancellationException -> 0x0038, blocks: (B:30:0x0099, B:33:0x00b0, B:35:0x00ba, B:40:0x00cd, B:42:0x00d1, B:12:0x0033), top: B:55:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd A[Catch: CancellationException -> 0x0038, TryCatch #1 {CancellationException -> 0x0038, blocks: (B:30:0x0099, B:33:0x00b0, B:35:0x00ba, B:40:0x00cd, B:42:0x00d1, B:12:0x0033), top: B:55:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00df -> B:18:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f1 -> B:39:0x00cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00f4 -> B:18:0x0058). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.w1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((w1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
