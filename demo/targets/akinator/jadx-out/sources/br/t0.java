package br;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum t0 implements ir.i {
    /* JADX INFO: Fake field, exist only in values array */
    LeftRight(TtmlNode.RIGHT),
    /* JADX INFO: Fake field, exist only in values array */
    TopBottom("bottom"),
    /* JADX INFO: Fake field, exist only in values array */
    RightLeft(TtmlNode.LEFT),
    /* JADX INFO: Fake field, exist only in values array */
    BottomTop("top");


    /* renamed from: c, reason: collision with root package name */
    public static final s0 f9991c = new s0(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f9993b;

    t0(String str) {
        this.f9993b = str;
    }

    public static final t0 get(String str) {
        return f9991c.get(str);
    }

    @Override // ir.i
    public String getKey() {
        return this.f9993b;
    }

    public final dq.y toDrawableGradientOrientation() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return dq.y.f52584f;
        }
        if (iOrdinal == 1) {
            return dq.y.f52581b;
        }
        if (iOrdinal == 2) {
            return dq.y.f52582c;
        }
        if (iOrdinal == 3) {
            return dq.y.f52583e;
        }
        throw new tu.t();
    }
}
