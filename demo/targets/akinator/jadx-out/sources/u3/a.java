package u3;

import android.graphics.Typeface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f87781b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Typeface f87782c;

    public a(p pVar, Typeface typeface) {
        this.f87781b = pVar;
        this.f87782c = typeface;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f87781b.onTypefaceRetrieved(this.f87782c);
    }
}
