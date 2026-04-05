package com.amazon.device.ads;

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
/* loaded from: classes2.dex */
public final class DTBAdNetwork {
    public static final /* synthetic */ DTBAdNetwork[] $VALUES;
    public static final DTBAdNetwork ADMOB;
    public static final DTBAdNetwork AD_GENERATION;
    public static final DTBAdNetwork CUSTOM_MEDIATION;
    public static final DTBAdNetwork GOOGLE_AD_MANAGER;
    public static final DTBAdNetwork MAX;
    public static final DTBAdNetwork NIMBUS;
    public static final DTBAdNetwork OTHER;
    public static final DTBAdNetwork UNITY_LEVELPLAY;
    public static final DTBAdNetwork UNKNOWN;
    public NetworkType networkType;

    public static /* synthetic */ DTBAdNetwork[] $values() {
        return new DTBAdNetwork[]{GOOGLE_AD_MANAGER, ADMOB, AD_GENERATION, UNITY_LEVELPLAY, MAX, NIMBUS, OTHER, CUSTOM_MEDIATION, UNKNOWN};
    }

    static {
        NetworkType networkType = NetworkType.ADSERVER;
        GOOGLE_AD_MANAGER = new DTBAdNetwork("GOOGLE_AD_MANAGER", 0, networkType);
        NetworkType networkType2 = NetworkType.MEDIATION;
        ADMOB = new DTBAdNetwork("ADMOB", 1, networkType2);
        AD_GENERATION = new DTBAdNetwork("AD_GENERATION", 2, networkType);
        UNITY_LEVELPLAY = new DTBAdNetwork("UNITY_LEVELPLAY", 3, networkType2);
        MAX = new DTBAdNetwork("MAX", 4, networkType2);
        NIMBUS = new DTBAdNetwork("NIMBUS", 5, networkType);
        OTHER = new DTBAdNetwork(NativeAdContent.ViewTag.OTHER, 6, NetworkType.OTHER);
        CUSTOM_MEDIATION = new DTBAdNetwork("CUSTOM_MEDIATION", 7, networkType2);
        UNKNOWN = new DTBAdNetwork("UNKNOWN", 8, NetworkType.UNKNOWN);
        $VALUES = $values();
    }

    public DTBAdNetwork(String str, int i10, NetworkType networkType) {
        this.networkType = networkType;
    }

    public static DTBAdNetwork valueOf(String str) {
        return (DTBAdNetwork) Enum.valueOf(DTBAdNetwork.class, str);
    }

    public static DTBAdNetwork[] values() {
        return (DTBAdNetwork[]) $VALUES.clone();
    }

    public boolean isMediation() {
        return this.networkType.equals(NetworkType.MEDIATION);
    }
}
