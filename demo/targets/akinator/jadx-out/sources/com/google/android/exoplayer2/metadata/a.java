package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import re.b;
import re.c;
import re.d;
import re.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends f implements Handler.Callback {
    public long A;

    /* renamed from: q, reason: collision with root package name */
    public final d f27701q;

    /* renamed from: r, reason: collision with root package name */
    public final re.f f27702r;

    /* renamed from: s, reason: collision with root package name */
    public final Handler f27703s;

    /* renamed from: t, reason: collision with root package name */
    public final e f27704t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f27705u;

    /* renamed from: v, reason: collision with root package name */
    public b f27706v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f27707w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f27708x;

    /* renamed from: y, reason: collision with root package name */
    public long f27709y;

    /* renamed from: z, reason: collision with root package name */
    public Metadata f27710z;

    public a(re.f fVar, Looper looper) {
        this(fVar, looper, d.f84298a);
    }

    @Override // com.google.android.exoplayer2.f
    public final void b() {
        this.f27710z = null;
        this.f27706v = null;
        this.A = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.f
    public final void d(long j10, boolean z10) {
        this.f27710z = null;
        this.f27707w = false;
        this.f27708x = false;
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2, com.google.android.exoplayer2.b3
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        ((p0) this.f27702r).onMetadata((Metadata) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.f
    public final void i(z0[] z0VarArr, long j10, long j11) {
        this.f27706v = ((c) this.f27701q).createDecoder(z0VarArr[0]);
        Metadata metadata = this.f27710z;
        if (metadata != null) {
            this.f27710z = metadata.copyWithPresentationTimeUs((metadata.f27700c + this.A) - j11);
        }
        this.A = j11;
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public boolean isEnded() {
        return this.f27708x;
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public boolean isReady() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.google.android.exoplayer2.metadata.Metadata r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            int r1 = r6.length()
            if (r0 >= r1) goto L58
            com.google.android.exoplayer2.metadata.Metadata$Entry r1 = r6.get(r0)
            com.google.android.exoplayer2.z0 r1 = r1.getWrappedMetadataFormat()
            if (r1 == 0) goto L4e
            re.d r2 = r5.f27701q
            re.c r2 = (re.c) r2
            boolean r3 = r2.supportsFormat(r1)
            if (r3 == 0) goto L4e
            re.b r1 = r2.createDecoder(r1)
            com.google.android.exoplayer2.metadata.Metadata$Entry r2 = r6.get(r0)
            byte[] r2 = r2.getWrappedMetadataBytes()
            java.lang.Object r2 = com.google.android.exoplayer2.util.a.checkNotNull(r2)
            byte[] r2 = (byte[]) r2
            re.e r3 = r5.f27704t
            r3.clear()
            int r4 = r2.length
            r3.ensureSpaceForWrite(r4)
            java.nio.ByteBuffer r4 = r3.f12237e
            java.lang.Object r4 = com.google.android.exoplayer2.util.n1.castNonNull(r4)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            r4.put(r2)
            r3.flip()
            com.google.android.exoplayer2.metadata.Metadata r1 = r1.decode(r3)
            if (r1 == 0) goto L55
            r5.k(r1, r7)
            goto L55
        L4e:
            com.google.android.exoplayer2.metadata.Metadata$Entry r1 = r6.get(r0)
            r7.add(r1)
        L55:
            int r0 = r0 + 1
            goto L1
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.a.k(com.google.android.exoplayer2.metadata.Metadata, java.util.ArrayList):void");
    }

    public final long l(long j10) {
        com.google.android.exoplayer2.util.a.checkState(j10 != C.TIME_UNSET);
        com.google.android.exoplayer2.util.a.checkState(this.A != C.TIME_UNSET);
        return j10 - this.A;
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public void render(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            if (!this.f27707w && this.f27710z == null) {
                e eVar = this.f27704t;
                eVar.clear();
                a1 a1Var = this.f27449e;
                a1Var.clear();
                int iJ = j(a1Var, eVar, 0);
                if (iJ == -4) {
                    if (eVar.isEndOfStream()) {
                        this.f27707w = true;
                    } else {
                        eVar.f84299k = this.f27709y;
                        eVar.flip();
                        Metadata metadataDecode = ((b) n1.castNonNull(this.f27706v)).decode(eVar);
                        if (metadataDecode != null) {
                            ArrayList arrayList = new ArrayList(metadataDecode.length());
                            k(metadataDecode, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f27710z = new Metadata(l(eVar.f12239g), arrayList);
                            }
                        }
                    }
                } else if (iJ == -5) {
                    this.f27709y = ((z0) com.google.android.exoplayer2.util.a.checkNotNull(a1Var.f27030b)).f28806r;
                }
            }
            Metadata metadata = this.f27710z;
            if (metadata == null || (!this.f27705u && metadata.f27700c > l(j10))) {
                z10 = false;
            } else {
                Metadata metadata2 = this.f27710z;
                Handler handler = this.f27703s;
                if (handler != null) {
                    handler.obtainMessage(0, metadata2).sendToTarget();
                } else {
                    ((p0) this.f27702r).onMetadata(metadata2);
                }
                this.f27710z = null;
                z10 = true;
            }
            if (this.f27707w && this.f27710z == null) {
                this.f27708x = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f10, float f11) throws r {
        super.setPlaybackSpeed(f10, f11);
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.b3
    public int supportsFormat(z0 z0Var) {
        if (((c) this.f27701q).supportsFormat(z0Var)) {
            return b3.create(z0Var.I == 0 ? 4 : 2);
        }
        return b3.create(0);
    }

    public a(re.f fVar, Looper looper, d dVar) {
        this(fVar, looper, dVar, false);
    }

    public a(re.f fVar, Looper looper, d dVar, boolean z10) {
        super(5);
        this.f27702r = (re.f) com.google.android.exoplayer2.util.a.checkNotNull(fVar);
        this.f27703s = looper == null ? null : n1.createHandler(looper, this);
        this.f27701q = (d) com.google.android.exoplayer2.util.a.checkNotNull(dVar);
        this.f27705u = z10;
        this.f27704t = new e();
        this.A = C.TIME_UNSET;
    }
}
