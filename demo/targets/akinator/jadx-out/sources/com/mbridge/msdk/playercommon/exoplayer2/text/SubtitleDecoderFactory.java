package com.mbridge.msdk.playercommon.exoplayer2.text;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.text.cea.Cea608Decoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.cea.Cea708Decoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.dvb.DvbDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.pgs.PgsDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.ssa.SsaDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.subrip.SubripDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.tx3g.Tx3gDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.webvtt.Mp4WebvttDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.webvtt.WebvttDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface SubtitleDecoderFactory {
    public static final SubtitleDecoderFactory DEFAULT = new SubtitleDecoderFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderFactory.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderFactory
        public SubtitleDecoder createDecoder(Format format) {
            String str = format.sampleMimeType;
            str.getClass();
            switch (str) {
                case "application/dvbsubs":
                    return new DvbDecoder(format.initializationData);
                case "application/pgs":
                    return new PgsDecoder();
                case "application/x-mp4-vtt":
                    return new Mp4WebvttDecoder();
                case "text/vtt":
                    return new WebvttDecoder();
                case "application/x-quicktime-tx3g":
                    return new Tx3gDecoder(format.initializationData);
                case "text/x-ssa":
                    return new SsaDecoder(format.initializationData);
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    return new Cea608Decoder(format.sampleMimeType, format.accessibilityChannel);
                case "application/cea-708":
                    return new Cea708Decoder(format.accessibilityChannel);
                case "application/x-subrip":
                    return new SubripDecoder();
                case "application/ttml+xml":
                    return new TtmlDecoder();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderFactory
        public boolean supportsFormat(Format format) {
            String str = format.sampleMimeType;
            return PcrIk.gJdr.equals(str) || MimeTypes.TEXT_SSA.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str) || MimeTypes.APPLICATION_PGS.equals(str);
        }
    };

    SubtitleDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
