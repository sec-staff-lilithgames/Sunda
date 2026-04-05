package zw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k implements h0 {
    @Override // zw.h0
    public Class read(String str) throws Exception {
        Class cls = str.equals("byte") ? Byte.TYPE : str.equals("short") ? Short.TYPE : str.equals("int") ? Integer.TYPE : str.equals("long") ? Long.TYPE : str.equals("char") ? Character.TYPE : str.equals("float") ? Float.TYPE : str.equals("double") ? Double.TYPE : str.equals("boolean") ? Boolean.TYPE : str.equals("void") ? Void.TYPE : null;
        if (cls != null) {
            return cls;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = k.class.getClassLoader();
        }
        return contextClassLoader.loadClass(str);
    }

    @Override // zw.h0
    public String write(Class cls) throws Exception {
        return cls.getName();
    }
}
