package ll;

import android.content.Context;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class e implements c {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final b f73388b;

        /* renamed from: c, reason: collision with root package name */
        public final f f73389c;

        public a(e eVar, b bVar, f fVar) {
            this.f73388b = bVar;
            this.f73389c = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = this.f73389c;
            Map<String, String> signalsMap = fVar.getSignalsMap();
            int size = signalsMap.size();
            b bVar = this.f73388b;
            if (size > 0) {
                bVar.onSignalsCollected(new JSONObject(signalsMap).toString());
            } else if (fVar.getErrorMessage() == null) {
                bVar.onSignalsCollected("");
            } else {
                bVar.onSignalsCollectionFailed(fVar.getErrorMessage());
            }
        }
    }

    public String getAdKey(kl.e eVar) {
        int iOrdinal = eVar.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? "" : "gmaScarBiddingBannerSignal" : "gmaScarBiddingRewardedSignal" : "gmaScarBiddingInterstitialSignal";
    }

    @Override // ll.c
    public void getSCARBiddingSignals(Context context, List<kl.e> list, b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        for (kl.e eVar : list) {
            aVar.enter();
            getSCARSignalForHB(context, eVar, aVar, fVar);
        }
        aVar.notify(new a(this, bVar, fVar));
    }

    @Override // ll.c
    public abstract /* synthetic */ void getSCARSignal(Context context, String str, kl.e eVar, com.unity3d.scar.adapter.common.a aVar, f fVar);

    @Override // ll.c
    public void getSCARSignal(Context context, String str, kl.e eVar, b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        aVar.enter();
        getSCARSignal(context, str, eVar, aVar, fVar);
        aVar.notify(new a(this, bVar, fVar));
    }

    @Override // ll.c
    public abstract /* synthetic */ void getSCARSignalForHB(Context context, kl.e eVar, com.unity3d.scar.adapter.common.a aVar, f fVar);

    public void onOperationNotSupported(String str, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        fVar.setErrorMessage("Operation Not supported: " + str + ".");
        aVar.leave();
    }

    @Override // ll.c
    public void getSCARBiddingSignals(Context context, boolean z10, b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        aVar.enter();
        getSCARSignalForHB(context, kl.e.f71583c, aVar, fVar);
        aVar.enter();
        getSCARSignalForHB(context, kl.e.f71584e, aVar, fVar);
        if (z10) {
            aVar.enter();
            getSCARSignalForHB(context, kl.e.f71585f, aVar, fVar);
        }
        aVar.notify(new a(this, bVar, fVar));
    }
}
