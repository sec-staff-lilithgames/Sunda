package jc;

import com.ironsource.C3161ca;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k0 implements ub.q0, Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final ic.v f69338i = new ic.v();

    /* renamed from: b, reason: collision with root package name */
    public final s0 f69339b;

    /* renamed from: c, reason: collision with root package name */
    public final zc.l f69340c;

    /* renamed from: e, reason: collision with root package name */
    public final zc.s f69341e;

    /* renamed from: f, reason: collision with root package name */
    public final ub.k f69342f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f69343g;

    /* renamed from: h, reason: collision with root package name */
    public final j0 f69344h;

    public k0(f0 f0Var, s0 s0Var, o oVar, ub.b0 b0Var) {
        this.f69339b = s0Var;
        this.f69340c = f0Var.f69286k;
        this.f69341e = f0Var.f69287l;
        this.f69342f = f0Var.f69278b;
        this.f69343g = b0Var == null ? i0.f69307f : new i0(b0Var, null, null, null);
        j0 j0Var = j0.f69321f;
        if (oVar == null) {
            this.f69344h = j0Var;
        } else if (oVar.hasRawClass(Object.class)) {
            this.f69344h = j0Var.forRootType(this, oVar);
        } else {
            this.f69344h = j0Var.forRootType(this, oVar.withStaticTyping());
        }
    }

    public final void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(a.b.l("argument \"", str, "\" is null"));
        }
    }

    public void acceptJsonFormatVisitor(o oVar, uc.h hVar) throws r {
        a(oVar, "type");
        a(hVar, "visitor");
        f().acceptJsonFormatVisitor(oVar, hVar);
    }

    public final void b(ub.o oVar) {
        this.f69339b.initialize(oVar);
        this.f69343g.initialize(oVar);
    }

    public final k0 c(i0 i0Var, j0 j0Var) {
        return (this.f69343g == i0Var && this.f69344h == j0Var) ? this : new k0(this, this.f69339b, i0Var, j0Var);
    }

    @Deprecated
    public boolean canSerialize(Class<?> cls) {
        a(cls, "type");
        return f().hasSerializerFor(cls, null);
    }

    public ub.o createGenerator(OutputStream outputStream) throws IOException {
        a(outputStream, "out");
        ub.o oVarCreateGenerator = this.f69342f.createGenerator(outputStream, ub.i.f88232f);
        b(oVarCreateGenerator);
        return oVarCreateGenerator;
    }

    public final k0 d(k0 k0Var, s0 s0Var) {
        return s0Var == this.f69339b ? this : new k0(k0Var, s0Var);
    }

    public final r0 e(boolean z10, ub.o oVar, boolean z11) {
        zc.l lVarF = f();
        b(oVar);
        return new r0(lVarF, oVar, z11, this.f69344h).init(z10);
    }

    public final zc.l f() {
        return this.f69340c.createInstance(this.f69339b, this.f69341e);
    }

    public k0 forType(o oVar) {
        return c(this.f69343g, this.f69344h.forRootType(this, oVar));
    }

    public final void g(ub.o oVar, Object obj) throws IOException {
        boolean zIsEnabled = this.f69339b.isEnabled(t0.CLOSE_CLOSEABLE);
        j0 j0Var = this.f69344h;
        if (!zIsEnabled || !(obj instanceof Closeable)) {
            try {
                j0Var.serialize(oVar, obj, f());
                oVar.close();
                return;
            } catch (Exception e10) {
                dd.i.closeOnFailAndThrowAsIOE(oVar, e10);
                return;
            }
        }
        Closeable closeable = (Closeable) obj;
        try {
            j0Var.serialize(oVar, obj, f());
        } catch (Exception e11) {
            e = e11;
        }
        try {
            closeable.close();
            oVar.close();
        } catch (Exception e12) {
            e = e12;
            closeable = null;
            dd.i.closeOnFailAndThrowAsIOE(oVar, closeable, e);
        }
    }

    public lc.n getAttributes() {
        return this.f69339b.getAttributes();
    }

    public s0 getConfig() {
        return this.f69339b;
    }

    public ub.k getFactory() {
        return this.f69342f;
    }

    public cd.s getTypeFactory() {
        return this.f69339b.getTypeFactory();
    }

    public boolean hasPrefetchedSerializer() {
        return this.f69344h.hasSerializer();
    }

    public boolean isEnabled(t0 t0Var) {
        return this.f69339b.isEnabled(t0Var);
    }

    @Override // ub.q0
    public ub.p0 version() {
        return lc.d0.f73093b;
    }

    public k0 with(t0 t0Var) {
        return d(this, this.f69339b.with(t0Var));
    }

    public k0 withAttribute(Object obj, Object obj2) {
        return d(this, (s0) this.f69339b.withAttribute(obj, obj2));
    }

    public k0 withAttributes(Map<?, ?> map) {
        return d(this, (s0) this.f69339b.withAttributes(map));
    }

    public k0 withDefaultPrettyPrinter() {
        return with(this.f69339b.getDefaultPrettyPrinter());
    }

    public k0 withFeatures(t0... t0VarArr) {
        return d(this, this.f69339b.withFeatures(t0VarArr));
    }

    public k0 withRootName(String str) {
        return d(this, (s0) this.f69339b.withRootName(str));
    }

    public k0 withRootValueSeparator(String str) {
        return c(this.f69343g.withRootValueSeparator(str), this.f69344h);
    }

    @Deprecated
    public k0 withSchema(ub.g gVar) {
        return with(gVar);
    }

    @Deprecated
    public k0 withType(o oVar) {
        return forType(oVar);
    }

    public k0 withView(Class<?> cls) {
        return d(this, this.f69339b.withView(cls));
    }

    public k0 without(t0 t0Var) {
        return d(this, this.f69339b.without(t0Var));
    }

    public k0 withoutAttribute(Object obj) {
        return d(this, (s0) this.f69339b.withoutAttribute(obj));
    }

    public k0 withoutFeatures(t0... t0VarArr) {
        return d(this, this.f69339b.withoutFeatures(t0VarArr));
    }

    public k0 withoutRootName() {
        return d(this, this.f69339b.withRootName(n0.f69382g));
    }

    public void writeValue(ub.o oVar, Object obj) throws IOException {
        a(oVar, "g");
        b(oVar);
        t0 t0Var = t0.CLOSE_CLOSEABLE;
        s0 s0Var = this.f69339b;
        boolean zIsEnabled = s0Var.isEnabled(t0Var);
        j0 j0Var = this.f69344h;
        if (!zIsEnabled || !(obj instanceof Closeable)) {
            j0Var.serialize(oVar, obj, f());
            if (s0Var.isEnabled(t0.FLUSH_AFTER_WRITE_VALUE)) {
                oVar.flush();
                return;
            }
            return;
        }
        Closeable closeable = (Closeable) obj;
        try {
            j0Var.serialize(oVar, obj, f());
            if (s0Var.isEnabled(t0.FLUSH_AFTER_WRITE_VALUE)) {
                oVar.flush();
            }
            closeable.close();
        } catch (Exception e10) {
            dd.i.closeOnFailAndThrowAsIOE(null, closeable, e10);
        }
    }

    public byte[] writeValueAsBytes(Object obj) throws ub.x {
        ic.b bVar_getBufferRecycler = this.f69342f._getBufferRecycler();
        try {
            try {
                ic.d dVar = new ic.d(bVar_getBufferRecycler);
                try {
                    g(createGenerator(dVar, ub.i.f88232f), obj);
                    byte[] clearAndRelease = dVar.getClearAndRelease();
                    dVar.close();
                    return clearAndRelease;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        try {
                            dVar.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            } catch (ub.x e10) {
                throw e10;
            } catch (IOException e11) {
                throw r.fromUnexpectedIOE(e11);
            }
        } finally {
            bVar_getBufferRecycler.releaseToPool();
        }
    }

    public String writeValueAsString(Object obj) throws ub.x {
        ic.b bVar_getBufferRecycler = this.f69342f._getBufferRecycler();
        try {
            try {
                cc.p pVar = new cc.p(bVar_getBufferRecycler);
                try {
                    g(createGenerator(pVar), obj);
                    String andClear = pVar.getAndClear();
                    pVar.close();
                    return andClear;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        try {
                            pVar.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            } catch (ub.x e10) {
                throw e10;
            } catch (IOException e11) {
                throw r.fromUnexpectedIOE(e11);
            }
        } finally {
            bVar_getBufferRecycler.releaseToPool();
        }
    }

    public r0 writeValues(File file) throws IOException {
        return e(false, createGenerator(file, ub.i.f88232f), true);
    }

    public r0 writeValuesAsArray(File file) throws IOException {
        return e(true, createGenerator(file, ub.i.f88232f), true);
    }

    public k0 forType(Class<?> cls) {
        return forType(this.f69339b.constructType(cls));
    }

    public boolean isEnabled(y yVar) {
        return this.f69339b.isEnabled(yVar);
    }

    public k0 with(t0 t0Var, t0... t0VarArr) {
        return d(this, this.f69339b.with(t0Var, t0VarArr));
    }

    public k0 withFeatures(lc.o... oVarArr) {
        return d(this, (s0) this.f69339b.withFeatures(oVarArr));
    }

    public k0 withRootName(n0 n0Var) {
        return d(this, this.f69339b.withRootName(n0Var));
    }

    public k0 withRootValueSeparator(ub.c0 c0Var) {
        return c(this.f69343g.withRootValueSeparator(c0Var), this.f69344h);
    }

    @Deprecated
    public k0 withType(Class<?> cls) {
        return forType(cls);
    }

    public k0 without(t0 t0Var, t0... t0VarArr) {
        return d(this, this.f69339b.without(t0Var, t0VarArr));
    }

    public k0 withoutFeatures(lc.o... oVarArr) {
        return d(this, (s0) this.f69339b.withoutFeatures(oVarArr));
    }

    public r0 writeValues(ub.o oVar) throws IOException {
        a(oVar, "g");
        b(oVar);
        return e(false, oVar, false);
    }

    public r0 writeValuesAsArray(ub.o oVar) throws IOException {
        a(oVar, C3161ca.f36142n);
        return e(true, oVar, false);
    }

    @Deprecated
    public boolean canSerialize(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        a(cls, "type");
        return f().hasSerializerFor(cls, atomicReference);
    }

    public ub.o createGenerator(OutputStream outputStream, ub.i iVar) throws IOException {
        a(outputStream, "out");
        ub.o oVarCreateGenerator = this.f69342f.createGenerator(outputStream, iVar);
        b(oVarCreateGenerator);
        return oVarCreateGenerator;
    }

    public k0 forType(hc.b bVar) {
        this.f69339b.getTypeFactory();
        throw null;
    }

    public boolean isEnabled(lc.o oVar) {
        return this.f69339b.isEnabled(oVar);
    }

    public k0 with(lc.o oVar) {
        return d(this, (s0) this.f69339b.with(oVar));
    }

    public k0 withFeatures(ub.n... nVarArr) {
        return d(this, this.f69339b.withFeatures(nVarArr));
    }

    @Deprecated
    public k0 withType(hc.b bVar) {
        return forType(bVar);
    }

    public k0 without(lc.o oVar) {
        return d(this, (s0) this.f69339b.without(oVar));
    }

    public k0 withoutFeatures(ub.n... nVarArr) {
        return d(this, this.f69339b.withoutFeatures(nVarArr));
    }

    public void acceptJsonFormatVisitor(Class<?> cls, uc.h hVar) throws r {
        a(cls, "type");
        a(hVar, "visitor");
        acceptJsonFormatVisitor(this.f69339b.constructType(cls), hVar);
    }

    @Deprecated
    public boolean isEnabled(ub.r rVar) {
        return this.f69342f.isEnabled(rVar);
    }

    public k0 with(ub.n nVar) {
        return d(this, this.f69339b.with(nVar));
    }

    public k0 withFeatures(ub.f... fVarArr) {
        return d(this, this.f69339b.withFeatures(fVarArr));
    }

    public k0 without(ub.n nVar) {
        return d(this, this.f69339b.without(nVar));
    }

    public k0 withoutFeatures(ub.f... fVarArr) {
        return d(this, this.f69339b.withoutFeatures(fVarArr));
    }

    public r0 writeValues(Writer writer) throws IOException {
        return e(false, createGenerator(writer), true);
    }

    public r0 writeValuesAsArray(Writer writer) throws IOException {
        return e(true, createGenerator(writer), true);
    }

    public ub.o createGenerator(Writer writer) throws IOException {
        a(writer, "w");
        ub.o oVarCreateGenerator = this.f69342f.createGenerator(writer);
        b(oVarCreateGenerator);
        return oVarCreateGenerator;
    }

    public boolean isEnabled(ub.n nVar) {
        return this.f69342f.isEnabled(nVar);
    }

    public k0 with(ub.k0 k0Var) {
        return d(this, this.f69339b.with(k0Var.mappedFeature()));
    }

    public k0 without(ub.k0 k0Var) {
        return d(this, this.f69339b.without(k0Var.mappedFeature()));
    }

    public r0 writeValues(OutputStream outputStream) throws IOException {
        return e(false, createGenerator(outputStream, ub.i.f88232f), true);
    }

    public r0 writeValuesAsArray(OutputStream outputStream) throws IOException {
        return e(true, createGenerator(outputStream, ub.i.f88232f), true);
    }

    public boolean isEnabled(ub.k0 k0Var) {
        return this.f69342f.isEnabled(k0Var);
    }

    public k0 with(ub.f fVar) {
        return d(this, this.f69339b.with(fVar));
    }

    public k0 without(ub.f fVar) {
        return d(this, this.f69339b.without(fVar));
    }

    public r0 writeValues(DataOutput dataOutput) throws IOException {
        return e(false, createGenerator(dataOutput), true);
    }

    public r0 writeValuesAsArray(DataOutput dataOutput) throws IOException {
        return e(true, createGenerator(dataOutput), true);
    }

    public ub.o createGenerator(File file, ub.i iVar) throws IOException {
        a(file, "outputFile");
        ub.o oVarCreateGenerator = this.f69342f.createGenerator(file, iVar);
        b(oVarCreateGenerator);
        return oVarCreateGenerator;
    }

    public k0 with(DateFormat dateFormat) {
        return d(this, this.f69339b.with(dateFormat));
    }

    public k0 with(zc.m mVar) {
        s0 s0Var = this.f69339b;
        return mVar == s0Var.getFilterProvider() ? this : d(this, s0Var.withFilters(mVar));
    }

    public ub.o createGenerator(DataOutput dataOutput) throws IOException {
        a(dataOutput, "out");
        ub.o oVarCreateGenerator = this.f69342f.createGenerator(dataOutput);
        b(oVarCreateGenerator);
        return oVarCreateGenerator;
    }

    public k0 with(ub.b0 b0Var) {
        return c(this.f69343g.with(b0Var), this.f69344h);
    }

    public k0 with(Locale locale) {
        return d(this, (s0) this.f69339b.with(locale));
    }

    public k0(f0 f0Var, s0 s0Var) {
        this.f69339b = s0Var;
        this.f69340c = f0Var.f69286k;
        this.f69341e = f0Var.f69287l;
        this.f69342f = f0Var.f69278b;
        this.f69343g = i0.f69307f;
        this.f69344h = j0.f69321f;
    }

    public k0 with(TimeZone timeZone) {
        return d(this, (s0) this.f69339b.with(timeZone));
    }

    public k0 with(ub.b bVar) {
        return d(this, (s0) this.f69339b.with(bVar));
    }

    public void writeValue(File file, Object obj) throws IOException {
        g(createGenerator(file, ub.i.f88232f), obj);
    }

    public k0 with(cc.e eVar) {
        return c(this.f69343g.with(eVar), this.f69344h);
    }

    public void writeValue(OutputStream outputStream, Object obj) throws IOException {
        g(createGenerator(outputStream, ub.i.f88232f), obj);
    }

    public k0 with(ub.k kVar) {
        return kVar == this.f69342f ? this : new k0(this, kVar);
    }

    public void writeValue(Writer writer, Object obj) throws IOException {
        g(createGenerator(writer), obj);
    }

    public void writeValue(DataOutput dataOutput, Object obj) throws IOException {
        g(createGenerator(dataOutput), obj);
    }

    public k0 with(lc.n nVar) {
        return d(this, this.f69339b.with(nVar));
    }

    public k0 with(ub.g gVar) {
        if (gVar != null) {
            ub.k kVar = this.f69342f;
            if (!kVar.canUseSchema(gVar)) {
                throw new IllegalArgumentException("Cannot use FormatSchema of type " + gVar.getClass().getName() + " for format " + kVar.getFormatName());
            }
        }
        return c(this.f69343g.with(gVar), this.f69344h);
    }

    public k0(f0 f0Var, s0 s0Var, int i10) {
        this.f69339b = s0Var;
        this.f69340c = f0Var.f69286k;
        this.f69341e = f0Var.f69287l;
        this.f69342f = f0Var.f69278b;
        this.f69343g = i0.f69307f;
        this.f69344h = j0.f69321f;
    }

    public k0(k0 k0Var, s0 s0Var, i0 i0Var, j0 j0Var) {
        this.f69339b = s0Var;
        this.f69340c = k0Var.f69340c;
        this.f69341e = k0Var.f69341e;
        this.f69342f = k0Var.f69342f;
        this.f69343g = i0Var;
        this.f69344h = j0Var;
    }

    public k0(k0 k0Var, s0 s0Var) {
        this.f69339b = s0Var;
        this.f69340c = k0Var.f69340c;
        this.f69341e = k0Var.f69341e;
        this.f69342f = k0Var.f69342f;
        this.f69343g = k0Var.f69343g;
        this.f69344h = k0Var.f69344h;
    }

    public k0(k0 k0Var, ub.k kVar) {
        this.f69339b = (s0) k0Var.f69339b.with(y.SORT_PROPERTIES_ALPHABETICALLY, kVar.requiresPropertyOrdering());
        this.f69340c = k0Var.f69340c;
        this.f69341e = k0Var.f69341e;
        this.f69342f = kVar;
        this.f69343g = k0Var.f69343g;
        this.f69344h = k0Var.f69344h;
    }
}
