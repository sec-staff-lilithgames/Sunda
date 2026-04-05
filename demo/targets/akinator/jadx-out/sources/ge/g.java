package ge;

import com.google.android.exoplayer2.util.v0;
import nh.b5;
import nh.ej;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public final b5 f57595a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57596b;

    public g(int i10, b5 b5Var) {
        this.f57596b = i10;
        this.f57595a = b5Var;
    }

    public static g parseFrom(int i10, v0 v0Var) {
        a from;
        x4 x4Var = new x4();
        int iLimit = v0Var.limit();
        int trackType = -2;
        while (v0Var.bytesLeft() > 8) {
            int littleEndianInt = v0Var.readLittleEndianInt();
            int position = v0Var.getPosition() + v0Var.readLittleEndianInt();
            v0Var.setLimit(position);
            if (littleEndianInt != 1414744396) {
                switch (littleEndianInt) {
                    case 1718776947:
                        from = h.parseFrom(trackType, v0Var);
                        break;
                    case 1751742049:
                        from = d.parseFrom(v0Var);
                        break;
                    case 1752331379:
                        from = e.parseFrom(v0Var);
                        break;
                    case 1852994675:
                        from = i.parseFrom(v0Var);
                        break;
                    default:
                        from = null;
                        break;
                }
            } else {
                from = parseFrom(v0Var.readLittleEndianInt(), v0Var);
            }
            if (from != null) {
                if (from.getType() == 1752331379) {
                    trackType = ((e) from).getTrackType();
                }
                x4Var.add((Object) from);
            }
            v0Var.setPosition(position);
            v0Var.setLimit(iLimit);
        }
        return new g(i10, x4Var.build());
    }

    public <T extends a> T getChild(Class<T> cls) {
        ej it = this.f57595a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    @Override // ge.a
    public int getType() {
        return this.f57596b;
    }
}
