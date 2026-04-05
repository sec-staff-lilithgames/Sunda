package io.bidmachine.media3.common.util;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r0 implements u {

    /* renamed from: a, reason: collision with root package name */
    public Message f60790a;

    /* renamed from: b, reason: collision with root package name */
    public s0 f60791b;

    public final void a() {
        this.f60790a = null;
        this.f60791b = null;
        ArrayList arrayList = s0.f60792b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.bidmachine.media3.common.util.u
    public v getTarget() {
        return (v) a.checkNotNull(this.f60791b);
    }

    public boolean sendAtFrontOfQueue(Handler handler) {
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) a.checkNotNull(this.f60790a));
        a();
        return zSendMessageAtFrontOfQueue;
    }

    @Override // io.bidmachine.media3.common.util.u
    public void sendToTarget() {
        ((Message) a.checkNotNull(this.f60790a)).sendToTarget();
        a();
    }

    public r0 setMessage(Message message, s0 s0Var) {
        this.f60790a = message;
        this.f60791b = s0Var;
        return this;
    }
}
