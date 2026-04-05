package kotlinx.coroutines.channels;

import kotlin.jvm.internal.a0;
import kotlinx.coroutines.selects.SelectInstance;
import kv.q;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public /* synthetic */ class BufferedChannel$onReceiveCatching$1 extends a0 implements q {
    public static final BufferedChannel$onReceiveCatching$1 INSTANCE = new BufferedChannel$onReceiveCatching$1();

    public BufferedChannel$onReceiveCatching$1() {
        super(3, BufferedChannel.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BufferedChannel<?>) obj, (SelectInstance<?>) obj2, obj3);
        return x0.f87415a;
    }

    public final void invoke(BufferedChannel<?> bufferedChannel, SelectInstance<?> selectInstance, Object obj) {
        bufferedChannel.registerSelectForReceive(selectInstance, obj);
    }
}
