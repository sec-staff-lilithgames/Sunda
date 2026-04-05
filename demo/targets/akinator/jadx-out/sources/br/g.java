package br;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum g implements ir.i {
    Left(TtmlNode.LEFT),
    Top("top"),
    Right(TtmlNode.RIGHT),
    Bottom("bottom");


    /* renamed from: c, reason: collision with root package name */
    public static final f f9831c = new f(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f9837b;

    g(String str) {
        this.f9837b = str;
    }

    public static final g get(String str) {
        return f9831c.get(str);
    }

    @Override // ir.i
    public String getKey() {
        return this.f9837b;
    }

    public final g inverted() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return Right;
        }
        if (iOrdinal == 1) {
            return Bottom;
        }
        if (iOrdinal == 2) {
            return Left;
        }
        if (iOrdinal == 3) {
            return Top;
        }
        throw new tu.t();
    }
}
