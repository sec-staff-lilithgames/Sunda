package lc;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class d implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final int f73090e = f.values().length;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f73091b;

    /* renamed from: c, reason: collision with root package name */
    public final c[] f73092c;

    public d() {
        this.f73092c = new c[f73090e];
        this.f73091b = null;
    }

    public c findAction(f fVar) {
        return this.f73092c[fVar.ordinal()];
    }

    public Boolean getAcceptBlankAsEmpty() {
        return this.f73091b;
    }

    public d(b0 b0Var) {
        this.f73091b = b0Var.f73091b;
        c[] cVarArr = b0Var.f73092c;
        this.f73092c = (c[]) Arrays.copyOf(cVarArr, cVarArr.length);
    }
}
