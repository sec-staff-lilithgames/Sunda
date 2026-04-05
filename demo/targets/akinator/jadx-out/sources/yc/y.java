package yc;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Objects;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class y extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final y f94357c = new y("");

    /* renamed from: b, reason: collision with root package name */
    public final String f94358b;

    public y(String str) {
        this.f94358b = str;
    }

    public static y valueOf(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? f94357c : new y(str);
    }

    @Override // jc.t
    public boolean asBoolean(boolean z10) {
        String str = this.f94358b;
        if (str == null) {
            return z10;
        }
        String strTrim = str.trim();
        if ("true".equals(strTrim)) {
            return true;
        }
        if ("false".equals(strTrim)) {
            return false;
        }
        return z10;
    }

    @Override // jc.t
    public double asDouble(double d10) {
        return cc.m.parseAsDouble(this.f94358b, d10);
    }

    @Override // jc.t
    public int asInt(int i10) {
        return cc.m.parseAsInt(this.f94358b, i10);
    }

    @Override // jc.t
    public long asLong(long j10) {
        return cc.m.parseAsLong(this.f94358b, j10);
    }

    @Override // jc.t
    public String asText() {
        return this.f94358b;
    }

    @Override // yc.a0, yc.b, jc.t, ub.o0
    public ub.z asToken() {
        return ub.z.VALUE_STRING;
    }

    @Override // jc.t
    public byte[] binaryValue() throws IOException {
        return getBinaryValue(ub.c.getDefaultVariant());
    }

    @Override // jc.t
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof y)) {
            return Objects.equals(((y) obj).f94358b, this.f94358b);
        }
        return false;
    }

    public byte[] getBinaryValue(ub.b bVar) throws IOException {
        String strTrim = this.f94358b.trim();
        ic.d dVar = new ic.d(Math.max(16, Math.min(C.DEFAULT_BUFFER_SEGMENT_SIZE, ((strTrim.length() >> 2) * 3) + 4)));
        try {
            bVar.decode(strTrim, dVar);
            return dVar.toByteArray();
        } catch (IllegalArgumentException e10) {
            throw pc.c.from(null, "Cannot access contents of TextNode as binary due to broken Base64 encoding: " + e10.getMessage(), strTrim, byte[].class);
        }
    }

    @Override // jc.t
    public p getNodeType() {
        return p.f94339k;
    }

    @Override // yc.b
    public int hashCode() {
        return Objects.hashCode(this.f94358b);
    }

    @Override // yc.b, jc.t, jc.u, jc.v
    public final void serialize(ub.o oVar, u0 u0Var) throws IOException {
        String str = this.f94358b;
        if (str == null) {
            oVar.writeNull();
        } else {
            oVar.writeString(str);
        }
    }

    @Override // jc.t
    public String textValue() {
        return this.f94358b;
    }

    @Override // jc.t
    public String asText(String str) {
        String str2 = this.f94358b;
        return str2 == null ? str : str2;
    }
}
