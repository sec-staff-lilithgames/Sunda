package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class z4 implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public final g2 f90271a = new g2(this);

    @Override // vw.i2
    public abstract /* synthetic */ Annotation getAnnotation();

    @Override // vw.i2
    public abstract /* synthetic */ i0 getContact();

    @Override // vw.i2
    public abstract /* synthetic */ n0 getConverter(l0 l0Var) throws Exception;

    @Override // vw.i2
    public abstract /* synthetic */ q0 getDecorator() throws Exception;

    @Override // vw.i2
    public xw.f getDependent() throws Exception {
        return null;
    }

    @Override // vw.i2
    public abstract /* synthetic */ Object getEmpty(l0 l0Var) throws Exception;

    @Override // vw.i2
    public String getEntry() throws Exception {
        return null;
    }

    @Override // vw.i2
    public abstract /* synthetic */ o1 getExpression() throws Exception;

    @Override // vw.i2
    public Object getKey() throws Exception {
        return this.f90271a.getKey();
    }

    @Override // vw.i2
    public abstract /* synthetic */ String getName() throws Exception;

    @Override // vw.i2
    public String[] getNames() throws Exception {
        return new String[]{getPath(), getName()};
    }

    @Override // vw.i2
    public abstract /* synthetic */ String getOverride();

    @Override // vw.i2
    public abstract /* synthetic */ String getPath() throws Exception;

    @Override // vw.i2
    public String[] getPaths() throws Exception {
        return new String[]{getPath()};
    }

    @Override // vw.i2
    public abstract /* synthetic */ Class getType();

    @Override // vw.i2
    public xw.f getType(Class cls) throws Exception {
        return getContact();
    }

    @Override // vw.i2
    public boolean isAttribute() {
        return false;
    }

    @Override // vw.i2
    public boolean isCollection() {
        return false;
    }

    @Override // vw.i2
    public abstract /* synthetic */ boolean isData();

    @Override // vw.i2
    public boolean isInline() {
        return false;
    }

    @Override // vw.i2
    public abstract /* synthetic */ boolean isRequired();

    @Override // vw.i2
    public boolean isText() {
        return false;
    }

    @Override // vw.i2
    public boolean isTextList() {
        return false;
    }

    @Override // vw.i2
    public boolean isUnion() {
        return false;
    }

    @Override // vw.i2
    public i2 getLabel(Class cls) throws Exception {
        return this;
    }
}
