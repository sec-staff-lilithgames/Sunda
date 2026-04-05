package u7;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class g extends m {
    public g(List<f8.a> list) {
        super(list);
    }

    public int getIntValue(f8.a aVar, float f10) {
        float f11;
        Float f12;
        Object obj = aVar.f55489b;
        Object obj2 = aVar.f55489b;
        if (obj == null || aVar.f55490c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        f8.c cVar = this.f87985e;
        if (cVar == null || (f12 = aVar.f55495h) == null) {
            f11 = f10;
        } else {
            f11 = f10;
            Integer num = (Integer) cVar.getValueInternal(aVar.f55494g, f12.floatValue(), (Integer) obj2, (Integer) aVar.f55490c, f11, d(), getProgress());
            if (num != null) {
                return num.intValue();
            }
        }
        return e8.c.evaluate(e8.j.clamp(f11, 0.0f, 1.0f), ((Integer) obj2).intValue(), ((Integer) aVar.f55490c).intValue());
    }

    @Override // u7.f
    public final Object getValue(f8.a aVar, float f10) {
        return Integer.valueOf(getIntValue(aVar, f10));
    }

    public int getIntValue() {
        return getIntValue(a(), c());
    }
}
