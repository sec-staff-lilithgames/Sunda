package co;

import ao.n1;
import io.bidmachine.media3.common.util.b0;
import ko.e1;
import ko.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f12395a;

    /* renamed from: b, reason: collision with root package name */
    public final n1[] f12396b;

    public c(int[] iArr, n1[] n1VarArr) {
        this.f12395a = iArr;
        this.f12396b = n1VarArr;
    }

    public int[] getWriteIndices() {
        n1[] n1VarArr = this.f12396b;
        int[] iArr = new int[n1VarArr.length];
        for (int i10 = 0; i10 < n1VarArr.length; i10++) {
            iArr[i10] = n1VarArr[i10].getWriteIndex();
        }
        return iArr;
    }

    public void setSampleOffsetUs(long j10) {
        for (n1 n1Var : this.f12396b) {
            n1Var.setSampleOffsetUs(j10);
        }
    }

    @Override // co.g
    public e1 track(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f12395a;
            if (i12 >= iArr.length) {
                b0.e("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new v();
            }
            if (i11 == iArr[i12]) {
                return this.f12396b[i12];
            }
            i12++;
        }
    }
}
