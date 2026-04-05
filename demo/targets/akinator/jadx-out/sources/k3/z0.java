package k3;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import java.io.Closeable;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 implements Closeable {

    /* renamed from: c, reason: collision with root package name */
    public PendingIntent.OnFinished f70268c;

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f70267b = new CountDownLatch(1);

    /* renamed from: e, reason: collision with root package name */
    public boolean f70269e = false;

    public z0(PendingIntent.OnFinished onFinished) {
        this.f70268c = onFinished;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f70269e) {
            this.f70268c = null;
        }
        this.f70267b.countDown();
    }

    public void complete() {
        this.f70269e = true;
    }

    public PendingIntent.OnFinished getCallback() {
        if (this.f70268c == null) {
            return null;
        }
        return new PendingIntent.OnFinished() { // from class: k3.y0
            @Override // android.app.PendingIntent.OnFinished
            public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i10, String str, Bundle bundle) {
                z0 z0Var = this.f70264a;
                z0Var.getClass();
                boolean z10 = false;
                while (true) {
                    try {
                        z0Var.f70267b.await();
                        break;
                    } catch (InterruptedException unused) {
                        z10 = true;
                        pendingIntent = pendingIntent;
                        intent = intent;
                        i10 = i10;
                        str = str;
                        bundle = bundle;
                    } catch (Throwable th2) {
                        if (!z10) {
                            throw th2;
                        }
                        Thread.currentThread().interrupt();
                        throw th2;
                    }
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                PendingIntent.OnFinished onFinished = z0Var.f70268c;
                if (onFinished != null) {
                    onFinished.onSendFinished(pendingIntent, intent, i10, str, bundle);
                    z0Var.f70268c = null;
                }
            }
        };
    }
}
