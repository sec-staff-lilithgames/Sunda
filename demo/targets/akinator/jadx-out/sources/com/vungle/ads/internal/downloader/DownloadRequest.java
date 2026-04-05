package com.vungle.ads.internal.downloader;

import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.LogEntry;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DownloadRequest {
    private final AdAsset asset;
    private final AtomicBoolean cancelled;
    private TimeIntervalMetric downloadTemplateDuration;
    private final LogEntry logEntry;
    private TimeIntervalMetric partialDownloadDurationMetric;
    private final Priority priority;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum Priority {
        CRITICAL(-2147483647),
        HIGHEST(0),
        HIGH(1),
        LOWEST(Integer.MAX_VALUE);

        private final int priority;

        Priority(int i10) {
            this.priority = i10;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    public DownloadRequest(Priority priority, AdAsset asset, LogEntry logEntry) {
        e0.checkNotNullParameter(priority, "priority");
        e0.checkNotNullParameter(asset, "asset");
        this.priority = priority;
        this.asset = asset;
        this.logEntry = logEntry;
        this.cancelled = new AtomicBoolean(false);
    }

    public final void cancel() {
        this.cancelled.set(true);
    }

    public final AdAsset getAsset() {
        return this.asset;
    }

    public final LogEntry getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    /* renamed from: getPriority, reason: collision with other method in class */
    public final Priority m3604getPriority() {
        return this.priority;
    }

    public final boolean isCancelled() {
        return this.cancelled.get();
    }

    public final void startPartialDownloadRecord() {
        TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.ASSET_PARTIAL_DOWNLOAD_DURATION_MS);
        this.partialDownloadDurationMetric = timeIntervalMetric;
        timeIntervalMetric.markStart();
    }

    public final void startTemplateRecord() {
        TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.TEMPLATE_DOWNLOAD_DURATION_MS);
        this.downloadTemplateDuration = timeIntervalMetric;
        timeIntervalMetric.markStart();
    }

    public final void stopPartialDownloadRecord() throws Throwable {
        TimeIntervalMetric timeIntervalMetric = this.partialDownloadDurationMetric;
        if (timeIntervalMetric != null) {
            timeIntervalMetric.markEnd();
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(timeIntervalMetric, this.logEntry, "percentage=" + this.asset.getPercentage() + " url=" + this.asset.getServerPath());
        }
    }

    public final void stopTemplateRecord() throws Throwable {
        TimeIntervalMetric timeIntervalMetric = this.downloadTemplateDuration;
        if (timeIntervalMetric != null) {
            timeIntervalMetric.markEnd();
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(timeIntervalMetric, this.logEntry, this.asset.getServerPath());
        }
    }

    public String toString() {
        return "DownloadRequest{, priority=" + this.priority + ", url='" + this.asset.getServerPath() + "', path='" + this.asset.getLocalPath() + "', cancelled=" + this.cancelled + ", logEntry=" + this.logEntry + AbstractJsonLexerKt.END_OBJ;
    }

    public final int getPriority() {
        return this.priority.getPriority();
    }

    public /* synthetic */ DownloadRequest(Priority priority, AdAsset adAsset, LogEntry logEntry, int i10, u uVar) {
        this(priority, adAsset, (i10 & 4) != 0 ? null : logEntry);
    }
}
