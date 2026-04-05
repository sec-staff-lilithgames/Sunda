package kotlinx.coroutines.channels;

import kotlin.jvm.internal.a0;
import kv.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public /* synthetic */ class BufferedChannel$onReceiveOrNull$2 extends a0 implements q {
    public static final BufferedChannel$onReceiveOrNull$2 INSTANCE = new BufferedChannel$onReceiveOrNull$2();

    public BufferedChannel$onReceiveOrNull$2() {
        super(3, BufferedChannel.class, "processResultSelectReceiveOrNull", "processResultSelectReceiveOrNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kv.q
    public final Object invoke(BufferedChannel<?> bufferedChannel, Object obj, Object obj2) {
        return bufferedChannel.processResultSelectReceiveOrNull(obj, obj2);
    }
}
