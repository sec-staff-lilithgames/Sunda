package io.odeeo.internal.m0;

import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.x;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f64685a = Pattern.compile(KGUkpTlXZlJLy.XMm);

    public static Matcher findNextCueHeader(x xVar) {
        String line;
        while (true) {
            String line2 = xVar.readLine();
            if (line2 == null) {
                return null;
            }
            if (f64685a.matcher(line2).matches()) {
                do {
                    line = xVar.readLine();
                    if (line != null) {
                    }
                } while (!line.isEmpty());
            } else {
                Matcher matcher = f.f64659a.matcher(line2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean isWebvttHeaderLine(x xVar) {
        String line = xVar.readLine();
        return line != null && line.startsWith("WEBVTT");
    }

    public static float parsePercentage(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long parseTimestampUs(String str) throws NumberFormatException {
        String[] strArrSplitAtFirst = g0.splitAtFirst(str, "\\.");
        long j10 = 0;
        for (String str2 : g0.split(strArrSplitAtFirst[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrSplitAtFirst.length == 2) {
            j11 += Long.parseLong(strArrSplitAtFirst[1]);
        }
        return j11 * 1000;
    }

    public static void validateWebvttHeaderLine(x xVar) throws io.odeeo.internal.b.g0 {
        int position = xVar.getPosition();
        if (isWebvttHeaderLine(xVar)) {
            return;
        }
        xVar.setPosition(position);
        throw io.odeeo.internal.b.g0.createForMalformedContainer("Expected WEBVTT. Got " + xVar.readLine(), null);
    }
}
