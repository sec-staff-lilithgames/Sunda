package io.bidmachine.analytics.internal;

import io.bidmachine.analytics.internal.q0;
import io.bidmachine.protobuf.sdk.ErrorReasonAnalytics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class Z {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59996a;

        static {
            int[] iArr = new int[q0.a.values().length];
            try {
                iArr[q0.a.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q0.a.MONITOR_INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q0.a.MONITOR_NO_CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q0.a.MONITOR_BAD_CONTENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q0.a.READER_INVALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q0.a.READER_NO_CONTENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[q0.a.READER_BAD_CONTENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[q0.a.READER_NO_ACCESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f59996a = iArr;
        }
    }

    public static final ErrorReasonAnalytics a(q0.a aVar) {
        switch (a.f59996a[aVar.ordinal()]) {
            case 1:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_INVALID;
            case 2:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_MONITOR_UNDEFINED;
            case 3:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT;
            case 4:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT;
            case 5:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_UNDEFINED;
            case 6:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_NO_CONTENT;
            case 7:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_BAD_CONTENT;
            case 8:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_NO_ACCESS;
            default:
                throw new tu.t();
        }
    }
}
