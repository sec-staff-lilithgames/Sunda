package io.odeeo.internal.m0;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import com.ironsource.C3191e4;
import io.ktor.http.ContentDisposition;
import io.odeeo.internal.d0.a;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.x;
import j1.o2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f64659a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f64660b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map<String, Integer> f64661c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map<String, Integer> f64662d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final Comparator<b> f64663c = new ni.a(20);

        /* renamed from: a, reason: collision with root package name */
        public final c f64664a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64665b;

        public b(c cVar, int i10) {
            this.f64664a = cVar;
            this.f64665b = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f64666a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64667b;

        /* renamed from: c, reason: collision with root package name */
        public final String f64668c;

        /* renamed from: d, reason: collision with root package name */
        public final Set<String> f64669d;

        public c(String str, int i10, String str2, Set<String> set) {
            this.f64667b = i10;
            this.f64666a = str;
            this.f64668c = str2;
            this.f64669d = set;
        }

        public static c buildStartTag(String str, int i10) {
            String str2;
            String strTrim = str.trim();
            io.odeeo.internal.q0.a.checkArgument(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrSplit = g0.split(strTrim, "\\.");
            String str3 = strArrSplit[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < strArrSplit.length; i11++) {
                hashSet.add(strArrSplit[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        public static c buildWholeCueVirtualTag() {
            return new c("", 0, "", Collections.EMPTY_SET);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d implements Comparable<d> {

        /* renamed from: a, reason: collision with root package name */
        public final int f64670a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.m0.d f64671b;

        public d(int i10, io.odeeo.internal.m0.d dVar) {
            this.f64670a = i10;
            this.f64671b = dVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(d dVar) {
            return Integer.compare(this.f64670a, dVar.f64670a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f64674c;

        /* renamed from: a, reason: collision with root package name */
        public long f64672a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f64673b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f64675d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f64676e = -3.4028235E38f;

        /* renamed from: f, reason: collision with root package name */
        public int f64677f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f64678g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f64679h = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public int f64680i = Integer.MIN_VALUE;

        /* renamed from: j, reason: collision with root package name */
        public float f64681j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f64682k = Integer.MIN_VALUE;

        public static float a(float f10, int i10) {
            if (f10 == -3.4028235E38f || i10 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                return f10 != -3.4028235E38f ? f10 : i10 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        public static float b(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        public static int c(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        public io.odeeo.internal.m0.e build() {
            return new io.odeeo.internal.m0.e(toCueBuilder().build(), this.f64672a, this.f64673b);
        }

        public a.b toCueBuilder() {
            float fB = this.f64679h;
            if (fB == -3.4028235E38f) {
                fB = b(this.f64675d);
            }
            int iC = this.f64680i;
            if (iC == Integer.MIN_VALUE) {
                iC = c(this.f64675d);
            }
            a.b verticalType = new a.b().setTextAlignment(a(this.f64675d)).setLine(a(this.f64676e, this.f64677f), this.f64677f).setLineAnchor(this.f64678g).setPosition(fB).setPositionAnchor(iC).setSize(Math.min(this.f64681j, a(iC, fB))).setVerticalType(this.f64682k);
            CharSequence charSequence = this.f64674c;
            if (charSequence != null) {
                verticalType.setText(charSequence);
            }
            return verticalType;
        }

        public static Layout.Alignment a(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            e3.g.z(i10, "Unknown textAlignment: ", "WebvttCueParser");
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public static float a(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }
    }

    static {
        HashMap map = new HashMap();
        o2.t(255, 255, 255, map, "white");
        o2.t(0, 255, 0, map, "lime");
        o2.t(0, 255, 255, map, "cyan");
        o2.t(255, 0, 0, map, "red");
        o2.t(255, 255, 0, map, "yellow");
        o2.t(255, 0, 255, map, "magenta");
        o2.t(0, 0, 255, map, "blue");
        o2.t(0, 0, 0, map, "black");
        f64661c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        o2.t(255, 255, 255, map2, "bg_white");
        o2.t(0, 255, 0, map2, "bg_lime");
        o2.t(0, 255, 255, map2, "bg_cyan");
        o2.t(255, 0, 0, map2, "bg_red");
        o2.t(255, 255, 0, map2, "bg_yellow");
        o2.t(255, 0, 255, map2, "bg_magenta");
        o2.t(0, 0, 255, map2, "bg_blue");
        o2.t(0, 0, 0, map2, "bg_black");
        f64662d = Collections.unmodifiableMap(map2);
    }

    public static io.odeeo.internal.d0.a a(CharSequence charSequence) {
        e eVar = new e();
        eVar.f64674c = charSequence;
        return eVar.toCueBuilder().build();
    }

    public static void b(String str, e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            eVar.f64678g = d(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            eVar.f64676e = h.parsePercentage(str);
            eVar.f64677f = 0;
        } else {
            eVar.f64676e = Integer.parseInt(str);
            eVar.f64677f = 1;
        }
    }

    public static a.b c(String str) {
        e eVar = new e();
        a(str, eVar);
        return eVar.toCueBuilder();
    }

    public static int d(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                p.w("WebvttCueParser", "Invalid anchor value: ".concat(str));
                return Integer.MIN_VALUE;
        }
    }

    public static int e(String str) {
        str.getClass();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                p.w("WebvttCueParser", "Invalid anchor value: ".concat(str));
                return Integer.MIN_VALUE;
        }
    }

    public static int f(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                p.w("WebvttCueParser", "Invalid alignment value: ".concat(str));
                return 2;
        }
    }

    public static int g(String str) {
        str.getClass();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        p.w("WebvttCueParser", "Invalid 'vertical' value: ".concat(str));
        return Integer.MIN_VALUE;
    }

    public static io.odeeo.internal.m0.e parseCue(x xVar, List<io.odeeo.internal.m0.d> list) {
        String line = xVar.readLine();
        if (line == null) {
            return null;
        }
        Pattern pattern = f64659a;
        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            return a((String) null, matcher, xVar, list);
        }
        String line2 = xVar.readLine();
        if (line2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(line2);
        if (matcher2.matches()) {
            return a(line.trim(), matcher2, xVar, list);
        }
        return null;
    }

    public static SpannedString a(String str, String str2, List<io.odeeo.internal.m0.d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                i10++;
                int iIndexOf = str2.indexOf(59, i10);
                int iIndexOf2 = str2.indexOf(32, i10);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    a(str2.substring(i10, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i10++;
            } else {
                int iA = i10 + 1;
                if (iA < str2.length()) {
                    boolean z10 = str2.charAt(iA) == '/';
                    iA = a(str2, iA);
                    int i11 = iA - 2;
                    boolean z11 = str2.charAt(i11) == '/';
                    int i12 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i11 = iA - 1;
                    }
                    String strSubstring = str2.substring(i12, i11);
                    if (!strSubstring.trim().isEmpty()) {
                        String strA = a(strSubstring);
                        if (b(strA)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    a(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (cVar.f64666a.equals(strA)) {
                                        break;
                                    }
                                }
                            } else if (!z11) {
                                arrayDeque.push(c.buildStartTag(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i10 = iA;
            }
        }
        while (!arrayDeque.isEmpty()) {
            a(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        a(str, c.buildWholeCueVirtualTag(), (List<b>) Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static void c(String str, e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            eVar.f64680i = e(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        eVar.f64679h = h.parsePercentage(str);
    }

    public static boolean b(String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static int b(List<io.odeeo.internal.m0.d> list, String str, c cVar) {
        List<d> listA = a(list, str, cVar);
        for (int i10 = 0; i10 < listA.size(); i10++) {
            io.odeeo.internal.m0.d dVar = listA.get(i10).f64671b;
            if (dVar.getRubyPosition() != -1) {
                return dVar.getRubyPosition();
            }
        }
        return -1;
    }

    public static io.odeeo.internal.m0.e a(String str, Matcher matcher, x xVar, List<io.odeeo.internal.m0.d> list) {
        e eVar = new e();
        try {
            eVar.f64672a = h.parseTimestampUs((String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(1)));
            eVar.f64673b = h.parseTimestampUs((String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(2)));
            a((String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(3)), eVar);
            StringBuilder sb2 = new StringBuilder();
            String line = xVar.readLine();
            while (!TextUtils.isEmpty(line)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(line.trim());
                line = xVar.readLine();
            }
            eVar.f64674c = a(str, sb2.toString(), list);
            return eVar.build();
        } catch (NumberFormatException unused) {
            p.w("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static void a(String str, e eVar) {
        Matcher matcher = f64660b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(1));
            String str3 = (String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    b(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f64675d = f(str3);
                } else if (C3191e4.h.L.equals(str2)) {
                    c(str3, eVar);
                } else if (ContentDisposition.Parameters.Size.equals(str2)) {
                    eVar.f64681j = h.parsePercentage(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f64682k = g(str3);
                } else {
                    p.w("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                p.w("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static int a(String str, int i10) {
        int iIndexOf = str.indexOf(62, i10);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    public static void a(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                p.w("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    public static void a(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<io.odeeo.internal.m0.d> list2) {
        int i10;
        int length;
        i10 = cVar.f64667b;
        length = spannableStringBuilder.length();
        String str2 = cVar.f64666a;
        str2.getClass();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                e3.g.s(1, spannableStringBuilder, i10, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, cVar.f64669d, i10, length);
                break;
            case "i":
                e3.g.s(2, spannableStringBuilder, i10, length, 33);
                break;
            case "u":
                e3.g.u(spannableStringBuilder, i10, length, 33);
                break;
            case "ruby":
                a(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<d> listA = a(list2, str, cVar);
        for (int i11 = 0; i11 < listA.size(); i11++) {
            a(spannableStringBuilder, listA.get(i11).f64671b, i10, length);
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<io.odeeo.internal.m0.d> list2) {
        int iB = b(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f64663c);
        int i10 = cVar.f64667b;
        int length = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if ("rt".equals(((b) arrayList.get(i11)).f64664a.f64666a)) {
                b bVar = (b) arrayList.get(i11);
                int iA = a(b(list2, str, bVar.f64664a), iB, 1);
                int i12 = bVar.f64664a.f64667b - length;
                int i13 = bVar.f64665b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i12, i13);
                spannableStringBuilder.delete(i12, i13);
                spannableStringBuilder.setSpan(new io.odeeo.internal.h0.b(charSequenceSubSequence.toString(), iA), i10, i12, 33);
                length = charSequenceSubSequence.length() + length;
                i10 = i12;
            }
        }
    }

    public static int a(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i10, int i11) {
        for (String str : set) {
            Map<String, Integer> map = f64661c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i10, i11, 33);
            } else {
                Map<String, Integer> map2 = f64662d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i10, i11, 33);
                }
            }
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, io.odeeo.internal.m0.d dVar, int i10, int i11) {
        if (dVar == null) {
            return;
        }
        if (dVar.getStyle() != -1) {
            io.odeeo.internal.h0.c.addOrReplaceSpan(spannableStringBuilder, new StyleSpan(dVar.getStyle()), i10, i11, 33);
        }
        if (dVar.isLinethrough()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (dVar.isUnderline()) {
            e3.g.u(spannableStringBuilder, i10, i11, 33);
        }
        if (dVar.hasFontColor()) {
            io.odeeo.internal.h0.c.addOrReplaceSpan(spannableStringBuilder, new ForegroundColorSpan(dVar.getFontColor()), i10, i11, 33);
        }
        if (dVar.hasBackgroundColor()) {
            io.odeeo.internal.h0.c.addOrReplaceSpan(spannableStringBuilder, new BackgroundColorSpan(dVar.getBackgroundColor()), i10, i11, 33);
        }
        if (dVar.getFontFamily() != null) {
            io.odeeo.internal.h0.c.addOrReplaceSpan(spannableStringBuilder, new TypefaceSpan(dVar.getFontFamily()), i10, i11, 33);
        }
        int fontSizeUnit = dVar.getFontSizeUnit();
        if (fontSizeUnit == 1) {
            io.odeeo.internal.h0.c.addOrReplaceSpan(spannableStringBuilder, new AbsoluteSizeSpan((int) dVar.getFontSize(), true), i10, i11, 33);
        } else if (fontSizeUnit == 2) {
            io.odeeo.internal.h0.c.addOrReplaceSpan(spannableStringBuilder, new RelativeSizeSpan(dVar.getFontSize()), i10, i11, 33);
        } else if (fontSizeUnit == 3) {
            io.odeeo.internal.h0.c.addOrReplaceSpan(spannableStringBuilder, new RelativeSizeSpan(dVar.getFontSize() / 100.0f), i10, i11, 33);
        }
        if (dVar.getCombineUpright()) {
            spannableStringBuilder.setSpan(new io.odeeo.internal.h0.a(), i10, i11, 33);
        }
    }

    public static String a(String str) {
        String strTrim = str.trim();
        io.odeeo.internal.q0.a.checkArgument(!strTrim.isEmpty());
        return g0.splitAtFirst(strTrim, "[ \\.]")[0];
    }

    public static List<d> a(List<io.odeeo.internal.m0.d> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            io.odeeo.internal.m0.d dVar = list.get(i10);
            int specificityScore = dVar.getSpecificityScore(str, cVar.f64666a, cVar.f64669d, cVar.f64668c);
            if (specificityScore > 0) {
                arrayList.add(new d(specificityScore, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
