package d7;

import android.os.StatFs;
import java.io.File;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import pw.n0;
import pw.r;
import qv.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public n0 f51870a;

    /* renamed from: f, reason: collision with root package name */
    public long f51875f;

    /* renamed from: b, reason: collision with root package name */
    public r f51871b = r.f81966c;

    /* renamed from: c, reason: collision with root package name */
    public double f51872c = 0.02d;

    /* renamed from: d, reason: collision with root package name */
    public long f51873d = 10485760;

    /* renamed from: e, reason: collision with root package name */
    public long f51874e = 262144000;

    /* renamed from: g, reason: collision with root package name */
    public CoroutineDispatcher f51876g = Dispatchers.getIO();

    public final d build() {
        long jCoerceIn;
        n0 n0Var = this.f51870a;
        if (n0Var == null) {
            throw new IllegalStateException("directory == null");
        }
        if (this.f51872c > 0.0d) {
            try {
                StatFs statFs = new StatFs(n0Var.toFile().getAbsolutePath());
                jCoerceIn = v.coerceIn((long) (this.f51872c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f51873d, this.f51874e);
            } catch (Exception unused) {
                jCoerceIn = this.f51873d;
            }
        } else {
            jCoerceIn = this.f51875f;
        }
        return new j(jCoerceIn, n0Var, this.f51871b, this.f51876g);
    }

    public final a cleanupDispatcher(CoroutineDispatcher coroutineDispatcher) {
        this.f51876g = coroutineDispatcher;
        return this;
    }

    public final a directory(File file) {
        return directory(n0.a.get$default(n0.f81931c, file, false, 1, (Object) null));
    }

    public final a fileSystem(r rVar) {
        this.f51871b = rVar;
        return this;
    }

    public final a maxSizeBytes(long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("size must be > 0.");
        }
        this.f51872c = 0.0d;
        this.f51875f = j10;
        return this;
    }

    public final a maxSizePercent(double d10) {
        if (0.0d > d10 || d10 > 1.0d) {
            throw new IllegalArgumentException("size must be in the range [0.0, 1.0].");
        }
        this.f51875f = 0L;
        this.f51872c = d10;
        return this;
    }

    public final a maximumMaxSizeBytes(long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("size must be > 0.");
        }
        this.f51874e = j10;
        return this;
    }

    public final a minimumMaxSizeBytes(long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("size must be > 0.");
        }
        this.f51873d = j10;
        return this;
    }

    public final a directory(n0 n0Var) {
        this.f51870a = n0Var;
        return this;
    }
}
