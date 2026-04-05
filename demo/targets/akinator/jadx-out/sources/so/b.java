package so;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import ep.w;
import gn.u0;
import hp.q;
import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import java.util.List;
import ko.a0;
import ko.c0;
import ko.v0;
import ko.x0;
import ko.z;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements z {

    /* renamed from: b, reason: collision with root package name */
    public c0 f86047b;

    /* renamed from: c, reason: collision with root package name */
    public int f86048c;

    /* renamed from: d, reason: collision with root package name */
    public int f86049d;

    /* renamed from: e, reason: collision with root package name */
    public int f86050e;

    /* renamed from: g, reason: collision with root package name */
    public zo.a f86052g;

    /* renamed from: h, reason: collision with root package name */
    public a0 f86053h;

    /* renamed from: i, reason: collision with root package name */
    public d f86054i;

    /* renamed from: j, reason: collision with root package name */
    public w f86055j;

    /* renamed from: a, reason: collision with root package name */
    public final m0 f86046a = new m0(6);

    /* renamed from: f, reason: collision with root package name */
    public long f86051f = -1;

    public final void a() {
        ((c0) io.bidmachine.media3.common.util.a.checkNotNull(this.f86047b)).endTracks();
        this.f86047b.seekMap(new x0(C.TIME_UNSET));
        this.f86048c = 6;
    }

    public final int b(a0 a0Var) throws IOException {
        m0 m0Var = this.f86046a;
        m0Var.reset(2);
        a0Var.peekFully(m0Var.getData(), 0, 2);
        return m0Var.readUnsignedShort();
    }

    @Override // ko.z
    public /* bridge */ /* synthetic */ List getSniffFailureDetails() {
        return super.getSniffFailureDetails();
    }

    @Override // ko.z
    @SideEffectFree
    public /* bridge */ /* synthetic */ z getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Override // ko.z
    public void init(c0 c0Var) {
        this.f86047b = c0Var;
    }

    @Override // ko.z
    public int read(a0 a0Var, v0 v0Var) throws IOException {
        String nullTerminatedString;
        c cVar;
        int i10 = this.f86048c;
        m0 m0Var = this.f86046a;
        if (i10 == 0) {
            m0Var.reset(2);
            a0Var.readFully(m0Var.getData(), 0, 2);
            int unsignedShort = m0Var.readUnsignedShort();
            this.f86049d = unsignedShort;
            if (unsignedShort == 65498) {
                if (this.f86051f != -1) {
                    this.f86048c = 4;
                    return 0;
                }
                a();
                return 0;
            }
            if ((unsignedShort < 65488 || unsignedShort > 65497) && unsignedShort != 65281) {
                this.f86048c = 1;
            }
            return 0;
        }
        if (i10 == 1) {
            m0Var.reset(2);
            a0Var.readFully(m0Var.getData(), 0, 2);
            this.f86050e = m0Var.readUnsignedShort() - 2;
            this.f86048c = 2;
            return 0;
        }
        if (i10 == 2) {
            if (this.f86049d == 65505) {
                m0 m0Var2 = new m0(this.f86050e);
                a0Var.readFully(m0Var2.getData(), 0, this.f86050e);
                if (this.f86052g == null && "http://ns.adobe.com/xap/1.0/".equals(m0Var2.readNullTerminatedString()) && (nullTerminatedString = m0Var2.readNullTerminatedString()) != null) {
                    long length = a0Var.getLength();
                    zo.a motionPhotoMetadata = null;
                    if (length != -1 && (cVar = g.parse(nullTerminatedString)) != null) {
                        motionPhotoMetadata = cVar.getMotionPhotoMetadata(length);
                    }
                    this.f86052g = motionPhotoMetadata;
                    if (motionPhotoMetadata != null) {
                        this.f86051f = motionPhotoMetadata.f98415d;
                    }
                }
            } else {
                a0Var.skipFully(this.f86050e);
            }
            this.f86048c = 0;
            return 0;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                if (i10 == 6) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            if (this.f86054i == null || a0Var != this.f86053h) {
                this.f86053h = a0Var;
                this.f86054i = new d(a0Var, this.f86051f);
            }
            int i11 = ((w) io.bidmachine.media3.common.util.a.checkNotNull(this.f86055j)).read(this.f86054i, v0Var);
            if (i11 == 1) {
                v0Var.f71790a += this.f86051f;
            }
            return i11;
        }
        long position = a0Var.getPosition();
        long j10 = this.f86051f;
        if (position != j10) {
            v0Var.f71790a = j10;
            return 1;
        }
        if (!a0Var.peekFully(m0Var.getData(), 0, 1, true)) {
            a();
            return 0;
        }
        a0Var.resetPeekPosition();
        if (this.f86055j == null) {
            this.f86055j = new w(q.f59124a, 8);
        }
        d dVar = new d(a0Var, this.f86051f);
        this.f86054i = dVar;
        if (!this.f86055j.sniff(dVar)) {
            a();
            return 0;
        }
        this.f86055j.init(new f(this.f86051f, (c0) io.bidmachine.media3.common.util.a.checkNotNull(this.f86047b)));
        ((c0) io.bidmachine.media3.common.util.a.checkNotNull(this.f86047b)).track(1024, 4).format(new gn.w().setContainerMimeType("image/jpeg").setMetadata(new u0((zo.a) io.bidmachine.media3.common.util.a.checkNotNull(this.f86052g))).build());
        this.f86048c = 5;
        return 0;
    }

    @Override // ko.z
    public void release() {
        w wVar = this.f86055j;
        if (wVar != null) {
            wVar.release();
        }
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f86048c = 0;
            this.f86055j = null;
        } else if (this.f86048c == 5) {
            ((w) io.bidmachine.media3.common.util.a.checkNotNull(this.f86055j)).seek(j10, j11);
        }
    }

    @Override // ko.z
    public boolean sniff(a0 a0Var) throws IOException {
        if (b(a0Var) != 65496) {
            return false;
        }
        int iB = b(a0Var);
        this.f86049d = iB;
        m0 m0Var = this.f86046a;
        if (iB == 65504) {
            m0Var.reset(2);
            a0Var.peekFully(m0Var.getData(), 0, 2);
            a0Var.advancePeekPosition(m0Var.readUnsignedShort() - 2);
            this.f86049d = b(a0Var);
        }
        if (this.f86049d != 65505) {
            return false;
        }
        a0Var.advancePeekPosition(2);
        m0Var.reset(6);
        a0Var.peekFully(m0Var.getData(), 0, 6);
        return m0Var.readUnsignedInt() == 1165519206 && m0Var.readUnsignedShort() == 0;
    }
}
