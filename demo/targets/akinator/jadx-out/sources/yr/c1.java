package yr;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import xr.hf;
import xr.jf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c1 implements jf {
    @Override // xr.jf
    public hf allocate(int i10) {
        return new b1(new pw.g(), Math.min(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, Math.max(4096, i10)));
    }
}
