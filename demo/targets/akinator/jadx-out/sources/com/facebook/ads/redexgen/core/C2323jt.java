package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2323jt implements InterfaceC1327Kc {
    public static byte[] A02;
    public static String[] A03 = {"H5L2tIFZt", "7T8ctTOgfri2uFWYkrl4fLjFw3zYZmyw", "rpSuNqLmPSNrp8BaktpsZc4frut4njZi", "OS1ujTmztQNXT6hqD6nsoX0kfRSYmmsY", "PkY6KfFeVbpCvwlFdEj", "TmaVkoyYGnCbszGh0vcMc", "p0AihzwiszaEN", "o1l4pHohEGjnpBhSGl6NtukXiQnI0CCo"};
    public final int A00;
    public final List<C2614or> A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 72);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private List<C2614or> A03(C1326Kb c1326Kb) {
        String strA02;
        int i10;
        if (A05(32)) {
            return this.A01;
        }
        C4J c4j = new C4J(c1326Kb.A03);
        List<C2614or> arrayList = this.A01;
        while (c4j.A07() > 0) {
            int iA0I = c4j.A0I();
            int iA09 = c4j.A09() + c4j.A0I();
            if (iA0I == 134) {
                arrayList = new ArrayList<>();
                int iA0I2 = c4j.A0I() & 31;
                for (int i11 = 0; i11 < iA0I2; i11++) {
                    String strA0W = c4j.A0W(3);
                    int iA0I3 = c4j.A0I();
                    boolean z10 = (iA0I3 & 128) != 0;
                    if (z10) {
                        strA02 = A02(19, 19, 47);
                        i10 = iA0I3 & 63;
                    } else {
                        strA02 = A02(0, 19, 57);
                        i10 = 1;
                    }
                    byte bA0I = (byte) c4j.A0I();
                    c4j.A0g(1);
                    List<byte[]> listA04 = null;
                    if (z10) {
                        boolean z11 = (bA0I & 64) != 0;
                        if (A03[5].length() != 21) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[6] = "Fx9tcNCtSciYr";
                        strArr[4] = "fWuzF8xs7o61BMX22RC";
                        listA04 = C3U.A04(z11);
                    }
                    arrayList.add(new C2D().A11(strA02).A10(strA0W).A0Z(i10).A12(listA04).A14());
                }
            }
            c4j.A0f(iA09);
        }
        return arrayList;
    }

    public static void A04() {
        A02 = new byte[]{-30, -15, -15, -19, -22, -28, -30, -11, -22, -16, -17, -80, -28, -26, -30, -82, -73, -79, -71, -40, -25, -25, -29, -32, -38, -40, -21, -32, -26, -27, -90, -38, -36, -40, -92, -82, -89, -81, 12, 27, 27, 23, 20, 14, 12, 31, 20, 26, 25, -38, 33, 25, 15, -39, 15, 33, 13, -39, 12, 20, 31, -61, -46, -46, -50, -53, -59, -61, -42, -53, -47, -48, -111, -38, -113, -43, -59, -42, -57, -107, -105};
    }

    static {
        A04();
    }

    public C2323jt() {
        this(0);
    }

    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public C2323jt(int i10) {
        this(i10, MetaExoPlayerCustomizedCollections.A03(new C2614or[0]));
    }

    public C2323jt(int i10, List<C2614or> list) {
        this.A00 = i10;
        this.A01 = list;
    }

    private KX A00(C1326Kb c1326Kb) {
        return new KX(A03(c1326Kb));
    }

    private C1332Kh A01(C1326Kb c1326Kb) {
        return new C1332Kh(A03(c1326Kb));
    }

    private boolean A05(int i10) {
        return (this.A00 & i10) != 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1327Kc
    public final SparseArray<InterfaceC1330Kf> A5I() {
        return new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1327Kc
    public final InterfaceC1330Kf A5N(int i10, C1326Kb c1326Kb) {
        switch (i10) {
            case 2:
            case 128:
                return new C2312ji(new C2320jq(A01(c1326Kb)));
            case 3:
            case 4:
                return new C2312ji(new C2314jk(c1326Kb.A01));
            case 15:
                if (A05(2)) {
                    return null;
                }
                return new C2312ji(new C2324ju(false, c1326Kb.A01));
            case 16:
                return new C2312ji(new C2319jp(A01(c1326Kb)));
            case 17:
                if (A05(2)) {
                    return null;
                }
                return new C2312ji(new C2315jl(c1326Kb.A01));
            case 21:
                return new C2312ji(new C2316jm());
            case 27:
                if (A05(4)) {
                    return null;
                }
                return new C2312ji(new C2318jo(A00(c1326Kb), A05(1), A05(8)));
            case 36:
                return new C2312ji(new C2317jn(A00(c1326Kb)));
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                return new C2312ji(new C2321jr(c1326Kb.A02));
            case 129:
            case 135:
                return new C2312ji(new C2330k0(c1326Kb.A01));
            case 130:
                if (!A05(64)) {
                    return null;
                }
                break;
            case 134:
                if (A05(16)) {
                    return null;
                }
                return new C2307jd(new C2313jj(A02(61, 20, 26)));
            case 138:
                break;
            case 172:
                return new C2312ji(new C2327jx(c1326Kb.A01));
            case 257:
                return new C2307jd(new C2313jj(A02(38, 23, 99)));
            default:
                return null;
        }
        return new C2312ji(new C2322js(c1326Kb.A01));
    }
}
