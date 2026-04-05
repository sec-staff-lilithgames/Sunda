package nh;

import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class jh {

    /* renamed from: a, reason: collision with root package name */
    public boolean f76405a;

    /* renamed from: b, reason: collision with root package name */
    public Object f76406b;

    public synchronized void a(p8.v0 v0Var, boolean z10) {
        try {
            if (this.f76405a || z10) {
                ((Handler) this.f76406b).obtainMessage(1, v0Var).sendToTarget();
            } else {
                this.f76405a = true;
                v0Var.recycle();
                this.f76405a = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
