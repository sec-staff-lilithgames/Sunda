package x3;

import android.os.Build;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public b3 f91668a;

    public s2(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f91668a = new a3(y2.b(i10, interpolator, j10));
        } else {
            this.f91668a = new x2(i10, interpolator, j10);
        }
    }

    public float getAlpha() {
        return this.f91668a.getAlpha();
    }

    public long getDurationMillis() {
        return this.f91668a.getDurationMillis();
    }

    public float getFraction() {
        return this.f91668a.getFraction();
    }

    public float getInterpolatedFraction() {
        return this.f91668a.getInterpolatedFraction();
    }

    public Interpolator getInterpolator() {
        return this.f91668a.getInterpolator();
    }

    public int getTypeMask() {
        return this.f91668a.getTypeMask();
    }

    public void setAlpha(float f10) {
        this.f91668a.setAlpha(f10);
    }

    public void setFraction(float f10) {
        this.f91668a.setFraction(f10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final o3.c f91669a;

        /* renamed from: b, reason: collision with root package name */
        public final o3.c f91670b;

        public a(o3.c cVar, o3.c cVar2) {
            this.f91669a = cVar;
            this.f91670b = cVar2;
        }

        public static a toBoundsCompat(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public o3.c getLowerBound() {
            return this.f91669a;
        }

        public o3.c getUpperBound() {
            return this.f91670b;
        }

        public a inset(o3.c cVar) {
            int i10 = cVar.f77432a;
            int i11 = cVar.f77433b;
            int i12 = cVar.f77434c;
            int i13 = cVar.f77435d;
            return new a(e3.a(this.f91669a, i10, i11, i12, i13), e3.a(this.f91670b, cVar.f77432a, i11, i12, i13));
        }

        public WindowInsetsAnimation.Bounds toBounds() {
            return a3.createPlatformBounds(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f91669a + " upper=" + this.f91670b + "}";
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.f91669a = a3.getLowerBounds(bounds);
            this.f91670b = a3.getHigherBounds(bounds);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {

        /* renamed from: b, reason: collision with root package name */
        public e3 f91671b;

        /* renamed from: c, reason: collision with root package name */
        public final int f91672c;

        public b(int i10) {
            this.f91672c = i10;
        }

        public final int getDispatchMode() {
            return this.f91672c;
        }

        public abstract e3 onProgress(e3 e3Var, List<s2> list);

        public void onEnd(s2 s2Var) {
        }

        public void onPrepare(s2 s2Var) {
        }

        public a onStart(s2 s2Var, a aVar) {
            return aVar;
        }
    }
}
