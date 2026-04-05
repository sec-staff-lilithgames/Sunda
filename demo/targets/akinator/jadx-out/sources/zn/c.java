package zn;

import io.bidmachine.media3.exoplayer.offline.DownloadRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final DownloadRequest f98319a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98320b;

    /* renamed from: c, reason: collision with root package name */
    public final long f98321c;

    /* renamed from: d, reason: collision with root package name */
    public final long f98322d;

    /* renamed from: e, reason: collision with root package name */
    public final int f98323e;

    /* renamed from: f, reason: collision with root package name */
    public final int f98324f;

    /* renamed from: g, reason: collision with root package name */
    public final j f98325g;

    public c(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12) {
        this(downloadRequest, i10, j10, j11, j12, i11, i12, new j());
    }

    public long getBytesDownloaded() {
        return this.f98325g.f98370a;
    }

    public float getPercentDownloaded() {
        return this.f98325g.f98371b;
    }

    public boolean isTerminalState() {
        int i10 = this.f98320b;
        return i10 == 3 || i10 == 4;
    }

    public c(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12, j jVar) {
        io.bidmachine.media3.common.util.a.checkNotNull(jVar);
        boolean z10 = false;
        io.bidmachine.media3.common.util.a.checkArgument((i12 == 0) == (i10 != 4));
        if (i11 != 0) {
            if (i10 != 2 && i10 != 0) {
                z10 = true;
            }
            io.bidmachine.media3.common.util.a.checkArgument(z10);
        }
        this.f98319a = downloadRequest;
        this.f98320b = i10;
        this.f98321c = j10;
        this.f98322d = j12;
        this.f98323e = i11;
        this.f98324f = i12;
        this.f98325g = jVar;
    }
}
