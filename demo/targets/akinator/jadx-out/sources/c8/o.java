package c8;

import android.graphics.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class o implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public int f11907a;

    public o(int i10) {
        this.f11907a = i10;
    }

    @Override // c8.l0
    public z7.d parse(d8.c cVar, float f10) throws IOException {
        char c10;
        int iArgb;
        int iArgb2;
        float fLerp;
        int i10;
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        char c11 = 0;
        boolean z10 = cVar.peek() == d8.b.f51924b;
        if (z10) {
            cVar.beginArray();
        }
        while (cVar.hasNext()) {
            arrayList.add(Float.valueOf((float) cVar.nextDouble()));
        }
        int i12 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f11907a = 2;
        }
        if (z10) {
            cVar.endArray();
        }
        if (this.f11907a == -1) {
            this.f11907a = arrayList.size() / 4;
        }
        int i13 = this.f11907a;
        float[] fArr = new float[i13];
        int[] iArr = new int[i13];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < this.f11907a * 4) {
            int i17 = i14 / 4;
            double dFloatValue = ((Float) arrayList.get(i14)).floatValue();
            int i18 = i14 % 4;
            if (i18 != 0) {
                if (i18 == i11) {
                    i15 = (int) (dFloatValue * 255.0d);
                } else if (i18 == 2) {
                    i16 = (int) (dFloatValue * 255.0d);
                } else if (i18 == 3) {
                    iArr[i17] = Color.argb(255, i15, i16, (int) (dFloatValue * 255.0d));
                }
                i10 = i11;
            } else {
                if (i17 > 0) {
                    i10 = i11;
                    float f11 = (float) dFloatValue;
                    if (fArr[i17 - 1] >= f11) {
                        fArr[i17] = f11 + 0.01f;
                    }
                } else {
                    i10 = i11;
                }
                fArr[i17] = (float) dFloatValue;
            }
            i14++;
            i11 = i10;
        }
        int i19 = i11;
        z7.d dVar = new z7.d(fArr, iArr);
        int i20 = this.f11907a * 4;
        if (arrayList.size() <= i20) {
            return dVar;
        }
        float[] positions = dVar.getPositions();
        int[] colors = dVar.getColors();
        int size = (arrayList.size() - i20) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i21 = 0;
        while (i20 < arrayList.size()) {
            if (i20 % 2 == 0) {
                fArr2[i21] = ((Float) arrayList.get(i20)).floatValue();
            } else {
                fArr3[i21] = ((Float) arrayList.get(i20)).floatValue();
                i21++;
            }
            i20++;
        }
        float[] positions2 = dVar.getPositions();
        if (positions2.length == 0) {
            positions2 = fArr2;
        } else if (size != 0) {
            int length = positions2.length + size;
            float[] fArr4 = new float[length];
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            for (int i25 = 0; i25 < length; i25++) {
                float f12 = i23 < positions2.length ? positions2[i23] : Float.NaN;
                float f13 = i24 < size ? fArr2[i24] : Float.NaN;
                if (Float.isNaN(f13) || f12 < f13) {
                    fArr4[i25] = f12;
                    i23++;
                } else if (Float.isNaN(f12) || f13 < f12) {
                    fArr4[i25] = f13;
                    i24++;
                } else {
                    fArr4[i25] = f12;
                    i23++;
                    i24++;
                    i22++;
                }
            }
            positions2 = i22 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i22);
        }
        int length2 = positions2.length;
        int[] iArr2 = new int[length2];
        int i26 = 0;
        while (i26 < length2) {
            float f14 = positions2[i26];
            int iBinarySearch = Arrays.binarySearch(positions, f14);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f14);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                c10 = c11;
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f15 = fArr3[iBinarySearch2];
                if (colors.length >= i12 && f14 != positions[c10]) {
                    for (int i27 = i19; i27 < positions.length; i27++) {
                        float f16 = positions[i27];
                        if (f16 >= f14 || i27 == positions.length - 1) {
                            if (i27 != positions.length - 1 || f14 < f16) {
                                int i28 = i27 - 1;
                                float f17 = positions[i28];
                                int iEvaluate = e8.c.evaluate((f14 - f17) / (f16 - f17), colors[i28], colors[i27]);
                                iArgb = Color.argb((int) (f15 * 255.0f), Color.red(iEvaluate), Color.green(iEvaluate), Color.blue(iEvaluate));
                            } else {
                                iArgb = Color.argb((int) (f15 * 255.0f), Color.red(colors[i27]), Color.green(colors[i27]), Color.blue(colors[i27]));
                            }
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                iArgb = colors[c10];
                iArr2[i26] = iArgb;
            } else {
                int i29 = colors[iBinarySearch];
                if (size >= i12 && f14 > fArr2[c11]) {
                    int i30 = i19;
                    while (i30 < size) {
                        float f18 = fArr2[i30];
                        if (f18 < f14) {
                            c10 = c11;
                            if (i30 != size - 1) {
                                i30++;
                                c11 = c10;
                            }
                        } else {
                            c10 = c11;
                        }
                        if (f18 <= f14) {
                            fLerp = fArr3[i30];
                        } else {
                            int i31 = i30 - 1;
                            float f19 = fArr2[i31];
                            fLerp = e8.j.lerp(fArr3[i31], fArr3[i30], (f14 - f19) / (f18 - f19));
                        }
                        iArgb2 = Color.argb((int) (fLerp * 255.0f), Color.red(i29), Color.green(i29), Color.blue(i29));
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                c10 = c11;
                iArgb2 = Color.argb((int) (fArr3[c10] * 255.0f), Color.red(i29), Color.green(i29), Color.blue(i29));
                iArr2[i26] = iArgb2;
            }
            i26++;
            c11 = c10;
            i12 = 2;
        }
        return new z7.d(positions2, iArr2);
    }
}
