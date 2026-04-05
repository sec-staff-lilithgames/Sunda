package com.amazon.device.ads;

import com.ironsource.C3191e4;
import com.ironsource.Q6;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AAX_BID_TIME' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class DtbMetric {
    public static final /* synthetic */ DtbMetric[] $VALUES;
    public static final DtbMetric AAX_BID_TIME;
    public static final DtbMetric AAX_NETWORK_FAILURE;
    public static final DtbMetric AAX_PUNTED;
    public static final DtbMetric ADSERVER_ADLOAD_FAILURE;
    public static final DtbMetric BANNER_ADSERVER_TIME;
    public static final DtbMetric BANNER_TOTAL_LOAD_TIME;
    public static final DtbMetric CONFIG_DOWNLOAD_LATENCY;
    public static final DtbMetric INTERSTITIAL_ADSERVER_TIME;
    public static final DtbMetric INTERSTITIAL_TOTAL_LOAD_TIME;
    public static final DtbMetric SIS_COUNTER_IDENTIFIED_DEVICE_CHANGED;
    public static final DtbMetric SIS_LATENCY_REGISTER_EVENT;
    public static final DtbMetric SIS_LATENCY_UPDATE_DEVICE_INFO;
    public final String aaxName3g;
    public final String aaxNameWifi;
    public final DtbMetricType metricType;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum DtbMetricType {
        COUNTER,
        TIMER
    }

    public static /* synthetic */ DtbMetric[] $values() {
        return new DtbMetric[]{AAX_BID_TIME, AAX_PUNTED, AAX_NETWORK_FAILURE, BANNER_ADSERVER_TIME, INTERSTITIAL_ADSERVER_TIME, ADSERVER_ADLOAD_FAILURE, BANNER_TOTAL_LOAD_TIME, INTERSTITIAL_TOTAL_LOAD_TIME, CONFIG_DOWNLOAD_LATENCY, SIS_LATENCY_UPDATE_DEVICE_INFO, SIS_COUNTER_IDENTIFIED_DEVICE_CHANGED, SIS_LATENCY_REGISTER_EVENT};
    }

    static {
        DtbMetricType dtbMetricType = DtbMetricType.TIMER;
        AAX_BID_TIME = new DtbMetric("AAX_BID_TIME", 0, "dabtw", "dabt3", dtbMetricType);
        DtbMetricType dtbMetricType2 = DtbMetricType.COUNTER;
        AAX_PUNTED = new DtbMetric("AAX_PUNTED", 1, "dapw", "dap3", dtbMetricType2);
        AAX_NETWORK_FAILURE = new DtbMetric("AAX_NETWORK_FAILURE", 2, "danfw", "danf3", dtbMetricType2);
        BANNER_ADSERVER_TIME = new DtbMetric("BANNER_ADSERVER_TIME", 3, "dbastw", "dbast3", dtbMetricType);
        INTERSTITIAL_ADSERVER_TIME = new DtbMetric("INTERSTITIAL_ADSERVER_TIME", 4, "diastw", "diast3", dtbMetricType);
        ADSERVER_ADLOAD_FAILURE = new DtbMetric("ADSERVER_ADLOAD_FAILURE", 5, "dasfw", "dasf3", dtbMetricType2);
        BANNER_TOTAL_LOAD_TIME = new DtbMetric("BANNER_TOTAL_LOAD_TIME", 6, "dbtltw", "dbtlt3", dtbMetricType);
        INTERSTITIAL_TOTAL_LOAD_TIME = new DtbMetric("INTERSTITIAL_TOTAL_LOAD_TIME", 7, "ditltw", "ditlt3", dtbMetricType);
        CONFIG_DOWNLOAD_LATENCY = new DtbMetric("CONFIG_DOWNLOAD_LATENCY", 8, "acl", "acl", dtbMetricType);
        SIS_LATENCY_UPDATE_DEVICE_INFO = new DtbMetric("SIS_LATENCY_UPDATE_DEVICE_INFO", 9, "sul", "sul", dtbMetricType);
        SIS_COUNTER_IDENTIFIED_DEVICE_CHANGED = new DtbMetric("SIS_COUNTER_IDENTIFIED_DEVICE_CHANGED", 10, Q6.f35250c1, Q6.f35250c1, dtbMetricType2);
        SIS_LATENCY_REGISTER_EVENT = new DtbMetric("SIS_LATENCY_REGISTER_EVENT", 11, "srel", "srel", dtbMetricType);
        $VALUES = $values();
    }

    public DtbMetric(String str, int i10, String str2, String str3, DtbMetricType dtbMetricType) {
        this.aaxNameWifi = str2;
        this.aaxName3g = str3;
        this.metricType = dtbMetricType;
    }

    public static DtbMetric valueOf(String str) {
        return (DtbMetric) Enum.valueOf(DtbMetric.class, str);
    }

    public static DtbMetric[] values() {
        return (DtbMetric[]) $VALUES.clone();
    }

    public String getAAXName() {
        return DtbNetworkState.INSTANCE.isWifiConnection() ? this.aaxNameWifi : this.aaxName3g;
    }

    public DtbMetricType getMetricType() {
        return this.metricType;
    }

    @Override // java.lang.Enum
    public String toString() {
        return C3191e4.i.f36529d + getAAXName() + ", " + getMetricType() + C3191e4.i.f36531e;
    }
}
