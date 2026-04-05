package oa;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Iterator f78750i;

    /* renamed from: j, reason: collision with root package name */
    public ka.b f78751j;

    /* renamed from: k, reason: collision with root package name */
    public ka.a f78752k;

    /* renamed from: l, reason: collision with root package name */
    public int f78753l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f78754m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List f78755n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, List list, zu.d dVar) {
        super(2, dVar);
        this.f78754m = lVar;
        this.f78755n = list;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new i(this.f78754m, this.f78755n, dVar);
    }

    /* JADX WARN: Path cross not found for [B:36:0x00ff, B:43:?], limit reached: 46 */
    /* JADX WARN: Path cross not found for [B:43:?, B:36:0x00ff], limit reached: 46 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00fd -> B:22:0x0076). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x010c -> B:22:0x0076). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((i) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
