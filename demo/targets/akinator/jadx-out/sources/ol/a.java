package ol;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class a implements kl.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f79519a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f79520b;

    /* renamed from: c, reason: collision with root package name */
    public final kl.d f79521c;

    /* renamed from: d, reason: collision with root package name */
    public final nl.a f79522d;

    /* renamed from: e, reason: collision with root package name */
    public b f79523e;

    /* renamed from: f, reason: collision with root package name */
    public final com.unity3d.scar.adapter.common.d f79524f;

    public a(Context context, kl.d dVar, nl.a aVar, com.unity3d.scar.adapter.common.d dVar2) {
        this.f79520b = context;
        this.f79521c = dVar;
        this.f79522d = aVar;
        this.f79524f = dVar2;
    }

    public abstract void a(AdRequest adRequest);

    @Override // kl.a
    public void loadAd(kl.c cVar) {
        AdRequest adRequestBuildAdRequestWithAdString = this.f79522d.buildAdRequestWithAdString(this.f79521c.getAdString());
        if (cVar != null) {
            this.f79523e.setLoadListener(cVar);
        }
        a(adRequestBuildAdRequestWithAdString);
    }

    public void setGmaAd(Object obj) {
        this.f79519a = obj;
    }
}
