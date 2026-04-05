package k4;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f70409a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.p f70410b;

    /* renamed from: c, reason: collision with root package name */
    public final Channel f70411c;

    /* renamed from: d, reason: collision with root package name */
    public final c f70412d;

    public l2(CoroutineScope scope, kv.l onComplete, kv.p onUndeliveredElement, kv.p consumeMessage) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.e0.checkNotNullParameter(onComplete, "onComplete");
        kotlin.jvm.internal.e0.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        kotlin.jvm.internal.e0.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.f70409a = scope;
        this.f70410b = consumeMessage;
        this.f70411c = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.f70412d = new c(0);
        Job job = (Job) scope.getCoroutineContext().get(Job.Key);
        if (job != null) {
            job.invokeOnCompletion(new j2(onComplete, this, onUndeliveredElement));
        }
    }

    public final void offer(Object obj) throws Throwable {
        Object objMo5139trySendJP2dKIU = this.f70411c.mo5139trySendJP2dKIU(obj);
        if (objMo5139trySendJP2dKIU instanceof ChannelResult.Closed) {
            Throwable thM5157exceptionOrNullimpl = ChannelResult.m5157exceptionOrNullimpl(objMo5139trySendJP2dKIU);
            if (thM5157exceptionOrNullimpl != null) {
                throw thM5157exceptionOrNullimpl;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!ChannelResult.m5163isSuccessimpl(objMo5139trySendJP2dKIU)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f70412d.getAndIncrement() == 0) {
            BuildersKt__Builders_commonKt.launch$default(this.f70409a, null, null, new k2(this, null), 3, null);
        }
    }
}
