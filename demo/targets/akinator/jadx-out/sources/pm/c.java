package pm;

import com.explorestack.protobuf.adcom.NativeAssetPosition;
import io.bidmachine.PositionData;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c {
    public final PositionData map(NativeAssetPosition data) {
        e0.checkNotNullParameter(data, "data");
        try {
            int i10 = b.$EnumSwitchMapping$0[data.ordinal()];
            if (i10 == 1) {
                return PositionData.TopLeft;
            }
            if (i10 == 2) {
                return PositionData.TopRight;
            }
            if (i10 == 3) {
                return PositionData.BottomLeft;
            }
            if (i10 != 4) {
                return null;
            }
            return PositionData.BottomRight;
        } catch (Throwable unused) {
            return null;
        }
    }
}
