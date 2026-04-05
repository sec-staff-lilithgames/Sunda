package j$.time.format;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentMap f68592a = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: b, reason: collision with root package name */
    public static final v f68593b = new v();

    /* renamed from: c, reason: collision with root package name */
    public static final x f68594c = new x();

    public String a(j$.time.chrono.m mVar, j$.time.temporal.p pVar, long j10, b0 b0Var, Locale locale) {
        if (mVar == j$.time.chrono.t.f68512c || !(pVar instanceof j$.time.temporal.a)) {
            return b(pVar, j10, b0Var, locale);
        }
        return null;
    }

    public String b(j$.time.temporal.p pVar, long j10, b0 b0Var, Locale locale) {
        Object wVar;
        String strSubstring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(pVar, locale);
        Object obj = ((ConcurrentHashMap) f68592a).get(simpleImmutableEntry);
        if (obj == null) {
            HashMap map = new HashMap();
            if (pVar == j$.time.temporal.a.ERA) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                String[] eras = dateFormatSymbols.getEras();
                for (int i10 = 0; i10 < eras.length; i10++) {
                    if (!eras[i10].isEmpty()) {
                        long j11 = i10;
                        map2.put(Long.valueOf(j11), eras[i10]);
                        Long lValueOf = Long.valueOf(j11);
                        String str = eras[i10];
                        map3.put(lValueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                    }
                }
                if (!map2.isEmpty()) {
                    map.put(b0.FULL, map2);
                    map.put(b0.SHORT, map2);
                    map.put(b0.NARROW, map3);
                }
                wVar = new w(map);
            } else if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                int length = DateFormatSymbols.getInstance(locale).getMonths().length;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (long j12 = 1; j12 <= length; j12++) {
                    String strB = j$.time.b.b(j12, "LLLL", locale);
                    linkedHashMap.put(Long.valueOf(j12), strB);
                    linkedHashMap2.put(Long.valueOf(j12), strB.substring(0, Character.charCount(strB.codePointAt(0))));
                    linkedHashMap3.put(Long.valueOf(j12), j$.time.b.b(j12, "LLL", locale));
                }
                if (length > 0) {
                    map.put(b0.FULL_STANDALONE, linkedHashMap);
                    map.put(b0.NARROW_STANDALONE, linkedHashMap2);
                    map.put(b0.SHORT_STANDALONE, linkedHashMap3);
                    map.put(b0.FULL, linkedHashMap);
                    map.put(b0.NARROW, linkedHashMap2);
                    map.put(b0.SHORT, linkedHashMap3);
                }
                wVar = new w(map);
            } else if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
                int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                boolean z10 = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
                for (long j13 = 1; j13 <= length2; j13++) {
                    String strA = j$.time.b.a(j13, "cccc", locale);
                    linkedHashMap4.put(Long.valueOf(j13), strA);
                    Long lValueOf2 = Long.valueOf(j13);
                    if (!z10) {
                        strSubstring = strA.substring(0, Character.charCount(strA.codePointAt(0)));
                    } else {
                        strSubstring = new StringBuilder().appendCodePoint(strA.codePointBefore(strA.length())).toString();
                    }
                    linkedHashMap5.put(lValueOf2, strSubstring);
                    linkedHashMap6.put(Long.valueOf(j13), j$.time.b.a(j13, "ccc", locale));
                }
                if (length2 > 0) {
                    map.put(b0.FULL_STANDALONE, linkedHashMap4);
                    map.put(b0.NARROW_STANDALONE, linkedHashMap5);
                    map.put(b0.SHORT_STANDALONE, linkedHashMap6);
                    map.put(b0.FULL, linkedHashMap4);
                    map.put(b0.NARROW, linkedHashMap5);
                    map.put(b0.SHORT, linkedHashMap6);
                }
                wVar = new w(map);
            } else if (pVar == j$.time.temporal.a.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                HashMap map4 = new HashMap();
                HashMap map5 = new HashMap();
                String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
                for (int i11 = 0; i11 < amPmStrings.length; i11++) {
                    if (!amPmStrings[i11].isEmpty()) {
                        long j14 = i11;
                        map4.put(Long.valueOf(j14), amPmStrings[i11]);
                        Long lValueOf3 = Long.valueOf(j14);
                        String str2 = amPmStrings[i11];
                        map5.put(lValueOf3, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                    }
                }
                if (!map4.isEmpty()) {
                    map.put(b0.FULL, map4);
                    map.put(b0.SHORT, map4);
                    map.put(b0.NARROW, map5);
                }
                wVar = new w(map);
            } else {
                wVar = "";
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f68592a;
            concurrentHashMap.putIfAbsent(simpleImmutableEntry, wVar);
            obj = concurrentHashMap.get(simpleImmutableEntry);
        }
        if (obj instanceof w) {
            return ((w) obj).a(j10, b0Var);
        }
        return null;
    }
}
