package com.mbridge.msdk.foundation.download.core;

import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResponse;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Downloader implements Runnable {
    private static final String TAG = "DownloadTask";
    private IDatabaseHelper databaseHelper;
    private volatile DownloadMessage downloadMessage;
    public final DownloadPriority downloadPriority;
    public volatile DownloadRequest downloadRequest;
    public final int sequence;

    public Downloader(DownloadRequest downloadRequest) {
        this.downloadRequest = downloadRequest;
        this.downloadPriority = downloadRequest.getDownloadPriority();
        this.sequence = downloadRequest.getSequence();
    }

    @Override // java.lang.Runnable
    public void run() {
        GlobalComponent.getInstance().getLogger().log("DownloadTask", "开始下载任务");
        if (this.downloadRequest.getStatus() != DownloadStatus.RETRY) {
            this.downloadRequest.handlerStartEvent(this.downloadRequest.getDownloadMessage());
        }
        this.downloadRequest.setStatus(DownloadStatus.RUNNING);
        GlobalComponent.getInstance().getLogger().log("DownloadTask", "任务 " + this.downloadRequest.getDownloadId() + " 修改状态为 RUNNING");
        this.downloadMessage = this.downloadRequest.getDownloadMessage();
        this.databaseHelper = GlobalComponent.getInstance().getDatabaseHelper();
        SynchronizeAvailableDirectorPath.create(this.downloadRequest).run();
        String cacheDirectoryPath = this.downloadRequest.getCacheDirectoryPath();
        int cacheDirectorPathType = this.downloadRequest.getCacheDirectorPathType();
        DownloadMessage downloadMessage = this.downloadMessage;
        StringBuilder sbU = o2.u(cacheDirectoryPath);
        sbU.append(this.downloadMessage.getSaveFileName());
        downloadMessage.setSaveFilePath(sbU.toString());
        GlobalComponent.getInstance().getLogger().log("DownloadTask", "cacheDirectoryPath： " + cacheDirectoryPath + " cacheDirectorPathType： " + cacheDirectorPathType);
        DownloadResponse downloadResponseRun = DownloadTask.create(this.downloadRequest, this.downloadMessage, this.databaseHelper).run();
        if (downloadResponseRun.isSuccessful()) {
            if (downloadResponseRun.getFrom() == 1) {
                this.downloadMessage.setFrom(1);
            }
            this.downloadRequest.handlerSuccessEvent(this.downloadMessage);
        } else if (downloadResponseRun.getError() != null) {
            this.downloadRequest.handlerErrorEvent(this.downloadMessage, downloadResponseRun.getError());
        } else if (downloadResponseRun.isCancelled()) {
            this.downloadRequest.handlerCancelEvent(this.downloadMessage);
        }
    }
}
