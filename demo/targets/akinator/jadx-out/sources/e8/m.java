package e8;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53970a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f53970a) {
            case 0:
                return new PathMeasure();
            case 1:
                return new Path();
            case 2:
                return new Path();
            default:
                return new float[4];
        }
    }
}
