package zw;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f98859a = new e0();

    /* renamed from: b, reason: collision with root package name */
    public final h0 f98860b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f98861c;

    public b(h0 h0Var, Class cls) {
        this.f98860b = h0Var;
        this.f98861c = cls;
    }

    @Override // zw.h0
    public Object read(String str) throws Exception {
        String[] strArr = this.f98859a.read(str);
        int length = strArr.length;
        Object objNewInstance = Array.newInstance((Class<?>) this.f98861c, length);
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = this.f98860b.read(strArr[i10]);
            if (obj != null) {
                Array.set(objNewInstance, i10, obj);
            }
        }
        return objNewInstance;
    }

    @Override // zw.h0
    public String write(Object obj) throws Exception {
        int length = Array.getLength(obj);
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj2 = Array.get(obj, i10);
            if (obj2 != null) {
                strArr[i10] = this.f98860b.write(obj2);
            }
        }
        return this.f98859a.write(strArr);
    }
}
