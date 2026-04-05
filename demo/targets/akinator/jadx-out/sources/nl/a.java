package nl;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final jl.a f77031a;

    public a(jl.a aVar) {
        this.f77031a = aVar;
    }

    public AdRequest buildAdRequest() {
        return getAdRequest().build();
    }

    public AdRequest buildAdRequestWithAdString(String str) {
        return str.isEmpty() ? buildAdRequest() : getAdRequest().setAdString(str).build();
    }

    public AdRequest.Builder getAdRequest() {
        AdRequest.Builder builder = new AdRequest.Builder();
        jl.a aVar = this.f77031a;
        return builder.setRequestAgent(aVar.getVersionName()).addNetworkExtrasBundle(AdMobAdapter.class, aVar.getExtras());
    }
}
