package qp;

import android.text.TextUtils;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.m0;
import j1.o2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f83454a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f83455b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f83456c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f83457d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Comparable {

        /* renamed from: b, reason: collision with root package name */
        public final int f83458b;

        /* renamed from: c, reason: collision with root package name */
        public final c f83459c;

        public a(int i10, c cVar) {
            this.f83458b = i10;
            this.f83459c = cVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(a aVar) {
            return Integer.compare(this.f83458b, aVar.f83458b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f83462c;

        /* renamed from: a, reason: collision with root package name */
        public long f83460a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f83461b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f83463d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f83464e = -3.4028235E38f;

        /* renamed from: f, reason: collision with root package name */
        public int f83465f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f83466g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f83467h = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public int f83468i = Integer.MIN_VALUE;

        /* renamed from: j, reason: collision with root package name */
        public float f83469j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f83470k = Integer.MIN_VALUE;

        public d build() {
            return new d(toCueBuilder().build(), this.f83460a, this.f83461b);
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
        public in.a toCueBuilder() {
            /*
                Method dump skipped, instructions count: 191
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qp.g.b.toCueBuilder():in.a");
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
        f83456c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        o2.t(255, 255, 255, map2, "bg_white");
        o2.t(0, 255, 0, map2, "bg_lime");
        o2.t(0, 255, 255, map2, "bg_cyan");
        o2.t(255, 0, 0, map2, "bg_red");
        o2.t(255, 255, 0, map2, "bg_yellow");
        o2.t(255, 0, 255, map2, "bg_magenta");
        o2.t(0, 0, 255, map2, "bg_blue");
        o2.t(0, 0, 0, map2, "bg_black");
        f83457d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r18, qp.f r19, java.util.List r20, android.text.SpannableStringBuilder r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qp.g.a(java.lang.String, qp.f, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    public static ArrayList b(List list, String str, f fVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = (c) list.get(i10);
            int specificityScore = cVar.getSpecificityScore(str, fVar.f83450a, fVar.f83453d, fVar.f83452c);
            if (specificityScore > 0) {
                arrayList.add(new a(specificityScore, cVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, f fVar) {
        ArrayList arrayListB = b(list, str, fVar);
        for (int i10 = 0; i10 < arrayListB.size(); i10++) {
            c cVar = ((a) arrayListB.get(i10)).f83459c;
            if (cVar.getRubyPosition() != -1) {
                return cVar.getRubyPosition();
            }
        }
        return -1;
    }

    public static d d(String str, Matcher matcher, m0 m0Var, List list) {
        b bVar = new b();
        try {
            bVar.f83460a = i.parseTimestampUs((String) io.bidmachine.media3.common.util.a.checkNotNull(matcher.group(1)));
            bVar.f83461b = i.parseTimestampUs((String) io.bidmachine.media3.common.util.a.checkNotNull(matcher.group(2)));
            e((String) io.bidmachine.media3.common.util.a.checkNotNull(matcher.group(3)), bVar);
            StringBuilder sb2 = new StringBuilder();
            String line = m0Var.readLine();
            while (!TextUtils.isEmpty(line)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(line.trim());
                line = m0Var.readLine();
            }
            bVar.f83462c = f(str, sb2.toString(), list);
            return bVar.build();
        } catch (IllegalArgumentException unused) {
            b0.w("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
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
    public static void e(java.lang.String r18, qp.g.b r19) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qp.g.e(java.lang.String, qp.g$b):void");
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
        throw new UnsupportedOperationException("Method not decompiled: qp.g.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
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
                    b0.w("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            bVar.f83466g = i10;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            bVar.f83464e = i.parsePercentage(str);
            bVar.f83465f = 0;
        } else {
            bVar.f83464e = Integer.parseInt(str);
            bVar.f83465f = 1;
        }
    }

    public static in.b newCueForText(CharSequence charSequence) {
        b bVar = new b();
        bVar.f83462c = charSequence;
        return bVar.toCueBuilder().build();
    }

    public static d parseCue(m0 m0Var, List<c> list) {
        String line = m0Var.readLine();
        if (line == null) {
            return null;
        }
        Pattern pattern = f83454a;
        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            return d(null, matcher, m0Var, list);
        }
        String line2 = m0Var.readLine();
        if (line2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(line2);
        if (matcher2.matches()) {
            return d(line.trim(), matcher2, m0Var, list);
        }
        return null;
    }
}
