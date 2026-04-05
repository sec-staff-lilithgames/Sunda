package ug;

import android.graphics.Typeface;
import n3.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class e extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f88482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f88483b;

    public e(g gVar, i iVar) {
        this.f88483b = gVar;
        this.f88482a = iVar;
    }

    @Override // n3.n
    public void onFontRetrievalFailed(int i10) {
        this.f88483b.f88501n = true;
        this.f88482a.onFontRetrievalFailed(i10);
    }

    @Override // n3.n
    public void onFontRetrieved(Typeface typeface) {
        g gVar = this.f88483b;
        gVar.f88503p = Typeface.create(typeface, gVar.f88491d);
        gVar.f88501n = true;
        this.f88482a.onFontRetrieved(gVar.f88503p, false);
    }
}
