package zn;

import io.bidmachine.media3.exoplayer.offline.DownloadRequest;
import java.io.IOException;
import zn.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i extends Thread implements m {

    /* renamed from: b, reason: collision with root package name */
    public final DownloadRequest f98361b;

    /* renamed from: c, reason: collision with root package name */
    public final n f98362c;

    /* renamed from: e, reason: collision with root package name */
    public final j f98363e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f98364f;

    /* renamed from: g, reason: collision with root package name */
    public final int f98365g;

    /* renamed from: h, reason: collision with root package name */
    public volatile g.b f98366h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f98367i;

    /* renamed from: j, reason: collision with root package name */
    public Exception f98368j;

    /* renamed from: k, reason: collision with root package name */
    public long f98369k = -1;

    public i(DownloadRequest downloadRequest, n nVar, j jVar, boolean z10, int i10, g.b bVar) {
        this.f98361b = downloadRequest;
        this.f98362c = nVar;
        this.f98363e = jVar;
        this.f98364f = z10;
        this.f98365g = i10;
        this.f98366h = bVar;
    }

    public void cancel(boolean z10) {
        if (z10) {
            this.f98366h = null;
        }
        if (this.f98367i) {
            return;
        }
        this.f98367i = true;
        this.f98362c.cancel();
        interrupt();
    }

    @Override // zn.m
    public void onProgress(long j10, long j11, float f10) {
        this.f98363e.f98370a = j11;
        this.f98363e.f98371b = f10;
        if (j10 != this.f98369k) {
            this.f98369k = j10;
            g.b bVar = this.f98366h;
            if (bVar != null) {
                bVar.obtainMessage(11, (int) (j10 >> 32), (int) j10, this).sendToTarget();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException, IOException {
        try {
            if (this.f98364f) {
                this.f98362c.remove();
            } else {
                long j10 = -1;
                int i10 = 0;
                while (!this.f98367i) {
                    try {
                        this.f98362c.download(this);
                        break;
                    } catch (IOException e10) {
                        if (!this.f98367i) {
                            long j11 = this.f98363e.f98370a;
                            if (j11 != j10) {
                                i10 = 0;
                                j10 = j11;
                            }
                            int i11 = i10 + 1;
                            if (i11 > this.f98365g) {
                                throw e10;
                            }
                            Thread.sleep(Math.min(i10 * 1000, 5000));
                            i10 = i11;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e11) {
            this.f98368j = e11;
        }
        g.b bVar = this.f98366h;
        if (bVar != null) {
            bVar.obtainMessage(10, this).sendToTarget();
        }
    }
}
