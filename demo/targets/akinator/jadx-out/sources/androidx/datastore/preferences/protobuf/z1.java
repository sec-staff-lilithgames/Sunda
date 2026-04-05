package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class z1 {

    /* renamed from: a, reason: collision with root package name */
    public x f6154a;

    /* renamed from: b, reason: collision with root package name */
    public s0 f6155b;

    /* renamed from: c, reason: collision with root package name */
    public volatile r2 f6156c;

    /* renamed from: d, reason: collision with root package name */
    public volatile x f6157d;

    public z1(s0 s0Var, x xVar) {
        if (s0Var == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (xVar == null) {
            throw new NullPointerException("found null ByteString");
        }
        this.f6155b = s0Var;
        this.f6154a = xVar;
    }

    public static z1 fromValue(r2 r2Var) {
        z1 z1Var = new z1();
        z1Var.setValue(r2Var);
        return z1Var;
    }

    public void clear() {
        this.f6154a = null;
        this.f6156c = null;
        this.f6157d = null;
    }

    public boolean containsDefaultInstance() {
        x xVar = this.f6157d;
        s sVar = x.f6099c;
        if (xVar == sVar) {
            return true;
        }
        if (this.f6156c != null) {
            return false;
        }
        x xVar2 = this.f6154a;
        return xVar2 == null || xVar2 == sVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        r2 r2Var = this.f6156c;
        r2 r2Var2 = z1Var.f6156c;
        return (r2Var == null && r2Var2 == null) ? toByteString().equals(z1Var.toByteString()) : (r2Var == null || r2Var2 == null) ? r2Var != null ? r2Var.equals(z1Var.getValue(r2Var.getDefaultInstanceForType())) : getValue(r2Var2.getDefaultInstanceForType()).equals(r2Var2) : r2Var.equals(r2Var2);
    }

    public int getSerializedSize() {
        if (this.f6157d != null) {
            return this.f6157d.size();
        }
        x xVar = this.f6154a;
        if (xVar != null) {
            return xVar.size();
        }
        if (this.f6156c != null) {
            return this.f6156c.getSerializedSize();
        }
        return 0;
    }

    public r2 getValue(r2 r2Var) {
        if (this.f6156c == null) {
            synchronized (this) {
                if (this.f6156c == null) {
                    try {
                        if (this.f6154a != null) {
                            this.f6156c = (r2) r2Var.getParserForType().parseFrom(this.f6154a, this.f6155b);
                            this.f6157d = this.f6154a;
                        } else {
                            this.f6156c = r2Var;
                            this.f6157d = x.f6099c;
                        }
                    } catch (u1 unused) {
                        this.f6156c = r2Var;
                        this.f6157d = x.f6099c;
                    }
                }
            }
        }
        return this.f6156c;
    }

    public int hashCode() {
        return 1;
    }

    public void merge(z1 z1Var) {
        x xVar;
        if (z1Var.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(z1Var);
            return;
        }
        if (this.f6155b == null) {
            this.f6155b = z1Var.f6155b;
        }
        x xVar2 = this.f6154a;
        if (xVar2 != null && (xVar = z1Var.f6154a) != null) {
            this.f6154a = xVar2.concat(xVar);
            return;
        }
        if (this.f6156c == null && z1Var.f6156c != null) {
            r2 r2VarBuild = z1Var.f6156c;
            try {
                r2VarBuild = r2VarBuild.toBuilder().mergeFrom(this.f6154a, this.f6155b).build();
            } catch (u1 unused) {
            }
            setValue(r2VarBuild);
        } else {
            if (this.f6156c == null || z1Var.f6156c != null) {
                setValue(this.f6156c.toBuilder().mergeFrom(z1Var.f6156c).build());
                return;
            }
            r2 r2VarBuild2 = this.f6156c;
            try {
                r2VarBuild2 = r2VarBuild2.toBuilder().mergeFrom(z1Var.f6154a, z1Var.f6155b).build();
            } catch (u1 unused2) {
            }
            setValue(r2VarBuild2);
        }
    }

    public void mergeFrom(c0 c0Var, s0 s0Var) throws IOException {
        if (containsDefaultInstance()) {
            setByteString(c0Var.readBytes(), s0Var);
            return;
        }
        if (this.f6155b == null) {
            this.f6155b = s0Var;
        }
        x xVar = this.f6154a;
        if (xVar != null) {
            setByteString(xVar.concat(c0Var.readBytes()), this.f6155b);
        } else {
            try {
                setValue(this.f6156c.toBuilder().mergeFrom(c0Var, s0Var).build());
            } catch (u1 unused) {
            }
        }
    }

    public void set(z1 z1Var) {
        this.f6154a = z1Var.f6154a;
        this.f6156c = z1Var.f6156c;
        this.f6157d = z1Var.f6157d;
        s0 s0Var = z1Var.f6155b;
        if (s0Var != null) {
            this.f6155b = s0Var;
        }
    }

    public void setByteString(x xVar, s0 s0Var) {
        if (s0Var == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (xVar == null) {
            throw new NullPointerException("found null ByteString");
        }
        this.f6154a = xVar;
        this.f6155b = s0Var;
        this.f6156c = null;
        this.f6157d = null;
    }

    public r2 setValue(r2 r2Var) {
        r2 r2Var2 = this.f6156c;
        this.f6154a = null;
        this.f6157d = null;
        this.f6156c = r2Var;
        return r2Var2;
    }

    public x toByteString() {
        if (this.f6157d != null) {
            return this.f6157d;
        }
        x xVar = this.f6154a;
        if (xVar != null) {
            return xVar;
        }
        synchronized (this) {
            try {
                if (this.f6157d != null) {
                    return this.f6157d;
                }
                if (this.f6156c == null) {
                    this.f6157d = x.f6099c;
                } else {
                    this.f6157d = this.f6156c.toByteString();
                }
                return this.f6157d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public z1() {
    }
}
