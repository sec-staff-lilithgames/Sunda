package io.odeeo.internal.r0;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import e6.h0;
import io.odeeo.internal.b.g;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements io.odeeo.internal.b.g {

    /* renamed from: f, reason: collision with root package name */
    public static final g.a<b> f66130f = new h0(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f66131a;

    /* renamed from: b, reason: collision with root package name */
    public final int f66132b;

    /* renamed from: c, reason: collision with root package name */
    public final int f66133c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f66134d;

    /* renamed from: e, reason: collision with root package name */
    public int f66135e;

    public b(int i10, int i11, int i12, byte[] bArr) {
        this.f66131a = i10;
        this.f66132b = i11;
        this.f66133c = i12;
        this.f66134d = bArr;
    }

    public static /* synthetic */ b a(Bundle bundle) {
        return new b(bundle.getInt(a(0), -1), bundle.getInt(a(1), -1), bundle.getInt(a(2), -1), bundle.getByteArray(a(3)));
    }

    @Pure
    public static int isoColorPrimariesToColorSpace(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int isoTransferCharacteristicsToColorTransfer(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f66131a == bVar.f66131a && this.f66132b == bVar.f66132b && this.f66133c == bVar.f66133c && Arrays.equals(this.f66134d, bVar.f66134d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f66135e == 0) {
            this.f66135e = Arrays.hashCode(this.f66134d) + ((((((this.f66131a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f66132b) * 31) + this.f66133c) * 31);
        }
        return this.f66135e;
    }

    @Override // io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(a(0), this.f66131a);
        bundle.putInt(a(1), this.f66132b);
        bundle.putInt(a(2), this.f66133c);
        bundle.putByteArray(a(3), this.f66134d);
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f66131a);
        sb2.append(", ");
        sb2.append(this.f66132b);
        sb2.append(", ");
        sb2.append(this.f66133c);
        sb2.append(", ");
        return a.b.q(sb2, this.f66134d != null, ")");
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
