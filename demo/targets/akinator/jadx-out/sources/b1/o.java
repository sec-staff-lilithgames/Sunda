package b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends o {

        /* renamed from: a, reason: collision with root package name */
        public final m f8658a;

        public a(m mVar) {
            super(null);
            this.f8658a = mVar;
        }

        @Override // b1.o
        public void check() throws n {
            m mVar = this.f8658a;
            mVar.dispose();
            throw new n(mVar);
        }

        public final m getSnapshot() {
            return this.f8658a;
        }

        @Override // b1.o
        public boolean getSucceeded() {
            return false;
        }
    }

    public o(kotlin.jvm.internal.u uVar) {
    }

    public abstract void check();

    public abstract boolean getSucceeded();
}
