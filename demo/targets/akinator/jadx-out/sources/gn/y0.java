package gn;

import android.util.Pair;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pair f58251a;

    /* renamed from: b, reason: collision with root package name */
    public static final Pair f58252b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pair f58253c;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        f58251a = Pair.create(fValueOf, fValueOf);
        f58252b = Pair.create(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(1.0f);
        f58253c = Pair.create(fValueOf2, fValueOf2);
    }

    default float getAlphaScale() {
        return 1.0f;
    }

    default Pair<Float, Float> getBackgroundFrameAnchor() {
        return f58251a;
    }

    default float getHdrLuminanceMultiplier() {
        return 1.0f;
    }

    default Pair<Float, Float> getOverlayFrameAnchor() {
        return f58252b;
    }

    default float getRotationDegrees() {
        return 0.0f;
    }

    default Pair<Float, Float> getScale() {
        return f58253c;
    }
}
