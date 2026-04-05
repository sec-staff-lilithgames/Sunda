package ub;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class n0 {
    public abstract o0 createArrayNode();

    public abstract o0 createObjectNode();

    public o0 missingNode() {
        return null;
    }

    public o0 nullNode() {
        return null;
    }

    public abstract <T extends o0> T readTree(u uVar) throws IOException;

    public abstract u treeAsTokens(o0 o0Var);

    public abstract void writeTree(o oVar, o0 o0Var) throws IOException;
}
