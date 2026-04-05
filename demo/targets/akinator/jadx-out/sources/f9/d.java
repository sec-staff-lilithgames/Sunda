package f9;

import android.graphics.drawable.Drawable;
import g9.m;
import g9.n;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface d extends Future, n {
    @Override // g9.n
    /* synthetic */ e getRequest();

    @Override // g9.n
    /* synthetic */ void getSize(m mVar);

    @Override // g9.n, com.bumptech.glide.manager.o
    /* synthetic */ void onDestroy();

    @Override // g9.n
    /* synthetic */ void onLoadCleared(Drawable drawable);

    @Override // g9.n
    /* synthetic */ void onLoadFailed(Drawable drawable);

    @Override // g9.n
    /* synthetic */ void onLoadStarted(Drawable drawable);

    @Override // g9.n
    /* synthetic */ void onResourceReady(Object obj, h9.c cVar);

    @Override // g9.n, com.bumptech.glide.manager.o
    /* synthetic */ void onStart();

    @Override // g9.n, com.bumptech.glide.manager.o
    /* synthetic */ void onStop();

    @Override // g9.n
    /* synthetic */ void removeCallback(m mVar);

    @Override // g9.n
    /* synthetic */ void setRequest(e eVar);
}
