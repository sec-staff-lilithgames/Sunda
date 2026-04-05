package com.mbridge.msdk.foundation.download;

import com.mbridge.msdk.foundation.download.utils.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class DownloadResponse {
    private static final String UN_KNOWN = "unknown";
    private DownloadError _error;
    private boolean _isCancelled;
    private boolean _isSuccessful;
    private int from = 0;
    private boolean isFailed;
    private boolean isResponseStart;
    private boolean isTimeout;

    public DownloadError getError() {
        return this._error;
    }

    public String getErrorMessage() {
        return (Objects.isNull(getError()) || Objects.isNull(getError().getException())) ? "unknown" : getError().getException().getMessage();
    }

    public int getFrom() {
        return this.from;
    }

    public boolean isCancelled() {
        return this._isCancelled;
    }

    public boolean isFailed() {
        return this.isFailed;
    }

    public boolean isResponseStart() {
        return this.isResponseStart;
    }

    public boolean isSuccessful() {
        return this._isSuccessful;
    }

    public boolean isTimeout() {
        return this.isTimeout;
    }

    public void setCancelled(boolean z10) {
        this._isCancelled = z10;
    }

    public void setError(DownloadError downloadError) {
        this._error = downloadError;
        setSuccessful(false);
    }

    public void setFailed(boolean z10) {
        this.isFailed = z10;
    }

    public void setFrom(int i10) {
        this.from = i10;
    }

    public void setResponseStart(boolean z10) {
        this.isResponseStart = z10;
    }

    public void setSuccessful(boolean z10) {
        this._isSuccessful = z10;
    }

    public void setTimeout(boolean z10) {
        this.isTimeout = z10;
    }

    public void setError(Exception exc) {
        setError(new DownloadError(exc));
    }
}
