package a7;

import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class o extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f4113i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f4114j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l7.i f4115k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, l7.i iVar, zu.d dVar) {
        super(2, dVar);
        this.f4114j = mVar;
        this.f4115k = iVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new o(this.f4114j, this.f4115k, dVar);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super l7.k> dVar) {
        return ((o) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f4113i;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException(gjnZrsdA.rgkkgbphIkIkR);
        }
        a0.throwOnFailure(obj);
        this.f4113i = 1;
        Object objExecute = this.f4114j.execute(this.f4115k, this);
        if (objExecute == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objExecute;
    }
}
