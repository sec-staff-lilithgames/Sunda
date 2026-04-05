package ke;

import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.h2;
import ee.k0;
import ee.l0;
import ee.m0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f {
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public byte[] N;
    public int O;
    public int P;
    public int Q;
    public long R;
    public long S;
    public m0 T;
    public boolean U;
    public boolean V;
    public String W;
    public l0 X;
    public int Y;

    /* renamed from: a, reason: collision with root package name */
    public String f70832a;

    /* renamed from: b, reason: collision with root package name */
    public String f70833b;

    /* renamed from: c, reason: collision with root package name */
    public int f70834c;

    /* renamed from: d, reason: collision with root package name */
    public int f70835d;

    /* renamed from: e, reason: collision with root package name */
    public int f70836e;

    /* renamed from: f, reason: collision with root package name */
    public int f70837f;

    /* renamed from: g, reason: collision with root package name */
    public int f70838g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f70839h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f70840i;

    /* renamed from: j, reason: collision with root package name */
    public k0 f70841j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f70842k;

    /* renamed from: l, reason: collision with root package name */
    public DrmInitData f70843l;

    /* renamed from: m, reason: collision with root package name */
    public int f70844m;

    /* renamed from: n, reason: collision with root package name */
    public int f70845n;

    /* renamed from: o, reason: collision with root package name */
    public int f70846o;

    /* renamed from: p, reason: collision with root package name */
    public int f70847p;

    /* renamed from: q, reason: collision with root package name */
    public int f70848q;

    /* renamed from: r, reason: collision with root package name */
    public int f70849r;

    /* renamed from: s, reason: collision with root package name */
    public float f70850s;

    /* renamed from: t, reason: collision with root package name */
    public float f70851t;

    /* renamed from: u, reason: collision with root package name */
    public float f70852u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f70853v;

    /* renamed from: w, reason: collision with root package name */
    public int f70854w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f70855x;

    /* renamed from: y, reason: collision with root package name */
    public int f70856y;

    /* renamed from: z, reason: collision with root package name */
    public int f70857z;

    public final byte[] a(String str) throws h2 {
        byte[] bArr = this.f70842k;
        if (bArr != null) {
            return bArr;
        }
        throw h2.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
    }

    @RequiresNonNull({"output"})
    public void outputPendingSampleMetadata() {
        m0 m0Var = this.T;
        if (m0Var != null) {
            m0Var.outputPendingSampleMetadata(this.X, this.f70841j);
        }
    }

    public void reset() {
        m0 m0Var = this.T;
        if (m0Var != null) {
            m0Var.reset();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:276:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0017  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initializeOutput(ee.s r26, int r27) throws com.google.android.exoplayer2.h2 {
        /*
            Method dump skipped, instructions count: 2120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.f.initializeOutput(ee.s, int):void");
    }
}
