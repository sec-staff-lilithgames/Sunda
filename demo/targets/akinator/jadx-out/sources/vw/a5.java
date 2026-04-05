package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a5 implements i3 {
    @Override // vw.i3
    public abstract /* synthetic */ Annotation getAnnotation();

    @Override // vw.i3
    public abstract /* synthetic */ o1 getExpression();

    @Override // vw.i3
    public abstract /* synthetic */ int getIndex();

    @Override // vw.i3
    public abstract /* synthetic */ Object getKey();

    @Override // vw.i3
    public abstract /* synthetic */ String getName();

    @Override // vw.i3
    public abstract /* synthetic */ String getPath();

    @Override // vw.i3
    public abstract /* synthetic */ Class getType();

    @Override // vw.i3
    public boolean isAttribute() {
        return false;
    }

    @Override // vw.i3
    public abstract /* synthetic */ boolean isPrimitive();

    @Override // vw.i3
    public abstract /* synthetic */ boolean isRequired();

    @Override // vw.i3
    public boolean isText() {
        return false;
    }
}
