package fp;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import java.util.Arrays;
import ko.a0;
import ko.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final g f55952a = new g();

    /* renamed from: b, reason: collision with root package name */
    public final m0 f55953b = new m0(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f55954c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f55955d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f55956e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.f55955d = 0;
        do {
            int i13 = this.f55955d;
            int i14 = i10 + i13;
            g gVar = this.f55952a;
            if (i14 >= gVar.f55959c) {
                break;
            }
            int[] iArr = gVar.f55962f;
            this.f55955d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public g getPageHeader() {
        return this.f55952a;
    }

    public m0 getPayload() {
        return this.f55953b;
    }

    public boolean populate(a0 a0Var) throws IOException {
        int i10;
        io.bidmachine.media3.common.util.a.checkState(a0Var != null);
        boolean z10 = this.f55956e;
        m0 m0Var = this.f55953b;
        if (z10) {
            this.f55956e = false;
            m0Var.reset(0);
        }
        while (!this.f55956e) {
            int i11 = this.f55954c;
            g gVar = this.f55952a;
            if (i11 < 0) {
                if (!gVar.skipToNextPage(a0Var) || !gVar.populate(a0Var, true)) {
                    return false;
                }
                int iA = gVar.f55960d;
                if ((gVar.f55957a & 1) == 1 && m0Var.limit() == 0) {
                    iA += a(0);
                    i10 = this.f55955d;
                } else {
                    i10 = 0;
                }
                if (!d0.skipFullyQuietly(a0Var, iA)) {
                    return false;
                }
                this.f55954c = i10;
            }
            int iA2 = a(this.f55954c);
            int i12 = this.f55954c + this.f55955d;
            if (iA2 > 0) {
                m0Var.ensureCapacity(m0Var.limit() + iA2);
                if (!d0.readFullyQuietly(a0Var, m0Var.getData(), m0Var.limit(), iA2)) {
                    return false;
                }
                m0Var.setLimit(m0Var.limit() + iA2);
                this.f55956e = gVar.f55962f[i12 + (-1)] != 255;
            }
            if (i12 == gVar.f55959c) {
                i12 = -1;
            }
            this.f55954c = i12;
        }
        return true;
    }

    public void reset() {
        this.f55952a.reset();
        this.f55953b.reset(0);
        this.f55954c = -1;
        this.f55956e = false;
    }

    public void trimPayload() {
        m0 m0Var = this.f55953b;
        if (m0Var.getData().length == 65025) {
            return;
        }
        m0Var.reset(Arrays.copyOf(m0Var.getData(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, m0Var.limit())), m0Var.limit());
    }
}
