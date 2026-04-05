package af;

import com.google.android.exoplayer2.offline.DownloadRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final DownloadRequest f4318a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4319b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4320c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4321d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4322e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4323f;

    /* renamed from: g, reason: collision with root package name */
    public final l f4324g;

    public c(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12) {
        this(downloadRequest, i10, j10, j11, j12, i11, i12, new l());
    }

    public long getBytesDownloaded() {
        return this.f4324g.f4374a;
    }

    public float getPercentDownloaded() {
        return this.f4324g.f4375b;
    }

    public boolean isTerminalState() {
        int i10 = this.f4319b;
        return i10 == 3 || i10 == 4;
    }

    public c(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12, l lVar) {
        com.google.android.exoplayer2.util.a.checkNotNull(lVar);
        boolean z10 = false;
        com.google.android.exoplayer2.util.a.checkArgument((i12 == 0) == (i10 != 4));
        if (i11 != 0) {
            if (i10 != 2 && i10 != 0) {
                z10 = true;
            }
            com.google.android.exoplayer2.util.a.checkArgument(z10);
        }
        this.f4318a = downloadRequest;
        this.f4319b = i10;
        this.f4320c = j10;
        this.f4321d = j12;
        this.f4322e = i11;
        this.f4323f = i12;
        this.f4324g = lVar;
    }
}
