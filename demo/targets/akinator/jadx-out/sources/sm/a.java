package sm;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface a extends Serializable {
    void onAdClicked();

    void onAdShown();

    void onAdViewReady(View view);

    void onError(qm.b bVar);

    void registerAdContainer(ViewGroup viewGroup);

    void registerAdView(View view);
}
