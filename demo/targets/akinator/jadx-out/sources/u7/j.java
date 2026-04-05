package u7;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class j extends m {
    public j(List<f8.a> list) {
        super(list);
    }

    public final float g(f8.a aVar, float f10) {
        float f11;
        if (aVar.f55489b == null || aVar.f55490c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        f8.c cVar = this.f87985e;
        if (cVar != null) {
            f11 = f10;
            Float f12 = (Float) cVar.getValueInternal(aVar.f55494g, aVar.f55495h.floatValue(), (Float) aVar.f55489b, (Float) aVar.f55490c, f11, d(), getProgress());
            if (f12 != null) {
                return f12.floatValue();
            }
        } else {
            f11 = f10;
        }
        return e8.j.lerp(aVar.getStartValueFloat(), aVar.getEndValueFloat(), f11);
    }

    public float getFloatValue() {
        return g(a(), c());
    }

    @Override // u7.f
    public final Object getValue(f8.a aVar, float f10) {
        return Float.valueOf(g(aVar, f10));
    }
}
