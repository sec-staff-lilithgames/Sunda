package ml;

import android.content.Context;
import android.widget.RelativeLayout;
import com.unity3d.scar.adapter.common.g;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.scar.adapter.common.i;
import com.unity3d.scar.adapter.common.l;
import com.unity3d.scar.adapter.common.m;
import ol.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class f extends l {

    /* renamed from: e, reason: collision with root package name */
    public final nl.a f74811e;

    public f(com.unity3d.scar.adapter.common.d dVar, String str) {
        super(dVar);
        nl.a aVar = new nl.a(new jl.a(str));
        this.f74811e = aVar;
        this.f50731a = new pl.b(aVar);
    }

    @Override // com.unity3d.scar.adapter.common.l, com.unity3d.scar.adapter.common.f
    public void loadBannerAd(Context context, RelativeLayout relativeLayout, kl.d dVar, int i10, int i11, g gVar) {
        m.runOnUiThread(new e(new ol.c(context, relativeLayout, this.f74811e, dVar, i10, i11, this.f50734d, gVar)));
    }

    @Override // com.unity3d.scar.adapter.common.l, com.unity3d.scar.adapter.common.f
    public void loadInterstitialAd(Context context, kl.d dVar, h hVar) {
        m.runOnUiThread(new b(this, new ol.f(context, this.f74811e, dVar, this.f50734d, hVar), dVar));
    }

    @Override // com.unity3d.scar.adapter.common.l, com.unity3d.scar.adapter.common.f
    public void loadRewardedAd(Context context, kl.d dVar, i iVar) {
        m.runOnUiThread(new d(this, new j(context, this.f74811e, dVar, this.f50734d, iVar), dVar));
    }
}
