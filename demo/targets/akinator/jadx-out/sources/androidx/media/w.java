package androidx.media;

import android.os.Bundle;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6873a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6874b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6875c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6876d;

    /* renamed from: e, reason: collision with root package name */
    public int f6877e;

    public w(Object obj) {
        this.f6873a = obj;
    }

    public final boolean a() {
        return this.f6874b || this.f6875c || this.f6876d;
    }

    public void b(Bundle bundle) {
        throw new UnsupportedOperationException("It is not supported to send an error for " + this.f6873a);
    }

    public void c(Bundle bundle) {
        throw new UnsupportedOperationException("It is not supported to send an interim update for " + this.f6873a);
    }

    public abstract void d(Object obj);

    public void detach() {
        boolean z10 = this.f6874b;
        Object obj = this.f6873a;
        if (z10) {
            throw new IllegalStateException(o2.j(obj, "detach() called when detach() had already been called for: "));
        }
        if (this.f6875c) {
            throw new IllegalStateException(o2.j(obj, "detach() called when sendResult() had already been called for: "));
        }
        if (this.f6876d) {
            throw new IllegalStateException(o2.j(obj, "detach() called when sendError() had already been called for: "));
        }
        this.f6874b = true;
    }

    public void sendError(Bundle bundle) {
        if (this.f6875c || this.f6876d) {
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f6873a);
        }
        this.f6876d = true;
        b(bundle);
    }

    public void sendProgressUpdate(Bundle bundle) {
        if (this.f6875c || this.f6876d) {
            throw new IllegalStateException("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: " + this.f6873a);
        }
        if (bundle != null && bundle.containsKey("android.media.browse.extra.DOWNLOAD_PROGRESS")) {
            float f10 = bundle.getFloat("android.media.browse.extra.DOWNLOAD_PROGRESS");
            if (f10 < -1.0E-5f || f10 > 1.00001f) {
                throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0]");
            }
        }
        c(bundle);
    }

    public void sendResult(Object obj) {
        if (this.f6875c || this.f6876d) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f6873a);
        }
        this.f6875c = true;
        d(obj);
    }
}
