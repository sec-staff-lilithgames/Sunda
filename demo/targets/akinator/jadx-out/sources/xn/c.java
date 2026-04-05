package xn;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f92055a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Looper looper) {
        super(looper);
        this.f92055a = eVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws MediaCodec.CryptoException {
        e eVar = this.f92055a;
        ArrayDeque arrayDeque = e.f92062g;
        eVar.getClass();
        int i10 = message.what;
        d dVar = null;
        if (i10 == 1) {
            d dVar2 = (d) message.obj;
            try {
                eVar.f92064a.queueInputBuffer(dVar2.f92056a, dVar2.f92057b, dVar2.f92058c, dVar2.f92060e, dVar2.f92061f);
            } catch (RuntimeException e10) {
                AtomicReference atomicReference = eVar.f92067d;
                while (!atomicReference.compareAndSet(null, e10) && atomicReference.get() == null) {
                }
            }
            dVar = dVar2;
        } else if (i10 == 2) {
            d dVar3 = (d) message.obj;
            int i11 = dVar3.f92056a;
            int i12 = dVar3.f92057b;
            MediaCodec.CryptoInfo cryptoInfo = dVar3.f92059d;
            long j10 = dVar3.f92060e;
            int i13 = dVar3.f92061f;
            try {
                synchronized (e.f92063h) {
                    eVar.f92064a.queueSecureInputBuffer(i11, i12, cryptoInfo, j10, i13);
                }
            } catch (RuntimeException e11) {
                AtomicReference atomicReference2 = eVar.f92067d;
                while (!atomicReference2.compareAndSet(null, e11) && atomicReference2.get() == null) {
                }
            }
            dVar = dVar3;
        } else if (i10 == 3) {
            eVar.f92068e.open();
        } else if (i10 != 4) {
            AtomicReference atomicReference3 = eVar.f92067d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                eVar.f92064a.setParameters((Bundle) message.obj);
            } catch (RuntimeException e12) {
                AtomicReference atomicReference4 = eVar.f92067d;
                while (!atomicReference4.compareAndSet(null, e12) && atomicReference4.get() == null) {
                }
            }
        }
        if (dVar != null) {
            ArrayDeque arrayDeque2 = e.f92062g;
            synchronized (arrayDeque2) {
                arrayDeque2.add(dVar);
            }
        }
    }
}
