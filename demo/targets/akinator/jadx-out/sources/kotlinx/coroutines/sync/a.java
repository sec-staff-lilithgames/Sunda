package kotlinx.coroutines.sync;

import kotlinx.coroutines.sync.MutexImpl;
import kv.q;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71901b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutexImpl f71902c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f71903e;

    public /* synthetic */ a(MutexImpl mutexImpl, Object obj, int i10) {
        this.f71901b = i10;
        this.f71902c = mutexImpl;
        this.f71903e = obj;
    }

    @Override // kv.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f71901b) {
            case 0:
                return MutexImpl.CancellableContinuationWithOwner.tryResume$lambda$3(this.f71902c, (MutexImpl.CancellableContinuationWithOwner) this.f71903e, (Throwable) obj, (x0) obj2, (m) obj3);
            default:
                return MutexImpl.onSelectCancellationUnlockConstructor$lambda$1$lambda$0(this.f71902c, this.f71903e, (Throwable) obj, obj2, (m) obj3);
        }
    }
}
