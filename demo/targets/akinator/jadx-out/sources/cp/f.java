package cp;

import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.n;
import gn.z0;
import io.bidmachine.media3.common.util.c0;
import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import ko.a0;
import ko.d1;
import ko.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f50799a;

    public f(h hVar) {
        this.f50799a = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cp.c
    public void binaryElement(int i10, int i11, a0 a0Var) throws IOException {
        int i12;
        int i13;
        int i14;
        long j10;
        int i15;
        int i16;
        int i17;
        int i18;
        h hVar = this.f50799a;
        j jVar = hVar.f50835b;
        SparseArray sparseArray = hVar.f50837c;
        m0 m0Var = hVar.f50848k;
        m0 m0Var2 = hVar.f50846i;
        int i19 = 1;
        int i20 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (hVar.J != 2) {
                    return;
                }
                g gVar = (g) sparseArray.get(hVar.P);
                int i21 = hVar.S;
                m0 m0Var3 = hVar.f50853p;
                if (i21 != 4 || !"V_VP9".equals(gVar.f50803c)) {
                    a0Var.skipFully(i11);
                    return;
                } else {
                    m0Var3.reset(i11);
                    a0Var.readFully(m0Var3.getData(), 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                hVar.b(i10);
                g gVar2 = hVar.f50861x;
                int i22 = gVar2.f50808h;
                if (i22 != 1685485123 && i22 != 1685480259) {
                    a0Var.skipFully(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                gVar2.P = bArr;
                a0Var.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                hVar.b(i10);
                g gVar3 = hVar.f50861x;
                byte[] bArr2 = new byte[i11];
                gVar3.f50810j = bArr2;
                a0Var.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                a0Var.readFully(bArr3, 0, i11);
                hVar.b(i10);
                hVar.f50861x.f50811k = new d1(1, bArr3, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(m0Var.getData(), (byte) 0);
                a0Var.readFully(m0Var.getData(), 4 - i11, i11);
                m0Var.setPosition(0);
                hVar.f50863z = (int) m0Var.readUnsignedInt();
                return;
            }
            if (i10 == 25506) {
                hVar.b(i10);
                g gVar4 = hVar.f50861x;
                byte[] bArr4 = new byte[i11];
                gVar4.f50812l = bArr4;
                a0Var.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw z0.createForMalformedContainer("Unexpected id: " + i10, null);
            }
            hVar.b(i10);
            g gVar5 = hVar.f50861x;
            byte[] bArr5 = new byte[i11];
            gVar5.f50824x = bArr5;
            a0Var.readFully(bArr5, 0, i11);
            return;
        }
        if (hVar.J == 0) {
            hVar.P = (int) jVar.readUnsignedVarint(a0Var, false, true, 8);
            hVar.Q = jVar.getLastLength();
            hVar.L = C.TIME_UNSET;
            hVar.J = 1;
            m0Var2.reset(0);
        }
        g gVar6 = (g) sparseArray.get(hVar.P);
        if (gVar6 == null) {
            a0Var.skipFully(i11 - hVar.Q);
            hVar.J = 0;
            return;
        }
        io.bidmachine.media3.common.util.a.checkNotNull(gVar6.Z);
        if (hVar.J == 1) {
            hVar.e(a0Var, 3);
            int i23 = (m0Var2.getData()[2] & 6) >> 1;
            if (i23 == 0) {
                hVar.N = 1;
                int[] iArr = hVar.O;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                hVar.O = iArr;
                iArr[0] = (i11 - hVar.Q) - 3;
            } else {
                hVar.e(a0Var, 4);
                int i24 = (m0Var2.getData()[3] & 255) + 1;
                hVar.N = i24;
                int[] iArr2 = hVar.O;
                if (iArr2 == null) {
                    iArr2 = new int[i24];
                } else if (iArr2.length < i24) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i24)];
                }
                hVar.O = iArr2;
                if (i23 == 2) {
                    int i25 = (i11 - hVar.Q) - 4;
                    int i26 = hVar.N;
                    Arrays.fill(iArr2, 0, i26, i25 / i26);
                } else {
                    if (i23 != 1) {
                        if (i23 != 3) {
                            throw z0.createForMalformedContainer("Unexpected lacing value: " + i23, null);
                        }
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = 4;
                        while (true) {
                            int i30 = hVar.N - i19;
                            if (i27 >= i30) {
                                i12 = i19;
                                i13 = i20;
                                hVar.O[i30] = ((i11 - hVar.Q) - i29) - i28;
                                break;
                            }
                            hVar.O[i27] = i20;
                            int i31 = i29 + 1;
                            hVar.e(a0Var, i31);
                            if (m0Var2.getData()[i29] == 0) {
                                throw z0.createForMalformedContainer("No valid varint length mask found", null);
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
                                if ((m0Var2.getData()[i29] & i34) != 0) {
                                    i14 = i20;
                                    i15 = i31 + i33;
                                    hVar.e(a0Var, i15);
                                    j10 = m0Var2.getData()[i29] & 255 & (~i34);
                                    while (i31 < i15) {
                                        j10 = (j10 << 8) | (m0Var2.getData()[i31] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
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
                            int[] iArr3 = hVar.O;
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
                        throw z0.createForMalformedContainer("EBML lacing sample size out of range.", null);
                    }
                    int i36 = 0;
                    int i37 = 0;
                    int i38 = 4;
                    while (true) {
                        i16 = hVar.N - 1;
                        if (i36 >= i16) {
                            break;
                        }
                        hVar.O[i36] = 0;
                        while (true) {
                            i17 = i38 + 1;
                            hVar.e(a0Var, i17);
                            int i39 = m0Var2.getData()[i38] & 255;
                            int[] iArr4 = hVar.O;
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
                    hVar.O[i16] = ((i11 - hVar.Q) - i38) - i37;
                }
            }
            i12 = 1;
            i13 = 0;
            hVar.K = hVar.g((m0Var2.getData()[i13] << 8) | (m0Var2.getData()[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + hVar.E;
            hVar.R = (gVar6.f50805e == 2 || (i10 == 163 && (m0Var2.getData()[2] & 128) == 128)) ? i12 : i13;
            hVar.J = 2;
            hVar.M = i13;
        } else {
            i12 = 1;
        }
        if (i10 == 163) {
            while (true) {
                int i40 = hVar.M;
                if (i40 >= hVar.N) {
                    hVar.J = 0;
                    return;
                } else {
                    hVar.c(gVar6, ((hVar.M * gVar6.f50806f) / 1000) + hVar.K, hVar.R, hVar.h(a0Var, gVar6, hVar.O[i40], false), 0);
                    hVar.M++;
                }
            }
        } else {
            while (true) {
                int i41 = hVar.M;
                if (i41 >= hVar.N) {
                    return;
                }
                int[] iArr5 = hVar.O;
                boolean z10 = i12;
                iArr5[i41] = hVar.h(a0Var, gVar6, iArr5[i41], z10);
                hVar.M += z10 ? 1 : 0;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0196  */
    @Override // cp.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void endMasterElement(int r21) throws gn.z0 {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cp.f.endMasterElement(int):void");
    }

    @Override // cp.c
    public void floatElement(int i10, double d10) throws z0 {
        h hVar = this.f50799a;
        if (i10 == 181) {
            hVar.b(i10);
            hVar.f50861x.S = (int) d10;
            return;
        }
        if (i10 == 17545) {
            hVar.f50858u = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                hVar.b(i10);
                hVar.f50861x.F = (float) d10;
                break;
            case 21970:
                hVar.b(i10);
                hVar.f50861x.G = (float) d10;
                break;
            case 21971:
                hVar.b(i10);
                hVar.f50861x.H = (float) d10;
                break;
            case 21972:
                hVar.b(i10);
                hVar.f50861x.I = (float) d10;
                break;
            case 21973:
                hVar.b(i10);
                hVar.f50861x.J = (float) d10;
                break;
            case 21974:
                hVar.b(i10);
                hVar.f50861x.K = (float) d10;
                break;
            case 21975:
                hVar.b(i10);
                hVar.f50861x.L = (float) d10;
                break;
            case 21976:
                hVar.b(i10);
                hVar.f50861x.M = (float) d10;
                break;
            case 21977:
                hVar.b(i10);
                hVar.f50861x.N = (float) d10;
                break;
            case 21978:
                hVar.b(i10);
                hVar.f50861x.O = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        hVar.b(i10);
                        hVar.f50861x.f50821u = (float) d10;
                        break;
                    case 30324:
                        hVar.b(i10);
                        hVar.f50861x.f50822v = (float) d10;
                        break;
                    case 30325:
                        hVar.b(i10);
                        hVar.f50861x.f50823w = (float) d10;
                        break;
                    default:
                        hVar.getClass();
                        break;
                }
        }
    }

    @Override // cp.c
    public int getElementType(int i10) {
        this.f50799a.getClass();
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
            case 21938:
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

    @Override // cp.c
    public void integerElement(int i10, long j10) throws z0 {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw z0.createForMalformedContainer("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw z0.createForMalformedContainer("ContentEncodingScope " + j10 + " not supported", null);
        }
        h hVar = this.f50799a;
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                hVar.b(i10);
                hVar.f50861x.f50805e = (int) j10;
                return;
            case PRIVACY_URL_ERROR_VALUE:
                hVar.b(i10);
                hVar.f50861x.X = j10 == 1;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                hVar.L = hVar.g(j10);
                return;
            case 159:
                hVar.b(i10);
                hVar.f50861x.Q = (int) j10;
                return;
            case 176:
                hVar.b(i10);
                hVar.f50861x.f50814n = (int) j10;
                return;
            case 179:
                hVar.a(i10);
                hVar.F.add(hVar.g(j10));
                return;
            case 186:
                hVar.b(i10);
                hVar.f50861x.f50815o = (int) j10;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                hVar.b(i10);
                hVar.f50861x.f50804d = (int) j10;
                return;
            case 231:
                hVar.E = hVar.g(j10);
                return;
            case 238:
                hVar.S = (int) j10;
                return;
            case 241:
                if (hVar.H) {
                    return;
                }
                hVar.a(i10);
                hVar.G.add(j10);
                hVar.H = true;
                return;
            case 251:
                hVar.T = true;
                return;
            case 16871:
                hVar.b(i10);
                hVar.f50861x.f50808h = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw z0.createForMalformedContainer("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw z0.createForMalformedContainer("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw z0.createForMalformedContainer("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw z0.createForMalformedContainer("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw z0.createForMalformedContainer("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                hVar.A = j10 + hVar.f50856s;
                return;
            case 21432:
                int i11 = (int) j10;
                hVar.b(i10);
                if (i11 == 0) {
                    hVar.f50861x.f50825y = 0;
                    return;
                }
                if (i11 == 1) {
                    hVar.f50861x.f50825y = 2;
                    return;
                } else if (i11 == 3) {
                    hVar.f50861x.f50825y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    hVar.f50861x.f50825y = 3;
                    return;
                }
            case 21680:
                hVar.b(i10);
                hVar.f50861x.f50817q = (int) j10;
                return;
            case 21682:
                hVar.b(i10);
                hVar.f50861x.f50819s = (int) j10;
                return;
            case 21690:
                hVar.b(i10);
                hVar.f50861x.f50818r = (int) j10;
                return;
            case 21930:
                hVar.b(i10);
                hVar.f50861x.W = j10 == 1;
                return;
            case 21938:
                hVar.b(i10);
                g gVar = hVar.f50861x;
                gVar.f50826z = true;
                gVar.f50816p = (int) j10;
                return;
            case 21998:
                hVar.b(i10);
                hVar.f50861x.f50807g = (int) j10;
                return;
            case 22186:
                hVar.b(i10);
                hVar.f50861x.T = j10;
                return;
            case 22203:
                hVar.b(i10);
                hVar.f50861x.U = j10;
                return;
            case 25188:
                hVar.b(i10);
                hVar.f50861x.R = (int) j10;
                return;
            case 30114:
                hVar.U = j10;
                return;
            case 30321:
                hVar.b(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    hVar.f50861x.f50820t = 0;
                    return;
                }
                if (i12 == 1) {
                    hVar.f50861x.f50820t = 1;
                    return;
                } else if (i12 == 2) {
                    hVar.f50861x.f50820t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    hVar.f50861x.f50820t = 3;
                    return;
                }
            case 2352003:
                hVar.b(i10);
                hVar.f50861x.f50806f = (int) j10;
                return;
            case 2807729:
                hVar.f50857t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        hVar.b(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            hVar.f50861x.C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            hVar.f50861x.C = 1;
                            return;
                        }
                    case 21946:
                        hVar.b(i10);
                        int iIsoTransferCharacteristicsToColorTransfer = n.isoTransferCharacteristicsToColorTransfer((int) j10);
                        if (iIsoTransferCharacteristicsToColorTransfer != -1) {
                            hVar.f50861x.B = iIsoTransferCharacteristicsToColorTransfer;
                            return;
                        }
                        return;
                    case 21947:
                        hVar.b(i10);
                        hVar.f50861x.f50826z = true;
                        int iIsoColorPrimariesToColorSpace = n.isoColorPrimariesToColorSpace((int) j10);
                        if (iIsoColorPrimariesToColorSpace != -1) {
                            hVar.f50861x.A = iIsoColorPrimariesToColorSpace;
                            return;
                        }
                        return;
                    case 21948:
                        hVar.b(i10);
                        hVar.f50861x.D = (int) j10;
                        return;
                    case 21949:
                        hVar.b(i10);
                        hVar.f50861x.E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // cp.c
    public boolean isLevel1Element(int i10) {
        this.f50799a.getClass();
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    @Override // cp.c
    public void startMasterElement(int i10, long j10, long j11) throws z0 {
        h hVar = this.f50799a;
        io.bidmachine.media3.common.util.a.checkStateNotNull(hVar.f50842e0);
        if (i10 == 160) {
            hVar.T = false;
            hVar.U = 0L;
            return;
        }
        if (i10 != 174) {
            if (i10 == 187) {
                hVar.H = false;
                return;
            }
            if (i10 == 19899) {
                hVar.f50863z = -1;
                hVar.A = -1L;
                return;
            }
            if (i10 == 20533) {
                hVar.b(i10);
                hVar.f50861x.f50809i = true;
                return;
            }
            if (i10 == 21968) {
                hVar.b(i10);
                hVar.f50861x.f50826z = true;
                return;
            }
            if (i10 == 408125543) {
                long j12 = hVar.f50856s;
                if (j12 != -1 && j12 != j10) {
                    throw z0.createForMalformedContainer("Multiple Segment elements not supported", null);
                }
                hVar.f50856s = j10;
                hVar.f50855r = j11;
                return;
            }
            if (i10 == 475249515) {
                hVar.F = new c0();
                hVar.G = new c0();
                return;
            } else {
                if (i10 == 524531317 && !hVar.f50862y) {
                    if (hVar.f50839d && hVar.C != -1) {
                        hVar.B = true;
                        return;
                    } else {
                        hVar.f50842e0.seekMap(new x0(hVar.f50859v));
                        hVar.f50862y = true;
                        return;
                    }
                }
                return;
            }
        }
        g gVar = new g();
        gVar.f50814n = -1;
        gVar.f50815o = -1;
        gVar.f50816p = -1;
        gVar.f50817q = -1;
        gVar.f50818r = -1;
        gVar.f50819s = 0;
        gVar.f50820t = -1;
        gVar.f50821u = 0.0f;
        gVar.f50822v = 0.0f;
        gVar.f50823w = 0.0f;
        gVar.f50824x = null;
        gVar.f50825y = -1;
        gVar.f50826z = false;
        gVar.A = -1;
        gVar.B = -1;
        gVar.C = -1;
        gVar.D = 1000;
        gVar.E = 200;
        gVar.F = -1.0f;
        gVar.G = -1.0f;
        gVar.H = -1.0f;
        gVar.I = -1.0f;
        gVar.J = -1.0f;
        gVar.K = -1.0f;
        gVar.L = -1.0f;
        gVar.M = -1.0f;
        gVar.N = -1.0f;
        gVar.O = -1.0f;
        gVar.Q = 1;
        gVar.R = -1;
        gVar.S = 8000;
        gVar.T = 0L;
        gVar.U = 0L;
        gVar.X = true;
        gVar.Y = "eng";
        hVar.f50861x = gVar;
        gVar.f50800a = hVar.f50860w;
    }

    @Override // cp.c
    public void stringElement(int i10, String str) throws z0 {
        h hVar = this.f50799a;
        hVar.getClass();
        if (i10 == 134) {
            hVar.b(i10);
            hVar.f50861x.f50803c = str;
            return;
        }
        if (i10 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                hVar.f50860w = Objects.equals(str, "webm");
                return;
            }
            throw z0.createForMalformedContainer("DocType " + str + " not supported", null);
        }
        if (i10 == 21358) {
            hVar.b(i10);
            hVar.f50861x.f50802b = str;
        } else {
            if (i10 != 2274716) {
                return;
            }
            hVar.b(i10);
            hVar.f50861x.Y = str;
        }
    }
}
