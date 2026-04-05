package af;

import android.content.Context;
import android.content.Intent;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4379a;

    /* renamed from: b, reason: collision with root package name */
    public final h f4380b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f4381c;

    /* renamed from: d, reason: collision with root package name */
    public DownloadService f4382d;

    public o(Context context, h hVar, Class cls) {
        this.f4379a = context;
        this.f4380b = hVar;
        this.f4381c = cls;
        hVar.addListener(this);
        updateScheduler();
    }

    public void attachService(DownloadService downloadService) {
        com.google.android.exoplayer2.util.a.checkState(this.f4382d == null);
        this.f4382d = downloadService;
        if (this.f4380b.isInitialized()) {
            n1.createHandlerForCurrentOrMainLooper().postAtFrontOfQueue(new n(0, this, downloadService));
        }
    }

    public void detachService(DownloadService downloadService) {
        com.google.android.exoplayer2.util.a.checkState(this.f4382d == downloadService);
        this.f4382d = null;
    }

    @Override // af.j
    public void onDownloadChanged(h hVar, c cVar, Exception exc) {
        DownloadService downloadService = this.f4382d;
        if (downloadService != null) {
            HashMap map = DownloadService.f27880g;
        }
        if (downloadService == null || downloadService.f27884f) {
            int i10 = cVar.f4319b;
            HashMap map2 = DownloadService.f27880g;
            if (i10 == 2 || i10 == 5 || i10 == 7) {
                f0.w("DownloadService", "DownloadService wasn't running. Restarting.");
                Context context = this.f4379a;
                try {
                    context.startService(new Intent(context, (Class<?>) this.f4381c).setAction(com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService.ACTION_INIT));
                } catch (IllegalStateException unused) {
                    f0.w("DownloadService", "Failed to restart (process is idle)");
                }
            }
        }
    }

    @Override // af.j
    public void onDownloadRemoved(h hVar, c cVar) {
        DownloadService downloadService = this.f4382d;
        if (downloadService != null) {
            HashMap map = DownloadService.f27880g;
            downloadService.getClass();
        }
    }

    @Override // af.j
    public /* bridge */ /* synthetic */ void onDownloadsPausedChanged(h hVar, boolean z10) {
        super.onDownloadsPausedChanged(hVar, z10);
    }

    @Override // af.j
    public final void onIdle(h hVar) {
        DownloadService downloadService = this.f4382d;
        if (downloadService != null) {
            HashMap map = DownloadService.f27880g;
            downloadService.c();
        }
    }

    @Override // af.j
    public void onInitialized(h hVar) {
        DownloadService downloadService = this.f4382d;
        if (downloadService != null) {
            hVar.getCurrentDownloads();
            HashMap map = DownloadService.f27880g;
            downloadService.getClass();
        }
    }

    @Override // af.j
    public void onRequirementsStateChanged(h hVar, Requirements requirements, int i10) {
        updateScheduler();
    }

    @Override // af.j
    public void onWaitingForRequirementsChanged(h hVar, boolean z10) {
        if (z10 || hVar.getDownloadsPaused()) {
            return;
        }
        DownloadService downloadService = this.f4382d;
        if (downloadService == null || downloadService.f27884f) {
            List<c> currentDownloads = hVar.getCurrentDownloads();
            for (int i10 = 0; i10 < currentDownloads.size(); i10++) {
                if (currentDownloads.get(i10).f4319b == 0) {
                    Context context = this.f4379a;
                    try {
                        Class cls = this.f4381c;
                        HashMap map = DownloadService.f27880g;
                        context.startService(new Intent(context, (Class<?>) cls).setAction(com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService.ACTION_INIT));
                        return;
                    } catch (IllegalStateException unused) {
                        f0.w("DownloadService", "Failed to restart (process is idle)");
                        return;
                    }
                }
            }
        }
    }

    public boolean updateScheduler() {
        return !this.f4380b.isWaitingForRequirements();
    }
}
