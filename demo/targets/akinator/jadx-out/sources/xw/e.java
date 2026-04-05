package xw;

import java.lang.reflect.Array;
import java.util.Map;
import yw.v;
import yw.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final b f93917a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93918b;

    /* renamed from: c, reason: collision with root package name */
    public final String f93919c;

    public e() {
        this("class", "length");
    }

    @Override // xw.d
    public g read(f fVar, z zVar, Map map) throws Exception {
        v vVarRemove = zVar.remove(this.f93919c);
        Class type = fVar.getType();
        if (type.isArray()) {
            type = type.getComponentType();
        }
        if (vVarRemove != null) {
            type = this.f93917a.load(vVarRemove.getValue());
        }
        Class type2 = fVar.getType();
        if (type2.isArray()) {
            v vVarRemove2 = zVar.remove(this.f93918b);
            return new a(type, vVarRemove2 != null ? Integer.parseInt(vVarRemove2.getValue()) : 0);
        }
        if (type2 != type) {
            return new c(type);
        }
        return null;
    }

    @Override // xw.d
    public boolean write(f fVar, Object obj, z zVar, Map map) {
        Class<?> componentType;
        Class<?> cls = obj.getClass();
        Class<?> type = fVar.getType();
        if (cls.isArray()) {
            int length = Array.getLength(obj);
            String str = this.f93918b;
            if (str != null) {
                zVar.put(str, String.valueOf(length));
            }
            componentType = type.getComponentType();
        } else {
            componentType = cls;
        }
        if (cls == type) {
            return false;
        }
        zVar.put(this.f93919c, componentType.getName());
        return false;
    }

    public e(String str, String str2) {
        this.f93917a = new b();
        this.f93918b = str2;
        this.f93919c = str;
    }
}
