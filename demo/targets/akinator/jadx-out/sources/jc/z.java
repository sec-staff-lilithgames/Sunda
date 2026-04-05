package jc;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z implements Iterator, Closeable {

    /* renamed from: j, reason: collision with root package name */
    public static final z f69481j = new z(null, null, null, false, null);

    /* renamed from: b, reason: collision with root package name */
    public final k f69482b;

    /* renamed from: c, reason: collision with root package name */
    public final q f69483c;

    /* renamed from: e, reason: collision with root package name */
    public final ub.u f69484e;

    /* renamed from: f, reason: collision with root package name */
    public final ub.y f69485f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f69486g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f69487h;

    /* renamed from: i, reason: collision with root package name */
    public int f69488i;

    public z(ub.u uVar, k kVar, q qVar, boolean z10, Object obj) {
        this.f69484e = uVar;
        this.f69482b = kVar;
        this.f69483c = qVar;
        this.f69487h = z10;
        if (obj == null) {
            this.f69486g = null;
        } else {
            this.f69486g = obj;
        }
        if (uVar == null) {
            this.f69485f = null;
            this.f69488i = 0;
            return;
        }
        ub.y parsingContext = uVar.getParsingContext();
        if (z10 && uVar.isExpectedStartArrayToken()) {
            uVar.clearCurrentToken();
        } else {
            ub.z zVarCurrentToken = uVar.currentToken();
            if (zVarCurrentToken == ub.z.START_OBJECT || zVarCurrentToken == ub.z.START_ARRAY) {
                parsingContext = parsingContext.getParent();
            }
        }
        this.f69485f = parsingContext;
        this.f69488i = 2;
    }

    public static <T> z emptyIterator() {
        return f69481j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f69488i != 0) {
            this.f69488i = 0;
            ub.u uVar = this.f69484e;
            if (uVar != null) {
                uVar.close();
            }
        }
    }

    public ub.p getCurrentLocation() {
        return this.f69484e.currentLocation();
    }

    public ub.u getParser() {
        return this.f69484e;
    }

    public ub.g getParserSchema() {
        this.f69484e.getSchema();
        return null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        try {
            return hasNextValue();
        } catch (r e10) {
            throw new q0(e10.getMessage(), e10);
        } catch (IOException e11) {
            throw new RuntimeException(e11.getMessage(), e11);
        }
    }

    public boolean hasNextValue() throws IOException {
        ub.z zVarNextToken;
        int i10 = this.f69488i;
        if (i10 != 0) {
            ub.u uVar = this.f69484e;
            if (i10 == 1) {
                ub.y parsingContext = uVar.getParsingContext();
                ub.y yVar = this.f69485f;
                if (parsingContext != yVar) {
                    while (true) {
                        ub.z zVarNextToken2 = uVar.nextToken();
                        if (zVarNextToken2 == ub.z.END_ARRAY || zVarNextToken2 == ub.z.END_OBJECT) {
                            if (uVar.getParsingContext() == yVar) {
                                uVar.clearCurrentToken();
                                break;
                            }
                        } else if (zVarNextToken2 == ub.z.START_ARRAY || zVarNextToken2 == ub.z.START_OBJECT) {
                            uVar.skipChildren();
                        } else if (zVarNextToken2 == null) {
                            break;
                        }
                    }
                }
            } else if (i10 != 2) {
                return true;
            }
            if (uVar != null) {
                if (uVar.currentToken() != null || ((zVarNextToken = uVar.nextToken()) != null && zVarNextToken != ub.z.END_ARRAY)) {
                    this.f69488i = 3;
                    return true;
                }
                this.f69488i = 0;
                if (this.f69487h) {
                    uVar.close();
                    return false;
                }
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            return nextValue();
        } catch (r e10) {
            throw new q0(e10.getMessage(), e10);
        } catch (IOException e11) {
            throw new RuntimeException(e11.getMessage(), e11);
        }
    }

    public Object nextValue() throws IOException {
        int i10 = this.f69488i;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        if ((i10 == 1 || i10 == 2) && !hasNextValue()) {
            throw new NoSuchElementException();
        }
        k kVar = this.f69482b;
        q qVar = this.f69483c;
        Object objDeserialize = this.f69486g;
        ub.u uVar = this.f69484e;
        try {
            if (objDeserialize == null) {
                objDeserialize = qVar.deserialize(uVar, kVar);
            } else {
                qVar.deserialize(uVar, kVar, objDeserialize);
            }
            this.f69488i = 2;
            uVar.clearCurrentToken();
            return objDeserialize;
        } catch (Throwable th2) {
            this.f69488i = 1;
            uVar.clearCurrentToken();
            throw th2;
        }
    }

    public List<Object> readAll() throws IOException {
        return readAll((z) new ArrayList());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public <L extends List<Object>> L readAll(L l9) throws IOException {
        while (hasNextValue()) {
            l9.add(nextValue());
        }
        return l9;
    }

    public <C extends Collection<Object>> C readAll(C c10) throws IOException {
        while (hasNextValue()) {
            c10.add(nextValue());
        }
        return c10;
    }
}
