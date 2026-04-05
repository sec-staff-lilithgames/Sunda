package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f25842a;

    /* renamed from: b, reason: collision with root package name */
    public final b[] f25843b;

    /* renamed from: c, reason: collision with root package name */
    public int f25844c;

    public h(b... bVarArr) {
        this.f25843b = bVarArr;
        this.f25842a = bVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f25843b, ((h) obj).f25843b);
    }

    public final int hashCode() {
        if (this.f25844c == 0) {
            this.f25844c = Arrays.hashCode(this.f25843b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f25844c;
    }
}
