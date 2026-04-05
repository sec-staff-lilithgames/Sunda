package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f25824d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f25825a;

    /* renamed from: b, reason: collision with root package name */
    public final y[] f25826b;

    /* renamed from: c, reason: collision with root package name */
    public int f25827c;

    static {
        new z(new y[0]);
    }

    public z(y... yVarArr) {
        this.f25826b = yVarArr;
        this.f25825a = yVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (this.f25825a == zVar.f25825a && Arrays.equals(this.f25826b, zVar.f25826b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f25827c == 0) {
            this.f25827c = Arrays.hashCode(this.f25826b);
        }
        return this.f25827c;
    }
}
