package em;

import io.bidmachine.protobuf.Waterfall;
import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface v0 {
    void onAdLoaded();

    void onWaterfallLoadCompleted(Queue<Waterfall.Result.AdUnit> queue);
}
