package fc;

import cc.h;
import com.vungle.ads.internal.protos.Sdk;
import ec.e;
import ic.j0;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import ub.a0;
import ub.p;
import ub.q;
import ub.r;
import ub.x;
import ub.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c extends ec.d {
    public static final String[] A0 = {"NaN", "Infinity", "+Infinity", "-Infinity"};
    public static final double[] B0 = {Double.NaN, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};

    /* renamed from: k0, reason: collision with root package name */
    public final gc.b f55587k0;

    /* renamed from: l0, reason: collision with root package name */
    public int[] f55588l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f55589m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f55590n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f55591o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f55592p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f55593q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f55594r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f55595s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f55596t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f55597u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f55598v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f55599w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f55600x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f55601y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f55602z0;

    public c(h hVar, int i10, gc.b bVar) {
        super(hVar, i10, null);
        this.f55588l0 = new int[8];
        this.f55599w0 = false;
        this.f55601y0 = 0;
        this.f55602z0 = 1;
        this.f55587k0 = bVar;
        this.f90528g = null;
        this.f55595s0 = 0;
        this.f55596t0 = 1;
    }

    public static final int j0(int i10, int i11) {
        return i11 == 4 ? i10 : i10 | ((-1) << (i11 << 3));
    }

    @Override // wb.b
    public final void B() {
        this.f55601y0 = 0;
        this.f90514w = 0;
    }

    @Override // wb.b
    public final void O() {
        super.O();
        this.f55587k0.release();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b0(int r19, int r20, int[] r21) throws xb.b, ub.q {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.c.b0(int, int, int[]):java.lang.String");
    }

    public final z c0() {
        if (!this.D.inArray()) {
            P(AbstractJsonLexerKt.END_OBJ, 93);
            throw null;
        }
        e parent = this.D.getParent();
        this.D = parent;
        int i10 = parent.inObject() ? 3 : parent.inArray() ? 6 : 1;
        this.f55595s0 = i10;
        this.f55596t0 = i10;
        z zVar = z.END_ARRAY;
        u(zVar);
        return zVar;
    }

    @Override // ub.u
    public boolean canParseAsync() {
        return true;
    }

    @Override // ec.d, ub.u
    public p currentLocation() {
        return new p(C(), this.f90515x + (this.f90513v - this.f55601y0), -1L, Math.max(this.f90516y, this.f55602z0), (this.f90513v - this.f90517z) + 1);
    }

    @Override // ec.d, ub.u
    public p currentTokenLocation() {
        return new p(C(), this.A, -1L, this.B, this.C);
    }

    public final z d0() {
        if (!this.D.inObject()) {
            P(AbstractJsonLexerKt.END_LIST, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
            throw null;
        }
        e parent = this.D.getParent();
        this.D = parent;
        int i10 = parent.inObject() ? 3 : parent.inArray() ? 6 : 1;
        this.f55595s0 = i10;
        this.f55596t0 = i10;
        z zVar = z.END_OBJECT;
        u(zVar);
        return zVar;
    }

    public final void e0() throws IOException {
        this.f55595s0 = 7;
        if (!this.D.inRoot()) {
            k();
        }
        close();
        this.f90528g = null;
    }

    public final z f0(String str) throws x {
        this.f55595s0 = 4;
        this.D.setCurrentName(str);
        z zVar = z.FIELD_NAME;
        u(zVar);
        return zVar;
    }

    public final String g0(int i10, int i11) {
        int iJ0 = j0(i10, i11);
        String strFindName = this.f55587k0.findName(iJ0);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this.f55588l0;
        iArr[0] = iJ0;
        return b0(1, i11, iArr);
    }

    @Override // wb.b, wb.c, ub.u
    public byte[] getBinaryValue(ub.b bVar) throws IOException {
        z zVar = this.f90528g;
        if (zVar != z.VALUE_STRING) {
            n(zVar, "Current token (%s) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
            throw null;
        }
        if (this.J == null) {
            ic.d dVar_getByteArrayBuilder = _getByteArrayBuilder();
            i(getText(), dVar_getByteArrayBuilder, bVar);
            this.J = dVar_getByteArrayBuilder.toByteArray();
        }
        return this.J;
    }

    @Override // ub.u
    public Object getEmbeddedObject() throws IOException {
        if (this.f90528g == z.VALUE_EMBEDDED_OBJECT) {
            return this.J;
        }
        return null;
    }

    @Override // ub.u
    public Object getInputSource() {
        return null;
    }

    @Override // wb.c, ub.u
    public String getText() throws IOException {
        int iId;
        z zVar = this.f90528g;
        z zVar2 = z.VALUE_STRING;
        j0 j0Var = this.F;
        if (zVar == zVar2) {
            return j0Var.contentsAsString();
        }
        if (zVar == null || (iId = zVar.id()) == -1) {
            return null;
        }
        return iId != 5 ? (iId == 6 || iId == 7 || iId == 8) ? j0Var.contentsAsString() : zVar.asString() : this.D.getCurrentName();
    }

    @Override // wb.c, ub.u
    public char[] getTextCharacters() throws IOException {
        z zVar = this.f90528g;
        if (zVar == null) {
            return null;
        }
        int iId = zVar.id();
        if (iId != 5) {
            return (iId == 6 || iId == 7 || iId == 8) ? this.F.getTextBuffer() : this.f90528g.asCharArray();
        }
        if (!this.H) {
            String currentName = this.D.getCurrentName();
            int length = currentName.length();
            char[] cArr = this.G;
            if (cArr == null) {
                this.G = this.f90511t.allocNameCopyBuffer(length);
            } else if (cArr.length < length) {
                this.G = new char[length];
            }
            currentName.getChars(0, length, this.G, 0);
            this.H = true;
        }
        return this.G;
    }

    @Override // wb.c, ub.u
    public int getTextLength() throws IOException {
        z zVar = this.f90528g;
        if (zVar == null) {
            return 0;
        }
        int iId = zVar.id();
        return iId != 5 ? (iId == 6 || iId == 7 || iId == 8) ? this.F.size() : this.f90528g.asCharArray().length : this.D.getCurrentName().length();
    }

    @Override // wb.c, ub.u
    public int getTextOffset() throws IOException {
        z zVar = this.f90528g;
        if (zVar == null) {
            return 0;
        }
        int iId = zVar.id();
        if (iId == 6 || iId == 7 || iId == 8) {
            return this.F.getTextOffset();
        }
        return 0;
    }

    @Override // wb.c, ub.u
    public String getValueAsString() throws IOException {
        z zVar = this.f90528g;
        return zVar == z.VALUE_STRING ? this.F.contentsAsString() : zVar == z.FIELD_NAME ? currentName() : super.getValueAsString(null);
    }

    @Override // ub.u
    public final p h() {
        int i10 = this.f90513v - 1;
        return new p(C(), (i10 - this.f55601y0) + this.f90515x, -1L, Math.max(this.f90516y, this.f55602z0), (i10 - this.f90517z) + 1);
    }

    public final String h0(int i10, int i11, int i12) {
        int iJ0 = j0(i11, i12);
        String strFindName = this.f55587k0.findName(i10, iJ0);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this.f55588l0;
        iArr[0] = i10;
        iArr[1] = iJ0;
        return b0(2, i12, iArr);
    }

    @Override // wb.b, wb.c, ub.u
    public boolean hasTextCharacters() {
        z zVar = this.f90528g;
        if (zVar == z.VALUE_STRING) {
            return this.F.hasTextAsCharacters();
        }
        if (zVar == z.FIELD_NAME) {
            return this.H;
        }
        return false;
    }

    public final String i0(int i10, int i11, int i12, int i13) {
        int iJ0 = j0(i12, i13);
        String strFindName = this.f55587k0.findName(i10, i11, iJ0);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this.f55588l0;
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = j0(iJ0, i13);
        return b0(3, i13, iArr);
    }

    public final void k0(int i10, int i11) throws q {
        this.f90513v = i11;
        l0(i10);
        throw null;
    }

    public final void l0(int i10) throws q {
        throw e("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i10));
    }

    public final z m0() {
        T(-1, -1);
        this.f55595s0 = 5;
        this.f55596t0 = 6;
        z zVar = z.START_ARRAY;
        u(zVar);
        return zVar;
    }

    public final z n0() {
        U(-1, -1);
        this.f55595s0 = 2;
        this.f55596t0 = 3;
        z zVar = z.START_OBJECT;
        u(zVar);
        return zVar;
    }

    public final void o0() {
        this.B = Math.max(this.f90516y, this.f55602z0);
        this.C = this.f90513v - this.f90517z;
        this.A = this.f90515x + (r0 - this.f55601y0);
    }

    public final void p0(z zVar) {
        this.f55595s0 = this.f55596t0;
        u(zVar);
    }

    public final z q0() throws IOException {
        this.F.resetWithString("0");
        this.U = 1;
        this.K = 1;
        this.L = 0;
        this.f55595s0 = this.f55596t0;
        z zVar = z.VALUE_NUMBER_INT;
        u(zVar);
        return zVar;
    }

    public final z r0(int i10) throws IOException {
        String str = A0[i10];
        this.F.resetWithString(str);
        if (!isEnabled(r.ALLOW_NON_NUMERIC_NUMBERS)) {
            n(str, "Non-standard token '%s': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
            throw null;
        }
        this.U = 0;
        this.K = 8;
        this.O = B0[i10];
        this.f55595s0 = this.f55596t0;
        z zVar = z.VALUE_NUMBER_FLOAT;
        u(zVar);
        return zVar;
    }

    @Override // ub.u
    public int readBinaryValue(ub.b bVar, OutputStream outputStream) throws IOException {
        byte[] binaryValue = getBinaryValue(bVar);
        outputStream.write(binaryValue);
        return binaryValue.length;
    }

    @Override // ub.u
    public abstract int releaseBuffered(OutputStream outputStream) throws IOException;

    @Override // ec.d, ub.u
    public void setCodec(a0 a0Var) {
        throw new UnsupportedOperationException("Cannot use ObjectMapper with non-blocking parser");
    }

    @Override // wb.c, ub.u
    public String getValueAsString(String str) throws IOException {
        z zVar = this.f90528g;
        if (zVar == z.VALUE_STRING) {
            return this.F.contentsAsString();
        }
        if (zVar == z.FIELD_NAME) {
            return currentName();
        }
        return super.getValueAsString(str);
    }

    @Override // ub.u
    public int getText(Writer writer) throws IOException {
        z zVar = this.f90528g;
        z zVar2 = z.VALUE_STRING;
        j0 j0Var = this.F;
        if (zVar == zVar2) {
            return j0Var.contentsToWriter(writer);
        }
        if (zVar == z.FIELD_NAME) {
            String currentName = this.D.getCurrentName();
            writer.write(currentName);
            return currentName.length();
        }
        if (zVar == null) {
            return 0;
        }
        if (zVar.isNumeric()) {
            return j0Var.contentsToWriter(writer);
        }
        if (zVar != z.NOT_AVAILABLE) {
            char[] cArrAsCharArray = zVar.asCharArray();
            writer.write(cArrAsCharArray);
            return cArrAsCharArray.length;
        }
        throw e("Current token not available: can not call this method");
    }
}
