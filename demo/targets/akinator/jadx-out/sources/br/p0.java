package br;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum p0 implements ir.i {
    /* JADX INFO: Fake field, exist only in values array */
    Normal("normal", 0),
    /* JADX INFO: Fake field, exist only in values array */
    Bold(TtmlNode.BOLD, 1),
    /* JADX INFO: Fake field, exist only in values array */
    Italic(TtmlNode.ITALIC, 2),
    /* JADX INFO: Fake field, exist only in values array */
    BoldItalic("bold_italic", 3);


    /* renamed from: e, reason: collision with root package name */
    public static final o0 f9970e = new o0(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f9972b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9973c;

    p0(String str, int i10) {
        this.f9972b = str;
        this.f9973c = i10;
    }

    public static final p0 get(String str) {
        return f9970e.get(str);
    }

    @Override // ir.i
    public String getKey() {
        return this.f9972b;
    }

    public final int getTypeface() {
        return this.f9973c;
    }
}
