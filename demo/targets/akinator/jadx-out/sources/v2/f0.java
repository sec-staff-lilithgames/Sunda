package v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f88897a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f88898b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f88899c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f88900d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f88901e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f88902f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f88903g;

    public f0() {
        this(false, false, false, null, false, false, false, 127, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f88897a == f0Var.f88897a && this.f88898b == f0Var.f88898b && this.f88899c == f0Var.f88899c && this.f88900d == f0Var.f88900d && this.f88901e == f0Var.f88901e && this.f88902f == f0Var.f88902f && this.f88903g == f0Var.f88903g;
    }

    public final boolean getClippingEnabled() {
        return this.f88902f;
    }

    public final boolean getDismissOnBackPress() {
        return this.f88898b;
    }

    public final boolean getDismissOnClickOutside() {
        return this.f88899c;
    }

    public final boolean getExcludeFromSystemGesture() {
        return this.f88901e;
    }

    public final boolean getFocusable() {
        return this.f88897a;
    }

    public final g0 getSecurePolicy() {
        return this.f88900d;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.f88903g;
    }

    public int hashCode() {
        boolean z10 = this.f88898b;
        return Boolean.hashCode(this.f88903g) + com.google.android.gms.internal.play_billing.a.c(com.google.android.gms.internal.play_billing.a.c((this.f88900d.hashCode() + com.google.android.gms.internal.play_billing.a.c(com.google.android.gms.internal.play_billing.a.c(com.google.android.gms.internal.play_billing.a.c(Boolean.hashCode(z10) * 31, 31, this.f88897a), 31, z10), 31, this.f88899c)) * 31, 31, this.f88901e), 31, this.f88902f);
    }

    public f0(boolean z10, boolean z11, boolean z12, g0 securePolicy, boolean z13, boolean z14, boolean z15) {
        kotlin.jvm.internal.e0.checkNotNullParameter(securePolicy, "securePolicy");
        this.f88897a = z10;
        this.f88898b = z11;
        this.f88899c = z12;
        this.f88900d = securePolicy;
        this.f88901e = z13;
        this.f88902f = z14;
        this.f88903g = z15;
    }

    public /* synthetic */ f0(boolean z10, boolean z11, boolean z12, g0 g0Var, boolean z13, boolean z14, boolean z15, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? g0.f88905b : g0Var, (i10 & 16) != 0 ? true : z13, (i10 & 32) != 0 ? true : z14, (i10 & 64) != 0 ? false : z15);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ f0(boolean r2, boolean r3, boolean r4, v2.g0 r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.u r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 2
            r0 = 1
            if (r9 == 0) goto Lb
            r3 = r0
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = r0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            v2.g0 r5 = v2.g0.f88905b
        L16:
            r9 = r8 & 16
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
        throw new UnsupportedOperationException("Method not decompiled: v2.f0.<init>(boolean, boolean, boolean, v2.g0, boolean, boolean, int, kotlin.jvm.internal.u):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(boolean z10, boolean z11, boolean z12, g0 securePolicy, boolean z13, boolean z14) {
        this(z10, z11, z12, securePolicy, z13, z14, false);
        kotlin.jvm.internal.e0.checkNotNullParameter(securePolicy, "securePolicy");
    }
}
