package g9;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class a implements n {

    /* renamed from: b, reason: collision with root package name */
    public f9.e f57442b;

    @Override // g9.n
    public f9.e getRequest() {
        return this.f57442b;
    }

    @Override // g9.n
    public abstract /* synthetic */ void getSize(m mVar);

    @Override // g9.n
    public abstract /* synthetic */ void onResourceReady(Object obj, h9.c cVar);

    @Override // g9.n
    public abstract /* synthetic */ void removeCallback(m mVar);

    @Override // g9.n
    public void setRequest(f9.e eVar) {
        this.f57442b = eVar;
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
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // g9.n
    public void onLoadFailed(Drawable drawable) {
    }

    @Override // g9.n
    public void onLoadStarted(Drawable drawable) {
    }
}
