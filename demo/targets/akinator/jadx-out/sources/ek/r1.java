package ek;

import android.util.Log;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class r1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f54625i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v1 f54626j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(v1 v1Var, zu.d dVar) {
        super(2, dVar);
        this.f54626j = v1Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new r1(this.f54626j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f54625i;
        v1 v1Var = this.f54626j;
        try {
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                k4.n nVar = v1Var.f54654e;
                q1 q1Var = new q1(v1Var, null);
                this.f54625i = 1;
                if (nVar.updateData(q1Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
        } catch (Exception e10) {
            Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e10.getMessage());
            v1Var.setLocalSessionData$com_google_firebase_firebase_sessions(t0.copy$default(v1Var.getLocalSessionData$com_google_firebase_firebase_sessions(), null, ((a2) v1Var.f54653d).currentTime(), null, 5, null));
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((r1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
