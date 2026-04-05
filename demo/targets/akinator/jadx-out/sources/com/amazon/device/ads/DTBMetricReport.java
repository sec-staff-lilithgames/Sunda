package com.amazon.device.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DTBMetricReport {
    public static final String ADAPTER_VERSION = "adapter_version";
    public static final String ADSERVER = "mediation";
    public static final String APP_NAME = "app_id";
    public static final String CONNECTION = "connection";
    public static final String LATENCY = "latency";
    public static final String LOG_TAG = "DTBMetricReport";
    public static final String PROJECT = "project";
    public static final String PROJECT_NAME = "aps_mobile";
    public static final String SDK = "sdk";
    public static final String TIME = "time";
    public static final String TYPE = "type";
    public BidWrapper bidWrapper;
    public int latency;
    public JSONObject propertiesMap;
    public String type;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class BidWrapper {
        public String bidId;
        public String hostname;

        public BidWrapper(String str, String str2) {
            this.bidId = str;
            this.hostname = str2;
        }
    }

    public DTBMetricReport(String str, BidWrapper bidWrapper, int i10) throws JSONException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        this.bidWrapper = bidWrapper;
        this.latency = i10;
        setStandardProperties(str);
    }

    public static BidWrapper addBid(String str, String str2) {
        return new BidWrapper(str, str2);
    }

    private void addExtraProperties(Map<String, Object> map) throws JSONException {
        try {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (obj instanceof String) {
                    this.propertiesMap.put(str, obj);
                } else if (obj instanceof Integer) {
                    this.propertiesMap.put(str, obj);
                } else if (obj instanceof Long) {
                    this.propertiesMap.put(str, obj);
                } else if (obj instanceof Boolean) {
                    this.propertiesMap.put(str, obj);
                }
            }
        } catch (JSONException e10) {
            DtbLog.error(LOG_TAG, "Invalid JSON conversion:" + e10.getMessage());
        }
    }

    public static DTBMetricReport reportWithBidIdAndType(BidWrapper bidWrapper, String str) {
        return new DTBMetricReport(str, bidWrapper);
    }

    public static DTBMetricReport reportWithBidTypeLatency(BidWrapper bidWrapper, String str, int i10) {
        return new DTBMetricReport(str, bidWrapper, i10);
    }

    public static DTBMetricReport reportWithTypeAndExtraProperties(String str, Map<String, Object> map) {
        return new DTBMetricReport(str, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[Catch: JSONException -> 0x0039, TRY_ENTER, TryCatch #1 {JSONException -> 0x0039, blocks: (B:3:0x000b, B:5:0x0031, B:21:0x006f, B:22:0x0076, B:29:0x0095, B:31:0x009e, B:32:0x00a5, B:25:0x0088), top: B:40:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[Catch: JSONException -> 0x0039, TryCatch #1 {JSONException -> 0x0039, blocks: (B:3:0x000b, B:5:0x0031, B:21:0x006f, B:22:0x0076, B:29:0x0095, B:31:0x009e, B:32:0x00a5, B:25:0x0088), top: B:40:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e A[Catch: JSONException -> 0x0039, TryCatch #1 {JSONException -> 0x0039, blocks: (B:3:0x000b, B:5:0x0031, B:21:0x006f, B:22:0x0076, B:29:0x0095, B:31:0x009e, B:32:0x00a5, B:25:0x0088), top: B:40:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setStandardProperties(java.lang.String r6) throws org.json.JSONException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r5 = this;
            java.lang.String r0 = "getVersion"
            r5.type = r6
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r5.propertiesMap = r1
            java.lang.String r2 = "type"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L39
            org.json.JSONObject r6 = r5.propertiesMap     // Catch: org.json.JSONException -> L39
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "11.1.0"
            r6.put(r1, r2)     // Catch: org.json.JSONException -> L39
            org.json.JSONObject r6 = r5.propertiesMap     // Catch: org.json.JSONException -> L39
            java.lang.String r1 = "app_id"
            java.lang.String r2 = com.amazon.device.ads.AdRegistration.getAppKey()     // Catch: org.json.JSONException -> L39
            r6.put(r1, r2)     // Catch: org.json.JSONException -> L39
            org.json.JSONObject r6 = r5.propertiesMap     // Catch: org.json.JSONException -> L39
            java.lang.String r1 = "project"
            java.lang.String r2 = "aps_mobile"
            r6.put(r1, r2)     // Catch: org.json.JSONException -> L39
            int r6 = r5.latency     // Catch: org.json.JSONException -> L39
            if (r6 <= 0) goto L3c
            org.json.JSONObject r1 = r5.propertiesMap     // Catch: org.json.JSONException -> L39
            java.lang.String r2 = "latency"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L39
            goto L3c
        L39:
            r6 = move-exception
            goto Lb9
        L3c:
            r6 = 0
            java.lang.String r1 = "com.amazon.admob_adapter.APSAdMobAdapter"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L55
            java.lang.String r2 = "admob"
            java.lang.reflect.Method r1 = r1.getMethod(r0, r6)     // Catch: java.lang.Exception -> L56
            java.lang.Object r1 = r1.invoke(r6, r6)     // Catch: java.lang.Exception -> L56
            boolean r3 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L56
            if (r3 == 0) goto L6d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L56
            r6 = r1
            goto L6d
        L55:
            r2 = r6
        L56:
            java.lang.String r1 = "com.amazon.mopub_adapter.APSMopubAdapter"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L6d
            java.lang.String r2 = "mopub"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r6)     // Catch: java.lang.Exception -> L6d
            java.lang.Object r0 = r0.invoke(r6, r6)     // Catch: java.lang.Exception -> L6d
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Exception -> L6d
            if (r1 == 0) goto L6d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L6d
            r6 = r0
        L6d:
            if (r2 == 0) goto L76
            org.json.JSONObject r0 = r5.propertiesMap     // Catch: org.json.JSONException -> L39
            java.lang.String r1 = "mediation"
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L39
        L76:
            com.amazon.device.ads.DtbDeviceData.getDeviceDataInstance()     // Catch: org.json.JSONException -> L39
            java.lang.String r0 = com.amazon.device.ads.DtbDeviceData.getConnectionType()     // Catch: org.json.JSONException -> L39
            java.lang.String r1 = "Wifi"
            boolean r1 = r0.equals(r1)     // Catch: org.json.JSONException -> L39
            if (r1 == 0) goto L88
            java.lang.String r0 = "wifi"
            goto L95
        L88:
            java.lang.String r1 = "0"
            boolean r0 = r0.equals(r1)     // Catch: org.json.JSONException -> L39
            if (r0 == 0) goto L93
            java.lang.String r0 = "unknown"
            goto L95
        L93:
            java.lang.String r0 = "cellular"
        L95:
            org.json.JSONObject r1 = r5.propertiesMap     // Catch: org.json.JSONException -> L39
            java.lang.String r2 = "connection"
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L39
            if (r6 == 0) goto La5
            org.json.JSONObject r0 = r5.propertiesMap     // Catch: org.json.JSONException -> L39
            java.lang.String r1 = "adapter_version"
            r0.put(r1, r6)     // Catch: org.json.JSONException -> L39
        La5:
            org.json.JSONObject r6 = r5.propertiesMap     // Catch: org.json.JSONException -> L39
            java.lang.String r0 = "time"
            java.util.Date r1 = new java.util.Date     // Catch: org.json.JSONException -> L39
            r1.<init>()     // Catch: org.json.JSONException -> L39
            long r1 = r1.getTime()     // Catch: org.json.JSONException -> L39
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            r6.put(r0, r1)     // Catch: org.json.JSONException -> L39
            goto Ld0
        Lb9:
            java.lang.String r0 = com.amazon.device.ads.DTBMetricReport.LOG_TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "JSON conversion error:"
            r1.<init>(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.amazon.device.ads.DtbLog.warn(r0, r6)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBMetricReport.setStandardProperties(java.lang.String):void");
    }

    public String getBidId() {
        BidWrapper bidWrapper = this.bidWrapper;
        if (bidWrapper == null) {
            return null;
        }
        return bidWrapper.bidId;
    }

    public String getHostname() {
        BidWrapper bidWrapper = this.bidWrapper;
        if (bidWrapper == null) {
            return null;
        }
        return bidWrapper.hostname;
    }

    public String getType() {
        return this.type;
    }

    public String toEncodedString() throws UnsupportedEncodingException {
        return URLEncoder.encode(this.propertiesMap.toString(), C.UTF8_NAME);
    }

    public String toString() {
        return this.propertiesMap.toString();
    }

    public static DTBMetricReport reportWithTypeAndExtraProperties(String str, Map<String, Object> map, BidWrapper bidWrapper) {
        return new DTBMetricReport(str, map, bidWrapper);
    }

    public DTBMetricReport(String str, BidWrapper bidWrapper) throws JSONException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        this.latency = -1;
        this.bidWrapper = bidWrapper;
        setStandardProperties(str);
    }

    public DTBMetricReport(String str, Map<String, Object> map) throws JSONException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        this.latency = -1;
        setStandardProperties(str);
        addExtraProperties(map);
    }

    public DTBMetricReport(String str, Map<String, Object> map, BidWrapper bidWrapper) {
        this(str, map);
        this.bidWrapper = bidWrapper;
    }
}
