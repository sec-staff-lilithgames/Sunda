package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final w1 f8537a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final v1 getNone() {
            return v1.f8537a;
        }
    }

    static {
        new a(null);
        f8537a = new w1(new u2(null, null, null, null, 15, null));
    }

    public v1(kotlin.jvm.internal.u uVar) {
    }

    public boolean equals(Object obj) {
        return (obj instanceof v1) && kotlin.jvm.internal.e0.areEqual(((v1) obj).getData$animation_release(), getData$animation_release());
    }

    public abstract u2 getData$animation_release();

    public int hashCode() {
        return getData$animation_release().hashCode();
    }

    public final v1 plus(v1 exit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(exit, "exit");
        d2 fade = getData$animation_release().getFade();
        if (fade == null) {
            fade = exit.getData$animation_release().getFade();
        }
        m2 slide = getData$animation_release().getSlide();
        if (slide == null) {
            slide = exit.getData$animation_release().getSlide();
        }
        i0 changeSize = getData$animation_release().getChangeSize();
        if (changeSize == null) {
            changeSize = exit.getData$animation_release().getChangeSize();
        }
        i2 scale = getData$animation_release().getScale();
        if (scale == null) {
            scale = exit.getData$animation_release().getScale();
        }
        return new w1(new u2(fade, slide, changeSize, scale));
    }
}
