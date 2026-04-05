package j1;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f68933a;

    public n(PathMeasure internalPathMeasure) {
        kotlin.jvm.internal.e0.checkNotNullParameter(internalPathMeasure, "internalPathMeasure");
        this.f68933a = internalPathMeasure;
    }

    @Override // j1.p1
    public float getLength() {
        return this.f68933a.getLength();
    }

    @Override // j1.p1
    public boolean getSegment(float f10, float f11, l1 destination, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        if (!(destination instanceof l)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.f68933a.getSegment(f10, f11, ((l) destination).getInternalPath(), z10);
    }

    @Override // j1.p1
    public void setPath(l1 l1Var, boolean z10) {
        Path internalPath;
        if (l1Var == null) {
            internalPath = null;
        } else {
            if (!(l1Var instanceof l)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            internalPath = ((l) l1Var).getInternalPath();
        }
        this.f68933a.setPath(internalPath, z10);
    }
}
