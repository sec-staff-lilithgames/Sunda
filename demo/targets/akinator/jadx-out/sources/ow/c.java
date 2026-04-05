package ow;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.e0;
import pw.a0;
import pw.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f79873b;

    /* renamed from: c, reason: collision with root package name */
    public final pw.g f79874c;

    /* renamed from: e, reason: collision with root package name */
    public final Inflater f79875e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f79876f;

    public c(boolean z10) {
        this.f79873b = z10;
        pw.g gVar = new pw.g();
        this.f79874c = gVar;
        Inflater inflater = new Inflater(true);
        this.f79875e = inflater;
        this.f79876f = new a0((b1) gVar, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f79876f.close();
    }

    public final void inflate(pw.g buffer) throws DataFormatException, IOException {
        e0.checkNotNullParameter(buffer, "buffer");
        pw.g gVar = this.f79874c;
        if (gVar.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        boolean z10 = this.f79873b;
        Inflater inflater = this.f79875e;
        if (z10) {
            inflater.reset();
        }
        gVar.writeAll(buffer);
        gVar.writeInt(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        long size = gVar.size() + inflater.getBytesRead();
        do {
            this.f79876f.readOrInflate(buffer, Long.MAX_VALUE);
            if (inflater.getBytesRead() >= size) {
                return;
            }
        } while (!inflater.finished());
    }
}
