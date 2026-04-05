package u7;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class k extends m {

    /* renamed from: i, reason: collision with root package name */
    public final z7.d f87998i;

    public k(List<f8.a> list) {
        super(list);
        int iMax = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            z7.d dVar = (z7.d) list.get(i10).f55489b;
            if (dVar != null) {
                iMax = Math.max(iMax, dVar.getSize());
            }
        }
        this.f87998i = new z7.d(new float[iMax], new int[iMax]);
    }

    @Override // u7.f
    public final Object getValue(f8.a aVar, float f10) {
        z7.d dVar = (z7.d) aVar.f55489b;
        z7.d dVar2 = (z7.d) aVar.f55490c;
        z7.d dVar3 = this.f87998i;
        dVar3.lerp(dVar, dVar2, f10);
        return dVar3;
    }
}
