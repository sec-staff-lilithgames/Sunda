package kotlinx.coroutines.sync;

import kotlin.jvm.internal.a0;
import kotlinx.coroutines.selects.SelectInstance;
import kv.q;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public /* synthetic */ class MutexImpl$onLock$1 extends a0 implements q {
    public static final MutexImpl$onLock$1 INSTANCE = new MutexImpl$onLock$1();

    public MutexImpl$onLock$1() {
        super(3, MutexImpl.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((MutexImpl) obj, (SelectInstance<?>) obj2, obj3);
        return x0.f87415a;
    }

    public final void invoke(MutexImpl mutexImpl, SelectInstance<?> selectInstance, Object obj) {
        mutexImpl.onLockRegFunction(selectInstance, obj);
    }
}
