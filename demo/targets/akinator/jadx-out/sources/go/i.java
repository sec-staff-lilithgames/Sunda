package go;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i {
    public i(String str, String str2, h hVar) {
        this(str, str2, hVar, 0);
    }

    public boolean isBitrateLoggingAllowed() {
        throw null;
    }

    public boolean isBufferLengthLoggingAllowed() {
        throw null;
    }

    public boolean isBufferStarvationLoggingAllowed() {
        throw null;
    }

    public boolean isContentIdLoggingAllowed() {
        throw null;
    }

    public boolean isDeadlineLoggingAllowed() {
        throw null;
    }

    public boolean isMaximumRequestThroughputLoggingAllowed() {
        throw null;
    }

    public boolean isMeasuredThroughputLoggingAllowed() {
        throw null;
    }

    public boolean isNextObjectRequestLoggingAllowed() {
        throw null;
    }

    public boolean isNextRangeRequestLoggingAllowed() {
        throw null;
    }

    public boolean isObjectDurationLoggingAllowed() {
        throw null;
    }

    public boolean isObjectTypeLoggingAllowed() {
        throw null;
    }

    public boolean isPlaybackRateLoggingAllowed() {
        throw null;
    }

    public boolean isSessionIdLoggingAllowed() {
        throw null;
    }

    public boolean isStartupLoggingAllowed() {
        throw null;
    }

    public boolean isStreamTypeLoggingAllowed() {
        throw null;
    }

    public boolean isStreamingFormatLoggingAllowed() {
        throw null;
    }

    public boolean isTopBitrateLoggingAllowed() {
        throw null;
    }

    public i(String str, String str2, h hVar, int i10) {
        boolean z10 = true;
        io.bidmachine.media3.common.util.a.checkArgument(str == null || str.length() <= 64);
        if (str2 != null && str2.length() > 64) {
            z10 = false;
        }
        io.bidmachine.media3.common.util.a.checkArgument(z10);
        io.bidmachine.media3.common.util.a.checkNotNull(hVar);
    }
}
