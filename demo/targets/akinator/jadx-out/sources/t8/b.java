package t8;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import j9.s;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import r8.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public static final com.bumptech.glide.f f86557k = new com.bumptech.glide.f();

    /* renamed from: l, reason: collision with root package name */
    public static final long f86558l = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public final q8.d f86559b;

    /* renamed from: c, reason: collision with root package name */
    public final o f86560c;

    /* renamed from: e, reason: collision with root package name */
    public final d f86561e;

    /* renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.f f86562f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f86563g;

    /* renamed from: h, reason: collision with root package name */
    public final Handler f86564h;

    /* renamed from: i, reason: collision with root package name */
    public long f86565i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f86566j;

    public b(q8.d dVar, o oVar, d dVar2) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f86563g = new HashSet();
        this.f86565i = 40L;
        this.f86559b = dVar;
        this.f86560c = oVar;
        this.f86561e = dVar2;
        this.f86562f = f86557k;
        this.f86564h = handler;
    }

    public void cancel() {
        this.f86566j = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        d dVar;
        Bitmap bitmapCreateBitmap;
        this.f86562f.getClass();
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        while (true) {
            dVar = this.f86561e;
            if (dVar.isEmpty() || SystemClock.currentThreadTimeMillis() - jCurrentThreadTimeMillis >= 32) {
                break;
            }
            f fVarRemove = dVar.remove();
            HashSet hashSet = this.f86563g;
            boolean zContains = hashSet.contains(fVarRemove);
            q8.d dVar2 = this.f86559b;
            if (zContains) {
                bitmapCreateBitmap = Bitmap.createBitmap(fVarRemove.f86579a, fVarRemove.f86580b, fVarRemove.f86581c);
            } else {
                hashSet.add(fVarRemove);
                bitmapCreateBitmap = dVar2.getDirty(fVarRemove.f86579a, fVarRemove.f86580b, fVarRemove.f86581c);
            }
            int bitmapByteSize = s.getBitmapByteSize(bitmapCreateBitmap);
            o oVar = this.f86560c;
            if (oVar.getMaxSize() - oVar.getCurrentSize() >= bitmapByteSize) {
                oVar.put(new a(), x8.e.obtain(bitmapCreateBitmap, dVar2));
            } else {
                dVar2.put(bitmapCreateBitmap);
            }
            if (Log.isLoggable("PreFillRunner", 3)) {
                Log.d("PreFillRunner", "allocated [" + fVarRemove.f86579a + "x" + fVarRemove.f86580b + "] " + fVarRemove.f86581c + " size: " + bitmapByteSize);
            }
        }
        if (this.f86566j || dVar.isEmpty()) {
            return;
        }
        long j10 = this.f86565i;
        this.f86565i = Math.min(4 * j10, f86558l);
        this.f86564h.postDelayed(this, j10);
    }
}
