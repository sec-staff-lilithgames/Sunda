package br;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum z1 implements ir.i {
    Left(TtmlNode.LEFT),
    Top("top"),
    Right(TtmlNode.RIGHT),
    Bottom("bottom");


    /* renamed from: c, reason: collision with root package name */
    public static final y1 f10034c = new y1(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f10040b;

    z1(String str) {
        this.f10040b = str;
    }

    public static final z1 get(String str) {
        return f10034c.get(str);
    }

    @Override // ir.i
    public String getKey() {
        return this.f10040b;
    }
}
