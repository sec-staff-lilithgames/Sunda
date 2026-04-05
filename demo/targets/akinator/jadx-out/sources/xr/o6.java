package xr;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class o6 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f92847a = TimeUnit.SECONDS.toNanos(1);

    public static long a(int i10, long j10) {
        long j11 = i10;
        long j12 = f92847a;
        if (j11 <= (-j12) || j11 >= j12) {
            j10 = qh.h.checkedAdd(j10, j11 / j12);
            i10 = (int) (j11 % j12);
        }
        if (j10 > 0 && i10 < 0) {
            i10 = (int) (i10 + j12);
            j10--;
        }
        if (j10 < 0 && i10 > 0) {
            i10 = (int) (i10 - j12);
            j10++;
        }
        if (j10 >= -315576000000L && j10 <= 315576000000L) {
            long j13 = i10;
            if (j13 >= -999999999 && j13 < j12 && ((j10 >= 0 && i10 >= 0) || (j10 <= 0 && i10 <= 0))) {
                long nanos = TimeUnit.SECONDS.toNanos(j10);
                long j14 = i10;
                long j15 = nanos + j14;
                return (((j14 ^ nanos) > 0L ? 1 : ((j14 ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j15) >= 0) ? j15 : ((j15 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j10 + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i10 + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }

    public static long b(String str) throws NumberFormatException, ParseException {
        boolean z10;
        String strSubstring;
        int iCharAt;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z10 = true;
        } else {
            z10 = false;
        }
        String strSubstring2 = str.substring(0, str.length() - 1);
        int iIndexOf = strSubstring2.indexOf(46);
        if (iIndexOf != -1) {
            strSubstring = strSubstring2.substring(iIndexOf + 1);
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        long j10 = Long.parseLong(strSubstring2);
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i10 = 0; i10 < 9; i10++) {
                iCharAt *= 10;
                if (i10 < strSubstring.length()) {
                    if (strSubstring.charAt(i10) < '0' || strSubstring.charAt(i10) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt = (strSubstring.charAt(i10) - '0') + iCharAt;
                }
            }
        }
        if (j10 < 0) {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (z10) {
            j10 = -j10;
            iCharAt = -iCharAt;
        }
        try {
            return a(iCharAt, j10);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List<Map<String, ?>> checkObjectList(List<?> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!(list.get(i10) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i10), Integer.valueOf(i10), list));
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List<String> checkStringList(List<?> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!(list.get(i10) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", list.get(i10), Integer.valueOf(i10), list));
            }
        }
        return list;
    }

    public static Boolean getBoolean(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static List<?> getList(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List<Map<String, ?>> getListOfObjects(Map<String, ?> map, String str) {
        List<?> list = getList(map, str);
        if (list == null) {
            return null;
        }
        return checkObjectList(list);
    }

    public static List<String> getListOfStrings(Map<String, ?> map, String str) {
        List<?> list = getList(map, str);
        if (list == null) {
            return null;
        }
        return checkStringList(list);
    }

    public static Double getNumberAsDouble(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Float getNumberAsFloat(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Float) {
            return (Float) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value %s for key '%s' is not a float", obj, str));
        }
        try {
            return Float.valueOf(Float.parseFloat((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("string value '%s' for key '%s' cannot be parsed as a float", obj, str));
        }
    }

    public static Integer getNumberAsInteger(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d10 = (Double) obj;
        int iIntValue = d10.intValue();
        if (iIntValue == d10.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d10);
    }

    public static Long getNumberAsLong(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a long integer", obj, str));
            }
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a long integer", obj, str));
            }
        }
        Double d10 = (Double) obj;
        long jLongValue = d10.longValue();
        if (jLongValue == d10.doubleValue()) {
            return Long.valueOf(jLongValue);
        }
        throw new ClassCastException("Number expected to be long: " + d10);
    }

    public static Map<String, ?> getObject(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static String getString(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long getStringAsDuration(Map<String, ?> map, String str) {
        String string = getString(map, str);
        if (string == null) {
            return null;
        }
        try {
            return Long.valueOf(b(string));
        } catch (ParseException e10) {
            throw new RuntimeException(e10);
        }
    }
}
