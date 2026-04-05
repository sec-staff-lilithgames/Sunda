package cp;

import gn.z0;
import io.bidmachine.media3.common.DrmInitData;
import ko.d1;
import ko.e1;
import ko.f1;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public byte[] P;
    public int Q;
    public int R;
    public int S;
    public long T;
    public long U;
    public f1 V;
    public boolean W;
    public boolean X;
    public String Y;
    public e1 Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f50800a;

    /* renamed from: a0, reason: collision with root package name */
    public int f50801a0;

    /* renamed from: b, reason: collision with root package name */
    public String f50802b;

    /* renamed from: c, reason: collision with root package name */
    public String f50803c;

    /* renamed from: d, reason: collision with root package name */
    public int f50804d;

    /* renamed from: e, reason: collision with root package name */
    public int f50805e;

    /* renamed from: f, reason: collision with root package name */
    public int f50806f;

    /* renamed from: g, reason: collision with root package name */
    public int f50807g;

    /* renamed from: h, reason: collision with root package name */
    public int f50808h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f50809i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f50810j;

    /* renamed from: k, reason: collision with root package name */
    public d1 f50811k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f50812l;

    /* renamed from: m, reason: collision with root package name */
    public DrmInitData f50813m;

    /* renamed from: n, reason: collision with root package name */
    public int f50814n;

    /* renamed from: o, reason: collision with root package name */
    public int f50815o;

    /* renamed from: p, reason: collision with root package name */
    public int f50816p;

    /* renamed from: q, reason: collision with root package name */
    public int f50817q;

    /* renamed from: r, reason: collision with root package name */
    public int f50818r;

    /* renamed from: s, reason: collision with root package name */
    public int f50819s;

    /* renamed from: t, reason: collision with root package name */
    public int f50820t;

    /* renamed from: u, reason: collision with root package name */
    public float f50821u;

    /* renamed from: v, reason: collision with root package name */
    public float f50822v;

    /* renamed from: w, reason: collision with root package name */
    public float f50823w;

    /* renamed from: x, reason: collision with root package name */
    public byte[] f50824x;

    /* renamed from: y, reason: collision with root package name */
    public int f50825y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f50826z;

    public final byte[] a(String str) throws z0 {
        byte[] bArr = this.f50812l;
        if (bArr != null) {
            return bArr;
        }
        throw z0.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0017  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initializeOutput(ko.c0 r24, int r25) throws gn.z0 {
        /*
            Method dump skipped, instructions count: 2182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cp.g.initializeOutput(ko.c0, int):void");
    }

    @RequiresNonNull({"output"})
    public void outputPendingSampleMetadata() {
        f1 f1Var = this.V;
        if (f1Var != null) {
            f1Var.outputPendingSampleMetadata(this.Z, this.f50811k);
        }
    }

    public void reset() {
        f1 f1Var = this.V;
        if (f1Var != null) {
            f1Var.reset();
        }
    }
}
