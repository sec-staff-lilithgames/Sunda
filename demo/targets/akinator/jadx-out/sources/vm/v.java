package vm;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import io.bidmachine.iab.vast.activity.VastView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v extends x {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ WeakReference f89327h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ VastView f89328i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(VastView vastView, Context context, Uri uri, String str, WeakReference weakReference) {
        super(context, uri, str);
        this.f89328i = vastView;
        this.f89327h = weakReference;
    }

    @Override // vm.x
    public final void a(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.f89327h.get();
        if (imageView != null) {
            if (bitmap == null) {
                imageView.setOnClickListener(new s(this));
                return;
            }
            imageView.setImageBitmap(bitmap);
            imageView.setAlpha(0.0f);
            imageView.animate().alpha(1.0f).setDuration(100L).setListener(new t(this)).start();
            imageView.setOnClickListener(new u(this));
        }
    }
}
