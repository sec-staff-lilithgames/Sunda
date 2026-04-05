package com.mbridge.msdk.playercommon.exoplayer2.text.webvtt;

import a.b;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class WebvttParserUtil {
    private static final Pattern COMMENT = Pattern.compile("^NOTE(( |\t).*)?$");
    private static final Pattern HEADER = Pattern.compile("^\ufeff?WEBVTT(( |\t).*)?$");

    private WebvttParserUtil() {
    }

    public static Matcher findNextCueHeader(ParsableByteArray parsableByteArray) {
        String line;
        while (true) {
            String line2 = parsableByteArray.readLine();
            if (line2 == null) {
                return null;
            }
            if (COMMENT.matcher(line2).matches()) {
                do {
                    line = parsableByteArray.readLine();
                    if (line != null) {
                    }
                } while (!line.isEmpty());
            } else {
                Matcher matcher = WebvttCueParser.CUE_HEADER_PATTERN.matcher(line2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static float parsePercentage(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static void validateWebvttHeaderLine(ParsableByteArray parsableByteArray) throws SubtitleDecoderException {
        String line = parsableByteArray.readLine();
        if (line == null || !HEADER.matcher(line).matches()) {
            throw new SubtitleDecoderException(b.k("Expected WEBVTT. Got ", line));
        }
    }

    public static long parseTimestampUs(String str) throws NumberFormatException {
        String[] strArrSplitAtFirst = Util.splitAtFirst(str, wHkgq.VehpLfCpW);
        long j10 = 0;
        for (String str2 : Util.split(strArrSplitAtFirst[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrSplitAtFirst.length == 2) {
            j11 += Long.parseLong(strArrSplitAtFirst[1]);
        }
        return j11 * 1000;
    }
}
