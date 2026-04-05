package of;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f79377a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher findNextCueHeader(v0 v0Var) {
        String line;
        while (true) {
            String line2 = v0Var.readLine();
            if (line2 == null) {
                return null;
            }
            if (f79377a.matcher(line2).matches()) {
                do {
                    line = v0Var.readLine();
                    if (line != null) {
                    }
                } while (!line.isEmpty());
            } else {
                Matcher matcher = h.f79358a.matcher(line2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean isWebvttHeaderLine(v0 v0Var) {
        String line = v0Var.readLine();
        return line != null && line.startsWith("WEBVTT");
    }

    public static float parsePercentage(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long parseTimestampUs(String str) throws NumberFormatException {
        String[] strArrSplitAtFirst = n1.splitAtFirst(str, "\\.");
        long j10 = 0;
        for (String str2 : n1.split(strArrSplitAtFirst[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrSplitAtFirst.length == 2) {
            j11 += Long.parseLong(strArrSplitAtFirst[1]);
        }
        return j11 * 1000;
    }

    public static void validateWebvttHeaderLine(v0 v0Var) throws h2 {
        int position = v0Var.getPosition();
        if (isWebvttHeaderLine(v0Var)) {
            return;
        }
        v0Var.setPosition(position);
        throw h2.createForMalformedContainer("Expected WEBVTT. Got " + v0Var.readLine(), null);
    }
}
