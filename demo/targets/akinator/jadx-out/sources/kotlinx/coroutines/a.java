package kotlinx.coroutines;

import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import kv.l;
import kv.q;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71868b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f71869c;

    public /* synthetic */ a(Object obj, int i10) {
        this.f71868b = i10;
        this.f71869c = obj;
    }

    @Override // kv.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f71868b) {
            case 0:
                return CancellableContinuationImpl.resume$lambda$13$lambda$12((l) this.f71869c, (Throwable) obj, obj2, (m) obj3);
            case 1:
                return MutexImpl.onSelectCancellationUnlockConstructor$lambda$1((MutexImpl) this.f71869c, (SelectInstance) obj, obj2, obj3);
            default:
                return SemaphoreAndMutexImpl.onCancellationRelease$lambda$2((SemaphoreAndMutexImpl) this.f71869c, (Throwable) obj, (x0) obj2, (m) obj3);
        }
    }
}
