package com.vungle.ads.internal.model;

import com.google.android.gms.internal.play_billing.a;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.util.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import tu.a0;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AdAsset {
    private final String adIdentifier;
    private long contentLength;
    private long fileSize;
    private final boolean isRequired;
    private final String localPath;
    private final Integer percentage;
    private Long rangeEnd;
    private long rangeStart;
    private final String serverPath;
    private Status status;
    private final Object waitLock;
    private final AtomicBoolean waitingForDownload;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum Status {
        NEW,
        DOWNLOAD_RUNNING,
        DOWNLOAD_FAILED,
        DOWNLOAD_SUCCESS,
        PROCESSED
    }

    public AdAsset(String adIdentifier, String serverPath, String localPath, boolean z10, Integer num) {
        e0.checkNotNullParameter(adIdentifier, "adIdentifier");
        e0.checkNotNullParameter(serverPath, "serverPath");
        e0.checkNotNullParameter(localPath, "localPath");
        this.adIdentifier = adIdentifier;
        this.serverPath = serverPath;
        this.localPath = localPath;
        this.isRequired = z10;
        this.percentage = num;
        this.status = Status.NEW;
        this.waitLock = new Object();
        this.waitingForDownload = new AtomicBoolean(false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !e0.areEqual(AdAsset.class, obj.getClass())) {
            return false;
        }
        AdAsset adAsset = (AdAsset) obj;
        if (this.status == adAsset.status && this.fileSize == adAsset.fileSize && this.isRequired == adAsset.isRequired && e0.areEqual(this.adIdentifier, adAsset.adIdentifier) && e0.areEqual(this.serverPath, adAsset.serverPath) && this.contentLength == adAsset.contentLength && e0.areEqual(this.percentage, adAsset.percentage)) {
            return e0.areEqual(this.localPath, adAsset.localPath);
        }
        return false;
    }

    public final String getAdIdentifier() {
        return this.adIdentifier;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final Integer getPercentage() {
        return this.percentage;
    }

    public final Long getRangeEnd() {
        return this.rangeEnd;
    }

    public final long getRangeStart() {
        return this.rangeStart;
    }

    public final String getServerPath() {
        return this.serverPath;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = (this.status.hashCode() + o2.e(o2.e(this.adIdentifier.hashCode() * 31, 31, this.serverPath), 31, this.localPath)) * 31;
        long j10 = this.fileSize;
        int iC = a.c((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31, this.isRequired);
        long j11 = this.contentLength;
        int i10 = (iC + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        Integer num = this.percentage;
        return i10 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isHtmlTemplate() {
        return e0.areEqual(this.adIdentifier, AdPayload.KEY_VM);
    }

    public final boolean isMainVideo() {
        return e0.areEqual(this.adIdentifier, Constants.KEY_MAIN_VIDEO);
    }

    public final boolean isPrivacyIcon() {
        return e0.areEqual(this.adIdentifier, "VUNGLE_PRIVACY_ICON_URL");
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public final boolean isWaitingForDownload() {
        return this.waitingForDownload.get();
    }

    public final void notifyDownloadEnough() {
        if (this.waitingForDownload.getAndSet(false)) {
            synchronized (this.waitLock) {
                this.waitLock.notifyAll();
            }
        }
    }

    public final void setContentLength(long j10) {
        this.contentLength = j10;
    }

    public final void setFileSize(long j10) {
        this.fileSize = j10;
    }

    public final void setRangeEnd(Long l9) {
        this.rangeEnd = l9;
    }

    public final void setRangeStart(long j10) {
        this.rangeStart = j10;
    }

    public final void setStatus(Status status) {
        e0.checkNotNullParameter(status, "<set-?>");
        this.status = status;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdAsset(adIdentifier=");
        sb2.append(this.adIdentifier);
        sb2.append(", serverPath=");
        sb2.append(this.serverPath);
        sb2.append(", localPath=");
        sb2.append(this.localPath);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", fileSize=");
        sb2.append(this.fileSize);
        sb2.append(", contentLength=");
        sb2.append(this.contentLength);
        sb2.append(", isRequired=");
        sb2.append(this.isRequired);
        sb2.append(", percentage=");
        return a.j(sb2, this.percentage, ')');
    }

    public final void waitForDownload() {
        Object objM7131constructorimpl;
        this.waitingForDownload.set(true);
        synchronized (this.waitLock) {
            try {
                int i10 = z.f87419c;
                this.waitLock.wait();
                objM7131constructorimpl = z.m7131constructorimpl(x0.f87415a);
            } catch (Throwable th2) {
                int i11 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
            }
            Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(objM7131constructorimpl);
            if (thM7134exceptionOrNullimpl != null) {
                Logger.Companion.e("AdAsset", "Interrupted while waiting for file download: " + this, thM7134exceptionOrNullimpl);
            }
        }
    }

    public /* synthetic */ AdAsset(String str, String str2, String str3, boolean z10, Integer num, int i10, u uVar) {
        this(str, str2, str3, z10, (i10 & 16) != 0 ? null : num);
    }
}
