package qp;

import gn.z0;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.m0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f83473a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher findNextCueHeader(m0 m0Var) {
        String line;
        while (true) {
            String line2 = m0Var.readLine();
            if (line2 == null) {
                return null;
            }
            if (f83473a.matcher(line2).matches()) {
                do {
                    line = m0Var.readLine();
                    if (line != null) {
                    }
                } while (!line.isEmpty());
            } else {
                Matcher matcher = g.f83454a.matcher(line2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean isWebvttHeaderLine(m0 m0Var) {
        String line = m0Var.readLine();
        return line != null && line.startsWith("WEBVTT");
    }

    public static float parsePercentage(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long parseTimestampUs(String str) {
        String[] strArrSplitAtFirst = a1.splitAtFirst(str, "\\.");
        long j10 = 0;
        for (String str2 : a1.split(strArrSplitAtFirst[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrSplitAtFirst.length == 2) {
            String strTrim = strArrSplitAtFirst[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j11 += Long.parseLong(strTrim);
        }
        return j11 * 1000;
    }

    public static void validateWebvttHeaderLine(m0 m0Var) throws z0 {
        int position = m0Var.getPosition();
        if (isWebvttHeaderLine(m0Var)) {
            return;
        }
        m0Var.setPosition(position);
        throw z0.createForMalformedContainer("Expected WEBVTT. Got " + m0Var.readLine(), null);
    }
}
