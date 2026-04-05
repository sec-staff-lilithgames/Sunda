package com.amazon.aps.ads.util;

import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsAdExtensionsKt {
    public static final void d(Object obj, String message) {
        e0.checkNotNullParameter(obj, "<this>");
        e0.checkNotNullParameter(message, "message");
        ApsLog.d(getTAG(obj), message);
    }

    public static final void e(Object obj, String message) {
        e0.checkNotNullParameter(obj, "<this>");
        e0.checkNotNullParameter(message, "message");
        ApsLog.d(getTAG(obj), message);
    }

    public static final String getTAG(Object obj) {
        e0.checkNotNullParameter(obj, "<this>");
        String simpleName = obj.getClass().getSimpleName();
        e0.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public static final void i(Object obj, String message) {
        e0.checkNotNullParameter(obj, "<this>");
        e0.checkNotNullParameter(message, "message");
        ApsLog.d(getTAG(obj), message);
    }

    public static final void logEvent(Object obj, APSEventSeverity aPSEventSeverity, APSEventType aPSEventType, String str, Exception exc) {
        e0.checkNotNullParameter(obj, "<this>");
        APSAnalytics.logEvent(aPSEventSeverity, aPSEventType, str, exc);
    }

    public static final void remoteLog(Object obj, APSEventSeverity aPSEventSeverity, APSEventType aPSEventType, String str, Exception exc) {
        e0.checkNotNullParameter(obj, "<this>");
        APSAnalytics.logEvent(aPSEventSeverity, aPSEventType, str, exc);
    }

    public static final void logEvent(Object obj, APSEventSeverity aPSEventSeverity, APSEventType aPSEventType, String str) {
        e0.checkNotNullParameter(obj, "<this>");
        APSAnalytics.logEvent(aPSEventSeverity, aPSEventType, str);
    }
}
