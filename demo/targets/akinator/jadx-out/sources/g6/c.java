package g6;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
        Class<?> cls = Class.forName(objectStreamClass.getName(), false, c.class.getClassLoader());
        return cls != null ? cls : super.resolveClass(objectStreamClass);
    }
}
