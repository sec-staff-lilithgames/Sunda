package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final u1 f8511a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final t1 getNone() {
            return t1.f8511a;
        }
    }

    static {
        new a(null);
        f8511a = new u1(new u2(null, null, null, null, 15, null));
    }

    public t1(kotlin.jvm.internal.u uVar) {
    }

    public boolean equals(Object obj) {
        return (obj instanceof t1) && kotlin.jvm.internal.e0.areEqual(((t1) obj).getData$animation_release(), getData$animation_release());
    }

    public abstract u2 getData$animation_release();

    public int hashCode() {
        return getData$animation_release().hashCode();
    }

    public final t1 plus(t1 enter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(enter, "enter");
        d2 fade = getData$animation_release().getFade();
        if (fade == null) {
            fade = enter.getData$animation_release().getFade();
        }
        m2 slide = getData$animation_release().getSlide();
        if (slide == null) {
            slide = enter.getData$animation_release().getSlide();
        }
        i0 changeSize = getData$animation_release().getChangeSize();
        if (changeSize == null) {
            changeSize = enter.getData$animation_release().getChangeSize();
        }
        i2 scale = getData$animation_release().getScale();
        if (scale == null) {
            scale = enter.getData$animation_release().getScale();
        }
        return new u1(new u2(fade, slide, changeSize, scale));
    }
}
