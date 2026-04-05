package ug;

import android.graphics.Typeface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f88479a;

    /* renamed from: b, reason: collision with root package name */
    public final a f88480b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f88481c;

    public b(a aVar, Typeface typeface) {
        this.f88479a = typeface;
        this.f88480b = aVar;
    }

    public void cancel() {
        this.f88481c = true;
    }

    @Override // ug.i
    public void onFontRetrievalFailed(int i10) {
        if (this.f88481c) {
            return;
        }
        this.f88480b.apply(this.f88479a);
    }

    @Override // ug.i
    public void onFontRetrieved(Typeface typeface, boolean z10) {
        if (this.f88481c) {
            return;
        }
        this.f88480b.apply(typeface);
    }
}
