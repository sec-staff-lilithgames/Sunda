package p0;

import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l5 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public z.v0 f80324i;

    /* renamed from: j, reason: collision with root package name */
    public kv.l f80325j;

    /* renamed from: k, reason: collision with root package name */
    public Channel f80326k;

    /* renamed from: l, reason: collision with root package name */
    public b1.h f80327l;

    /* renamed from: m, reason: collision with root package name */
    public Object f80328m;

    /* renamed from: n, reason: collision with root package name */
    public int f80329n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f80330o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kv.a f80331p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(kv.a aVar, zu.d dVar) {
        super(2, dVar);
        this.f80331p = aVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        l5 l5Var = new l5(this.f80331p, dVar);
        l5Var.f80330o = obj;
        return l5Var;
    }

    /* JADX WARN: Path cross not found for [B:26:0x0099, B:39:0x00ce], limit reached: 70 */
    /* JADX WARN: Path cross not found for [B:31:0x00b6, B:35:0x00bf], limit reached: 70 */
    /* JADX WARN: Path cross not found for [B:39:0x00ce, B:26:0x0099], limit reached: 70 */
    /* JADX WARN: Path cross not found for [B:45:0x00eb, B:26:0x0099], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1 A[Catch: all -> 0x0028, PHI: r1 r7 r8 r9 r10 r11 r15
      0x00b1: PHI (r1v7 java.lang.Object) = (r1v6 java.lang.Object), (r1v10 java.lang.Object) binds: [B:27:0x00ae, B:15:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r7v5 b1.h) = (r7v4 b1.h), (r7v7 b1.h) binds: [B:27:0x00ae, B:15:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r8v2 kotlinx.coroutines.channels.Channel) = (r8v1 kotlinx.coroutines.channels.Channel), (r8v4 kotlinx.coroutines.channels.Channel) binds: [B:27:0x00ae, B:15:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r9v2 kv.l) = (r9v1 kv.l), (r9v6 kv.l) binds: [B:27:0x00ae, B:15:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r10v2 z.v0) = (r10v1 z.v0), (r10v4 z.v0) binds: [B:27:0x00ae, B:15:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r11v3 kotlinx.coroutines.flow.FlowCollector) = (r11v2 kotlinx.coroutines.flow.FlowCollector), (r11v7 kotlinx.coroutines.flow.FlowCollector) binds: [B:27:0x00ae, B:15:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r15v10 java.lang.Object) = (r15v9 java.lang.Object), (r15v0 java.lang.Object) binds: [B:27:0x00ae, B:15:0x0043] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {all -> 0x0028, blocks: (B:15:0x0043, B:29:0x00b1, B:31:0x00b6, B:36:0x00c0, B:26:0x0099, B:39:0x00ce, B:43:0x00e2, B:45:0x00eb, B:54:0x010c, B:55:0x010f, B:8:0x0024, B:18:0x0070, B:22:0x007f, B:61:0x0117, B:62:0x011a, B:19:0x0074, B:21:0x007c, B:59:0x0113, B:60:0x0116, B:20:0x0078, B:40:0x00d7, B:42:0x00df, B:52:0x0108, B:53:0x010b, B:41:0x00db), top: B:72:0x000c, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #4 {all -> 0x0028, blocks: (B:15:0x0043, B:29:0x00b1, B:31:0x00b6, B:36:0x00c0, B:26:0x0099, B:39:0x00ce, B:43:0x00e2, B:45:0x00eb, B:54:0x010c, B:55:0x010f, B:8:0x0024, B:18:0x0070, B:22:0x007f, B:61:0x0117, B:62:0x011a, B:19:0x0074, B:21:0x007c, B:59:0x0113, B:60:0x0116, B:20:0x0078, B:40:0x00d7, B:42:0x00df, B:52:0x0108, B:53:0x010b, B:41:0x00db), top: B:72:0x000c, inners: #0, #2 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00cc -> B:26:0x0099). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00e9 -> B:26:0x0099). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0103 -> B:26:0x0099). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.l5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(FlowCollector<Object> flowCollector, zu.d<? super tu.x0> dVar) {
        return ((l5) create(flowCollector, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
