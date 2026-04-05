package com.sfbx.appconsent.core.util;

import ac.Models;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.telephony.PhoneNumberUtils;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.DurationUnit;
import com.sfbx.appconsent.core.model.ExportConsentable;
import h2.rl.UeklptUrP;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.g1;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mv.d;
import p0.o2;
import sv.e;
import sv.g;
import sv.n0;
import sv.x;
import tu.t;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ExtensionKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DurationUnit.values().length];
            try {
                iArr[DurationUnit.MICROSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnit.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String capitalizeFirstLetter(String str) {
        String strValueOf;
        e0.checkNotNullParameter(str, "<this>");
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            Locale locale = Locale.getDefault();
            e0.checkNotNullExpressionValue(locale, "getDefault()");
            strValueOf = e.titlecase(cCharAt, locale);
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb2.append((Object) strValueOf);
        String strSubstring = str.substring(1);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    public static final String formatNumber(String str, String defaultCountryIso) {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(defaultCountryIso, "defaultCountryIso");
        if (n0.isBlank(defaultCountryIso)) {
            defaultCountryIso = Locale.getDefault().getCountry();
        }
        String number = PhoneNumberUtils.formatNumber(str, defaultCountryIso);
        e0.checkNotNullExpressionValue(number, "formatNumber(\n        th…e.getDefault().country })");
        return number;
    }

    public static /* synthetic */ String formatNumber$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "";
        }
        return formatNumber(str, str2);
    }

    public static final PackageInfo getPackageInfoCompat(PackageManager packageManager, String packageName, int i10) throws PackageManager.NameNotFoundException {
        e0.checkNotNullParameter(packageManager, "<this>");
        e0.checkNotNullParameter(packageName, "packageName");
        PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i10);
        e0.checkNotNullExpressionValue(packageInfo, "getPackageInfo(packageName, flags)");
        return packageInfo;
    }

    public static /* synthetic */ PackageInfo getPackageInfoCompat$default(PackageManager packageManager, String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return getPackageInfoCompat(packageManager, str, i10);
    }

    public static final long getTimeInMillis(long j10, DurationUnit timeUnit) {
        e0.checkNotNullParameter(timeUnit, "timeUnit");
        switch (WhenMappings.$EnumSwitchMapping$0[timeUnit.ordinal()]) {
            case 1:
                return TimeUnit.MICROSECONDS.toMillis(j10);
            case 2:
                return TimeUnit.NANOSECONDS.toMillis(j10);
            case 3:
                return j10;
            case 4:
                return TimeUnit.SECONDS.toMillis(j10);
            case 5:
                return TimeUnit.MINUTES.toMillis(j10);
            case 6:
                return TimeUnit.HOURS.toMillis(j10);
            case 7:
                return TimeUnit.DAYS.toMillis(j10);
            default:
                throw new t();
        }
    }

    public static final String removeLineSeparatorAtEnd(String str) {
        e0.checkNotNullParameter(str, "<this>");
        return new x("(\\r\\n)$|\\n$").replace(str, "");
    }

    public static final double round2Digits(double d10) {
        return d.roundToInt(d10 * 100.0d) / 100.0d;
    }

    public static final String serialized(String str, Json json) {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(json, "json");
        if (e0.areEqual(str, AbstractJsonLexerKt.NULL) || n0.isBlank(str)) {
            return null;
        }
        return (String) json.decodeFromString(BuiltinSerializersKt.serializer(g1.f71834a), str);
    }

    public static final Models.Consent.EnumConsentType toEnumConsentType(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? Models.Consent.EnumConsentType.UNRECOGNIZED : Models.Consent.EnumConsentType.CONTINUE_WITHOUT_ACCEPTING : Models.Consent.EnumConsentType.MIXED : Models.Consent.EnumConsentType.DENY_ALL : Models.Consent.EnumConsentType.ACCEPT_ALL;
    }

    public static final List<ExportConsentable> toExportConsentable(List<Consentable> list) {
        e0.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        List<Consentable> list2 = list;
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(Boolean.valueOf(arrayList.add(toExportConsentable((Consentable) it.next()))));
        }
        return arrayList;
    }

    public static final String sha256(String str) throws NoSuchAlgorithmException {
        e0.checkNotNullParameter(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(g.f86134b);
        e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        e0.checkNotNullExpressionValue(bArrDigest, UeklptUrP.wPLiP);
        String string = "";
        for (byte b10 : bArrDigest) {
            StringBuilder sbU = o2.u(string);
            String str2 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            e0.checkNotNullExpressionValue(str2, "format(this, *args)");
            sbU.append(str2);
            string = sbU.toString();
        }
        return string;
    }

    public static final ExportConsentable toExportConsentable(Consentable consentable) {
        e0.checkNotNullParameter(consentable, "<this>");
        return new ExportConsentable(consentable.getIabId(), consentable.getExtraId(), consentable.getType(), consentable.getStatus());
    }
}
