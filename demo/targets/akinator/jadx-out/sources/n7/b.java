package n7;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.b1;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f75822c;

    public b(ImageView imageView) {
        this.f75822c = imageView;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && e0.areEqual(getView(), ((b) obj).getView());
    }

    @Override // n7.a, p7.f
    public Drawable getDrawable() {
        return getView().getDrawable();
    }

    public int hashCode() {
        return getView().hashCode();
    }

    @Override // n7.a, androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onCreate(b1 b1Var) {
        super.onCreate(b1Var);
    }

    @Override // n7.a, androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onDestroy(b1 b1Var) {
        super.onDestroy(b1Var);
    }

    @Override // n7.a, androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onPause(b1 b1Var) {
        super.onPause(b1Var);
    }

    @Override // n7.a, androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onResume(b1 b1Var) {
        super.onResume(b1Var);
    }

    @Override // n7.a
    public void setDrawable(Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    @Override // n7.a, n7.e, p7.f
    public ImageView getView() {
        return this.f75822c;
    }
}
