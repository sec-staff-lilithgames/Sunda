package rc;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class t extends y {

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f84251c;

    public t(Object obj, Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
        super(obj);
        HashMap map = new HashMap();
        this.f84251c = map;
        map.put(cls, annotation);
        map.put(cls2, annotation2);
    }

    @Override // rc.y
    public y addOrOverride(Annotation annotation) {
        this.f84251c.put(annotation.annotationType(), annotation);
        return this;
    }

    @Override // rc.y
    public a0 asAnnotationMap() {
        a0 a0Var = new a0();
        Iterator it = this.f84251c.values().iterator();
        while (it.hasNext()) {
            a0Var.add((Annotation) it.next());
        }
        return a0Var;
    }

    @Override // rc.y
    public dd.b asAnnotations() {
        HashMap map = this.f84251c;
        if (map.size() != 2) {
            return new a0(map);
        }
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        Map.Entry entry2 = (Map.Entry) it.next();
        return new x((Class) entry.getKey(), (Annotation) entry.getValue(), (Class) entry2.getKey(), (Annotation) entry2.getValue());
    }

    @Override // rc.y
    public boolean isPresent(Annotation annotation) {
        return this.f84251c.containsKey(annotation.annotationType());
    }
}
