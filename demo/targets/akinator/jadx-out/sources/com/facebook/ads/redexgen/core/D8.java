package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class D8 extends AbstractRunnableC1624Vt {
    public static String[] A02 = {"8bjSuFnY7Px2kfd2c5FIfhC79mNHlBDm", "1JhoOK1lCeFzNpWXu7eAiStn9xCsTPmH", "7NMloe4KmVhX4mabvoc5ZBvAFXalYV3E", "rfM3ikXL5SaocWaOB9TmjD2vsiJkKlJd", "sACTLZEyycWa5kMyrq", "mxP57EI80C5Gyk8oclCuNkT0toI", "e5qOGa2bHvCngaVTbxNZ2TaAb3gIhyF7", "QbLt5R1wGXlKwPtnoTvKgxPj8Dj"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ Cdo A01;

    public D8(Cdo cdo, int i10) {
        this.A01 = cdo;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        if (this.A01.A00.A00.getVideoView() != null && this.A00 <= 0) {
            Cdo cdo = this.A01;
            String[] strArr = A02;
            if (strArr[6].charAt(3) == strArr[2].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "CD7DGdNDLCY4UALZZjKA1HiDkec";
            strArr2[7] = "uQvfAiBAn4mqA7tCqZPrCPt4Ck3";
            cdo.A00.A00.getVideoView().A0l(false, 9);
        }
    }
}
