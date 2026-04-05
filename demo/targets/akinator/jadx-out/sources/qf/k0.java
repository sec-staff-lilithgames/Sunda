package qf;

import android.text.TextUtils;
import b0.e2;
import com.ironsource.C3191e4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f82955a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f82956b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

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

    public static long getContentLength(String str, String str2) throws NumberFormatException {
        long j10;
        if (TextUtils.isEmpty(str)) {
            j10 = -1;
        } else {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                com.google.android.exoplayer2.util.f0.e("HttpUtil", "Unexpected Content-Length [" + str + C3191e4.i.f36531e);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j10;
        }
        Matcher matcher = f82955a.matcher(str2);
        if (!matcher.matches()) {
            return j10;
        }
        try {
            long j11 = (Long.parseLong((String) com.google.android.exoplayer2.util.a.checkNotNull(matcher.group(2))) - Long.parseLong((String) com.google.android.exoplayer2.util.a.checkNotNull(matcher.group(1)))) + 1;
            if (j10 < 0) {
                return j11;
            }
            if (j10 == j11) {
                return j10;
            }
            com.google.android.exoplayer2.util.f0.w("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + C3191e4.i.f36531e);
            return Math.max(j10, j11);
        } catch (NumberFormatException unused2) {
            com.google.android.exoplayer2.util.f0.e("HttpUtil", "Unexpected Content-Range [" + str2 + C3191e4.i.f36531e);
            return j10;
        }
    }

    public static long getDocumentSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f82956b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) com.google.android.exoplayer2.util.a.checkNotNull(matcher.group(1)));
        }
        return -1L;
    }
}
