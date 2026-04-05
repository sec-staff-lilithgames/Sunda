package gn;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.UUID;
import nh.b5;
import nh.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h0 {

    /* renamed from: i, reason: collision with root package name */
    public static final String f57904i = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: j, reason: collision with root package name */
    public static final String f57905j = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: k, reason: collision with root package name */
    public static final String f57906k = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    /* renamed from: l, reason: collision with root package name */
    public static final String f57907l = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(3);

    /* renamed from: m, reason: collision with root package name */
    public static final String f57908m = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(4);

    /* renamed from: n, reason: collision with root package name */
    public static final String f57909n = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(5);

    /* renamed from: o, reason: collision with root package name */
    public static final String f57910o = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(6);

    /* renamed from: p, reason: collision with root package name */
    public static final String f57911p = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(7);

    /* renamed from: a, reason: collision with root package name */
    public final UUID f57912a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f57913b;

    /* renamed from: c, reason: collision with root package name */
    public final m5 f57914c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f57915d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f57916e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f57917f;

    /* renamed from: g, reason: collision with root package name */
    public final b5 f57918g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f57919h;

    public h0(g0 g0Var) {
        io.bidmachine.media3.common.util.a.checkState((g0Var.f57889f && g0Var.f57885b == null) ? false : true);
        this.f57912a = (UUID) io.bidmachine.media3.common.util.a.checkNotNull(g0Var.f57884a);
        this.f57913b = g0Var.f57885b;
        this.f57914c = g0Var.f57886c;
        this.f57915d = g0Var.f57887d;
        this.f57917f = g0Var.f57889f;
        this.f57916e = g0Var.f57888e;
        this.f57918g = g0Var.f57890g;
        byte[] bArr = g0Var.f57891h;
        this.f57919h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public static h0 fromBundle(Bundle bundle) {
        UUID uuidFromString = UUID.fromString((String) io.bidmachine.media3.common.util.a.checkNotNull(bundle.getString(f57904i)));
        Uri uri = (Uri) bundle.getParcelable(f57905j);
        m5 m5VarBundleToStringImmutableMap = io.bidmachine.media3.common.util.f.bundleToStringImmutableMap(io.bidmachine.media3.common.util.f.getBundleWithDefault(bundle, f57906k, Bundle.EMPTY));
        boolean z10 = bundle.getBoolean(f57907l, false);
        boolean z11 = bundle.getBoolean(f57908m, false);
        boolean z12 = bundle.getBoolean(f57909n, false);
        b5 b5VarCopyOf = b5.copyOf((Collection) io.bidmachine.media3.common.util.f.getIntegerArrayListWithDefault(bundle, f57910o, new ArrayList()));
        return new g0(uuidFromString).setLicenseUri(uri).setLicenseRequestHeaders(m5VarBundleToStringImmutableMap).setMultiSession(z10).setForceDefaultLicenseUri(z12).setPlayClearContentWithoutKey(z11).setForcedSessionTrackTypes(b5VarCopyOf).setKeySetId(bundle.getByteArray(f57911p)).build();
    }

    public g0 buildUpon() {
        g0 g0Var = new g0();
        g0Var.f57884a = this.f57912a;
        g0Var.f57885b = this.f57913b;
        g0Var.f57886c = this.f57914c;
        g0Var.f57887d = this.f57915d;
        g0Var.f57888e = this.f57916e;
        g0Var.f57889f = this.f57917f;
        g0Var.f57890g = this.f57918g;
        g0Var.f57891h = this.f57919h;
        return g0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f57912a.equals(h0Var.f57912a) && Objects.equals(this.f57913b, h0Var.f57913b) && Objects.equals(this.f57914c, h0Var.f57914c) && this.f57915d == h0Var.f57915d && this.f57917f == h0Var.f57917f && this.f57916e == h0Var.f57916e && this.f57918g.equals(h0Var.f57918g) && Arrays.equals(this.f57919h, h0Var.f57919h);
    }

    public byte[] getKeySetId() {
        byte[] bArr = this.f57919h;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = this.f57912a.hashCode() * 31;
        Uri uri = this.f57913b;
        return Arrays.hashCode(this.f57919h) + ((this.f57918g.hashCode() + ((((((((this.f57914c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f57915d ? 1 : 0)) * 31) + (this.f57917f ? 1 : 0)) * 31) + (this.f57916e ? 1 : 0)) * 31)) * 31);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(f57904i, this.f57912a.toString());
        Uri uri = this.f57913b;
        if (uri != null) {
            bundle.putParcelable(f57905j, uri);
        }
        m5 m5Var = this.f57914c;
        if (!m5Var.isEmpty()) {
            bundle.putBundle(f57906k, io.bidmachine.media3.common.util.f.stringMapToBundle(m5Var));
        }
        boolean z10 = this.f57915d;
        if (z10) {
            bundle.putBoolean(f57907l, z10);
        }
        boolean z11 = this.f57916e;
        if (z11) {
            bundle.putBoolean(f57908m, z11);
        }
        boolean z12 = this.f57917f;
        if (z12) {
            bundle.putBoolean(f57909n, z12);
        }
        b5 b5Var = this.f57918g;
        if (!b5Var.isEmpty()) {
            bundle.putIntegerArrayList(f57910o, new ArrayList<>(b5Var));
        }
        byte[] bArr = this.f57919h;
        if (bArr != null) {
            bundle.putByteArray(f57911p, bArr);
        }
        return bundle;
    }
}
