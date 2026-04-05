package com.mbridge.msdk.foundation.download;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface OnDownloadStateListener<T> {
    void onCancelDownload(DownloadMessage<T> downloadMessage);

    void onDownloadComplete(DownloadMessage<T> downloadMessage);

    void onDownloadError(DownloadMessage<T> downloadMessage, DownloadError downloadError);

    void onDownloadStart(DownloadMessage<T> downloadMessage);
}
