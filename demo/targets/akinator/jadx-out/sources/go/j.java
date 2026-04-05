package go;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.x0;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final i f58317a;

    /* renamed from: b, reason: collision with root package name */
    public fo.l f58318b;

    /* renamed from: c, reason: collision with root package name */
    public long f58319c = C.TIME_UNSET;

    /* renamed from: d, reason: collision with root package name */
    public long f58320d = C.TIME_UNSET;

    /* renamed from: e, reason: collision with root package name */
    public String f58321e;

    static {
        Pattern.compile(".*-.*");
    }

    public j(i iVar, String str) {
        this.f58317a = iVar;
    }

    public k createCmcdData() {
        String str;
        if (!Objects.equals(this.f58321e, "m")) {
            io.bidmachine.media3.common.util.a.checkStateNotNull(this.f58318b, "Track selection must be set");
        }
        if (this.f58321e == null) {
            io.bidmachine.media3.common.b selectedFormat = ((fo.l) io.bidmachine.media3.common.util.a.checkNotNull(this.f58318b)).getSelectedFormat();
            String audioMediaMimeType = x0.getAudioMediaMimeType(selectedFormat.f60661k);
            String videoMediaMimeType = x0.getVideoMediaMimeType(selectedFormat.f60661k);
            if (audioMediaMimeType == null || videoMediaMimeType == null) {
                int trackType = x0.getTrackType(selectedFormat.f60665o);
                if (trackType == -1) {
                    trackType = x0.getTrackType(selectedFormat.f60664n);
                }
                str = trackType == 1 ? "a" : trackType == 2 ? ApsMetricsDataMap.APSMETRICS_FIELD_VERSION : null;
            } else {
                str = ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTERVERSION;
            }
            this.f58321e = str;
        }
        String str2 = this.f58321e;
        if (Objects.equals(str2, "a") || Objects.equals(str2, ApsMetricsDataMap.APSMETRICS_FIELD_VERSION) || Objects.equals(str2, ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTERVERSION)) {
            io.bidmachine.media3.common.util.a.checkState(this.f58319c != C.TIME_UNSET, "Buffered duration must be set");
            io.bidmachine.media3.common.util.a.checkState(this.f58320d != C.TIME_UNSET, "Chunk duration must be set");
        }
        this.f58317a.getClass();
        throw null;
    }

    public j setBufferedDurationUs(long j10) {
        io.bidmachine.media3.common.util.a.checkArgument(j10 >= 0);
        this.f58319c = j10;
        return this;
    }

    public j setChunkDurationUs(long j10) {
        io.bidmachine.media3.common.util.a.checkArgument(j10 >= 0);
        this.f58320d = j10;
        return this;
    }

    public j setObjectType(String str) {
        this.f58321e = str;
        return this;
    }

    public j setPlaybackRate(float f10) {
        io.bidmachine.media3.common.util.a.checkArgument(f10 == -3.4028235E38f || f10 > 0.0f);
        return this;
    }

    public j setTrackSelection(fo.l lVar) {
        this.f58318b = lVar;
        return this;
    }

    public j setDidRebuffer(boolean z10) {
        return this;
    }

    public j setIsBufferEmpty(boolean z10) {
        return this;
    }

    public j setIsLive(boolean z10) {
        return this;
    }

    public j setNextObjectRequest(String str) {
        return this;
    }

    public j setNextRangeRequest(String str) {
        return this;
    }
}
