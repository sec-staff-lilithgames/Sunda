package t3;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f86285a;

    /* renamed from: b, reason: collision with root package name */
    public f f86286b;

    /* renamed from: c, reason: collision with root package name */
    public CancellationSignal f86287c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f86288d;

    public void cancel() {
        synchronized (this) {
            try {
                if (this.f86285a) {
                    return;
                }
                this.f86285a = true;
                this.f86288d = true;
                f fVar = this.f86286b;
                CancellationSignal cancellationSignal = this.f86287c;
                if (fVar != null) {
                    try {
                        fVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f86288d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                synchronized (this) {
                    this.f86288d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public Object getCancellationSignalObject() {
        CancellationSignal cancellationSignal;
        synchronized (this) {
            try {
                if (this.f86287c == null) {
                    CancellationSignal cancellationSignal2 = new CancellationSignal();
                    this.f86287c = cancellationSignal2;
                    if (this.f86285a) {
                        cancellationSignal2.cancel();
                    }
                }
                cancellationSignal = this.f86287c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cancellationSignal;
    }

    public boolean isCanceled() {
        boolean z10;
        synchronized (this) {
            z10 = this.f86285a;
        }
        return z10;
    }

    public void setOnCancelListener(f fVar) {
        synchronized (this) {
            while (this.f86288d) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f86286b == fVar) {
                return;
            }
            this.f86286b = fVar;
            if (this.f86285a && fVar != null) {
                fVar.onCancel();
            }
        }
    }

    public void throwIfCanceled() {
        if (isCanceled()) {
            throw new s();
        }
    }
}
