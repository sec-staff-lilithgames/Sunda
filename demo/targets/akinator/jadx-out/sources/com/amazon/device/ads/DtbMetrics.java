package com.amazon.device.ads;

import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DtbMetric;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DtbMetrics implements Cloneable {
    public final String LOG_TAG = "DtbMetrics";
    public volatile Map<DtbMetric, Long> collectedMetrics = new EnumMap(DtbMetric.class);
    public volatile Map<DtbMetric, Long> tempTimer = new EnumMap(DtbMetric.class);
    public String instPxlUrl = null;

    public String getInstPxlUrl() {
        return this.instPxlUrl;
    }

    public int getMetricsCount() {
        return this.collectedMetrics.size();
    }

    public void incrementMetric(DtbMetric dtbMetric) {
        if (dtbMetric == null || dtbMetric.getMetricType() != DtbMetric.DtbMetricType.COUNTER) {
            throw new IllegalArgumentException("Either metric is null or metric type is not counter.");
        }
        if (this.collectedMetrics.get(dtbMetric) == null) {
            this.collectedMetrics.put(dtbMetric, 0L);
        }
        this.collectedMetrics.put(dtbMetric, Long.valueOf(this.collectedMetrics.get(dtbMetric).longValue() + 1));
    }

    public boolean isStarted(DtbMetric dtbMetric) {
        return this.tempTimer.containsKey(dtbMetric);
    }

    public void reset() {
        this.collectedMetrics.clear();
        this.tempTimer.clear();
    }

    public void resetMetric(DtbMetric dtbMetric) {
        try {
            this.collectedMetrics.remove(dtbMetric);
            this.tempTimer.remove(dtbMetric);
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to reset Metrics ", e10);
        }
    }

    public void setInstPxlUrl(String str) {
        int iIndexOf;
        if (str != null && (iIndexOf = str.indexOf("://")) != -1) {
            str = str.substring(iIndexOf + 3);
        }
        this.instPxlUrl = str;
    }

    public void startTimer(DtbMetric dtbMetric) {
        if (dtbMetric != null) {
            try {
                if (dtbMetric.getMetricType() == DtbMetric.DtbMetricType.TIMER) {
                    if (this.collectedMetrics.get(dtbMetric) == null) {
                        this.tempTimer.put(dtbMetric, Long.valueOf(System.currentTimeMillis()));
                        return;
                    }
                    throw new IllegalArgumentException(dtbMetric + " is already set, your operation is trying to override a value.");
                }
            } catch (Exception e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to Start timer ", e10);
                return;
            }
        }
        throw new IllegalArgumentException("Either metric is null or metric type is not timer.");
    }

    public void stopTimer(DtbMetric dtbMetric) {
        if (dtbMetric != null) {
            try {
                if (dtbMetric.getMetricType() != DtbMetric.DtbMetricType.COUNTER) {
                    if (this.tempTimer.get(dtbMetric) == null) {
                        throw new IllegalArgumentException("You are trying to stop a metric, which is not yet started: " + dtbMetric);
                    }
                    if (this.collectedMetrics.get(dtbMetric) == null) {
                        this.collectedMetrics.put(dtbMetric, Long.valueOf(System.currentTimeMillis() - this.tempTimer.get(dtbMetric).longValue()));
                        this.tempTimer.remove(dtbMetric);
                        return;
                    } else {
                        throw new IllegalArgumentException(dtbMetric + " is already set, your operation is trying to override a value.");
                    }
                }
            } catch (Exception e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to stop timer ", e10);
                return;
            }
        }
        throw new IllegalArgumentException("Either metric is null or metric type is not timer.");
    }

    public String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "dtbm");
            for (Map.Entry<DtbMetric, Long> entry : this.collectedMetrics.entrySet()) {
                jSONObject.put(entry.getKey().getAAXName(), entry.getValue());
            }
        } catch (JSONException e10) {
            DtbLog.debug("Error while adding values to JSON object: " + e10.getLocalizedMessage());
        }
        return jSONObject.toString();
    }

    public String toURLEncodedString() {
        return DtbCommonUtils.getURLEncodedString(toString());
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public DtbMetrics m204clone() {
        DtbMetrics dtbMetrics = new DtbMetrics();
        dtbMetrics.collectedMetrics.putAll(this.collectedMetrics);
        dtbMetrics.tempTimer.putAll(this.tempTimer);
        dtbMetrics.instPxlUrl = this.instPxlUrl;
        return dtbMetrics;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Submitter {
        public static final Submitter INSTANCE = new Submitter();
        public final String LOG_TAG = Submitter.class.getSimpleName();
        public final Queue<DtbMetrics> metricsQueue = new ConcurrentLinkedQueue();

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$submitMetrics$0() {
            DtbLog.debug("Starting metrics submission..");
            submitMetrics();
            DtbLog.debug("Metrics submission thread complete.");
        }

        public void submitMetrics(DtbMetrics dtbMetrics) {
            if (dtbMetrics.getMetricsCount() > 0) {
                this.metricsQueue.add(dtbMetrics.m204clone());
                dtbMetrics.reset();
                DtbLog.debug("Scheduling metrics submission in background thread.");
                DtbThreadService.getInstance().schedule(new l(this, 0));
                DtbLog.debug("Dispatched the metrics submit task on a background schedule thread.");
            }
        }

        private void submitMetrics() {
            Iterator<DtbMetrics> it = this.metricsQueue.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                DtbMetrics next = it.next();
                i10++;
                DtbLog.debug("Starting metrics submission - Sequence " + i10);
                if (next.getInstPxlUrl() == null) {
                    it.remove();
                    DtbLog.debug("No metric url found- Sequence " + i10 + ", skipping..");
                } else {
                    String str = next.getInstPxlUrl() + next.toURLEncodedString();
                    DtbLog.debug("Metrics URL:" + str);
                    try {
                        DtbHttpClient dtbHttpClient = new DtbHttpClient(str);
                        dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
                        dtbHttpClient.executeGET(DtbConstants.NETWORK_READ_TIMEOUT);
                        if (dtbHttpClient.isHttpStatusCodeOK()) {
                            DtbLog.debug("Metrics submitted- Sequence " + i10);
                            it.remove();
                        } else {
                            DtbLog.debug("Metrics submission failed- Sequence " + i10 + ", response invalid");
                            return;
                        }
                    } catch (Exception e10) {
                        StringBuilder sbT = o2.t(i10, "Metrics submission failed- Sequence ", ", encountered error:");
                        sbT.append(e10.toString());
                        DtbLog.debug(sbT.toString());
                        return;
                    }
                }
            }
        }
    }
}
