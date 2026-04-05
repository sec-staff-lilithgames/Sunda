package com.google.android.exoplayer2.audio;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final s f27278e = new s(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f27279a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27280b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27281c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27282d;

    public s(int i10, int i11, int i12) {
        this.f27279a = i10;
        this.f27280b = i11;
        this.f27281c = i12;
        this.f27282d = com.google.android.exoplayer2.util.n1.isEncodingLinearPcm(i12) ? com.google.android.exoplayer2.util.n1.getPcmFrameSize(i12, i11) : -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f27279a == sVar.f27279a && this.f27280b == sVar.f27280b && this.f27281c == sVar.f27281c;
    }

    public int hashCode() {
        return mh.h1.hashCode(Integer.valueOf(this.f27279a), Integer.valueOf(this.f27280b), Integer.valueOf(this.f27281c));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.f27279a);
        sb2.append(", channelCount=");
        sb2.append(this.f27280b);
        sb2.append(", encoding=");
        return e3.g.m(sb2, this.f27281c, AbstractJsonLexerKt.END_LIST);
    }
}
