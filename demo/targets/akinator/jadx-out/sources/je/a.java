package je;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ee.f0;
import ee.h0;
import ee.p;
import ee.q;
import ee.s;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements p {

    /* renamed from: b, reason: collision with root package name */
    public s f69507b;

    /* renamed from: c, reason: collision with root package name */
    public int f69508c;

    /* renamed from: d, reason: collision with root package name */
    public int f69509d;

    /* renamed from: e, reason: collision with root package name */
    public int f69510e;

    /* renamed from: g, reason: collision with root package name */
    public MotionPhotoMetadata f69512g;

    /* renamed from: h, reason: collision with root package name */
    public q f69513h;

    /* renamed from: i, reason: collision with root package name */
    public c f69514i;

    /* renamed from: j, reason: collision with root package name */
    public me.q f69515j;

    /* renamed from: a, reason: collision with root package name */
    public final v0 f69506a = new v0(6);

    /* renamed from: f, reason: collision with root package name */
    public long f69511f = -1;

    public final void a() {
        b(new Metadata.Entry[0]);
        ((s) com.google.android.exoplayer2.util.a.checkNotNull(this.f69507b)).endTracks();
        this.f69507b.seekMap(new h0(C.TIME_UNSET));
        this.f69508c = 6;
    }

    public final void b(Metadata.Entry... entryArr) {
        ((s) com.google.android.exoplayer2.util.a.checkNotNull(this.f69507b)).track(1024, 4).format(new y0().setContainerMimeType("image/jpeg").setMetadata(new Metadata(entryArr)).build());
    }

    public final int c(q qVar) throws IOException {
        v0 v0Var = this.f69506a;
        v0Var.reset(2);
        qVar.peekFully(v0Var.getData(), 0, 2);
        return v0Var.readUnsignedShort();
    }

    @Override // ee.p
    public void init(s sVar) {
        this.f69507b = sVar;
    }

    @Override // ee.p
    public int read(q qVar, f0 f0Var) throws IOException {
        String nullTerminatedString;
        b bVar;
        int i10 = this.f69508c;
        v0 v0Var = this.f69506a;
        if (i10 == 0) {
            v0Var.reset(2);
            qVar.readFully(v0Var.getData(), 0, 2);
            int unsignedShort = v0Var.readUnsignedShort();
            this.f69509d = unsignedShort;
            if (unsignedShort == 65498) {
                if (this.f69511f != -1) {
                    this.f69508c = 4;
                    return 0;
                }
                a();
                return 0;
            }
            if ((unsignedShort < 65488 || unsignedShort > 65497) && unsignedShort != 65281) {
                this.f69508c = 1;
            }
            return 0;
        }
        if (i10 == 1) {
            v0Var.reset(2);
            qVar.readFully(v0Var.getData(), 0, 2);
            this.f69510e = v0Var.readUnsignedShort() - 2;
            this.f69508c = 2;
            return 0;
        }
        if (i10 == 2) {
            if (this.f69509d == 65505) {
                v0 v0Var2 = new v0(this.f69510e);
                qVar.readFully(v0Var2.getData(), 0, this.f69510e);
                if (this.f69512g == null && "http://ns.adobe.com/xap/1.0/".equals(v0Var2.readNullTerminatedString()) && (nullTerminatedString = v0Var2.readNullTerminatedString()) != null) {
                    long length = qVar.getLength();
                    MotionPhotoMetadata motionPhotoMetadata = null;
                    if (length != -1 && (bVar = f.parse(nullTerminatedString)) != null) {
                        motionPhotoMetadata = bVar.getMotionPhotoMetadata(length);
                    }
                    this.f69512g = motionPhotoMetadata;
                    if (motionPhotoMetadata != null) {
                        this.f69511f = motionPhotoMetadata.f27785f;
                    }
                }
            } else {
                qVar.skipFully(this.f69510e);
            }
            this.f69508c = 0;
            return 0;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                if (i10 == 6) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            if (this.f69514i == null || qVar != this.f69513h) {
                this.f69513h = qVar;
                this.f69514i = new c(qVar, this.f69511f);
            }
            int i11 = ((me.q) com.google.android.exoplayer2.util.a.checkNotNull(this.f69515j)).read(this.f69514i, f0Var);
            if (i11 == 1) {
                f0Var.f54188a += this.f69511f;
            }
            return i11;
        }
        long position = qVar.getPosition();
        long j10 = this.f69511f;
        if (position != j10) {
            f0Var.f54188a = j10;
            return 1;
        }
        if (!qVar.peekFully(v0Var.getData(), 0, 1, true)) {
            a();
            return 0;
        }
        qVar.resetPeekPosition();
        if (this.f69515j == null) {
            this.f69515j = new me.q();
        }
        c cVar = new c(qVar, this.f69511f);
        this.f69514i = cVar;
        if (!this.f69515j.sniff(cVar)) {
            a();
            return 0;
        }
        this.f69515j.init(new e(this.f69511f, (s) com.google.android.exoplayer2.util.a.checkNotNull(this.f69507b)));
        b((Metadata.Entry) com.google.android.exoplayer2.util.a.checkNotNull(this.f69512g));
        this.f69508c = 5;
        return 0;
    }

    @Override // ee.p
    public void release() {
        me.q qVar = this.f69515j;
        if (qVar != null) {
            qVar.release();
        }
    }

    @Override // ee.p
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f69508c = 0;
            this.f69515j = null;
        } else if (this.f69508c == 5) {
            ((me.q) com.google.android.exoplayer2.util.a.checkNotNull(this.f69515j)).seek(j10, j11);
        }
    }

    @Override // ee.p
    public boolean sniff(q qVar) throws IOException {
        if (c(qVar) != 65496) {
            return false;
        }
        int iC = c(qVar);
        this.f69509d = iC;
        v0 v0Var = this.f69506a;
        if (iC == 65504) {
            v0Var.reset(2);
            qVar.peekFully(v0Var.getData(), 0, 2);
            qVar.advancePeekPosition(v0Var.readUnsignedShort() - 2);
            this.f69509d = c(qVar);
        }
        if (this.f69509d != 65505) {
            return false;
        }
        qVar.advancePeekPosition(2);
        v0Var.reset(6);
        qVar.peekFully(v0Var.getData(), 0, 6);
        return v0Var.readUnsignedInt() == 1165519206 && v0Var.readUnsignedShort() == 0;
    }
}
