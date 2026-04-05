package rc;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: rc.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0776a implements Serializable {
        public abstract a forBuilder(lc.z zVar, e eVar, jc.d dVar);

        public abstract a forPOJO(lc.z zVar, e eVar);

        public abstract a forRecord(lc.z zVar, e eVar);
    }

    public abstract String findNameForIsGetter(m mVar, String str);

    public abstract String findNameForMutator(m mVar, String str);

    public abstract String findNameForRegularGetter(m mVar, String str);

    public abstract String modifyFieldName(i iVar, String str);
}
