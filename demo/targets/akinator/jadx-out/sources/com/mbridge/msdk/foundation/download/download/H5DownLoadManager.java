package com.mbridge.msdk.foundation.download.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.same.report.metrics.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.x0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.unity3d.ads.beta.xyn.RnJusJ;
import j1.o2;
import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class H5DownLoadManager {
    public static final String SP_ENDING_PAGE_SAVE_TIME = "ending_page_save_time";
    public static final String SP_ENDING_PAGE_SOURCE = "ending_page_source";
    private static final String TAG = "H5DownLoadManager";
    private static volatile H5DownLoadManager sH5Manager;
    private final String DOWN_TYPE = "down_type";
    private final String LOCAL_RID = OcvDtWCQ.Roybkdr;
    private HTMLResourceManager htmlResourceManager;
    private boolean isUseDownloadModule;
    private CopyOnWriteArrayList<String> mResDownloadingList;
    private ConcurrentMap<String, DownLoadH5SourceListener> mResDownloadingMap;
    private ResourceManager resourceManager;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface H5ResDownloadListerInter {
        void onFailed(String str, String str2);

        void onSuccess(String str, String str2, boolean z10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface IH5SourceDownloadListener extends H5ResDownloadListerInter {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface IOnDownLoadH5Source {
        void onFailed(String str);

        void onStart();

        void onSuccess(String str, byte[] bArr, String str2);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ZipDownloadListener extends H5ResDownloadListerInter {
    }

    private void downloadHTML(final c cVar, final String str, final H5ResDownloadListerInter h5ResDownloadListerInter) {
        try {
            p0.b(TAG, "download url:" + str);
            final e eVar = new e();
            eVar.a("scenes", "1");
            eVar.a("url", str);
            if (cVar != null) {
                eVar.a("resource_type", Integer.valueOf(cVar.l()));
            }
            if (this.mResDownloadingList.contains(str)) {
                return;
            }
            this.mResDownloadingList.add(str);
            DownloadTask.getInstance().runTask(new a() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.2
                @Override // com.mbridge.msdk.foundation.same.task.a
                public void runTask() {
                    if (TextUtils.isEmpty(H5DownLoadManager.this.htmlResourceManager.getHtmlContentFromUrl(str))) {
                        DownLoadUtils.getSourceCodeFromNetUrl(str, new IOnDownLoadH5Source() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.2.1
                            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
                            public void onFailed(String str2) {
                                try {
                                    H5DownLoadManager.this.mResDownloadingList.remove(str);
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                                    if (h5ResDownloadListerInter2 != null) {
                                        h5ResDownloadListerInter2.onFailed(str, str2);
                                    }
                                } catch (Exception e10) {
                                    if (MBridgeConstans.DEBUG) {
                                        e10.printStackTrace();
                                    }
                                    AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                    H5ResDownloadListerInter h5ResDownloadListerInter3 = h5ResDownloadListerInter;
                                    if (h5ResDownloadListerInter3 != null) {
                                        h5ResDownloadListerInter3.onFailed(str, str2);
                                    }
                                }
                                AnonymousClass2 anonymousClass23 = AnonymousClass2.this;
                                if (h5ResDownloadListerInter == null) {
                                    eVar.a("result", 3);
                                    AnonymousClass2 anonymousClass24 = AnonymousClass2.this;
                                    cVar.a("m_download_end", eVar);
                                    d.b().b("m_download_end", cVar, null);
                                }
                            }

                            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
                            public void onSuccess(String str2, byte[] bArr, String str3) {
                                try {
                                    H5DownLoadManager.this.mResDownloadingList.remove(str3);
                                    if (bArr == null || bArr.length <= 0) {
                                        return;
                                    }
                                    if (H5DownLoadManager.this.htmlResourceManager.saveResHtmlFile(str3, bArr)) {
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                                        if (h5ResDownloadListerInter2 != null) {
                                            h5ResDownloadListerInter2.onSuccess(str3, "", false);
                                            return;
                                        }
                                        eVar.a("result", 3);
                                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                        cVar.a("m_download_end", eVar);
                                        d.b().b("m_download_end", cVar, null);
                                        return;
                                    }
                                    AnonymousClass2 anonymousClass23 = AnonymousClass2.this;
                                    H5ResDownloadListerInter h5ResDownloadListerInter3 = h5ResDownloadListerInter;
                                    if (h5ResDownloadListerInter3 != null) {
                                        h5ResDownloadListerInter3.onFailed(str3, "save file failed");
                                        return;
                                    }
                                    eVar.a("result", 3);
                                    AnonymousClass2 anonymousClass24 = AnonymousClass2.this;
                                    cVar.a("m_download_end", eVar);
                                    d.b().b("m_download_end", cVar, null);
                                } catch (Exception e10) {
                                    if (MBridgeConstans.DEBUG) {
                                        e10.printStackTrace();
                                    }
                                    AnonymousClass2 anonymousClass25 = AnonymousClass2.this;
                                    H5ResDownloadListerInter h5ResDownloadListerInter4 = h5ResDownloadListerInter;
                                    if (h5ResDownloadListerInter4 != null) {
                                        h5ResDownloadListerInter4.onFailed(str3, e10.getMessage());
                                        return;
                                    }
                                    eVar.a("result", 3);
                                    AnonymousClass2 anonymousClass26 = AnonymousClass2.this;
                                    cVar.a("m_download_end", eVar);
                                    d.b().b("m_download_end", cVar, null);
                                }
                            }

                            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
                            public void onStart() {
                            }
                        }, true);
                        eVar.a("cache", 1);
                        cVar.a("m_download_start", eVar);
                        d.b().b("m_download_start", cVar, null);
                        return;
                    }
                    eVar.a("cache", 2);
                    H5DownLoadManager.this.mResDownloadingList.remove(str);
                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                    if (h5ResDownloadListerInter2 != null) {
                        h5ResDownloadListerInter2.onSuccess(str, "", true);
                    }
                    cVar.a("m_download_start", eVar);
                    d.b().b("m_download_start", cVar, null);
                }

                @Override // com.mbridge.msdk.foundation.same.task.a
                public void cancelTask() {
                }

                @Override // com.mbridge.msdk.foundation.same.task.a
                public void pauseTask(boolean z10) {
                }
            });
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }

    private void downloadHTMLByDownloadModule(final String str, final H5ResDownloadListerInter h5ResDownloadListerInter) throws NoSuchAlgorithmException {
        if (TextUtils.isEmpty(str)) {
            if (h5ResDownloadListerInter != null) {
                h5ResDownloadListerInter.onFailed("zip url is null", str);
                return;
            }
            return;
        }
        try {
            new URL(str);
            MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, o2.l(SameMD5.getMD5(b1.b(str)), ".html"), 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_HTML)).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).withReadTimeout(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL).withConnectTimeout(20000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML) + "/").withDownloadStateListener(new OnDownloadStateListener() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.1
                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onCancelDownload(DownloadMessage downloadMessage) {
                    p0.a(H5DownLoadManager.TAG, "下载取消： ");
                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                    if (h5ResDownloadListerInter2 != null) {
                        h5ResDownloadListerInter2.onFailed(str, "task cancel");
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadComplete(DownloadMessage downloadMessage) {
                    p0.a(H5DownLoadManager.TAG, "下载结束： " + downloadMessage.getDownloadUrl() + " " + downloadMessage.getDownloadResourceType() + " " + downloadMessage.getSaveFilePath());
                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                    if (h5ResDownloadListerInter2 != null) {
                        h5ResDownloadListerInter2.onSuccess(str, "", false);
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
                    p0.a(H5DownLoadManager.TAG, "下载结束失败： " + downloadError.getException().getMessage());
                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                    if (h5ResDownloadListerInter2 != null) {
                        h5ResDownloadListerInter2.onFailed(str, downloadError.getException().getMessage());
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadStart(DownloadMessage downloadMessage) {
                    p0.a(H5DownLoadManager.TAG, "开始下载 html： " + downloadMessage.getDownloadUrl() + " " + downloadMessage.getDownloadResourceType());
                }
            }).build().start();
        } catch (Exception unused) {
            if (h5ResDownloadListerInter != null) {
                h5ResDownloadListerInter.onFailed("zip url is unlawful", str);
            }
        }
    }

    private void downloadZipByDownloadModule(final c cVar, String str, final ZipDownloadListener zipDownloadListener) throws NoSuchAlgorithmException {
        if (TextUtils.isEmpty(str)) {
            if (zipDownloadListener != null) {
                zipDownloadListener.onFailed(str, "zip url is null");
                return;
            }
            return;
        }
        try {
            new URL(str);
            final e eVar = new e();
            eVar.a("scenes", "1");
            eVar.a("url", str);
            if (cVar != null) {
                eVar.a("resource_type", Integer.valueOf(cVar.l()));
            }
            String strB = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_RES);
            String md5 = SameMD5.getMD5(b1.b(str));
            String strL = o2.l(strB, "/");
            final String strD = i.d(strB, "/", md5);
            DownloadMessage<?> downloadMessage = new DownloadMessage<>(cVar, str, o2.l(md5, ".zip"), 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP);
            if (cVar != null) {
                downloadMessage.setUseCronetDownload(cVar.m());
            }
            MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL).withConnectTimeout(20000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(strL).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).withDownloadStateListener(new OnDownloadStateListener() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.3
                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onCancelDownload(DownloadMessage downloadMessage2) {
                    p0.a(H5DownLoadManager.TAG, "下载取消： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType());
                    e eVar2 = eVar;
                    if (eVar2 != null) {
                        eVar2.a("cache", Integer.valueOf(downloadMessage2.isCache() ? 1 : 2));
                    }
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.a("m_download_start", eVar);
                    }
                    d.b().b("m_download_start", cVar, null);
                    if (TextUtils.isEmpty(ResourceManager.getinstance().getResDirFromCampaign(downloadMessage2.getDownloadUrl()))) {
                        ZipDownloadListener zipDownloadListener2 = zipDownloadListener;
                        if (zipDownloadListener2 != null) {
                            zipDownloadListener2.onFailed(downloadMessage2.getDownloadUrl(), "task cancel");
                            return;
                        }
                        return;
                    }
                    ZipDownloadListener zipDownloadListener3 = zipDownloadListener;
                    if (zipDownloadListener3 != null) {
                        zipDownloadListener3.onSuccess(downloadMessage2.getDownloadUrl(), "", downloadMessage2.isCache());
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadComplete(DownloadMessage downloadMessage2) {
                    p0.a(H5DownLoadManager.TAG, "下载结束，开始解压缩文件： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType() + " " + downloadMessage2.getSaveFilePath());
                    try {
                        e eVar2 = eVar;
                        if (eVar2 != null) {
                            eVar2.a("cache", Integer.valueOf(downloadMessage2.isCache() ? 1 : 2));
                        }
                        c cVar2 = cVar;
                        if (cVar2 != null) {
                            cVar2.a("m_download_start", eVar);
                        }
                        d.b().b("m_download_start", cVar, null);
                        if (TextUtils.isEmpty(ResourceManager.getinstance().getResDirFromCampaign(downloadMessage2.getDownloadUrl()))) {
                            MBResourceManager.getInstance().unZip(downloadMessage2.getSaveFilePath(), strD);
                        }
                        String str2 = "";
                        try {
                            str2 = (String) downloadMessage2.getExtra("responseHeaders");
                        } catch (Throwable th2) {
                            p0.b(H5DownLoadManager.TAG, th2.getMessage());
                        }
                        p0.a(H5DownLoadManager.TAG, "下载结束，开始解压缩文件，文件解压成功： " + strD);
                        ZipDownloadListener zipDownloadListener2 = zipDownloadListener;
                        if (zipDownloadListener2 != null) {
                            zipDownloadListener2.onSuccess(downloadMessage2.getDownloadUrl(), str2, downloadMessage2.isCache());
                        }
                    } catch (IOException e10) {
                        p0.a(H5DownLoadManager.TAG, "下载结束，开始解压缩文件，文件解压失败： " + e10.getMessage());
                        ZipDownloadListener zipDownloadListener3 = zipDownloadListener;
                        if (zipDownloadListener3 != null) {
                            zipDownloadListener3.onFailed(downloadMessage2.getDownloadUrl(), e10.getMessage());
                        }
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadStart(DownloadMessage downloadMessage2) {
                    p0.a(H5DownLoadManager.TAG, "开始下载 zip： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType());
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadError(DownloadMessage downloadMessage2, DownloadError downloadError) {
                    p0.a(H5DownLoadManager.TAG, "下载错误： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType() + "  " + downloadError.getException().getMessage());
                    e eVar2 = eVar;
                    if (eVar2 != null) {
                        eVar2.a(RnJusJ.meWGRQbOOtUm, Integer.valueOf(downloadMessage2.isCache() ? 1 : 2));
                    }
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.a("m_download_start", eVar);
                    }
                    d.b().b("m_download_start", cVar, null);
                    if (TextUtils.isEmpty(ResourceManager.getinstance().getResDirFromCampaign(downloadMessage2.getDownloadUrl()))) {
                        ZipDownloadListener zipDownloadListener2 = zipDownloadListener;
                        if (zipDownloadListener2 != null) {
                            zipDownloadListener2.onFailed(downloadMessage2.getDownloadUrl(), downloadError.getException().getMessage());
                            return;
                        }
                        return;
                    }
                    ZipDownloadListener zipDownloadListener3 = zipDownloadListener;
                    if (zipDownloadListener3 != null) {
                        zipDownloadListener3.onSuccess(downloadMessage2.getDownloadUrl(), "", downloadMessage2.isCache());
                    }
                }
            }).build().start();
        } catch (Exception unused) {
            if (zipDownloadListener != null) {
                zipDownloadListener.onFailed(str, "zip url is unlawful");
            }
        }
    }

    private void downloadZipByOldDownloadModule(c cVar, String str, ZipDownloadListener zipDownloadListener) {
        e eVar = new e();
        eVar.a("scenes", "1");
        eVar.a("url", str);
        if (cVar != null) {
            eVar.a("resource_type", Integer.valueOf(cVar.l()));
        }
        try {
            if (TextUtils.isEmpty(this.resourceManager.getResDirFromCampaign(str))) {
                eVar.a("cache", 2);
                if (this.mResDownloadingMap.containsKey(str)) {
                    DownLoadH5SourceListener downLoadH5SourceListener = this.mResDownloadingMap.get(str);
                    if (downLoadH5SourceListener != null) {
                        downLoadH5SourceListener.setZipDownloadListener(zipDownloadListener);
                    }
                    if (cVar == null || cVar.B()) {
                        return;
                    }
                    cVar.a("m_download_start", eVar);
                    d.b().b("m_download_start", cVar, null);
                    return;
                }
                DownLoadH5SourceListener downLoadH5SourceListener2 = new DownLoadH5SourceListener(this.mResDownloadingMap, this.resourceManager, zipDownloadListener, str);
                this.mResDownloadingMap.put(str, downLoadH5SourceListener2);
                DownLoadUtils.getSourceCodeFromNetUrl(str, downLoadH5SourceListener2, true);
            } else {
                eVar.a("cache", 1);
                if (zipDownloadListener != null) {
                    zipDownloadListener.onSuccess(str, "", true);
                }
            }
            if (cVar == null || cVar.B()) {
                return;
            }
            cVar.a("m_download_start", eVar);
            d.b().b("m_download_start", cVar, null);
        } catch (Exception e10) {
            if (zipDownloadListener != null) {
                zipDownloadListener.onFailed(str, "downloadzip failed");
            }
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private String getHtmlAddress(String str) {
        HTMLResourceManager hTMLResourceManager = this.htmlResourceManager;
        return hTMLResourceManager != null ? hTMLResourceManager.getHtmlPathFromUrl(str) : str;
    }

    public static H5DownLoadManager getInstance() {
        if (sH5Manager == null) {
            synchronized (H5DownLoadManager.class) {
                try {
                    if (sH5Manager == null) {
                        sH5Manager = new H5DownLoadManager();
                    }
                } finally {
                }
            }
        }
        return sH5Manager;
    }

    private long getPreSaveTimeFromSp(String str) {
        try {
            Object objA = x0.a(com.mbridge.msdk.foundation.controller.c.m().d(), SP_ENDING_PAGE_SAVE_TIME + str, 0L);
            if (objA != null && (objA instanceof Long)) {
                return ((Long) objA).longValue();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return 0L;
    }

    private void saveSourceContent(String str, String str2) {
        try {
            p0.c(TAG, "sourceContent:" + str);
            x0.b(com.mbridge.msdk.foundation.controller.c.m().d(), SP_ENDING_PAGE_SOURCE + str2, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void updateEndingPageSaveTime(String str) {
        try {
            x0.b(com.mbridge.msdk.foundation.controller.c.m().d(), SP_ENDING_PAGE_SAVE_TIME + str, Long.valueOf(System.currentTimeMillis()));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void download(c cVar, String str) throws NoSuchAlgorithmException {
        download(cVar, str, null);
    }

    public void downloadH5Res(c cVar, String str) {
        downloadH5Res(cVar, str, null);
    }

    public void downloadZip(c cVar, String str, ZipDownloadListener zipDownloadListener) throws NoSuchAlgorithmException {
        if (this.isUseDownloadModule) {
            downloadZipByDownloadModule(cVar, str, zipDownloadListener);
        } else {
            downloadZipByOldDownloadModule(cVar, str, zipDownloadListener);
        }
    }

    public String getH5ResAddress(String str) {
        try {
            if (!Patterns.WEB_URL.matcher(str).matches() && !URLUtil.isValidUrl(str)) {
                return str;
            }
            Uri uri = Uri.parse(str);
            String path = uri.getPath();
            if (!TextUtils.isEmpty(path) && TextUtils.isEmpty(uri.getQueryParameter("urlDebug"))) {
                return path.toLowerCase().endsWith(".zip") ? getResAddress(str) : getHtmlAddress(str);
            }
            return str;
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }

    public String getResAddress(String str) {
        ResourceManager resourceManager = this.resourceManager;
        if (resourceManager != null) {
            return resourceManager.getResDirFromCampaign(str);
        }
        return null;
    }

    public String getSourceContentFromSp(String str) {
        try {
            Object objA = x0.a(com.mbridge.msdk.foundation.controller.c.m().d(), SP_ENDING_PAGE_SOURCE + str, "");
            if (objA == null || !(objA instanceof String)) {
                return null;
            }
            String str2 = (String) objA;
            if (z0.b(str2)) {
                return str2;
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void download(c cVar, String str, H5ResDownloadListerInter h5ResDownloadListerInter) throws NoSuchAlgorithmException {
        if (this.isUseDownloadModule) {
            downloadHTMLByDownloadModule(str, h5ResDownloadListerInter);
        } else {
            downloadHTML(cVar, str, h5ResDownloadListerInter);
        }
    }

    public void downloadH5Res(c cVar, String str, H5ResDownloadListerInter h5ResDownloadListerInter) {
        c cVarA = d.b().a(cVar);
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                String path = Uri.parse(str).getPath();
                if (!TextUtils.isEmpty(path)) {
                    if (path.toLowerCase().endsWith(".zip")) {
                        downloadZip(cVarA, str, (ZipDownloadListener) h5ResDownloadListerInter);
                        return;
                    } else {
                        download(cVarA, str, h5ResDownloadListerInter);
                        return;
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (h5ResDownloadListerInter != null) {
            h5ResDownloadListerInter.onFailed(str, "The URL does not contain a path ");
        }
    }

    private H5DownLoadManager() {
        this.isUseDownloadModule = false;
        try {
            this.resourceManager = ResourceManager.getinstance();
            this.htmlResourceManager = HTMLResourceManager.getInstance();
            this.mResDownloadingList = new CopyOnWriteArrayList<>();
            this.mResDownloadingMap = new ConcurrentHashMap();
            g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
            if (gVarD != null) {
                this.isUseDownloadModule = gVarD.b(1);
            }
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage(), th2);
        }
    }

    public void downloadH5Res(String str, H5ResDownloadListerInter h5ResDownloadListerInter) {
        downloadH5Res(new c(), str, h5ResDownloadListerInter);
    }
}
