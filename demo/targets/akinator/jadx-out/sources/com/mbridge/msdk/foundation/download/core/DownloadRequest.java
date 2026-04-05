package com.mbridge.msdk.foundation.download.core;

import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r0;
import com.mbridge.msdk.tracker.network.p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class DownloadRequest<T> {
    private static final String TAG = "DownloadRequest";
    private int cacheDirectorPathType;
    private String cacheDirectoryPath;
    private long connectTimeout;
    private String directoryPathExternal;
    private String directoryPathInternal;
    private String downloadId;
    private DownloadMessage<T> downloadMessage;
    private DownloadPriority downloadPriority;
    private long downloadedBytes;
    private Map<String, String> extraMap;
    private Future future;
    private HashMap<String, List<String>> headerMap;
    private p monitor;
    private volatile OnDownloadStateListener onDownloadListener;
    private volatile OnProgressStateListener onProgressListener;
    private long readTimeout;
    private int retry;
    private int sequence;
    private DownloadStatus status;
    private long timeout;
    private String userAgent;
    private long writeTimeout;
    private volatile int retryedCount = 0;
    private long totalBytes = 0;
    private long downloadRequestCreateTime = SystemClock.elapsedRealtime();

    public DownloadRequest(DownloadRequestBuilder<T> downloadRequestBuilder) {
        this.headerMap = downloadRequestBuilder.headerMap;
        this.downloadPriority = downloadRequestBuilder.downloadPriority;
        this.readTimeout = downloadRequestBuilder.readTimeout;
        this.connectTimeout = downloadRequestBuilder.connectTimeout;
        this.userAgent = downloadRequestBuilder.userAgent;
        this.downloadMessage = downloadRequestBuilder.downloadMessage;
        this.writeTimeout = downloadRequestBuilder.writeTimeout;
        this.onDownloadListener = downloadRequestBuilder.downloadStateListener;
        this.onProgressListener = downloadRequestBuilder.progressStateListener;
        this.directoryPathExternal = downloadRequestBuilder.directoryPathExternal;
        this.directoryPathInternal = downloadRequestBuilder.directoryPathInternal;
        this.retry = downloadRequestBuilder.retry;
        this.timeout = downloadRequestBuilder.timeout;
        this.extraMap = downloadRequestBuilder.extraMap;
    }

    public static DownloadRequest create(DownloadRequestBuilder downloadRequestBuilder) {
        return new DownloadRequest(downloadRequestBuilder);
    }

    private void destroy() {
        this.onProgressListener = null;
        this.onDownloadListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finish() {
        destroy();
        DownloadRequestQueue.getInstance().finish(this);
    }

    public boolean canTrack() {
        return r0.a().a("request_track", true);
    }

    public void cancel(DownloadMessage<T> downloadMessage) {
        this.status = DownloadStatus.CANCELLED;
        Future future = this.future;
        if (future != null) {
            future.cancel(false);
        }
    }

    public String get(String str, String str2) {
        if (!Objects.isNull(this.extraMap) && this.extraMap.containsKey(str) && !TextUtils.isEmpty(str)) {
            String str3 = this.extraMap.get(str);
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        return str2;
    }

    public int getCacheDirectorPathType() {
        return this.cacheDirectorPathType;
    }

    public String getCacheDirectoryPath() {
        return this.cacheDirectoryPath;
    }

    public long getConnectTimeout() {
        return this.connectTimeout;
    }

    public String getDirectoryPathExternal() {
        return this.directoryPathExternal;
    }

    public String getDirectoryPathInternal() {
        return this.directoryPathInternal;
    }

    public String getDownloadId() {
        return this.downloadId;
    }

    public DownloadMessage<T> getDownloadMessage() {
        return this.downloadMessage;
    }

    public DownloadPriority getDownloadPriority() {
        return this.downloadPriority;
    }

    public long getDownloadedBytes() {
        return this.downloadedBytes;
    }

    public HashMap<String, List<String>> getHeaders() {
        return this.headerMap;
    }

    public p getMonitor() {
        return this.monitor;
    }

    public long getReadTimeout() {
        return this.readTimeout;
    }

    public long getRequestQueueTime() {
        return SystemClock.elapsedRealtime() - this.downloadRequestCreateTime;
    }

    public int getRetry() {
        return this.retry;
    }

    public int getRetryedCount() {
        return this.retryedCount;
    }

    public int getSequence() {
        return this.sequence;
    }

    public DownloadStatus getStatus() {
        return this.status;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public long getWriteTimeout() {
        return this.writeTimeout;
    }

    public void handlerCancelEvent(final DownloadMessage<T> downloadMessage) {
        ExecutorManager.getInstance().getExecutorSupplier().getDownloadResultTasks().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.download.core.DownloadRequest.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (DownloadRequest.this.onDownloadListener != null) {
                        DownloadRequest.this.onDownloadListener.onCancelDownload(downloadMessage);
                    }
                    DownloadRequest.this.finish();
                } catch (Exception e10) {
                    p0.b(DownloadRequest.TAG, e10.getMessage());
                }
            }
        });
    }

    public void handlerErrorEvent(final DownloadMessage<T> downloadMessage, final DownloadError downloadError) {
        if (this.status != DownloadStatus.CANCELLED) {
            setStatus(DownloadStatus.FAILED);
            ExecutorManager.getInstance().getExecutorSupplier().getDownloadResultTasks().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.download.core.DownloadRequest.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DownloadRequest.this.retryedCount >= DownloadRequest.this.retry) {
                            DownloadRequest.this.setStatus(DownloadStatus.FAILED);
                            if (DownloadRequest.this.onDownloadListener != null) {
                                DownloadRequest.this.onDownloadListener.onDownloadError(downloadMessage, downloadError);
                            }
                            DownloadRequest.this.finish();
                            return;
                        }
                        DownloadRequest.this.setStatus(DownloadStatus.RETRY);
                        DownloadRequest.this.retryedCount++;
                        DownloadRequest.this.setDownloadedBytes(0L);
                        DownloadRequest.this.setTotalBytes(0L);
                        DownloadRequestQueue.getInstance().finish(DownloadRequest.this);
                        DownloadRequestQueue.getInstance().addRequest(DownloadRequest.this);
                    } catch (Exception e10) {
                        p0.b(DownloadRequest.TAG, e10.getMessage());
                    }
                }
            });
        }
    }

    public void handlerProcessEvent(final DownloadMessage<T> downloadMessage, final DownloadProgress downloadProgress) {
        if (this.status != DownloadStatus.CANCELLED) {
            ExecutorManager.getInstance().getExecutorSupplier().getDownloadResultTasks().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.download.core.DownloadRequest.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DownloadRequest.this.onProgressListener != null) {
                            DownloadRequest.this.onProgressListener.onProgress(downloadMessage, downloadProgress);
                        }
                    } catch (Exception e10) {
                        p0.b(DownloadRequest.TAG, e10.getMessage());
                    }
                }
            });
        }
    }

    public void handlerStartEvent(final DownloadMessage<T> downloadMessage) {
        if (this.status != DownloadStatus.CANCELLED) {
            ExecutorManager.getInstance().getExecutorSupplier().getDownloadResultTasks().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.download.core.DownloadRequest.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DownloadRequest.this.onDownloadListener != null) {
                            DownloadRequest.this.onDownloadListener.onDownloadStart(downloadMessage);
                        }
                    } catch (Exception e10) {
                        p0.b(DownloadRequest.TAG, e10.getMessage());
                    }
                }
            });
        }
    }

    public void handlerSuccessEvent(final DownloadMessage<T> downloadMessage) {
        if (this.status != DownloadStatus.CANCELLED) {
            setStatus(DownloadStatus.COMPLETED);
            ExecutorManager.getInstance().getExecutorSupplier().getDownloadResultTasks().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.download.core.DownloadRequest.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DownloadRequest.this.extraMap != null && !DownloadRequest.this.extraMap.isEmpty()) {
                            String str = (String) DownloadRequest.this.extraMap.get("responseHeaders");
                            if (!TextUtils.isEmpty(str)) {
                                downloadMessage.addExtra("responseHeaders", str);
                            }
                        }
                        if (DownloadRequest.this.onDownloadListener != null) {
                            DownloadRequest.this.onDownloadListener.onDownloadComplete(downloadMessage);
                        }
                        DownloadRequest.this.finish();
                    } catch (Exception e10) {
                        p0.b(DownloadRequest.TAG, e10.getMessage());
                    }
                }
            });
        }
    }

    public void putExtraData(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (Objects.isNull(this.extraMap)) {
            this.extraMap = new HashMap();
        }
        this.extraMap.put(str, str2);
    }

    public void setCacheDirectorPathType(int i10) {
        this.cacheDirectorPathType = i10;
    }

    public void setCacheDirectoryPath(String str) {
        this.cacheDirectoryPath = str;
    }

    public void setDownloadedBytes(long j10) {
        this.downloadedBytes = j10;
    }

    public void setFuture(Future future) {
        this.future = future;
    }

    public void setMonitor(p pVar) {
        this.monitor = pVar;
    }

    public void setSequence(int i10) {
        this.sequence = i10;
    }

    public void setStatus(DownloadStatus downloadStatus) {
        this.status = downloadStatus;
    }

    public void setTotalBytes(long j10) {
        this.totalBytes = j10;
    }

    public String start() {
        this.downloadId = MBResourceManager.getInstance().getDownloadId(this.downloadMessage.getResourceUrl());
        DownloadRequestQueue.getInstance().addRequest(this);
        return this.downloadId;
    }
}
