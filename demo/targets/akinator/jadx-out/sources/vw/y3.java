package vw;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class y3 implements h4 {

    /* renamed from: a, reason: collision with root package name */
    public final a f90238a = new a(this);

    /* renamed from: b, reason: collision with root package name */
    public final t0 f90239b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements k4 {

        /* renamed from: b, reason: collision with root package name */
        public final LinkedList f90240b = new LinkedList();

        /* renamed from: c, reason: collision with root package name */
        public final h4 f90241c;

        public a(h4 h4Var) {
            this.f90241c = h4Var;
        }

        @Override // vw.k4
        public String getAttribute(String str) {
            return null;
        }

        @Override // vw.k4
        public m2 getAttributes() {
            return new m2(this.f90241c);
        }

        @Override // vw.k4
        public i2 getElement(String str) {
            return null;
        }

        @Override // vw.k4
        public m2 getElements() {
            return new m2(this.f90241c);
        }

        @Override // vw.k4
        public String getName() {
            return null;
        }

        @Override // vw.k4
        public String getPath(String str) {
            return null;
        }

        @Override // vw.k4
        public String getPrefix() {
            return null;
        }

        @Override // vw.k4
        public k4 getSection(String str) {
            return null;
        }

        @Override // vw.k4
        public i2 getText() {
            return null;
        }

        @Override // vw.k4
        public boolean isSection(String str) {
            return false;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return this.f90240b.iterator();
        }
    }

    public y3(t0 t0Var) {
        this.f90239b = t0Var;
    }

    @Override // vw.h4
    public j getCaller(l0 l0Var) {
        return new j(this, l0Var);
    }

    @Override // vw.h4
    public w1 getCommit() {
        return null;
    }

    @Override // vw.h4
    public w1 getComplete() {
        return null;
    }

    @Override // vw.h4
    public q0 getDecorator() {
        return null;
    }

    @Override // vw.h4
    public d2 getInstantiator() {
        return null;
    }

    @Override // vw.h4
    public String getName() {
        return null;
    }

    @Override // vw.h4
    public uw.m getOrder() {
        return null;
    }

    @Override // vw.h4
    public l3 getParameters() {
        return new l3();
    }

    @Override // vw.h4
    public w1 getPersist() {
        return null;
    }

    @Override // vw.h4
    public w1 getReplace() {
        return null;
    }

    @Override // vw.h4
    public w1 getResolve() {
        return null;
    }

    @Override // vw.h4
    public uw.s getRevision() {
        return null;
    }

    @Override // vw.h4
    public k4 getSection() {
        return this.f90238a;
    }

    @Override // vw.h4
    public o4 getSignature() {
        return null;
    }

    @Override // vw.h4
    public List<o4> getSignatures() {
        return new LinkedList();
    }

    @Override // vw.h4
    public i2 getText() {
        return null;
    }

    @Override // vw.h4
    public Class getType() {
        return this.f90239b.getType();
    }

    @Override // vw.h4
    public w1 getValidate() {
        return null;
    }

    @Override // vw.h4
    public i2 getVersion() {
        return null;
    }

    @Override // vw.h4
    public boolean isEmpty() {
        return true;
    }

    @Override // vw.h4
    public boolean isPrimitive() {
        return true;
    }

    @Override // vw.h4, vw.r3
    public boolean isStrict() {
        return true;
    }
}
