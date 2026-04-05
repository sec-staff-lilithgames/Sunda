package s4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.util.j1;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s4.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 implements p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f85397a;

    /* renamed from: b, reason: collision with root package name */
    public final u3.g f85398b;

    /* renamed from: c, reason: collision with root package name */
    public final f0.a f85399c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f85400d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public Handler f85401e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f85402f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f85403g;

    /* renamed from: h, reason: collision with root package name */
    public f0.b f85404h;

    /* renamed from: i, reason: collision with root package name */
    public q f85405i;

    /* renamed from: j, reason: collision with root package name */
    public h0 f85406j;

    /* renamed from: k, reason: collision with root package name */
    public g0 f85407k;

    public i0(Context context, u3.g gVar, f0.a aVar) {
        w3.i.checkNotNull(context, "Context cannot be null");
        w3.i.checkNotNull(gVar, "FontRequest cannot be null");
        this.f85397a = context.getApplicationContext();
        this.f85398b = gVar;
        this.f85399c = aVar;
    }

    public final void a() {
        synchronized (this.f85400d) {
            try {
                this.f85405i = null;
                h0 h0Var = this.f85406j;
                if (h0Var != null) {
                    this.f85399c.unregisterObserver(this.f85397a, h0Var);
                    this.f85406j = null;
                }
                Handler handler = this.f85401e;
                if (handler != null) {
                    handler.removeCallbacks(this.f85407k);
                }
                this.f85401e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f85403g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f85402f = null;
                this.f85403g = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f85400d) {
            try {
                if (this.f85405i == null) {
                    return;
                }
                if (this.f85402f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new j1("emojiCompat", 5));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f85403g = threadPoolExecutor;
                    this.f85402f = threadPoolExecutor;
                }
                this.f85402f.execute(new g0(this, 0));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final u3.o c() {
        try {
            u3.n nVarFetchFonts = this.f85399c.fetchFonts(this.f85397a, this.f85398b);
            if (nVarFetchFonts.getStatusCode() != 0) {
                throw new RuntimeException("fetchFonts failed (" + nVarFetchFonts.getStatusCode() + ")");
            }
            u3.o[] fonts = nVarFetchFonts.getFonts();
            if (fonts == null || fonts.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return fonts[0];
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("provider not found", e10);
        }
    }

    public final void d(Uri uri, long j10) {
        synchronized (this.f85400d) {
            try {
                Handler handlerCreateAsync = this.f85401e;
                if (handlerCreateAsync == null) {
                    handlerCreateAsync = Build.VERSION.SDK_INT >= 28 ? a.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
                    this.f85401e = handlerCreateAsync;
                }
                if (this.f85406j == null) {
                    h0 h0Var = new h0(this, handlerCreateAsync);
                    this.f85406j = h0Var;
                    this.f85399c.registerObserver(this.f85397a, uri, h0Var);
                }
                if (this.f85407k == null) {
                    this.f85407k = new g0(this, 1);
                }
                handlerCreateAsync.postDelayed(this.f85407k, j10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // s4.p
    public void load(q qVar) {
        w3.i.checkNotNull(qVar, "LoaderCallback cannot be null");
        synchronized (this.f85400d) {
            this.f85405i = qVar;
        }
        b();
    }

    public void setExecutor(Executor executor) {
        synchronized (this.f85400d) {
            this.f85402f = executor;
        }
    }

    public void setRetryPolicy(f0.b bVar) {
        synchronized (this.f85400d) {
            this.f85404h = bVar;
        }
    }
}
