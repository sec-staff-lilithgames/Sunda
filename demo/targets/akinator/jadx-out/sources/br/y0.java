package br;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum y0 implements ir.i {
    /* JADX INFO: Fake field, exist only in values array */
    Left(TtmlNode.LEFT, 3),
    Center(TtmlNode.CENTER, 1),
    /* JADX INFO: Fake field, exist only in values array */
    Right(TtmlNode.RIGHT, 5);


    /* renamed from: e, reason: collision with root package name */
    public static final x0 f10023e = new x0(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f10026b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10027c;

    y0(String str, int i10) {
        this.f10026b = str;
        this.f10027c = i10;
    }

    public static final y0 get(String str) {
        return f10023e.get(str);
    }

    @Override // ir.i
    public String getKey() {
        return this.f10026b;
    }

    public final int getValue() {
        return this.f10027c;
    }
}
