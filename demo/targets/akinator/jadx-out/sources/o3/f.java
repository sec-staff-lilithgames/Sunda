package o3;

import android.graphics.Path;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f {
    public static float[] a(float[] fArr, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i10, length);
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static boolean canMorph(e[] eVarArr, e[] eVarArr2) {
        if (eVarArr == null || eVarArr2 == null || eVarArr.length != eVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            if (eVarArr[i10].f77436a != eVarArr2[i10].f77436a || eVarArr[i10].f77437b.length != eVarArr2[i10].f77437b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o3.e[] createNodesFromPathData(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.f.createNodesFromPathData(java.lang.String):o3.e[]");
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        try {
            e.nodesToPath(createNodesFromPathData(str), path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException(a.b.k("Error in parsing ", str), e10);
        }
    }

    public static e[] deepCopyNodes(e[] eVarArr) {
        e[] eVarArr2 = new e[eVarArr.length];
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            eVarArr2[i10] = new e(eVarArr[i10]);
        }
        return eVarArr2;
    }

    public static void interpolatePathDataNodes(e[] eVarArr, float f10, e[] eVarArr2, e[] eVarArr3) {
        if (!interpolatePathDataNodes(eVarArr, eVarArr2, eVarArr3, f10)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void nodesToPath(e[] eVarArr, Path path) {
        int i10;
        int i11;
        float[] fArr;
        int i12;
        int i13;
        char c10;
        float f10;
        float f11;
        float f12;
        float f13;
        char c11;
        boolean z10;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = eVarArr.length;
        int i14 = 0;
        char c12 = 'm';
        int i15 = 0;
        while (i15 < length) {
            e eVar = eVarArr[i15];
            char c13 = eVar.f77436a;
            float[] fArr3 = eVar.f77437b;
            float f22 = fArr2[i14];
            float f23 = fArr2[1];
            float f24 = fArr2[2];
            float f25 = fArr2[3];
            float f26 = fArr2[4];
            float f27 = fArr2[5];
            switch (c13) {
                case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                case 'a':
                    i10 = 7;
                    break;
                case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                case 'c':
                    i10 = 6;
                    break;
                case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                case 'V':
                case 'h':
                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                    i10 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i10 = 4;
                    break;
                case 'Z':
                case INVALID_ADS_ENDPOINT_VALUE:
                    path2.close();
                    path2.moveTo(f26, f27);
                    f22 = f26;
                    f24 = f22;
                    f23 = f27;
                    f25 = f23;
                default:
                    i10 = 2;
                    break;
            }
            float f28 = f23;
            float f29 = f26;
            float f30 = f27;
            float f31 = f22;
            int i16 = i14;
            while (i16 < fArr3.length) {
                if (c13 == 'A') {
                    i11 = i16;
                    fArr = fArr3;
                    float f32 = f31;
                    i12 = i14;
                    float f33 = f28;
                    i13 = i15;
                    c10 = c13;
                    int i17 = i11 + 5;
                    int i18 = i11 + 6;
                    e.d(path, f32, f33, fArr[i17], fArr[i18], fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3] != 0.0f ? 1 : i12, fArr[i11 + 4] != 0.0f ? 1 : i12);
                    f24 = fArr[i17];
                    f10 = fArr[i18];
                    f25 = f10;
                    f11 = f24;
                } else if (c13 != 'C') {
                    i12 = i14;
                    if (c13 != 'H') {
                        if (c13 == 'Q') {
                            i11 = i16;
                            i13 = i15;
                            c10 = c13;
                            fArr = fArr3;
                            int i19 = i11 + 1;
                            int i20 = i11 + 2;
                            int i21 = i11 + 3;
                            path2.quadTo(fArr[i11], fArr[i19], fArr[i20], fArr[i21]);
                            f12 = fArr[i11];
                            float f34 = fArr[i19];
                            f13 = fArr[i20];
                            f25 = f34;
                            f10 = fArr[i21];
                        } else if (c13 == 'V') {
                            i11 = i16;
                            i13 = i15;
                            fArr = fArr3;
                            f11 = f31;
                            c10 = c13;
                            path2.lineTo(f11, fArr[i11]);
                            f10 = fArr[i11];
                        } else if (c13 != 'a') {
                            if (c13 == 'c') {
                                i11 = i16;
                                int i22 = i11 + 2;
                                int i23 = i11 + 3;
                                int i24 = i11 + 4;
                                int i25 = i11 + 5;
                                path2.rCubicTo(fArr3[i11], fArr3[i11 + 1], fArr3[i22], fArr3[i23], fArr3[i24], fArr3[i25]);
                                float f35 = fArr3[i22] + f31;
                                float f36 = f28 + fArr3[i23];
                                f31 += fArr3[i24];
                                f28 += fArr3[i25];
                                f24 = f35;
                                f25 = f36;
                            } else if (c13 != 'h') {
                                if (c13 != 'q') {
                                    if (c13 != 'v') {
                                        if (c13 == 'L') {
                                            i11 = i16;
                                            int i26 = i11 + 1;
                                            path2.lineTo(fArr3[i11], fArr3[i26]);
                                            f11 = fArr3[i11];
                                            f10 = fArr3[i26];
                                        } else if (c13 == 'M') {
                                            i11 = i16;
                                            f11 = fArr3[i11];
                                            f10 = fArr3[i11 + 1];
                                            if (i11 > 0) {
                                                path2.lineTo(f11, f10);
                                            } else {
                                                path2.moveTo(f11, f10);
                                                f29 = f11;
                                                f30 = f10;
                                            }
                                        } else if (c13 == 'S') {
                                            i11 = i16;
                                            if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                                f31 = (f31 * 2.0f) - f24;
                                                f28 = (f28 * 2.0f) - f25;
                                            }
                                            float f37 = f31;
                                            float f38 = f28;
                                            int i27 = i11 + 1;
                                            int i28 = i11 + 2;
                                            int i29 = i11 + 3;
                                            path2.cubicTo(f37, f38, fArr3[i11], fArr3[i27], fArr3[i28], fArr3[i29]);
                                            f12 = fArr3[i11];
                                            float f39 = fArr3[i27];
                                            f13 = fArr3[i28];
                                            f25 = f39;
                                            f10 = fArr3[i29];
                                            i13 = i15;
                                            c10 = c13;
                                            fArr = fArr3;
                                        } else if (c13 == 'T') {
                                            i11 = i16;
                                            if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                                f31 = (f31 * 2.0f) - f24;
                                                f28 = (f28 * 2.0f) - f25;
                                            }
                                            float f40 = f28;
                                            int i30 = i11 + 1;
                                            path2.quadTo(f31, f40, fArr3[i11], fArr3[i30]);
                                            f25 = f40;
                                            f11 = fArr3[i11];
                                            f10 = fArr3[i30];
                                            i13 = i15;
                                            fArr = fArr3;
                                            f24 = f31;
                                            c10 = c13;
                                        } else if (c13 == 'l') {
                                            i11 = i16;
                                            int i31 = i11 + 1;
                                            path2.rLineTo(fArr3[i11], fArr3[i31]);
                                            f31 += fArr3[i11];
                                            f17 = fArr3[i31];
                                        } else if (c13 == 'm') {
                                            i11 = i16;
                                            float f41 = fArr3[i11];
                                            f31 += f41;
                                            float f42 = fArr3[i11 + 1];
                                            f28 += f42;
                                            if (i11 > 0) {
                                                path2.rLineTo(f41, f42);
                                            } else {
                                                path2.rMoveTo(f41, f42);
                                                fArr = fArr3;
                                                f11 = f31;
                                                f29 = f11;
                                                f10 = f28;
                                                f30 = f10;
                                                i13 = i15;
                                                c10 = c13;
                                            }
                                        } else if (c13 == 's') {
                                            if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                                f18 = f28 - f25;
                                                f19 = f31 - f24;
                                            } else {
                                                f19 = 0.0f;
                                                f18 = 0.0f;
                                            }
                                            int i32 = i16 + 1;
                                            int i33 = i16 + 2;
                                            int i34 = i16 + 3;
                                            i11 = i16;
                                            path2.rCubicTo(f19, f18, fArr3[i16], fArr3[i32], fArr3[i33], fArr3[i34]);
                                            f14 = fArr3[i11] + f31;
                                            f15 = f28 + fArr3[i32];
                                            f31 += fArr3[i33];
                                            f16 = fArr3[i34];
                                        } else if (c13 != 't') {
                                            i11 = i16;
                                        } else {
                                            if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                                f20 = f31 - f24;
                                                f21 = f28 - f25;
                                            } else {
                                                f21 = 0.0f;
                                                f20 = 0.0f;
                                            }
                                            int i35 = i16 + 1;
                                            path2.rQuadTo(f20, f21, fArr3[i16], fArr3[i35]);
                                            float f43 = f20 + f31;
                                            float f44 = f28 + f21;
                                            f31 += fArr3[i16];
                                            f28 += fArr3[i35];
                                            f25 = f44;
                                            i11 = i16;
                                            f24 = f43;
                                        }
                                        i13 = i15;
                                        c10 = c13;
                                        fArr = fArr3;
                                    } else {
                                        i11 = i16;
                                        path2.rLineTo(0.0f, fArr3[i11]);
                                        f17 = fArr3[i11];
                                    }
                                    f28 += f17;
                                } else {
                                    i11 = i16;
                                    int i36 = i11 + 1;
                                    int i37 = i11 + 2;
                                    int i38 = i11 + 3;
                                    path2.rQuadTo(fArr3[i11], fArr3[i36], fArr3[i37], fArr3[i38]);
                                    f14 = fArr3[i11] + f31;
                                    f15 = f28 + fArr3[i36];
                                    f31 += fArr3[i37];
                                    f16 = fArr3[i38];
                                }
                                f28 += f16;
                                f24 = f14;
                                f25 = f15;
                            } else {
                                i11 = i16;
                                path2.rLineTo(fArr3[i11], 0.0f);
                                f31 += fArr3[i11];
                            }
                            fArr = fArr3;
                            f11 = f31;
                            f10 = f28;
                            i13 = i15;
                            c10 = c13;
                        } else {
                            i11 = i16;
                            int i39 = i11 + 5;
                            float f45 = fArr3[i39] + f31;
                            int i40 = i11 + 6;
                            float f46 = fArr3[i40] + f28;
                            float f47 = fArr3[i11];
                            float f48 = fArr3[i11 + 1];
                            float f49 = fArr3[i11 + 2];
                            if (fArr3[i11 + 3] != 0.0f) {
                                c11 = c13;
                                z10 = 1;
                            } else {
                                c11 = c13;
                                z10 = i12;
                            }
                            fArr = fArr3;
                            float f50 = f31;
                            c10 = c11;
                            float f51 = f28;
                            i13 = i15;
                            e.d(path, f50, f51, f45, f46, f47, f48, f49, z10, fArr3[i11 + 4] != 0.0f ? 1 : i12);
                            f11 = f50 + fArr[i39];
                            f10 = f51 + fArr[i40];
                            f24 = f11;
                            f25 = f10;
                        }
                        f24 = f12;
                        f11 = f13;
                    } else {
                        i11 = i16;
                        c10 = c13;
                        fArr = fArr3;
                        f10 = f28;
                        i13 = i15;
                        path2.lineTo(fArr[i11], f10);
                        f11 = fArr[i11];
                    }
                } else {
                    i11 = i16;
                    i13 = i15;
                    c10 = c13;
                    fArr = fArr3;
                    i12 = i14;
                    int i41 = i11 + 2;
                    int i42 = i11 + 3;
                    int i43 = i11 + 4;
                    int i44 = i11 + 5;
                    path2.cubicTo(fArr[i11], fArr[i11 + 1], fArr[i41], fArr[i42], fArr[i43], fArr[i44]);
                    float f52 = fArr[i43];
                    float f53 = fArr[i44];
                    f24 = fArr[i41];
                    f25 = fArr[i42];
                    f10 = f53;
                    f11 = f52;
                }
                c13 = c10;
                i15 = i13;
                i14 = i12;
                fArr3 = fArr;
                f31 = f11;
                f28 = f10;
                c12 = c13;
                i16 = i11 + i10;
                path2 = path;
            }
            fArr2[i14] = f31;
            fArr2[1] = f28;
            fArr2[2] = f24;
            fArr2[3] = f25;
            fArr2[4] = f29;
            fArr2[5] = f30;
            c12 = eVar.f77436a;
            i15++;
            path2 = path;
        }
    }

    public static void updateNodes(e[] eVarArr, e[] eVarArr2) {
        for (int i10 = 0; i10 < eVarArr2.length; i10++) {
            eVarArr[i10].f77436a = eVarArr2[i10].f77436a;
            for (int i11 = 0; i11 < eVarArr2[i10].f77437b.length; i11++) {
                eVarArr[i10].f77437b[i11] = eVarArr2[i10].f77437b[i11];
            }
        }
    }

    @Deprecated
    public static boolean interpolatePathDataNodes(e[] eVarArr, e[] eVarArr2, e[] eVarArr3, float f10) {
        if (eVarArr.length == eVarArr2.length && eVarArr2.length == eVarArr3.length) {
            if (!canMorph(eVarArr2, eVarArr3)) {
                return false;
            }
            for (int i10 = 0; i10 < eVarArr.length; i10++) {
                eVarArr[i10].interpolatePathDataNode(eVarArr2[i10], eVarArr3[i10], f10);
            }
            return true;
        }
        throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
    }
}
