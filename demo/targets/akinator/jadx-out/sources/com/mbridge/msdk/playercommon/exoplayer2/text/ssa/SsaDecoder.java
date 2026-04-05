package com.mbridge.msdk.playercommon.exoplayer2.text.ssa;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.LongArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SsaDecoder extends SimpleSubtitleDecoder {
    private static final String DIALOGUE_LINE_PREFIX = "Dialogue: ";
    private static final String FORMAT_LINE_PREFIX = "Format: ";
    private static final Pattern SSA_TIMECODE_PATTERN = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
    private static final String TAG = "SsaDecoder";
    private int formatEndIndex;
    private int formatKeyCount;
    private int formatStartIndex;
    private int formatTextIndex;
    private final boolean haveInitializationData;

    public SsaDecoder() {
        this(null);
    }

    private void parseDialogueLine(String str, List<Cue> list, LongArray longArray) {
        long timecodeUs;
        if (this.formatKeyCount == 0) {
            Log.w(TAG, "Skipping dialogue line before complete format: " + str);
            return;
        }
        String[] strArrSplit = str.substring(10).split(",", this.formatKeyCount);
        if (strArrSplit.length != this.formatKeyCount) {
            Log.w(TAG, "Skipping dialogue line with fewer columns than format: ".concat(str));
            return;
        }
        long timecodeUs2 = parseTimecodeUs(strArrSplit[this.formatStartIndex]);
        if (timecodeUs2 == C.TIME_UNSET) {
            Log.w(TAG, "Skipping invalid timing: ".concat(str));
            return;
        }
        String str2 = strArrSplit[this.formatEndIndex];
        if (str2.trim().isEmpty()) {
            timecodeUs = -9223372036854775807L;
        } else {
            timecodeUs = parseTimecodeUs(str2);
            if (timecodeUs == C.TIME_UNSET) {
                Log.w(TAG, "Skipping invalid timing: ".concat(str));
                return;
            }
        }
        list.add(new Cue(strArrSplit[this.formatTextIndex].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
        longArray.add(timecodeUs2);
        if (timecodeUs != C.TIME_UNSET) {
            list.add(null);
            longArray.add(timecodeUs);
        }
    }

    private void parseEventBody(ParsableByteArray parsableByteArray, List<Cue> list, LongArray longArray) {
        while (true) {
            String line = parsableByteArray.readLine();
            if (line == null) {
                return;
            }
            if (!this.haveInitializationData && line.startsWith(FORMAT_LINE_PREFIX)) {
                parseFormatLine(line);
            } else if (line.startsWith(DIALOGUE_LINE_PREFIX)) {
                parseDialogueLine(line, list, longArray);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void parseFormatLine(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 8
            java.lang.String r6 = r6.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r6 = android.text.TextUtils.split(r6, r0)
            int r0 = r6.length
            r5.formatKeyCount = r0
            r0 = -1
            r5.formatStartIndex = r0
            r5.formatEndIndex = r0
            r5.formatTextIndex = r0
            r1 = 0
            r2 = r1
        L18:
            int r3 = r5.formatKeyCount
            if (r2 >= r3) goto L61
            r3 = r6[r2]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.toLowerInvariant(r3)
            r3.getClass()
            int r4 = r3.hashCode()
            switch(r4) {
                case 100571: goto L48;
                case 3556653: goto L3d;
                case 109757538: goto L32;
                default: goto L30;
            }
        L30:
            r3 = r0
            goto L52
        L32:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L3b
            goto L30
        L3b:
            r3 = 2
            goto L52
        L3d:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L46
            goto L30
        L46:
            r3 = 1
            goto L52
        L48:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L51
            goto L30
        L51:
            r3 = r1
        L52:
            switch(r3) {
                case 0: goto L5c;
                case 1: goto L59;
                case 2: goto L56;
                default: goto L55;
            }
        L55:
            goto L5e
        L56:
            r5.formatStartIndex = r2
            goto L5e
        L59:
            r5.formatTextIndex = r2
            goto L5e
        L5c:
            r5.formatEndIndex = r2
        L5e:
            int r2 = r2 + 1
            goto L18
        L61:
            int r6 = r5.formatStartIndex
            if (r6 == r0) goto L6f
            int r6 = r5.formatEndIndex
            if (r6 == r0) goto L6f
            int r6 = r5.formatTextIndex
            if (r6 != r0) goto L6e
            goto L6f
        L6e:
            return
        L6f:
            r5.formatKeyCount = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.text.ssa.SsaDecoder.parseFormatLine(java.lang.String):void");
    }

    private void parseHeader(ParsableByteArray parsableByteArray) {
        String line;
        do {
            line = parsableByteArray.readLine();
            if (line == null) {
                return;
            }
        } while (!line.startsWith("[Events]"));
    }

    public static long parseTimecodeUs(String str) {
        Matcher matcher = SSA_TIMECODE_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(matcher.group(1)) * 3600000000L);
    }

    public SsaDecoder(List<byte[]> list) {
        super(TAG);
        if (list == null || list.isEmpty()) {
            this.haveInitializationData = false;
            return;
        }
        this.haveInitializationData = true;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(list.get(0));
        Assertions.checkArgument(strFromUtf8Bytes.startsWith(FORMAT_LINE_PREFIX));
        parseFormatLine(strFromUtf8Bytes);
        parseHeader(new ParsableByteArray(list.get(1)));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder
    public SsaSubtitle decode(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        LongArray longArray = new LongArray();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i10);
        if (!this.haveInitializationData) {
            parseHeader(parsableByteArray);
        }
        parseEventBody(parsableByteArray, arrayList, longArray);
        Cue[] cueArr = new Cue[arrayList.size()];
        arrayList.toArray(cueArr);
        return new SsaSubtitle(cueArr, longArray.toArray());
    }
}
