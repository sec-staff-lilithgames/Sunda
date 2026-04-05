package k4;

import java.util.concurrent.CancellationException;
import k4.o1;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public static final t0 f70516e = new t0(2);

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((o1.a) obj, (Throwable) obj2);
        return tu.x0.f87415a;
    }

    public final void invoke(o1.a msg, Throwable th2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(msg, "msg");
        CompletableDeferred<Object> ack = msg.getAck();
        if (th2 == null) {
            th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        ack.completeExceptionally(th2);
    }
}
