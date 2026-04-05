package k1;

import kotlin.jvm.internal.c1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f70034a;

    /* renamed from: b, reason: collision with root package name */
    public final long f70035b;

    /* renamed from: c, reason: collision with root package name */
    public final int f70036c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public g(String str, long j10, int i10, kotlin.jvm.internal.u uVar) {
        this.f70034a = str;
        this.f70035b = j10;
        this.f70036c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.e0.areEqual(c1.getOrCreateKotlinClass(getClass()), c1.getOrCreateKotlinClass(obj.getClass()))) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f70036c == gVar.f70036c && kotlin.jvm.internal.e0.areEqual(this.f70034a, gVar.f70034a)) {
            return f.m5104equalsimpl0(this.f70035b, gVar.f70035b);
        }
        return false;
    }

    public final float[] fromXyz(float f10, float f11, float f12) {
        float[] fArr = new float[f.m5105getComponentCountimpl(this.f70035b)];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        return fromXyz(fArr);
    }

    public abstract float[] fromXyz(float[] fArr);

    public final int getComponentCount() {
        return f.m5105getComponentCountimpl(this.f70035b);
    }

    public final int getId$ui_graphics_release() {
        return this.f70036c;
    }

    public abstract float getMaxValue(int i10);

    public abstract float getMinValue(int i10);

    /* renamed from: getModel-xdoWZVw, reason: not valid java name */
    public final long m5109getModelxdoWZVw() {
        return this.f70035b;
    }

    public final String getName() {
        return this.f70034a;
    }

    public int hashCode() {
        return ((f.m5106hashCodeimpl(this.f70035b) + (this.f70034a.hashCode() * 31)) * 31) + this.f70036c;
    }

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    public String toString() {
        return this.f70034a + " (id=" + this.f70036c + ", model=" + ((Object) f.m5107toStringimpl(this.f70035b)) + ')';
    }

    public final float[] toXyz(float f10, float f11, float f12) {
        return toXyz(new float[]{f10, f11, f12});
    }

    public abstract float[] toXyz(float[] fArr);

    public g(String str, long j10, kotlin.jvm.internal.u uVar) {
        this(str, j10, -1, null);
    }
}
