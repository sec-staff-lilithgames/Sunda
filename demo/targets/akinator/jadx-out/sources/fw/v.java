package fw;

import ao.kwoC.zAQQWzBxnS;
import bp.oM.DwaEpyvxz;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p0.o2;
import pw.b1;
import pw.d1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final a f56246g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f56247h;

    /* renamed from: b, reason: collision with root package name */
    public final pw.k f56248b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f56249c;

    /* renamed from: e, reason: collision with root package name */
    public final b f56250e;

    /* renamed from: f, reason: collision with root package name */
    public final g f56251f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final Logger getLogger() {
            return v.f56247h;
        }

        public final int lengthWithoutPadding(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException(w0.i.a(i12, i10, DwaEpyvxz.zXDkQgqUH, " > remaining length "));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements b1 {

        /* renamed from: b, reason: collision with root package name */
        public final pw.k f56252b;

        /* renamed from: c, reason: collision with root package name */
        public int f56253c;

        /* renamed from: e, reason: collision with root package name */
        public int f56254e;

        /* renamed from: f, reason: collision with root package name */
        public int f56255f;

        /* renamed from: g, reason: collision with root package name */
        public int f56256g;

        /* renamed from: h, reason: collision with root package name */
        public int f56257h;

        public b(pw.k source) {
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            this.f56252b = source;
        }

        @Override // pw.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final int getFlags() {
            return this.f56254e;
        }

        public final int getLeft() {
            return this.f56256g;
        }

        public final int getLength() {
            return this.f56253c;
        }

        public final int getPadding() {
            return this.f56257h;
        }

        public final int getStreamId() {
            return this.f56255f;
        }

        public final void setFlags(int i10) {
            this.f56254e = i10;
        }

        public final void setLeft(int i10) {
            this.f56256g = i10;
        }

        public final void setLength(int i10) {
            this.f56253c = i10;
        }

        public final void setPadding(int i10) {
            this.f56257h = i10;
        }

        public final void setStreamId(int i10) {
            this.f56255f = i10;
        }

        @Override // pw.b1
        public d1 timeout() {
            return this.f56252b.timeout();
        }

        @Override // pw.b1
        public long read(pw.g sink, long j10) throws IOException {
            int i10;
            int i11;
            kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
            do {
                int i12 = this.f56256g;
                pw.k kVar = this.f56252b;
                if (i12 != 0) {
                    long j11 = kVar.read(sink, Math.min(j10, i12));
                    if (j11 == -1) {
                        return -1L;
                    }
                    this.f56256g -= (int) j11;
                    return j11;
                }
                kVar.skip(this.f56257h);
                this.f56257h = 0;
                if ((this.f56254e & 4) != 0) {
                    return -1L;
                }
                i10 = this.f56255f;
                int medium = yv.h.readMedium(kVar);
                this.f56256g = medium;
                this.f56253c = medium;
                int iAnd = yv.h.and(kVar.readByte(), 255);
                this.f56254e = yv.h.and(kVar.readByte(), 255);
                a aVar = v.f56246g;
                if (aVar.getLogger().isLoggable(Level.FINE)) {
                    aVar.getLogger().fine(j.f56166a.frameLog(true, this.f56255f, this.f56253c, iAnd, this.f56254e));
                }
                i11 = kVar.readInt() & Integer.MAX_VALUE;
                this.f56255f = i11;
                if (iAnd != 9) {
                    throw new IOException(o2.j(iAnd, zAQQWzBxnS.GhOTXDMThblvlA));
                }
            } while (i11 == i10);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }
    }

    static {
        Logger logger = Logger.getLogger(j.class.getName());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(logger, "getLogger(...)");
        f56247h = logger;
    }

    public v(pw.k source, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        this.f56248b = source;
        this.f56249c = z10;
        b bVar = new b(source);
        this.f56250e = bVar;
        this.f56251f = new g(bVar, 4096, 0, 4, null);
    }

    public final List a(int i10, int i11, int i12, int i13) throws IOException {
        b bVar = this.f56250e;
        bVar.setLeft(i10);
        bVar.setLength(bVar.getLeft());
        bVar.setPadding(i11);
        bVar.setFlags(i12);
        bVar.setStreamId(i13);
        g gVar = this.f56251f;
        gVar.readHeaders();
        return gVar.getAndResetHeaderList();
    }

    public final void b(w wVar, int i10) throws IOException {
        pw.k kVar = this.f56248b;
        int i11 = kVar.readInt();
        wVar.priority(i10, i11 & Integer.MAX_VALUE, yv.h.and(kVar.readByte(), 255) + 1, (Integer.MIN_VALUE & i11) != 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56248b.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x01cf, code lost:
    
        throw new java.io.IOException(a.b.e(r12, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean nextFrame(boolean r18, fw.w r19) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fw.v.nextFrame(boolean, fw.w):boolean");
    }

    public final void readConnectionPreface(w handler) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(handler, "handler");
        if (this.f56249c) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        pw.l lVar = j.f56167b;
        pw.l byteString = this.f56248b.readByteString(lVar.size());
        Level level = Level.FINE;
        Logger logger = f56247h;
        if (logger.isLoggable(level)) {
            logger.fine(yv.i.format("<< CONNECTION " + byteString.hex(), new Object[0]));
        }
        if (kotlin.jvm.internal.e0.areEqual(lVar, byteString)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + byteString.utf8());
    }
}
