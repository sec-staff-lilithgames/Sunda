package yw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface p extends v {
    p getAttribute(String str);

    z getAttributes();

    @Override // yw.v
    /* synthetic */ String getName();

    p getNext() throws Exception;

    p getNext(String str) throws Exception;

    @Override // yw.v
    p getParent();

    @Override // yw.v
    /* synthetic */ v getParent();

    k0 getPosition();

    String getPrefix();

    String getReference();

    Object getSource();

    @Override // yw.v
    /* synthetic */ String getValue() throws Exception;

    boolean isElement();

    boolean isEmpty() throws Exception;

    boolean isRoot();

    void skip() throws Exception;
}
