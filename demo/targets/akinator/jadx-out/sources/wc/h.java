package wc;

import java.io.IOException;
import jc.o;
import tb.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface h {
    String getDescForKnownTypeIds();

    w0 getMechanism();

    String idFromBaseType();

    String idFromValue(Object obj);

    String idFromValueAndType(Object obj, Class<?> cls);

    void init(o oVar);

    o typeFromId(jc.h hVar, String str) throws IOException;
}
