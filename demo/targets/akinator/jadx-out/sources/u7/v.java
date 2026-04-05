package u7;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class v extends m {
    public v(List<f8.a> list) {
        super(list);
    }

    @Override // u7.f
    public final Object getValue(f8.a aVar, float f10) {
        Object obj;
        Object obj2 = aVar.f55489b;
        f8.c cVar = this.f87985e;
        if (cVar == null) {
            return (f10 != 1.0f || (obj = aVar.f55490c) == null) ? (x7.c) obj2 : (x7.c) obj;
        }
        float f11 = aVar.f55494g;
        Float f12 = aVar.f55495h;
        float fFloatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
        x7.c cVar2 = (x7.c) obj2;
        Object obj3 = aVar.f55490c;
        return (x7.c) cVar.getValueInternal(f11, fFloatValue, cVar2, obj3 == null ? cVar2 : (x7.c) obj3, f10, c(), getProgress());
    }

    public void setStringValueCallback(f8.c cVar) {
        super.setValueCallback(new u(new f8.b(), cVar, new x7.c()));
    }
}
