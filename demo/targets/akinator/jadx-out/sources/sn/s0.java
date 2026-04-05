package sn;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.drm.WidevineUtil;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class s0 {
    public static Pair<Long, Long> getLicenseDurationRemainingSec(o oVar) throws NumberFormatException {
        String str;
        Map<String, String> mapQueryKeyStatus = oVar.queryKeyStatus();
        if (mapQueryKeyStatus == null) {
            return null;
        }
        long j10 = C.TIME_UNSET;
        try {
            str = mapQueryKeyStatus.get(WidevineUtil.PROPERTY_LICENSE_DURATION_REMAINING);
        } catch (NumberFormatException unused) {
        }
        long j11 = str != null ? Long.parseLong(str) : -9223372036854775807L;
        Long lValueOf = Long.valueOf(j11);
        try {
            String str2 = mapQueryKeyStatus.get(WidevineUtil.PROPERTY_PLAYBACK_DURATION_REMAINING);
            if (str2 != null) {
                j10 = Long.parseLong(str2);
            }
        } catch (NumberFormatException unused2) {
        }
        return new Pair<>(lValueOf, Long.valueOf(j10));
    }
}
