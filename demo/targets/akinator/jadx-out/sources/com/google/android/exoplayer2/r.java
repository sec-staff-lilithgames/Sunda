package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r extends j2 {

    /* renamed from: q, reason: collision with root package name */
    public static final String f27948q = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1001);

    /* renamed from: r, reason: collision with root package name */
    public static final String f27949r = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1002);

    /* renamed from: s, reason: collision with root package name */
    public static final String f27950s = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(IronSourceError.AUCTION_ERROR_DECRYPTION);

    /* renamed from: t, reason: collision with root package name */
    public static final String f27951t = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1004);

    /* renamed from: u, reason: collision with root package name */
    public static final String f27952u = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1005);

    /* renamed from: v, reason: collision with root package name */
    public static final String f27953v = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1006);

    /* renamed from: j, reason: collision with root package name */
    public final int f27954j;

    /* renamed from: k, reason: collision with root package name */
    public final String f27955k;

    /* renamed from: l, reason: collision with root package name */
    public final int f27956l;

    /* renamed from: m, reason: collision with root package name */
    public final z0 f27957m;

    /* renamed from: n, reason: collision with root package name */
    public final int f27958n;

    /* renamed from: o, reason: collision with root package name */
    public final bf.b0 f27959o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f27960p;

    public r(int i10, int i11, Exception exc) {
        this(i10, exc, null, i11, null, -1, null, 4, false);
    }

    public static r createForRemote(String str) {
        return new r(3, null, str, 1001, null, -1, null, 4, false);
    }

    public static r createForRenderer(Throwable th2, String str, int i10, z0 z0Var, int i11, boolean z10, int i12) {
        if (z0Var == null) {
            i11 = 4;
        }
        return new r(1, th2, null, i12, str, i10, z0Var, i11, z10);
    }

    public static r createForSource(IOException iOException, int i10) {
        return new r(0, i10, iOException);
    }

    @Deprecated
    public static r createForUnexpected(RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    public final r a(bf.b0 b0Var) {
        return new r((String) com.google.android.exoplayer2.util.n1.castNonNull(getMessage()), getCause(), this.f27558b, this.f27954j, this.f27955k, this.f27956l, this.f27957m, this.f27958n, b0Var, this.f27559c, this.f27960p);
    }

    @Override // com.google.android.exoplayer2.j2
    public boolean errorInfoEquals(j2 j2Var) {
        if (!super.errorInfoEquals(j2Var)) {
            return false;
        }
        r rVar = (r) com.google.android.exoplayer2.util.n1.castNonNull(j2Var);
        return this.f27954j == rVar.f27954j && com.google.android.exoplayer2.util.n1.areEqual(this.f27955k, rVar.f27955k) && this.f27956l == rVar.f27956l && com.google.android.exoplayer2.util.n1.areEqual(this.f27957m, rVar.f27957m) && this.f27958n == rVar.f27958n && com.google.android.exoplayer2.util.n1.areEqual(this.f27959o, rVar.f27959o) && this.f27960p == rVar.f27960p;
    }

    public Exception getRendererException() {
        com.google.android.exoplayer2.util.a.checkState(this.f27954j == 1);
        return (Exception) com.google.android.exoplayer2.util.a.checkNotNull(getCause());
    }

    public IOException getSourceException() {
        com.google.android.exoplayer2.util.a.checkState(this.f27954j == 0);
        return (IOException) com.google.android.exoplayer2.util.a.checkNotNull(getCause());
    }

    public RuntimeException getUnexpectedException() {
        com.google.android.exoplayer2.util.a.checkState(this.f27954j == 2);
        return (RuntimeException) com.google.android.exoplayer2.util.a.checkNotNull(getCause());
    }

    @Override // com.google.android.exoplayer2.j2, com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(f27948q, this.f27954j);
        bundle.putString(f27949r, this.f27955k);
        bundle.putInt(f27950s, this.f27956l);
        z0 z0Var = this.f27957m;
        if (z0Var != null) {
            bundle.putBundle(f27951t, z0Var.toBundle());
        }
        bundle.putInt(f27952u, this.f27958n);
        bundle.putBoolean(f27953v, this.f27960p);
        return bundle;
    }

    public r(String str, Throwable th2, int i10, int i11, String str2, int i12, z0 z0Var, int i13, bf.b0 b0Var, long j10, boolean z10) {
        super(str, th2, i10, j10);
        com.google.android.exoplayer2.util.a.checkArgument(!z10 || i11 == 1);
        com.google.android.exoplayer2.util.a.checkArgument(th2 != null || i11 == 3);
        this.f27954j = i11;
        this.f27955k = str2;
        this.f27956l = i12;
        this.f27957m = z0Var;
        this.f27958n = i13;
        this.f27959o = b0Var;
        this.f27960p = z10;
    }

    public static r createForUnexpected(RuntimeException runtimeException, int i10) {
        return new r(2, i10, runtimeException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(int i10, Throwable th2, String str, int i11, String str2, int i12, z0 z0Var, int i13, boolean z10) {
        String str3;
        int i14;
        z0 z0Var2;
        String string;
        if (i10 == 0) {
            str3 = str2;
            i14 = i12;
            z0Var2 = z0Var;
            string = "Source error";
        } else if (i10 != 1) {
            if (i10 != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str3 = str2;
            i14 = i12;
            z0Var2 = z0Var;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str3 = str2;
            sb2.append(str3);
            sb2.append(" error, index=");
            i14 = i12;
            sb2.append(i14);
            sb2.append(", format=");
            z0Var2 = z0Var;
            sb2.append(z0Var2);
            sb2.append(", format_supported=");
            sb2.append(com.google.android.exoplayer2.util.n1.getFormatSupportString(i13));
            string = sb2.toString();
        }
        this(TextUtils.isEmpty(str) ? string : w0.i.d(string, ": ", str), th2, i11, i10, str3, i14, z0Var2, i13, null, SystemClock.elapsedRealtime(), z10);
    }
}
