package mo;

import io.bidmachine.media3.common.util.m0;
import nh.b5;
import nh.ej;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public final b5 f74895a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74896b;

    public g(int i10, b5 b5Var) {
        this.f74896b = i10;
        this.f74895a = b5Var;
    }

    public static g parseFrom(int i10, m0 m0Var) {
        a from;
        x4 x4Var = new x4();
        int iLimit = m0Var.limit();
        int trackType = -2;
        while (m0Var.bytesLeft() > 8) {
            int littleEndianInt = m0Var.readLittleEndianInt();
            int position = m0Var.getPosition() + m0Var.readLittleEndianInt();
            m0Var.setLimit(position);
            if (littleEndianInt != 1414744396) {
                switch (littleEndianInt) {
                    case 1718776947:
                        from = h.parseFrom(trackType, m0Var);
                        break;
                    case 1751742049:
                        from = d.parseFrom(m0Var);
                        break;
                    case 1752331379:
                        from = e.parseFrom(m0Var);
                        break;
                    case 1852994675:
                        from = i.parseFrom(m0Var);
                        break;
                    default:
                        from = null;
                        break;
                }
            } else {
                from = parseFrom(m0Var.readLittleEndianInt(), m0Var);
            }
            if (from != null) {
                if (from.getType() == 1752331379) {
                    trackType = ((e) from).getTrackType();
                }
                x4Var.add((Object) from);
            }
            m0Var.setPosition(position);
            m0Var.setLimit(iLimit);
        }
        return new g(i10, x4Var.build());
    }

    public <T extends a> T getChild(Class<T> cls) {
        ej it = this.f74895a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    @Override // mo.a
    public int getType() {
        return this.f74896b;
    }
}
