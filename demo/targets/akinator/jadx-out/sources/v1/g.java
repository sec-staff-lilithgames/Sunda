package v1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import u1.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g {
    public static final float access$kineticEnergyToVelocity(float f10) {
        return Math.signum(f10) * ((float) Math.sqrt(Math.abs(f10) * 2));
    }

    public static final void addPointerInputChange(f fVar, c0 event) {
        e0.checkNotNullParameter(fVar, "<this>");
        e0.checkNotNullParameter(event, "event");
        List<u1.e> historical = event.getHistorical();
        int size = historical.size();
        for (int i10 = 0; i10 < size; i10++) {
            u1.e eVar = historical.get(i10);
            fVar.m7424addPositionUv8p0NA(eVar.getUptimeMillis(), eVar.m7301getPositionF1C5BW0());
        }
        fVar.m7424addPositionUv8p0NA(event.getUptimeMillis(), event.m7295getPositionF1C5BW0());
    }

    public static final d polyFitLeastSquares(List<Float> x10, List<Float> y10, int i10) {
        e0.checkNotNullParameter(x10, "x");
        e0.checkNotNullParameter(y10, "y");
        if (i10 < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        }
        if (x10.size() != y10.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        }
        if (x10.isEmpty()) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        int size = i10 >= x10.size() ? x10.size() - 1 : i10;
        int i11 = i10 + 1;
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Float.valueOf(0.0f));
        }
        int size2 = x10.size();
        int i13 = size + 1;
        b bVar = new b(i13, size2);
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                break;
            }
            bVar.set(0, i14, 1.0f);
            for (int i15 = 1; i15 < i13; i15++) {
                bVar.set(i15, i14, x10.get(i14).floatValue() * bVar.get(i15 - 1, i14));
            }
            i14++;
        }
        b bVar2 = new b(i13, size2);
        b bVar3 = new b(i13, i13);
        int i16 = 0;
        while (i16 < i13) {
            for (int i17 = 0; i17 < size2; i17++) {
                bVar2.set(i16, i17, bVar.get(i16, i17));
            }
            for (int i18 = 0; i18 < i16; i18++) {
                float fTimes = bVar2.getRow(i16).times(bVar2.getRow(i18));
                for (int i19 = 0; i19 < size2; i19++) {
                    bVar2.set(i16, i19, bVar2.get(i16, i19) - (bVar2.get(i18, i19) * fTimes));
                }
            }
            float fNorm = bVar2.getRow(i16).norm();
            if (fNorm < 1.0E-6d) {
                throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f10 = 1.0f / fNorm;
            for (int i20 = 0; i20 < size2; i20++) {
                bVar2.set(i16, i20, bVar2.get(i16, i20) * f10);
            }
            int i21 = 0;
            while (i21 < i13) {
                bVar3.set(i16, i21, i21 < i16 ? 0.0f : bVar2.getRow(i16).times(bVar.getRow(i21)));
                i21++;
            }
            i16++;
        }
        e eVar = new e(size2);
        for (int i22 = 0; i22 < size2; i22++) {
            eVar.set(i22, y10.get(i22).floatValue() * 1.0f);
        }
        for (int i23 = size; -1 < i23; i23--) {
            arrayList.set(i23, Float.valueOf(bVar2.getRow(i23).times(eVar)));
            int i24 = i23 + 1;
            if (i24 <= size) {
                int i25 = size;
                while (true) {
                    arrayList.set(i23, Float.valueOf(((Number) arrayList.get(i23)).floatValue() - (((Number) arrayList.get(i25)).floatValue() * bVar3.get(i23, i25))));
                    if (i25 != i24) {
                        i25--;
                    }
                }
            }
            arrayList.set(i23, Float.valueOf(((Number) arrayList.get(i23)).floatValue() / bVar3.get(i23, i23)));
        }
        float fFloatValue = 0.0f;
        for (int i26 = 0; i26 < size2; i26++) {
            fFloatValue += y10.get(i26).floatValue();
        }
        float f11 = fFloatValue / size2;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i27 = 0; i27 < size2; i27++) {
            float fFloatValue2 = y10.get(i27).floatValue() - ((Number) arrayList.get(0)).floatValue();
            float fFloatValue3 = 1.0f;
            for (int i28 = 1; i28 < i13; i28++) {
                fFloatValue3 *= x10.get(i27).floatValue();
                fFloatValue2 -= ((Number) arrayList.get(i28)).floatValue() * fFloatValue3;
            }
            f12 += fFloatValue2 * 1.0f * fFloatValue2;
            float fFloatValue4 = y10.get(i27).floatValue() - f11;
            f13 += fFloatValue4 * 1.0f * fFloatValue4;
        }
        return new d(arrayList, f13 > 1.0E-6f ? 1.0f - (f12 / f13) : 1.0f);
    }
}
