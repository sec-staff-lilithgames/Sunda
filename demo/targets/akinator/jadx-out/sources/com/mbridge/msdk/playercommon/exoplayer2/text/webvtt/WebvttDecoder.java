package com.mbridge.msdk.playercommon.exoplayer2.text.webvtt;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.text.webvtt.WebvttCue;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class WebvttDecoder extends SimpleSubtitleDecoder {
    private static final String COMMENT_START = "NOTE";
    private static final int EVENT_COMMENT = 1;
    private static final int EVENT_CUE = 3;
    private static final int EVENT_END_OF_FILE = 0;
    private static final int EVENT_NONE = -1;
    private static final int EVENT_STYLE_BLOCK = 2;
    private static final String STYLE_START = "STYLE";
    private final CssParser cssParser;
    private final WebvttCueParser cueParser;
    private final List<WebvttCssStyle> definedStyles;
    private final ParsableByteArray parsableWebvttData;
    private final WebvttCue.Builder webvttCueBuilder;

    public WebvttDecoder() {
        super("WebvttDecoder");
        this.cueParser = new WebvttCueParser();
        this.parsableWebvttData = new ParsableByteArray();
        this.webvttCueBuilder = new WebvttCue.Builder();
        this.cssParser = new CssParser();
        this.definedStyles = new ArrayList();
    }

    private static int getNextEvent(ParsableByteArray parsableByteArray) {
        int i10 = -1;
        int position = 0;
        while (i10 == -1) {
            position = parsableByteArray.getPosition();
            String line = parsableByteArray.readLine();
            i10 = line == null ? 0 : STYLE_START.equals(line) ? 2 : COMMENT_START.startsWith(line) ? 1 : 3;
        }
        parsableByteArray.setPosition(position);
        return i10;
    }

    private static void skipComment(ParsableByteArray parsableByteArray) {
        while (!TextUtils.isEmpty(parsableByteArray.readLine())) {
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder
    public WebvttSubtitle decode(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.parsableWebvttData.reset(bArr, i10);
        this.webvttCueBuilder.reset();
        this.definedStyles.clear();
        WebvttParserUtil.validateWebvttHeaderLine(this.parsableWebvttData);
        while (!TextUtils.isEmpty(this.parsableWebvttData.readLine())) {
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            int nextEvent = getNextEvent(this.parsableWebvttData);
            if (nextEvent == 0) {
                return new WebvttSubtitle(arrayList);
            }
            if (nextEvent == 1) {
                skipComment(this.parsableWebvttData);
            } else if (nextEvent == 2) {
                if (!arrayList.isEmpty()) {
                    throw new SubtitleDecoderException("A style block was found after the first cue.");
                }
                this.parsableWebvttData.readLine();
                WebvttCssStyle block = this.cssParser.parseBlock(this.parsableWebvttData);
                if (block != null) {
                    this.definedStyles.add(block);
                }
            } else if (nextEvent == 3 && this.cueParser.parseCue(this.parsableWebvttData, this.webvttCueBuilder, this.definedStyles)) {
                arrayList.add(this.webvttCueBuilder.build());
                this.webvttCueBuilder.reset();
            }
        }
    }
}
