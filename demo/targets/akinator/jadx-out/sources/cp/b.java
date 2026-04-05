package cp;

import com.inmobi.commons.core.configs.AdConfig;
import gn.z0;
import java.io.IOException;
import java.util.ArrayDeque;
import ko.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f50790a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f50791b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final j f50792c = new j();

    /* renamed from: d, reason: collision with root package name */
    public c f50793d;

    /* renamed from: e, reason: collision with root package name */
    public int f50794e;

    /* renamed from: f, reason: collision with root package name */
    public int f50795f;

    /* renamed from: g, reason: collision with root package name */
    public long f50796g;

    public final long a(a0 a0Var, int i10) throws IOException {
        a0Var.readFully(this.f50790a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (r0[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        return j10;
    }

    @Override // cp.d
    public void init(c cVar) {
        this.f50793d = cVar;
    }

    @Override // cp.d
    public boolean read(a0 a0Var) throws IOException {
        String str;
        int unsignedVarintLength;
        int iAssembleVarint;
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f50793d);
        while (true) {
            ArrayDeque arrayDeque = this.f50791b;
            a aVar = (a) arrayDeque.peek();
            if (aVar != null && a0Var.getPosition() >= aVar.f50789b) {
                ((f) this.f50793d).endMasterElement(((a) arrayDeque.pop()).f50788a);
                return true;
            }
            int i10 = this.f50794e;
            j jVar = this.f50792c;
            if (i10 == 0) {
                long unsignedVarint = jVar.readUnsignedVarint(a0Var, true, false, 4);
                if (unsignedVarint == -2) {
                    a0Var.resetPeekPosition();
                    while (true) {
                        byte[] bArr = this.f50790a;
                        a0Var.peekFully(bArr, 0, 4);
                        unsignedVarintLength = j.parseUnsignedVarintLength(bArr[0]);
                        if (unsignedVarintLength != -1 && unsignedVarintLength <= 4) {
                            iAssembleVarint = (int) j.assembleVarint(bArr, unsignedVarintLength, false);
                            if (((f) this.f50793d).isLevel1Element(iAssembleVarint)) {
                                break;
                            }
                        }
                        a0Var.skipFully(1);
                    }
                    a0Var.skipFully(unsignedVarintLength);
                    unsignedVarint = iAssembleVarint;
                }
                if (unsignedVarint == -1) {
                    return false;
                }
                this.f50795f = (int) unsignedVarint;
                this.f50794e = 1;
            }
            if (this.f50794e == 1) {
                this.f50796g = jVar.readUnsignedVarint(a0Var, false, true, 8);
                this.f50794e = 2;
            }
            int elementType = ((f) this.f50793d).getElementType(this.f50795f);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = a0Var.getPosition();
                    arrayDeque.push(new a(this.f50795f, this.f50796g + position));
                    ((f) this.f50793d).startMasterElement(this.f50795f, position, this.f50796g);
                    this.f50794e = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j10 = this.f50796g;
                    if (j10 <= 8) {
                        ((f) this.f50793d).integerElement(this.f50795f, a(a0Var, (int) j10));
                        this.f50794e = 0;
                        return true;
                    }
                    throw z0.createForMalformedContainer("Invalid integer size: " + this.f50796g, null);
                }
                if (elementType == 3) {
                    long j11 = this.f50796g;
                    if (j11 > 2147483647L) {
                        throw z0.createForMalformedContainer("String element size: " + this.f50796g, null);
                    }
                    c cVar = this.f50793d;
                    int i11 = this.f50795f;
                    int i12 = (int) j11;
                    if (i12 == 0) {
                        str = "";
                    } else {
                        byte[] bArr2 = new byte[i12];
                        a0Var.readFully(bArr2, 0, i12);
                        while (i12 > 0 && bArr2[i12 - 1] == 0) {
                            i12--;
                        }
                        str = new String(bArr2, 0, i12);
                    }
                    ((f) cVar).stringElement(i11, str);
                    this.f50794e = 0;
                    return true;
                }
                if (elementType == 4) {
                    ((f) this.f50793d).binaryElement(this.f50795f, (int) this.f50796g, a0Var);
                    this.f50794e = 0;
                    return true;
                }
                if (elementType != 5) {
                    throw z0.createForMalformedContainer("Invalid element type " + elementType, null);
                }
                long j12 = this.f50796g;
                if (j12 != 4 && j12 != 8) {
                    throw z0.createForMalformedContainer("Invalid float size: " + this.f50796g, null);
                }
                c cVar2 = this.f50793d;
                int i13 = (int) j12;
                ((f) cVar2).floatElement(this.f50795f, i13 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(a(a0Var, i13)));
                this.f50794e = 0;
                return true;
            }
            a0Var.skipFully((int) this.f50796g);
            this.f50794e = 0;
        }
    }

    @Override // cp.d
    public void reset() {
        this.f50794e = 0;
        this.f50791b.clear();
        this.f50792c.reset();
    }
}
