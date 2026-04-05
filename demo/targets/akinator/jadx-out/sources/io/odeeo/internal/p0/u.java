package io.odeeo.internal.p0;

import android.text.TextUtils;
import b0.e2;
import com.ironsource.C3191e4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f65734a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f65735b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String buildRangeRequestHeader(long j10, long j11) {
        if (j10 == 0 && j11 == -1) {
            return null;
        }
        StringBuilder sbR = e2.r(j10, "bytes=", "-");
        if (j11 != -1) {
            sbR.append((j10 + j11) - 1);
        }
        return sbR.toString();
    }

    public static long getContentLength(String str, String str2) {
        long j10;
        if (TextUtils.isEmpty(str)) {
            j10 = -1;
        } else {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                io.odeeo.internal.q0.p.e("HttpUtil", "Unexpected Content-Length [" + str + C3191e4.i.f36531e);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j10;
        }
        Matcher matcher = f65734a.matcher(str2);
        if (!matcher.matches()) {
            return j10;
        }
        try {
            long j11 = (Long.parseLong((String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(2))) - Long.parseLong((String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(1)))) + 1;
            if (j10 < 0) {
                return j11;
            }
            if (j10 == j11) {
                return j10;
            }
            io.odeeo.internal.q0.p.w("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + C3191e4.i.f36531e);
            return Math.max(j10, j11);
        } catch (NumberFormatException unused2) {
            io.odeeo.internal.q0.p.e("HttpUtil", "Unexpected Content-Range [" + str2 + C3191e4.i.f36531e);
            return j10;
        }
    }

    public static long getDocumentSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f65735b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(1)));
        }
        return -1L;
    }
}
