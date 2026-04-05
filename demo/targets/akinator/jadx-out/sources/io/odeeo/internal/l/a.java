package io.odeeo.internal.l;

import com.inmobi.commons.core.configs.AdConfig;
import io.odeeo.internal.b.g0;
import io.odeeo.internal.g.i;
import java.io.IOException;
import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f64510a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<b> f64511b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    public final f f64512c = new f();

    /* renamed from: d, reason: collision with root package name */
    public io.odeeo.internal.l.b f64513d;

    /* renamed from: e, reason: collision with root package name */
    public int f64514e;

    /* renamed from: f, reason: collision with root package name */
    public int f64515f;

    /* renamed from: g, reason: collision with root package name */
    public long f64516g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f64517a;

        /* renamed from: b, reason: collision with root package name */
        public final long f64518b;

        public b(int i10, long j10) {
            this.f64517a = i10;
            this.f64518b = j10;
        }
    }

    public static String c(i iVar, int i10) throws IOException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        iVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @RequiresNonNull({"processor"})
    public final long a(i iVar) throws IOException {
        iVar.resetPeekPosition();
        while (true) {
            iVar.peekFully(this.f64510a, 0, 4);
            int unsignedVarintLength = f.parseUnsignedVarintLength(this.f64510a[0]);
            if (unsignedVarintLength != -1 && unsignedVarintLength <= 4) {
                int iAssembleVarint = (int) f.assembleVarint(this.f64510a, unsignedVarintLength, false);
                if (this.f64513d.isLevel1Element(iAssembleVarint)) {
                    iVar.skipFully(unsignedVarintLength);
                    return iAssembleVarint;
                }
            }
            iVar.skipFully(1);
        }
    }

    public final long b(i iVar, int i10) throws IOException {
        iVar.readFully(this.f64510a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f64510a[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        return j10;
    }

    @Override // io.odeeo.internal.l.c
    public void init(io.odeeo.internal.l.b bVar) {
        this.f64513d = bVar;
    }

    @Override // io.odeeo.internal.l.c
    public boolean read(i iVar) throws IOException {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f64513d);
        while (true) {
            b bVarPeek = this.f64511b.peek();
            if (bVarPeek != null && iVar.getPosition() >= bVarPeek.f64518b) {
                this.f64513d.endMasterElement(this.f64511b.pop().f64517a);
                return true;
            }
            if (this.f64514e == 0) {
                long unsignedVarint = this.f64512c.readUnsignedVarint(iVar, true, false, 4);
                if (unsignedVarint == -2) {
                    unsignedVarint = a(iVar);
                }
                if (unsignedVarint == -1) {
                    return false;
                }
                this.f64515f = (int) unsignedVarint;
                this.f64514e = 1;
            }
            if (this.f64514e == 1) {
                this.f64516g = this.f64512c.readUnsignedVarint(iVar, false, true, 8);
                this.f64514e = 2;
            }
            int elementType = this.f64513d.getElementType(this.f64515f);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = iVar.getPosition();
                    this.f64511b.push(new b(this.f64515f, this.f64516g + position));
                    this.f64513d.startMasterElement(this.f64515f, position, this.f64516g);
                    this.f64514e = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j10 = this.f64516g;
                    if (j10 <= 8) {
                        this.f64513d.integerElement(this.f64515f, b(iVar, (int) j10));
                        this.f64514e = 0;
                        return true;
                    }
                    throw g0.createForMalformedContainer("Invalid integer size: " + this.f64516g, null);
                }
                if (elementType == 3) {
                    long j11 = this.f64516g;
                    if (j11 <= 2147483647L) {
                        this.f64513d.stringElement(this.f64515f, c(iVar, (int) j11));
                        this.f64514e = 0;
                        return true;
                    }
                    throw g0.createForMalformedContainer("String element size: " + this.f64516g, null);
                }
                if (elementType == 4) {
                    this.f64513d.binaryElement(this.f64515f, (int) this.f64516g, iVar);
                    this.f64514e = 0;
                    return true;
                }
                if (elementType != 5) {
                    throw g0.createForMalformedContainer("Invalid element type " + elementType, null);
                }
                long j12 = this.f64516g;
                if (j12 == 4 || j12 == 8) {
                    this.f64513d.floatElement(this.f64515f, a(iVar, (int) j12));
                    this.f64514e = 0;
                    return true;
                }
                throw g0.createForMalformedContainer("Invalid float size: " + this.f64516g, null);
            }
            iVar.skipFully((int) this.f64516g);
            this.f64514e = 0;
        }
    }

    @Override // io.odeeo.internal.l.c
    public void reset() {
        this.f64514e = 0;
        this.f64511b.clear();
        this.f64512c.reset();
    }

    public final double a(i iVar, int i10) throws IOException {
        long jB = b(iVar, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) jB);
        }
        return Double.longBitsToDouble(jB);
    }
}
