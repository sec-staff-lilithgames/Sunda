package io.odeeo.internal.o;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import io.odeeo.internal.g.k;
import io.odeeo.internal.q0.x;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f65127a = new e();

    /* renamed from: b, reason: collision with root package name */
    public final x f65128b = new x(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f65129c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f65130d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f65131e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.f65130d = 0;
        do {
            int i13 = this.f65130d;
            int i14 = i10 + i13;
            e eVar = this.f65127a;
            if (i14 >= eVar.f65138g) {
                break;
            }
            int[] iArr = eVar.f65141j;
            this.f65130d = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public e getPageHeader() {
        return this.f65127a;
    }

    public x getPayload() {
        return this.f65128b;
    }

    public boolean populate(io.odeeo.internal.g.i iVar) throws IOException {
        int i10;
        io.odeeo.internal.q0.a.checkState(iVar != null);
        if (this.f65131e) {
            this.f65131e = false;
            this.f65128b.reset(0);
        }
        while (!this.f65131e) {
            if (this.f65129c < 0) {
                if (!this.f65127a.skipToNextPage(iVar) || !this.f65127a.populate(iVar, true)) {
                    return false;
                }
                e eVar = this.f65127a;
                int iA = eVar.f65139h;
                if ((eVar.f65133b & 1) == 1 && this.f65128b.limit() == 0) {
                    iA += a(0);
                    i10 = this.f65130d;
                } else {
                    i10 = 0;
                }
                if (!k.skipFullyQuietly(iVar, iA)) {
                    return false;
                }
                this.f65129c = i10;
            }
            int iA2 = a(this.f65129c);
            int i11 = this.f65129c + this.f65130d;
            if (iA2 > 0) {
                x xVar = this.f65128b;
                xVar.ensureCapacity(xVar.limit() + iA2);
                if (!k.readFullyQuietly(iVar, this.f65128b.getData(), this.f65128b.limit(), iA2)) {
                    return false;
                }
                x xVar2 = this.f65128b;
                xVar2.setLimit(xVar2.limit() + iA2);
                this.f65131e = this.f65127a.f65141j[i11 + (-1)] != 255;
            }
            if (i11 == this.f65127a.f65138g) {
                i11 = -1;
            }
            this.f65129c = i11;
        }
        return true;
    }

    public void reset() {
        this.f65127a.reset();
        this.f65128b.reset(0);
        this.f65129c = -1;
        this.f65131e = false;
    }

    public void trimPayload() {
        if (this.f65128b.getData().length == 65025) {
            return;
        }
        x xVar = this.f65128b;
        xVar.reset(Arrays.copyOf(xVar.getData(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, this.f65128b.limit())), this.f65128b.limit());
    }
}
