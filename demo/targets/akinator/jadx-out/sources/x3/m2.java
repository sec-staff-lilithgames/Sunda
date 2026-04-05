package x3;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f91646a;

    public m2(View view) {
        this.f91646a = new WeakReference(view);
    }

    public m2 alpha(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public m2 alphaBy(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().alphaBy(f10);
        }
        return this;
    }

    public void cancel() {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long getDuration() {
        View view = (View) this.f91646a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public Interpolator getInterpolator() {
        View view = (View) this.f91646a.get();
        if (view != null) {
            return (Interpolator) view.animate().getInterpolator();
        }
        return null;
    }

    public long getStartDelay() {
        View view = (View) this.f91646a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    public m2 rotation(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().rotation(f10);
        }
        return this;
    }

    public m2 rotationBy(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().rotationBy(f10);
        }
        return this;
    }

    public m2 rotationX(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().rotationX(f10);
        }
        return this;
    }

    public m2 rotationXBy(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().rotationXBy(f10);
        }
        return this;
    }

    public m2 rotationY(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().rotationY(f10);
        }
        return this;
    }

    public m2 rotationYBy(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().rotationYBy(f10);
        }
        return this;
    }

    public m2 scaleX(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().scaleX(f10);
        }
        return this;
    }

    public m2 scaleXBy(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().scaleXBy(f10);
        }
        return this;
    }

    public m2 scaleY(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().scaleY(f10);
        }
        return this;
    }

    public m2 scaleYBy(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().scaleYBy(f10);
        }
        return this;
    }

    public m2 setDuration(long j10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public m2 setInterpolator(Interpolator interpolator) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public m2 setListener(n2 n2Var) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            if (n2Var != null) {
                view.animate().setListener(new l2(n2Var, view));
                return this;
            }
            view.animate().setListener(null);
        }
        return this;
    }

    public m2 setStartDelay(long j10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public m2 setUpdateListener(p2 p2Var) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().setUpdateListener(p2Var != null ? new qg.k(4, p2Var, view) : null);
        }
        return this;
    }

    public void start() {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public m2 translationX(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().translationX(f10);
        }
        return this;
    }

    public m2 translationXBy(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().translationXBy(f10);
        }
        return this;
    }

    public m2 translationY(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }

    public m2 translationYBy(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().translationYBy(f10);
        }
        return this;
    }

    public m2 translationZ(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().translationZ(f10);
        }
        return this;
    }

    public m2 translationZBy(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().translationZBy(f10);
        }
        return this;
    }

    public m2 withEndAction(Runnable runnable) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    public m2 withLayer() {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }

    public m2 withStartAction(Runnable runnable) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().withStartAction(runnable);
        }
        return this;
    }

    public m2 x(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().x(f10);
        }
        return this;
    }

    public m2 xBy(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().xBy(f10);
        }
        return this;
    }

    public m2 y(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().y(f10);
        }
        return this;
    }

    public m2 yBy(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().yBy(f10);
        }
        return this;
    }

    public m2 z(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().z(f10);
        }
        return this;
    }

    public m2 zBy(float f10) {
        View view = (View) this.f91646a.get();
        if (view != null) {
            view.animate().zBy(f10);
        }
        return this;
    }
}
