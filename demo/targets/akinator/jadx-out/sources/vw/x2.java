package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface x2 extends Iterable {
    m2 getAttributes() throws Exception;

    m2 getElements() throws Exception;

    o1 getExpression();

    int getIndex();

    a3 getModels() throws Exception;

    String getName();

    String getPrefix();

    i2 getText();

    boolean isAttribute(String str);

    boolean isComposite();

    boolean isElement(String str);

    boolean isEmpty();

    boolean isModel(String str);

    x2 lookup(String str, int i10);

    x2 lookup(o1 o1Var);

    x2 register(String str, String str2, int i10) throws Exception;

    void register(i2 i2Var) throws Exception;

    void registerAttribute(String str) throws Exception;

    void registerAttribute(i2 i2Var) throws Exception;

    void registerElement(String str) throws Exception;

    void registerElement(i2 i2Var) throws Exception;

    void registerText(i2 i2Var) throws Exception;

    void validate(Class cls) throws Exception;
}
