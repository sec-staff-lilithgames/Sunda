package xr;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class u extends v implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public final Closeable f93069f;

    public u(x xVar, Runnable runnable, Closeable closeable) {
        super(xVar, runnable);
        this.f93069f = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f93069f.close();
    }
}
