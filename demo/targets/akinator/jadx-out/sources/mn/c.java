package mn;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import java.io.IOException;
import java.io.OutputStream;
import ln.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements ln.g {

    /* renamed from: a, reason: collision with root package name */
    public final long f74820a;

    /* renamed from: b, reason: collision with root package name */
    public m f74821b;

    /* renamed from: c, reason: collision with root package name */
    public long f74822c;

    /* renamed from: d, reason: collision with root package name */
    public long f74823d;

    /* renamed from: e, reason: collision with root package name */
    public long f74824e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends mn.a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public c(mn.b bVar, long j10) {
        this(bVar, j10, CacheDataSink.DEFAULT_BUFFER_SIZE);
    }

    @Override // ln.g
    public void open(m mVar) throws a {
        io.bidmachine.media3.common.util.a.checkNotNull(mVar.f73474h);
        long j10 = mVar.f73473g;
        if (j10 == -1 && mVar.isFlagSet(2)) {
            this.f74821b = null;
            return;
        }
        this.f74821b = mVar;
        long j11 = mVar.isFlagSet(4) ? this.f74820a : Long.MAX_VALUE;
        this.f74822c = j11;
        this.f74824e = 0L;
        if (j10 != -1) {
            try {
                Math.min(j10, j11);
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
        throw null;
    }

    @Override // ln.g
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        m mVar = this.f74821b;
        if (mVar == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                long j10 = this.f74823d;
                long j11 = this.f74822c;
                if (j10 == j11) {
                    long j12 = mVar.f73473g;
                    if (j12 != -1) {
                        Math.min(j12 - this.f74824e, j11);
                    }
                    throw null;
                }
                int iMin = (int) Math.min(i11 - i12, j11 - j10);
                ((OutputStream) a1.castNonNull(null)).write(bArr, i10 + i12, iMin);
                i12 += iMin;
                long j13 = iMin;
                this.f74823d += j13;
                this.f74824e += j13;
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
    }

    public c(mn.b bVar, long j10, int i10) {
        io.bidmachine.media3.common.util.a.checkState(j10 > 0 || j10 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j10 != -1 && j10 < CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) {
            b0.w("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        if (io.bidmachine.media3.common.util.a.checkNotNull(bVar) != null) {
            throw new ClassCastException();
        }
        this.f74820a = j10 == -1 ? Long.MAX_VALUE : j10;
    }

    @Override // ln.g
    public void close() throws a {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements ln.f {

        /* renamed from: a, reason: collision with root package name */
        public long f74825a = 5242880;

        /* renamed from: b, reason: collision with root package name */
        public int f74826b = CacheDataSink.DEFAULT_BUFFER_SIZE;

        @Override // ln.f
        public ln.g createDataSink() {
            if (io.bidmachine.media3.common.util.a.checkNotNull(null) == null) {
                return new c(null, this.f74825a, this.f74826b);
            }
            throw new ClassCastException();
        }

        public b setBufferSize(int i10) {
            this.f74826b = i10;
            return this;
        }

        public b setFragmentSize(long j10) {
            this.f74825a = j10;
            return this;
        }

        public b setCache(mn.b bVar) {
            return this;
        }
    }
}
