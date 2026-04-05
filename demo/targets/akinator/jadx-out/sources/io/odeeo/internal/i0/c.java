package io.odeeo.internal.i0;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f64312a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64313b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f64314c;

    /* renamed from: d, reason: collision with root package name */
    public final float f64315d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f64316e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f64317f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f64318g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f64319h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f64320a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64321b;

        /* renamed from: c, reason: collision with root package name */
        public final int f64322c;

        /* renamed from: d, reason: collision with root package name */
        public final int f64323d;

        /* renamed from: e, reason: collision with root package name */
        public final int f64324e;

        /* renamed from: f, reason: collision with root package name */
        public final int f64325f;

        /* renamed from: g, reason: collision with root package name */
        public final int f64326g;

        /* renamed from: h, reason: collision with root package name */
        public final int f64327h;

        /* renamed from: i, reason: collision with root package name */
        public final int f64328i;

        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f64320a = i10;
            this.f64321b = i11;
            this.f64322c = i12;
            this.f64323d = i13;
            this.f64324e = i14;
            this.f64325f = i15;
            this.f64326g = i16;
            this.f64327h = i17;
            this.f64328i = i18;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static io.odeeo.internal.i0.c.a fromFormatLine(java.lang.String r14) {
            /*
                r0 = 7
                java.lang.String r14 = r14.substring(r0)
                java.lang.String r1 = ","
                java.lang.String[] r14 = android.text.TextUtils.split(r14, r1)
                r1 = -1
                r2 = 0
                r5 = r1
                r6 = r5
                r7 = r6
                r8 = r7
                r9 = r8
                r10 = r9
                r11 = r10
                r12 = r11
                r3 = r2
            L16:
                int r4 = r14.length
                if (r3 >= r4) goto L9e
                r4 = r14[r3]
                java.lang.String r4 = r4.trim()
                java.lang.String r4 = io.odeeo.internal.t0.c.toLowerCase(r4)
                r4.getClass()
                int r13 = r4.hashCode()
                switch(r13) {
                    case -1178781136: goto L7d;
                    case -1026963764: goto L72;
                    case -192095652: goto L67;
                    case -70925746: goto L5c;
                    case 3029637: goto L51;
                    case 3373707: goto L46;
                    case 366554320: goto L3b;
                    case 1767875043: goto L30;
                    default: goto L2d;
                }
            L2d:
                r4 = r1
                goto L87
            L30:
                java.lang.String r13 = "alignment"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L39
                goto L2d
            L39:
                r4 = r0
                goto L87
            L3b:
                java.lang.String r13 = "fontsize"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L44
                goto L2d
            L44:
                r4 = 6
                goto L87
            L46:
                java.lang.String r13 = "name"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L4f
                goto L2d
            L4f:
                r4 = 5
                goto L87
            L51:
                java.lang.String r13 = "bold"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L5a
                goto L2d
            L5a:
                r4 = 4
                goto L87
            L5c:
                java.lang.String r13 = "primarycolour"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L65
                goto L2d
            L65:
                r4 = 3
                goto L87
            L67:
                java.lang.String r13 = "strikeout"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L70
                goto L2d
            L70:
                r4 = 2
                goto L87
            L72:
                java.lang.String r13 = "underline"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L7b
                goto L2d
            L7b:
                r4 = 1
                goto L87
            L7d:
                java.lang.String r13 = "italic"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L86
                goto L2d
            L86:
                r4 = r2
            L87:
                switch(r4) {
                    case 0: goto L99;
                    case 1: goto L97;
                    case 2: goto L95;
                    case 3: goto L93;
                    case 4: goto L91;
                    case 5: goto L8f;
                    case 6: goto L8d;
                    case 7: goto L8b;
                    default: goto L8a;
                }
            L8a:
                goto L9a
            L8b:
                r6 = r3
                goto L9a
            L8d:
                r8 = r3
                goto L9a
            L8f:
                r5 = r3
                goto L9a
            L91:
                r9 = r3
                goto L9a
            L93:
                r7 = r3
                goto L9a
            L95:
                r12 = r3
                goto L9a
            L97:
                r11 = r3
                goto L9a
            L99:
                r10 = r3
            L9a:
                int r3 = r3 + 1
                goto L16
            L9e:
                if (r5 == r1) goto La7
                io.odeeo.internal.i0.c$a r4 = new io.odeeo.internal.i0.c$a
                int r13 = r14.length
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return r4
            La7:
                r14 = 0
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.i0.c.a.fromFormatLine(java.lang.String):io.odeeo.internal.i0.c$a");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final Pattern f64329c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d, reason: collision with root package name */
        public static final Pattern f64330d = Pattern.compile(g0.formatInvariant("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e, reason: collision with root package name */
        public static final Pattern f64331e = Pattern.compile(g0.formatInvariant("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f, reason: collision with root package name */
        public static final Pattern f64332f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a, reason: collision with root package name */
        public final int f64333a;

        /* renamed from: b, reason: collision with root package name */
        public final PointF f64334b;

        public b(int i10, PointF pointF) {
            this.f64333a = i10;
            this.f64334b = pointF;
        }

        public static int a(String str) {
            Matcher matcher = f64332f.matcher(str);
            if (matcher.find()) {
                return c.b((String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(1)));
            }
            return -1;
        }

        public static PointF b(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f64330d.matcher(str);
            Matcher matcher2 = f64331e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    p.i("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) io.odeeo.internal.q0.a.checkNotNull(strGroup)).trim()), Float.parseFloat(((String) io.odeeo.internal.q0.a.checkNotNull(strGroup2)).trim()));
        }

        public static b parseFromDialogue(String str) {
            Matcher matcher = f64329c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(1));
                try {
                    PointF pointFB = b(str2);
                    if (pointFB != null) {
                        pointF = pointFB;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(str2);
                    if (iA != -1) {
                        i10 = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        public static String stripStyleOverrides(String str) {
            return f64329c.matcher(str).replaceAll("");
        }
    }

    public c(String str, int i10, Integer num, float f10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f64312a = str;
        this.f64313b = i10;
        this.f64314c = num;
        this.f64315d = f10;
        this.f64316e = z10;
        this.f64317f = z11;
        this.f64318g = z12;
        this.f64319h = z13;
    }

    public static boolean a(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static int b(String str) throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (a(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        o2.A("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean c(String str) throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            p.w("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static float d(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            p.w("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }

    public static c fromStyleLine(String str, a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        io.odeeo.internal.q0.a.checkArgument(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i10 = aVar.f64328i;
        if (length != i10) {
            p.w("SsaStyle", g0.formatInvariant("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f64320a].trim();
            int i11 = aVar.f64321b;
            int iB = i11 != -1 ? b(strArrSplit[i11].trim()) : -1;
            int i12 = aVar.f64322c;
            Integer color = i12 != -1 ? parseColor(strArrSplit[i12].trim()) : null;
            int i13 = aVar.f64323d;
            float fD = i13 != -1 ? d(strArrSplit[i13].trim()) : -3.4028235E38f;
            int i14 = aVar.f64324e;
            boolean z13 = false;
            boolean z14 = true;
            if (i14 == -1 || !c(strArrSplit[i14].trim())) {
                z10 = false;
            } else {
                z10 = false;
                z13 = true;
            }
            int i15 = aVar.f64325f;
            if (i15 == -1 || !c(strArrSplit[i15].trim())) {
                z11 = true;
                z14 = z10;
            } else {
                z11 = true;
            }
            int i16 = aVar.f64326g;
            if (i16 == -1 || !c(strArrSplit[i16].trim())) {
                z12 = z11;
                z11 = z10;
            } else {
                z12 = z11;
            }
            int i17 = aVar.f64327h;
            if (i17 == -1 || !c(strArrSplit[i17].trim())) {
                z12 = z10;
            }
            return new c(strTrim, iB, color, fD, z13, z14, z11, z12);
        } catch (RuntimeException e10) {
            p.w("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    public static Integer parseColor(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            io.odeeo.internal.q0.a.checkArgument(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(io.odeeo.internal.w0.d.checkedCast(((j10 >> 24) & 255) ^ 255), io.odeeo.internal.w0.d.checkedCast(j10 & 255), io.odeeo.internal.w0.d.checkedCast((j10 >> 8) & 255), io.odeeo.internal.w0.d.checkedCast((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            p.w("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
