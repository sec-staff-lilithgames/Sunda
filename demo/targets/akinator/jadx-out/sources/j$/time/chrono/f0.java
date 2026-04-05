package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class f0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a, reason: collision with root package name */
    public byte f68476a;

    /* renamed from: b, reason: collision with root package name */
    public Object f68477b;

    public f0() {
    }

    public f0(byte b10, Object obj) {
        this.f68476a = b10;
        this.f68477b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f68476a;
        Object obj = this.f68477b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                objectOutput.writeUTF(((a) obj).k());
                return;
            case 2:
                g gVar = (g) obj;
                objectOutput.writeObject(gVar.f68478a);
                objectOutput.writeObject(gVar.f68479b);
                return;
            case 3:
                l lVar = (l) obj;
                objectOutput.writeObject(lVar.f68492a);
                objectOutput.writeObject(lVar.f68493b);
                objectOutput.writeObject(lVar.f68494c);
                return;
            case 4:
                y yVar = (y) obj;
                yVar.getClass();
                objectOutput.writeInt(yVar.d(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(yVar.d(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(yVar.d(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((z) obj).f68523a);
                return;
            case 6:
                r rVar = (r) obj;
                objectOutput.writeObject(rVar.f68507a);
                objectOutput.writeInt(rVar.d(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(rVar.d(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(rVar.d(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                d0 d0Var = (d0) obj;
                d0Var.getClass();
                objectOutput.writeInt(d0Var.d(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(d0Var.d(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(d0Var.d(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                j0 j0Var = (j0) obj;
                j0Var.getClass();
                objectOutput.writeInt(j0Var.d(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j0Var.d(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j0Var.d(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                h hVar = (h) obj;
                objectOutput.writeUTF(hVar.f68482a.k());
                objectOutput.writeInt(hVar.f68483b);
                objectOutput.writeInt(hVar.f68484c);
                objectOutput.writeInt(hVar.f68485d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objOf;
        byte b10 = objectInput.readByte();
        this.f68476a = b10;
        switch (b10) {
            case 1:
                ConcurrentHashMap concurrentHashMap = a.f68467a;
                objOf = m.of(objectInput.readUTF());
                break;
            case 2:
                objOf = ((b) objectInput.readObject()).A((j$.time.k) objectInput.readObject());
                break;
            case 3:
                objOf = ((e) objectInput.readObject()).n((ZoneOffset) objectInput.readObject()).v((ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.h hVar = y.f68517d;
                int i10 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                byte b12 = objectInput.readByte();
                w.f68515c.getClass();
                objOf = new y(j$.time.h.M(i10, b11, b12));
                break;
            case 5:
                z zVar = z.f68521d;
                objOf = z.o(objectInput.readByte());
                break;
            case 6:
                p pVar = (p) objectInput.readObject();
                int i11 = objectInput.readInt();
                byte b13 = objectInput.readByte();
                byte b14 = objectInput.readByte();
                pVar.getClass();
                objOf = new r(pVar, i11, b13, b14);
                break;
            case 7:
                int i12 = objectInput.readInt();
                byte b15 = objectInput.readByte();
                byte b16 = objectInput.readByte();
                b0.f68470c.getClass();
                objOf = new d0(j$.time.h.M(i12 + 1911, b15, b16));
                break;
            case 8:
                int i13 = objectInput.readInt();
                byte b17 = objectInput.readByte();
                byte b18 = objectInput.readByte();
                h0.f68486c.getClass();
                objOf = new j0(j$.time.h.M(i13 - 543, b17, b18));
                break;
            case 9:
                int i14 = h.f68481e;
                objOf = new h(m.of(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f68477b = objOf;
    }

    private Object readResolve() {
        return this.f68477b;
    }
}
