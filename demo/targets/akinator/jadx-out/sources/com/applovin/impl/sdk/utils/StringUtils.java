package com.applovin.impl.sdk.utils;

import a.b;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.DtbConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import j1.o2;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class StringUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f15697a = "0123456789abcdef".toCharArray();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    private static String a(String str, Integer num) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(str.getBytes(C.UTF8_NAME));
            String hexString = toHexString(messageDigest.digest());
            return num.intValue() > 0 ? hexString.substring(0, Math.min(num.intValue(), hexString.length())) : hexString;
        } catch (Throwable th2) {
            throw new RuntimeException(b.l("SHA-1 for \"", str, "\" failed."), th2);
        }
    }

    public static void addLinks(Spannable spannable, Pattern pattern, ClickableSpan clickableSpan, boolean z10) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            spannable.setSpan(clickableSpan, iStart, iEnd, 33);
            if (z10) {
                spannable.setSpan(new StyleSpan(1), iStart, iEnd, NotificationCompat.FLAG_LOCAL_ONLY);
            }
        }
    }

    public static String appendQueryParameter(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter(str2, str3);
        return builderBuildUpon.build().toString();
    }

    public static String appendQueryParameters(String str, Map<String, String> map, boolean z10) {
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return str;
        }
        if (z10) {
            TreeMap treeMap = new TreeMap(new a());
            treeMap.putAll(map);
            map = treeMap;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    public static boolean containsAtLeastOneSubstring(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsIgnoreCase(String str, String str2) {
        return isValidString(str) && isValidString(str2) && str.toLowerCase().contains(str2.toLowerCase());
    }

    public static SpannedString createListItemDetailSpannedString(String str, int i10) {
        return createSpannedString(str, i10, 16);
    }

    public static SpannedString createListItemDetailSubSpannedString(String str, int i10) {
        return createSpannedString(str, i10, 12, 1);
    }

    public static SpannedString createSpannedString(String str, int i10, int i11) {
        return createSpannedString(str, i10, i11, 0);
    }

    public static String defaultIfEmpty(String str, String str2) {
        return isValidString(str) ? str : str2;
    }

    public static String emptyIfNull(String str) {
        return str == null ? "" : str;
    }

    public static String encodeUriString(String str) {
        return isValidString(str) ? Uri.encode(str) : "";
    }

    public static Boolean endsWith(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.endsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static String getHost(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri uri = Uri.parse(str);
        return uri.getHost() != null ? uri.getHost() : "";
    }

    public static String getHostAndPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri uri = Uri.parse(str);
        return o2.l(emptyIfNull(uri.getHost()), emptyIfNull(uri.getPath()));
    }

    public static List<String> getRegexMatches(Matcher matcher, int i10) {
        matcher.reset();
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String strGroup = matcher.group(i10);
            if (isValidString(strGroup)) {
                arrayList.add(strGroup);
            }
        }
        return arrayList;
    }

    public static boolean isAlphaNumeric(String str) {
        if (isValidString(str)) {
            return str.matches("^[a-zA-Z0-9]*$");
        }
        return false;
    }

    public static boolean isNumeric(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char cCharAt = str.charAt(0);
        int i10 = (cCharAt == '-' || cCharAt == '+') ? 1 : 0;
        int length = str.length();
        if (i10 == 1 && length == 1) {
            return false;
        }
        while (i10 < length) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static String join(CharSequence charSequence, List<?> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(charSequence);
        }
        sb2.delete(sb2.length() - charSequence.length(), sb2.length());
        return sb2.toString();
    }

    public static Matcher match(String str, String str2) {
        return Pattern.compile(str2).matcher(str);
    }

    public static float parseFloat(String str, float f10) {
        try {
            return Float.parseFloat(str);
        } catch (Throwable unused) {
            return f10;
        }
    }

    public static int parseInt(String str) {
        return parseInt(str, 0);
    }

    public static long parseLong(String str, long j10) {
        return isNumeric(str) ? Long.parseLong(str) : j10;
    }

    public static String prefixToIndex(int i10, String str) {
        return TextUtils.isEmpty(str) ? str : str.substring(0, Math.min(i10, str.length()));
    }

    public static String replace(String str, String str2, String str3) {
        if (str3 == null) {
            throw new IllegalArgumentException("No replacement target specified");
        }
        if (str == null || str.length() < 1 || str2 == null || str2.length() < 1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        int iIndexOf = sb2.indexOf(str2);
        while (iIndexOf != -1) {
            sb2.replace(iIndexOf, str2.length() + iIndexOf, str3);
            iIndexOf = sb2.indexOf(str2, str3.length() + iIndexOf);
        }
        return sb2.toString();
    }

    public static void replaceAll(StringBuffer stringBuffer, String str, String str2) {
        if (TextUtils.isEmpty(stringBuffer) || TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("No replacement target specified");
        }
        int iIndexOf = stringBuffer.indexOf(str);
        while (iIndexOf != -1) {
            stringBuffer.replace(iIndexOf, str.length() + iIndexOf, str2);
            iIndexOf = stringBuffer.indexOf(str, str2.length() + iIndexOf);
        }
    }

    public static boolean startsWithAtLeastOnePrefix(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String toDigitsOnlyVersionString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split("\\.");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (isValidString(str2)) {
                String[] strArrSplit2 = str2.split("[^0-9]+");
                int length = strArrSplit2.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        String str3 = strArrSplit2[i10];
                        if (isValidString(str3)) {
                            arrayList.add(str3);
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return TextUtils.join(".", arrayList);
    }

    public static String toFullSHA1Hash(String str) {
        return a(str, -1);
    }

    public static String toHexString(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("No data specified");
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = i10 * 2;
            char[] cArr2 = f15697a;
            byte b10 = bArr[i10];
            cArr[i11] = cArr2[(b10 & 240) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static String toHttpsString(String str) {
        return str.startsWith(DtbConstants.HTTP) ? str.replace(DtbConstants.HTTP, DtbConstants.HTTPS) : str;
    }

    public static String toHumanReadableString(String str) {
        if (!isValidString(str)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (String str2 : str.split("_")) {
            if (isValidString(str2)) {
                if (str2.equals("id")) {
                    sb2.append(str2.toUpperCase(Locale.ENGLISH));
                } else {
                    String strSubstring = str2.substring(0, 1);
                    Locale locale = Locale.ENGLISH;
                    sb2.append(strSubstring.toUpperCase(locale));
                    sb2.append(str2.substring(1).toLowerCase(locale));
                }
                sb2.append(" ");
            }
        }
        return sb2.deleteCharAt(sb2.length() - 1).toString();
    }

    public static String toShortSHA1Hash(String str) {
        return a(str, 16);
    }

    public static SpannedString createSpannedString(String str, int i10, int i11, int i12) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i10), 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i11, true), 0, spannableString.length(), 33);
        spannableString.setSpan(new StyleSpan(i12), 0, spannableString.length(), 33);
        return new SpannedString(spannableString);
    }

    public static int parseInt(String str, int i10) {
        return isNumeric(str) ? Integer.parseInt(str) : i10;
    }

    public static String replace(String str, Map<String, String> map) {
        if (str != null && map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                str = str.replace(entry.getKey(), entry.getValue());
            }
        }
        return str;
    }
}
