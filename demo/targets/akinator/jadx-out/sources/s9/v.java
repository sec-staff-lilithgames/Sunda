package s9;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import com.digidust.elokence.akinator.paid.databinding.FragmentAddPhotoDuelBinding;
import kotlin.jvm.internal.e0;
import s9.x;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f85565c;

    public /* synthetic */ v(x xVar, int i10) {
        this.f85564b = i10;
        this.f85565c = xVar;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        int i10 = this.f85564b;
        x0 x0Var = x0.f87415a;
        x xVar = this.f85565c;
        switch (i10) {
            case 0:
                w3.e image = (w3.e) obj;
                x.a aVar = x.f85568j;
                e0.checkNotNullParameter(image, "image");
                FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding = xVar.f85574i;
                e0.checkNotNull(fragmentAddPhotoDuelBinding);
                fragmentAddPhotoDuelBinding.loadingBarAward.setVisibility(8);
                Object first = image.f90368a;
                e0.checkNotNullExpressionValue(first, "first");
                Bitmap bitmap = (Bitmap) first;
                Object second = image.f90369b;
                e0.checkNotNullExpressionValue(second, "second");
                Bitmap bitmap2 = (Bitmap) second;
                FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding2 = xVar.f85574i;
                e0.checkNotNull(fragmentAddPhotoDuelBinding2);
                ImageView imageView = fragmentAddPhotoDuelBinding2.duelPhotoImage1;
                try {
                    float width = imageView.getWidth();
                    float height = imageView.getHeight();
                    float width2 = bitmap.getWidth();
                    float height2 = bitmap.getHeight();
                    float fMin = Math.min(width / width2, height / height2);
                    imageView.setImageBitmap(Bitmap.createScaledBitmap(bitmap, (int) (width2 * fMin), (int) (height2 * fMin), true));
                    imageView.setVisibility(0);
                    ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(1000L).start();
                } catch (IllegalArgumentException unused) {
                    xVar.a();
                } catch (OutOfMemoryError unused2) {
                    xVar.a();
                }
                FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding3 = xVar.f85574i;
                e0.checkNotNull(fragmentAddPhotoDuelBinding3);
                ImageView imageView2 = fragmentAddPhotoDuelBinding3.duelPhotoImage2;
                try {
                    float width3 = imageView2.getWidth();
                    float height3 = imageView2.getHeight();
                    float width4 = bitmap2.getWidth();
                    float height4 = bitmap2.getHeight();
                    float fMin2 = Math.min(width3 / width4, height3 / height4);
                    imageView2.setImageBitmap(Bitmap.createScaledBitmap(bitmap2, (int) (width4 * fMin2), (int) (height4 * fMin2), true));
                    imageView2.setVisibility(0);
                    ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(1000L).start();
                    break;
                } catch (IllegalArgumentException unused3) {
                    xVar.a();
                    break;
                } catch (OutOfMemoryError unused4) {
                    xVar.a();
                    break;
                }
            default:
                FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding4 = xVar.f85574i;
                e0.checkNotNull(fragmentAddPhotoDuelBinding4);
                fragmentAddPhotoDuelBinding4.loadingBarAward.setVisibility(8);
                FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding5 = xVar.f85574i;
                e0.checkNotNull(fragmentAddPhotoDuelBinding5);
                fragmentAddPhotoDuelBinding5.duelPhotoButtonValide1.setClickable(false);
                FragmentAddPhotoDuelBinding fragmentAddPhotoDuelBinding6 = xVar.f85574i;
                e0.checkNotNull(fragmentAddPhotoDuelBinding6);
                fragmentAddPhotoDuelBinding6.duelPhotoButtonValide2.setClickable(false);
                break;
        }
        return x0Var;
        return x0Var;
    }
}
