package ub;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a0 extends n0 implements q0 {
    @Override // ub.n0
    public abstract o0 createArrayNode();

    @Override // ub.n0
    public abstract o0 createObjectNode();

    public k getFactory() {
        return getJsonFactory();
    }

    @Deprecated
    public k getJsonFactory() {
        return getFactory();
    }

    @Override // ub.n0
    public abstract <T extends o0> T readTree(u uVar) throws IOException;

    public abstract <T> T readValue(u uVar, hc.a aVar) throws IOException;

    public abstract <T> T readValue(u uVar, hc.b bVar) throws IOException;

    public abstract <T> T readValue(u uVar, Class<T> cls) throws IOException;

    public abstract <T> Iterator<T> readValues(u uVar, hc.a aVar) throws IOException;

    public abstract <T> Iterator<T> readValues(u uVar, hc.b bVar) throws IOException;

    public abstract <T> Iterator<T> readValues(u uVar, Class<T> cls) throws IOException;

    @Override // ub.n0
    public abstract u treeAsTokens(o0 o0Var);

    public abstract <T> T treeToValue(o0 o0Var, Class<T> cls) throws x;

    public abstract p0 version();

    @Override // ub.n0
    public abstract void writeTree(o oVar, o0 o0Var) throws IOException;

    public abstract void writeValue(o oVar, Object obj) throws IOException;
}
