package com.moloco.sdk.publisher;

import com.ironsource.mediationsdk.l;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import sv.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AdFormatType {
    private static final /* synthetic */ cv.a $ENTRIES;
    private static final /* synthetic */ AdFormatType[] $VALUES;
    public static final AdFormatType BANNER = new AdFormatType(l.f37554a, 0);
    public static final AdFormatType INTERSTITIAL = new AdFormatType("INTERSTITIAL", 1);
    public static final AdFormatType REWARDED = new AdFormatType("REWARDED", 2);
    public static final AdFormatType MREC = new AdFormatType("MREC", 3);
    public static final AdFormatType NATIVE = new AdFormatType("NATIVE", 4);

    private static final /* synthetic */ AdFormatType[] $values() {
        return new AdFormatType[]{BANNER, INTERSTITIAL, REWARDED, MREC, NATIVE};
    }

    static {
        AdFormatType[] adFormatTypeArr$values = $values();
        $VALUES = adFormatTypeArr$values;
        $ENTRIES = cv.b.enumEntries(adFormatTypeArr$values);
    }

    private AdFormatType(String str, int i10) {
    }

    public static cv.a getEntries() {
        return $ENTRIES;
    }

    public static AdFormatType valueOf(String str) {
        return (AdFormatType) Enum.valueOf(AdFormatType.class, str);
    }

    public static AdFormatType[] values() {
        return (AdFormatType[]) $VALUES.clone();
    }

    public final String toLowercase() {
        String lowerCase = toString().toLowerCase(Locale.ROOT);
        e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final String toTitlecase() {
        String lowercase = toLowercase();
        if (lowercase.length() <= 0) {
            return lowercase;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = lowercase.charAt(0);
        sb2.append((Object) (Character.isLowerCase(cCharAt) ? f.titlecase(cCharAt) : String.valueOf(cCharAt)));
        String strSubstring = lowercase.substring(1);
        e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }
}
