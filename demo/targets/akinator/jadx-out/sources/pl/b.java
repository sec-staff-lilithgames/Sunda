package pl;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import ll.d;
import ll.e;
import ll.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final nl.a f81486a;

    public b(nl.a aVar) {
        this.f81486a = aVar;
    }

    public AdFormat getAdFormat(kl.e eVar) {
        int iOrdinal = eVar.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? AdFormat.UNKNOWN : AdFormat.BANNER : AdFormat.REWARDED : AdFormat.INTERSTITIAL;
    }

    @Override // ll.e, ll.c
    public void getSCARSignal(Context context, String str, kl.e eVar, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        QueryInfo.generate(context, getAdFormat(eVar), this.f81486a.buildAdRequest(), new a(str, new d(aVar, fVar)));
    }

    @Override // ll.e, ll.c
    public void getSCARSignalForHB(Context context, kl.e eVar, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        getSCARSignal(context, getAdKey(eVar), eVar, aVar, fVar);
    }
}
