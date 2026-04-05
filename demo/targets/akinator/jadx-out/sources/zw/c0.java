package zw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c0 implements a0 {
    @Override // zw.a0
    public h0 match(Class cls) throws Exception {
        if (cls == Integer.TYPE) {
            return new w();
        }
        if (cls == Boolean.TYPE) {
            return new g();
        }
        if (cls == Long.TYPE) {
            return new z();
        }
        if (cls == Double.TYPE) {
            return new r();
        }
        if (cls == Float.TYPE) {
            return new u();
        }
        if (cls == Short.TYPE) {
            return new d0();
        }
        if (cls == Byte.TYPE) {
            return new h();
        }
        if (cls == Character.TYPE) {
            return new j();
        }
        return null;
    }
}
