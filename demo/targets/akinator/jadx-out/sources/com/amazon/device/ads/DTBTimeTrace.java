package com.amazon.device.ads;

import ao.kwoC.zAQQWzBxnS;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DTBTimeTrace {
    public static final String LOG_TAG = "DTBTimeTrace";
    public static final String SERVERLESS_METRICS_TAG = "ServerlessMetrics";
    public static final String TIMETRACE_AD_DISPLAY_FAILED = "AD display failed";
    public static final String TIMETRACE_AD_DISPLAY_SUCCEEDED = "AD displayed";
    public static final String TIMETRACE_AD_LOADED = "AD loaded";
    public static final String TIMETRACE_AD_LOAD_FAILED = "AD load failed";
    public static final String TIMETRACE_AD_REQUESTED = "Request Ad";
    public static final String TIMETRACE_BID_FAILED = "Bid failed";
    public static final String TIMETRACE_BID_START = "Bid requested";
    public static final String TIMETRACE_BID_SUCCEEDED = "Bid succeeded";
    public static final String TIMETRACE_CUSTOM_EVENT_ACCEPTED = "Custom event accepted";
    public static final String TIMETRACE_CUSTOM_EVENT_IGNORED = "Custom event ignored";
    public static DTBTimeTrace theTrace;
    public boolean isStarted = false;
    public ArrayList<DTBTimeTracePhase> records = new ArrayList<>();
    public Date startDate;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class DTBTimeTracePhase {
        public Date date = new Date();
        public String label;

        public DTBTimeTracePhase(String str) {
            this.label = str;
        }
    }

    public static DTBTimeTrace getInstance() {
        try {
            if (theTrace == null) {
                theTrace = new DTBTimeTrace();
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to initialize DTBTimeTrace class");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to initialize DTBTimeTrace class", e10);
        }
        return theTrace;
    }

    public void addPhase(String str) {
        try {
            if (this.isStarted) {
                this.records.add(new DTBTimeTracePhase(str));
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute addPhase method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute addPhase method", e10);
        }
    }

    public void start() {
        try {
            if (AdRegistration.isTestMode()) {
                this.isStarted = true;
                this.startDate = new Date();
                this.records.clear();
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute start method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute start method", e10);
        }
    }

    public void stop() {
        try {
            this.isStarted = false;
            this.records.clear();
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute stop method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute stop method", e10);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        try {
            Date date = this.startDate;
            if (date != null) {
                Iterator<DTBTimeTracePhase> it = this.records.iterator();
                while (it.hasNext()) {
                    DTBTimeTracePhase next = it.next();
                    sb2.append(next.label);
                    sb2.append("-> ");
                    sb2.append(next.date.getTime() - date.getTime());
                    sb2.append("\n");
                    date = next.date;
                }
                sb2.append("Total Time:");
                sb2.append(date.getTime() - this.startDate.getTime());
                sb2.append("\n");
            }
            start();
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute toString method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute toString method", e10);
        }
        return sb2.toString();
    }

    public void logTrace() {
        try {
            if (AdRegistration.isTestMode()) {
                DtbLog.debug(SERVERLESS_METRICS_TAG, getInstance().toString());
            }
        } catch (RuntimeException e10) {
            String str = LOG_TAG;
            String str2 = zAQQWzBxnS.rIYIbeKvGuoO;
            DtbLog.error(str, str2);
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, str2, e10);
        }
    }
}
