package com.mbridge.msdk.foundation.download.core;

import android.os.Build;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.DownloadResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class SynchronizeAvailableDirectorPath implements IDownloadTask {
    private int cacheDirectorPathType;
    private String cacheDirectoryPath;
    private String cacheDirectoryPathExternal;
    private String cacheDirectoryPathInternal;
    private DownloadRequest downloadRequest;

    public SynchronizeAvailableDirectorPath(DownloadRequest downloadRequest) {
        this.downloadRequest = downloadRequest;
    }

    public static IDownloadTask create(DownloadRequest downloadRequest) {
        return new SynchronizeAvailableDirectorPath(downloadRequest);
    }

    @Override // com.mbridge.msdk.foundation.download.core.IDownloadTask
    public DownloadResponse run() {
        this.cacheDirectoryPathExternal = this.downloadRequest.getDirectoryPathExternal();
        String directoryPathInternal = this.downloadRequest.getDirectoryPathInternal();
        this.cacheDirectoryPathInternal = directoryPathInternal;
        if (TextUtils.isEmpty(directoryPathInternal)) {
            throw new RuntimeException("必须指定 cacheDirectoryPathInternal");
        }
        try {
            try {
                if (!TextUtils.isEmpty(this.cacheDirectoryPathExternal) && Build.VERSION.SDK_INT <= 28) {
                    GlobalComponent.getInstance().getContext();
                    this.cacheDirectoryPath = this.cacheDirectoryPathInternal;
                    this.cacheDirectorPathType = 0;
                } else {
                    this.cacheDirectoryPath = this.cacheDirectoryPathInternal;
                    this.cacheDirectorPathType = 0;
                }
                this.downloadRequest.setCacheDirectoryPath(this.cacheDirectoryPath);
                this.downloadRequest.setCacheDirectorPathType(this.cacheDirectorPathType);
                return null;
            } catch (Exception unused) {
                String str = this.cacheDirectoryPathInternal;
                this.cacheDirectoryPath = str;
                this.cacheDirectorPathType = 0;
                this.downloadRequest.setCacheDirectoryPath(str);
                this.downloadRequest.setCacheDirectorPathType(this.cacheDirectorPathType);
                return null;
            }
        } catch (Throwable th2) {
            this.downloadRequest.setCacheDirectoryPath(this.cacheDirectoryPath);
            this.downloadRequest.setCacheDirectorPathType(this.cacheDirectorPathType);
            throw th2;
        }
    }
}
