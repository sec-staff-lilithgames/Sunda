package yw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface h0 extends v {
    void commit() throws Exception;

    z getAttributes();

    h0 getChild(String str) throws Exception;

    String getComment();

    t getMode();

    @Override // yw.v
    /* synthetic */ String getName();

    u getNamespaces();

    @Override // yw.v
    h0 getParent();

    @Override // yw.v
    /* synthetic */ v getParent();

    String getPrefix();

    String getPrefix(boolean z10);

    String getReference();

    @Override // yw.v
    /* synthetic */ String getValue() throws Exception;

    boolean isCommitted();

    boolean isRoot();

    void remove() throws Exception;

    h0 setAttribute(String str, String str2);

    void setComment(String str);

    void setData(boolean z10);

    void setMode(t tVar);

    void setName(String str);

    void setReference(String str);

    void setValue(String str);
}
