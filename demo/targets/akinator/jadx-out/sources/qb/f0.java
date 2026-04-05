package qb;

import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;
import xv.l0;
import xv.o0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f82685i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l0 f82686j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o0 f82687k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d0 f82688l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(l0 l0Var, o0 o0Var, d0 d0Var, zu.d dVar) {
        super(2, dVar);
        this.f82686j = l0Var;
        this.f82687k = o0Var;
        this.f82688l = d0Var;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new f0(this.f82686j, this.f82687k, this.f82688l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f82685i;
        int wSResponse = 400;
        try {
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                xv.j jVarNewCall = this.f82686j.newCall(this.f82687k);
                this.f82685i = 1;
                obj = ob.d.await(jVarNewCall, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            v0 v0Var = (v0) obj;
            if (v0Var.isSuccessful()) {
                String strString = v0Var.body().string();
                if (strString.length() != 0) {
                    wSResponse = this.f82688l.parseWSResponse(strString);
                }
            }
        } catch (SocketTimeoutException unused) {
            wSResponse = 600;
        } catch (CancellationException e10) {
            throw e10;
        } catch (Exception unused2) {
        }
        return bv.b.boxInt(wSResponse);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((f0) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
