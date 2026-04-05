package zw;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class i implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f98864a;

    public i(Class cls) {
        this.f98864a = cls;
    }

    @Override // zw.h0
    public Object read(String str) throws Exception {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        Class cls = Character.TYPE;
        Class cls2 = this.f98864a;
        if (cls2 == cls) {
            return charArray;
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls2, length);
        for (int i10 = 0; i10 < length; i10++) {
            Array.set(objNewInstance, i10, Character.valueOf(charArray[i10]));
        }
        return objNewInstance;
    }

    @Override // zw.h0
    public String write(Object obj) throws Exception {
        int length = Array.getLength(obj);
        if (this.f98864a == Character.TYPE) {
            return new String((char[]) obj);
        }
        StringBuilder sb2 = new StringBuilder(length);
        for (int i10 = 0; i10 < length; i10++) {
            Object obj2 = Array.get(obj, i10);
            if (obj2 != null) {
                sb2.append(obj2);
            }
        }
        return sb2.toString();
    }
}
