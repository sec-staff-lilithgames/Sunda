package go;

import android.net.Uri;
import io.bidmachine.media3.common.util.a1;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import ln.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c0 implements x {

    /* renamed from: a, reason: collision with root package name */
    public final long f58295a;

    /* renamed from: b, reason: collision with root package name */
    public final ln.m f58296b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58297c;

    /* renamed from: d, reason: collision with root package name */
    public final ln.e0 f58298d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f58299e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f58300f;

    public c0(ln.i iVar, Uri uri, int i10, b0 b0Var) {
        this(iVar, new m.a().setUri(uri).setFlags(1).build(), i10, b0Var);
    }

    public static <T> T load(ln.i iVar, b0 b0Var, Uri uri, int i10) throws IOException {
        c0 c0Var = new c0(iVar, uri, i10, b0Var);
        c0Var.load();
        return (T) io.bidmachine.media3.common.util.a.checkNotNull(c0Var.getResult());
    }

    public long bytesLoaded() {
        return this.f58298d.getBytesRead();
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.f58298d.getLastResponseHeaders();
    }

    public final Object getResult() {
        return this.f58300f;
    }

    public Uri getUri() {
        return this.f58298d.getLastOpenedUri();
    }

    public c0(ln.i iVar, ln.m mVar, int i10, b0 b0Var) {
        this.f58298d = new ln.e0(iVar);
        this.f58296b = mVar;
        this.f58297c = i10;
        this.f58299e = b0Var;
        this.f58295a = ao.b0.getNewId();
    }

    public static <T> T load(ln.i iVar, b0 b0Var, ln.m mVar, int i10) throws IOException {
        c0 c0Var = new c0(iVar, mVar, i10, b0Var);
        c0Var.load();
        return (T) io.bidmachine.media3.common.util.a.checkNotNull(c0Var.getResult());
    }

    @Override // go.x
    public final void load() throws IOException {
        this.f58298d.resetBytesRead();
        ln.k kVar = new ln.k(this.f58298d, this.f58296b);
        try {
            kVar.open();
            this.f58300f = this.f58299e.parse((Uri) io.bidmachine.media3.common.util.a.checkNotNull(this.f58298d.getUri()), kVar);
        } finally {
            a1.closeQuietly(kVar);
        }
    }

    @Override // go.x
    public final void cancelLoad() {
    }
}
