package com.mbridge.msdk.playercommon.exoplayer2.video;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.amazon.device.ads.DtbConstants;
import com.inmobi.commons.core.configs.CrashConfig;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderCounters;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager;
import com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecSelector;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaFormatUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.TraceUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.mbridge.msdk.playercommon.exoplayer2.video.VideoRendererEventListener;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MediaCodecVideoRenderer extends MediaCodecRenderer {
    private static final String KEY_CROP_BOTTOM = "crop-bottom";
    private static final String KEY_CROP_LEFT = "crop-left";
    private static final String KEY_CROP_RIGHT = "crop-right";
    private static final String KEY_CROP_TOP = "crop-top";
    private static final int MAX_PENDING_OUTPUT_STREAM_OFFSET_COUNT = 10;
    private static final int[] STANDARD_LONG_EDGE_VIDEO_PX = {1920, 1600, 1440, 1280, 960, 854, 640, 540, DtbConstants.DEFAULT_PLAYER_HEIGHT};
    private static final String TAG = "MediaCodecVideoRenderer";
    private static boolean deviceNeedsSetOutputSurfaceWorkaround;
    private static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;
    private final long allowedJoiningTimeMs;
    private int buffersInCodecCount;
    private CodecMaxValues codecMaxValues;
    private boolean codecNeedsSetOutputSurfaceWorkaround;
    private int consecutiveDroppedFrameCount;
    private final Context context;
    private int currentHeight;
    private float currentPixelWidthHeightRatio;
    private int currentUnappliedRotationDegrees;
    private int currentWidth;
    private final boolean deviceNeedsAutoFrcWorkaround;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private Surface dummySurface;
    private final VideoRendererEventListener.EventDispatcher eventDispatcher;
    private final VideoFrameReleaseTimeHelper frameReleaseTimeHelper;
    private long initialPositionUs;
    private long joiningDeadlineMs;
    private long lastInputTimeUs;
    private long lastRenderTimeUs;
    private final int maxDroppedFramesToNotify;
    private long outputStreamOffsetUs;
    private int pendingOutputStreamOffsetCount;
    private final long[] pendingOutputStreamOffsetsUs;
    private final long[] pendingOutputStreamSwitchTimesUs;
    private float pendingPixelWidthHeightRatio;
    private int pendingRotationDegrees;
    private boolean renderedFirstFrame;
    private int reportedHeight;
    private float reportedPixelWidthHeightRatio;
    private int reportedUnappliedRotationDegrees;
    private int reportedWidth;
    private int scalingMode;
    private Surface surface;
    private boolean tunneling;
    private int tunnelingAudioSessionId;
    OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CodecMaxValues {
        public final int height;
        public final int inputSize;
        public final int width;

        public CodecMaxValues(int i10, int i11, int i12) {
            this.width = i10;
            this.height = i11;
            this.inputSize = i12;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class OnFrameRenderedListenerV23 implements MediaCodec.OnFrameRenderedListener {
        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this != mediaCodecVideoRenderer.tunnelingOnFrameRenderedListener) {
                return;
            }
            mediaCodecVideoRenderer.maybeNotifyRenderedFirstFrame();
        }

        private OnFrameRenderedListenerV23(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, 0L);
    }

    private static boolean areAdaptationCompatible(boolean z10, Format format, Format format2) {
        if (format.sampleMimeType.equals(format2.sampleMimeType) && format.rotationDegrees == format2.rotationDegrees) {
            return (z10 || (format.width == format2.width && format.height == format2.height)) && Util.areEqual(format.colorInfo, format2.colorInfo);
        }
        return false;
    }

    private void clearRenderedFirstFrame() {
        MediaCodec codec;
        this.renderedFirstFrame = false;
        if (Util.SDK_INT < 23 || !this.tunneling || (codec = getCodec()) == null) {
            return;
        }
        this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(codec);
    }

    private void clearReportedVideoSize() {
        this.reportedWidth = -1;
        this.reportedHeight = -1;
        this.reportedPixelWidthHeightRatio = -1.0f;
        this.reportedUnappliedRotationDegrees = -1;
    }

    private static void configureTunnelingV21(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    private static boolean deviceNeedsAutoFrcWorkaround() {
        return Util.SDK_INT <= 22 && "foster".equals(Util.DEVICE) && "NVIDIA".equals(Util.MANUFACTURER);
    }

    private static Point getCodecMaxSize(MediaCodecInfo mediaCodecInfo, Format format) throws MediaCodecUtil.DecoderQueryException {
        int i10 = format.height;
        int i11 = format.width;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : STANDARD_LONG_EDGE_VIDEO_PX) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (Util.SDK_INT >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point pointAlignVideoSizeV21 = mediaCodecInfo.alignVideoSizeV21(i15, i13);
                if (mediaCodecInfo.isVideoSizeAndRateSupportedV21(pointAlignVideoSizeV21.x, pointAlignVideoSizeV21.y, format.frameRate)) {
                    return pointAlignVideoSizeV21;
                }
            } else {
                int iCeilDivide = Util.ceilDivide(i13, 16) * 16;
                int iCeilDivide2 = Util.ceilDivide(i14, 16) * 16;
                if (iCeilDivide * iCeilDivide2 <= MediaCodecUtil.maxH264DecodableFrameSize()) {
                    int i16 = z10 ? iCeilDivide2 : iCeilDivide;
                    if (!z10) {
                        iCeilDivide = iCeilDivide2;
                    }
                    return new Point(i16, iCeilDivide);
                }
            }
        }
        return null;
    }

    private static int getMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        if (format.maxInputSize == -1) {
            return getMaxInputSize(mediaCodecInfo, format.sampleMimeType, format.width, format.height);
        }
        int size = format.initializationData.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += format.initializationData.get(i10).length;
        }
        return format.maxInputSize + length;
    }

    private static boolean isBufferLate(long j10) {
        return j10 < -30000;
    }

    private static boolean isBufferVeryLate(long j10) {
        return j10 < -500000;
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, jElapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = jElapsedRealtime;
        }
    }

    private void maybeNotifyVideoSizeChanged() {
        int i10 = this.currentWidth;
        if (i10 == -1 && this.currentHeight == -1) {
            return;
        }
        if (this.reportedWidth == i10 && this.reportedHeight == this.currentHeight && this.reportedUnappliedRotationDegrees == this.currentUnappliedRotationDegrees && this.reportedPixelWidthHeightRatio == this.currentPixelWidthHeightRatio) {
            return;
        }
        this.eventDispatcher.videoSizeChanged(i10, this.currentHeight, this.currentUnappliedRotationDegrees, this.currentPixelWidthHeightRatio);
        this.reportedWidth = this.currentWidth;
        this.reportedHeight = this.currentHeight;
        this.reportedUnappliedRotationDegrees = this.currentUnappliedRotationDegrees;
        this.reportedPixelWidthHeightRatio = this.currentPixelWidthHeightRatio;
    }

    private void maybeRenotifyRenderedFirstFrame() {
        if (this.renderedFirstFrame) {
            this.eventDispatcher.renderedFirstFrame(this.surface);
        }
    }

    private void maybeRenotifyVideoSizeChanged() {
        int i10 = this.reportedWidth;
        if (i10 == -1 && this.reportedHeight == -1) {
            return;
        }
        this.eventDispatcher.videoSizeChanged(i10, this.reportedHeight, this.reportedUnappliedRotationDegrees, this.reportedPixelWidthHeightRatio);
    }

    private void setJoiningDeadlineMs() {
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? SystemClock.elapsedRealtime() + this.allowedJoiningTimeMs : C.TIME_UNSET;
    }

    private static void setOutputSurfaceV23(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    private void setSurface(Surface surface) throws ExoPlaybackException {
        if (surface == null) {
            Surface surface2 = this.dummySurface;
            if (surface2 != null) {
                surface = surface2;
            } else {
                MediaCodecInfo codecInfo = getCodecInfo();
                if (codecInfo != null && shouldUseDummySurface(codecInfo)) {
                    surface = DummySurface.newInstanceV17(this.context, codecInfo.secure);
                    this.dummySurface = surface;
                }
            }
        }
        if (this.surface == surface) {
            if (surface == null || surface == this.dummySurface) {
                return;
            }
            maybeRenotifyVideoSizeChanged();
            maybeRenotifyRenderedFirstFrame();
            return;
        }
        this.surface = surface;
        int state = getState();
        if (state == 1 || state == 2) {
            MediaCodec codec = getCodec();
            if (Util.SDK_INT < 23 || codec == null || surface == null || this.codecNeedsSetOutputSurfaceWorkaround) {
                releaseCodec();
                maybeInitCodec();
            } else {
                setOutputSurfaceV23(codec, surface);
            }
        }
        if (surface == null || surface == this.dummySurface) {
            clearReportedVideoSize();
            clearRenderedFirstFrame();
            return;
        }
        maybeRenotifyVideoSizeChanged();
        clearRenderedFirstFrame();
        if (state == 2) {
            setJoiningDeadlineMs();
        }
    }

    private boolean shouldUseDummySurface(MediaCodecInfo mediaCodecInfo) {
        if (Util.SDK_INT < 23 || this.tunneling || codecNeedsSetOutputSurfaceWorkaround(mediaCodecInfo.name)) {
            return false;
        }
        return !mediaCodecInfo.secure || DummySurface.isSecureSupported(this.context);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public int canKeepCodec(MediaCodec mediaCodec, MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        if (!areAdaptationCompatible(mediaCodecInfo.adaptive, format, format2)) {
            return 0;
        }
        int i10 = format2.width;
        CodecMaxValues codecMaxValues = this.codecMaxValues;
        if (i10 > codecMaxValues.width || format2.height > codecMaxValues.height || getMaxInputSize(mediaCodecInfo, format2) > this.codecMaxValues.inputSize) {
            return 0;
        }
        return format.initializationDataEquals(format2) ? 1 : 3;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void configureCodec(MediaCodecInfo mediaCodecInfo, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws MediaCodecUtil.DecoderQueryException {
        CodecMaxValues codecMaxValues = getCodecMaxValues(mediaCodecInfo, format, getStreamFormats());
        this.codecMaxValues = codecMaxValues;
        MediaFormat mediaFormat = getMediaFormat(format, codecMaxValues, this.deviceNeedsAutoFrcWorkaround, this.tunnelingAudioSessionId);
        if (this.surface == null) {
            Assertions.checkState(shouldUseDummySurface(mediaCodecInfo));
            if (this.dummySurface == null) {
                this.dummySurface = DummySurface.newInstanceV17(this.context, mediaCodecInfo.secure);
            }
            this.surface = this.dummySurface;
        }
        mediaCodec.configure(mediaFormat, this.surface, mediaCrypto, 0);
        if (Util.SDK_INT < 23 || !this.tunneling) {
            return;
        }
        this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(mediaCodec);
    }

    public void dropOutputBuffer(MediaCodec mediaCodec, int i10, long j10) {
        TraceUtil.beginSection("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i10, false);
        TraceUtil.endSection();
        updateDroppedBufferCounters(1);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void flushCodec() throws ExoPlaybackException {
        super.flushCodec();
        this.buffersInCodecCount = 0;
    }

    public CodecMaxValues getCodecMaxValues(MediaCodecInfo mediaCodecInfo, Format format, Format[] formatArr) throws MediaCodecUtil.DecoderQueryException {
        int iMax = format.width;
        int iMax2 = format.height;
        int maxInputSize = getMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            return new CodecMaxValues(iMax, iMax2, maxInputSize);
        }
        boolean z10 = false;
        for (Format format2 : formatArr) {
            if (areAdaptationCompatible(mediaCodecInfo.adaptive, format, format2)) {
                int i10 = format2.width;
                z10 |= i10 == -1 || format2.height == -1;
                iMax = Math.max(iMax, i10);
                iMax2 = Math.max(iMax2, format2.height);
                maxInputSize = Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, format2));
            }
        }
        if (z10) {
            Log.w(TAG, "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point codecMaxSize = getCodecMaxSize(mediaCodecInfo, format);
            if (codecMaxSize != null) {
                iMax = Math.max(iMax, codecMaxSize.x);
                iMax2 = Math.max(iMax2, codecMaxSize.y);
                maxInputSize = Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, format.sampleMimeType, iMax, iMax2));
                Log.w(TAG, "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new CodecMaxValues(iMax, iMax2, maxInputSize);
    }

    public MediaFormat getMediaFormat(Format format, CodecMaxValues codecMaxValues, boolean z10, int i10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", format.sampleMimeType);
        mediaFormat.setInteger("width", format.width);
        mediaFormat.setInteger("height", format.height);
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        MediaFormatUtil.maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "rotation-degrees", format.rotationDegrees);
        MediaFormatUtil.maybeSetColorInfo(mediaFormat, format.colorInfo);
        mediaFormat.setInteger("max-width", codecMaxValues.width);
        mediaFormat.setInteger("max-height", codecMaxValues.height);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", codecMaxValues.inputSize);
        if (Util.SDK_INT >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        }
        if (z10) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            configureTunnelingV21(mediaFormat, i10);
        }
        return mediaFormat;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer, com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i10, Object obj) throws ExoPlaybackException {
        if (i10 == 1) {
            setSurface((Surface) obj);
            return;
        }
        if (i10 != 4) {
            super.handleMessage(i10, obj);
            return;
        }
        this.scalingMode = ((Integer) obj).intValue();
        MediaCodec codec = getCodec();
        if (codec != null) {
            codec.setVideoScalingMode(this.scalingMode);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.renderedFirstFrame || (((surface = this.dummySurface) != null && this.surface == surface) || getCodec() == null || this.tunneling))) {
            this.joiningDeadlineMs = C.TIME_UNSET;
            return true;
        }
        if (this.joiningDeadlineMs == C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = C.TIME_UNSET;
        return false;
    }

    public boolean maybeDropBuffersToKeyframe(MediaCodec mediaCodec, int i10, long j10, long j11) throws ExoPlaybackException {
        int iSkipSource = skipSource(j11);
        if (iSkipSource == 0) {
            return false;
        }
        this.decoderCounters.droppedToKeyframeCount++;
        updateDroppedBufferCounters(this.buffersInCodecCount + iSkipSource);
        flushCodec();
        return true;
    }

    public void maybeNotifyRenderedFirstFrame() {
        if (this.renderedFirstFrame) {
            return;
        }
        this.renderedFirstFrame = true;
        this.eventDispatcher.renderedFirstFrame(this.surface);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onCodecInitialized(String str, long j10, long j11) {
        this.eventDispatcher.decoderInitialized(str, j10, j11);
        this.codecNeedsSetOutputSurfaceWorkaround = codecNeedsSetOutputSurfaceWorkaround(str);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onDisabled() {
        this.currentWidth = -1;
        this.currentHeight = -1;
        this.currentPixelWidthHeightRatio = -1.0f;
        this.pendingPixelWidthHeightRatio = -1.0f;
        this.outputStreamOffsetUs = C.TIME_UNSET;
        this.lastInputTimeUs = C.TIME_UNSET;
        this.pendingOutputStreamOffsetCount = 0;
        clearReportedVideoSize();
        clearRenderedFirstFrame();
        this.frameReleaseTimeHelper.disable();
        this.tunnelingOnFrameRenderedListener = null;
        this.tunneling = false;
        try {
            super.onDisabled();
        } finally {
            this.decoderCounters.ensureUpdated();
            this.eventDispatcher.disabled(this.decoderCounters);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onEnabled(boolean z10) throws ExoPlaybackException {
        super.onEnabled(z10);
        int i10 = getConfiguration().tunnelingAudioSessionId;
        this.tunnelingAudioSessionId = i10;
        this.tunneling = i10 != 0;
        this.eventDispatcher.enabled(this.decoderCounters);
        this.frameReleaseTimeHelper.enable();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onInputFormatChanged(Format format) throws ExoPlaybackException {
        super.onInputFormatChanged(format);
        this.eventDispatcher.inputFormatChanged(format);
        this.pendingPixelWidthHeightRatio = format.pixelWidthHeightRatio;
        this.pendingRotationDegrees = format.rotationDegrees;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z10 = mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP);
        this.currentWidth = z10 ? (mediaFormat.getInteger(KEY_CROP_RIGHT) - mediaFormat.getInteger(KEY_CROP_LEFT)) + 1 : mediaFormat.getInteger("width");
        int integer = z10 ? (mediaFormat.getInteger(KEY_CROP_BOTTOM) - mediaFormat.getInteger(KEY_CROP_TOP)) + 1 : mediaFormat.getInteger("height");
        this.currentHeight = integer;
        float f10 = this.pendingPixelWidthHeightRatio;
        this.currentPixelWidthHeightRatio = f10;
        if (Util.SDK_INT >= 21) {
            int i10 = this.pendingRotationDegrees;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.currentWidth;
                this.currentWidth = integer;
                this.currentHeight = i11;
                this.currentPixelWidthHeightRatio = 1.0f / f10;
            }
        } else {
            this.currentUnappliedRotationDegrees = this.pendingRotationDegrees;
        }
        mediaCodec.setVideoScalingMode(this.scalingMode);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onPositionReset(long j10, boolean z10) throws ExoPlaybackException {
        super.onPositionReset(j10, z10);
        clearRenderedFirstFrame();
        this.initialPositionUs = C.TIME_UNSET;
        this.consecutiveDroppedFrameCount = 0;
        this.lastInputTimeUs = C.TIME_UNSET;
        int i10 = this.pendingOutputStreamOffsetCount;
        if (i10 != 0) {
            this.outputStreamOffsetUs = this.pendingOutputStreamOffsetsUs[i10 - 1];
            this.pendingOutputStreamOffsetCount = 0;
        }
        if (z10) {
            setJoiningDeadlineMs();
        } else {
            this.joiningDeadlineMs = C.TIME_UNSET;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onProcessedOutputBuffer(long j10) {
        this.buffersInCodecCount--;
        while (true) {
            int i10 = this.pendingOutputStreamOffsetCount;
            if (i10 == 0 || j10 < this.pendingOutputStreamSwitchTimesUs[0]) {
                return;
            }
            long[] jArr = this.pendingOutputStreamOffsetsUs;
            this.outputStreamOffsetUs = jArr[0];
            int i11 = i10 - 1;
            this.pendingOutputStreamOffsetCount = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.pendingOutputStreamSwitchTimesUs;
            System.arraycopy(jArr2, 1, jArr2, 0, this.pendingOutputStreamOffsetCount);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        this.buffersInCodecCount++;
        this.lastInputTimeUs = Math.max(decoderInputBuffer.timeUs, this.lastInputTimeUs);
        if (Util.SDK_INT >= 23 || !this.tunneling) {
            return;
        }
        maybeNotifyRenderedFirstFrame();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onStarted() {
        super.onStarted();
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = SystemClock.elapsedRealtime();
        this.lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onStopped() {
        this.joiningDeadlineMs = C.TIME_UNSET;
        maybeNotifyDroppedFrames();
        super.onStopped();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j10) throws ExoPlaybackException {
        if (this.outputStreamOffsetUs == C.TIME_UNSET) {
            this.outputStreamOffsetUs = j10;
        } else {
            int i10 = this.pendingOutputStreamOffsetCount;
            if (i10 == this.pendingOutputStreamOffsetsUs.length) {
                Log.w(TAG, "Too many stream changes, so dropping offset: " + this.pendingOutputStreamOffsetsUs[this.pendingOutputStreamOffsetCount - 1]);
            } else {
                this.pendingOutputStreamOffsetCount = i10 + 1;
            }
            long[] jArr = this.pendingOutputStreamOffsetsUs;
            int i11 = this.pendingOutputStreamOffsetCount - 1;
            jArr[i11] = j10;
            this.pendingOutputStreamSwitchTimesUs[i11] = this.lastInputTimeUs;
        }
        super.onStreamChanged(formatArr, j10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean processOutputBuffer(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) throws InterruptedException, ExoPlaybackException {
        MediaCodec mediaCodec2;
        long j13;
        if (this.initialPositionUs == C.TIME_UNSET) {
            this.initialPositionUs = j10;
        }
        long j14 = j12 - this.outputStreamOffsetUs;
        if (z10) {
            skipOutputBuffer(mediaCodec, i10, j14);
            return true;
        }
        long j15 = j12 - j10;
        if (this.surface == this.dummySurface) {
            if (!isBufferLate(j15)) {
                return false;
            }
            skipOutputBuffer(mediaCodec, i10, j14);
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        boolean z11 = getState() == 2;
        if (!this.renderedFirstFrame || (z11 && shouldForceRenderOutputBuffer(j15, jElapsedRealtime - this.lastRenderTimeUs))) {
            if (Util.SDK_INT >= 21) {
                renderOutputBufferV21(mediaCodec, i10, j14, System.nanoTime());
            } else {
                renderOutputBuffer(mediaCodec, i10, j14);
            }
            return true;
        }
        if (z11 && j10 != this.initialPositionUs) {
            long jNanoTime = System.nanoTime();
            long jAdjustReleaseTime = this.frameReleaseTimeHelper.adjustReleaseTime(j12, ((j15 - (jElapsedRealtime - j11)) * 1000) + jNanoTime);
            long j16 = (jAdjustReleaseTime - jNanoTime) / 1000;
            if (shouldDropBuffersToKeyframe(j16, j11)) {
                mediaCodec2 = mediaCodec;
                j13 = j14;
                if (maybeDropBuffersToKeyframe(mediaCodec2, i10, j13, j10)) {
                    return false;
                }
            } else {
                mediaCodec2 = mediaCodec;
                j13 = j14;
            }
            if (shouldDropOutputBuffer(j16, j11)) {
                dropOutputBuffer(mediaCodec2, i10, j13);
                return true;
            }
            if (Util.SDK_INT >= 21) {
                if (j16 < ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                    renderOutputBufferV21(mediaCodec2, i10, j13, jAdjustReleaseTime);
                    return true;
                }
            } else if (j16 < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                if (j16 > 11000) {
                    try {
                        Thread.sleep((j16 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                renderOutputBuffer(mediaCodec2, i10, j13);
                return true;
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void releaseCodec() {
        try {
            super.releaseCodec();
            this.buffersInCodecCount = 0;
            Surface surface = this.dummySurface;
            if (surface != null) {
                if (this.surface == surface) {
                    this.surface = null;
                }
                surface.release();
                this.dummySurface = null;
            }
        } catch (Throwable th2) {
            this.buffersInCodecCount = 0;
            if (this.dummySurface != null) {
                Surface surface2 = this.surface;
                Surface surface3 = this.dummySurface;
                if (surface2 == surface3) {
                    this.surface = null;
                }
                surface3.release();
                this.dummySurface = null;
            }
            throw th2;
        }
    }

    public void renderOutputBuffer(MediaCodec mediaCodec, int i10, long j10) {
        maybeNotifyVideoSizeChanged();
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, true);
        TraceUtil.endSection();
        this.lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000;
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        maybeNotifyRenderedFirstFrame();
    }

    public void renderOutputBufferV21(MediaCodec mediaCodec, int i10, long j10, long j11) {
        maybeNotifyVideoSizeChanged();
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, j11);
        TraceUtil.endSection();
        this.lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000;
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        maybeNotifyRenderedFirstFrame();
    }

    public boolean shouldDropBuffersToKeyframe(long j10, long j11) {
        return isBufferVeryLate(j10);
    }

    public boolean shouldDropOutputBuffer(long j10, long j11) {
        return isBufferLate(j10);
    }

    public boolean shouldForceRenderOutputBuffer(long j10, long j11) {
        return isBufferLate(j10) && j11 > 100000;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return this.surface != null || shouldUseDummySurface(mediaCodecInfo);
    }

    public void skipOutputBuffer(MediaCodec mediaCodec, int i10, long j10) {
        TraceUtil.beginSection("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i10, false);
        TraceUtil.endSection();
        this.decoderCounters.skippedOutputBufferCount++;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public int supportsFormat(MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, Format format) throws MediaCodecUtil.DecoderQueryException {
        boolean z10;
        int i10;
        int i11;
        String str = format.sampleMimeType;
        if (!MimeTypes.isVideo(str)) {
            return 0;
        }
        DrmInitData drmInitData = format.drmInitData;
        if (drmInitData != null) {
            z10 = false;
            for (int i12 = 0; i12 < drmInitData.schemeDataCount; i12++) {
                z10 |= drmInitData.get(i12).requiresSecureDecryption;
            }
        } else {
            z10 = false;
        }
        MediaCodecInfo decoderInfo = mediaCodecSelector.getDecoderInfo(str, z10);
        if (decoderInfo == null) {
            return (!z10 || mediaCodecSelector.getDecoderInfo(str, false) == null) ? 1 : 2;
        }
        if (!BaseRenderer.supportsFormatDrm(drmSessionManager, drmInitData)) {
            return 2;
        }
        boolean zIsCodecSupported = decoderInfo.isCodecSupported(format.codecs);
        if (zIsCodecSupported && (i10 = format.width) > 0 && (i11 = format.height) > 0) {
            if (Util.SDK_INT >= 21) {
                zIsCodecSupported = decoderInfo.isVideoSizeAndRateSupportedV21(i10, i11, format.frameRate);
            } else {
                boolean z11 = i10 * i11 <= MediaCodecUtil.maxH264DecodableFrameSize();
                if (!z11) {
                    Log.d(TAG, "FalseCheck [legacyFrameSize, " + format.width + "x" + format.height + "] [" + Util.DEVICE_DEBUG_INFO + C3191e4.i.f36531e);
                }
                zIsCodecSupported = z11;
            }
        }
        return (zIsCodecSupported ? 4 : 3) | (decoderInfo.adaptive ? 16 : 8) | (decoderInfo.tunneling ? 32 : 0);
    }

    public void updateDroppedBufferCounters(int i10) {
        DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.droppedBufferCount += i10;
        this.droppedFrames += i10;
        int i11 = this.consecutiveDroppedFrameCount + i10;
        this.consecutiveDroppedFrameCount = i11;
        decoderCounters.maxConsecutiveDroppedBufferCount = Math.max(i11, decoderCounters.maxConsecutiveDroppedBufferCount);
        if (this.droppedFrames >= this.maxDroppedFramesToNotify) {
            maybeNotifyDroppedFrames();
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j10) {
        this(context, mediaCodecSelector, j10, null, null, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:370:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x05d0 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:9:0x0014, B:11:0x0018, B:12:0x0020, B:371:0x05a0, B:374:0x05a6, B:390:0x05d2, B:389:0x05d0, B:379:0x05b7, B:382:0x05c1, B:373:0x05a4, B:14:0x0025, B:19:0x0034, B:22:0x0040, B:25:0x004c, B:28:0x0058, B:31:0x0064, B:34:0x0070, B:37:0x007c, B:40:0x0088, B:43:0x0094, B:46:0x00a0, B:49:0x00ac, B:52:0x00b8, B:55:0x00c2, B:58:0x00ce, B:61:0x00da, B:64:0x00e6, B:67:0x00f2, B:70:0x00fe, B:73:0x0109, B:76:0x0115, B:79:0x0121, B:82:0x012d, B:85:0x0139, B:88:0x0145, B:91:0x0151, B:94:0x015d, B:97:0x0169, B:100:0x0175, B:103:0x0181, B:106:0x018d, B:109:0x0199, B:112:0x01a5, B:115:0x01b1, B:118:0x01bd, B:121:0x01c8, B:124:0x01d4, B:127:0x01e0, B:130:0x01ec, B:133:0x01f8, B:136:0x0204, B:139:0x0210, B:142:0x021c, B:145:0x0228, B:148:0x0234, B:151:0x0241, B:154:0x024d, B:157:0x0259, B:160:0x0265, B:163:0x0271, B:166:0x027c, B:169:0x0288, B:172:0x0294, B:175:0x02a0, B:178:0x02ac, B:181:0x02b8, B:184:0x02c4, B:187:0x02d0, B:190:0x02dc, B:193:0x02e7, B:196:0x02f2, B:199:0x02fd, B:202:0x0309, B:205:0x0315, B:208:0x0321, B:211:0x032d, B:214:0x0339, B:217:0x0345, B:220:0x0351, B:223:0x035d, B:226:0x0369, B:229:0x0375, B:232:0x0381, B:235:0x038d, B:238:0x0399, B:241:0x03a5, B:244:0x03b1, B:247:0x03be, B:250:0x03ca, B:253:0x03d6, B:256:0x03e2, B:259:0x03ee, B:262:0x03fa, B:265:0x0406, B:268:0x0412, B:271:0x041e, B:274:0x042a, B:277:0x0436, B:280:0x0442, B:283:0x044e, B:286:0x0459, B:289:0x0465, B:292:0x0471, B:295:0x047d, B:298:0x0489, B:301:0x0494, B:304:0x04a0, B:307:0x04ac, B:310:0x04b8, B:313:0x04c4, B:316:0x04d0, B:319:0x04dc, B:322:0x04e8, B:325:0x04f4, B:328:0x0500, B:331:0x050c, B:334:0x0518, B:337:0x0524, B:340:0x0530, B:343:0x053c, B:346:0x0547, B:349:0x0552, B:352:0x055d, B:355:0x0568, B:358:0x0573, B:361:0x057e, B:364:0x0589, B:367:0x0594, B:391:0x05d4), top: B:397:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean codecNeedsSetOutputSurfaceWorkaround(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 2214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.video.MediaCodecVideoRenderer.codecNeedsSetOutputSurfaceWorkaround(java.lang.String):boolean");
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j10, Handler handler, VideoRendererEventListener videoRendererEventListener, int i10) {
        this(context, mediaCodecSelector, j10, null, false, handler, videoRendererEventListener, i10);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j10, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z10, Handler handler, VideoRendererEventListener videoRendererEventListener, int i10) {
        super(2, mediaCodecSelector, drmSessionManager, z10);
        this.allowedJoiningTimeMs = j10;
        this.maxDroppedFramesToNotify = i10;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.frameReleaseTimeHelper = new VideoFrameReleaseTimeHelper(applicationContext);
        this.eventDispatcher = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.deviceNeedsAutoFrcWorkaround = deviceNeedsAutoFrcWorkaround();
        this.pendingOutputStreamOffsetsUs = new long[10];
        this.pendingOutputStreamSwitchTimesUs = new long[10];
        this.outputStreamOffsetUs = C.TIME_UNSET;
        this.lastInputTimeUs = C.TIME_UNSET;
        this.joiningDeadlineMs = C.TIME_UNSET;
        this.currentWidth = -1;
        this.currentHeight = -1;
        this.currentPixelWidthHeightRatio = -1.0f;
        this.pendingPixelWidthHeightRatio = -1.0f;
        this.scalingMode = 1;
        clearReportedVideoSize();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int getMaxInputSize(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo r5, java.lang.String r6, int r7, int r8) {
        /*
            r0 = -1
            if (r7 == r0) goto L9e
            if (r8 != r0) goto L7
            goto L9e
        L7:
            r6.getClass()
            int r1 = r6.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r1) {
                case -1664118616: goto L4d;
                case -1662541442: goto L42;
                case 1187890754: goto L37;
                case 1331836730: goto L2c;
                case 1599127256: goto L21;
                case 1599127257: goto L16;
                default: goto L14;
            }
        L14:
            r6 = r0
            goto L57
        L16:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L1f
            goto L14
        L1f:
            r6 = 5
            goto L57
        L21:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L2a
            goto L14
        L2a:
            r6 = r2
            goto L57
        L2c:
            java.lang.String r1 = "video/avc"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L35
            goto L14
        L35:
            r6 = r3
            goto L57
        L37:
            java.lang.String r1 = "video/mp4v-es"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L40
            goto L14
        L40:
            r6 = r4
            goto L57
        L42:
            java.lang.String r1 = "video/hevc"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L4b
            goto L14
        L4b:
            r6 = 1
            goto L57
        L4d:
            java.lang.String r1 = "video/3gpp"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L56
            goto L14
        L56:
            r6 = 0
        L57:
            switch(r6) {
                case 0: goto L97;
                case 1: goto L94;
                case 2: goto L97;
                case 3: goto L5b;
                case 4: goto L97;
                case 5: goto L94;
                default: goto L5a;
            }
        L5a:
            return r0
        L5b:
            java.lang.String r6 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L93
            java.lang.String r1 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r2 = "Amazon"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L84
            java.lang.String r1 = "KFSOWI"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L93
            java.lang.String r1 = "AFTS"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L84
            boolean r5 = r5.secure
            if (r5 == 0) goto L84
            goto L93
        L84:
            r5 = 16
            int r6 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.ceilDivide(r7, r5)
            int r5 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.ceilDivide(r8, r5)
            int r5 = r5 * r6
            int r5 = r5 * 256
        L91:
            r2 = r4
            goto L9a
        L93:
            return r0
        L94:
            int r5 = r7 * r8
            goto L9a
        L97:
            int r5 = r7 * r8
            goto L91
        L9a:
            int r5 = r5 * r3
            int r2 = r2 * r4
            int r5 = r5 / r2
            return r5
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.video.MediaCodecVideoRenderer.getMaxInputSize(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo, java.lang.String, int, int):int");
    }
}
