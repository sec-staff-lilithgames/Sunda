package t3;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import tu.a0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: b, reason: collision with root package name */
    public final zu.d f86289b;

    public i(zu.d<Object> dVar) {
        super(false);
        this.f86289b = dVar;
    }

    public void onError(Throwable th2) {
        if (compareAndSet(false, true)) {
            int i10 = z.f87419c;
            this.f86289b.resumeWith(z.m7131constructorimpl(a0.createFailure(th2)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f86289b.resumeWith(z.m7131constructorimpl(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
