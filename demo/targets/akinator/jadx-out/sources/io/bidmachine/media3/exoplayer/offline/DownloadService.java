package io.bidmachine.media3.exoplayer.offline;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.applovin.sdk.AppLovinEventParameters;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.exoplayer.scheduler.Requirements;
import java.util.HashMap;
import zn.g;
import zn.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class DownloadService extends Service {

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f61512g = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public l f61513b;

    /* renamed from: c, reason: collision with root package name */
    public int f61514c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f61515e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f61516f;

    public static Intent b(Context context, Class cls, String str, boolean z10) {
        return new Intent(context, (Class<?>) cls).setAction(str).putExtra(com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService.KEY_FOREGROUND, z10);
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z10) {
        return buildAddDownloadIntent(context, cls, downloadRequest, 0, z10);
    }

    public static Intent buildPauseDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z10) {
        return b(context, cls, "io.bidmachine.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS", z10);
    }

    public static Intent buildRemoveAllDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z10) {
        return b(context, cls, "io.bidmachine.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS", z10);
    }

    public static Intent buildRemoveDownloadIntent(Context context, Class<? extends DownloadService> cls, String str, boolean z10) {
        return b(context, cls, "io.bidmachine.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD", z10).putExtra(AppLovinEventParameters.CONTENT_IDENTIFIER, str);
    }

    public static Intent buildResumeDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z10) {
        return b(context, cls, "io.bidmachine.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS", z10);
    }

    public static Intent buildSetRequirementsIntent(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z10) {
        return b(context, cls, "io.bidmachine.media3.exoplayer.downloadService.action.SET_REQUIREMENTS", z10).putExtra("requirements", requirements);
    }

    public static Intent buildSetStopReasonIntent(Context context, Class<? extends DownloadService> cls, String str, int i10, boolean z10) {
        return b(context, cls, "io.bidmachine.media3.exoplayer.downloadService.action.SET_STOP_REASON", z10).putExtra(AppLovinEventParameters.CONTENT_IDENTIFIER, str).putExtra("stop_reason", i10);
    }

    public static void clearDownloadManagerHelpers() {
        f61512g.clear();
    }

    public static void d(Context context, Intent intent, boolean z10) {
        if (z10) {
            a1.startForegroundService(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z10) {
        d(context, buildAddDownloadIntent(context, cls, downloadRequest, z10), z10);
    }

    public static void sendPauseDownloads(Context context, Class<? extends DownloadService> cls, boolean z10) {
        d(context, buildPauseDownloadsIntent(context, cls, z10), z10);
    }

    public static void sendRemoveAllDownloads(Context context, Class<? extends DownloadService> cls, boolean z10) {
        d(context, buildRemoveAllDownloadsIntent(context, cls, z10), z10);
    }

    public static void sendRemoveDownload(Context context, Class<? extends DownloadService> cls, String str, boolean z10) {
        d(context, buildRemoveDownloadIntent(context, cls, str, z10), z10);
    }

    public static void sendResumeDownloads(Context context, Class<? extends DownloadService> cls, boolean z10) {
        d(context, buildResumeDownloadsIntent(context, cls, z10), z10);
    }

    public static void sendSetRequirements(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z10) {
        d(context, buildSetRequirementsIntent(context, cls, requirements, z10), z10);
    }

    public static void sendSetStopReason(Context context, Class<? extends DownloadService> cls, String str, int i10, boolean z10) {
        d(context, buildSetStopReasonIntent(context, cls, str, i10, z10), z10);
    }

    public static void start(Context context, Class<? extends DownloadService> cls) {
        context.startService(new Intent(context, cls).setAction("io.bidmachine.media3.exoplayer.downloadService.action.INIT"));
    }

    public static void startForeground(Context context, Class<? extends DownloadService> cls) {
        a1.startForegroundService(context, b(context, cls, "io.bidmachine.media3.exoplayer.downloadService.action.INIT", true));
    }

    public abstract g a();

    public final void c() {
        if (((l) io.bidmachine.media3.common.util.a.checkNotNull(this.f61513b)).updateScheduler()) {
            if (a1.f60679a >= 28 || !this.f61515e) {
                this.f61516f |= stopSelfResult(this.f61514c);
            } else {
                stopSelf();
                this.f61516f = true;
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        Class<?> cls = getClass();
        HashMap map = f61512g;
        l lVar = (l) map.get(cls);
        if (lVar == null) {
            int i10 = a1.f60679a;
            g gVarA = a();
            gVarA.resumeDownloads();
            l lVar2 = new l(getApplicationContext(), gVarA, cls);
            map.put(cls, lVar2);
            lVar = lVar2;
        }
        this.f61513b = lVar;
        lVar.attachService(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        ((l) io.bidmachine.media3.common.util.a.checkNotNull(this.f61513b)).detachService(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        String action;
        String stringExtra;
        g gVar;
        this.f61514c = i11;
        this.f61515e = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra(AppLovinEventParameters.CONTENT_IDENTIFIER);
            if (!intent.getBooleanExtra(com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService.KEY_FOREGROUND, false)) {
                "io.bidmachine.media3.exoplayer.downloadService.action.RESTART".equals(action);
            }
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "io.bidmachine.media3.exoplayer.downloadService.action.INIT";
        }
        gVar = ((l) io.bidmachine.media3.common.util.a.checkNotNull(this.f61513b)).f98373b;
        switch (action) {
            case "io.bidmachine.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                DownloadRequest downloadRequest = (DownloadRequest) ((Intent) io.bidmachine.media3.common.util.a.checkNotNull(intent)).getParcelableExtra("download_request");
                if (downloadRequest != null) {
                    gVar.addDownload(downloadRequest, intent.getIntExtra("stop_reason", 0));
                    break;
                } else {
                    b0.e("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                }
            case "io.bidmachine.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                gVar.pauseDownloads();
                break;
            case "io.bidmachine.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                gVar.resumeDownloads();
                break;
            case "io.bidmachine.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                if (!((Intent) io.bidmachine.media3.common.util.a.checkNotNull(intent)).hasExtra("stop_reason")) {
                    b0.e("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    gVar.setStopReason(stringExtra, intent.getIntExtra("stop_reason", 0));
                    break;
                }
            case "io.bidmachine.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                gVar.removeAllDownloads();
                break;
            case "io.bidmachine.media3.exoplayer.downloadService.action.RESTART":
            case "io.bidmachine.media3.exoplayer.downloadService.action.INIT":
                break;
            case "io.bidmachine.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                Requirements requirements = (Requirements) ((Intent) io.bidmachine.media3.common.util.a.checkNotNull(intent)).getParcelableExtra("requirements");
                if (requirements != null) {
                    gVar.setRequirements(requirements);
                    break;
                } else {
                    b0.e("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                }
            case "io.bidmachine.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    gVar.removeDownload(stringExtra);
                    break;
                } else {
                    b0.e("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                }
            default:
                b0.e("DownloadService", "Ignored unrecognized action: ".concat(action));
                break;
        }
        int i12 = a1.f60679a;
        this.f61516f = false;
        if (gVar.isIdle()) {
            c();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.f61515e = true;
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i10, boolean z10) {
        return b(context, cls, "io.bidmachine.media3.exoplayer.downloadService.action.ADD_DOWNLOAD", z10).putExtra("download_request", downloadRequest).putExtra("stop_reason", i10);
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i10, boolean z10) {
        d(context, buildAddDownloadIntent(context, cls, downloadRequest, i10, z10), z10);
    }
}
