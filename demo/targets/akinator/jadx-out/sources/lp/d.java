package lp;

import android.graphics.PointF;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f73583c = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f73584d = Pattern.compile(a1.formatInvariant("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f73585e = Pattern.compile(a1.formatInvariant("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f73586f = Pattern.compile("\\\\an(\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final int f73587a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f73588b;

    public d(int i10, PointF pointF) {
        this.f73587a = i10;
        this.f73588b = pointF;
    }

    public static PointF a(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = f73584d.matcher(str);
        Matcher matcher2 = f73585e.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                b0.i("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
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
        return new PointF(Float.parseFloat(((String) io.bidmachine.media3.common.util.a.checkNotNull(strGroup)).trim()), Float.parseFloat(((String) io.bidmachine.media3.common.util.a.checkNotNull(strGroup2)).trim()));
    }

    public static d parseFromDialogue(String str) {
        Matcher matcher = f73583c.matcher(str);
        PointF pointF = null;
        int i10 = -1;
        while (matcher.find()) {
            String str2 = (String) io.bidmachine.media3.common.util.a.checkNotNull(matcher.group(1));
            try {
                PointF pointFA = a(str2);
                if (pointFA != null) {
                    pointF = pointFA;
                }
            } catch (RuntimeException unused) {
            }
            try {
                Matcher matcher2 = f73586f.matcher(str2);
                int iA = matcher2.find() ? e.a((String) io.bidmachine.media3.common.util.a.checkNotNull(matcher2.group(1))) : -1;
                if (iA != -1) {
                    i10 = iA;
                }
            } catch (RuntimeException unused2) {
            }
        }
        return new d(i10, pointF);
    }

    public static String stripStyleOverrides(String str) {
        return f73583c.matcher(str).replaceAll("");
    }
}
