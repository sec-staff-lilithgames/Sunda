package io.odeeo.internal.b;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.b.g;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n extends i0 {

    /* renamed from: k, reason: collision with root package name */
    public static final g.a<n> f62832k = new is.b(1);

    /* renamed from: d, reason: collision with root package name */
    public final int f62833d;

    /* renamed from: e, reason: collision with root package name */
    public final String f62834e;

    /* renamed from: f, reason: collision with root package name */
    public final int f62835f;

    /* renamed from: g, reason: collision with root package name */
    public final t f62836g;

    /* renamed from: h, reason: collision with root package name */
    public final int f62837h;

    /* renamed from: i, reason: collision with root package name */
    public final io.odeeo.internal.a0.s f62838i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f62839j;

    public n(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, false);
    }

    public static n createForRemote(String str) {
        return new n(3, null, str, 1001, null, -1, null, 4, false);
    }

    public static n createForRenderer(Throwable th2, String str, int i10, t tVar, int i11, boolean z10, int i12) {
        if (tVar == null) {
            i11 = 4;
        }
        return new n(1, th2, null, i12, str, i10, tVar, i11, z10);
    }

    public static n createForSource(IOException iOException, int i10) {
        return new n(0, iOException, i10);
    }

    @Deprecated
    public static n createForUnexpected(RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    public n a(io.odeeo.internal.a0.s sVar) {
        return new n((String) io.odeeo.internal.q0.g0.castNonNull(getMessage()), getCause(), this.f62743a, this.f62833d, this.f62834e, this.f62835f, this.f62836g, this.f62837h, sVar, this.f62744b, this.f62839j);
    }

    @Override // io.odeeo.internal.b.i0
    public boolean errorInfoEquals(i0 i0Var) {
        if (!super.errorInfoEquals(i0Var)) {
            return false;
        }
        n nVar = (n) io.odeeo.internal.q0.g0.castNonNull(i0Var);
        return this.f62833d == nVar.f62833d && io.odeeo.internal.q0.g0.areEqual(this.f62834e, nVar.f62834e) && this.f62835f == nVar.f62835f && io.odeeo.internal.q0.g0.areEqual(this.f62836g, nVar.f62836g) && this.f62837h == nVar.f62837h && io.odeeo.internal.q0.g0.areEqual(this.f62838i, nVar.f62838i) && this.f62839j == nVar.f62839j;
    }

    public Exception getRendererException() {
        io.odeeo.internal.q0.a.checkState(this.f62833d == 1);
        return (Exception) io.odeeo.internal.q0.a.checkNotNull(getCause());
    }

    public IOException getSourceException() {
        io.odeeo.internal.q0.a.checkState(this.f62833d == 0);
        return (IOException) io.odeeo.internal.q0.a.checkNotNull(getCause());
    }

    public RuntimeException getUnexpectedException() {
        io.odeeo.internal.q0.a.checkState(this.f62833d == 2);
        return (RuntimeException) io.odeeo.internal.q0.a.checkNotNull(getCause());
    }

    @Override // io.odeeo.internal.b.i0, io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(i0.a(1001), this.f62833d);
        bundle.putString(i0.a(1002), this.f62834e);
        bundle.putInt(i0.a(IronSourceError.AUCTION_ERROR_DECRYPTION), this.f62835f);
        bundle.putBundle(i0.a(1004), io.odeeo.internal.q0.c.toNullableBundle(this.f62836g));
        bundle.putInt(i0.a(1005), this.f62837h);
        bundle.putBoolean(i0.a(1006), this.f62839j);
        return bundle;
    }

    public n(int i10, Throwable th2, String str, int i11, String str2, int i12, t tVar, int i13, boolean z10) {
        this(a(i10, str, str2, i12, tVar, i13), th2, i11, i10, str2, i12, tVar, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    public static n createForUnexpected(RuntimeException runtimeException, int i10) {
        return new n(2, runtimeException, i10);
    }

    public static String a(int i10, String str, String str2, int i11, t tVar, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 == 1) {
            str3 = str2 + " error, index=" + i11 + ", format=" + tVar + ", format_supported=" + io.odeeo.internal.q0.g0.getFormatSupportString(i12);
        } else if (i10 != 3) {
            str3 = "Unexpected runtime error";
        } else {
            str3 = "Remote error";
        }
        return !TextUtils.isEmpty(str) ? w0.i.d(str3, ": ", str) : str3;
    }

    public n(Bundle bundle) {
        super(bundle);
        this.f62833d = bundle.getInt(i0.a(1001), 2);
        this.f62834e = bundle.getString(i0.a(1002));
        this.f62835f = bundle.getInt(i0.a(IronSourceError.AUCTION_ERROR_DECRYPTION), -1);
        this.f62836g = (t) io.odeeo.internal.q0.c.fromNullableBundle(t.H, bundle.getBundle(i0.a(1004)));
        this.f62837h = bundle.getInt(i0.a(1005), 4);
        this.f62839j = bundle.getBoolean(i0.a(1006), false);
        this.f62838i = null;
    }

    public n(String str, Throwable th2, int i10, int i11, String str2, int i12, t tVar, int i13, io.odeeo.internal.a0.s sVar, long j10, boolean z10) {
        super(str, th2, i10, j10);
        io.odeeo.internal.q0.a.checkArgument(!z10 || i11 == 1);
        io.odeeo.internal.q0.a.checkArgument(th2 != null || i11 == 3);
        this.f62833d = i11;
        this.f62834e = str2;
        this.f62835f = i12;
        this.f62836g = tVar;
        this.f62837h = i13;
        this.f62838i = sVar;
        this.f62839j = z10;
    }
}
