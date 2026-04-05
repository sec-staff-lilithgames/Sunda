package hn;

import io.bidmachine.media3.common.util.a1;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f59037e = new f(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f59038a;

    /* renamed from: b, reason: collision with root package name */
    public final int f59039b;

    /* renamed from: c, reason: collision with root package name */
    public final int f59040c;

    /* renamed from: d, reason: collision with root package name */
    public final int f59041d;

    public f(io.bidmachine.media3.common.b bVar) {
        this(bVar.F, bVar.E, bVar.G);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f59038a == fVar.f59038a && this.f59039b == fVar.f59039b && this.f59040c == fVar.f59040c;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f59038a), Integer.valueOf(this.f59039b), Integer.valueOf(this.f59040c));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.f59038a);
        sb2.append(", channelCount=");
        sb2.append(this.f59039b);
        sb2.append(", encoding=");
        return e3.g.m(sb2, this.f59040c, AbstractJsonLexerKt.END_LIST);
    }

    public f(int i10, int i11, int i12) {
        this.f59038a = i10;
        this.f59039b = i11;
        this.f59040c = i12;
        this.f59041d = a1.isEncodingLinearPcm(i12) ? a1.getPcmFrameSize(i12, i11) : -1;
    }
}
