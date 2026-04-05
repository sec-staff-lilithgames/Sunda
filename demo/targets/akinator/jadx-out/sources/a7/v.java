package a7;

import android.graphics.Bitmap;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f4151i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l7.i f4152j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f4153k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m7.j f4154l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f4155m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Bitmap f4156n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(l7.i iVar, q qVar, m7.j jVar, c cVar, Bitmap bitmap, zu.d dVar) {
        super(2, dVar);
        this.f4152j = iVar;
        this.f4153k = qVar;
        this.f4154l = jVar;
        this.f4155m = cVar;
        this.f4156n = bitmap;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new v(this.f4152j, this.f4153k, this.f4154l, this.f4155m, this.f4156n, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f4151i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return obj;
        }
        a0.throwOnFailure(obj);
        List list = this.f4153k.f4130o;
        boolean z10 = this.f4156n != null;
        l7.i iVar = this.f4152j;
        g7.l lVar = new g7.l(iVar, list, 0, iVar, this.f4154l, this.f4155m, z10);
        this.f4151i = 1;
        Object objProceed = lVar.proceed(iVar, this);
        return objProceed == coroutine_suspended ? coroutine_suspended : objProceed;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super l7.k> dVar) {
        return ((v) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
