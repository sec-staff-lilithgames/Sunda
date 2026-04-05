package com.google.android.exoplayer2.offline;

import af.h;
import af.o;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.util.a;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public abstract class DownloadService extends Service {

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f27880g = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public o f27881b;

    /* renamed from: c, reason: collision with root package name */
    public int f27882c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27883e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27884f;

    public static Intent b(Context context, Class cls, String str, boolean z10) {
        return new Intent(context, (Class<?>) cls).setAction(str).putExtra(com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService.KEY_FOREGROUND, z10);
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z10) {
        return buildAddDownloadIntent(context, cls, downloadRequest, 0, z10);
    }

    public static Intent buildPauseDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z10) {
        return b(context, cls, "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS", z10);
    }

    public static Intent buildRemoveAllDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z10) {
        return b(context, cls, "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS", z10);
    }

    public static Intent buildRemoveDownloadIntent(Context context, Class<? extends DownloadService> cls, String str, boolean z10) {
        return b(context, cls, "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD", z10).putExtra(AppLovinEventParameters.CONTENT_IDENTIFIER, str);
    }

    public static Intent buildResumeDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z10) {
        return b(context, cls, "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS", z10);
    }

    public static Intent buildSetRequirementsIntent(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z10) {
        return b(context, cls, "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS", z10).putExtra("requirements", requirements);
    }

    public static Intent buildSetStopReasonIntent(Context context, Class<? extends DownloadService> cls, String str, int i10, boolean z10) {
        return b(context, cls, "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON", z10).putExtra(AppLovinEventParameters.CONTENT_IDENTIFIER, str).putExtra("stop_reason", i10);
    }

    public static void clearDownloadManagerHelpers() {
        f27880g.clear();
    }

    public static void d(Context context, Intent intent, boolean z10) {
        if (z10) {
            n1.startForegroundService(context, intent);
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
        context.startService(new Intent(context, cls).setAction(com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService.ACTION_INIT));
    }

    public static void startForeground(Context context, Class<? extends DownloadService> cls) {
        n1.startForegroundService(context, b(context, cls, com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService.ACTION_INIT, true));
    }

    public abstract h a();

    public final void c() {
        if (((o) a.checkNotNull(this.f27881b)).updateScheduler()) {
            if (n1.f28506a >= 28 || !this.f27883e) {
                this.f27884f |= stopSelfResult(this.f27882c);
            } else {
                stopSelf();
                this.f27884f = true;
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
        HashMap map = f27880g;
        o oVar = (o) map.get(cls);
        if (oVar == null) {
            int i10 = n1.f28506a;
            h hVarA = a();
            hVarA.resumeDownloads();
            o oVar2 = new o(getApplicationContext(), hVarA, cls);
            map.put(cls, oVar2);
            oVar = oVar2;
        }
        this.f27881b = oVar;
        oVar.attachService(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        ((o) a.checkNotNull(this.f27881b)).detachService(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        String action;
        String stringExtra;
        h hVar;
        this.f27882c = i11;
        this.f27883e = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra(AppLovinEventParameters.CONTENT_IDENTIFIER);
            if (!intent.getBooleanExtra(com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService.KEY_FOREGROUND, false)) {
                "com.google.android.exoplayer.downloadService.action.RESTART".equals(action);
            }
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService.ACTION_INIT;
        }
        hVar = ((o) a.checkNotNull(this.f27881b)).f4380b;
        switch (action) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                DownloadRequest downloadRequest = (DownloadRequest) ((Intent) a.checkNotNull(intent)).getParcelableExtra("download_request");
                if (downloadRequest != null) {
                    hVar.addDownload(downloadRequest, intent.getIntExtra("stop_reason", 0));
                    break;
                } else {
                    f0.e("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                }
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                hVar.resumeDownloads();
                break;
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                hVar.removeAllDownloads();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS":
                Requirements requirements = (Requirements) ((Intent) a.checkNotNull(intent)).getParcelableExtra("requirements");
                if (requirements != null) {
                    hVar.setRequirements(requirements);
                    break;
                } else {
                    f0.e("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                }
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                hVar.pauseDownloads();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                if (!((Intent) a.checkNotNull(intent)).hasExtra("stop_reason")) {
                    f0.e("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    hVar.setStopReason(stringExtra, intent.getIntExtra("stop_reason", 0));
                    break;
                }
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    hVar.removeDownload(stringExtra);
                    break;
                } else {
                    f0.e("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                }
            default:
                f0.e("DownloadService", "Ignored unrecognized action: ".concat(action));
                break;
        }
        int i12 = n1.f28506a;
        this.f27884f = false;
        if (hVar.isIdle()) {
            c();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.f27883e = true;
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i10, boolean z10) {
        return b(context, cls, "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD", z10).putExtra("download_request", downloadRequest).putExtra("stop_reason", i10);
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i10, boolean z10) {
        d(context, buildAddDownloadIntent(context, cls, downloadRequest, i10, z10), z10);
    }
}
