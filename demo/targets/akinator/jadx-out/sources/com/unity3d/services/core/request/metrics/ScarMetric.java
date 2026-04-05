package com.unity3d.services.core.request.metrics;

import a.b;
import b0.e2;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ScarMetric {
    private static final String ASYNC_PREFIX = "async";
    private static final String HB_SIGNALS_FETCH_FAILURE = "native_hb_signals_%s_fetch_failure";
    private static final String HB_SIGNALS_FETCH_START = "native_hb_signals_%s_fetch_start";
    private static final String HB_SIGNALS_FETCH_SUCCESS = "native_hb_signals_%s_fetch_success";
    private static final String HB_SIGNALS_UPLOAD_FAILURE = "native_hb_signals_%s_upload_failure";
    private static final String HB_SIGNALS_UPLOAD_START = "native_hb_signals_%s_upload_start";
    private static final String HB_SIGNALS_UPLOAD_SUCCESS = "native_hb_signals_%s_upload_success";
    private static final String REASON = "reason";
    private static final String SYNC_PREFIX = "sync";
    private static long _fetchStartTime;
    private static long _uploadStartTime;

    private static long getTotalFetchTime() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - _fetchStartTime);
    }

    private static long getTotalUploadTime() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - _uploadStartTime);
    }

    public static Metric hbSignalsFetchFailure(boolean z10, String str) {
        return new Metric(b.l("native_hb_signals_", z10 ? ASYNC_PREFIX : "sync", "_fetch_failure"), Long.valueOf(getTotalFetchTime()), e2.s("reason", str));
    }

    public static Metric hbSignalsFetchStart(boolean z10) {
        _fetchStartTime = System.nanoTime();
        return new Metric(b.l("native_hb_signals_", z10 ? ASYNC_PREFIX : "sync", "_fetch_start"), null);
    }

    public static Metric hbSignalsFetchSuccess(boolean z10) {
        return new Metric(b.l("native_hb_signals_", z10 ? ASYNC_PREFIX : "sync", "_fetch_success"), Long.valueOf(getTotalFetchTime()));
    }

    public static Metric hbSignalsUploadFailure(boolean z10, String str) {
        return new Metric(b.l("native_hb_signals_", z10 ? ASYNC_PREFIX : "sync", "_upload_failure"), Long.valueOf(getTotalUploadTime()), e2.s("reason", str));
    }

    public static Metric hbSignalsUploadStart(boolean z10) {
        _uploadStartTime = System.nanoTime();
        return new Metric(b.l("native_hb_signals_", z10 ? ASYNC_PREFIX : "sync", "_upload_start"), null);
    }

    public static Metric hbSignalsUploadSuccess(boolean z10) {
        return new Metric(b.l("native_hb_signals_", z10 ? ASYNC_PREFIX : "sync", "_upload_success"), Long.valueOf(getTotalUploadTime()));
    }
}
