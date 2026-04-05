package me;

import com.google.android.exoplayer2.util.v0;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import me.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f74369a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74370b;

    /* renamed from: c, reason: collision with root package name */
    public final int f74371c;

    /* renamed from: d, reason: collision with root package name */
    public int f74372d;

    /* renamed from: e, reason: collision with root package name */
    public int f74373e;

    public h(a.b bVar) {
        v0 v0Var = bVar.f74346b;
        this.f74369a = v0Var;
        v0Var.setPosition(12);
        this.f74371c = v0Var.readUnsignedIntToInt() & 255;
        this.f74370b = v0Var.readUnsignedIntToInt();
    }

    @Override // me.e
    public int getFixedSampleSize() {
        return -1;
    }

    @Override // me.e
    public int getSampleCount() {
        return this.f74370b;
    }

    @Override // me.e
    public int readNextSampleSize() {
        v0 v0Var = this.f74369a;
        int i10 = this.f74371c;
        if (i10 == 8) {
            return v0Var.readUnsignedByte();
        }
        if (i10 == 16) {
            return v0Var.readUnsignedShort();
        }
        int i11 = this.f74372d;
        this.f74372d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f74373e & 15;
        }
        int unsignedByte = v0Var.readUnsignedByte();
        this.f74373e = unsignedByte;
        return (unsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
    }
}
