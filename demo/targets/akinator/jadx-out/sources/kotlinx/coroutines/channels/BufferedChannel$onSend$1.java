package kotlinx.coroutines.channels;

import kotlin.jvm.internal.a0;
import kotlinx.coroutines.selects.SelectInstance;
import kv.q;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public /* synthetic */ class BufferedChannel$onSend$1 extends a0 implements q {
    public static final BufferedChannel$onSend$1 INSTANCE = new BufferedChannel$onSend$1();

    public BufferedChannel$onSend$1() {
        super(3, BufferedChannel.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BufferedChannel<?>) obj, (SelectInstance<?>) obj2, obj3);
        return x0.f87415a;
    }

    public final void invoke(BufferedChannel<?> bufferedChannel, SelectInstance<?> selectInstance, Object obj) {
        bufferedChannel.registerSelectForSend(selectInstance, obj);
    }
}
