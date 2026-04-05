package as;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import pw.b1;
import pw.d1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f7970a = Logger.getLogger(k.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final pw.l f7971b = pw.l.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    public static int a(pw.k kVar) {
        return (kVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((kVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((kVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public static int b(int i10, byte b10, short s10) {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
        throw null;
    }

    public static void c(String str, Object... objArr) {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    @Override // as.q
    public zr.p getProtocol() {
        return zr.p.HTTP_2;
    }

    @Override // as.q
    public c newReader(pw.k kVar, boolean z10) {
        return new l(kVar, z10);
    }

    @Override // as.q
    public d newWriter(pw.j jVar, boolean z10) {
        return new m(jVar, z10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements b1 {

        /* renamed from: b, reason: collision with root package name */
        public final pw.k f7972b;

        /* renamed from: c, reason: collision with root package name */
        public int f7973c;

        /* renamed from: e, reason: collision with root package name */
        public byte f7974e;

        /* renamed from: f, reason: collision with root package name */
        public int f7975f;

        /* renamed from: g, reason: collision with root package name */
        public int f7976g;

        /* renamed from: h, reason: collision with root package name */
        public short f7977h;

        public a(pw.k kVar) {
            this.f7972b = kVar;
        }

        @Override // pw.b1
        public long read(pw.g gVar, long j10) throws IOException {
            int i10;
            int i11;
            do {
                int i12 = this.f7976g;
                pw.k kVar = this.f7972b;
                if (i12 == 0) {
                    kVar.skip(this.f7977h);
                    this.f7977h = (short) 0;
                    if ((this.f7974e & 4) == 0) {
                        i10 = this.f7975f;
                        int iA = j.a(kVar);
                        this.f7976g = iA;
                        this.f7973c = iA;
                        byte b10 = (byte) (kVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                        this.f7974e = (byte) (kVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                        Logger logger = j.f7970a;
                        if (logger.isLoggable(Level.FINE)) {
                            logger.fine(k.a(true, this.f7975f, this.f7973c, b10, this.f7974e));
                        }
                        i11 = kVar.readInt() & Integer.MAX_VALUE;
                        this.f7975f = i11;
                        if (b10 != 9) {
                            j.c("%s != TYPE_CONTINUATION", Byte.valueOf(b10));
                            throw null;
                        }
                    }
                } else {
                    long j11 = kVar.read(gVar, Math.min(j10, i12));
                    if (j11 != -1) {
                        this.f7976g -= (int) j11;
                        return j11;
                    }
                }
                return -1L;
            } while (i11 == i10);
            j.c("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // pw.b1
        public d1 timeout() {
            return this.f7972b.timeout();
        }

        @Override // pw.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}
