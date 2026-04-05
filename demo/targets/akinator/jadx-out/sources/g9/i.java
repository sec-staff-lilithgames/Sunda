package g9;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class i extends r implements h9.b {

    /* renamed from: k, reason: collision with root package name */
    public Animatable f57458k;

    public i(ImageView imageView) {
        super(imageView);
    }

    public abstract void a(Object obj);

    @Override // h9.b
    public Drawable getCurrentDrawable() {
        return ((ImageView) this.f57470c).getDrawable();
    }

    @Override // g9.r, g9.a, g9.n
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.f57458k;
        if (animatable != null) {
            animatable.stop();
        }
        a(null);
        this.f57458k = null;
        setDrawable(drawable);
    }

    @Override // g9.a, g9.n
    public void onLoadFailed(Drawable drawable) {
        super.onLoadFailed(drawable);
        a(null);
        this.f57458k = null;
        setDrawable(drawable);
    }

    @Override // g9.r, g9.a, g9.n
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        a(null);
        this.f57458k = null;
        setDrawable(drawable);
    }

    @Override // g9.r, g9.a, g9.n
    public void onResourceReady(Object obj, h9.c cVar) {
        if (cVar != null && cVar.transition(obj, this)) {
            if (!(obj instanceof Animatable)) {
                this.f57458k = null;
                return;
            }
            Animatable animatable = (Animatable) obj;
            this.f57458k = animatable;
            animatable.start();
            return;
        }
        a(obj);
        if (!(obj instanceof Animatable)) {
            this.f57458k = null;
            return;
        }
        Animatable animatable2 = (Animatable) obj;
        this.f57458k = animatable2;
        animatable2.start();
    }

    @Override // g9.a, g9.n, com.bumptech.glide.manager.o
    public void onStart() {
        Animatable animatable = this.f57458k;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // g9.a, g9.n, com.bumptech.glide.manager.o
    public void onStop() {
        Animatable animatable = this.f57458k;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // h9.b
    public void setDrawable(Drawable drawable) {
        ((ImageView) this.f57470c).setImageDrawable(drawable);
    }

    @Deprecated
    public i(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }
}
