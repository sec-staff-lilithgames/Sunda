package vw;

import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class g1 extends z4 {

    /* renamed from: b, reason: collision with root package name */
    public final z1 f89829b;

    /* renamed from: c, reason: collision with root package name */
    public o1 f89830c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f89831d;

    /* renamed from: e, reason: collision with root package name */
    public final e1 f89832e;

    public g1(i0 i0Var, uw.i iVar, uw.h hVar, yw.j jVar) throws Exception {
        this.f89829b = new z1(i0Var, iVar, jVar);
        this.f89832e = new e1(i0Var, hVar, jVar);
        this.f89831d = i0Var;
    }

    @Override // vw.z4, vw.i2
    public Annotation getAnnotation() {
        return this.f89832e.getAnnotation();
    }

    @Override // vw.z4, vw.i2
    public i0 getContact() {
        return this.f89831d;
    }

    @Override // vw.z4, vw.i2
    public q0 getDecorator() throws Exception {
        return this.f89832e.getDecorator();
    }

    @Override // vw.z4, vw.i2
    public xw.f getDependent() throws Exception {
        return this.f89832e.getDependent();
    }

    @Override // vw.z4, vw.i2
    public Object getEmpty(l0 l0Var) throws Exception {
        return this.f89832e.getEmpty(l0Var);
    }

    @Override // vw.z4, vw.i2
    public String getEntry() throws Exception {
        return this.f89832e.getEntry();
    }

    @Override // vw.z4, vw.i2
    public o1 getExpression() throws Exception {
        if (this.f89830c == null) {
            this.f89830c = this.f89832e.getExpression();
        }
        return this.f89830c;
    }

    @Override // vw.z4, vw.i2
    public i2 getLabel(Class cls) {
        return this;
    }

    @Override // vw.z4, vw.i2
    public String getName() throws Exception {
        return this.f89832e.getName();
    }

    @Override // vw.z4, vw.i2
    public String[] getNames() throws Exception {
        return this.f89829b.getNames();
    }

    @Override // vw.z4, vw.i2
    public String getOverride() {
        return this.f89832e.getOverride();
    }

    @Override // vw.z4, vw.i2
    public String getPath() throws Exception {
        return this.f89832e.getPath();
    }

    @Override // vw.z4, vw.i2
    public String[] getPaths() throws Exception {
        return this.f89829b.getPaths();
    }

    @Override // vw.z4, vw.i2
    public xw.f getType(Class cls) {
        return getContact();
    }

    @Override // vw.z4, vw.i2
    public boolean isCollection() {
        return this.f89832e.isCollection();
    }

    @Override // vw.z4, vw.i2
    public boolean isData() {
        return this.f89832e.isData();
    }

    @Override // vw.z4, vw.i2
    public boolean isInline() {
        return this.f89832e.isInline();
    }

    @Override // vw.z4, vw.i2
    public boolean isRequired() {
        return this.f89832e.isRequired();
    }

    @Override // vw.z4, vw.i2
    public boolean isUnion() {
        return true;
    }

    @Override // vw.i2
    public String toString() {
        return this.f89832e.toString();
    }

    @Override // vw.z4, vw.i2
    public Class getType() {
        return this.f89832e.getType();
    }

    @Override // vw.z4, vw.i2
    public n0 getConverter(l0 l0Var) throws Exception {
        o1 expression = getExpression();
        i0 contact = getContact();
        if (contact != null) {
            return new d0(l0Var, this.f89829b, expression, contact);
        }
        throw new i5(SFPXhf.zAVvcpQS, this.f89832e);
    }
}
