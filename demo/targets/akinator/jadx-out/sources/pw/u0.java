package pw;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u0 extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f81984b;

    public u0(v0 v0Var) {
        this.f81984b = v0Var;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        v0 v0Var = this.f81984b;
        if (v0Var.f81988e) {
            throw new IOException("closed");
        }
        return (int) Math.min(v0Var.f81987c.size(), Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f81984b.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        v0 v0Var = this.f81984b;
        g gVar = v0Var.f81987c;
        if (v0Var.f81988e) {
            throw new IOException("closed");
        }
        if (gVar.size() == 0 && v0Var.f81986b.read(gVar, 8192L) == -1) {
            return -1;
        }
        return gVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public String toString() {
        return this.f81984b + ".inputStream()";
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream out) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(out, "out");
        v0 v0Var = this.f81984b;
        g gVar = v0Var.f81987c;
        if (v0Var.f81988e) {
            throw new IOException("closed");
        }
        long size = 0;
        while (true) {
            if (gVar.size() == 0 && v0Var.f81986b.read(gVar, 8192L) == -1) {
                return size;
            }
            size += gVar.size();
            g.writeTo$default(v0Var.f81987c, out, 0L, 2, null);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] data, int i10, int i11) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        v0 v0Var = this.f81984b;
        g gVar = v0Var.f81987c;
        if (!v0Var.f81988e) {
            b.checkOffsetAndCount(data.length, i10, i11);
            if (gVar.size() == 0 && v0Var.f81986b.read(gVar, 8192L) == -1) {
                return -1;
            }
            return gVar.read(data, i10, i11);
        }
        throw new IOException("closed");
    }
}
