package g9;

import android.graphics.drawable.Drawable;
import j9.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class c implements n {

    /* renamed from: b, reason: collision with root package name */
    public final int f57443b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57444c;

    /* renamed from: e, reason: collision with root package name */
    public f9.e f57445e;

    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // g9.n
    public final f9.e getRequest() {
        return this.f57445e;
    }

    @Override // g9.n
    public final void getSize(m mVar) throws Throwable {
        ((f9.k) mVar).onSizeReady(this.f57443b, this.f57444c);
    }

    @Override // g9.n
    public abstract /* synthetic */ void onLoadCleared(Drawable drawable);

    @Override // g9.n
    public abstract /* synthetic */ void onResourceReady(Object obj, h9.c cVar);

    @Override // g9.n
    public final void setRequest(f9.e eVar) {
        this.f57445e = eVar;
    }

    public c(int i10, int i11) {
        if (!s.isValidDimensions(i10, i11)) {
            throw new IllegalArgumentException(w0.i.a(i10, i11, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", " and height: "));
        }
        this.f57443b = i10;
        this.f57444c = i11;
    }

    @Override // g9.n, com.bumptech.glide.manager.o
    public void onDestroy() {
    }

    @Override // g9.n, com.bumptech.glide.manager.o
    public void onStart() {
    }

    @Override // g9.n, com.bumptech.glide.manager.o
    public void onStop() {
    }

    @Override // g9.n
    public void onLoadFailed(Drawable drawable) {
    }

    @Override // g9.n
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // g9.n
    public final void removeCallback(m mVar) {
    }
}
