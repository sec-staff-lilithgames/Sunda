package yb;

import ic.n;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import ub.p;
import ub.q;
import ub.s;
import ub.u;
import ub.y;
import ub.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a extends n {

    /* renamed from: g, reason: collision with root package name */
    public final d f94277g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f94278h;

    /* renamed from: i, reason: collision with root package name */
    public final c f94279i;

    /* renamed from: j, reason: collision with root package name */
    public z f94280j;

    /* renamed from: k, reason: collision with root package name */
    public z f94281k;

    /* renamed from: l, reason: collision with root package name */
    public e f94282l;

    /* renamed from: m, reason: collision with root package name */
    public e f94283m;

    /* renamed from: n, reason: collision with root package name */
    public d f94284n;

    /* renamed from: o, reason: collision with root package name */
    public int f94285o;

    @Deprecated
    public a(u uVar, d dVar, boolean z10, boolean z11) {
        this(uVar, dVar, z10 ? c.f94289c : c.f94288b, z11);
    }

    @Override // ic.n, ub.u
    public void clearCurrentToken() {
        z zVar = this.f94280j;
        if (zVar != null) {
            this.f94281k = zVar;
            this.f94280j = null;
        }
    }

    @Override // ic.n, ub.u
    public p currentLocation() {
        return this.f59516f.currentLocation();
    }

    @Override // ic.n, ub.u
    public String currentName() throws IOException {
        e eVar = this.f94283m;
        if (eVar == null) {
            eVar = this.f94282l;
        }
        z zVar = this.f94280j;
        if (zVar != z.START_OBJECT && zVar != z.START_ARRAY) {
            return eVar.getCurrentName();
        }
        y parent = eVar.getParent();
        if (parent == null) {
            return null;
        }
        return parent.getCurrentName();
    }

    @Override // ic.n, ub.u
    public z currentToken() {
        return this.f94280j;
    }

    @Override // ic.n, ub.u
    public final int currentTokenId() {
        z zVar = this.f94280j;
        if (zVar == null) {
            return 0;
        }
        return zVar.id();
    }

    @Override // ic.n, ub.u
    public p currentTokenLocation() {
        return this.f59516f.currentTokenLocation();
    }

    @Override // ic.n, ub.u
    public BigInteger getBigIntegerValue() throws IOException {
        return this.f59516f.getBigIntegerValue();
    }

    @Override // ic.n, ub.u
    public byte[] getBinaryValue(ub.b bVar) throws IOException {
        return this.f59516f.getBinaryValue(bVar);
    }

    @Override // ic.n, ub.u
    public boolean getBooleanValue() throws IOException {
        return this.f59516f.getBooleanValue();
    }

    @Override // ic.n, ub.u
    public byte getByteValue() throws IOException {
        return this.f59516f.getByteValue();
    }

    @Override // ic.n, ub.u
    @Deprecated
    public p getCurrentLocation() {
        return this.f59516f.getCurrentLocation();
    }

    @Override // ic.n, ub.u
    @Deprecated
    public String getCurrentName() throws IOException {
        e eVar = this.f94283m;
        if (eVar == null) {
            eVar = this.f94282l;
        }
        z zVar = this.f94280j;
        if (zVar != z.START_OBJECT && zVar != z.START_ARRAY) {
            return eVar.getCurrentName();
        }
        y parent = eVar.getParent();
        if (parent == null) {
            return null;
        }
        return parent.getCurrentName();
    }

    @Override // ic.n, ub.u
    @Deprecated
    public z getCurrentToken() {
        return this.f94280j;
    }

    @Override // ic.n, ub.u
    @Deprecated
    public final int getCurrentTokenId() {
        return currentTokenId();
    }

    @Override // ic.n, ub.u
    public BigDecimal getDecimalValue() throws IOException {
        return this.f59516f.getDecimalValue();
    }

    @Override // ic.n, ub.u
    public double getDoubleValue() throws IOException {
        return this.f59516f.getDoubleValue();
    }

    @Override // ic.n, ub.u
    public Object getEmbeddedObject() throws IOException {
        return this.f59516f.getEmbeddedObject();
    }

    public d getFilter() {
        return this.f94277g;
    }

    @Override // ic.n, ub.u
    public float getFloatValue() throws IOException {
        return this.f59516f.getFloatValue();
    }

    @Override // ic.n, ub.u
    public int getIntValue() throws IOException {
        return this.f59516f.getIntValue();
    }

    @Override // ic.n, ub.u
    public z getLastClearedToken() {
        return this.f94281k;
    }

    @Override // ic.n, ub.u
    public long getLongValue() throws IOException {
        return this.f59516f.getLongValue();
    }

    public int getMatchCount() {
        return this.f94285o;
    }

    @Override // ic.n, ub.u
    public s getNumberType() throws IOException {
        return this.f59516f.getNumberType();
    }

    @Override // ic.n, ub.u
    public Number getNumberValue() throws IOException {
        return this.f59516f.getNumberValue();
    }

    @Override // ic.n, ub.u
    public y getParsingContext() {
        e eVar = this.f94283m;
        return eVar != null ? eVar : this.f94282l;
    }

    @Override // ic.n, ub.u
    public short getShortValue() throws IOException {
        return this.f59516f.getShortValue();
    }

    @Override // ic.n, ub.u
    public String getText() throws IOException {
        return this.f94280j == z.FIELD_NAME ? currentName() : this.f59516f.getText();
    }

    @Override // ic.n, ub.u
    public char[] getTextCharacters() throws IOException {
        return this.f94280j == z.FIELD_NAME ? currentName().toCharArray() : this.f59516f.getTextCharacters();
    }

    @Override // ic.n, ub.u
    public int getTextLength() throws IOException {
        return this.f94280j == z.FIELD_NAME ? currentName().length() : this.f59516f.getTextLength();
    }

    @Override // ic.n, ub.u
    public int getTextOffset() throws IOException {
        if (this.f94280j == z.FIELD_NAME) {
            return 0;
        }
        return this.f59516f.getTextOffset();
    }

    @Override // ic.n, ub.u
    @Deprecated
    public p getTokenLocation() {
        return this.f59516f.getTokenLocation();
    }

    @Override // ic.n, ub.u
    public boolean getValueAsBoolean() throws IOException {
        return this.f59516f.getValueAsBoolean();
    }

    @Override // ic.n, ub.u
    public double getValueAsDouble() throws IOException {
        return this.f59516f.getValueAsDouble();
    }

    @Override // ic.n, ub.u
    public int getValueAsInt() throws IOException {
        return this.f59516f.getValueAsInt();
    }

    @Override // ic.n, ub.u
    public long getValueAsLong() throws IOException {
        return this.f59516f.getValueAsLong();
    }

    @Override // ic.n, ub.u
    public String getValueAsString() throws IOException {
        return this.f94280j == z.FIELD_NAME ? currentName() : this.f59516f.getValueAsString();
    }

    @Override // ic.n, ub.u
    public boolean hasCurrentToken() {
        return this.f94280j != null;
    }

    @Override // ic.n, ub.u
    public boolean hasTextCharacters() {
        if (this.f94280j == z.FIELD_NAME) {
            return false;
        }
        return this.f59516f.hasTextCharacters();
    }

    @Override // ic.n, ub.u
    public final boolean hasToken(z zVar) {
        return this.f94280j == zVar;
    }

    @Override // ic.n, ub.u
    public boolean hasTokenId(int i10) {
        z zVar = this.f94280j;
        return zVar == null ? i10 == 0 : zVar.id() == i10;
    }

    public final z i(e eVar) throws q {
        this.f94283m = eVar;
        z zVarNextTokenToRead = eVar.nextTokenToRead();
        if (zVarNextTokenToRead != null) {
            return zVarNextTokenToRead;
        }
        while (eVar != this.f94282l) {
            eVar = this.f94283m.findChildOf(eVar);
            this.f94283m = eVar;
            if (eVar == null) {
                throw e("Unexpected problem: chain of filtered context broken");
            }
            z zVarNextTokenToRead2 = eVar.nextTokenToRead();
            if (zVarNextTokenToRead2 != null) {
                return zVarNextTokenToRead2;
            }
        }
        throw e("Internal error: failed to locate expected buffered tokens");
    }

    @Override // ic.n, ub.u
    public boolean isExpectedStartArrayToken() {
        return this.f94280j == z.START_ARRAY;
    }

    @Override // ic.n, ub.u
    public boolean isExpectedStartObjectToken() {
        return this.f94280j == z.START_OBJECT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0169, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ub.z j(yb.e r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.a.j(yb.e):ub.z");
    }

    public final boolean k() {
        int i10 = this.f94285o;
        if (i10 != 0 && !this.f94278h) {
            return false;
        }
        this.f94285o = i10 + 1;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0196  */
    @Override // ic.n, ub.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ub.z nextToken() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.a.nextToken():ub.z");
    }

    @Override // ic.n, ub.u
    public z nextValue() throws IOException {
        z zVarNextToken = nextToken();
        return zVarNextToken == z.FIELD_NAME ? nextToken() : zVarNextToken;
    }

    @Override // ic.n, ub.u
    public void overrideCurrentName(String str) {
        throw new UnsupportedOperationException("Can not currently override name during filtering read");
    }

    @Override // ic.n, ub.u
    public int readBinaryValue(ub.b bVar, OutputStream outputStream) throws IOException {
        return this.f59516f.readBinaryValue(bVar, outputStream);
    }

    @Override // ic.n, ub.u
    public u skipChildren() throws IOException {
        z zVar = this.f94280j;
        if (zVar == z.START_OBJECT || zVar == z.START_ARRAY) {
            int i10 = 1;
            while (true) {
                z zVarNextToken = nextToken();
                if (zVarNextToken == null) {
                    break;
                }
                if (!zVarNextToken.isStructStart()) {
                    if (zVarNextToken.isStructEnd() && i10 - 1 == 0) {
                        break;
                    }
                } else {
                    i10++;
                }
            }
        }
        return this;
    }

    public a(u uVar, d dVar, c cVar, boolean z10) {
        super(uVar);
        if (uVar.canParseAsync()) {
            throw new IllegalArgumentException(uVar.getClass().getSimpleName().concat(" is an asynchronous parser (canParseAsync() == true), which requires explicit permission to be used: to allow use, call constructor with `allowNonBlockingParser` passed as `true`"));
        }
        this.f94277g = dVar;
        this.f94284n = dVar;
        this.f94282l = e.createRootContext(dVar);
        this.f94279i = cVar;
        this.f94278h = z10;
    }

    @Override // ic.n, ub.u
    public boolean getValueAsBoolean(boolean z10) throws IOException {
        return this.f59516f.getValueAsBoolean(z10);
    }

    @Override // ic.n, ub.u
    public double getValueAsDouble(double d10) throws IOException {
        return this.f59516f.getValueAsDouble(d10);
    }

    @Override // ic.n, ub.u
    public int getValueAsInt(int i10) throws IOException {
        return this.f59516f.getValueAsInt(i10);
    }

    @Override // ic.n, ub.u
    public long getValueAsLong(long j10) throws IOException {
        return this.f59516f.getValueAsLong(j10);
    }

    @Override // ic.n, ub.u
    public String getValueAsString(String str) throws IOException {
        if (this.f94280j == z.FIELD_NAME) {
            return currentName();
        }
        return this.f59516f.getValueAsString(str);
    }

    public a(u uVar, d dVar, c cVar, boolean z10, boolean z11) {
        super(uVar);
        if (!z11 && uVar.canParseAsync()) {
            throw new IllegalArgumentException(uVar.getClass().getSimpleName().concat(" is an asynchronous parser (canParseAsync() == true), which requires explicit permission to be used: to allow use, call constructor with `allowNonBlockingParser` passed as `true`"));
        }
        this.f94277g = dVar;
        this.f94284n = dVar;
        this.f94282l = e.createRootContext(dVar);
        this.f94279i = cVar;
        this.f94278h = z10;
    }
}
