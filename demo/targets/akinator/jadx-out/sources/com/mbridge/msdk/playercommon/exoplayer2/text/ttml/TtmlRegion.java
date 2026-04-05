package com.mbridge.msdk.playercommon.exoplayer2.text.ttml;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class TtmlRegion {

    /* renamed from: id, reason: collision with root package name */
    public final String f42174id;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final float position;
    public final float textSize;
    public final int textSizeType;
    public final float width;

    public TtmlRegion(String str) {
        this(str, Float.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public TtmlRegion(String str, float f10, float f11, int i10, int i11, float f12, int i12, float f13) {
        this.f42174id = str;
        this.position = f10;
        this.line = f11;
        this.lineType = i10;
        this.lineAnchor = i11;
        this.width = f12;
        this.textSizeType = i12;
        this.textSize = f13;
    }
}
