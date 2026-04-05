package ke;

import android.util.SparseArray;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.g0;
import com.google.android.exoplayer2.util.v0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import ee.h0;
import ee.k0;
import ee.q;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f70831a;

    public e(g gVar) {
        this.f70831a = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ke.c
    public void binaryElement(int i10, int i11, q qVar) throws IOException {
        int i12;
        int i13;
        int i14;
        long j10;
        int i15;
        int i16;
        int i17;
        int i18;
        g gVar = this.f70831a;
        i iVar = gVar.f70866b;
        SparseArray sparseArray = gVar.f70868c;
        v0 v0Var = gVar.f70874i;
        v0 v0Var2 = gVar.f70872g;
        int i19 = 1;
        int i20 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (gVar.G != 2) {
                    return;
                }
                f fVar = (f) sparseArray.get(gVar.M);
                int i21 = gVar.P;
                v0 v0Var3 = gVar.f70879n;
                if (i21 != 4 || !"V_VP9".equals(fVar.f70833b)) {
                    qVar.skipFully(i11);
                    return;
                } else {
                    v0Var3.reset(i11);
                    qVar.readFully(v0Var3.getData(), 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                gVar.b(i10);
                f fVar2 = gVar.f70886u;
                int i22 = fVar2.f70838g;
                if (i22 != 1685485123 && i22 != 1685480259) {
                    qVar.skipFully(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                fVar2.N = bArr;
                qVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                gVar.b(i10);
                f fVar3 = gVar.f70886u;
                byte[] bArr2 = new byte[i11];
                fVar3.f70840i = bArr2;
                qVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                qVar.readFully(bArr3, 0, i11);
                gVar.b(i10);
                gVar.f70886u.f70841j = new k0(1, bArr3, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(v0Var.getData(), (byte) 0);
                qVar.readFully(v0Var.getData(), 4 - i11, i11);
                v0Var.setPosition(0);
                gVar.f70888w = (int) v0Var.readUnsignedInt();
                return;
            }
            if (i10 == 25506) {
                gVar.b(i10);
                f fVar4 = gVar.f70886u;
                byte[] bArr4 = new byte[i11];
                fVar4.f70842k = bArr4;
                qVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw h2.createForMalformedContainer("Unexpected id: " + i10, null);
            }
            gVar.b(i10);
            f fVar5 = gVar.f70886u;
            byte[] bArr5 = new byte[i11];
            fVar5.f70853v = bArr5;
            qVar.readFully(bArr5, 0, i11);
            return;
        }
        if (gVar.G == 0) {
            gVar.M = (int) iVar.readUnsignedVarint(qVar, false, true, 8);
            gVar.N = iVar.getLastLength();
            gVar.I = C.TIME_UNSET;
            gVar.G = 1;
            v0Var2.reset(0);
        }
        f fVar6 = (f) sparseArray.get(gVar.M);
        if (fVar6 == null) {
            qVar.skipFully(i11 - gVar.N);
            gVar.G = 0;
            return;
        }
        com.google.android.exoplayer2.util.a.checkNotNull(fVar6.X);
        if (gVar.G == 1) {
            gVar.e(qVar, 3);
            int i23 = (v0Var2.getData()[2] & 6) >> 1;
            if (i23 == 0) {
                gVar.K = 1;
                int[] iArr = gVar.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                gVar.L = iArr;
                iArr[0] = (i11 - gVar.N) - 3;
            } else {
                gVar.e(qVar, 4);
                int i24 = (v0Var2.getData()[3] & 255) + 1;
                gVar.K = i24;
                int[] iArr2 = gVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[i24];
                } else if (iArr2.length < i24) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i24)];
                }
                gVar.L = iArr2;
                if (i23 == 2) {
                    int i25 = (i11 - gVar.N) - 4;
                    int i26 = gVar.K;
                    Arrays.fill(iArr2, 0, i26, i25 / i26);
                } else {
                    if (i23 != 1) {
                        if (i23 != 3) {
                            throw h2.createForMalformedContainer("Unexpected lacing value: " + i23, null);
                        }
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = 4;
                        while (true) {
                            int i30 = gVar.K - i19;
                            if (i27 >= i30) {
                                i12 = i19;
                                i13 = i20;
                                gVar.L[i30] = ((i11 - gVar.N) - i29) - i28;
                                break;
                            }
                            gVar.L[i27] = i20;
                            int i31 = i29 + 1;
                            gVar.e(qVar, i31);
                            if (v0Var2.getData()[i29] == 0) {
                                throw h2.createForMalformedContainer("No valid varint length mask found", null);
                            }
                            int i32 = i19;
                            int i33 = i20;
                            while (true) {
                                if (i33 >= 8) {
                                    i14 = i20;
                                    j10 = 0;
                                    i15 = i31;
                                    break;
                                }
                                int i34 = i32 << (7 - i33);
                                if ((v0Var2.getData()[i29] & i34) != 0) {
                                    i14 = i20;
                                    i15 = i31 + i33;
                                    gVar.e(qVar, i15);
                                    j10 = v0Var2.getData()[i29] & 255 & (~i34);
                                    while (i31 < i15) {
                                        j10 = (j10 << 8) | (v0Var2.getData()[i31] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                        i31++;
                                    }
                                    if (i27 > 0) {
                                        j10 -= (1 << ((i33 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i33++;
                                }
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int i35 = (int) j10;
                            int[] iArr3 = gVar.L;
                            if (i27 != 0) {
                                i35 += iArr3[i27 - 1];
                            }
                            iArr3[i27] = i35;
                            i28 += i35;
                            i27++;
                            i29 = i15;
                            i19 = i32;
                            i20 = i14;
                        }
                        throw h2.createForMalformedContainer("EBML lacing sample size out of range.", null);
                    }
                    int i36 = 0;
                    int i37 = 0;
                    int i38 = 4;
                    while (true) {
                        i16 = gVar.K - 1;
                        if (i36 >= i16) {
                            break;
                        }
                        gVar.L[i36] = 0;
                        while (true) {
                            i17 = i38 + 1;
                            gVar.e(qVar, i17);
                            int i39 = v0Var2.getData()[i38] & 255;
                            int[] iArr4 = gVar.L;
                            i18 = iArr4[i36] + i39;
                            iArr4[i36] = i18;
                            if (i39 != 255) {
                                break;
                            } else {
                                i38 = i17;
                            }
                        }
                        i37 += i18;
                        i36++;
                        i38 = i17;
                    }
                    gVar.L[i16] = ((i11 - gVar.N) - i38) - i37;
                }
            }
            i12 = 1;
            i13 = 0;
            gVar.H = gVar.g((v0Var2.getData()[i13] << 8) | (v0Var2.getData()[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + gVar.B;
            gVar.O = (fVar6.f70835d == 2 || (i10 == 163 && (v0Var2.getData()[2] & 128) == 128)) ? i12 : i13;
            gVar.G = 2;
            gVar.J = i13;
        } else {
            i12 = 1;
        }
        if (i10 == 163) {
            while (true) {
                int i40 = gVar.J;
                if (i40 >= gVar.K) {
                    gVar.G = 0;
                    return;
                } else {
                    gVar.c(fVar6, ((gVar.J * fVar6.f70836e) / 1000) + gVar.H, gVar.O, gVar.h(qVar, fVar6, gVar.L[i40], false), 0);
                    gVar.J++;
                }
            }
        } else {
            while (true) {
                int i41 = gVar.J;
                if (i41 >= gVar.K) {
                    return;
                }
                int[] iArr5 = gVar.L;
                boolean z10 = i12;
                iArr5[i41] = gVar.h(qVar, fVar6, iArr5[i41], z10);
                gVar.J += z10 ? 1 : 0;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0192  */
    @Override // ke.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void endMasterElement(int r23) throws com.google.android.exoplayer2.h2 {
        /*
            Method dump skipped, instructions count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.e.endMasterElement(int):void");
    }

    @Override // ke.c
    public void floatElement(int i10, double d10) throws h2 {
        g gVar = this.f70831a;
        if (i10 == 181) {
            gVar.b(i10);
            gVar.f70886u.Q = (int) d10;
            return;
        }
        if (i10 == 17545) {
            gVar.f70884s = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                gVar.b(i10);
                gVar.f70886u.D = (float) d10;
                break;
            case 21970:
                gVar.b(i10);
                gVar.f70886u.E = (float) d10;
                break;
            case 21971:
                gVar.b(i10);
                gVar.f70886u.F = (float) d10;
                break;
            case 21972:
                gVar.b(i10);
                gVar.f70886u.G = (float) d10;
                break;
            case 21973:
                gVar.b(i10);
                gVar.f70886u.H = (float) d10;
                break;
            case 21974:
                gVar.b(i10);
                gVar.f70886u.I = (float) d10;
                break;
            case 21975:
                gVar.b(i10);
                gVar.f70886u.J = (float) d10;
                break;
            case 21976:
                gVar.b(i10);
                gVar.f70886u.K = (float) d10;
                break;
            case 21977:
                gVar.b(i10);
                gVar.f70886u.L = (float) d10;
                break;
            case 21978:
                gVar.b(i10);
                gVar.f70886u.M = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        gVar.b(i10);
                        gVar.f70886u.f70850s = (float) d10;
                        break;
                    case 30324:
                        gVar.b(i10);
                        gVar.f70886u.f70851t = (float) d10;
                        break;
                    case 30325:
                        gVar.b(i10);
                        gVar.f70886u.f70852u = (float) d10;
                        break;
                    default:
                        gVar.getClass();
                        break;
                }
        }
    }

    @Override // ke.c
    public int getElementType(int i10) {
        this.f70831a.getClass();
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
            case PRIVACY_URL_ERROR_VALUE:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 159:
            case 176:
            case 179:
            case 186:
            case AD_RESPONSE_EMPTY_VALUE:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    @Override // ke.c
    public boolean isLevel1Element(int i10) {
        this.f70831a.getClass();
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    @Override // ke.c
    public void startMasterElement(int i10, long j10, long j11) throws h2 {
        g gVar = this.f70831a;
        com.google.android.exoplayer2.util.a.checkStateNotNull(gVar.f70867b0);
        if (i10 == 160) {
            gVar.Q = false;
            gVar.R = 0L;
            return;
        }
        if (i10 != 174) {
            if (i10 == 187) {
                gVar.E = false;
                return;
            }
            if (i10 == 19899) {
                gVar.f70888w = -1;
                gVar.f70889x = -1L;
                return;
            }
            if (i10 == 20533) {
                gVar.b(i10);
                gVar.f70886u.f70839h = true;
                return;
            }
            if (i10 == 21968) {
                gVar.b(i10);
                gVar.f70886u.f70855x = true;
                return;
            }
            if (i10 == 408125543) {
                long j12 = gVar.f70882q;
                if (j12 != -1 && j12 != j10) {
                    throw h2.createForMalformedContainer("Multiple Segment elements not supported", null);
                }
                gVar.f70882q = j10;
                gVar.f70881p = j11;
                return;
            }
            if (i10 == 475249515) {
                gVar.C = new g0();
                gVar.D = new g0();
                return;
            } else {
                if (i10 == 524531317 && !gVar.f70887v) {
                    if (gVar.f70869d && gVar.f70891z != -1) {
                        gVar.f70890y = true;
                        return;
                    } else {
                        gVar.f70867b0.seekMap(new h0(gVar.f70885t));
                        gVar.f70887v = true;
                        return;
                    }
                }
                return;
            }
        }
        f fVar = new f();
        fVar.f70844m = -1;
        fVar.f70845n = -1;
        fVar.f70846o = -1;
        fVar.f70847p = -1;
        fVar.f70848q = 0;
        fVar.f70849r = -1;
        fVar.f70850s = 0.0f;
        fVar.f70851t = 0.0f;
        fVar.f70852u = 0.0f;
        fVar.f70853v = null;
        fVar.f70854w = -1;
        fVar.f70855x = false;
        fVar.f70856y = -1;
        fVar.f70857z = -1;
        fVar.A = -1;
        fVar.B = 1000;
        fVar.C = 200;
        fVar.D = -1.0f;
        fVar.E = -1.0f;
        fVar.F = -1.0f;
        fVar.G = -1.0f;
        fVar.H = -1.0f;
        fVar.I = -1.0f;
        fVar.J = -1.0f;
        fVar.K = -1.0f;
        fVar.L = -1.0f;
        fVar.M = -1.0f;
        fVar.O = 1;
        fVar.P = -1;
        fVar.Q = 8000;
        fVar.R = 0L;
        fVar.S = 0L;
        fVar.V = true;
        fVar.W = "eng";
        gVar.f70886u = fVar;
    }

    @Override // ke.c
    public void stringElement(int i10, String str) throws h2 {
        g gVar = this.f70831a;
        gVar.getClass();
        if (i10 == 134) {
            gVar.b(i10);
            gVar.f70886u.f70833b = str;
            return;
        }
        if (i10 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw h2.createForMalformedContainer("DocType " + str + " not supported", null);
        }
        if (i10 == 21358) {
            gVar.b(i10);
            gVar.f70886u.f70832a = str;
        } else {
            if (i10 != 2274716) {
                return;
            }
            gVar.b(i10);
            gVar.f70886u.W = str;
        }
    }

    @Override // ke.c
    public void integerElement(int i10, long j10) throws h2 {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw h2.createForMalformedContainer("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw h2.createForMalformedContainer("ContentEncodingScope " + j10 + " not supported", null);
        }
        g gVar = this.f70831a;
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                gVar.b(i10);
                gVar.f70886u.f70835d = (int) j10;
                return;
            case PRIVACY_URL_ERROR_VALUE:
                gVar.b(i10);
                gVar.f70886u.V = j10 == 1;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                gVar.I = gVar.g(j10);
                return;
            case 159:
                gVar.b(i10);
                gVar.f70886u.O = (int) j10;
                return;
            case 176:
                gVar.b(i10);
                gVar.f70886u.f70844m = (int) j10;
                return;
            case 179:
                gVar.a(i10);
                gVar.C.add(gVar.g(j10));
                return;
            case 186:
                gVar.b(i10);
                gVar.f70886u.f70845n = (int) j10;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                gVar.b(i10);
                gVar.f70886u.f70834c = (int) j10;
                return;
            case 231:
                gVar.B = gVar.g(j10);
                return;
            case 238:
                gVar.P = (int) j10;
                return;
            case 241:
                if (gVar.E) {
                    return;
                }
                gVar.a(i10);
                gVar.D.add(j10);
                gVar.E = true;
                return;
            case 251:
                gVar.Q = true;
                return;
            case 16871:
                gVar.b(i10);
                gVar.f70886u.f70838g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw h2.createForMalformedContainer("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw h2.createForMalformedContainer("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw h2.createForMalformedContainer("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw h2.createForMalformedContainer("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw h2.createForMalformedContainer(SUvoXnn.nuBibDv + j10 + " not supported", null);
            case 21420:
                gVar.f70889x = j10 + gVar.f70882q;
                return;
            case 21432:
                int i11 = (int) j10;
                gVar.b(i10);
                if (i11 == 0) {
                    gVar.f70886u.f70854w = 0;
                    return;
                }
                if (i11 == 1) {
                    gVar.f70886u.f70854w = 2;
                    return;
                } else if (i11 == 3) {
                    gVar.f70886u.f70854w = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    gVar.f70886u.f70854w = 3;
                    return;
                }
            case 21680:
                gVar.b(i10);
                gVar.f70886u.f70846o = (int) j10;
                return;
            case 21682:
                gVar.b(i10);
                gVar.f70886u.f70848q = (int) j10;
                return;
            case 21690:
                gVar.b(i10);
                gVar.f70886u.f70847p = (int) j10;
                return;
            case 21930:
                gVar.b(i10);
                gVar.f70886u.U = j10 == 1;
                return;
            case 21998:
                gVar.b(i10);
                gVar.f70886u.f70837f = (int) j10;
                return;
            case 22186:
                gVar.b(i10);
                gVar.f70886u.R = j10;
                return;
            case 22203:
                gVar.b(i10);
                gVar.f70886u.S = j10;
                return;
            case 25188:
                gVar.b(i10);
                gVar.f70886u.P = (int) j10;
                return;
            case 30114:
                gVar.R = j10;
                return;
            case 30321:
                gVar.b(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    gVar.f70886u.f70849r = 0;
                    return;
                }
                if (i12 == 1) {
                    gVar.f70886u.f70849r = 1;
                    return;
                } else if (i12 == 2) {
                    gVar.f70886u.f70849r = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    gVar.f70886u.f70849r = 3;
                    return;
                }
            case 2352003:
                gVar.b(i10);
                gVar.f70886u.f70836e = (int) j10;
                return;
            case 2807729:
                gVar.f70883r = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        gVar.b(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            gVar.f70886u.A = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            gVar.f70886u.A = 1;
                            return;
                        }
                    case 21946:
                        gVar.b(i10);
                        int iIsoTransferCharacteristicsToColorTransfer = sf.b.isoTransferCharacteristicsToColorTransfer((int) j10);
                        if (iIsoTransferCharacteristicsToColorTransfer != -1) {
                            gVar.f70886u.f70857z = iIsoTransferCharacteristicsToColorTransfer;
                            return;
                        }
                        return;
                    case 21947:
                        gVar.b(i10);
                        gVar.f70886u.f70855x = true;
                        int iIsoColorPrimariesToColorSpace = sf.b.isoColorPrimariesToColorSpace((int) j10);
                        if (iIsoColorPrimariesToColorSpace != -1) {
                            gVar.f70886u.f70856y = iIsoColorPrimariesToColorSpace;
                            return;
                        }
                        return;
                    case 21948:
                        gVar.b(i10);
                        gVar.f70886u.B = (int) j10;
                        return;
                    case 21949:
                        gVar.b(i10);
                        gVar.f70886u.C = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }
}
