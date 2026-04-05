package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.ironsource.C3191e4;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f25944a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25945b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25946c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25947d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25948e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25949f;

    public k(Uri uri, long j10, long j11, long j12, String str, int i10) {
        if (j10 < 0) {
            throw new IllegalArgumentException();
        }
        if (j11 < 0) {
            throw new IllegalArgumentException();
        }
        if (j12 <= 0 && j12 != -1) {
            throw new IllegalArgumentException();
        }
        this.f25944a = uri;
        this.f25945b = j10;
        this.f25946c = j11;
        this.f25947d = j12;
        this.f25948e = str;
        this.f25949f = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        sb2.append(this.f25944a);
        sb2.append(", ");
        sb2.append(Arrays.toString((byte[]) null));
        sb2.append(", ");
        sb2.append(this.f25945b);
        sb2.append(", ");
        sb2.append(this.f25946c);
        sb2.append(", ");
        sb2.append(this.f25947d);
        sb2.append(", ");
        sb2.append(this.f25948e);
        sb2.append(", ");
        return a.b.f(this.f25949f, C3191e4.i.f36531e, sb2);
    }
}
