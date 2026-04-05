package ol;

import com.google.android.gms.ads.AdListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class e extends b {

    /* renamed from: b, reason: collision with root package name */
    public final com.unity3d.scar.adapter.common.g f79531b;

    /* renamed from: c, reason: collision with root package name */
    public final c f79532c;

    /* renamed from: d, reason: collision with root package name */
    public final d f79533d = new d(this);

    public e(com.unity3d.scar.adapter.common.g gVar, c cVar) {
        this.f79531b = gVar;
        this.f79532c = cVar;
    }

    public AdListener getAdListener() {
        return this.f79533d;
    }
}
