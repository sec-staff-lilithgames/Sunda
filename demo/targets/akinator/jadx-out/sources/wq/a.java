package wq;

import android.graphics.Bitmap;
import android.view.PixelCopy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f90795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f90796b;

    public a(c cVar, Bitmap bitmap) {
        this.f90795a = cVar;
        this.f90796b = bitmap;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public void onPixelCopyFinished(int i10) {
        c cVar = this.f90795a;
        if (i10 == 0) {
            cVar.a(this.f90796b);
        } else {
            cVar.a();
        }
    }
}
