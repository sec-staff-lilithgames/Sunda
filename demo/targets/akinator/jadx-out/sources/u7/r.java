package u7;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class r extends m {

    /* renamed from: i, reason: collision with root package name */
    public final f8.d f88010i;

    public r(List<f8.a> list) {
        super(list);
        this.f88010i = new f8.d();
    }

    @Override // u7.f
    public f8.d getValue(f8.a aVar, float f10) {
        Object obj;
        float f11;
        Object obj2 = aVar.f55489b;
        if (obj2 == null || (obj = aVar.f55490c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        f8.d dVar = (f8.d) obj2;
        f8.d dVar2 = (f8.d) obj;
        f8.c cVar = this.f87985e;
        if (cVar != null) {
            f11 = f10;
            f8.d dVar3 = (f8.d) cVar.getValueInternal(aVar.f55494g, aVar.f55495h.floatValue(), dVar, dVar2, f11, d(), getProgress());
            if (dVar3 != null) {
                return dVar3;
            }
        } else {
            f11 = f10;
        }
        float fLerp = e8.j.lerp(dVar.getScaleX(), dVar2.getScaleX(), f11);
        float fLerp2 = e8.j.lerp(dVar.getScaleY(), dVar2.getScaleY(), f11);
        f8.d dVar4 = this.f88010i;
        dVar4.set(fLerp, fLerp2);
        return dVar4;
    }
}
