package com.amazon.aps.ads.model;

import com.fyber.inneractive.sdk.external.NativeAdContent;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'GOOGLE_AD_MANAGER' uses external variables
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
/* loaded from: classes4.dex */
public final class ApsAdNetwork {
    private static final /* synthetic */ ApsAdNetwork[] $VALUES;
    public static final ApsAdNetwork ADMOB;
    public static final ApsAdNetwork AD_GENERATION;
    public static final ApsAdNetwork CUSTOM_MEDIATION;
    public static final ApsAdNetwork GOOGLE_AD_MANAGER;
    public static final ApsAdNetwork MAX;
    public static final ApsAdNetwork NIMBUS;
    public static final ApsAdNetwork OTHER;
    public static final ApsAdNetwork UNITY_LEVELPLAY;
    public static final ApsAdNetwork UNKNOWN;
    ApsAdNetworkType networkType;

    private static /* synthetic */ ApsAdNetwork[] $values() {
        return new ApsAdNetwork[]{GOOGLE_AD_MANAGER, ADMOB, AD_GENERATION, UNITY_LEVELPLAY, MAX, NIMBUS, OTHER, CUSTOM_MEDIATION, UNKNOWN};
    }

    static {
        ApsAdNetworkType apsAdNetworkType = ApsAdNetworkType.ADSERVER;
        GOOGLE_AD_MANAGER = new ApsAdNetwork("GOOGLE_AD_MANAGER", 0, apsAdNetworkType);
        ApsAdNetworkType apsAdNetworkType2 = ApsAdNetworkType.MEDIATION;
        ADMOB = new ApsAdNetwork("ADMOB", 1, apsAdNetworkType2);
        AD_GENERATION = new ApsAdNetwork("AD_GENERATION", 2, apsAdNetworkType);
        UNITY_LEVELPLAY = new ApsAdNetwork("UNITY_LEVELPLAY", 3, apsAdNetworkType2);
        MAX = new ApsAdNetwork("MAX", 4, apsAdNetworkType2);
        NIMBUS = new ApsAdNetwork("NIMBUS", 5, apsAdNetworkType);
        OTHER = new ApsAdNetwork(NativeAdContent.ViewTag.OTHER, 6, ApsAdNetworkType.OTHER);
        CUSTOM_MEDIATION = new ApsAdNetwork("CUSTOM_MEDIATION", 7, apsAdNetworkType2);
        UNKNOWN = new ApsAdNetwork("UNKNOWN", 8, ApsAdNetworkType.UNKNOWN);
        $VALUES = $values();
    }

    private ApsAdNetwork(String str, int i10, ApsAdNetworkType apsAdNetworkType) {
        this.networkType = apsAdNetworkType;
    }

    public static ApsAdNetwork valueOf(String str) {
        return (ApsAdNetwork) Enum.valueOf(ApsAdNetwork.class, str);
    }

    public static ApsAdNetwork[] values() {
        return (ApsAdNetwork[]) $VALUES.clone();
    }

    public boolean isMediation() {
        return this.networkType.equals(ApsAdNetworkType.MEDIATION);
    }
}
