package com.mbridge.msdk.foundation.download;

import android.content.Context;
import com.mbridge.msdk.foundation.download.core.DownloadRequestBuilder;
import com.mbridge.msdk.foundation.download.core.DownloadRequestQueue;
import com.mbridge.msdk.foundation.download.core.ExecutorManager;
import com.mbridge.msdk.foundation.download.core.GlobalComponent;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.download.resource.ResourceConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class MBDownloadManager {
    private boolean initialize;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ClassHolder {
        private static final MBDownloadManager MB_DOWNLOAD_MANAGER = new MBDownloadManager();

        private ClassHolder() {
        }
    }

    public static MBDownloadManager getInstance() {
        return ClassHolder.MB_DOWNLOAD_MANAGER;
    }

    public synchronized void cancel(String str) {
        DownloadRequestQueue.getInstance().cancel(str);
    }

    public synchronized void cancelAll() {
        DownloadRequestQueue.getInstance().cancelAll();
    }

    public synchronized DownloadRequestBuilder download(DownloadMessage<?> downloadMessage) {
        return new DownloadRequestBuilder(downloadMessage);
    }

    public synchronized String getDownloadId(String str) {
        return MBResourceManager.getInstance().getDownloadId(str);
    }

    public synchronized DownloadStatus getStatus(String str) {
        return DownloadRequestQueue.getInstance().getStatus(str);
    }

    public void initialize(Context context, MBDownloadConfig mBDownloadConfig, ResourceConfig resourceConfig) {
        if (this.initialize) {
            return;
        }
        GlobalComponent.getInstance().initialize(context, mBDownloadConfig);
        DownloadRequestQueue.getInstance().initialize();
        MBResourceManager.getInstance().executeResourceStrategy(resourceConfig);
        this.initialize = true;
    }

    public synchronized void shutDown() {
        ExecutorManager.shutDown();
    }

    public synchronized void updateZipResource(String str, String str2, long j10) {
        GlobalComponent.getInstance().getDatabaseHelper().updateUnzipResource(str, str2, j10);
    }

    private MBDownloadManager() {
        this.initialize = false;
    }
}
