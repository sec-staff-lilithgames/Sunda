package io.bidmachine.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a0 extends gn.b1 {

    /* renamed from: l, reason: collision with root package name */
    public final int f60873l;

    /* renamed from: m, reason: collision with root package name */
    public final String f60874m;

    /* renamed from: n, reason: collision with root package name */
    public final int f60875n;

    /* renamed from: o, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f60876o;

    /* renamed from: p, reason: collision with root package name */
    public final int f60877p;

    /* renamed from: q, reason: collision with root package name */
    public final ao.k0 f60878q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f60879r;

    public a0(int i10, int i11, Exception exc) {
        this(i10, exc, null, i11, null, -1, null, 4, false);
    }

    public static a0 createForRemote(String str) {
        return new a0(3, null, str, 1001, null, -1, null, 4, false);
    }

    public static a0 createForRenderer(Throwable th2, String str, int i10, io.bidmachine.media3.common.b bVar, int i11, boolean z10, int i12) {
        if (bVar == null) {
            i11 = 4;
        }
        return new a0(1, th2, null, i12, str, i10, bVar, i11, z10);
    }

    public static a0 createForSource(IOException iOException, int i10) {
        return new a0(0, i10, iOException);
    }

    @Deprecated
    public static a0 createForUnexpected(RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    public final a0 a(ao.k0 k0Var) {
        return new a0((String) io.bidmachine.media3.common.util.a1.castNonNull(getMessage()), getCause(), this.f57815b, this.f60873l, this.f60874m, this.f60875n, this.f60876o, this.f60877p, k0Var, this.f57816c, this.f60879r);
    }

    @Override // gn.b1
    public boolean errorInfoEquals(gn.b1 b1Var) {
        if (!super.errorInfoEquals(b1Var)) {
            return false;
        }
        a0 a0Var = (a0) io.bidmachine.media3.common.util.a1.castNonNull(b1Var);
        return this.f60873l == a0Var.f60873l && Objects.equals(this.f60874m, a0Var.f60874m) && this.f60875n == a0Var.f60875n && Objects.equals(this.f60876o, a0Var.f60876o) && this.f60877p == a0Var.f60877p && Objects.equals(this.f60878q, a0Var.f60878q) && this.f60879r == a0Var.f60879r;
    }

    public Exception getRendererException() {
        io.bidmachine.media3.common.util.a.checkState(this.f60873l == 1);
        return (Exception) io.bidmachine.media3.common.util.a.checkNotNull(getCause());
    }

    public IOException getSourceException() {
        io.bidmachine.media3.common.util.a.checkState(this.f60873l == 0);
        return (IOException) io.bidmachine.media3.common.util.a.checkNotNull(getCause());
    }

    public RuntimeException getUnexpectedException() {
        io.bidmachine.media3.common.util.a.checkState(this.f60873l == 2);
        return (RuntimeException) io.bidmachine.media3.common.util.a.checkNotNull(getCause());
    }

    public a0(String str, Throwable th2, int i10, int i11, String str2, int i12, io.bidmachine.media3.common.b bVar, int i13, ao.k0 k0Var, long j10, boolean z10) {
        super(str, th2, i10, Bundle.EMPTY, j10);
        io.bidmachine.media3.common.util.a.checkArgument(!z10 || i11 == 1);
        io.bidmachine.media3.common.util.a.checkArgument(th2 != null || i11 == 3);
        this.f60873l = i11;
        this.f60874m = str2;
        this.f60875n = i12;
        this.f60876o = bVar;
        this.f60877p = i13;
        this.f60878q = k0Var;
        this.f60879r = z10;
    }

    public static a0 createForUnexpected(RuntimeException runtimeException, int i10) {
        return new a0(2, i10, runtimeException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a0(int i10, Throwable th2, String str, int i11, String str2, int i12, io.bidmachine.media3.common.b bVar, int i13, boolean z10) {
        String str3;
        int i14;
        io.bidmachine.media3.common.b bVar2;
        String string;
        if (i10 == 0) {
            str3 = str2;
            i14 = i12;
            bVar2 = bVar;
            string = "Source error";
        } else if (i10 != 1) {
            if (i10 != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str3 = str2;
            i14 = i12;
            bVar2 = bVar;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str3 = str2;
            sb2.append(str3);
            sb2.append(" error, index=");
            i14 = i12;
            sb2.append(i14);
            sb2.append(", format=");
            bVar2 = bVar;
            sb2.append(bVar2);
            sb2.append(", format_supported=");
            sb2.append(io.bidmachine.media3.common.util.a1.getFormatSupportString(i13));
            string = sb2.toString();
        }
        this(TextUtils.isEmpty(str) ? string : w0.i.d(string, ": ", str), th2, i11, i10, str3, i14, bVar2, i13, null, SystemClock.elapsedRealtime(), z10);
    }
}
