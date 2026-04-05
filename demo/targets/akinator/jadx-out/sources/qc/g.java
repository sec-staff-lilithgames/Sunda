package qc;

import bd.k;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import dd.i;
import dd.p;
import java.io.Serializable;
import java.util.HashMap;
import jc.j;
import jc.o;
import jc.q;
import jc.r;
import jc.s0;
import jc.w;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final Class f82736e = Node.class;

    /* renamed from: f, reason: collision with root package name */
    public static final Class f82737f = Document.class;

    /* renamed from: g, reason: collision with root package name */
    public static final a f82738g;

    /* renamed from: h, reason: collision with root package name */
    public static final g f82739h;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f82740b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f82741c;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    static {
        a aVarInstance = null;
        try {
            aVarInstance = a.instance();
        } catch (Throwable th2) {
            p.rethrowIfFatal(th2);
        }
        f82738g = aVarInstance;
        f82739h = new g();
    }

    public g() {
        HashMap map = new HashMap();
        this.f82740b = map;
        map.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        map.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap map2 = new HashMap();
        this.f82741c = map2;
        map2.put("java.sql.Timestamp", k.f9092h);
        map2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        map2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        map2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        map2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }

    public static boolean a(Class cls, Class cls2) {
        return cls2 != null && cls2.isAssignableFrom(cls);
    }

    public static boolean b(Class cls) {
        do {
            cls = cls.getSuperclass();
            if (cls == null || cls == Object.class) {
                return false;
            }
        } while (!cls.getName().startsWith("javax.xml."));
        return true;
    }

    public static Object c(Class cls, o oVar) throws Error, RuntimeException {
        try {
            return i.createInstance(cls, false);
        } catch (Throwable th2) {
            p.rethrowIfFatal(th2);
            throw new IllegalStateException("Failed to create instance of `" + cls.getName() + "` for handling values of type " + i.getTypeDescription(oVar) + ", problem: (" + th2.getClass().getName() + SUvoXnn.nBCdNqBYsjhLUQ + th2.getMessage());
        }
    }

    public static Object d(String str, o oVar) throws Error, RuntimeException {
        try {
            return c(Class.forName(str), oVar);
        } catch (Throwable th2) {
            p.rethrowIfFatal(th2);
            StringBuilder sbO = e3.g.o("Failed to find class `", str, "` for handling values of type ");
            sbO.append(i.getTypeDescription(oVar));
            sbO.append(", problem: (");
            sbO.append(th2.getClass().getName());
            sbO.append(") ");
            sbO.append(th2.getMessage());
            throw new IllegalStateException(sbO.toString());
        }
    }

    public q findDeserializer(o oVar, j jVar, jc.d dVar) throws r {
        q deserializerForJavaNioFilePath;
        Class<?> rawClass = oVar.getRawClass();
        a aVar = f82738g;
        if (aVar != null && (deserializerForJavaNioFilePath = aVar.getDeserializerForJavaNioFilePath(rawClass)) != null) {
            return deserializerForJavaNioFilePath;
        }
        if (a(rawClass, f82736e)) {
            return (q) d("com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer", oVar);
        }
        if (a(rawClass, f82737f)) {
            return (q) d("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer", oVar);
        }
        String name = rawClass.getName();
        String str = (String) this.f82740b.get(name);
        if (str != null) {
            return (q) d(str, oVar);
        }
        if ((name.startsWith("javax.xml.") || b(rawClass)) && d("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers", oVar) != null) {
            throw new ClassCastException();
        }
        return null;
    }

    public w findSerializer(s0 s0Var, o oVar, jc.d dVar) {
        w serializerForJavaNioFilePath;
        Class<?> rawClass = oVar.getRawClass();
        if (a(rawClass, f82736e)) {
            return (w) d("com.fasterxml.jackson.databind.ext.DOMSerializer", oVar);
        }
        a aVar = f82738g;
        if (aVar != null && (serializerForJavaNioFilePath = aVar.getSerializerForJavaNioFilePath(rawClass)) != null) {
            return serializerForJavaNioFilePath;
        }
        String name = rawClass.getName();
        Object obj = this.f82741c.get(name);
        if (obj != null) {
            return obj instanceof w ? (w) obj : (w) d((String) obj, oVar);
        }
        if ((name.startsWith("javax.xml.") || b(rawClass)) && d("com.fasterxml.jackson.databind.ext.CoreXMLSerializers", oVar) != null) {
            throw new ClassCastException();
        }
        return null;
    }

    public boolean hasDeserializerFor(Class<?> cls) {
        if (a(cls, f82736e) || a(cls, f82737f)) {
            return true;
        }
        String name = cls.getName();
        if (name.startsWith("javax.xml.") || b(cls)) {
            return true;
        }
        return this.f82740b.containsKey(name);
    }
}
