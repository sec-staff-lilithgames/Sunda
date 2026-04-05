package j1;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f69058a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f69059b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f69060c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f69061d;

    /* renamed from: e, reason: collision with root package name */
    public final short[] f69062e;

    public z2(int i10, List list, List list2, List list3, List list4, kotlin.jvm.internal.u uVar) {
        this.f69058a = i10;
        y2 y2Var = new y2(list);
        if (list2.size() != list.size()) {
            throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
        }
        if (list3.size() != list.size()) {
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
        int size = list4.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((Boolean) y2Var.invoke(list4.get(i11))).booleanValue()) {
                throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
            }
        }
        this.f69059b = a(list);
        this.f69060c = a(list2);
        int size2 = list3.size();
        int[] iArr = new int[size2];
        for (int i12 = 0; i12 < size2; i12++) {
            iArr[i12] = o0.m4894toArgb8_81llA(((m0) list3.get(i12)).m4868unboximpl());
        }
        this.f69061d = iArr;
        int size3 = list4.size();
        short[] sArr = new short[size3];
        for (int i13 = 0; i13 < size3; i13++) {
            sArr[i13] = (short) ((Number) list4.get(i13)).intValue();
        }
        this.f69062e = sArr;
    }

    public static float[] a(List list) {
        int size = list.size() * 2;
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            long jM4195unboximpl = ((i1.h) list.get(i10 / 2)).m4195unboximpl();
            fArr[i10] = i10 % 2 == 0 ? i1.h.m4185getXimpl(jM4195unboximpl) : i1.h.m4186getYimpl(jM4195unboximpl);
        }
        return fArr;
    }

    public final int[] getColors() {
        return this.f69061d;
    }

    public final short[] getIndices() {
        return this.f69062e;
    }

    public final float[] getPositions() {
        return this.f69059b;
    }

    public final float[] getTextureCoordinates() {
        return this.f69060c;
    }

    /* renamed from: getVertexMode-c2xauaI, reason: not valid java name */
    public final int m5087getVertexModec2xauaI() {
        return this.f69058a;
    }
}
