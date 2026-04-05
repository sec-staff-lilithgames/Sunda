package d7;

import bv.n;
import java.io.IOException;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import pw.h0;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f51912i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, zu.d dVar) {
        super(2, dVar);
        this.f51912i = eVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new g(this.f51912i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        e eVar = this.f51912i;
        synchronized (eVar) {
            if (!eVar.f51891p || eVar.f51892q) {
                return x0.f87415a;
            }
            try {
                eVar.o();
            } catch (IOException unused) {
                eVar.f51893r = true;
            }
            try {
                if (e.access$journalRewriteRequired(eVar)) {
                    eVar.q();
                }
            } catch (IOException unused2) {
                eVar.f51894s = true;
                eVar.f51889n = h0.buffer(h0.blackhole());
            }
            return x0.f87415a;
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((g) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
