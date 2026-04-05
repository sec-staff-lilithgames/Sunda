package qe;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f82799a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Looper looper) {
        super(looper);
        this.f82799a = fVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws MediaCodec.CryptoException {
        f fVar = this.f82799a;
        ArrayDeque arrayDeque = f.f82809g;
        fVar.getClass();
        int i10 = message.what;
        e eVar = null;
        if (i10 == 0) {
            e eVar2 = (e) message.obj;
            try {
                fVar.f82811a.queueInputBuffer(eVar2.f82800a, eVar2.f82801b, eVar2.f82802c, eVar2.f82804e, eVar2.f82805f);
            } catch (RuntimeException e10) {
                AtomicReference atomicReference = fVar.f82814d;
                while (!atomicReference.compareAndSet(null, e10) && atomicReference.get() == null) {
                }
            }
            eVar = eVar2;
        } else if (i10 == 1) {
            e eVar3 = (e) message.obj;
            int i11 = eVar3.f82800a;
            int i12 = eVar3.f82801b;
            MediaCodec.CryptoInfo cryptoInfo = eVar3.f82803d;
            long j10 = eVar3.f82804e;
            int i13 = eVar3.f82805f;
            try {
                synchronized (f.f82810h) {
                    fVar.f82811a.queueSecureInputBuffer(i11, i12, cryptoInfo, j10, i13);
                }
            } catch (RuntimeException e11) {
                AtomicReference atomicReference2 = fVar.f82814d;
                while (!atomicReference2.compareAndSet(null, e11) && atomicReference2.get() == null) {
                }
            }
            eVar = eVar3;
        } else if (i10 != 2) {
            AtomicReference atomicReference3 = fVar.f82814d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            fVar.f82815e.open();
        }
        if (eVar != null) {
            ArrayDeque arrayDeque2 = f.f82809g;
            synchronized (arrayDeque2) {
                arrayDeque2.add(eVar);
            }
        }
    }
}
