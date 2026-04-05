package nc;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m extends mc.y {

    /* renamed from: r, reason: collision with root package name */
    public final transient Constructor f75941r;

    public m(mc.z zVar, Constructor<?> constructor) {
        super(zVar);
        this.f75941r = constructor;
    }

    @Override // mc.y
    public final mc.z c(mc.z zVar) {
        return zVar == this.f74236q ? this : new m(zVar, this.f75941r);
    }

    @Override // mc.y, mc.z
    public void deserializeAndSet(ub.u uVar, jc.k kVar, Object obj) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Object objDeserializeWithType;
        Constructor constructor = this.f75941r;
        ub.z zVarCurrentToken = uVar.currentToken();
        ub.z zVar = ub.z.VALUE_NULL;
        jc.q qVar = this.f74242i;
        if (zVarCurrentToken == zVar) {
            objDeserializeWithType = qVar.getNullValue(kVar);
        } else {
            wc.g gVar = this.f74243j;
            if (gVar != null) {
                objDeserializeWithType = qVar.deserializeWithType(uVar, kVar, gVar);
            } else {
                try {
                    objNewInstance = constructor.newInstance(obj);
                } catch (Exception e10) {
                    dd.i.unwrapAndThrowAsIAE(e10, "Failed to instantiate class " + constructor.getDeclaringClass().getName() + ", problem: " + e10.getMessage());
                    objNewInstance = null;
                }
                qVar.deserialize(uVar, kVar, objNewInstance);
                objDeserializeWithType = objNewInstance;
            }
        }
        set(obj, objDeserializeWithType);
    }

    @Override // mc.y, mc.z
    public Object deserializeSetAndReturn(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        return setAndReturn(obj, deserialize(uVar, kVar));
    }
}
