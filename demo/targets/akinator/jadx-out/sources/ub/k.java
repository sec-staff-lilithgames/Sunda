package ub;

import com.ironsource.C3191e4;
import java.io.CharArrayReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class k extends m0 implements Serializable {

    /* renamed from: t, reason: collision with root package name */
    public static final int f88250t = j.collectDefaults();

    /* renamed from: u, reason: collision with root package name */
    public static final int f88251u = r.collectDefaults();

    /* renamed from: v, reason: collision with root package name */
    public static final int f88252v = n.collectDefaults();

    /* renamed from: w, reason: collision with root package name */
    public static final cc.q f88253w = new cc.q(" ");

    /* renamed from: b, reason: collision with root package name */
    public transient gc.e f88254b;

    /* renamed from: c, reason: collision with root package name */
    public final transient gc.b f88255c;

    /* renamed from: e, reason: collision with root package name */
    public int f88256e;

    /* renamed from: f, reason: collision with root package name */
    public int f88257f;

    /* renamed from: g, reason: collision with root package name */
    public int f88258g;

    /* renamed from: h, reason: collision with root package name */
    public ic.f0 f88259h;

    /* renamed from: i, reason: collision with root package name */
    public a0 f88260i;

    /* renamed from: j, reason: collision with root package name */
    public cc.e f88261j;

    /* renamed from: k, reason: collision with root package name */
    public f0 f88262k;

    /* renamed from: l, reason: collision with root package name */
    public e f88263l;

    /* renamed from: m, reason: collision with root package name */
    public j0 f88264m;

    /* renamed from: n, reason: collision with root package name */
    public cc.i f88265n;

    /* renamed from: o, reason: collision with root package name */
    public cc.o f88266o;

    /* renamed from: p, reason: collision with root package name */
    public final List f88267p;

    /* renamed from: q, reason: collision with root package name */
    public c0 f88268q;

    /* renamed from: r, reason: collision with root package name */
    public final int f88269r;

    /* renamed from: s, reason: collision with root package name */
    public final char f88270s;

    public k() {
        this((a0) null);
    }

    public static l0 builder() {
        return new l();
    }

    public ic.b _getBufferRecycler() {
        return (ic.b) _getRecyclerPool().acquireAndLinkPooled();
    }

    public ic.f0 _getRecyclerPool() {
        return !j.f88245f.enabledIn(this.f88256e) ? ic.u.nonRecyclingPool() : this.f88259h;
    }

    public final void a(Class cls) {
        if (getClass() == cls) {
            return;
        }
        throw new IllegalStateException("Failed copy(): " + getClass().getName() + " (version: " + version() + ") does not override copy(); it has to");
    }

    public final cc.f b(Object obj) {
        return cc.f.construct(!canHandleBinaryNatively(), obj, this.f88263l);
    }

    public final cc.h c(cc.f fVar, boolean z10) {
        ic.b bVarBufferRecycler = null;
        boolean z11 = false;
        if (fVar == null) {
            fVar = cc.f.unknown();
        } else {
            Object rawContent = fVar.getRawContent();
            if ((rawContent instanceof ic.a) && (bVarBufferRecycler = ((ic.a) rawContent).bufferRecycler()) != null) {
                z11 = true;
            }
        }
        cc.f fVar2 = fVar;
        if (bVarBufferRecycler == null) {
            bVarBufferRecycler = _getBufferRecycler();
        }
        cc.h hVar = new cc.h(this.f88262k, this.f88264m, this.f88263l, bVarBufferRecycler, fVar2, z10);
        if (z11) {
            hVar.markBufferRecyclerReleased();
        }
        return hVar;
    }

    @Override // ub.m0
    public boolean canHandleBinaryNatively() {
        return false;
    }

    @Override // ub.m0
    public boolean canParseAsync() {
        return getFormatName() == "JSON";
    }

    public boolean canUseCharArrays() {
        return true;
    }

    @Override // ub.m0
    public boolean canUseSchema(g gVar) {
        String formatName;
        return (gVar == null || (formatName = getFormatName()) == null || !formatName.equals(gVar.a())) ? false : true;
    }

    @Deprecated
    public final k configure(j jVar, boolean z10) {
        return z10 ? enable(jVar) : disable(jVar);
    }

    public k copy() {
        a(k.class);
        return new k(this, null);
    }

    @Override // ub.m0
    public o createGenerator(DataOutput dataOutput) throws IOException {
        return createGenerator(new cc.g(dataOutput), i.f88232f);
    }

    @Deprecated
    public o createJsonGenerator(OutputStream outputStream, i iVar) throws IOException {
        return createGenerator(outputStream, iVar);
    }

    @Deprecated
    public u createJsonParser(File file) throws IOException {
        return createParser(file);
    }

    @Override // ub.m0
    public u createNonBlockingByteArrayParser() throws IOException {
        g("Non-blocking source not (yet?) supported for this format (%s)");
        return new fc.b(new cc.h(this.f88262k, this.f88264m, this.f88263l, _getBufferRecycler(), b(null), false), this.f88257f, this.f88255c.makeChildOrPlaceholder(this.f88256e));
    }

    @Override // ub.m0
    public u createNonBlockingByteBufferParser() throws IOException {
        g("Non-blocking source not (yet?) supported for this format (%s)");
        return new fc.a(new cc.h(this.f88262k, this.f88264m, this.f88263l, _getBufferRecycler(), b(null), false), this.f88257f, this.f88255c.makeChildOrPlaceholder(this.f88256e));
    }

    @Override // ub.m0
    public u createParser(byte[] bArr, int i10, int i11) throws IOException {
        InputStream inputStreamDecorate;
        if (bArr == null) {
            throw new IllegalArgumentException("Invalid `byte[]` argument: `null`");
        }
        int length = bArr.length;
        int i12 = i10 + i11;
        if (((length - i12) | i10 | i11 | i12) < 0) {
            throw new IllegalArgumentException(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `byte[]` of length %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(length)));
        }
        cc.h hVarC = c(cc.f.construct(!canHandleBinaryNatively(), bArr, i10, i11, this.f88263l), true);
        cc.i iVar = this.f88265n;
        return (iVar == null || (inputStreamDecorate = iVar.decorate(hVarC, bArr, i10, i11)) == null) ? new ec.a(hVarC, bArr, i10, i11).constructParser(this.f88257f, this.f88260i, this.f88255c, this.f88254b, this.f88256e) : e(hVarC, inputStreamDecorate);
    }

    public final ec.n d(cc.h hVar, Writer writer) {
        ec.n nVar = new ec.n(hVar, this.f88258g, this.f88260i, writer, this.f88270s);
        int i10 = this.f88269r;
        if (i10 > 0) {
            nVar.setHighestNonEscapedChar(i10);
        }
        cc.e eVar = this.f88261j;
        if (eVar != null) {
            nVar.setCharacterEscapes(eVar);
        }
        c0 c0Var = this.f88268q;
        if (c0Var != f88253w) {
            nVar.setRootValueSeparator(c0Var);
        }
        List list = this.f88267p;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw a.b.c(it);
            }
        }
        return nVar;
    }

    @Deprecated
    public k disable(j jVar) {
        this.f88256e = (~jVar.getMask()) & this.f88256e;
        return this;
    }

    public final u e(cc.h hVar, InputStream inputStream) throws IOException {
        try {
            return new ec.a(hVar, inputStream).constructParser(this.f88257f, this.f88260i, this.f88255c, this.f88254b, this.f88256e);
        } catch (IOException | RuntimeException e10) {
            if (hVar.isResourceManaged()) {
                try {
                    inputStream.close();
                } catch (Exception e11) {
                    e10.addSuppressed(e11);
                }
            }
            hVar.close();
            throw e10;
        }
    }

    @Deprecated
    public k enable(j jVar) {
        this.f88256e = jVar.getMask() | this.f88256e;
        return this;
    }

    public final ec.l f(cc.h hVar, OutputStream outputStream) {
        ec.l lVar = new ec.l(hVar, this.f88258g, this.f88260i, outputStream, this.f88270s);
        int i10 = this.f88269r;
        if (i10 > 0) {
            lVar.setHighestNonEscapedChar(i10);
        }
        cc.e eVar = this.f88261j;
        if (eVar != null) {
            lVar.setCharacterEscapes(eVar);
        }
        c0 c0Var = this.f88268q;
        if (c0Var != f88253w) {
            lVar.setRootValueSeparator(c0Var);
        }
        List list = this.f88267p;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw a.b.c(it);
            }
        }
        return lVar;
    }

    public final void g(String str) {
        if (getFormatName() != "JSON") {
            throw new UnsupportedOperationException(String.format(str, getFormatName()));
        }
    }

    public cc.e getCharacterEscapes() {
        return this.f88261j;
    }

    public a0 getCodec() {
        return this.f88260i;
    }

    @Override // ub.m0
    public final int getFactoryFeatures() {
        return this.f88256e;
    }

    @Override // ub.m0
    public int getFormatGeneratorFeatures() {
        return 0;
    }

    @Override // ub.m0
    public String getFormatName() {
        if (getClass() == k.class) {
            return "JSON";
        }
        return null;
    }

    @Override // ub.m0
    public int getFormatParserFeatures() {
        return 0;
    }

    @Override // ub.m0
    public Class<? extends f> getFormatReadFeatureType() {
        return null;
    }

    @Override // ub.m0
    public Class<? extends f> getFormatWriteFeatureType() {
        return null;
    }

    @Override // ub.m0
    public final int getGeneratorFeatures() {
        return this.f88258g;
    }

    public cc.i getInputDecorator() {
        return this.f88265n;
    }

    public cc.o getOutputDecorator() {
        return this.f88266o;
    }

    @Override // ub.m0
    public final int getParserFeatures() {
        return this.f88257f;
    }

    public String getRootValueSeparator() {
        c0 c0Var = this.f88268q;
        if (c0Var == null) {
            return null;
        }
        return c0Var.getValue();
    }

    public zb.d hasFormat(zb.c cVar) throws IOException {
        if (getClass() == k.class) {
            return ec.a.hasJSONFormat(cVar);
        }
        return null;
    }

    @Override // ub.m0
    public final boolean isEnabled(j jVar) {
        return (jVar.getMask() & this.f88256e) != 0;
    }

    public l0 rebuild() {
        g("Factory implementation for format (%s) MUST override `rebuild()` method");
        return new l(this);
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    @Override // ub.m0
    public boolean requiresPropertyOrdering() {
        return false;
    }

    public k setCharacterEscapes(cc.e eVar) {
        this.f88261j = eVar;
        return this;
    }

    public k setCodec(a0 a0Var) {
        this.f88260i = a0Var;
        return this;
    }

    public k setErrorReportConfiguration(e eVar) {
        Objects.requireNonNull(eVar, "Cannot pass null ErrorReportConfiguration");
        this.f88263l = eVar;
        return this;
    }

    @Deprecated
    public k setInputDecorator(cc.i iVar) {
        this.f88265n = iVar;
        return this;
    }

    @Deprecated
    public k setOutputDecorator(cc.o oVar) {
        this.f88266o = oVar;
        return this;
    }

    public k setRecyclerPool(ic.f0 f0Var) {
        Objects.requireNonNull(f0Var);
        this.f88259h = f0Var;
        return this;
    }

    public k setRootValueSeparator(String str) {
        this.f88268q = str == null ? null : new cc.q(str);
        return this;
    }

    public k setStreamReadConstraints(f0 f0Var) {
        int maxNameLength = this.f88262k.getMaxNameLength();
        Objects.requireNonNull(f0Var);
        this.f88262k = f0Var;
        if (f0Var.getMaxNameLength() != maxNameLength) {
            this.f88254b = gc.e.createRoot(this);
        }
        return this;
    }

    public k setStreamWriteConstraints(j0 j0Var) {
        Objects.requireNonNull(j0Var);
        this.f88264m = j0Var;
        return this;
    }

    @Override // ub.m0
    public f0 streamReadConstraints() {
        return this.f88262k;
    }

    @Override // ub.m0
    public j0 streamWriteConstraints() {
        return this.f88264m;
    }

    @Override // ub.m0, ub.q0
    public p0 version() {
        return ec.i.f54057b;
    }

    public k(a0 a0Var) {
        this.f88255c = gc.b.createRoot();
        this.f88256e = f88250t;
        this.f88257f = f88251u;
        this.f88258g = f88252v;
        this.f88268q = f88253w;
        this.f88259h = ic.u.defaultPool();
        this.f88260i = a0Var;
        this.f88270s = AbstractJsonLexerKt.STRING;
        this.f88262k = f0.defaults();
        this.f88264m = j0.defaults();
        this.f88263l = e.defaults();
        this.f88267p = null;
        this.f88254b = gc.e.createRoot(this);
    }

    public final k configure(r rVar, boolean z10) {
        return z10 ? enable(rVar) : disable(rVar);
    }

    @Deprecated
    public o createJsonGenerator(Writer writer) throws IOException {
        return createGenerator(writer);
    }

    @Deprecated
    public u createJsonParser(URL url) throws IOException {
        return createParser(url);
    }

    public k disable(r rVar) {
        this.f88257f = (~rVar.getMask()) & this.f88257f;
        return this;
    }

    public k enable(r rVar) {
        this.f88257f = rVar.getMask() | this.f88257f;
        return this;
    }

    @Override // ub.m0
    public final boolean isEnabled(r rVar) {
        return (rVar.getMask() & this.f88257f) != 0;
    }

    public final k configure(n nVar, boolean z10) {
        return z10 ? enable(nVar) : disable(nVar);
    }

    @Override // ub.m0
    public o createGenerator(DataOutput dataOutput, i iVar) throws IOException {
        return createGenerator(new cc.g(dataOutput), iVar);
    }

    @Deprecated
    public o createJsonGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, i.f88232f);
    }

    @Deprecated
    public u createJsonParser(InputStream inputStream) throws IOException {
        return createParser(inputStream);
    }

    public k disable(n nVar) {
        this.f88258g = (~nVar.getMask()) & this.f88258g;
        return this;
    }

    public k enable(n nVar) {
        this.f88258g = nVar.getMask() | this.f88258g;
        return this;
    }

    @Override // ub.m0
    public final boolean isEnabled(g0 g0Var) {
        return (g0Var.mappedFeature().getMask() & this.f88257f) != 0;
    }

    @Deprecated
    public u createJsonParser(Reader reader) throws IOException {
        return createParser(reader);
    }

    @Override // ub.m0
    public final boolean isEnabled(n nVar) {
        return (nVar.getMask() & this.f88258g) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ub.k] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.OutputStream] */
    @Override // ub.m0
    public o createGenerator(File file, i iVar) throws IOException {
        Writer outputStreamWriter;
        Writer writerDecorate;
        ?? Decorate;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        cc.h hVarC = c(b(fileOutputStream), true);
        hVarC.setEncoding(iVar);
        i iVar2 = i.f88232f;
        if (iVar == iVar2) {
            cc.o oVar = this.f88266o;
            if (oVar != null && (Decorate = oVar.decorate(hVarC, fileOutputStream)) != 0) {
                fileOutputStream = Decorate;
            }
            return f(hVarC, fileOutputStream);
        }
        if (iVar == iVar2) {
            outputStreamWriter = new cc.s(hVarC, fileOutputStream);
        } else {
            outputStreamWriter = new OutputStreamWriter(fileOutputStream, iVar.getJavaName());
        }
        cc.o oVar2 = this.f88266o;
        if (oVar2 != null && (writerDecorate = oVar2.decorate(hVarC, outputStreamWriter)) != null) {
            outputStreamWriter = writerDecorate;
        }
        return d(hVarC, outputStreamWriter);
    }

    @Deprecated
    public u createJsonParser(byte[] bArr) throws IOException {
        return createParser(bArr);
    }

    @Override // ub.m0
    public final boolean isEnabled(k0 k0Var) {
        return (k0Var.mappedFeature().getMask() & this.f88258g) != 0;
    }

    @Deprecated
    public u createJsonParser(byte[] bArr, int i10, int i11) throws IOException {
        return createParser(bArr, i10, i11);
    }

    @Deprecated
    public u createJsonParser(String str) throws IOException {
        return createParser(str);
    }

    @Override // ub.m0
    public u createParser(char[] cArr, int i10, int i11) throws IOException {
        if (cArr != null) {
            int length = cArr.length;
            int i12 = i10 + i11;
            if ((i10 | i11 | i12 | (length - i12)) >= 0) {
                if (this.f88265n != null) {
                    return createParser(new CharArrayReader(cArr, i10, i11));
                }
                return new ec.j(c(cc.f.construct(!canHandleBinaryNatively(), cArr, i10, i11, this.f88263l), true), this.f88257f, null, this.f88260i, this.f88254b.makeChild(), cArr, i10, i12, false);
            }
            throw new IllegalArgumentException(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `char[]` of length %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(length)));
        }
        throw new IllegalArgumentException("Invalid `char[]` argument: `null`");
    }

    public k(k kVar, jc.f0 f0Var) {
        this.f88255c = gc.b.createRoot();
        this.f88256e = f88250t;
        this.f88257f = f88251u;
        this.f88258g = f88252v;
        this.f88268q = f88253w;
        this.f88259h = kVar.f88259h;
        this.f88260i = f0Var;
        this.f88256e = kVar.f88256e;
        this.f88257f = kVar.f88257f;
        this.f88258g = kVar.f88258g;
        this.f88265n = kVar.f88265n;
        this.f88266o = kVar.f88266o;
        List list = kVar.f88267p;
        this.f88267p = list != null ? new ArrayList(list) : list;
        f0 f0Var2 = kVar.f88262k;
        Objects.requireNonNull(f0Var2);
        this.f88262k = f0Var2;
        j0 j0Var = kVar.f88264m;
        Objects.requireNonNull(j0Var);
        this.f88264m = j0Var;
        e eVar = kVar.f88263l;
        Objects.requireNonNull(eVar);
        this.f88263l = eVar;
        this.f88261j = kVar.f88261j;
        this.f88268q = kVar.f88268q;
        this.f88269r = kVar.f88269r;
        this.f88270s = kVar.f88270s;
        this.f88254b = gc.e.createRoot(this);
    }

    @Override // ub.m0
    public o createGenerator(OutputStream outputStream, i iVar) throws IOException {
        Writer outputStreamWriter;
        Writer writerDecorate;
        OutputStream outputStreamDecorate;
        cc.h hVarC = c(b(outputStream), false);
        hVarC.setEncoding(iVar);
        i iVar2 = i.f88232f;
        if (iVar == iVar2) {
            cc.o oVar = this.f88266o;
            if (oVar != null && (outputStreamDecorate = oVar.decorate(hVarC, outputStream)) != null) {
                outputStream = outputStreamDecorate;
            }
            return f(hVarC, outputStream);
        }
        if (iVar == iVar2) {
            outputStreamWriter = new cc.s(hVarC, outputStream);
        } else {
            outputStreamWriter = new OutputStreamWriter(outputStream, iVar.getJavaName());
        }
        cc.o oVar2 = this.f88266o;
        if (oVar2 != null && (writerDecorate = oVar2.decorate(hVarC, outputStreamWriter)) != null) {
            outputStreamWriter = writerDecorate;
        }
        return d(hVarC, outputStreamWriter);
    }

    @Override // ub.m0
    public u createParser(File file) throws IOException {
        InputStream inputStreamDecorate;
        cc.h hVarC = c(b(file), true);
        InputStream fileInputStream = new FileInputStream(file);
        cc.i iVar = this.f88265n;
        if (iVar != null && (inputStreamDecorate = iVar.decorate(hVarC, fileInputStream)) != null) {
            fileInputStream = inputStreamDecorate;
        }
        return e(hVarC, fileInputStream);
    }

    @Override // ub.m0
    public o createGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, i.f88232f);
    }

    @Override // ub.m0
    public u createParser(URL url) throws IOException {
        InputStream inputStreamOpenStream;
        InputStream inputStreamDecorate;
        String host;
        cc.h hVarC = c(b(url), true);
        if (C3191e4.h.f36473b.equals(url.getProtocol()) && (((host = url.getHost()) == null || host.length() == 0) && url.getPath().indexOf(37) < 0)) {
            inputStreamOpenStream = new FileInputStream(url.getPath());
        } else {
            inputStreamOpenStream = url.openStream();
        }
        cc.i iVar = this.f88265n;
        if (iVar != null && (inputStreamDecorate = iVar.decorate(hVarC, inputStreamOpenStream)) != null) {
            inputStreamOpenStream = inputStreamDecorate;
        }
        return e(hVarC, inputStreamOpenStream);
    }

    @Override // ub.m0
    public o createGenerator(Writer writer) throws IOException {
        Writer writerDecorate;
        cc.h hVarC = c(b(writer), false);
        cc.o oVar = this.f88266o;
        if (oVar != null && (writerDecorate = oVar.decorate(hVarC, writer)) != null) {
            writer = writerDecorate;
        }
        return d(hVarC, writer);
    }

    @Override // ub.m0
    public u createParser(InputStream inputStream) throws IOException {
        InputStream inputStreamDecorate;
        cc.h hVarC = c(b(inputStream), false);
        cc.i iVar = this.f88265n;
        if (iVar != null && (inputStreamDecorate = iVar.decorate(hVarC, inputStream)) != null) {
            inputStream = inputStreamDecorate;
        }
        return e(hVarC, inputStream);
    }

    public k(l lVar) {
        this.f88255c = gc.b.createRoot();
        this.f88256e = f88250t;
        this.f88257f = f88251u;
        this.f88258g = f88252v;
        this.f88268q = f88253w;
        this.f88259h = lVar.f88285d;
        this.f88260i = null;
        this.f88256e = lVar.f88282a;
        this.f88257f = lVar.f88283b;
        this.f88258g = lVar.f88284c;
        this.f88265n = lVar.f88286e;
        this.f88266o = lVar.f88287f;
        List list = lVar.f88291j;
        this.f88267p = list != null ? new ArrayList(list) : list;
        f0 f0Var = lVar.f88288g;
        Objects.requireNonNull(f0Var);
        this.f88262k = f0Var;
        j0 j0Var = lVar.f88289h;
        Objects.requireNonNull(j0Var);
        this.f88264m = j0Var;
        e eVar = lVar.f88290i;
        Objects.requireNonNull(eVar);
        this.f88263l = eVar;
        this.f88261j = lVar.f88275n;
        this.f88268q = lVar.f88276o;
        this.f88269r = lVar.f88277p;
        this.f88270s = lVar.f88278q;
        this.f88254b = gc.e.createRoot(this);
    }

    @Override // ub.m0
    public u createParser(Reader reader) throws IOException {
        Reader readerDecorate;
        cc.h hVarC = c(b(reader), false);
        cc.i iVar = this.f88265n;
        return new ec.j(hVarC, this.f88257f, (iVar == null || (readerDecorate = iVar.decorate(hVarC, reader)) == null) ? reader : readerDecorate, this.f88260i, this.f88254b.makeChild());
    }

    @Override // ub.m0
    public u createParser(byte[] bArr) throws IOException {
        InputStream inputStreamDecorate;
        cc.h hVarC = c(b(bArr), true);
        cc.i iVar = this.f88265n;
        return (iVar == null || (inputStreamDecorate = iVar.decorate(hVarC, bArr, 0, bArr.length)) == null) ? new ec.a(hVarC, bArr, 0, bArr.length).constructParser(this.f88257f, this.f88260i, this.f88255c, this.f88254b, this.f88256e) : e(hVarC, inputStreamDecorate);
    }

    @Override // ub.m0
    public u createParser(String str) throws IOException {
        int length = str.length();
        if (this.f88265n == null && length <= 32768 && canUseCharArrays()) {
            cc.h hVarC = c(b(str), true);
            char[] cArrAllocTokenBuffer = hVarC.allocTokenBuffer(length);
            str.getChars(0, length, cArrAllocTokenBuffer, 0);
            return new ec.j(hVarC, this.f88257f, null, this.f88260i, this.f88254b.makeChild(), cArrAllocTokenBuffer, 0, length, true);
        }
        return createParser(new StringReader(str));
    }

    @Override // ub.m0
    public u createParser(char[] cArr) throws IOException {
        return createParser(cArr, 0, cArr.length);
    }

    @Override // ub.m0
    public u createParser(DataInput dataInput) throws IOException {
        DataInput dataInputDecorate;
        cc.h hVarC = c(b(dataInput), false);
        cc.i iVar = this.f88265n;
        DataInput dataInput2 = (iVar == null || (dataInputDecorate = iVar.decorate(hVarC, dataInput)) == null) ? dataInput : dataInputDecorate;
        g("InputData source not (yet?) supported for this format (%s)");
        return new ec.k(hVarC, this.f88257f, dataInput2, this.f88260i, this.f88255c.makeChildOrPlaceholder(this.f88256e), ec.a.skipUTF8BOM(dataInput2));
    }
}
