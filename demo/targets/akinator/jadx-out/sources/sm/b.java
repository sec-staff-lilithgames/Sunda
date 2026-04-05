package sm;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface b extends a {
    @Override // sm.a
    /* synthetic */ void onAdClicked();

    @Override // sm.a
    /* synthetic */ void onAdShown();

    /* synthetic */ void onAdViewReady(View view);

    @Override // sm.a
    /* synthetic */ void onError(qm.b bVar);

    String prepareCreativeForMeasure(String str);

    @Override // sm.a
    /* synthetic */ void registerAdContainer(ViewGroup viewGroup);

    @Override // sm.a
    /* synthetic */ void registerAdView(View view);
}
