package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class m4 {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f89986a = new ThreadLocal();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final l4 f89987a;

        /* renamed from: b, reason: collision with root package name */
        public int f89988b;

        public a(boolean z10) {
            this.f89987a = new l4(z10);
        }

        public int clear() {
            int i10 = this.f89988b - 1;
            this.f89988b = i10;
            return i10;
        }

        public l4 get() {
            int i10 = this.f89988b;
            if (i10 >= 0) {
                this.f89988b = i10 + 1;
            }
            return this.f89987a;
        }
    }

    public void close() throws Exception {
        ThreadLocal threadLocal = this.f89986a;
        a aVar = (a) threadLocal.get();
        if (aVar == null) {
            throw new p3("Session does not exist", new Object[0]);
        }
        if (aVar.clear() == 0) {
            threadLocal.remove();
        }
    }

    public l4 open() throws Exception {
        return open(true);
    }

    public l4 open(boolean z10) throws Exception {
        ThreadLocal threadLocal = this.f89986a;
        a aVar = (a) threadLocal.get();
        if (aVar != null) {
            return aVar.get();
        }
        a aVar2 = new a(z10);
        threadLocal.set(aVar2);
        return aVar2.get();
    }
}
