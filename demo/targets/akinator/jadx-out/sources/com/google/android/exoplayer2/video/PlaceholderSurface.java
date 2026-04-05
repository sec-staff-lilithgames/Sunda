package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.k;
import com.google.android.exoplayer2.util.w;
import com.google.android.exoplayer2.util.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class PlaceholderSurface extends Surface {

    /* renamed from: f, reason: collision with root package name */
    public static int f28631f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f28632g;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28633b;

    /* renamed from: c, reason: collision with root package name */
    public final a f28634c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28635e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends HandlerThread implements Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        public k f28636b;

        /* renamed from: c, reason: collision with root package name */
        public Handler f28637c;

        /* renamed from: e, reason: collision with root package name */
        public Error f28638e;

        /* renamed from: f, reason: collision with root package name */
        public RuntimeException f28639f;

        /* renamed from: g, reason: collision with root package name */
        public PlaceholderSurface f28640g;

        public a() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public final void a(int i10) throws w {
            com.google.android.exoplayer2.util.a.checkNotNull(this.f28636b);
            this.f28636b.init(i10);
            this.f28640g = new PlaceholderSurface(this, this.f28636b.getSurfaceTexture(), i10 != 0);
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
                            } catch (w e10) {
                                f0.e("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                                this.f28639f = new IllegalStateException(e10);
                                synchronized (this) {
                                    notify();
                                }
                            }
                        } catch (Error e11) {
                            f0.e("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                            this.f28638e = e11;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } catch (RuntimeException e12) {
                        f0.e("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                        this.f28639f = e12;
                        synchronized (this) {
                            notify();
                        }
                    }
                } else if (i10 == 2) {
                    try {
                        com.google.android.exoplayer2.util.a.checkNotNull(this.f28636b);
                        this.f28636b.release();
                        return true;
                    } catch (Throwable th2) {
                        try {
                            f0.e("PlaceholderSurface", "Failed to release placeholder surface", th2);
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
            this.f28637c = handler;
            this.f28636b = new k(handler);
            synchronized (this) {
                z10 = false;
                this.f28637c.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f28640g == null && this.f28639f == null && this.f28638e == null) {
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
            RuntimeException runtimeException = this.f28639f;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f28638e;
            if (error == null) {
                return (PlaceholderSurface) com.google.android.exoplayer2.util.a.checkNotNull(this.f28640g);
            }
            throw error;
        }

        public void release() {
            com.google.android.exoplayer2.util.a.checkNotNull(this.f28637c);
            this.f28637c.sendEmptyMessage(2);
        }
    }

    public PlaceholderSurface(a aVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f28634c = aVar;
        this.f28633b = z10;
    }

    public static synchronized boolean isSecureSupported(Context context) {
        try {
            if (!f28632g) {
                f28631f = x.isProtectedContentExtensionSupported(context) ? x.isSurfacelessContextExtensionSupported() ? 1 : 2 : 0;
                f28632g = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f28631f != 0;
    }

    public static PlaceholderSurface newInstanceV17(Context context, boolean z10) {
        com.google.android.exoplayer2.util.a.checkState(!z10 || isSecureSupported(context));
        return new a().init(z10 ? f28631f : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f28634c) {
            try {
                if (!this.f28635e) {
                    this.f28634c.release();
                    this.f28635e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
