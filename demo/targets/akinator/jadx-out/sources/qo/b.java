package qo;

import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import java.util.List;
import ko.a0;
import ko.c0;
import ko.z;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements z {

    /* renamed from: f, reason: collision with root package name */
    public c0 f83401f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f83403h;

    /* renamed from: i, reason: collision with root package name */
    public long f83404i;

    /* renamed from: j, reason: collision with root package name */
    public int f83405j;

    /* renamed from: k, reason: collision with root package name */
    public int f83406k;

    /* renamed from: l, reason: collision with root package name */
    public int f83407l;

    /* renamed from: m, reason: collision with root package name */
    public long f83408m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f83409n;

    /* renamed from: o, reason: collision with root package name */
    public a f83410o;

    /* renamed from: p, reason: collision with root package name */
    public f f83411p;

    /* renamed from: a, reason: collision with root package name */
    public final m0 f83396a = new m0(4);

    /* renamed from: b, reason: collision with root package name */
    public final m0 f83397b = new m0(9);

    /* renamed from: c, reason: collision with root package name */
    public final m0 f83398c = new m0(11);

    /* renamed from: d, reason: collision with root package name */
    public final m0 f83399d = new m0();

    /* renamed from: e, reason: collision with root package name */
    public final c f83400e = new c();

    /* renamed from: g, reason: collision with root package name */
    public int f83402g = 1;

    public final m0 a(a0 a0Var) throws IOException {
        int i10 = this.f83407l;
        m0 m0Var = this.f83399d;
        if (i10 > m0Var.capacity()) {
            m0Var.reset(new byte[Math.max(m0Var.capacity() * 2, this.f83407l)], 0);
        } else {
            m0Var.setPosition(0);
        }
        m0Var.setLimit(this.f83407l);
        a0Var.readFully(m0Var.getData(), 0, this.f83407l);
        return m0Var;
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
        this.f83401f = c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0009 A[SYNTHETIC] */
    @Override // ko.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(ko.a0 r17, ko.v0 r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qo.b.read(ko.a0, ko.v0):int");
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f83402g = 1;
            this.f83403h = false;
        } else {
            this.f83402g = 3;
        }
        this.f83405j = 0;
    }

    @Override // ko.z
    public boolean sniff(a0 a0Var) throws IOException {
        m0 m0Var = this.f83396a;
        a0Var.peekFully(m0Var.getData(), 0, 3);
        m0Var.setPosition(0);
        if (m0Var.readUnsignedInt24() != 4607062) {
            return false;
        }
        a0Var.peekFully(m0Var.getData(), 0, 2);
        m0Var.setPosition(0);
        if ((m0Var.readUnsignedShort() & 250) != 0) {
            return false;
        }
        a0Var.peekFully(m0Var.getData(), 0, 4);
        m0Var.setPosition(0);
        int i10 = m0Var.readInt();
        a0Var.resetPeekPosition();
        a0Var.advancePeekPosition(i10);
        a0Var.peekFully(m0Var.getData(), 0, 4);
        m0Var.setPosition(0);
        return m0Var.readInt() == 0;
    }

    @Override // ko.z
    public void release() {
    }
}
