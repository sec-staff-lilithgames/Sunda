package n4;

import androidx.datastore.preferences.protobuf.e1;
import androidx.datastore.preferences.protobuf.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n extends e1 implements q {
    public n clearBoolean() {
        c();
        p.H((p) this.f5861c);
        return this;
    }

    public n clearBytes() {
        c();
        p.D((p) this.f5861c);
        return this;
    }

    public n clearDouble() {
        c();
        p.B((p) this.f5861c);
        return this;
    }

    public n clearFloat() {
        c();
        p.J((p) this.f5861c);
        return this;
    }

    public n clearInteger() {
        c();
        p.r((p) this.f5861c);
        return this;
    }

    public n clearLong() {
        c();
        p.t((p) this.f5861c);
        return this;
    }

    public n clearString() {
        c();
        p.v((p) this.f5861c);
        return this;
    }

    public n clearStringSet() {
        c();
        p.z((p) this.f5861c);
        return this;
    }

    public n clearValue() {
        c();
        p.F((p) this.f5861c);
        return this;
    }

    @Override // n4.q
    public boolean getBoolean() {
        return ((p) this.f5861c).getBoolean();
    }

    @Override // n4.q
    public x getBytes() {
        return ((p) this.f5861c).getBytes();
    }

    @Override // n4.q
    public double getDouble() {
        return ((p) this.f5861c).getDouble();
    }

    @Override // n4.q
    public float getFloat() {
        return ((p) this.f5861c).getFloat();
    }

    @Override // n4.q
    public int getInteger() {
        return ((p) this.f5861c).getInteger();
    }

    @Override // n4.q
    public long getLong() {
        return ((p) this.f5861c).getLong();
    }

    @Override // n4.q
    public String getString() {
        return ((p) this.f5861c).getString();
    }

    @Override // n4.q
    public x getStringBytes() {
        return ((p) this.f5861c).getStringBytes();
    }

    @Override // n4.q
    public l getStringSet() {
        return ((p) this.f5861c).getStringSet();
    }

    @Override // n4.q
    public o getValueCase() {
        return ((p) this.f5861c).getValueCase();
    }

    @Override // n4.q
    public boolean hasBoolean() {
        return ((p) this.f5861c).hasBoolean();
    }

    @Override // n4.q
    public boolean hasBytes() {
        return ((p) this.f5861c).hasBytes();
    }

    @Override // n4.q
    public boolean hasDouble() {
        return ((p) this.f5861c).hasDouble();
    }

    @Override // n4.q
    public boolean hasFloat() {
        return ((p) this.f5861c).hasFloat();
    }

    @Override // n4.q
    public boolean hasInteger() {
        return ((p) this.f5861c).hasInteger();
    }

    @Override // n4.q
    public boolean hasLong() {
        return ((p) this.f5861c).hasLong();
    }

    @Override // n4.q
    public boolean hasString() {
        return ((p) this.f5861c).hasString();
    }

    @Override // n4.q
    public boolean hasStringSet() {
        return ((p) this.f5861c).hasStringSet();
    }

    public n mergeStringSet(l lVar) {
        c();
        p.y((p) this.f5861c, lVar);
        return this;
    }

    public n setBoolean(boolean z10) {
        c();
        p.G((p) this.f5861c, z10);
        return this;
    }

    public n setBytes(x xVar) {
        c();
        p.C((p) this.f5861c, xVar);
        return this;
    }

    public n setDouble(double d10) {
        c();
        p.A((p) this.f5861c, d10);
        return this;
    }

    public n setFloat(float f10) {
        c();
        p.I((p) this.f5861c, f10);
        return this;
    }

    public n setInteger(int i10) {
        c();
        p.K((p) this.f5861c, i10);
        return this;
    }

    public n setLong(long j10) {
        c();
        p.s((p) this.f5861c, j10);
        return this;
    }

    public n setString(String str) {
        c();
        p.u(str, (p) this.f5861c);
        return this;
    }

    public n setStringBytes(x xVar) {
        c();
        p.w((p) this.f5861c, xVar);
        return this;
    }

    public n setStringSet(l lVar) {
        c();
        p.x((p) this.f5861c, lVar);
        return this;
    }

    public n setStringSet(k kVar) {
        c();
        p.x((p) this.f5861c, (l) kVar.build());
        return this;
    }
}
