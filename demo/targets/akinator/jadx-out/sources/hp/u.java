package hp;

import gn.x0;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.m0;
import java.io.EOFException;
import java.io.IOException;
import ko.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final e1 f59132a;

    /* renamed from: b, reason: collision with root package name */
    public final q f59133b;

    /* renamed from: h, reason: collision with root package name */
    public s f59139h;

    /* renamed from: i, reason: collision with root package name */
    public io.bidmachine.media3.common.b f59140i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f59141j;

    /* renamed from: c, reason: collision with root package name */
    public final b f59134c = new b();

    /* renamed from: e, reason: collision with root package name */
    public int f59136e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f59137f = 0;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f59138g = a1.f60681c;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f59135d = new m0();

    public u(e1 e1Var, q qVar) {
        this.f59132a = e1Var;
        this.f59133b = qVar;
    }

    public final void a(int i10) {
        int length = this.f59138g.length;
        int i11 = this.f59137f;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f59136e;
        int iMax = Math.max(i12 * 2, i10 + i12);
        byte[] bArr = this.f59138g;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f59136e, bArr2, 0, i12);
        this.f59136e = 0;
        this.f59137f = i12;
        this.f59138g = bArr2;
    }

    @Override // ko.e1
    public /* bridge */ /* synthetic */ void durationUs(long j10) {
        super.durationUs(j10);
    }

    @Override // ko.e1
    public void format(io.bidmachine.media3.common.b bVar) {
        io.bidmachine.media3.common.util.a.checkNotNull(bVar.f60665o);
        String str = bVar.f60665o;
        io.bidmachine.media3.common.util.a.checkArgument(x0.getTrackType(str) == 3);
        boolean zEquals = bVar.equals(this.f59140i);
        q qVar = this.f59133b;
        if (!zEquals) {
            this.f59140i = bVar;
            this.f59139h = qVar.supportsFormat(bVar) ? qVar.create(bVar) : null;
        }
        s sVar = this.f59139h;
        e1 e1Var = this.f59132a;
        if (sVar == null) {
            e1Var.format(bVar);
        } else {
            e1Var.format(bVar.buildUpon().setSampleMimeType("application/x-media3-cues").setCodecs(str).setSubsampleOffsetUs(Long.MAX_VALUE).setCueReplacementBehavior(qVar.getCueReplacementBehavior(bVar)).build());
        }
    }

    public void resetSubtitleParser() {
        s sVar = this.f59139h;
        if (sVar != null) {
            sVar.reset();
        }
    }

    @Override // ko.e1
    public /* bridge */ /* synthetic */ int sampleData(gn.o oVar, int i10, boolean z10) throws IOException {
        return super.sampleData(oVar, i10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // ko.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sampleMetadata(long r9, int r11, int r12, int r13, ko.d1 r14) {
        /*
            r8 = this;
            hp.s r0 = r8.f59139h
            if (r0 != 0) goto Lf
            ko.e1 r1 = r8.f59132a
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.sampleMetadata(r2, r4, r5, r6, r7)
            return
        Lf:
            r5 = r12
            r6 = r13
            r7 = r14
            r13 = r11
            r11 = r9
            r1 = 0
            if (r7 != 0) goto L19
            r9 = 1
            goto L1a
        L19:
            r9 = r1
        L1a:
            java.lang.String r10 = "DRM on subtitles is not supported"
            io.bidmachine.media3.common.util.a.checkArgument(r9, r10)
            int r9 = r8.f59137f
            int r9 = r9 - r6
            int r2 = r9 - r5
            hp.s r0 = r8.f59139h     // Catch: java.lang.RuntimeException -> L47
            byte[] r3 = r8.f59138g     // Catch: java.lang.RuntimeException -> L47
            hp.r r4 = hp.r.allCues()     // Catch: java.lang.RuntimeException -> L47
            ks.p r9 = new ks.p     // Catch: java.lang.RuntimeException -> L47
            r14 = 2
            r10 = r8
            r9.<init>(r10, r11, r13, r14)     // Catch: java.lang.RuntimeException -> L43
            r6 = r10
            r14 = r9
            r9 = r0
            r11 = r2
            r10 = r3
            r13 = r4
            r12 = r5
            r9.parse(r10, r11, r12, r13, r14)     // Catch: java.lang.RuntimeException -> L3f
            r5 = r12
            goto L55
        L3f:
            r0 = move-exception
            r5 = r12
        L41:
            r9 = r0
            goto L4a
        L43:
            r0 = move-exception
            r6 = r10
        L45:
            r11 = r2
            goto L41
        L47:
            r0 = move-exception
            r6 = r8
            goto L45
        L4a:
            boolean r10 = r6.f59141j
            if (r10 == 0) goto L62
            java.lang.String r10 = "SubtitleTranscodingTO"
            java.lang.String r12 = "Parsing subtitles failed, ignoring sample."
            io.bidmachine.media3.common.util.b0.w(r10, r12, r9)
        L55:
            int r2 = r11 + r5
            r6.f59136e = r2
            int r9 = r6.f59137f
            if (r2 != r9) goto L61
            r6.f59136e = r1
            r6.f59137f = r1
        L61:
            return
        L62:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.u.sampleMetadata(long, int, int, int, ko.d1):void");
    }

    public void shouldSuppressParsingErrors(boolean z10) {
        this.f59141j = z10;
    }

    @Override // ko.e1
    public /* bridge */ /* synthetic */ void sampleData(m0 m0Var, int i10) {
        super.sampleData(m0Var, i10);
    }

    @Override // ko.e1
    public int sampleData(gn.o oVar, int i10, boolean z10, int i11) throws IOException {
        if (this.f59139h == null) {
            return this.f59132a.sampleData(oVar, i10, z10, i11);
        }
        a(i10);
        int i12 = oVar.read(this.f59138g, this.f59137f, i10);
        if (i12 != -1) {
            this.f59137f += i12;
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // ko.e1
    public void sampleData(m0 m0Var, int i10, int i11) {
        if (this.f59139h == null) {
            this.f59132a.sampleData(m0Var, i10, i11);
            return;
        }
        a(i10);
        m0Var.readBytes(this.f59138g, this.f59137f, i10);
        this.f59137f += i10;
    }
}
