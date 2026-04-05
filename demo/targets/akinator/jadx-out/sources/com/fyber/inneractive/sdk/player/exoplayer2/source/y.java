package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f25821a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.o[] f25822b;

    /* renamed from: c, reason: collision with root package name */
    public int f25823c;

    public y(com.fyber.inneractive.sdk.player.exoplayer2.o... oVarArr) {
        if (oVarArr.length <= 0) {
            throw new IllegalStateException();
        }
        this.f25822b = oVarArr;
        this.f25821a = oVarArr.length;
    }

    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        int i10 = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = this.f25822b;
            if (i10 >= oVarArr.length) {
                return -1;
            }
            if (oVar == oVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f25821a == yVar.f25821a && Arrays.equals(this.f25822b, yVar.f25822b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f25823c == 0) {
            this.f25823c = Arrays.hashCode(this.f25822b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f25823c;
    }
}
