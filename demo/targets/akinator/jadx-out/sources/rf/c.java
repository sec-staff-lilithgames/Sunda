package rf;

import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import java.io.IOException;
import java.io.OutputStream;
import qf.m;
import qf.n;
import qf.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements n {

    /* renamed from: a, reason: collision with root package name */
    public final long f84313a;

    /* renamed from: b, reason: collision with root package name */
    public t f84314b;

    /* renamed from: c, reason: collision with root package name */
    public long f84315c;

    /* renamed from: d, reason: collision with root package name */
    public long f84316d;

    /* renamed from: e, reason: collision with root package name */
    public long f84317e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends rf.a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public c(rf.b bVar, long j10) {
        this(bVar, j10, CacheDataSink.DEFAULT_BUFFER_SIZE);
    }

    @Override // qf.n
    public void open(t tVar) throws a {
        com.google.android.exoplayer2.util.a.checkNotNull(tVar.f82999h);
        long j10 = tVar.f82998g;
        if (j10 == -1 && tVar.isFlagSet(2)) {
            this.f84314b = null;
            return;
        }
        this.f84314b = tVar;
        long j11 = tVar.isFlagSet(4) ? this.f84313a : Long.MAX_VALUE;
        this.f84315c = j11;
        this.f84317e = 0L;
        if (j10 != -1) {
            try {
                Math.min(j10, j11);
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
        throw null;
    }

    @Override // qf.n
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        t tVar = this.f84314b;
        if (tVar == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                long j10 = this.f84316d;
                long j11 = this.f84315c;
                if (j10 == j11) {
                    long j12 = tVar.f82998g;
                    if (j12 != -1) {
                        Math.min(j12 - this.f84317e, j11);
                    }
                    throw null;
                }
                int iMin = (int) Math.min(i11 - i12, j11 - j10);
                ((OutputStream) n1.castNonNull(null)).write(bArr, i10 + i12, iMin);
                i12 += iMin;
                long j13 = iMin;
                this.f84316d += j13;
                this.f84317e += j13;
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
    }

    public c(rf.b bVar, long j10, int i10) {
        com.google.android.exoplayer2.util.a.checkState(j10 > 0 || j10 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j10 != -1 && j10 < CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) {
            f0.w("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        if (com.google.android.exoplayer2.util.a.checkNotNull(bVar) != null) {
            throw new ClassCastException();
        }
        this.f84313a = j10 == -1 ? Long.MAX_VALUE : j10;
    }

    @Override // qf.n
    public void close() throws a {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        public long f84318a = 5242880;

        /* renamed from: b, reason: collision with root package name */
        public int f84319b = CacheDataSink.DEFAULT_BUFFER_SIZE;

        @Override // qf.m
        public n createDataSink() {
            if (com.google.android.exoplayer2.util.a.checkNotNull(null) == null) {
                return new c(null, this.f84318a, this.f84319b);
            }
            throw new ClassCastException();
        }

        public b setBufferSize(int i10) {
            this.f84319b = i10;
            return this;
        }

        public b setFragmentSize(long j10) {
            this.f84318a = j10;
            return this;
        }

        public b setCache(rf.b bVar) {
            return this;
        }
    }
}
