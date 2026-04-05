package zn;

import android.content.Context;
import android.content.Intent;
import com.moloco.sdk.BKC.JzVV;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.exoplayer.offline.DownloadService;
import io.bidmachine.media3.exoplayer.scheduler.Requirements;
import java.util.HashMap;
import java.util.List;
import zk.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f98372a;

    /* renamed from: b, reason: collision with root package name */
    public final g f98373b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f98374c;

    /* renamed from: d, reason: collision with root package name */
    public DownloadService f98375d;

    public l(Context context, g gVar, Class cls) {
        this.f98372a = context;
        this.f98373b = gVar;
        this.f98374c = cls;
        gVar.addListener(this);
        updateScheduler();
    }

    public void attachService(DownloadService downloadService) {
        io.bidmachine.media3.common.util.a.checkState(this.f98375d == null);
        this.f98375d = downloadService;
        if (this.f98373b.isInitialized()) {
            a1.createHandlerForCurrentOrMainLooper().postAtFrontOfQueue(new g1(3, this, downloadService));
        }
    }

    public void detachService(DownloadService downloadService) {
        io.bidmachine.media3.common.util.a.checkState(this.f98375d == downloadService);
        this.f98375d = null;
    }

    @Override // zn.h
    public void onDownloadChanged(g gVar, c cVar, Exception exc) {
        DownloadService downloadService = this.f98375d;
        if (downloadService != null) {
            HashMap map = DownloadService.f61512g;
        }
        if (downloadService == null || downloadService.f61516f) {
            int i10 = cVar.f98320b;
            HashMap map2 = DownloadService.f61512g;
            if (i10 == 2 || i10 == 5 || i10 == 7) {
                b0.w("DownloadService", "DownloadService wasn't running. Restarting.");
                Context context = this.f98372a;
                try {
                    context.startService(new Intent(context, (Class<?>) this.f98374c).setAction("io.bidmachine.media3.exoplayer.downloadService.action.INIT"));
                } catch (IllegalStateException unused) {
                    b0.w("DownloadService", "Failed to restart (process is idle)");
                }
            }
        }
    }

    @Override // zn.h
    public void onDownloadRemoved(g gVar, c cVar) {
        DownloadService downloadService = this.f98375d;
        if (downloadService != null) {
            HashMap map = DownloadService.f61512g;
            downloadService.getClass();
        }
    }

    @Override // zn.h
    public /* bridge */ /* synthetic */ void onDownloadsPausedChanged(g gVar, boolean z10) {
        super.onDownloadsPausedChanged(gVar, z10);
    }

    @Override // zn.h
    public final void onIdle(g gVar) {
        DownloadService downloadService = this.f98375d;
        if (downloadService != null) {
            HashMap map = DownloadService.f61512g;
            downloadService.c();
        }
    }

    @Override // zn.h
    public void onInitialized(g gVar) {
        DownloadService downloadService = this.f98375d;
        if (downloadService != null) {
            gVar.getCurrentDownloads();
            HashMap map = DownloadService.f61512g;
            downloadService.getClass();
        }
    }

    @Override // zn.h
    public void onRequirementsStateChanged(g gVar, Requirements requirements, int i10) {
        updateScheduler();
    }

    public boolean updateScheduler() {
        return !this.f98373b.isWaitingForRequirements();
    }

    @Override // zn.h
    public void onWaitingForRequirementsChanged(g gVar, boolean z10) {
        if (z10 || gVar.getDownloadsPaused()) {
            return;
        }
        DownloadService downloadService = this.f98375d;
        if (downloadService == null || downloadService.f61516f) {
            List<c> currentDownloads = gVar.getCurrentDownloads();
            for (int i10 = 0; i10 < currentDownloads.size(); i10++) {
                if (currentDownloads.get(i10).f98320b == 0) {
                    Context context = this.f98372a;
                    try {
                        Class cls = this.f98374c;
                        String str = JzVV.nSfq;
                        HashMap map = DownloadService.f61512g;
                        context.startService(new Intent(context, (Class<?>) cls).setAction(str));
                        return;
                    } catch (IllegalStateException unused) {
                        b0.w("DownloadService", "Failed to restart (process is idle)");
                        return;
                    }
                }
            }
        }
    }
}
