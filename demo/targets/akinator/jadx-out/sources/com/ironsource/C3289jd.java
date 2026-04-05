package com.ironsource;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.jd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3289jd {

    /* renamed from: a, reason: collision with root package name */
    private boolean f37032a;

    /* renamed from: b, reason: collision with root package name */
    private String f37033b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37034c;

    /* renamed from: d, reason: collision with root package name */
    private int f37035d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f37036e;

    /* renamed from: f, reason: collision with root package name */
    private int[] f37037f;

    public C3289jd() {
        this(false, null, false, 0, null, null, 63, null);
    }

    public final boolean a() {
        return this.f37032a;
    }

    public final String b() {
        return this.f37033b;
    }

    public final boolean c() {
        return this.f37034c;
    }

    public final int d() {
        return this.f37035d;
    }

    public final int[] e() {
        return this.f37036e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3289jd)) {
            return false;
        }
        C3289jd c3289jd = (C3289jd) obj;
        return this.f37032a == c3289jd.f37032a && kotlin.jvm.internal.e0.areEqual(this.f37033b, c3289jd.f37033b) && this.f37034c == c3289jd.f37034c && this.f37035d == c3289jd.f37035d && kotlin.jvm.internal.e0.areEqual(this.f37036e, c3289jd.f37036e) && kotlin.jvm.internal.e0.areEqual(this.f37037f, c3289jd.f37037f);
    }

    public final int[] f() {
        return this.f37037f;
    }

    public final boolean g() {
        return this.f37034c;
    }

    public final int h() {
        return this.f37035d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z10 = this.f37032a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int iE = p0.o2.e(r02 * 31, 31, this.f37033b);
        boolean z11 = this.f37034c;
        int iD = e3.g.d(this.f37035d, (iE + (z11 ? 1 : z11 ? 1 : 0)) * 31, 31);
        int[] iArr = this.f37036e;
        int iHashCode = (iD + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.f37037f;
        return iHashCode + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    public final boolean i() {
        return this.f37032a;
    }

    public final String j() {
        return this.f37033b;
    }

    public final int[] k() {
        return this.f37037f;
    }

    public final int[] l() {
        return this.f37036e;
    }

    public String toString() {
        boolean z10 = this.f37032a;
        String str = this.f37033b;
        boolean z11 = this.f37034c;
        int i10 = this.f37035d;
        String string = Arrays.toString(this.f37036e);
        String string2 = Arrays.toString(this.f37037f);
        StringBuilder sb2 = new StringBuilder("PixelSettings(pixelEventsEnabled=");
        sb2.append(z10);
        sb2.append(", pixelEventsUrl=");
        sb2.append(str);
        sb2.append(", pixelEventsCompression=");
        sb2.append(z11);
        sb2.append(", pixelEventsCompressionLevel=");
        sb2.append(i10);
        sb2.append(", pixelOptOut=");
        return p0.o2.r(sb2, string, ", pixelOptIn=", string2, ")");
    }

    public C3289jd(boolean z10, String pixelEventsUrl, boolean z11, int i10, int[] iArr, int[] iArr2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        this.f37032a = z10;
        this.f37033b = pixelEventsUrl;
        this.f37034c = z11;
        this.f37035d = i10;
        this.f37036e = iArr;
        this.f37037f = iArr2;
    }

    public final C3289jd a(boolean z10, String pixelEventsUrl, boolean z11, int i10, int[] iArr, int[] iArr2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        return new C3289jd(z10, pixelEventsUrl, z11, i10, iArr, iArr2);
    }

    public final void b(boolean z10) {
        this.f37032a = z10;
    }

    public static /* synthetic */ C3289jd a(C3289jd c3289jd, boolean z10, String str, boolean z11, int i10, int[] iArr, int[] iArr2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = c3289jd.f37032a;
        }
        if ((i11 & 2) != 0) {
            str = c3289jd.f37033b;
        }
        if ((i11 & 4) != 0) {
            z11 = c3289jd.f37034c;
        }
        if ((i11 & 8) != 0) {
            i10 = c3289jd.f37035d;
        }
        if ((i11 & 16) != 0) {
            iArr = c3289jd.f37036e;
        }
        if ((i11 & 32) != 0) {
            iArr2 = c3289jd.f37037f;
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        return c3289jd.a(z10, str, z11, i10, iArr3, iArr4);
    }

    public final void b(int[] iArr) {
        this.f37036e = iArr;
    }

    public final void a(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
        this.f37033b = str;
    }

    public final void a(boolean z10) {
        this.f37034c = z10;
    }

    public final void a(int i10) {
        this.f37035d = i10;
    }

    public final void a(int[] iArr) {
        this.f37037f = iArr;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ C3289jd(boolean r2, java.lang.String r3, boolean r4, int r5, int[] r6, int[] r7, int r8, kotlin.jvm.internal.u r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 1
        L5:
            r9 = r8 & 2
            if (r9 == 0) goto Lb
            java.lang.String r3 = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=3"
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = 0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L15
            r5 = -1
        L15:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3289jd.<init>(boolean, java.lang.String, boolean, int, int[], int[], int, kotlin.jvm.internal.u):void");
    }
}
