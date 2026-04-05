package com.vungle.ads.internal.downloader;

import com.ironsource.lh;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.NoSpaceError;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.task.PriorityRunnable;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import dw.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import pw.h0;
import pw.x;
import sv.k0;
import tu.o;
import tu.q;
import xv.e;
import xv.g0;
import xv.l0;
import xv.v0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AssetDownloader implements Downloader {
    private static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String CONTENT_TYPE = "Content-Type";
    public static final Companion Companion = new Companion(null);
    private static final int DOWNLOAD_CHUNK_SIZE = 2048;
    private static final String GZIP = "gzip";
    private static final int MAX_PERCENT = 100;
    private static final int MINIMUM_SPACE_REQUIRED_MB = 20971520;
    private static final int PROGRESS_STEP = 1;
    private static final String TAG = "AssetDownloader";
    private final VungleThreadPoolExecutor downloadExecutor;
    private final o okHttpClient$delegate;
    private final PathProvider pathProvider;
    private final List<DownloadRequest> transitioning;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class OkHttpSingleton {
        public static final OkHttpSingleton INSTANCE = new OkHttpSingleton();
        private static l0 client;

        private OkHttpSingleton() {
        }

        public final l0 createOkHttpClient(PathProvider pathProvider) {
            e0.checkNotNullParameter(pathProvider, "pathProvider");
            l0 l0Var = client;
            if (l0Var != null) {
                return l0Var;
            }
            l0.a aVar = new l0.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            l0.a aVarFollowSslRedirects = aVar.readTimeout(60L, timeUnit).connectTimeout(60L, timeUnit).cache(null).followRedirects(true).followSslRedirects(true);
            ConfigManager configManager = ConfigManager.INSTANCE;
            if (configManager.isCleverCacheEnabled()) {
                long cleverCacheDiskSize = configManager.getCleverCacheDiskSize();
                int cleverCacheDiskPercentage = configManager.getCleverCacheDiskPercentage();
                String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
                e0.checkNotNullExpressionValue(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
                long jMin = Math.min(cleverCacheDiskSize, (pathProvider.getAvailableBytes(absolutePath) * cleverCacheDiskPercentage) / 100);
                if (jMin > 0) {
                    aVarFollowSslRedirects.cache(new e(pathProvider.getCleverCacheDir(), jMin));
                } else {
                    Logger.Companion.w("OkHttpClientWrapper", "cache disk capacity size <=0, no clever cache active.");
                }
            }
            l0 l0VarBuild = aVarFollowSslRedirects.build();
            client = l0VarBuild;
            return l0VarBuild;
        }
    }

    public AssetDownloader(VungleThreadPoolExecutor downloadExecutor, PathProvider pathProvider) {
        e0.checkNotNullParameter(downloadExecutor, "downloadExecutor");
        e0.checkNotNullParameter(pathProvider, "pathProvider");
        this.downloadExecutor = downloadExecutor;
        this.pathProvider = pathProvider;
        this.okHttpClient$delegate = q.lazy(new AssetDownloader$okHttpClient$2(this));
        this.transitioning = new ArrayList();
    }

    private final boolean checkSpaceAvailable(DownloadRequest downloadRequest) {
        PathProvider pathProvider = this.pathProvider;
        String absolutePath = pathProvider.getVungleDir().getAbsolutePath();
        e0.checkNotNullExpressionValue(absolutePath, "pathProvider.getVungleDir().absolutePath");
        long availableBytes = pathProvider.getAvailableBytes(absolutePath);
        if (availableBytes >= ServiceProvider.HTTP_CACHE_DISK_SIZE) {
            return true;
        }
        new NoSpaceError(o2.m(availableBytes, "Insufficient space ")).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
        return false;
    }

    private final w0 decodeGzipIfNeeded(v0 v0Var) {
        w0 w0VarBody = v0Var.body();
        if (!k0.equals(GZIP, v0.header$default(v0Var, CONTENT_ENCODING, null, 2, null), true) || w0VarBody == null) {
            return w0VarBody;
        }
        return new l(v0.header$default(v0Var, "Content-Type", null, 2, null), -1L, h0.buffer(new x(w0VarBody.source())));
    }

    private final void deliverError(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener, AssetDownloadListener.DownloadError downloadError) {
        if (assetDownloadListener != null) {
            assetDownloadListener.onError(downloadError, downloadRequest);
        }
    }

    private final void deliverSuccess(File file, DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) {
        Logger.Companion.d(TAG, "On success " + downloadRequest);
        if (assetDownloadListener != null) {
            assetDownloadListener.onSuccess(file, downloadRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: download$lambda-0, reason: not valid java name */
    public static final void m3603download$lambda0(DownloadRequest downloadRequest, AssetDownloader this$0, AssetDownloadListener assetDownloadListener) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new OutOfMemory("Failed to execute download request: " + downloadRequest.getAsset().getServerPath()), AssetDownloadListener.DownloadError.ErrorReason.Companion.getINTERNAL_ERROR()));
    }

    private final l0 getOkHttpClient() {
        return (l0) this.okHttpClient$delegate.getValue();
    }

    private final boolean isValidUrl(String str) {
        return (str == null || str.length() == 0 || g0.f93628j.parse(str) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0227, code lost:
    
        r8.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.Companion.getCANCELLED());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0486 A[Catch: all -> 0x04ac, TryCatch #6 {all -> 0x04ac, blocks: (B:211:0x0479, B:213:0x0486, B:216:0x04af), top: B:258:0x0479 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0156 A[Catch: all -> 0x0417, Exception -> 0x041e, TRY_LEAVE, TryCatch #12 {Exception -> 0x041e, blocks: (B:37:0x0150, B:39:0x0156), top: B:262:0x0150 }] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.String, kotlin.jvm.internal.u] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.vungle.ads.internal.util.FileUtility] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void launchRequest(com.vungle.ads.internal.downloader.DownloadRequest r29, com.vungle.ads.internal.downloader.AssetDownloadListener r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.downloader.AssetDownloader.launchRequest(com.vungle.ads.internal.downloader.DownloadRequest, com.vungle.ads.internal.downloader.AssetDownloadListener):void");
    }

    private final void onProgressChanged(DownloadRequest downloadRequest, AssetDownloadListener.Progress progress, AssetDownloadListener assetDownloadListener) {
        if (assetDownloadListener != null) {
            assetDownloadListener.onProgress(progress, downloadRequest);
        }
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancel(DownloadRequest downloadRequest) {
        if (downloadRequest == null || downloadRequest.isCancelled()) {
            return;
        }
        downloadRequest.cancel();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancelAll() {
        Iterator<T> it = this.transitioning.iterator();
        while (it.hasNext()) {
            cancel((DownloadRequest) it.next());
        }
        this.transitioning.clear();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void download(final DownloadRequest downloadRequest, final AssetDownloadListener assetDownloadListener) {
        if (downloadRequest == null) {
            return;
        }
        this.transitioning.add(downloadRequest);
        this.downloadExecutor.execute(new PriorityRunnable() { // from class: com.vungle.ads.internal.downloader.AssetDownloader.download.1
            @Override // com.vungle.ads.internal.task.PriorityRunnable
            public int getPriority() {
                return downloadRequest.getPriority();
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                AssetDownloader.this.launchRequest(downloadRequest, assetDownloadListener);
            }
        }, new lh(downloadRequest, 17, this, assetDownloadListener));
    }
}
