package com.mbridge.msdk.playercommon.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.explorestack.protobuf.openrtb.LossReason;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleOutputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.vungle.ads.internal.protos.Sdk;
import e3.g;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Cea608Decoder extends CeaDecoder {
    private static final int CC_FIELD_FLAG = 1;
    private static final byte CC_IMPLICIT_DATA_HEADER = -4;
    private static final int CC_MODE_PAINT_ON = 3;
    private static final int CC_MODE_POP_ON = 2;
    private static final int CC_MODE_ROLL_UP = 1;
    private static final int CC_MODE_UNKNOWN = 0;
    private static final int CC_TYPE_FLAG = 2;
    private static final int CC_VALID_608_ID = 4;
    private static final int CC_VALID_FLAG = 4;
    private static final byte CTRL_BACKSPACE = 33;
    private static final byte CTRL_CARRIAGE_RETURN = 45;
    private static final byte CTRL_DELETE_TO_END_OF_ROW = 36;
    private static final byte CTRL_END_OF_CAPTION = 47;
    private static final byte CTRL_ERASE_DISPLAYED_MEMORY = 44;
    private static final byte CTRL_ERASE_NON_DISPLAYED_MEMORY = 46;
    private static final byte CTRL_RESUME_CAPTION_LOADING = 32;
    private static final byte CTRL_RESUME_DIRECT_CAPTIONING = 41;
    private static final byte CTRL_ROLL_UP_CAPTIONS_2_ROWS = 37;
    private static final byte CTRL_ROLL_UP_CAPTIONS_3_ROWS = 38;
    private static final byte CTRL_ROLL_UP_CAPTIONS_4_ROWS = 39;
    private static final int DEFAULT_CAPTIONS_ROW_COUNT = 4;
    private static final int NTSC_CC_FIELD_1 = 0;
    private static final int NTSC_CC_FIELD_2 = 1;
    private static final int STYLE_ITALICS = 7;
    private static final int STYLE_UNCHANGED = 8;
    private int captionMode;
    private int captionRowCount;
    private List<Cue> cues;
    private List<Cue> lastCues;
    private final int packetLength;
    private byte repeatableControlCc1;
    private byte repeatableControlCc2;
    private boolean repeatableControlSet;
    private final int selectedField;
    private static final int[] ROW_INDICES = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] COLUMN_INDICES = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] STYLE_COLORS = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] BASIC_CHARACTER_SET = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 231, 247, 209, 241, 9632};
    private static final int[] SPECIAL_CHARACTER_SET = {174, 176, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    private static final int[] SPECIAL_ES_FR_CHARACTER_SET = {193, 201, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, PsExtractor.AUDIO_STREAM, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    private static final int[] SPECIAL_PT_DE_CHARACTER_SET = {195, 227, 205, 204, 236, 210, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 92, 94, 95, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 126, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    private final ParsableByteArray ccData = new ParsableByteArray();
    private final ArrayList<CueBuilder> cueBuilders = new ArrayList<>();
    private CueBuilder currentCueBuilder = new CueBuilder(0, 4);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class CueBuilder {
        private static final int BASE_ROW = 15;
        private static final int SCREEN_CHARWIDTH = 32;
        private int captionMode;
        private int captionRowCount;
        private int indent;
        private int row;
        private int tabOffset;
        private final List<CueStyle> cueStyles = new ArrayList();
        private final List<SpannableString> rolledUpCaptions = new ArrayList();
        private final StringBuilder captionStringBuilder = new StringBuilder();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class CueStyle {
            public int start;
            public final int style;
            public final boolean underline;

            public CueStyle(int i10, boolean z10, int i11) {
                this.style = i10;
                this.underline = z10;
                this.start = i11;
            }
        }

        public CueBuilder(int i10, int i11) {
            reset(i10);
            setCaptionRowCount(i11);
        }

        private static void setColorSpan(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        private static void setItalicSpan(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            g.s(2, spannableStringBuilder, i10, i11, 33);
        }

        private static void setUnderlineSpan(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            g.u(spannableStringBuilder, i10, i11, 33);
        }

        public void append(char c10) {
            this.captionStringBuilder.append(c10);
        }

        public void backspace() {
            int length = this.captionStringBuilder.length();
            if (length > 0) {
                this.captionStringBuilder.delete(length - 1, length);
                for (int size = this.cueStyles.size() - 1; size >= 0; size--) {
                    CueStyle cueStyle = this.cueStyles.get(size);
                    int i10 = cueStyle.start;
                    if (i10 != length) {
                        return;
                    }
                    cueStyle.start = i10 - 1;
                }
            }
        }

        public Cue build() {
            float f10;
            int i10;
            int i11;
            int i12;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.rolledUpCaptions.size(); i13++) {
                spannableStringBuilder.append((CharSequence) this.rolledUpCaptions.get(i13));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) buildSpannableString());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i14 = this.indent + this.tabOffset;
            int length = (32 - i14) - spannableStringBuilder.length();
            int i15 = i14 - length;
            int i16 = 2;
            if (this.captionMode == 2 && (Math.abs(i15) < 3 || length < 0)) {
                f10 = 0.5f;
                i10 = 2;
                i16 = 1;
            } else if (this.captionMode != 2 || i15 <= 0) {
                f10 = ((i14 / 32.0f) * 0.8f) + 0.1f;
                i10 = 2;
                i16 = 0;
            } else {
                f10 = (((32 - length) / 32.0f) * 0.8f) + 0.1f;
                i10 = 2;
            }
            if (this.captionMode == 1 || (i11 = this.row) > 7) {
                i11 = this.row - 17;
                i12 = i10;
            } else {
                i12 = 0;
            }
            return new Cue(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i11, 1, i12, f10, i16, Float.MIN_VALUE);
        }

        public SpannableString buildSpannableString() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.captionStringBuilder);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.cueStyles.size()) {
                CueStyle cueStyle = this.cueStyles.get(i14);
                boolean z11 = cueStyle.underline;
                int i16 = cueStyle.style;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = Cea608Decoder.STYLE_COLORS[i16];
                    }
                    z10 = z12;
                }
                int i17 = cueStyle.start;
                i14++;
                if (i17 != (i14 < this.cueStyles.size() ? this.cueStyles.get(i14).start : length)) {
                    if (i10 != -1 && !z11) {
                        setUnderlineSpan(spannableStringBuilder, i10, i17);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        setItalicSpan(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        setColorSpan(spannableStringBuilder, i15, i17, i12);
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                setUnderlineSpan(spannableStringBuilder, i10, length);
            }
            if (i11 != -1 && i11 != length) {
                setItalicSpan(spannableStringBuilder, i11, length);
            }
            if (i15 != length) {
                setColorSpan(spannableStringBuilder, i15, length, i12);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public int getRow() {
            return this.row;
        }

        public boolean isEmpty() {
            return this.cueStyles.isEmpty() && this.rolledUpCaptions.isEmpty() && this.captionStringBuilder.length() == 0;
        }

        public void reset(int i10) {
            this.captionMode = i10;
            this.cueStyles.clear();
            this.rolledUpCaptions.clear();
            this.captionStringBuilder.setLength(0);
            this.row = 15;
            this.indent = 0;
            this.tabOffset = 0;
        }

        public void rollUp() {
            this.rolledUpCaptions.add(buildSpannableString());
            this.captionStringBuilder.setLength(0);
            this.cueStyles.clear();
            int iMin = Math.min(this.captionRowCount, this.row);
            while (this.rolledUpCaptions.size() >= iMin) {
                this.rolledUpCaptions.remove(0);
            }
        }

        public void setCaptionRowCount(int i10) {
            this.captionRowCount = i10;
        }

        public void setIndent(int i10) {
            this.indent = i10;
        }

        public void setRow(int i10) {
            this.row = i10;
        }

        public void setStyle(int i10, boolean z10) {
            this.cueStyles.add(new CueStyle(i10, z10, this.captionStringBuilder.length()));
        }

        public void setTab(int i10) {
            this.tabOffset = i10;
        }

        public String toString() {
            return this.captionStringBuilder.toString();
        }
    }

    public Cea608Decoder(String str, int i10) {
        this.packetLength = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i10 == 3 || i10 == 4) {
            this.selectedField = 2;
        } else {
            this.selectedField = 1;
        }
        setCaptionMode(0);
        resetCueBuilders();
    }

    private static char getChar(byte b10) {
        return (char) BASIC_CHARACTER_SET[(b10 & AbstractJsonLexerKt.TC_INVALID) - 32];
    }

    private List<Cue> getDisplayCues() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.cueBuilders.size(); i10++) {
            Cue cueBuild = this.cueBuilders.get(i10).build();
            if (cueBuild != null) {
                arrayList.add(cueBuild);
            }
        }
        return arrayList;
    }

    private static char getExtendedEsFrChar(byte b10) {
        return (char) SPECIAL_ES_FR_CHARACTER_SET[b10 & 31];
    }

    private static char getExtendedPtDeChar(byte b10) {
        return (char) SPECIAL_PT_DE_CHARACTER_SET[b10 & 31];
    }

    private static char getSpecialChar(byte b10) {
        return (char) SPECIAL_CHARACTER_SET[b10 & 15];
    }

    private boolean handleCtrl(byte b10, byte b11) {
        boolean zIsRepeatable = isRepeatable(b10);
        if (zIsRepeatable) {
            if (this.repeatableControlSet && this.repeatableControlCc1 == b10 && this.repeatableControlCc2 == b11) {
                this.repeatableControlSet = false;
                return true;
            }
            this.repeatableControlSet = true;
            this.repeatableControlCc1 = b10;
            this.repeatableControlCc2 = b11;
        }
        if (isMidrowCtrlCode(b10, b11)) {
            handleMidrowCtrl(b11);
            return zIsRepeatable;
        }
        if (isPreambleAddressCode(b10, b11)) {
            handlePreambleAddressCode(b10, b11);
            return zIsRepeatable;
        }
        if (isTabCtrlCode(b10, b11)) {
            this.currentCueBuilder.setTab(b11 - 32);
            return zIsRepeatable;
        }
        if (isMiscCode(b10, b11)) {
            handleMiscCode(b11);
        }
        return zIsRepeatable;
    }

    private void handleMidrowCtrl(byte b10) {
        this.currentCueBuilder.append(' ');
        this.currentCueBuilder.setStyle((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private void handleMiscCode(byte b10) {
        if (b10 == 32) {
            setCaptionMode(2);
            return;
        }
        if (b10 == 41) {
            setCaptionMode(3);
            return;
        }
        switch (b10) {
            case 37:
                setCaptionMode(1);
                setCaptionRowCount(2);
                break;
            case 38:
                setCaptionMode(1);
                setCaptionRowCount(3);
                break;
            case 39:
                setCaptionMode(1);
                setCaptionRowCount(4);
                break;
            default:
                int i10 = this.captionMode;
                if (i10 != 0) {
                    if (b10 == 33) {
                        this.currentCueBuilder.backspace();
                        break;
                    } else {
                        switch (b10) {
                            case 44:
                                this.cues = null;
                                if (i10 == 1 || i10 == 3) {
                                    resetCueBuilders();
                                    break;
                                }
                            case 45:
                                if (i10 == 1 && !this.currentCueBuilder.isEmpty()) {
                                    this.currentCueBuilder.rollUp();
                                    break;
                                }
                                break;
                            case 46:
                                resetCueBuilders();
                                break;
                            case 47:
                                this.cues = getDisplayCues();
                                resetCueBuilders();
                                break;
                        }
                    }
                }
                break;
        }
    }

    private void handlePreambleAddressCode(byte b10, byte b11) {
        int i10 = ROW_INDICES[b10 & 7];
        if ((b11 & CTRL_RESUME_CAPTION_LOADING) != 0) {
            i10++;
        }
        if (i10 != this.currentCueBuilder.getRow()) {
            if (this.captionMode != 1 && !this.currentCueBuilder.isEmpty()) {
                CueBuilder cueBuilder = new CueBuilder(this.captionMode, this.captionRowCount);
                this.currentCueBuilder = cueBuilder;
                this.cueBuilders.add(cueBuilder);
            }
            this.currentCueBuilder.setRow(i10);
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.currentCueBuilder.setStyle(z10 ? 8 : i11, z11);
        if (z10) {
            this.currentCueBuilder.setIndent(COLUMN_INDICES[i11]);
        }
    }

    private static boolean isMidrowCtrlCode(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean isMiscCode(byte b10, byte b11) {
        return (b10 & 247) == 20 && (b11 & 240) == 32;
    }

    private static boolean isPreambleAddressCode(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean isRepeatable(byte b10) {
        return (b10 & 240) == 16;
    }

    private static boolean isTabCtrlCode(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private void resetCueBuilders() {
        this.currentCueBuilder.reset(this.captionMode);
        this.cueBuilders.clear();
        this.cueBuilders.add(this.currentCueBuilder);
    }

    private void setCaptionMode(int i10) {
        int i11 = this.captionMode;
        if (i11 == i10) {
            return;
        }
        this.captionMode = i10;
        resetCueBuilders();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.cues = null;
        }
    }

    private void setCaptionRowCount(int i10) {
        this.captionRowCount = i10;
        this.currentCueBuilder.setCaptionRowCount(i10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder
    public Subtitle createSubtitle() {
        List<Cue> list = this.cues;
        this.lastCues = list;
        return new CeaSubtitle(list);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder
    public void decode(SubtitleInputBuffer subtitleInputBuffer) {
        int i10;
        this.ccData.reset(subtitleInputBuffer.data.array(), subtitleInputBuffer.data.limit());
        boolean z10 = false;
        boolean zHandleCtrl = false;
        while (true) {
            int iBytesLeft = this.ccData.bytesLeft();
            int i11 = this.packetLength;
            if (iBytesLeft < i11) {
                break;
            }
            byte unsignedByte = i11 == 2 ? CC_IMPLICIT_DATA_HEADER : (byte) this.ccData.readUnsignedByte();
            byte unsignedByte2 = (byte) (this.ccData.readUnsignedByte() & 127);
            byte unsignedByte3 = (byte) (this.ccData.readUnsignedByte() & 127);
            if ((unsignedByte & 6) == 4 && ((i10 = this.selectedField) != 1 || (unsignedByte & 1) == 0)) {
                if (i10 != 2 || (unsignedByte & 1) == 1) {
                    if (unsignedByte2 != 0 || unsignedByte3 != 0) {
                        if ((unsignedByte2 & 247) == 17 && (unsignedByte3 & 240) == 48) {
                            this.currentCueBuilder.append(getSpecialChar(unsignedByte3));
                        } else if ((unsignedByte2 & 246) == 18 && (unsignedByte3 & 224) == 32) {
                            this.currentCueBuilder.backspace();
                            if ((unsignedByte2 & 1) == 0) {
                                this.currentCueBuilder.append(getExtendedEsFrChar(unsignedByte3));
                            } else {
                                this.currentCueBuilder.append(getExtendedPtDeChar(unsignedByte3));
                            }
                        } else if ((unsignedByte2 & 224) == 0) {
                            zHandleCtrl = handleCtrl(unsignedByte2, unsignedByte3);
                        } else {
                            this.currentCueBuilder.append(getChar(unsignedByte2));
                            if ((unsignedByte3 & 224) != 0) {
                                this.currentCueBuilder.append(getChar(unsignedByte3));
                            }
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            if (!zHandleCtrl) {
                this.repeatableControlSet = false;
            }
            int i12 = this.captionMode;
            if (i12 == 1 || i12 == 3) {
                this.cues = getDisplayCues();
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder, com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        return super.dequeueInputBuffer();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder, com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        return super.dequeueOutputBuffer();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder, com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public void flush() {
        super.flush();
        this.cues = null;
        this.lastCues = null;
        setCaptionMode(0);
        setCaptionRowCount(4);
        resetCueBuilders();
        this.repeatableControlSet = false;
        this.repeatableControlCc1 = (byte) 0;
        this.repeatableControlCc2 = (byte) 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder, com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public String getName() {
        return "Cea608Decoder";
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder
    public boolean isNewSubtitleDataAvailable() {
        return this.cues != this.lastCues;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
        super.queueInputBuffer(subtitleInputBuffer);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder, com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long j10) {
        super.setPositionUs(j10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder, com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public void release() {
    }
}
