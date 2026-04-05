package pw;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f81909b;

    public h(g gVar) {
        this.f81909b = gVar;
    }

    @Override // java.io.InputStream
    public int available() {
        return (int) Math.min(this.f81909b.size(), Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream
    public int read() {
        g gVar = this.f81909b;
        if (gVar.size() > 0) {
            return gVar.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        return -1;
    }

    public String toString() {
        return this.f81909b + ".inputStream()";
    }

    @Override // java.io.InputStream
    public int read(byte[] sink, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        return this.f81909b.read(sink, i10, i11);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
