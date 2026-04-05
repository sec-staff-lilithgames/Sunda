package j$.time.zone;

import com.amazon.device.ads.DTBMetricReport;
import com.sfbx.appconsent.core.BuildConfig;
import j$.time.ZoneOffset;
import j$.time.k;
import j$.time.m;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a, reason: collision with root package name */
    public final m f68707a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f68708b;

    /* renamed from: c, reason: collision with root package name */
    public final j$.time.e f68709c;

    /* renamed from: d, reason: collision with root package name */
    public final k f68710d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f68711e;

    /* renamed from: f, reason: collision with root package name */
    public final d f68712f;

    /* renamed from: g, reason: collision with root package name */
    public final ZoneOffset f68713g;

    /* renamed from: h, reason: collision with root package name */
    public final ZoneOffset f68714h;

    /* renamed from: i, reason: collision with root package name */
    public final ZoneOffset f68715i;

    public e(m mVar, int i10, j$.time.e eVar, k kVar, boolean z10, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f68707a = mVar;
        this.f68708b = (byte) i10;
        this.f68709c = eVar;
        this.f68710d = kVar;
        this.f68711e = z10;
        this.f68712f = dVar;
        this.f68713g = zoneOffset;
        this.f68714h = zoneOffset2;
        this.f68715i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        int iQ = this.f68711e ? 86400 : this.f68710d.Q();
        int i10 = this.f68713g.f68463b;
        int i11 = this.f68714h.f68463b - i10;
        int i12 = this.f68715i.f68463b - i10;
        byte b10 = iQ % BuildConfig.VERSION_CODE == 0 ? this.f68711e ? (byte) 24 : this.f68710d.f68611a : (byte) 31;
        int i13 = i10 % 900 == 0 ? (i10 / 900) + 128 : 255;
        int i14 = (i11 == 0 || i11 == 1800 || i11 == 3600) ? i11 / 1800 : 3;
        int i15 = (i12 == 0 || i12 == 1800 || i12 == 3600) ? i12 / 1800 : 3;
        j$.time.e eVar = this.f68709c;
        dataOutput.writeInt((this.f68707a.getValue() << 28) + ((this.f68708b + 32) << 22) + ((eVar == null ? 0 : eVar.getValue()) << 19) + (b10 << 14) + (this.f68712f.ordinal() << 12) + (i13 << 4) + (i14 << 2) + i15);
        if (b10 == 31) {
            dataOutput.writeInt(iQ);
        }
        if (i13 == 255) {
            dataOutput.writeInt(i10);
        }
        if (i14 == 3) {
            dataOutput.writeInt(this.f68714h.f68463b);
        }
        if (i15 == 3) {
            dataOutput.writeInt(this.f68715i.f68463b);
        }
    }

    public static e a(DataInput dataInput) {
        d dVar;
        k kVarT;
        int i10;
        int i11;
        int i12 = dataInput.readInt();
        m mVarG = m.G(i12 >>> 28);
        int i13 = ((264241152 & i12) >>> 22) - 32;
        int i14 = (3670016 & i12) >>> 19;
        j$.time.e eVarR = i14 == 0 ? null : j$.time.e.r(i14);
        int i15 = (507904 & i12) >>> 14;
        d dVar2 = d.values()[(i12 & 12288) >>> 12];
        int i16 = (i12 & 4080) >>> 4;
        int i17 = (i12 & 12) >>> 2;
        int i18 = i12 & 3;
        if (i15 == 31) {
            long j10 = dataInput.readInt();
            k kVar = k.f68607e;
            j$.time.temporal.a.SECOND_OF_DAY.I(j10);
            int i19 = (int) (j10 / 3600);
            long j11 = j10 - (i19 * BuildConfig.VERSION_CODE);
            dVar = dVar2;
            kVarT = k.t(i19, (int) (j11 / 60), (int) (j11 - (r14 * 60)), 0);
        } else {
            dVar = dVar2;
            int i20 = i15 % 24;
            k kVar2 = k.f68607e;
            j$.time.temporal.a.HOUR_OF_DAY.I(i20);
            kVarT = k.f68610h[i20];
        }
        ZoneOffset zoneOffsetL = ZoneOffset.L(i16 == 255 ? dataInput.readInt() : (i16 - 128) * 900);
        if (i17 == 3) {
            i10 = dataInput.readInt();
        } else {
            i10 = (i17 * 1800) + zoneOffsetL.f68463b;
        }
        ZoneOffset zoneOffsetL2 = ZoneOffset.L(i10);
        if (i18 == 3) {
            i11 = dataInput.readInt();
        } else {
            i11 = (i18 * 1800) + zoneOffsetL.f68463b;
        }
        ZoneOffset zoneOffsetL3 = ZoneOffset.L(i11);
        boolean z10 = i15 == 24;
        Objects.requireNonNull(mVarG, "month");
        Objects.requireNonNull(kVarT, DTBMetricReport.TIME);
        d dVar3 = dVar;
        Objects.requireNonNull(dVar3, "timeDefnition");
        if (i13 < -28 || i13 > 31 || i13 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z10 && !kVarT.equals(k.f68609g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (kVarT.f68614d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(mVarG, i13, eVarR, kVarT, z10, dVar3, zoneOffsetL, zoneOffsetL2, zoneOffsetL3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f68707a == eVar.f68707a && this.f68708b == eVar.f68708b && this.f68709c == eVar.f68709c && this.f68712f == eVar.f68712f && this.f68710d.equals(eVar.f68710d) && this.f68711e == eVar.f68711e && this.f68713g.equals(eVar.f68713g) && this.f68714h.equals(eVar.f68714h) && this.f68715i.equals(eVar.f68715i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iQ = ((this.f68710d.Q() + (this.f68711e ? 1 : 0)) << 15) + (this.f68707a.ordinal() << 11) + ((this.f68708b + 32) << 5);
        j$.time.e eVar = this.f68709c;
        return ((this.f68713g.f68463b ^ (this.f68712f.ordinal() + (iQ + ((eVar == null ? 7 : eVar.ordinal()) << 2)))) ^ this.f68714h.f68463b) ^ this.f68715i.f68463b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        sb2.append(this.f68715i.f68463b - this.f68714h.f68463b > 0 ? "Gap " : "Overlap ");
        sb2.append(this.f68714h);
        sb2.append(" to ");
        sb2.append(this.f68715i);
        sb2.append(", ");
        j$.time.e eVar = this.f68709c;
        if (eVar != null) {
            byte b10 = this.f68708b;
            if (b10 == -1) {
                sb2.append(eVar.name());
                sb2.append(" on or before last day of ");
                sb2.append(this.f68707a.name());
            } else if (b10 < 0) {
                sb2.append(eVar.name());
                sb2.append(" on or before last day minus ");
                sb2.append((-this.f68708b) - 1);
                sb2.append(" of ");
                sb2.append(this.f68707a.name());
            } else {
                sb2.append(eVar.name());
                sb2.append(" on or after ");
                sb2.append(this.f68707a.name());
                sb2.append(' ');
                sb2.append((int) this.f68708b);
            }
        } else {
            sb2.append(this.f68707a.name());
            sb2.append(' ');
            sb2.append((int) this.f68708b);
        }
        sb2.append(" at ");
        sb2.append(this.f68711e ? "24:00" : this.f68710d.toString());
        sb2.append(" ");
        sb2.append(this.f68712f);
        sb2.append(", standard offset ");
        sb2.append(this.f68713g);
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }
}
