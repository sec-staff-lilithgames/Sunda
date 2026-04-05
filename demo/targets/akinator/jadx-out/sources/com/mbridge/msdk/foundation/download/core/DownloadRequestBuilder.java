package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.utils.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class DownloadRequestBuilder<T> implements RequestBuilder<T> {
    long connectTimeout;
    String directoryPathExternal;
    String directoryPathInternal;
    DownloadMessage<T> downloadMessage;
    DownloadPriority downloadPriority = DownloadPriority.MEDIUM;
    OnDownloadStateListener downloadStateListener;
    Map<String, String> extraMap;
    HashMap<String, List<String>> headerMap;
    OnProgressStateListener progressStateListener;
    long readTimeout;
    int retry;
    long timeout;
    String userAgent;
    long writeTimeout;

    public DownloadRequestBuilder(DownloadMessage<T> downloadMessage) {
        this.downloadMessage = downloadMessage;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequest<T> build() {
        return DownloadRequest.create(this);
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> with(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (Objects.isNull(this.extraMap)) {
                this.extraMap = new HashMap();
            }
            this.extraMap.put(str, str2);
        }
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withDirectoryPathExternal(String str) {
        this.directoryPathExternal = str;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withDirectoryPathInternal(String str) {
        this.directoryPathInternal = str;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withDownloadPriority(DownloadPriority downloadPriority) {
        this.downloadPriority = downloadPriority;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withDownloadStateListener(OnDownloadStateListener onDownloadStateListener) {
        this.downloadStateListener = onDownloadStateListener;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withProgressStateListener(OnProgressStateListener onProgressStateListener) {
        this.progressStateListener = onProgressStateListener;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withTimeout(long j10) {
        this.timeout = j10;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withWriteTimeout(long j10) {
        this.writeTimeout = j10;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withConnectTimeout(long j10) {
        this.connectTimeout = j10;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withHeader(String str, String str2) {
        if (this.headerMap == null) {
            this.headerMap = new HashMap<>(4);
        }
        List<String> arrayList = this.headerMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.headerMap.put(str, arrayList);
        }
        if (!arrayList.contains(str2)) {
            arrayList.add(str2);
        }
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withHttpRetryCounter(int i10) {
        this.retry = i10;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withReadTimeout(long j10) {
        this.readTimeout = j10;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withUserAgent(String str) {
        this.userAgent = str;
        return this;
    }
}
