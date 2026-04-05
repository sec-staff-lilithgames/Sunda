package go;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ln.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface f {
    void addEventListener(Handler handler, e eVar);

    long getBitrateEstimate();

    default long getTimeToFirstByteEstimateUs() {
        return C.TIME_UNSET;
    }

    g0 getTransferListener();

    void removeEventListener(e eVar);
}
