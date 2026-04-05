package xp;

import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f92179b;

    public b(c cVar) {
        this.f92179b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        BitmapDrawable bitmapDrawable;
        c cVar = this.f92179b;
        a aVar = cVar.f92183f;
        ImageView imageView = (ImageView) cVar.f92182e.get();
        if (imageView == null || (bitmapDrawable = cVar.f92184g) == null) {
            aVar.onError("Target ImageView or Bitmap is invalid");
        } else {
            aVar.onImagePrepared(imageView, bitmapDrawable);
        }
    }
}
