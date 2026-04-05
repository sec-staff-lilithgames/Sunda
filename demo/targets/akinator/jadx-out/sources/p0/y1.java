package p0;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y1 implements j4, CoroutineExceptionHandler {

    /* renamed from: b, reason: collision with root package name */
    public final zu.m f80607b;

    /* renamed from: c, reason: collision with root package name */
    public final kv.p f80608c;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineScope f80609e;

    /* renamed from: f, reason: collision with root package name */
    public Job f80610f;

    public y1(zu.m mVar, kv.p pVar) {
        this.f80607b = mVar;
        this.f80608c = pVar;
        this.f80609e = CoroutineScopeKt.CoroutineScope(mVar.plus(mVar.get(d1.g.f51699c) != null ? this : zu.n.f98854b));
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, zu.k, zu.m
    public <R> R fold(R r10, kv.p pVar) {
        return (R) CoroutineExceptionHandler.DefaultImpls.fold(this, r10, pVar);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, zu.k, zu.m
    public <E extends zu.k> E get(zu.l lVar) {
        return (E) CoroutineExceptionHandler.DefaultImpls.get(this, lVar);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, zu.k
    public zu.l getKey() {
        return CoroutineExceptionHandler.Key;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(zu.m mVar, Throwable th2) throws Throwable {
        d1.g gVar = (d1.g) mVar.get(d1.g.f51699c);
        if (gVar != null) {
            gVar.attachComposeStackTrace(th2, this);
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.f80607b.get(CoroutineExceptionHandler.Key);
        if (coroutineExceptionHandler == null) {
            throw th2;
        }
        coroutineExceptionHandler.handleException(mVar, th2);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, zu.k, zu.m
    public zu.m minusKey(zu.l lVar) {
        return CoroutineExceptionHandler.DefaultImpls.minusKey(this, lVar);
    }

    @Override // p0.j4
    public void onAbandoned() {
        Job job = this.f80610f;
        if (job != null) {
            job.cancel((CancellationException) new a2());
        }
        this.f80610f = null;
    }

    @Override // p0.j4
    public void onForgotten() {
        Job job = this.f80610f;
        if (job != null) {
            job.cancel((CancellationException) new a2());
        }
        this.f80610f = null;
    }

    @Override // p0.j4
    public void onRemembered() {
        Job job = this.f80610f;
        if (job != null) {
            JobKt__JobKt.cancel$default(job, "Old job was still running!", null, 2, null);
        }
        this.f80610f = BuildersKt__Builders_commonKt.launch$default(this.f80609e, null, null, this.f80608c, 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, zu.k, zu.m
    public zu.m plus(zu.m mVar) {
        return CoroutineExceptionHandler.DefaultImpls.plus(this, mVar);
    }
}
