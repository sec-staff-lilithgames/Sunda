package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.b;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e1 extends b.a {

    /* renamed from: b, reason: collision with root package name */
    public final f1 f5860b;

    /* renamed from: c, reason: collision with root package name */
    public f1 f5861c;

    public e1(f1 f1Var) {
        this.f5860b = f1Var;
        if (f1Var.j()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f5861c = f1Var.l();
    }

    @Override // androidx.datastore.preferences.protobuf.b.a
    public final e1 b(b bVar) {
        return mergeFrom((f1) bVar);
    }

    public final void c() {
        if (this.f5861c.j()) {
            return;
        }
        f1 f1VarL = this.f5860b.l();
        d3.getInstance().schemaFor((d3) f1VarL).mergeFrom(f1VarL, this.f5861c);
        this.f5861c = f1VarL;
    }

    @Override // androidx.datastore.preferences.protobuf.b.a, androidx.datastore.preferences.protobuf.q2, androidx.datastore.preferences.protobuf.s2
    public final boolean isInitialized() {
        return f1.i(this.f5861c, false);
    }

    @Override // androidx.datastore.preferences.protobuf.b.a, androidx.datastore.preferences.protobuf.q2
    public final f1 build() {
        f1 f1VarBuildPartial = buildPartial();
        if (f1VarBuildPartial.isInitialized()) {
            return f1VarBuildPartial;
        }
        throw new a4(f1VarBuildPartial);
    }

    @Override // androidx.datastore.preferences.protobuf.b.a, androidx.datastore.preferences.protobuf.q2
    public f1 buildPartial() {
        if (!this.f5861c.j()) {
            return this.f5861c;
        }
        f1 f1Var = this.f5861c;
        f1Var.getClass();
        d3.getInstance().schemaFor((d3) f1Var).makeImmutable(f1Var);
        f1Var.k();
        return this.f5861c;
    }

    @Override // androidx.datastore.preferences.protobuf.b.a, androidx.datastore.preferences.protobuf.q2
    public final e1 clear() {
        f1 f1Var = this.f5860b;
        if (f1Var.j()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f5861c = f1Var.l();
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.b.a, androidx.datastore.preferences.protobuf.q2, androidx.datastore.preferences.protobuf.s2
    public f1 getDefaultInstanceForType() {
        return this.f5860b;
    }

    @Override // androidx.datastore.preferences.protobuf.b.a
    /* renamed from: clone */
    public e1 mo70clone() {
        e1 e1VarNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
        e1VarNewBuilderForType.f5861c = buildPartial();
        return e1VarNewBuilderForType;
    }

    public e1 mergeFrom(f1 f1Var) {
        if (getDefaultInstanceForType().equals(f1Var)) {
            return this;
        }
        c();
        f1 f1Var2 = this.f5861c;
        d3.getInstance().schemaFor((d3) f1Var2).mergeFrom(f1Var2, f1Var);
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.b.a, androidx.datastore.preferences.protobuf.q2
    public e1 mergeFrom(byte[] bArr, int i10, int i11, s0 s0Var) throws u1 {
        c();
        try {
            d3.getInstance().schemaFor((d3) this.f5861c).mergeFrom(this.f5861c, bArr, i10, i10 + i11, new f(s0Var));
            return this;
        } catch (u1 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw u1.h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.b.a, androidx.datastore.preferences.protobuf.q2
    public e1 mergeFrom(byte[] bArr, int i10, int i11) throws u1 {
        return mergeFrom(bArr, i10, i11, s0.getEmptyRegistry());
    }

    @Override // androidx.datastore.preferences.protobuf.b.a, androidx.datastore.preferences.protobuf.q2
    public e1 mergeFrom(c0 c0Var, s0 s0Var) throws IOException {
        c();
        try {
            d3.getInstance().schemaFor((d3) this.f5861c).mergeFrom(this.f5861c, d0.forCodedInput(c0Var), s0Var);
            return this;
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof IOException) {
                throw ((IOException) e10.getCause());
            }
            throw e10;
        }
    }
}
