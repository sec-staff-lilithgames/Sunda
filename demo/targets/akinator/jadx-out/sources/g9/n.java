package g9;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface n extends com.bumptech.glide.manager.o {
    f9.e getRequest();

    void getSize(m mVar);

    @Override // com.bumptech.glide.manager.o
    /* synthetic */ void onDestroy();

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(Object obj, h9.c cVar);

    @Override // com.bumptech.glide.manager.o
    /* synthetic */ void onStart();

    @Override // com.bumptech.glide.manager.o
    /* synthetic */ void onStop();

    void removeCallback(m mVar);

    void setRequest(f9.e eVar);
}
