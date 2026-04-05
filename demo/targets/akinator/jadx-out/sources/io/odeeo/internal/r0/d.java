package io.odeeo.internal.r0;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import io.odeeo.internal.q0.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends Surface {

    /* renamed from: d, reason: collision with root package name */
    public static int f66139d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f66140e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f66141a;

    /* renamed from: b, reason: collision with root package name */
    public final b f66142b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f66143c;

    public static int a(Context context) {
        if (io.odeeo.internal.q0.m.isProtectedContentExtensionSupported(context)) {
            return io.odeeo.internal.q0.m.isSurfacelessContextExtensionSupported() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean isSecureSupported(Context context) {
        try {
            if (!f66140e) {
                f66139d = a(context);
                f66140e = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f66139d != 0;
    }

    public static d newInstanceV17(Context context, boolean z10) {
        io.odeeo.internal.q0.a.checkState(!z10 || isSecureSupported(context));
        return new b().init(z10 ? f66139d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f66142b) {
            try {
                if (!this.f66143c) {
                    this.f66142b.release();
                    this.f66143c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public d(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f66142b = bVar;
        this.f66141a = z10;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        public io.odeeo.internal.q0.j f66144a;

        /* renamed from: b, reason: collision with root package name */
        public Handler f66145b;

        /* renamed from: c, reason: collision with root package name */
        public Error f66146c;

        /* renamed from: e, reason: collision with root package name */
        public RuntimeException f66147e;

        /* renamed from: f, reason: collision with root package name */
        public d f66148f;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        public final void a(int i10) {
            io.odeeo.internal.q0.a.checkNotNull(this.f66144a);
            this.f66144a.init(i10);
            this.f66148f = new d(this, this.f66144a.getSurfaceTexture(), i10 != 0);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        a();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    p.e("DummySurface", "Failed to initialize dummy surface", e10);
                    this.f66146c = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    p.e("DummySurface", "Failed to initialize dummy surface", e11);
                    this.f66147e = e11;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }

        public d init(int i10) {
            boolean z10;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f66145b = handler;
            this.f66144a = new io.odeeo.internal.q0.j(handler);
            synchronized (this) {
                z10 = false;
                this.f66145b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f66148f == null && this.f66147e == null && this.f66146c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f66147e;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f66146c;
            if (error == null) {
                return (d) io.odeeo.internal.q0.a.checkNotNull(this.f66148f);
            }
            throw error;
        }

        public void release() {
            io.odeeo.internal.q0.a.checkNotNull(this.f66145b);
            this.f66145b.sendEmptyMessage(2);
        }

        public final void a() {
            io.odeeo.internal.q0.a.checkNotNull(this.f66144a);
            this.f66144a.release();
        }
    }
}
