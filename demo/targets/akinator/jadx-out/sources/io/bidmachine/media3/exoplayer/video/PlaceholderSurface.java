package io.bidmachine.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.n;
import io.bidmachine.media3.common.util.s;
import io.bidmachine.media3.common.util.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class PlaceholderSurface extends Surface {

    /* renamed from: f, reason: collision with root package name */
    public static int f61579f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f61580g;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f61581b;

    /* renamed from: c, reason: collision with root package name */
    public final a f61582c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f61583e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends HandlerThread implements Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        public n f61584b;

        /* renamed from: c, reason: collision with root package name */
        public Handler f61585c;

        /* renamed from: e, reason: collision with root package name */
        public Error f61586e;

        /* renamed from: f, reason: collision with root package name */
        public RuntimeException f61587f;

        /* renamed from: g, reason: collision with root package name */
        public PlaceholderSurface f61588g;

        public a() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public final void a(int i10) throws s {
            io.bidmachine.media3.common.util.a.checkNotNull(this.f61584b);
            this.f61584b.init(i10);
            this.f61588g = new PlaceholderSurface(this, this.f61584b.getSurfaceTexture(), i10 != 0);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 == 1) {
                    try {
                        try {
                            try {
                                a(message.arg1);
                                synchronized (this) {
                                    notify();
                                }
                                return true;
                            } catch (Error e10) {
                                b0.e("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                                this.f61586e = e10;
                                synchronized (this) {
                                    notify();
                                }
                            }
                        } catch (s e11) {
                            b0.e("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                            this.f61587f = new IllegalStateException(e11);
                            synchronized (this) {
                                notify();
                            }
                        }
                    } catch (RuntimeException e12) {
                        b0.e("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                        this.f61587f = e12;
                        synchronized (this) {
                            notify();
                        }
                    }
                } else if (i10 == 2) {
                    try {
                        io.bidmachine.media3.common.util.a.checkNotNull(this.f61584b);
                        this.f61584b.release();
                        return true;
                    } catch (Throwable th2) {
                        try {
                            b0.e("PlaceholderSurface", "Failed to release placeholder surface", th2);
                            return true;
                        } finally {
                            quit();
                        }
                    }
                }
                return true;
            } catch (Throwable th3) {
                synchronized (this) {
                    notify();
                    throw th3;
                }
            }
        }

        public PlaceholderSurface init(int i10) {
            boolean z10;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f61585c = handler;
            this.f61584b = new n(handler);
            synchronized (this) {
                z10 = false;
                this.f61585c.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f61588g == null && this.f61587f == null && this.f61586e == null) {
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
            RuntimeException runtimeException = this.f61587f;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f61586e;
            if (error == null) {
                return (PlaceholderSurface) io.bidmachine.media3.common.util.a.checkNotNull(this.f61588g);
            }
            throw error;
        }

        public void release() {
            io.bidmachine.media3.common.util.a.checkNotNull(this.f61585c);
            this.f61585c.sendEmptyMessage(2);
        }
    }

    public PlaceholderSurface(a aVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f61582c = aVar;
        this.f61581b = z10;
    }

    public static synchronized boolean isSecureSupported(Context context) {
        try {
            if (!f61580g) {
                f61579f = t.isProtectedContentExtensionSupported(context) ? t.isSurfacelessContextExtensionSupported() ? 1 : 2 : 0;
                f61580g = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f61579f != 0;
    }

    public static PlaceholderSurface newInstance(Context context, boolean z10) {
        io.bidmachine.media3.common.util.a.checkState(!z10 || isSecureSupported(context));
        return new a().init(z10 ? f61579f : 0);
    }

    @Deprecated
    public static PlaceholderSurface newInstanceV17(Context context, boolean z10) {
        return newInstance(context, z10);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f61582c) {
            try {
                if (!this.f61583e) {
                    this.f61582c.release();
                    this.f61583e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
