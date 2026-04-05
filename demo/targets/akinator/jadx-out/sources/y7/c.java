package y7;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c extends p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List<f8.a> list) {
        super(list);
        for (int i10 = 0; i10 < list.size(); i10++) {
            f8.a aVarCopyWith = list.get(i10);
            z7.d dVar = (z7.d) aVarCopyWith.f55489b;
            z7.d dVar2 = (z7.d) aVarCopyWith.f55490c;
            if (dVar != null && dVar2 != null && dVar.getPositions().length != dVar2.getPositions().length) {
                float[] positions = dVar.getPositions();
                float[] positions2 = dVar2.getPositions();
                int length = positions.length + positions2.length;
                float[] fArr = new float[length];
                System.arraycopy(positions, 0, fArr, 0, positions.length);
                System.arraycopy(positions2, 0, fArr, positions.length, positions2.length);
                Arrays.sort(fArr);
                float f10 = Float.NaN;
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    float f11 = fArr[i12];
                    if (f11 != f10) {
                        fArr[i11] = f11;
                        i11++;
                        f10 = fArr[i12];
                    }
                }
                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, i11);
                aVarCopyWith = aVarCopyWith.copyWith(dVar.copyWithPositions(fArrCopyOfRange), dVar2.copyWithPositions(fArrCopyOfRange));
            }
            list.set(i10, aVarCopyWith);
        }
    }

    @Override // y7.p, y7.o
    public u7.f createAnimation() {
        return new u7.k(this.f94142a);
    }

    @Override // y7.p, y7.o
    public /* bridge */ /* synthetic */ List getKeyframes() {
        return super.getKeyframes();
    }

    @Override // y7.p, y7.o
    public /* bridge */ /* synthetic */ boolean isStatic() {
        return super.isStatic();
    }

    @Override // y7.p
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
