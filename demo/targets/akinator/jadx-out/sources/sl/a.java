package sl;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class a implements kl.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f85902a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f85903b;

    /* renamed from: c, reason: collision with root package name */
    public final kl.d f85904c;

    /* renamed from: d, reason: collision with root package name */
    public final rl.a f85905d;

    /* renamed from: e, reason: collision with root package name */
    public b f85906e;

    /* renamed from: f, reason: collision with root package name */
    public final com.unity3d.scar.adapter.common.d f85907f;

    public a(Context context, kl.d dVar, rl.a aVar, com.unity3d.scar.adapter.common.d dVar2) {
        this.f85903b = context;
        this.f85904c = dVar;
        this.f85905d = aVar;
        this.f85907f = dVar2;
    }

    public abstract void a(AdRequest adRequest);

    @Override // kl.a
    public void loadAd(kl.c cVar) {
        AdRequest adRequestBuildAdRequestWithAdString = this.f85905d.buildAdRequestWithAdString(this.f85904c.getAdString());
        if (cVar != null) {
            this.f85906e.setLoadListener(cVar);
        }
        a(adRequestBuildAdRequestWithAdString);
    }

    public void setGmaAd(Object obj) {
        this.f85902a = obj;
    }
}
