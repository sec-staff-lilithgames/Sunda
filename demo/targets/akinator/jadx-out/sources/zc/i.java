package zc;

import bd.z0;
import jc.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i extends z0 {
    public abstract i _withValueTypeSerializer(wc.j jVar);

    public abstract w getContentSerializer();

    public abstract jc.o getContentType();

    public abstract boolean hasSingleElement(Object obj);

    public i withValueTypeSerializer(wc.j jVar) {
        return jVar == null ? this : _withValueTypeSerializer(jVar);
    }
}
