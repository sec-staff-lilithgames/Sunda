package of;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.v0;
import j1.o2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f79358a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f79359b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f79360c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f79361d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Comparable {

        /* renamed from: b, reason: collision with root package name */
        public final int f79362b;

        /* renamed from: c, reason: collision with root package name */
        public final d f79363c;

        public a(int i10, d dVar) {
            this.f79362b = i10;
            this.f79363c = dVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(a aVar) {
            return Integer.compare(this.f79362b, aVar.f79362b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f79366c;

        /* renamed from: a, reason: collision with root package name */
        public long f79364a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f79365b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f79367d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f79368e = -3.4028235E38f;

        /* renamed from: f, reason: collision with root package name */
        public int f79369f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f79370g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f79371h = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public int f79372i = Integer.MIN_VALUE;

        /* renamed from: j, reason: collision with root package name */
        public float f79373j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f79374k = Integer.MIN_VALUE;

        public e build() {
            return new e(toCueBuilder().build(), this.f79364a, this.f79365b);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ef.a toCueBuilder() {
            /*
                Method dump skipped, instructions count: 191
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: of.h.b.toCueBuilder():ef.a");
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
        f79360c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        o2.t(255, 255, 255, map2, "bg_white");
        o2.t(0, 255, 0, map2, "bg_lime");
        o2.t(0, 255, 255, map2, "bg_cyan");
        o2.t(255, 0, 0, map2, "bg_red");
        o2.t(255, 255, 0, map2, "bg_yellow");
        o2.t(255, 0, 255, map2, "bg_magenta");
        o2.t(0, 0, 255, map2, "bg_blue");
        o2.t(0, 0, 0, map2, "bg_black");
        f79361d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r18, of.g r19, java.util.List r20, android.text.SpannableStringBuilder r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: of.h.a(java.lang.String, of.g, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    public static ArrayList b(List list, String str, g gVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = (d) list.get(i10);
            int specificityScore = dVar.getSpecificityScore(str, gVar.f79354a, gVar.f79357d, gVar.f79356c);
            if (specificityScore > 0) {
                arrayList.add(new a(specificityScore, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, g gVar) {
        ArrayList arrayListB = b(list, str, gVar);
        for (int i10 = 0; i10 < arrayListB.size(); i10++) {
            d dVar = ((a) arrayListB.get(i10)).f79363c;
            if (dVar.getRubyPosition() != -1) {
                return dVar.getRubyPosition();
            }
        }
        return -1;
    }

    public static e d(String str, Matcher matcher, v0 v0Var, List list) {
        b bVar = new b();
        try {
            bVar.f79364a = j.parseTimestampUs((String) com.google.android.exoplayer2.util.a.checkNotNull(matcher.group(1)));
            bVar.f79365b = j.parseTimestampUs((String) com.google.android.exoplayer2.util.a.checkNotNull(matcher.group(2)));
            e((String) com.google.android.exoplayer2.util.a.checkNotNull(matcher.group(3)), bVar);
            StringBuilder sb2 = new StringBuilder();
            String line = v0Var.readLine();
            while (!TextUtils.isEmpty(line)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(line.trim());
                line = v0Var.readLine();
            }
            bVar.f79366c = f(str, sb2.toString(), list);
            return bVar.build();
        } catch (NumberFormatException unused) {
            f0.w("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r18, of.h.b r19) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: of.h.e(java.lang.String, of.h$b):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString f(java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: of.h.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, b bVar) {
        String strSubstring;
        int i10;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            i10 = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i10 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i10 = 0;
                    break;
                default:
                    f0.w("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            bVar.f79370g = i10;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            bVar.f79368e = j.parsePercentage(str);
            bVar.f79369f = 0;
        } else {
            bVar.f79368e = Integer.parseInt(str);
            bVar.f79369f = 1;
        }
    }

    public static e parseCue(v0 v0Var, List<d> list) {
        String line = v0Var.readLine();
        if (line == null) {
            return null;
        }
        Pattern pattern = f79358a;
        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            return d(null, matcher, v0Var, list);
        }
        String line2 = v0Var.readLine();
        if (line2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(line2);
        if (matcher2.matches()) {
            return d(line.trim(), matcher2, v0Var, list);
        }
        return null;
    }
}
