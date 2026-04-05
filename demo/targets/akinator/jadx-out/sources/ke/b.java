package ke;

import com.google.android.exoplayer2.h2;
import com.inmobi.commons.core.configs.AdConfig;
import ee.q;
import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f70824a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f70825b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final i f70826c = new i();

    /* renamed from: d, reason: collision with root package name */
    public c f70827d;

    /* renamed from: e, reason: collision with root package name */
    public int f70828e;

    /* renamed from: f, reason: collision with root package name */
    public int f70829f;

    /* renamed from: g, reason: collision with root package name */
    public long f70830g;

    public final long a(q qVar, int i10) throws IOException {
        qVar.readFully(this.f70824a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (r0[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        return j10;
    }

    @Override // ke.d
    public void init(c cVar) {
        this.f70827d = cVar;
    }

    @Override // ke.d
    public boolean read(q qVar) throws IOException {
        String str;
        int unsignedVarintLength;
        int iAssembleVarint;
        com.google.android.exoplayer2.util.a.checkStateNotNull(this.f70827d);
        while (true) {
            ArrayDeque arrayDeque = this.f70825b;
            a aVar = (a) arrayDeque.peek();
            if (aVar != null && qVar.getPosition() >= aVar.f70823b) {
                ((e) this.f70827d).endMasterElement(((a) arrayDeque.pop()).f70822a);
                return true;
            }
            int i10 = this.f70828e;
            i iVar = this.f70826c;
            if (i10 == 0) {
                long unsignedVarint = iVar.readUnsignedVarint(qVar, true, false, 4);
                if (unsignedVarint == -2) {
                    qVar.resetPeekPosition();
                    while (true) {
                        byte[] bArr = this.f70824a;
                        qVar.peekFully(bArr, 0, 4);
                        unsignedVarintLength = i.parseUnsignedVarintLength(bArr[0]);
                        if (unsignedVarintLength != -1 && unsignedVarintLength <= 4) {
                            iAssembleVarint = (int) i.assembleVarint(bArr, unsignedVarintLength, false);
                            if (((e) this.f70827d).isLevel1Element(iAssembleVarint)) {
                                break;
                            }
                        }
                        qVar.skipFully(1);
                    }
                    qVar.skipFully(unsignedVarintLength);
                    unsignedVarint = iAssembleVarint;
                }
                if (unsignedVarint == -1) {
                    return false;
                }
                this.f70829f = (int) unsignedVarint;
                this.f70828e = 1;
            }
            if (this.f70828e == 1) {
                this.f70830g = iVar.readUnsignedVarint(qVar, false, true, 8);
                this.f70828e = 2;
            }
            int elementType = ((e) this.f70827d).getElementType(this.f70829f);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = qVar.getPosition();
                    arrayDeque.push(new a(this.f70829f, this.f70830g + position));
                    ((e) this.f70827d).startMasterElement(this.f70829f, position, this.f70830g);
                    this.f70828e = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j10 = this.f70830g;
                    if (j10 <= 8) {
                        ((e) this.f70827d).integerElement(this.f70829f, a(qVar, (int) j10));
                        this.f70828e = 0;
                        return true;
                    }
                    throw h2.createForMalformedContainer("Invalid integer size: " + this.f70830g, null);
                }
                if (elementType == 3) {
                    long j11 = this.f70830g;
                    if (j11 > 2147483647L) {
                        throw h2.createForMalformedContainer("String element size: " + this.f70830g, null);
                    }
                    c cVar = this.f70827d;
                    int i11 = this.f70829f;
                    int i12 = (int) j11;
                    if (i12 == 0) {
                        str = "";
                    } else {
                        byte[] bArr2 = new byte[i12];
                        qVar.readFully(bArr2, 0, i12);
                        while (i12 > 0 && bArr2[i12 - 1] == 0) {
                            i12--;
                        }
                        str = new String(bArr2, 0, i12);
                    }
                    ((e) cVar).stringElement(i11, str);
                    this.f70828e = 0;
                    return true;
                }
                if (elementType == 4) {
                    ((e) this.f70827d).binaryElement(this.f70829f, (int) this.f70830g, qVar);
                    this.f70828e = 0;
                    return true;
                }
                if (elementType != 5) {
                    throw h2.createForMalformedContainer("Invalid element type " + elementType, null);
                }
                long j12 = this.f70830g;
                if (j12 != 4 && j12 != 8) {
                    throw h2.createForMalformedContainer("Invalid float size: " + this.f70830g, null);
                }
                c cVar2 = this.f70827d;
                int i13 = (int) j12;
                ((e) cVar2).floatElement(this.f70829f, i13 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(a(qVar, i13)));
                this.f70828e = 0;
                return true;
            }
            qVar.skipFully((int) this.f70830g);
            this.f70828e = 0;
        }
    }

    @Override // ke.d
    public void reset() {
        this.f70828e = 0;
        this.f70825b.clear();
        this.f70826c.reset();
    }
}
