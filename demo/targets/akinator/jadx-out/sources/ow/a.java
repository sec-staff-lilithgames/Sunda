package ow;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.e0;
import pw.g;
import pw.o;
import pw.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f79868b;

    /* renamed from: c, reason: collision with root package name */
    public final pw.g f79869c;

    /* renamed from: e, reason: collision with root package name */
    public final Deflater f79870e;

    /* renamed from: f, reason: collision with root package name */
    public final o f79871f;

    public a(boolean z10) {
        this.f79868b = z10;
        pw.g gVar = new pw.g();
        this.f79869c = gVar;
        Deflater deflater = new Deflater(-1, true);
        this.f79870e = deflater;
        this.f79871f = new o((z0) gVar, deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f79871f.close();
    }

    public final void deflate(pw.g buffer) throws IOException {
        e0.checkNotNullParameter(buffer, "buffer");
        pw.g gVar = this.f79869c;
        if (gVar.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f79868b) {
            this.f79870e.reset();
        }
        long size = buffer.size();
        o oVar = this.f79871f;
        oVar.write(buffer, size);
        oVar.flush();
        if (gVar.rangeEquals(gVar.size() - r1.size(), b.f79872a)) {
            long size2 = gVar.size() - 4;
            g.a andWriteUnsafe$default = pw.g.readAndWriteUnsafe$default(gVar, null, 1, null);
            try {
                andWriteUnsafe$default.resizeBuffer(size2);
                gv.d.closeFinally(andWriteUnsafe$default, null);
            } finally {
            }
        } else {
            gVar.writeByte(0);
        }
        buffer.write(gVar, gVar.size());
    }
}
