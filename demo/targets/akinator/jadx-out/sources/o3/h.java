package o3;

import android.graphics.Typeface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class h extends u3.p {

    /* renamed from: a, reason: collision with root package name */
    public final n3.n f77438a;

    public h(n3.n nVar) {
        this.f77438a = nVar;
    }

    @Override // u3.p
    public void onTypefaceRequestFailed(int i10) {
        n3.n nVar = this.f77438a;
        if (nVar != null) {
            nVar.onFontRetrievalFailed(i10);
        }
    }

    @Override // u3.p
    public void onTypefaceRetrieved(Typeface typeface) {
        n3.n nVar = this.f77438a;
        if (nVar != null) {
            nVar.onFontRetrieved(typeface);
        }
    }
}
