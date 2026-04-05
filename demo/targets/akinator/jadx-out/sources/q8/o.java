package q8;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class o implements d {

    /* renamed from: k, reason: collision with root package name */
    public static final Bitmap.Config f82586k = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    public final s f82587a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f82588b;

    /* renamed from: c, reason: collision with root package name */
    public final long f82589c;

    /* renamed from: d, reason: collision with root package name */
    public final n f82590d;

    /* renamed from: e, reason: collision with root package name */
    public long f82591e;

    /* renamed from: f, reason: collision with root package name */
    public long f82592f;

    /* renamed from: g, reason: collision with root package name */
    public int f82593g;

    /* renamed from: h, reason: collision with root package name */
    public int f82594h;

    /* renamed from: i, reason: collision with root package name */
    public int f82595i;

    /* renamed from: j, reason: collision with root package name */
    public int f82596j;

    public o(long j10, s sVar, Set set) {
        this.f82589c = j10;
        this.f82591e = j10;
        this.f82587a = sVar;
        this.f82588b = set;
        this.f82590d = new n();
    }

    public final void a() {
        Log.v("LruBitmapPool", "Hits=" + this.f82593g + ", misses=" + this.f82594h + ", puts=" + this.f82595i + ", evictions=" + this.f82596j + ", currentSize=" + this.f82592f + ", maxSize=" + this.f82591e + "\nStrategy=" + this.f82587a);
    }

    public final synchronized Bitmap b(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmap;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmap = this.f82587a.get(i10, i11, config != null ? config : f82586k);
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f82587a.logBitmap(i10, i11, config));
                }
                this.f82594h++;
            } else {
                this.f82593g++;
                this.f82592f -= this.f82587a.getSize(bitmap);
                this.f82590d.remove(bitmap);
                bitmap.setHasAlpha(true);
                bitmap.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f82587a.logBitmap(i10, i11, config));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmap;
    }

    public final synchronized void c(long j10) {
        while (this.f82592f > j10) {
            try {
                Bitmap bitmapRemoveLast = this.f82587a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        a();
                    }
                    this.f82592f = 0L;
                    return;
                }
                this.f82590d.remove(bitmapRemoveLast);
                this.f82592f -= this.f82587a.getSize(bitmapRemoveLast);
                this.f82596j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f82587a.logBitmap(bitmapRemoveLast));
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    a();
                }
                bitmapRemoveLast.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // q8.d
    public void clearMemory() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        c(0L);
    }

    public long evictionCount() {
        return this.f82596j;
    }

    @Override // q8.d
    public Bitmap get(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapB = b(i10, i11, config);
        if (bitmapB != null) {
            bitmapB.eraseColor(0);
            return bitmapB;
        }
        if (config == null) {
            config = f82586k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public long getCurrentSize() {
        return this.f82592f;
    }

    @Override // q8.d
    public Bitmap getDirty(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapB = b(i10, i11, config);
        if (bitmapB != null) {
            return bitmapB;
        }
        if (config == null) {
            config = f82586k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // q8.d
    public long getMaxSize() {
        return this.f82591e;
    }

    public long hitCount() {
        return this.f82593g;
    }

    public long missCount() {
        return this.f82594h;
    }

    @Override // q8.d
    public synchronized void put(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f82587a.getSize(bitmap) <= this.f82591e && this.f82588b.contains(bitmap.getConfig())) {
                int size = this.f82587a.getSize(bitmap);
                this.f82587a.put(bitmap);
                this.f82590d.add(bitmap);
                this.f82595i++;
                this.f82592f += size;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f82587a.logBitmap(bitmap));
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    a();
                }
                c(this.f82591e);
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f82587a.logBitmap(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f82588b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // q8.d
    public synchronized void setSizeMultiplier(float f10) {
        long jRound = Math.round(this.f82589c * f10);
        this.f82591e = jRound;
        c(jRound);
    }

    @Override // q8.d
    public void trimMemory(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            o2.z(i10, "trimMemory, level=", "LruBitmapPool");
        }
        if (i10 >= 40 || i10 >= 20) {
            clearMemory();
        } else if (i10 >= 20 || i10 == 15) {
            c(getMaxSize() / 2);
        }
    }

    public o(long j10) {
        s sVar = new s();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        this(j10, sVar, Collections.unmodifiableSet(hashSet));
    }

    public o(long j10, Set<Bitmap.Config> set) {
        this(j10, new s(), set);
    }
}
