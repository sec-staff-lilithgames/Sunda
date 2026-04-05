package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e1 implements y {

    /* renamed from: a, reason: collision with root package name */
    public Message f28440a;

    /* renamed from: b, reason: collision with root package name */
    public f1 f28441b;

    public final void a() {
        this.f28440a = null;
        this.f28441b = null;
        ArrayList arrayList = f1.f28450b;
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

    @Override // com.google.android.exoplayer2.util.y
    public z getTarget() {
        return (z) a.checkNotNull(this.f28441b);
    }

    public boolean sendAtFrontOfQueue(Handler handler) {
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) a.checkNotNull(this.f28440a));
        a();
        return zSendMessageAtFrontOfQueue;
    }

    @Override // com.google.android.exoplayer2.util.y
    public void sendToTarget() {
        ((Message) a.checkNotNull(this.f28440a)).sendToTarget();
        a();
    }

    public e1 setMessage(Message message, f1 f1Var) {
        this.f28440a = message;
        this.f28441b = f1Var;
        return this;
    }
}
