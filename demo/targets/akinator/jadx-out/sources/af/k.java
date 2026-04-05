package af;

import af.h;
import com.google.android.exoplayer2.offline.DownloadRequest;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k extends Thread implements p {

    /* renamed from: b, reason: collision with root package name */
    public final DownloadRequest f4365b;

    /* renamed from: c, reason: collision with root package name */
    public final q f4366c;

    /* renamed from: e, reason: collision with root package name */
    public final l f4367e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4368f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4369g;

    /* renamed from: h, reason: collision with root package name */
    public volatile h.b f4370h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f4371i;

    /* renamed from: j, reason: collision with root package name */
    public Exception f4372j;

    /* renamed from: k, reason: collision with root package name */
    public long f4373k = -1;

    public k(DownloadRequest downloadRequest, q qVar, l lVar, boolean z10, int i10, h.b bVar) {
        this.f4365b = downloadRequest;
        this.f4366c = qVar;
        this.f4367e = lVar;
        this.f4368f = z10;
        this.f4369g = i10;
        this.f4370h = bVar;
    }

    public void cancel(boolean z10) {
        if (z10) {
            this.f4370h = null;
        }
        if (this.f4371i) {
            return;
        }
        this.f4371i = true;
        this.f4366c.cancel();
        interrupt();
    }

    @Override // af.p
    public void onProgress(long j10, long j11, float f10) {
        this.f4367e.f4374a = j11;
        this.f4367e.f4375b = f10;
        if (j10 != this.f4373k) {
            this.f4373k = j10;
            h.b bVar = this.f4370h;
            if (bVar != null) {
                bVar.obtainMessage(10, (int) (j10 >> 32), (int) j10, this).sendToTarget();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException, IOException {
        try {
            if (this.f4368f) {
                this.f4366c.remove();
            } else {
                long j10 = -1;
                int i10 = 0;
                while (!this.f4371i) {
                    try {
                        this.f4366c.download(this);
                        break;
                    } catch (IOException e10) {
                        if (!this.f4371i) {
                            long j11 = this.f4367e.f4374a;
                            if (j11 != j10) {
                                i10 = 0;
                                j10 = j11;
                            }
                            int i11 = i10 + 1;
                            if (i11 > this.f4369g) {
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
            this.f4372j = e11;
        }
        h.b bVar = this.f4370h;
        if (bVar != null) {
            bVar.obtainMessage(9, this).sendToTarget();
        }
    }
}
