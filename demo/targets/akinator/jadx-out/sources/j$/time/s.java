package j$.time;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class s implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a, reason: collision with root package name */
    public byte f68630a;

    /* renamed from: b, reason: collision with root package name */
    public Object f68631b;

    public s() {
    }

    public s(byte b10, Object obj) {
        this.f68630a = b10;
        this.f68631b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f68630a;
        Object obj = this.f68631b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.f68446a);
                objectOutput.writeInt(duration.f68447b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.f68449a);
                objectOutput.writeInt(instant.f68450b);
                return;
            case 3:
                h hVar = (h) obj;
                objectOutput.writeInt(hVar.f68601a);
                objectOutput.writeByte(hVar.f68602b);
                objectOutput.writeByte(hVar.f68603c);
                return;
            case 4:
                ((k) obj).T(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                h hVar2 = localDateTime.f68453a;
                objectOutput.writeInt(hVar2.f68601a);
                objectOutput.writeByte(hVar2.f68602b);
                objectOutput.writeByte(hVar2.f68603c);
                localDateTime.f68454b.T(objectOutput);
                return;
            case 6:
                z zVar = (z) obj;
                LocalDateTime localDateTime2 = zVar.f68695a;
                h hVar3 = localDateTime2.f68453a;
                objectOutput.writeInt(hVar3.f68601a);
                objectOutput.writeByte(hVar3.f68602b);
                objectOutput.writeByte(hVar3.f68603c);
                localDateTime2.f68454b.T(objectOutput);
                zVar.f68696b.O(objectOutput);
                zVar.f68697c.I(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((x) obj).f68692b);
                return;
            case 8:
                ((ZoneOffset) obj).O(objectOutput);
                return;
            case 9:
                q qVar = (q) obj;
                qVar.f68624a.T(objectOutput);
                qVar.f68625b.O(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.f68456a;
                h hVar4 = localDateTime3.f68453a;
                objectOutput.writeInt(hVar4.f68601a);
                objectOutput.writeByte(hVar4.f68602b);
                objectOutput.writeByte(hVar4.f68603c);
                localDateTime3.f68454b.T(objectOutput);
                offsetDateTime.f68457b.O(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((u) obj).f68685a);
                return;
            case 12:
                w wVar = (w) obj;
                objectOutput.writeInt(wVar.f68689a);
                objectOutput.writeByte(wVar.f68690b);
                return;
            case 13:
                o oVar = (o) obj;
                objectOutput.writeByte(oVar.f68620a);
                objectOutput.writeByte(oVar.f68621b);
                return;
            case 14:
                r rVar = (r) obj;
                objectOutput.writeInt(rVar.f68627a);
                objectOutput.writeInt(rVar.f68628b);
                objectOutput.writeInt(rVar.f68629c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte b10 = objectInput.readByte();
        this.f68630a = b10;
        this.f68631b = a(b10, objectInput);
    }

    public static Object a(byte b10, ObjectInput objectInput) throws IOException {
        switch (b10) {
            case 1:
                Duration duration = Duration.ZERO;
                long j10 = objectInput.readLong();
                long j11 = objectInput.readInt();
                return Duration.r(Math.addExact(j10, Math.floorDiv(j11, C.NANOS_PER_SECOND)), (int) Math.floorMod(j11, C.NANOS_PER_SECOND));
            case 2:
                Instant instant = Instant.f68448c;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                h hVar = h.f68599d;
                return h.M(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return k.O(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f68451c;
                h hVar2 = h.f68599d;
                return LocalDateTime.G(h.M(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.O(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.f68451c;
                h hVar3 = h.f68599d;
                LocalDateTime localDateTimeG = LocalDateTime.G(h.M(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.O(objectInput));
                ZoneOffset zoneOffsetN = ZoneOffset.N(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || zoneOffsetN.equals(zoneId)) {
                    return new z(localDateTimeG, zoneId, zoneOffsetN);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i10 = x.f68691d;
                return ZoneId.t(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.N(objectInput);
            case 9:
                int i11 = q.f68623c;
                return new q(k.O(objectInput), ZoneOffset.N(objectInput));
            case 10:
                int i12 = OffsetDateTime.f68455c;
                h hVar4 = h.f68599d;
                return new OffsetDateTime(LocalDateTime.G(h.M(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.O(objectInput)), ZoneOffset.N(objectInput));
            case 11:
                int i13 = u.f68684b;
                return u.r(objectInput.readInt());
            case 12:
                int i14 = w.f68688c;
                int i15 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                j$.time.temporal.a.YEAR.I(i15);
                j$.time.temporal.a.MONTH_OF_YEAR.I(b11);
                return new w(i15, b11);
            case 13:
                int i16 = o.f68619c;
                byte b12 = objectInput.readByte();
                byte b13 = objectInput.readByte();
                m mVarG = m.G(b12);
                Objects.requireNonNull(mVarG, "month");
                j$.time.temporal.a.DAY_OF_MONTH.I(b13);
                if (b13 <= mVarG.D()) {
                    return new o(mVarG.getValue(), b13);
                }
                throw new c("Illegal value for DayOfMonth field, value " + ((int) b13) + " is not valid for month " + mVarG.name());
            case 14:
                r rVar = r.f68626d;
                int i17 = objectInput.readInt();
                int i18 = objectInput.readInt();
                int i19 = objectInput.readInt();
                return ((i17 | i18) | i19) == 0 ? r.f68626d : new r(i17, i18, i19);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f68631b;
    }
}
