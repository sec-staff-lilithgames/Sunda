package ne;

import com.google.android.exoplayer2.util.v0;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import ee.q;
import ee.t;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final g f76025a = new g();

    /* renamed from: b, reason: collision with root package name */
    public final v0 f76026b = new v0(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f76027c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f76028d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f76029e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.f76028d = 0;
        do {
            int i13 = this.f76028d;
            int i14 = i10 + i13;
            g gVar = this.f76025a;
            if (i14 >= gVar.f76032c) {
                break;
            }
            int[] iArr = gVar.f76035f;
            this.f76028d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public g getPageHeader() {
        return this.f76025a;
    }

    public v0 getPayload() {
        return this.f76026b;
    }

    public boolean populate(q qVar) throws IOException {
        int i10;
        com.google.android.exoplayer2.util.a.checkState(qVar != null);
        boolean z10 = this.f76029e;
        v0 v0Var = this.f76026b;
        if (z10) {
            this.f76029e = false;
            v0Var.reset(0);
        }
        while (!this.f76029e) {
            int i11 = this.f76027c;
            g gVar = this.f76025a;
            if (i11 < 0) {
                if (!gVar.skipToNextPage(qVar) || !gVar.populate(qVar, true)) {
                    return false;
                }
                int iA = gVar.f76033d;
                if ((gVar.f76030a & 1) == 1 && v0Var.limit() == 0) {
                    iA += a(0);
                    i10 = this.f76028d;
                } else {
                    i10 = 0;
                }
                if (!t.skipFullyQuietly(qVar, iA)) {
                    return false;
                }
                this.f76027c = i10;
            }
            int iA2 = a(this.f76027c);
            int i12 = this.f76027c + this.f76028d;
            if (iA2 > 0) {
                v0Var.ensureCapacity(v0Var.limit() + iA2);
                if (!t.readFullyQuietly(qVar, v0Var.getData(), v0Var.limit(), iA2)) {
                    return false;
                }
                v0Var.setLimit(v0Var.limit() + iA2);
                this.f76029e = gVar.f76035f[i12 + (-1)] != 255;
            }
            if (i12 == gVar.f76032c) {
                i12 = -1;
            }
            this.f76027c = i12;
        }
        return true;
    }

    public void reset() {
        this.f76025a.reset();
        this.f76026b.reset(0);
        this.f76027c = -1;
        this.f76029e = false;
    }

    public void trimPayload() {
        v0 v0Var = this.f76026b;
        if (v0Var.getData().length == 65025) {
            return;
        }
        v0Var.reset(Arrays.copyOf(v0Var.getData(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, v0Var.limit())), v0Var.limit());
    }
}
