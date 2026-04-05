package ie;

import com.google.android.exoplayer2.util.v0;
import ee.p;
import ee.q;
import ee.s;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements p {

    /* renamed from: f, reason: collision with root package name */
    public s f59552f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f59554h;

    /* renamed from: i, reason: collision with root package name */
    public long f59555i;

    /* renamed from: j, reason: collision with root package name */
    public int f59556j;

    /* renamed from: k, reason: collision with root package name */
    public int f59557k;

    /* renamed from: l, reason: collision with root package name */
    public int f59558l;

    /* renamed from: m, reason: collision with root package name */
    public long f59559m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f59560n;

    /* renamed from: o, reason: collision with root package name */
    public a f59561o;

    /* renamed from: p, reason: collision with root package name */
    public f f59562p;

    /* renamed from: a, reason: collision with root package name */
    public final v0 f59547a = new v0(4);

    /* renamed from: b, reason: collision with root package name */
    public final v0 f59548b = new v0(9);

    /* renamed from: c, reason: collision with root package name */
    public final v0 f59549c = new v0(11);

    /* renamed from: d, reason: collision with root package name */
    public final v0 f59550d = new v0();

    /* renamed from: e, reason: collision with root package name */
    public final c f59551e = new c();

    /* renamed from: g, reason: collision with root package name */
    public int f59553g = 1;

    public final v0 a(q qVar) throws IOException {
        int i10 = this.f59558l;
        v0 v0Var = this.f59550d;
        if (i10 > v0Var.capacity()) {
            v0Var.reset(new byte[Math.max(v0Var.capacity() * 2, this.f59558l)], 0);
        } else {
            v0Var.setPosition(0);
        }
        v0Var.setLimit(this.f59558l);
        qVar.readFully(v0Var.getData(), 0, this.f59558l);
        return v0Var;
    }

    @Override // ee.p
    public void init(s sVar) {
        this.f59552f = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0009 A[SYNTHETIC] */
    @Override // ee.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(ee.q r17, ee.f0 r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.b.read(ee.q, ee.f0):int");
    }

    @Override // ee.p
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f59553g = 1;
            this.f59554h = false;
        } else {
            this.f59553g = 3;
        }
        this.f59556j = 0;
    }

    @Override // ee.p
    public boolean sniff(q qVar) throws IOException {
        v0 v0Var = this.f59547a;
        qVar.peekFully(v0Var.getData(), 0, 3);
        v0Var.setPosition(0);
        if (v0Var.readUnsignedInt24() != 4607062) {
            return false;
        }
        qVar.peekFully(v0Var.getData(), 0, 2);
        v0Var.setPosition(0);
        if ((v0Var.readUnsignedShort() & 250) != 0) {
            return false;
        }
        qVar.peekFully(v0Var.getData(), 0, 4);
        v0Var.setPosition(0);
        int i10 = v0Var.readInt();
        qVar.resetPeekPosition();
        qVar.advancePeekPosition(i10);
        qVar.peekFully(v0Var.getData(), 0, 4);
        v0Var.setPosition(0);
        return v0Var.readInt() == 0;
    }

    @Override // ee.p
    public void release() {
    }
}
