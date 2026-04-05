package co;

import android.net.Uri;
import ao.b0;
import go.x;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import ln.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class e implements x {

    /* renamed from: a, reason: collision with root package name */
    public final long f12417a = b0.getNewId();

    /* renamed from: b, reason: collision with root package name */
    public final ln.m f12418b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12419c;

    /* renamed from: d, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f12420d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12421e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f12422f;

    /* renamed from: g, reason: collision with root package name */
    public final long f12423g;

    /* renamed from: h, reason: collision with root package name */
    public final long f12424h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f12425i;

    public e(ln.i iVar, ln.m mVar, int i10, io.bidmachine.media3.common.b bVar, int i11, Object obj, long j10, long j11) {
        this.f12425i = new e0(iVar);
        this.f12418b = (ln.m) io.bidmachine.media3.common.util.a.checkNotNull(mVar);
        this.f12419c = i10;
        this.f12420d = bVar;
        this.f12421e = i11;
        this.f12422f = obj;
        this.f12423g = j10;
        this.f12424h = j11;
    }

    public final long bytesLoaded() {
        return this.f12425i.getBytesRead();
    }

    @Override // go.x
    public abstract /* synthetic */ void cancelLoad();

    public final long getDurationUs() {
        return this.f12424h - this.f12423g;
    }

    public final Map<String, List<String>> getResponseHeaders() {
        return this.f12425i.getLastResponseHeaders();
    }

    public final Uri getUri() {
        return this.f12425i.getLastOpenedUri();
    }

    @Override // go.x
    public abstract /* synthetic */ void load() throws IOException;
}
