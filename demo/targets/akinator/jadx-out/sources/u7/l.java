package u7;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l extends m {
    public l(List<f8.a> list) {
        super(list);
    }

    public final int getIntValue(f8.a aVar, float f10) {
        float f11;
        if (aVar.f55489b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int startValueInt = aVar.f55490c == null ? aVar.getStartValueInt() : aVar.getEndValueInt();
        f8.c cVar = this.f87985e;
        if (cVar != null) {
            f11 = f10;
            Integer num = (Integer) cVar.getValueInternal(aVar.f55494g, aVar.f55495h.floatValue(), (Integer) aVar.f55489b, Integer.valueOf(startValueInt), f11, d(), getProgress());
            if (num != null) {
                return num.intValue();
            }
        } else {
            f11 = f10;
        }
        return e8.j.lerp(aVar.getStartValueInt(), startValueInt, f11);
    }

    @Override // u7.f
    public final Object getValue(f8.a aVar, float f10) {
        return Integer.valueOf(getIntValue(aVar, f10));
    }

    public int getIntValue() {
        return getIntValue(a(), c());
    }
}
