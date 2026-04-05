package b9;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h extends g9.c {

    /* renamed from: f, reason: collision with root package name */
    public final Handler f8946f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8947g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8948h;

    /* renamed from: i, reason: collision with root package name */
    public Bitmap f8949i;

    public h(Handler handler, int i10, long j10) {
        this.f8946f = handler;
        this.f8947g = i10;
        this.f8948h = j10;
    }

    @Override // g9.c, g9.n
    public void onLoadCleared(Drawable drawable) {
        this.f8949i = null;
    }

    @Override // g9.c, g9.n
    public void onResourceReady(Bitmap bitmap, h9.c cVar) {
        this.f8949i = bitmap;
        Handler handler = this.f8946f;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f8948h);
    }
}
